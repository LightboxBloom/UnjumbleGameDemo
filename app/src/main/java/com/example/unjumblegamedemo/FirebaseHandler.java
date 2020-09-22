package com.example.unjumblegamedemo;

import android.widget.Button;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.example.unjumblegamedemo.MainActivity.sentence1;
import static com.example.unjumblegamedemo.MainActivity.sentence2;
import static com.example.unjumblegamedemo.MainActivity.sentence3;
import static com.example.unjumblegamedemo.MainActivity.sentence4;
import static com.example.unjumblegamedemo.MainActivity.sentence5;
import static com.example.unjumblegamedemo.MainActivity.sentence6;
import static com.example.unjumblegamedemo.MainActivity.sentence7;
import static com.example.unjumblegamedemo.MainActivity.sentence8;
import static com.example.unjumblegamedemo.MainActivity.sentence9;
import static com.example.unjumblegamedemo.MainActivity.sentence10;
import static com.example.unjumblegamedemo.MainActivity.sentence11;
import static com.example.unjumblegamedemo.MainActivity.sentence12;
import static com.example.unjumblegamedemo.MainActivity.word1;
import static com.example.unjumblegamedemo.MainActivity.word2;
import static com.example.unjumblegamedemo.MainActivity.word3;
import static com.example.unjumblegamedemo.MainActivity.word4;
import static com.example.unjumblegamedemo.MainActivity.word5;
import static com.example.unjumblegamedemo.MainActivity.word6;

public class FirebaseHandler {
    public static DatabaseReference reff = FirebaseDatabase.getInstance().getReference().child("sentence1");

    public static DatabaseReference reff2 = FirebaseDatabase.getInstance().getReference().child("sentence2");

    public static DatabaseReference reff3 = FirebaseDatabase.getInstance().getReference().child("sentence3");

    public static DatabaseReference reff4 = FirebaseDatabase.getInstance().getReference().child("sentence4");

    public static DatabaseReference reff5 = FirebaseDatabase.getInstance().getReference().child("sentence5");

    public static DatabaseReference reff6 = FirebaseDatabase.getInstance().getReference().child("sentence6");

    public static DatabaseReference reff7 = FirebaseDatabase.getInstance().getReference().child("sentence7");

    public static DatabaseReference reff8 = FirebaseDatabase.getInstance().getReference().child("sentence8");

    public static DatabaseReference reff9 = FirebaseDatabase.getInstance().getReference().child("sentence9");

    public static DatabaseReference reff10 = FirebaseDatabase.getInstance().getReference().child("sentence10");

    public static DatabaseReference reff11 = FirebaseDatabase.getInstance().getReference().child("sentence11");

    public static DatabaseReference reff12 = FirebaseDatabase.getInstance().getReference().child("sentence12");

    public static void FirebaseData(){
        reff.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                sentence1.add(word1);
                sentence1.add(word2);
                sentence1.add(word3);

                MainActivity.button7.setEnabled(true);
                MainActivity.button8.setEnabled(true);
                MainActivity.shuffle();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff2.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                sentence2.add(word1);
                sentence2.add(word2);
                sentence2.add(word3);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff3.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                sentence3.add(word1);
                sentence3.add(word2);
                sentence3.add(word3);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff4.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                word4 = snapshot.child("word4").getValue().toString();
                sentence4.add(word1);
                sentence4.add(word2);
                sentence4.add(word3);
                sentence4.add(word4);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff5.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                word4 = snapshot.child("word4").getValue().toString();
                sentence5.add(word1);
                sentence5.add(word2);
                sentence5.add(word3);
                sentence5.add(word4);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff6.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                word4 = snapshot.child("word4").getValue().toString();
                sentence6.add(word1);
                sentence6.add(word2);
                sentence6.add(word3);
                sentence6.add(word4);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff7.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                word4 = snapshot.child("word4").getValue().toString();
                word5 = snapshot.child("word5").getValue().toString();
                sentence7.add(word1);
                sentence7.add(word2);
                sentence7.add(word3);
                sentence7.add(word4);
                sentence7.add(word5);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff8.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                word4 = snapshot.child("word4").getValue().toString();
                word5 = snapshot.child("word5").getValue().toString();
                sentence8.add(word1);
                sentence8.add(word2);
                sentence8.add(word3);
                sentence8.add(word4);
                sentence8.add(word5);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff9.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                word4 = snapshot.child("word4").getValue().toString();
                word5 = snapshot.child("word5").getValue().toString();
                sentence9.add(word1);
                sentence9.add(word2);
                sentence9.add(word3);
                sentence9.add(word4);
                sentence9.add(word5);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff10.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                word4 = snapshot.child("word4").getValue().toString();
                word5 = snapshot.child("word5").getValue().toString();
                word6 = snapshot.child("word6").getValue().toString();
                sentence10.add(word1);
                sentence10.add(word2);
                sentence10.add(word3);
                sentence10.add(word4);
                sentence10.add(word5);
                sentence10.add(word6);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff11.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                word4 = snapshot.child("word4").getValue().toString();
                word5 = snapshot.child("word5").getValue().toString();
                word6 = snapshot.child("word6").getValue().toString();
                sentence11.add(word1);
                sentence11.add(word2);
                sentence11.add(word3);
                sentence11.add(word4);
                sentence11.add(word5);
                sentence11.add(word6);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff12.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                word4 = snapshot.child("word4").getValue().toString();
                word5 = snapshot.child("word5").getValue().toString();
                word6 = snapshot.child("word6").getValue().toString();
                sentence12.add(word1);
                sentence12.add(word2);
                sentence12.add(word3);
                sentence12.add(word4);
                sentence12.add(word5);
                sentence12.add(word6);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
