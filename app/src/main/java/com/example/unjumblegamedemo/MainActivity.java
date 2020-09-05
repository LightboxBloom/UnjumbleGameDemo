package com.example.unjumblegamedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String correctAnswer1 = "The dog barks";    //Users answer will be compared to this string

    String correctAnswer2 = "The cat meows";    //Users answer will be compared to this string

    String correctAnswer3 = "He was happy";    //Users answer will be compared to this string

    String correctAnswer4 = "She kicked a ball";    //Users answer will be compared to this string

    String correctAnswer5 = "The leaves are green";    //Users answer will be compared to this string

    String correctAnswer6 = "An elephant was walking";    //Users answer will be compared to this string

    String correctAnswer7 = "She is a kind girl";    //Users answer will be compared to this string

    String correctAnswer8 = "He saw a big cow";    //Users answer will be compared to this string

    String correctAnswer9 = "The fat cat ate fish";    //Users answer will be compared to this string

    String correctAnswer10 = "The small cat was being chased";    //Users answer will be compared to this string

    String correctAnswer11 = "He was carrying a big bag";    //Users answer will be compared to this string

    String correctAnswer12 = "She was reading an interesting book";    //Users answer will be compared to this string

    String correctAnswer = correctAnswer1;

    String userAnswer = "";

    int testNumber = 1;

    String[] sentence1 = {"The", "dog", "barks"};
    String[] sentence2 = {"The", "cat", "meows"};
    String[] sentence3 = {"He", "was", "happy"};
    String[] sentence4 = {"She", "kicked", "a", "ball"};
    String[] sentence5 = {"The", "leaves", "are", "green"};
    String[] sentence6 = {"An", "elephant", "was", "walking"};
    String[] sentence7 = {"She", "is", "a", "kind", "girl"};
    String[] sentence8 = {"He", "saw", "a", "big", "cow"};
    String[] sentence9 = {"The", "fat", "cat", "ate", "fish"};
    String[] sentence10 = {"The", "small", "cat", "was", "being", "chased"};
    String[] sentence11 = {"He", "was", "carrying", "a", "big", "bag"};
    String[] sentence12 = {"She", "was", "reading", "an", "interesting", "book"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);

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

        shuffle(); //calling shuffle method
        button4.setVisibility(View.INVISIBLE);
        button5.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);

    }

    public void shuffle() {
        Button btn = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);

        if (testNumber == 1) {
            List<String> shuffleList = Arrays.asList(sentence1);
            Collections.shuffle(shuffleList);
            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            correctAnswer = correctAnswer1;
        }

        else if (testNumber == 2) {
            List<String> shuffleList = Arrays.asList(sentence2);
            Collections.shuffle(shuffleList);
            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            correctAnswer = correctAnswer2;
        }

        else if (testNumber == 3) {
            List<String> shuffleList = Arrays.asList(sentence3);
            Collections.shuffle(shuffleList);
            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            correctAnswer = correctAnswer3;
        }

        else if (testNumber == 4) {
            List<String> shuffleList = Arrays.asList(sentence4);
            Collections.shuffle(shuffleList);

            btn4.setVisibility(View.VISIBLE);

            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
            btn5.setText("");
            btn6.setText("");
            correctAnswer = correctAnswer4;
        }

        else if (testNumber == 5) {
            List<String> shuffleList = Arrays.asList(sentence5);
            Collections.shuffle(shuffleList);
            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
            btn5.setText("");
            btn6.setText("");
            correctAnswer = correctAnswer5;
        }

        else if (testNumber == 6) {
            List<String> shuffleList = Arrays.asList(sentence6);
            Collections.shuffle(shuffleList);
            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
            btn5.setText("");
            btn6.setText("");
            correctAnswer = correctAnswer6;
        }

        else if (testNumber == 7) {
            List<String> shuffleList = Arrays.asList(sentence7);
            Collections.shuffle(shuffleList);

            btn5.setVisibility(View.VISIBLE);

            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
            btn5.setText(shuffleList.get(4));
            btn6.setText("");
            correctAnswer = correctAnswer7;
        }

        else if (testNumber == 8) {
            List<String> shuffleList = Arrays.asList(sentence8);
            Collections.shuffle(shuffleList);
            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
            btn5.setText(shuffleList.get(4));
            btn6.setText("");
            correctAnswer = correctAnswer8;
        }

        else if (testNumber == 9) {
            List<String> shuffleList = Arrays.asList(sentence9);
            Collections.shuffle(shuffleList);
            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
            btn5.setText(shuffleList.get(4));
            btn6.setText("");
            correctAnswer = correctAnswer9;
        }

        else if (testNumber == 10) {
            List<String> shuffleList = Arrays.asList(sentence10);
            Collections.shuffle(shuffleList);

            btn6.setVisibility(View.VISIBLE);

            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
            btn5.setText(shuffleList.get(4));
            btn6.setText(shuffleList.get(5));
            correctAnswer = correctAnswer10;
        }

        else if (testNumber == 11) {
            List<String> shuffleList = Arrays.asList(sentence11);
            Collections.shuffle(shuffleList);
            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
            btn5.setText(shuffleList.get(4));
            btn6.setText(shuffleList.get(5));
            correctAnswer = correctAnswer11;
        }

        else if (testNumber == 12) {
            List<String> shuffleList = Arrays.asList(sentence12);
            Collections.shuffle(shuffleList);
            btn.setText(shuffleList.get(0));
            btn2.setText(shuffleList.get(1));
            btn3.setText(shuffleList.get(2));
            btn4.setText(shuffleList.get(3));
            btn5.setText(shuffleList.get(4));
            btn6.setText(shuffleList.get(5));
            correctAnswer = correctAnswer12;
        }
        else
        {
            //placeholder
        }
    }

    @Override
    public void onClick(View v) {   //handles the click events for all the buttons

        Button btn = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);


        TextView textView1 = findViewById(R.id.textView);
        switch (v.getId()) {
            case R.id.button1:
                btn.setEnabled(false);

                userAnswer = userAnswer + " " + btn.getText().toString();
                textView1.setText(userAnswer);
                break;

            case R.id.button2:
                btn2.setEnabled(false);

                userAnswer = userAnswer + " " + btn2.getText().toString();
                textView1.setText(userAnswer);


                break;

            case R.id.button3:
                btn3.setEnabled(false);

                userAnswer = userAnswer + " " + btn3.getText().toString();
                textView1.setText(userAnswer);
                break;

            case R.id.button4:
                btn4.setEnabled(false);

                userAnswer = userAnswer + " " + btn4.getText().toString();
                textView1.setText(userAnswer);
                break;

            case R.id.button5:

                btn5.setEnabled(false);

                userAnswer = userAnswer + " " + btn5.getText().toString();
                textView1.setText(userAnswer);
                break;

            case R.id.button6:

                btn6.setEnabled(false);

                userAnswer = userAnswer + " " + btn6.getText().toString();
                textView1.setText(userAnswer);
                break;


            case R.id.button7:

                if (userAnswer.contains(correctAnswer)) { //handles event when the user gives correct answer
                    Toast.makeText(this, "Level Complete! Try this next Level", Toast.LENGTH_SHORT).show();
                    testNumber = testNumber + 1;

                    if (testNumber > 12) {
                        Toast.makeText(this, "All Levels Complete! Congratulations!", Toast.LENGTH_SHORT).show();
                    } else {
                        shuffle();

                        btn.setEnabled(true);
                        btn2.setEnabled(true);
                        btn3.setEnabled(true);
                        btn4.setEnabled(true);
                        btn5.setEnabled(true);
                        btn6.setEnabled(true);

                        userAnswer = "";
                        textView1.setText(userAnswer);
                    }


                } else {                                   //handles event when the user gives incorrect answer
                    Toast.makeText(this, "Incorrect. Use all available words or click RESTART to try again", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.button8:
                Toast.makeText(this, "Game Restarted", Toast.LENGTH_SHORT).show();
                userAnswer = "";
                textView1.setText(userAnswer);

                btn.setEnabled(true);

                btn2.setEnabled(true);

                btn3.setEnabled(true);

                btn4.setEnabled(true);

                btn5.setEnabled(true);

                btn6.setEnabled(true);

                shuffle();

                break;
        }
    }
}