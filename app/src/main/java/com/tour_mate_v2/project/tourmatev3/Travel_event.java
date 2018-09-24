package com.tour_mate_v2.project.tourmatev3;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class Travel_event extends AppCompatActivity implements View.OnClickListener {

    EditText editTextFromDate,editTextToDate;
    private DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_event);

        editTextFromDate=findViewById(R.id.editTextFromDate);
        editTextToDate=findViewById(R.id.editTextToDate);

        editTextFromDate.setOnClickListener(this);
        editTextToDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if ( v.getId()==R.id.editTextFromDate) {


            DatePicker datePicker = new DatePicker(this);
            int currentday = datePicker.getDayOfMonth();
            int currentmonth = (datePicker.getMonth()) + 1;
            int currentyear = datePicker.getYear();


            datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            editTextFromDate.setText(dayOfMonth + "-" + (month + 1) + "-" + year);

                        }
                    }, currentyear, currentmonth, currentday);

            datePickerDialog.show();

        }


        else if(v.getId()==R.id.editTextToDate){

            DatePicker datePicker = new DatePicker(this);
            int currentday = datePicker.getDayOfMonth();
            int currentmonth = (datePicker.getMonth()) + 1;
            int currentyear = datePicker.getYear();


            datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            editTextToDate.setText(dayOfMonth + "-" + (month + 1) + "-" + year);

                        }
                    }, currentyear, currentmonth, currentday);

            datePickerDialog.show();

        }
    }
}

