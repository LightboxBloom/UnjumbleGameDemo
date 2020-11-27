package com.example.unjumblegamedemo;

import androidx.annotation.NonNull;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.Objects;


public class FirebaseHandler {

    public static Sentence counter = new Sentence();//used to create an array of sentences that is the correct size

    //public static DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference().child("sentences");

    public static DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference().child("Flashcards").child("Uploads");

    public static DatabaseReference userTestRef = FirebaseDatabase.getInstance().getReference().child("userTest");

    public static DatabaseReference baseRef = FirebaseDatabase.getInstance().getReference();

    public static FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    public static FirebaseUser currentUser = firebaseAuth.getCurrentUser();

    //UNCOMMENT currentUser.getUid WHEN INTEGRATED IN FULL APPLICATION, THEN COMMENT OUT OR REMOVE userKey = ""
    public static String userKey = "";
    //public static String userKey = currentUser.getUid();

    public static void getSetUserLevel(){

        if(userKey == "") {
            userTestRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (MainActivity.testNumber == -100) { //get user's level from database
                        MainActivity.testNumber = Integer.parseInt(String.valueOf(snapshot.child("userLevel").getValue()));
                        FirebaseData();
                    } else if (MainActivity.testNumber > FirebaseHandler.counter.getCount()) { //Indicates that all levels are completed
                        MainActivity.shuffle(Sentence.sentenceArray[MainActivity.testNumber - 2]);
                        MainActivity.hideButtons();
                        MainActivity.buttons[7].setEnabled(true);
                        userTestRef.child("userLevel").setValue(MainActivity.testNumber);
                        MainActivity.textViews[0].setText("Well Done!");
                        MainActivity.textViews[1].setText("All levels completed!");
                    } else { //change user's level in database
                        userTestRef.child("userLevel").setValue(MainActivity.testNumber);
                        MainActivity.textViews[1].setText("Current Level: " + MainActivity.testNumber); //displays user's current level
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        else{
            baseRef.child(userKey).addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (MainActivity.testNumber == -100) { //get user's level from database
                        MainActivity.testNumber = Integer.parseInt(String.valueOf(snapshot.child("userLevel").getValue()));
                        FirebaseData();
                    } else if (MainActivity.testNumber > FirebaseHandler.counter.getCount()) { //Indicates that all levels are completed
                        MainActivity.shuffle(Sentence.sentenceArray[MainActivity.testNumber - 2]);
                        MainActivity.hideButtons();
                        MainActivity.buttons[7].setEnabled(true);
                        baseRef.child(userKey).child("userLevel").setValue(MainActivity.testNumber);
                        MainActivity.textViews[0].setText("Well Done!");
                        MainActivity.textViews[1].setText("All levels completed!");
                    } else { //change user's level in database
                        baseRef.child(userKey).child("userLevel").setValue(MainActivity.testNumber);
                        MainActivity.textViews[1].setText("Current Level: " + MainActivity.testNumber); //displays user's current level
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }
    }


    //CHANGE FIREBASE DATA, USE NEW DB REFERENCE FOR THE FLASHCARDS AND RETRIEVE ALL CHILD SENTENCES FROM THE CHILD OF UPLOADS


    public static void FirebaseData() {


        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                counter.setCount((int) snapshot.getChildrenCount()); //counter is set to the number of sentences in the db

                Sentence.arrayCreate(counter.getCount()); //arrayCreate method is called
                int i = -1; //used for loop to assign word into different sentence lists

                /*for (DataSnapshot dataSnapshot : snapshot.getChildren()) { //after a sentence's words are assigned, the next sentence is filled
                    i++;
                    for (DataSnapshot child : dataSnapshot.getChildren())  //each word in the database is added to a list
                    {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentenceArray[i].add(s);

                    }*/
                    for (DataSnapshot dataSnapshot : snapshot.getChildren()) { //after a sentence's words are assigned, the next sentence is filled
                        i++;
                        String s;
                        s = dataSnapshot.child("Sentence").getValue().toString();
                        String[] words = s.split(" ");
                        for (String word: words)
                        {
                            Sentence.sentenceArray[i].add(word);
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
