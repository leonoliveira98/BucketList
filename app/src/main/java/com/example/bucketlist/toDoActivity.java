package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class toDoActivity extends AppCompatActivity {

    RecyclerView toDoRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        findViews();

        BucketList[] toDo = {
                new BucketList(1, "Skydiving"),
                new BucketList(2, "Swim Naked on the Beach"),
                new BucketList(3, "Buy a Lamborghini"),
                new BucketList(4, "Bungeejumping"),
                new BucketList(5, "Kiss a Celebrity"),
        };




    }

    private void findViews() {

        toDoRecycler = findViewById(R.id.recyler_view_toDo);

    }
}