package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsArcherOne = 0;
    int pointsArcherTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase points for archer one +2
     */
    public void plusTwoFor0ne(View v) {
        pointsArcherOne = pointsArcherOne + 2;
        displayPointsForArcherOne(pointsArcherOne);
    }

    /**
     * Increase points for archer one +4
     */
    public void plusFourForOne(View v) {
        pointsArcherOne = pointsArcherOne + 4;
        displayPointsForArcherOne(pointsArcherOne);
    }

    /**
     * Increase points for archer one +6
     */
    public void plusSixForOne(View v) {
        pointsArcherOne = pointsArcherOne + 6;
        displayPointsForArcherOne(pointsArcherOne);
    }

    /**
     * Increase points for archer one +8
     */
    public void plusEightForOne(View v) {
        pointsArcherOne = pointsArcherOne + 8;
        displayPointsForArcherOne(pointsArcherOne);
    }

    /**
     * Increase points for archer one +10
     */
    public void plusTenForOne(View v) {
        pointsArcherOne = pointsArcherOne + 10;
        displayPointsForArcherOne(pointsArcherOne);
    }

    /**
     * Displays points for archer one.
     */
    public void displayPointsForArcherOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.points_archer_one);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase points for archer two +2
     */
    public void plusTwoForTwo(View v) {
        pointsArcherTwo = pointsArcherTwo + 2;
        displayPointsForArcherTwo(pointsArcherTwo);
    }

    /**
     * Increase points for archer two +4
     */
    public void plusFourForTwo(View v) {
        pointsArcherTwo = pointsArcherTwo + 4;
        displayPointsForArcherTwo(pointsArcherTwo);
    }

    /**
     * Increase points for archer two +6
     */
    public void plusSixForTwo(View v) {
        pointsArcherTwo = pointsArcherTwo + 6;
        displayPointsForArcherTwo(pointsArcherTwo);
    }

    /**
     * Increase points for archer two +8
     */
    public void plusEightForTwo(View v) {
        pointsArcherTwo = pointsArcherTwo + 8;
        displayPointsForArcherTwo(pointsArcherTwo);
    }

    /**
     * Increase points for archer two +10
     */
    public void plusTenForTwo(View v) {
        pointsArcherTwo = pointsArcherTwo + 10;
        displayPointsForArcherTwo(pointsArcherTwo);
    }

    /**
     * Displays points for archer two.
     */
    public void displayPointsForArcherTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.points_archer_two);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset button
     */
    public void reset(View v) {
        pointsArcherOne = 0;
        pointsArcherTwo = 0;
        displayPointsForArcherOne(pointsArcherOne);
        displayPointsForArcherTwo(pointsArcherTwo);
    }
}
