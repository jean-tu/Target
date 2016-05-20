package com.example.jeantu.target;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by jeantu on 4/11/16.
 */
public class LoginActivity extends AppCompatActivity {

    private Button signinButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Context context = getApplicationContext();

        signinButton = (Button) findViewById(R.id.email_sign_in_button); //finding the sign in button
        signinButton.setOnClickListener(new View.OnClickListener() { //user wants to return to the maps page to click on another level
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this, MainMenu.class);
                LoginActivity.this.startActivity(myIntent);
            }
        });
    }
}