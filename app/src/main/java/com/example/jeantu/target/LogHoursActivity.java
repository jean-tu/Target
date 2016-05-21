package com.example.jeantu.target;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeantu on 5/20/16.
 */
public class LogHoursActivity  extends AppCompatActivity {

    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.loghours);

        final Context context = getApplicationContext();
        final int[] locationSelected = {0}; //will know which option the user has selected to answer as their location
        Spinner spinner;
        spinner = (Spinner) findViewById(R.id.locations);
        //need to do this to change the color of the text inside the dropdown menu
        ///ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.locations, R.layout.loghours); //finding it from that layout
        List<String> list = new ArrayList<String>();
        list.add("Alexandria Target");
        list.add("Andover Target");
        list.add("Apple Valley South Super Target");
        list.add("Bemidji Target");
        list.add("Blaine SuperTarget");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);


//    public void addListenerOnSpinnerItemSelection() {
//        spinner = (Spinner) findViewById(R.id.spinner);
//        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
//    }
        spinner.setAdapter(dataAdapter);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    locationSelected[0] = position;
                    System.out.println("option selected: " + locationSelected[0]);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                    // your code here
                }

            });
        }

        submitButton = (Button) findViewById(R.id.submit_hours_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //got to the scoreboard page
                Intent myIntent = new Intent(LogHoursActivity.this, SubmitHoursActivity.class);
                LogHoursActivity.this.startActivity(myIntent); //take the user to the scoreboard page
            }
        });

    }
}