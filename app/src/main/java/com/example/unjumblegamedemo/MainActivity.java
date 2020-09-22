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


    public static String word1;

    public static String word2;

    public static String word3;

    public static String word4;

    public static String word5;

    public static String word6;

    public static String correctAnswer;

    public static String userAnswer = "";

    public static int testNumber = 1;

    public static List<String> sentence1 = new ArrayList<>();
    public static List<String> sentence2 = new ArrayList<>();
    public static List<String> sentence3 = new ArrayList<>();
    public static List<String> sentence4 = new ArrayList<>();
    public static List<String> sentence5 = new ArrayList<>();
    public static List<String> sentence6 = new ArrayList<>();
    public static List<String> sentence7 = new ArrayList<>();
    public static List<String> sentence8 = new ArrayList<>();
    public static List<String> sentence9 = new ArrayList<>();
    public static List<String> sentence10 = new ArrayList<>();
    public static List<String> sentence11 = new ArrayList<>();
    public static List<String> sentence12 = new ArrayList<>();
    public static Button button1;
    public static Button button2;
    public static Button button3;
    public static Button button4;
    public static Button button5;
    public static Button button6;
    public static Button button7;
    public static Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing Buttons and TextView
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        TextView textView1 = findViewById(R.id.textView);


        //Setting OnClickListeners and TextView text
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        textView1.setText("");

        //Buttons are set to INVISIBLE by default, later on they are made visible if they are being used for a level
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        button5.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);

        //These two buttons are deactivated while the data is being pulled from firebase
        button7.setEnabled(false);
        button8.setEnabled(false);

        FirebaseHandler.FirebaseData(); //pulls the game's sentences from the Firebase Database

    }

    public static void shuffler(List<String> sentence){

        List<String> shuffleList = new ArrayList<>();
        shuffleList.addAll(sentence);
        Collections.shuffle(shuffleList);

        if(sentence.size() == 1){
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);

            button1.setText(shuffleList.get(0));
        }
        else if(sentence.size() == 2){
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);

            button1.setText(shuffleList.get(0));
            button2.setText(shuffleList.get(1));
        }
        else if(sentence.size() == 3){
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.VISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);

            button1.setText(shuffleList.get(0));
            button2.setText(shuffleList.get(1));
            button3.setText(shuffleList.get(2));
        }
        else if(sentence.size() == 4){
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.VISIBLE);
            button4.setVisibility(View.VISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);

            button1.setText(shuffleList.get(0));
            button2.setText(shuffleList.get(1));
            button3.setText(shuffleList.get(2));
            button4.setText(shuffleList.get(3));
        }
        else if(sentence.size() == 5){
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.VISIBLE);
            button4.setVisibility(View.VISIBLE);
            button5.setVisibility(View.VISIBLE);
            button6.setVisibility(View.INVISIBLE);

            button1.setText(shuffleList.get(0));
            button2.setText(shuffleList.get(1));
            button3.setText(shuffleList.get(2));
            button4.setText(shuffleList.get(3));
            button5.setText(shuffleList.get(4));
        }
        else if(sentence.size() == 6){
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.VISIBLE);
            button4.setVisibility(View.VISIBLE);
            button5.setVisibility(View.VISIBLE);
            button6.setVisibility(View.VISIBLE);

            button1.setText(shuffleList.get(0));
            button2.setText(shuffleList.get(1));
            button3.setText(shuffleList.get(2));
            button4.setText(shuffleList.get(3));
            button5.setText(shuffleList.get(4));
            button6.setText(shuffleList.get(5));
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

    public static void shuffle() {
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

        TextView textView1 = findViewById(R.id.textView);
        switch (v.getId()) {
            case R.id.button1:
                button1.setEnabled(false);

                userAnswer = userAnswer + " " + button1.getText().toString();
                textView1.setText(userAnswer);

                clicked1=true;
                break;

            case R.id.button2:
                button2.setEnabled(false);

                userAnswer = userAnswer + " " + button2.getText().toString();
                textView1.setText(userAnswer);

                clicked2=true;
                break;

            case R.id.button3:
                button3.setEnabled(false);

                userAnswer = userAnswer + " " + button3.getText().toString();
                textView1.setText(userAnswer);

                clicked3=true;
                break;

            case R.id.button4:
                button4.setEnabled(false);

                userAnswer = userAnswer + " " + button4.getText().toString();
                textView1.setText(userAnswer);

                clicked4=true;
                break;

            case R.id.button5:

                button5.setEnabled(false);

                userAnswer = userAnswer + " " + button5.getText().toString();
                textView1.setText(userAnswer);

                clicked5=true;
                break;

            case R.id.button6:

                button6.setEnabled(false);

                userAnswer = userAnswer + " " + button6.getText().toString();
                textView1.setText(userAnswer);

                clicked6=true;
                break;


            case R.id.button7:

                if (userAnswer.contains(correctAnswer)) { //handles event when the user gives correct answer
                    testNumber = testNumber + 1;

                    if (testNumber > 12) {
                        Toast.makeText(this, "All Levels Complete! Congratulations!", Toast.LENGTH_SHORT).show();
                        button8.setEnabled(false);
                        button7.setEnabled(false);
                    } else {
                        Toast.makeText(this, "Level Complete! Try this next Level", Toast.LENGTH_SHORT).show();
                        shuffle();

                        button1.setEnabled(true);
                        button2.setEnabled(true);
                        button3.setEnabled(true);
                        button4.setEnabled(true);
                        button5.setEnabled(true);
                        button6.setEnabled(true);

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

                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);

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