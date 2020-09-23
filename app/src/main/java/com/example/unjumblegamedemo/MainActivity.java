package com.example.unjumblegamedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static String correctAnswer;

    public static String userAnswer = "";

    public static int testNumber = 1;

    public static Button[] buttons = new Button[8];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing buttons
        for(int i=0; i<buttons.length; i++) {
            String buttonID = "button" + (i+1);

            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            buttons[i] = findViewById(resID);
            buttons[i].setOnClickListener(this);
            buttons[i].setVisibility(View.INVISIBLE);
        }
        buttons[6].setVisibility(View.VISIBLE);
        buttons[7].setVisibility(View.VISIBLE);

        TextView textView1 = findViewById(R.id.textView);
        textView1.setText("");

        //These two buttons are deactivated while the data is being pulled from firebase
        buttons[6].setEnabled(false);
        buttons[7].setEnabled(false);

        Sentence.sentences.clear();
        FirebaseHandler.FirebaseData(); //pulls the game's sentences from the Firebase Database
    }

    public static void shuffle(){

        List<String> shuffleList = new ArrayList<>(Sentence.sentences);
        Collections.shuffle(shuffleList);

        if(Sentence.sentences.size() == 1){
            for(int i=1; i<buttons.length - 2; i++) {
                {
                    buttons[i].setVisibility(View.INVISIBLE);
                }
            }
            buttons[0].setVisibility(View.VISIBLE);
            buttons[0].setText(shuffleList.get(0));
        }
        else if(Sentence.sentences.size() == 2){
            for(int i=2; i<buttons.length - 2; i++) {
                {
                    buttons[i].setVisibility(View.INVISIBLE);
                }
            }
            for(int i=0; i<2; i++) {
                {
                    buttons[i].setVisibility(View.VISIBLE);
                    buttons[i].setText(shuffleList.get(i));
                }
            }
        }
        else if(Sentence.sentences.size() == 3){
            for(int i=3; i<buttons.length - 2; i++) {
                {
                    buttons[i].setVisibility(View.INVISIBLE);
                }
            }
            for(int i=0; i<3; i++) {
                {
                    buttons[i].setVisibility(View.VISIBLE);
                    buttons[i].setText(shuffleList.get(i));
                }
            }
        }
        else if(Sentence.sentences.size() == 4){
            for(int i=4; i<buttons.length - 2; i++) {
                {
                    buttons[i].setVisibility(View.INVISIBLE);
                }
            }
            for(int i=0; i<4; i++) {
                {
                    buttons[i].setVisibility(View.VISIBLE);
                    buttons[i].setText(shuffleList.get(i));
                }
            }
        }
        else if(Sentence.sentences.size() == 5){
            for(int i=0; i<5; i++) {
                {
                    buttons[i].setVisibility(View.VISIBLE);
                    buttons[i].setText(shuffleList.get(i));
                }
            }
            buttons[5].setVisibility(View.INVISIBLE);
        }
        else if(Sentence.sentences.size() == 6) {
            for (int i = 0; i < buttons.length - 2; i++) {
                {
                    buttons[i].setVisibility(View.VISIBLE);
                    buttons[i].setText(shuffleList.get(i));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : Sentence.sentences)
        {
            sb.append(s);
            sb.append(" ");
        }
        correctAnswer = sb.toString().trim();
    }

    public static void enableButtons(){
        for(int i=0; i<buttons.length - 2; i++) {
            buttons[i].setEnabled(true);
        }
    }

    boolean clicked1=false;
    boolean clicked2=false;
    boolean clicked3=false;
    boolean clicked4=false;
    boolean clicked5=false;
    boolean clicked6=false;

    public void clickedButtons(){
        clicked1=false;
        clicked2=false;
        clicked3=false;
        clicked4=false;
        clicked5=false;
        clicked6=false;
    }

    @Override
    public void onClick(View v) {   //handles the click events for all the buttons

        TextView textView1 = findViewById(R.id.textView);
        switch (v.getId()) {
            case R.id.button1:
                buttons[0].setEnabled(false);

                userAnswer = userAnswer + " " + buttons[0].getText().toString();
                textView1.setText(userAnswer);

                clicked1=true;
                break;

            case R.id.button2:
                buttons[1].setEnabled(false);

                userAnswer = userAnswer + " " + buttons[1].getText().toString();
                textView1.setText(userAnswer);

                clicked2=true;
                break;

            case R.id.button3:
                buttons[2].setEnabled(false);

                userAnswer = userAnswer + " " + buttons[2].getText().toString();
                textView1.setText(userAnswer);

                clicked3=true;
                break;

            case R.id.button4:
                buttons[3].setEnabled(false);

                userAnswer = userAnswer + " " + buttons[3].getText().toString();
                textView1.setText(userAnswer);

                clicked4=true;
                break;

            case R.id.button5:

                buttons[4].setEnabled(false);

                userAnswer = userAnswer + " " + buttons[4].getText().toString();
                textView1.setText(userAnswer);

                clicked5=true;
                break;

            case R.id.button6:

                buttons[5].setEnabled(false);

                userAnswer = userAnswer + " " + buttons[5].getText().toString();
                textView1.setText(userAnswer);

                clicked6=true;
                break;


            case R.id.button7:

                if (userAnswer.contains(correctAnswer)) { //handles event when the user gives correct answer
                    testNumber = testNumber + 1;
                    Sentence.sentences.clear();
                    FirebaseHandler.FirebaseData();

                    if (testNumber > 12) {
                        Toast.makeText(this, "All Levels Complete! Congratulations!", Toast.LENGTH_SHORT).show();
                        buttons[7].setEnabled(false);
                        buttons[6].setEnabled(false);
                    } else {
                        Toast.makeText(this, "Level Complete! Try this next Level", Toast.LENGTH_SHORT).show();
                        shuffle();

                        clickedButtons();

                        userAnswer = "";
                        textView1.setText(userAnswer);
                    }


                } else {            //handles event when the user gives incorrect answer
                    if(Sentence.sentences.size()<=1){
                        if(!clicked1 || !clicked2 || !clicked3){
                            Toast.makeText(this, "Incorrect answer! Use all available words before using the submit button!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(this, "Incorrect answer! Click RESTART to try this level again.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else if(Sentence.sentences.size()<=2){
                        if(!clicked1 || !clicked2 || !clicked3){
                            Toast.makeText(this, "Incorrect answer! Use all available words before using the submit button!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(this, "Incorrect answer! Click RESTART to try this level again.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else if(Sentence.sentences.size()<=3){
                        if(!clicked1 || !clicked2 || !clicked3){
                            Toast.makeText(this, "Incorrect answer! Use all available words before using the submit button!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(this, "Incorrect answer! Click RESTART to try this level again.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else if(Sentence.sentences.size()<=4){
                        if(!clicked1 || !clicked2 || !clicked3 || !clicked4){
                            Toast.makeText(this, "Incorrect answer! Use all available words before using the submit button!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(this, "Incorrect answer! Click RESTART to try this level again.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else if(Sentence.sentences.size()<=5){
                        if(!clicked1 || !clicked2 || !clicked3 || !clicked4 || !clicked5){
                            Toast.makeText(this, "Incorrect answer! Use all available words before using the submit button!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(this, "Incorrect answer! Click RESTART to try this level again.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else if(Sentence.sentences.size()<=6) {
                        {
                            if (!clicked1 || !clicked2 || !clicked3 || !clicked4 || !clicked5 || !clicked6) {
                                Toast.makeText(this, "Incorrect answer! Use all available words before using the submit button!", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(this, "Incorrect answer! Click RESTART to try this level again.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
                break;

            case R.id.button8:
                Toast.makeText(this, "Level Restarted", Toast.LENGTH_SHORT).show();
                userAnswer = "";
                textView1.setText(userAnswer);

                clickedButtons();
                shuffle();
                enableButtons();
                break;
        }
    }
}