package com.example.jeantu.target;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jeantu on 5/20/16.
 */
public class MainMenu extends AppCompatActivity {

    private Button loghoursButton, scoreboardButton, aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        final Context context = getApplicationContext();
        loghoursButton = (Button) findViewById(R.id.log_hours);
        scoreboardButton = (Button) findViewById(R.id.scoreboard_button);
        aboutButton = (Button) findViewById(R.id.about_button);

        loghoursButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //go to the loghours page
                Intent myIntent = new Intent(MainMenu.this, LogHoursActivity.class);
                MainMenu.this.startActivity(myIntent); //take the user to the page that will allow them to log their answers
            }
        });

        scoreboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //got to the scoreboard page
                Intent myIntent = new Intent(MainMenu.this, ScoreboardActivity.class);
                MainMenu.this.startActivity(myIntent); //take the user to the scoreboard page
            }
        });

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainMenu.this, AboutActivity.class);
                MainMenu.this.startActivity(myIntent); //take the user to the about page
            }
        });



    }

}
