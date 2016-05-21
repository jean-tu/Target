package com.example.jeantu.target;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by jeantu on 4/11/16.
 */
public class LoginActivity extends AppCompatActivity {

    private Button signinButton, registerButton;
    private AutoCompleteTextView email;// =(AutoCompleteTextView)findViewById(R.id.email);
    private String emailAddress;
    private EditText passwordField ;//= (EditText)findViewById(R.id.password);
    private String password;
    User user = User.getUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Context context = getApplicationContext();

        email =(AutoCompleteTextView)findViewById(R.id.email);
        passwordField = (EditText)findViewById(R.id.password);
        signinButton = (Button) findViewById(R.id.email_sign_in_button); //finding the sign in button
        registerButton = (Button) findViewById(R.id.register_button);


        signinButton.setOnClickListener(new View.OnClickListener() { //user wants to return to the maps page to click on another level
            public void onClick(View v) {
                emailAddress = email.getText().toString();
                password = passwordField.getText().toString();
                if (emailAddress.matches("")) {
                    Toast.makeText(context, "Please fill in your email!", Toast.LENGTH_SHORT).show();
                } else if(password.matches("")){
                    Toast.makeText(context, "Please enter your password!", Toast.LENGTH_SHORT).show();
                } else if(emailAddress.matches("") && password.matches("")){
                    Toast.makeText(context, "Fill in your information to login or Sign in using Twitter!", Toast.LENGTH_SHORT).show();
                } else {
                    user.setUsername(emailAddress);
                    Toast.makeText(context, "Username saved: " + emailAddress, Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(LoginActivity.this, MainMenu.class);
                    LoginActivity.this.startActivity(myIntent);
                }
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(myIntent); //take the user to the register page
            }
        });
    }
}