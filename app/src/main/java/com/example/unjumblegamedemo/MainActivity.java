

package com.example.unjumblegamedemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Snapshot;

import android.os.Bundle;

import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    String word1;

    String word2;

    String word3;

    String word4;

    String word5;

    String word6;

    String correctAnswer;

    String userAnswer = "";

    int testNumber = 1;

    List<String> sentence1 = new ArrayList<>();
    List<String> sentence2 = new ArrayList<>();
    List<String> sentence3 = new ArrayList<>();
    List<String> sentence4 = new ArrayList<>();
    List<String> sentence5 = new ArrayList<>();
    List<String> sentence6 = new ArrayList<>();
    List<String> sentence7 = new ArrayList<>();
    List<String> sentence8 = new ArrayList<>();
    List<String> sentence9 = new ArrayList<>();
    List<String> sentence10 = new ArrayList<>();
    List<String> sentence11 = new ArrayList<>();
    List<String> sentence12 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference reff = FirebaseDatabase.getInstance().getReference().child("sentence1");

        DatabaseReference reff2 = FirebaseDatabase.getInstance().getReference().child("sentence2");

        DatabaseReference reff3 = FirebaseDatabase.getInstance().getReference().child("sentence3");

        DatabaseReference reff4 = FirebaseDatabase.getInstance().getReference().child("sentence4");

        DatabaseReference reff5 = FirebaseDatabase.getInstance().getReference().child("sentence5");

        DatabaseReference reff6 = FirebaseDatabase.getInstance().getReference().child("sentence6");

        DatabaseReference reff7 = FirebaseDatabase.getInstance().getReference().child("sentence7");

        DatabaseReference reff8 = FirebaseDatabase.getInstance().getReference().child("sentence8");

        DatabaseReference reff9 = FirebaseDatabase.getInstance().getReference().child("sentence9");

        DatabaseReference reff10 = FirebaseDatabase.getInstance().getReference().child("sentence10");

        DatabaseReference reff11 = FirebaseDatabase.getInstance().getReference().child("sentence11");

        DatabaseReference reff12 = FirebaseDatabase.getInstance().getReference().child("sentence12");

        reff.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                word1 = snapshot.child("word1").getValue().toString();
                word2 = snapshot.child("word2").getValue().toString();
                word3 = snapshot.child("word3").getValue().toString();
                sentence1.add(word1);
                sentence1.add(word2);
                sentence1.add(word3);
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
                shuffle();
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


        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        final Button button7 = findViewById(R.id.button7);
        final Button button8 = findViewById(R.id.button8);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

        TextView textView1 = findViewById(R.id.textView);
        textView1.setText("");

        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        button5.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);
        button7.setEnabled(false);
        button8.setEnabled(false);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                button7.setEnabled(true);
                button8.setEnabled(true);
                shuffle(); //calling shuffle method
            }
        }, 5000);   //5 seconds

    }

    public void shuffler(List<String> sentence){
        Button btn = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);

        List<String> shuffleList = new ArrayList<>();
        shuffleList.addAll(sentence);
        Collections.shuffle(shuffleList);

        if(sentence.size() == 1){
            btn.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn6.setVisibility(View.INVISIBLE);

            btn.setText(shuffleList.get(0));
        }
        else if(sentence.size() == 2){
            btn.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn6.setVisibility(View.INVISIBLE);

            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
        }
        else if(sentence.size() == 3){
            btn.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn6.setVisibility(View.INVISIBLE);

            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
        }
        else if(sentence.size() == 4){
            btn.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn6.setVisibility(View.INVISIBLE);

            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
        }
        else if(sentence.size() == 5){
            btn.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
            btn5.setVisibility(View.VISIBLE);
            btn6.setVisibility(View.INVISIBLE);

            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
            btn5.setText(shuffleList.get(4));
        }
        else if(sentence.size() == 6){
            btn.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
            btn5.setVisibility(View.VISIBLE);
            btn6.setVisibility(View.VISIBLE);

            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
            btn5.setText(shuffleList.get(4));
            btn6.setText(shuffleList.get(5));
        }
        else {
            //placeholder
        }

        StringBuilder sb = new StringBuilder();
        for (String s : sentence)
        {
            sb.append(s);
            sb.append(" ");
        }
        correctAnswer = sb.toString().trim();
    }

    public void shuffle() {
        if (testNumber == 1) {
            shuffler(sentence1);
        }

        else if (testNumber == 2) {
            shuffler(sentence2);
        }

        else if (testNumber == 3) {
            shuffler(sentence3);
        }

        else if (testNumber == 4) {
            shuffler(sentence4);
        }

        else if (testNumber == 5) {
            shuffler(sentence5);
        }

        else if (testNumber == 6) {
            shuffler(sentence6);
        }

        else if (testNumber == 7) {
            shuffler(sentence7);
        }

        else if (testNumber == 8) {
            shuffler(sentence8);
        }

        else if (testNumber == 9) {
            shuffler(sentence9);
        }

        else if (testNumber == 10) {
            shuffler(sentence10);
        }

        else if (testNumber == 11) {
            shuffler(sentence11);
        }

        else if (testNumber == 12) {
            shuffler(sentence12);
        }
        else
        {
            //placeholder
        }
    }

    boolean clicked1=false;
    boolean clicked2=false;
    boolean clicked3=false;
    boolean clicked4=false;
    boolean clicked5=false;
    boolean clicked6=false;

    @Override
    public void onClick(View v) {   //handles the click events for all the buttons

        Button btn = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8 = findViewById(R.id.button8);




        TextView textView1 = findViewById(R.id.textView);
        switch (v.getId()) {
            case R.id.button1:
                btn.setEnabled(false);

                userAnswer = userAnswer + " " + btn.getText().toString();
                textView1.setText(userAnswer);

                clicked1=true;
                break;

            case R.id.button2:
                btn2.setEnabled(false);

                userAnswer = userAnswer + " " + btn2.getText().toString();
                textView1.setText(userAnswer);

                clicked2=true;
                break;

            case R.id.button3:
                btn3.setEnabled(false);

                userAnswer = userAnswer + " " + btn3.getText().toString();
                textView1.setText(userAnswer);

                clicked3=true;
                break;

            case R.id.button4:
                btn4.setEnabled(false);

                userAnswer = userAnswer + " " + btn4.getText().toString();
                textView1.setText(userAnswer);

                clicked4=true;
                break;

            case R.id.button5:

                btn5.setEnabled(false);

                userAnswer = userAnswer + " " + btn5.getText().toString();
                textView1.setText(userAnswer);

                clicked5=true;
                break;

            case R.id.button6:

                btn6.setEnabled(false);

                userAnswer = userAnswer + " " + btn6.getText().toString();
                textView1.setText(userAnswer);

                clicked6=true;
                break;


            case R.id.button7:

                if (userAnswer.contains(correctAnswer)) { //handles event when the user gives correct answer
                    testNumber = testNumber + 1;

                    if (testNumber > 12) {
                        Toast.makeText(this, "All Levels Complete! Congratulations!", Toast.LENGTH_SHORT).show();
                        btn8.setEnabled(false);
                        btn7.setEnabled(false);
                    } else {
                        Toast.makeText(this, "Level Complete! Try this next Level", Toast.LENGTH_SHORT).show();
                        shuffle();

                        btn.setEnabled(true);
                        btn2.setEnabled(true);
                        btn3.setEnabled(true);
                        btn4.setEnabled(true);
                        btn5.setEnabled(true);
                        btn6.setEnabled(true);

                        clicked1=false;
                        clicked2=false;
                        clicked3=false;
                        clicked4=false;
                        clicked5=false;
                        clicked6=false;

                        userAnswer = "";
                        textView1.setText(userAnswer);
                    }


                } else {                                   //handles event when the user gives incorrect answer
                    //Toast.makeText(this, "Incorrect. Use all available words or click RESTART to try this level again", Toast.LENGTH_SHORT).show();
                    if(testNumber<=3){
                        if(!clicked1 || !clicked2 || !clicked3){
                            Toast.makeText(this, "Incorrect answer! Use all available words before using the submit button!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(this, "Incorrect answer! Click RESTART to try this level again.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else if(testNumber<=6){
                        if(!clicked1 || !clicked2 || !clicked3 || !clicked4){
                            Toast.makeText(this, "Incorrect answer! Use all available words before using the submit button!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(this, "Incorrect answer! Click RESTART to try this level again.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else if(testNumber<=9){
                        if(!clicked1 || !clicked2 || !clicked3 || !clicked4 || !clicked5){
                            Toast.makeText(this, "Incorrect answer! Use all available words before using the submit button!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(this, "Incorrect answer! Click RESTART to try this level again.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        if(!clicked1 || !clicked2 || !clicked3 || !clicked4 || !clicked5 || !clicked6){
                            Toast.makeText(this, "Incorrect answer! Use all available words before using the submit button!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(this, "Incorrect answer! Click RESTART to try this level again.", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                break;

            case R.id.button8:
                Toast.makeText(this, "Level Restarted", Toast.LENGTH_SHORT).show();
                userAnswer = "";
                textView1.setText(userAnswer);

                btn.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);

                clicked1=false;
                clicked2=false;
                clicked3=false;
                clicked4=false;
                clicked5=false;
                clicked6=false;

                shuffle();
                break;
        }
    }
}