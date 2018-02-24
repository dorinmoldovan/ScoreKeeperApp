package com.androidbasicsnd.android.scorekeeperapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeam1 = 0;
    private int scoreTeam2 = 0;
    private int foulsTeam1 = 0;
    private int foulsTeam2 = 0;
    private int playersTeam1 = 11;
    private int playersTeam2 = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            onRestoreInstanceState(savedInstanceState);
        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);
        displayScoreForTeam1(scoreTeam1);
        displayFoulsForTeam1(foulsTeam1);
        displayPlayersForTeam1(playersTeam1);
        displayScoreForTeam2(scoreTeam2);
        dispalyFoulsForTeam2(foulsTeam2);
        displayPlayersForTeam2(playersTeam2);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(getString(R.string.scoreTeam1), scoreTeam1);
        savedInstanceState.putInt(getString(R.string.scoreTeam2), scoreTeam2);
        savedInstanceState.putInt(getString(R.string.foulsTeam1), foulsTeam1);
        savedInstanceState.putInt(getString(R.string.foulsTeam2), foulsTeam2);
        savedInstanceState.putInt(getString(R.string.playersTeam1), playersTeam1);
        savedInstanceState.putInt(getString(R.string.playersTeam2), playersTeam2);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        scoreTeam1 = savedInstanceState.getInt(getString(R.string.scoreTeam1));
        scoreTeam2 = savedInstanceState.getInt(getString(R.string.scoreTeam2));
        foulsTeam1 = savedInstanceState.getInt(getString(R.string.foulsTeam1));
        foulsTeam2 = savedInstanceState.getInt(getString(R.string.foulsTeam2));
        playersTeam1 = savedInstanceState.getInt(getString(R.string.playersTeam1));
        playersTeam2 = savedInstanceState.getInt(getString(R.string.playersTeam2));
    }

    public void reset(View v) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        foulsTeam1 = 0;
        foulsTeam2 = 0;
        playersTeam1 = 11;
        playersTeam2 = 11;;
        displayScoreForTeam1(scoreTeam1);
        displayFoulsForTeam1(foulsTeam1);
        displayPlayersForTeam1(playersTeam1);
        displayScoreForTeam2(scoreTeam2);
        dispalyFoulsForTeam2(foulsTeam2);
        displayPlayersForTeam2(playersTeam2);
    }

    public void displayScoreForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addFiveGoalsForTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 5;
        displayScoreForTeam1(scoreTeam1);
    }

    public void addThreeGoalsForTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 3;
        displayScoreForTeam1(scoreTeam1);
    }

    public void addTwoGoalsForTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 2;
        displayScoreForTeam1(scoreTeam1);
    }

    public void displayFoulsForTeam1(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    public void addOneFoulForTeam1(View v) {
        foulsTeam1 = foulsTeam1 + 1;
        displayFoulsForTeam1(foulsTeam1);
    }

    public void displayPlayersForTeam1(int players) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_players);
        scoreView.setText(String.valueOf(players));
    }

    public void removeAPlayerFromTeam1(View v) {
        if(playersTeam1 > 7) {
            playersTeam1 = playersTeam1 - 1;
        }
        displayPlayersForTeam1(playersTeam1);
    }

    public void displayScoreForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addFiveGoalsForTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 5;
        displayScoreForTeam2(scoreTeam2);
    }

    public void addThreeGoalsForTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 3;
        displayScoreForTeam2(scoreTeam2);
    }

    public void addTwoGoalsForTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 2;
        displayScoreForTeam2(scoreTeam2);
    }

    public void dispalyFoulsForTeam2(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    public void addOneFoulForTeam2(View v) {
        foulsTeam2 = foulsTeam2 + 1;
        dispalyFoulsForTeam2(foulsTeam2);
    }

    public void displayPlayersForTeam2(int players) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_players);
        scoreView.setText(String.valueOf(players));
    }

    public void removeAPlayerFromTeam2(View v) {
        if(playersTeam2 > 7) {
            playersTeam2 = playersTeam2 - 1;
        }
        displayPlayersForTeam2(playersTeam2);
    }
}
