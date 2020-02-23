package com.example.nutritiononabudget;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText totalCaloriesView = findViewById(R.id.total_calories);
        final EditText totalDollarsView = findViewById(R.id.total_dollars);
        Button saveCalories = findViewById(R.id.save_calories);
        saveCalories.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int totalCalories = Integer.parseInt(totalCaloriesView.getText().toString());
                System.out.println(totalCalories);
            }
        });
        Button saveDollars = findViewById(R.id.save_dollars);
        saveDollars.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int totalDollars = Integer.parseInt(totalDollarsView.getText().toString());
                System.out.println(totalDollars);
            }
        });
        Button searchBtn = findViewById(R.id.search_btn);
        searchBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Connection c = null;

                try {
                    Class.forName("org.sqlite.JDBC");
                    c = DriverManager.getConnection("jdbc:sqlite:test.db");
                } catch ( Exception e ) {
                    System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                    System.exit(0);
                }
                System.out.println("Opened database successfully");
            }
        });
    }
}

