package com.example.jeantu.target;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jeantu on 5/21/16.
 */
public class SubmitHoursActivity extends AppCompatActivity {

    private Button returnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.submithours);

        returnMenu = (Button) findViewById(R.id.return_to_menu_button);
        returnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SubmitHoursActivity.this, MainMenu.class);
                SubmitHoursActivity.this.startActivity(myIntent); //return the user back to the menupage
            }
        });

    }
}