package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView toGoCardView;
    CardView toDoCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        cardClick();
    }

    private void cardClick() {
        toGoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent toGoActivity = new Intent(MainActivity.this, toGoActivity.class);
                //startActivity(toGoActivity);

            }
        });

        toDoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDoActivity = new Intent(MainActivity.this, toDoActivity.class);
                startActivity(toDoActivity);

            }
        });


    }

    private void findViews(){

        toGoCardView = findViewById(R.id.card_view_toGo);
        toDoCardView = findViewById(R.id.card_view_toDo);

    }
}