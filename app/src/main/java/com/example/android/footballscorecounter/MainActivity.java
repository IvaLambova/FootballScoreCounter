package com.example.android.footballscorecounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends Activity {

    // Initiate global integer variables
    int goalTeamA;
    int redCardTeamA;
    int yellowCardTeamA;
    int goalTeamB;
    int redCardTeamB;
    int yellowCardTeamB;

    // Initiate global string variables
    static final String stateGoalsTeamA = "teamAGoals";
    static final String stateGoalsTeamB = "teamBGoals";
    static final String stateRedCardsTeamA = "teamARedCards";
    static final String stateRedCardsTeamB = "teamBRedCards";
    static final String stateYellowCardsTeamA = "teamAYellowCards";
    static final String stateYellowCardsTeamB = "teamBYellowCards";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hides the app status bar and allows for more screen size
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

    }

    // Uses onSaveInstanceState
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {


        //Calls the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt(stateGoalsTeamA, goalTeamA);
        savedInstanceState.putInt(stateGoalsTeamB, goalTeamB);
        savedInstanceState.putInt(stateRedCardsTeamA, redCardTeamA);
        savedInstanceState.putInt(stateRedCardsTeamB, redCardTeamB);
        savedInstanceState.putInt(stateYellowCardsTeamA, yellowCardTeamA);
        savedInstanceState.putInt(stateYellowCardsTeamB, yellowCardTeamB);


    }

    // Uses onRestoreInstanceState
    public void onRestoreInstanceState(Bundle savedInstanceState) {

          // Calls the superclass so it can save the view hierarchy state
          super.onRestoreInstanceState(savedInstanceState);

         // Saves the user current game state.
        goalTeamA = savedInstanceState.getInt(stateGoalsTeamA);
        goalTeamB = savedInstanceState.getInt(stateGoalsTeamB);
        redCardTeamA = savedInstanceState.getInt(stateRedCardsTeamA);
        redCardTeamB = savedInstanceState.getInt(stateRedCardsTeamB);
        yellowCardTeamA = savedInstanceState.getInt(stateYellowCardsTeamA);
        yellowCardTeamB = savedInstanceState.getInt(stateYellowCardsTeamB);


        //Restores state members from saved instance
        displayForTeamA(goalTeamA);
        displayRedCardsForTeamA(redCardTeamA);
        displayYellowCardsForTeamA(yellowCardTeamA);
        displayForTeamB(goalTeamB);
        displayRedCardsForTeamB(redCardTeamB);
        displayYellowCardsForTeamB(yellowCardTeamB);
    }




    // Displays +1 goal for Team A when the button GOAL for Team A is clicked
    public void goalForTeamA(View view) {
        goalTeamA = goalTeamA + 1;
        displayForTeamA(goalTeamA);
    }

    //Displays +1 Red Card for Team A when the button Red Card for Team A is clicked
    public void redCardTeamA (View view) {
        redCardTeamA = redCardTeamA + 1;
        displayRedCardsForTeamA(redCardTeamA);
    }

    //Displays +1 Yellow Card for Team A when the button Yellow Card for Team A is clicked
    public void yellowCardTeamA (View view) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardsForTeamA(yellowCardTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given number of red cards for Team A
    public void displayRedCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.number_red_cards_team_a);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given number of yellow cards for Team A
    public void displayYellowCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.number_yellow_cards_team_a);
        scoreView.setText(String.valueOf(score));
    }


    //Displays +1 goal for Team B when the button Goal for Team B is clicked
    public void goalForTeamB (View view) {
        goalTeamB = goalTeamB + 1;
        displayForTeamB(goalTeamB);
    }

    //Displays +1 Red Card for Team B when the button Red Card for Team B is clicked
    public void redCardTeamB (View view) {
        redCardTeamB = redCardTeamB + 1;
        displayRedCardsForTeamB(redCardTeamB);
    }

    //Displays +1 Yellow Card for Team B when the button Yellow Card for Team B is clicked
    public void yellowCardTeamB (View view) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowCardsForTeamB(yellowCardTeamB);
    }

    //Displays the given score for Team B
    public void displayForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given number of red cards for Team B
    public void displayRedCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.number_red_cards_team_b);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given number of yellow cards for Team B
    public void displayYellowCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.number_yellow_cards_team_b);
        scoreView.setText(String.valueOf(score));
    }

    //Resets all numbers (inc. goals, red and yellow cards)
    public void resetScore (View v) {
        goalTeamA = 0;
        goalTeamB =0;
        redCardTeamA = 0;
        yellowCardTeamA = 0;
        redCardTeamB = 0;
        yellowCardTeamB = 0;
        displayForTeamA(goalTeamA);
        displayForTeamB(goalTeamB);
        displayRedCardsForTeamA(redCardTeamA);
        displayYellowCardsForTeamA(yellowCardTeamA);
        displayRedCardsForTeamB(redCardTeamB);
        displayYellowCardsForTeamB(yellowCardTeamB);
    }

}
