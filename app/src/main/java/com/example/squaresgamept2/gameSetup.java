package com.example.squaresgamept2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class gameSetup extends Activity {

    static int numberOfPlayers;
    int xCounter = 0;
    int yCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamesetup);

        TextView xView = findViewById(R.id.xNum);
        TextView yView = findViewById(R.id.yNum);

        /**************************************************************
         * Exit button when clicked leads back to the main menu
         */

        Button exitBtn = findViewById(R.id.backGamesetup);
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainmenuIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainmenuIntent);
            }
        });

        /**************************************************************
         * Create buttons for player 2
         */
        Button player2 = findViewById(R.id.player2);
        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOfPlayers = 2;
            }
        });

        /**************************************************************
         * Create buttons for player 3
         */

        Button player3 = findViewById(R.id.player3);
        player3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOfPlayers = 3;
            }
        });

        /**************************************************************
         * Create button for player 4
         */

        Button player4 = findViewById(R.id.player4);
        player4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOfPlayers = 4;
            }
        });

        /**************************************************************
         * Increment 1 to the X-axis dots
         */

        Button xPlus = findViewById(R.id.xPlus);
        xPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xCounter += 1;
                xView.setText(Integer.toString(xCounter));
            }
        });

        /**************************************************************
         * Decrement 1 to the X-axis dots
         */

        Button xMinus = findViewById(R.id.xMinus);
        xMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xCounter > 0)
                {
                    xCounter -= 1;
                }
                xView.setText(Integer.toString(xCounter));
            }
        });

        /**************************************************************
         * Increment 1 to the Y-axis dots
         */

        Button yPlus = findViewById(R.id.yPlus);
        yPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yCounter += 1;
                yView.setText(Integer.toString(yCounter));
            }
        });

        /**************************************************************
         * Decrement 1 to the Y-axis dots
         */

        Button yMinus = findViewById(R.id.yMinus);
        yMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yCounter > 0)
                {
                    yCounter -= 1;
                }
                yView.setText(Integer.toString(yCounter));
            }
        });

        /**************************************************************
         * Start the game when the User clicks on the Start Game button
         */

        Button startGame = findViewById(R.id.startGame);
        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gamepage = new Intent(getApplicationContext(), game.class);
                startActivity(gamepage);
            }
        });

    }
}
