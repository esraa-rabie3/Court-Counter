package com.example.esraa.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void wheanClickButton1(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }
    public void wheanClickButton2(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }
    public void wheanClickButton3(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }
    public void wheanClickButtonB1(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void wheanClickButtonB2(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void wheanClickButtonB3(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }
    public void reset(View v){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
