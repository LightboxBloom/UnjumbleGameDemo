package com.example.unjumblegamedemo;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;


public class FirebaseHandler {

    public static DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference().child("sentences");

    public static void FirebaseData() {
        if (MainActivity.testNumber == 1) {
            dbRef.child("sentence1").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }

                    MainActivity.buttons[6].setEnabled(true);
                    MainActivity.buttons[7].setEnabled(true);
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        if (MainActivity.testNumber == 2) {
            dbRef.child("sentence2").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        if (MainActivity.testNumber == 3) {
            dbRef.child("sentence3").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        if (MainActivity.testNumber == 4) {
            dbRef.child("sentence4").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        if (MainActivity.testNumber == 5) {
            dbRef.child("sentence5").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        if (MainActivity.testNumber == 6) {
            dbRef.child("sentence6").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        if (MainActivity.testNumber == 7) {
            dbRef.child("sentence7").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        if (MainActivity.testNumber == 8) {
            dbRef.child("sentence8").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        if (MainActivity.testNumber == 9) {
            dbRef.child("sentence9").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        if (MainActivity.testNumber == 10) {
            dbRef.child("sentence10").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        if (MainActivity.testNumber == 11) {
            dbRef.child("sentence11").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
        if (MainActivity.testNumber == 12) {
            dbRef.child("sentence12").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot child : snapshot.getChildren()) {
                        String s;
                        s = Objects.requireNonNull(child.getValue()).toString();
                        Sentence.sentences.add(s);
                    }
                    MainActivity.shuffle();
                    MainActivity.enableButtons();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
    }
}
