package com.aec.project.customlistview;

import android.app.DatePickerDialog;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BookingDetails extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    Button btn_done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_details);


        Spinner spinner = (Spinner) findViewById(R.id.spinner_rooms);

        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("1 Room & 2 Peoples");
        categories.add("1 Room & 3 Peoples");
        categories.add("2 Rooms & 3 Peoples");
        categories.add("2 Rooms & 4 Peoples");
        categories.add("2 Rooms & 5 Peoples");
        categories.add("2 Rooms & 6 Peoples");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);


        btn_done = (Button) findViewById(R.id.donebtn);
        btn_done.setEnabled(false);
        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });





        /*Button btn1;
        btn1 = (Button) findViewById(R.id.btn1);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                context, MainActivity.this, startYear, starthMonth, startDay);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePickerDialog.show();
            }
        });
*/
    }


    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

    }
}
