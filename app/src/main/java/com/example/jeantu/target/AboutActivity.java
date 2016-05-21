package com.example.jeantu.target;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.sql.BatchUpdateException;

/**
 * Created by jeantu on 5/20/16.
 */
public class AboutActivity extends AppCompatActivity {

    private Button menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        final Context context = getApplicationContext();

        menuButton = (Button) findViewById(R.id.menu_from_about_button);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(AboutActivity.this, MainMenu.class);
                AboutActivity.this.startActivity(myIntent); //return the user back to the menupage
            }
        });



    }

}