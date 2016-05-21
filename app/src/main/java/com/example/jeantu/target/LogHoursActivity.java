package com.example.jeantu.target;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by jeantu on 5/20/16.
 */
public class LogHoursActivity  extends AppCompatActivity {

    //private Button signinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.loghours);

        final Context context = getApplicationContext();
        final int[] locationSelected = {0}; //will know which option the user has selected to answer as their location
        Spinner spinner;
        spinner= (Spinner) findViewById(R.id.locations);
        //need to do this to change the color of the text inside the dropdown menu
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.locations, R.layout.loghours); //finding it from that layout
        spinner.setAdapter(adapter);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    locationSelected[0] = position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                    // your code here
                }

            });
        }

    }

}
