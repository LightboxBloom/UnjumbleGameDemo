package com.example.unjumblegamedemo;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.Objects;


public class FirebaseHandler {

    public static Sentence counter = new Sentence();//used to create an array of sentences that is the correct size

    public static DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference().child("sentences");

    public static DatabaseReference userRef = FirebaseDatabase.getInstance().getReference().child("userTest");

    public static void getSetUserLevel(){

        userRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(MainActivity.testNumber == -100) { //get user's level from database
                    MainActivity.testNumber = Integer.parseInt(String.valueOf(snapshot.child("userLevel").getValue()));
                    FirebaseData();
                }
                else if (MainActivity.testNumber > FirebaseHandler.counter.getCount()) { //Indicates that all levels are completed
                    MainActivity.shuffle(Sentence.sentenceArray[MainActivity.testNumber - 2]);
                    MainActivity.hideButtons();
                    MainActivity.buttons[7].setEnabled(true);
                    userRef.child("userLevel").setValue(MainActivity.testNumber);
                    MainActivity.textViews[0].setText("Well Done!");
                    MainActivity.textViews[1].setText("All levels completed!");
                }
                else { //change user's level in database
                    userRef.child("userLevel").setValue(MainActivity.testNumber);
                    MainActivity.textViews[1].setText("Current Level: " + MainActivity.testNumber); //displays user's current level
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public static void FirebaseData() {


        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                counter.setCount((int) snapshot.getChildrenCount()); //counter is set to the number of sentences in the db

                Sentence.arrayCreate(counter.getCount()); //arrayCreate method is called
                int i = -1; //used for loop to assign word into different sentence lists

                for (DataSnapshot dataSnapshot : snapshot.getChildren()) { //after a sentence's words are assigned, the next sentence is filled
                    i++;
                    for (DataSnapshot child : dataSnapshot.getChildren())  //each word in the database is added to a list
                    {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentenceArray[i].add(s);

                    }

                    //shuffle happens after sentences have words to avoid crashing,
                    //submit and restart buttons are only enabled once the firebase data has been pulled (this stops the user from skipping levels before the data loads)
                    if (MainActivity.testNumber <= FirebaseHandler.counter.getCount()) {
                        MainActivity.shuffle(Sentence.sentenceArray[MainActivity.testNumber - 1]);
                        MainActivity.buttons[6].setEnabled(true);
                        MainActivity.buttons[7].setEnabled(true);
                    }
                    else {
                        getSetUserLevel();
                    }
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }
}
