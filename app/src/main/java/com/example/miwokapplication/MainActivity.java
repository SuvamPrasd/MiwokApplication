package com.example.miwokapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.miwokapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //Numbers intent
        TextView numbers = (TextView) findViewById(R.id.numbers);

        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent n = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(n);
            }
        });


        //Phrases intent
        TextView phrases = (TextView) findViewById(R.id.phrases);

        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(m);
            }
        });


        //Family intent
        TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(b);
            }
        });


        //Colors intent
        TextView color = (TextView) findViewById(R.id.colors);

        color.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent z = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(z);
            }
        });
    }
}