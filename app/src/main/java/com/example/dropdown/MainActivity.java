package com.example.dropdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin;

        spin = findViewById(R.id.spin);

        List<String> items = new ArrayList<>();
        items.add("Select Your Country");
        items.add("United State");
        items.add("Australia");
        items.add("Canada");
        items.add("Pakistan");
        items.add("Bangladesh");
        items.add("Malaysia");

        SpinnerAdapter spinnerAdapter = new ArrayAdapter<>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,items);
        spin.setAdapter(spinnerAdapter);
    }
}