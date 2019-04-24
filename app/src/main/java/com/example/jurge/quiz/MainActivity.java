package com.example.jurge.quiz;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        if(mQuestionNumber != mQuestionLibrary.mQuestions.length) {
            updateQuestion();
        }else{
            Toast.makeText(MainActivity.this, "Quiz Ended", Toast.LENGTH_SHORT).show();
        }


        //Start of Button Listener for Button 1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Button Logic
                mButtonChoice1.setEnabled(false);
                mButtonChoice2.setEnabled(false);
                mButtonChoice3.setEnabled(false);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mButtonChoice1.setEnabled(true);
                        mButtonChoice2.setEnabled(true);
                        mButtonChoice3.setEnabled(true);
                    }
                },3500);

                if(mButtonChoice1.getText() == mAnswer){
                    mScore = mScore+1;
                    upsateScore(mScore);
                    if(mQuestionNumber != mQuestionLibrary.mQuestions.length) {
                        updateQuestion();
                    }else{
                        Toast.makeText(MainActivity.this, "Quiz Ended", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber != mQuestionLibrary.mQuestions.length) {
                        updateQuestion();
                    }else{
                        Toast.makeText(MainActivity.this, "Quiz Ended", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        //End of Button Listener for Button 1

        //Start of Button Listener for Button 2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Button Logic
                mButtonChoice1.setEnabled(false);
                mButtonChoice2.setEnabled(false);
                mButtonChoice3.setEnabled(false);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mButtonChoice1.setEnabled(true);
                        mButtonChoice2.setEnabled(true);
                        mButtonChoice3.setEnabled(true);
                    }
                },3500);

                if(mButtonChoice2.getText() == mAnswer){
                    mScore = mScore+1;
                    upsateScore(mScore);
                    if(mQuestionNumber != mQuestionLibrary.mQuestions.length) {
                        updateQuestion();
                    }else{
                        Toast.makeText(MainActivity.this, "Quiz Ended", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber != mQuestionLibrary.mQuestions.length) {
                        updateQuestion();
                    }else{
                        Toast.makeText(MainActivity.this, "Quiz Ended", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        //End of Button Listener for Button 2

        //Start of Button Listener for Button 3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Button Logic
                mButtonChoice1.setEnabled(false);
                mButtonChoice2.setEnabled(false);
                mButtonChoice3.setEnabled(false);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mButtonChoice1.setEnabled(true);
                        mButtonChoice2.setEnabled(true);
                        mButtonChoice3.setEnabled(true);
                    }
                },3500);

                if(mButtonChoice3.getText() == mAnswer){
                    mScore = mScore+1;
                    upsateScore(mScore);
                    if(mQuestionNumber != mQuestionLibrary.mQuestions.length) {
                        updateQuestion();
                    }else{
                        Toast.makeText(MainActivity.this, "Quiz Ended", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber != mQuestionLibrary.mQuestions.length) {
                        updateQuestion();
                    }else{
                        Toast.makeText(MainActivity.this, "Quiz Ended", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        //End of Button Listener for Button 3
    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;

        final MediaPlayer sound1 = MediaPlayer.create(this, R.raw.sound1);
        final MediaPlayer sound2 = MediaPlayer.create(this, R.raw.sound2);
        final MediaPlayer sound3 = MediaPlayer.create(this, R.raw.sound3);
        final MediaPlayer sound4 = MediaPlayer.create(this, R.raw.sound4);
        final MediaPlayer sound5 = MediaPlayer.create(this, R.raw.sound5);
        final MediaPlayer sound6 = MediaPlayer.create(this, R.raw.sound6);
        final MediaPlayer sound7 = MediaPlayer.create(this, R.raw.sound7);
        final MediaPlayer sound8 = MediaPlayer.create(this, R.raw.sound8);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                if(mQuestionNumber == 1){
                    sound1.start();
                }
            }
        }, 1000);

        mButtonChoice1.setEnabled(false);
        mButtonChoice2.setEnabled(false);
        mButtonChoice3.setEnabled(false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mButtonChoice1.setEnabled(true);
                mButtonChoice2.setEnabled(true);
                mButtonChoice3.setEnabled(true);
            }
        },3500);

        if(mQuestionNumber == 2)
            sound2.start();
        else if(mQuestionNumber == 3)
            sound3.start();
        else if(mQuestionNumber == 4)
            sound4.start();
        else if(mQuestionNumber == 5)
            sound5.start();
        else if(mQuestionNumber == 6)
            sound6.start();
        else if(mQuestionNumber == 7)
            sound7.start();
        else if(mQuestionNumber == 8)
            sound8.start();
    }

    private void upsateScore(int point){
        mScoreView.setText(""+mScore);
    }
}
