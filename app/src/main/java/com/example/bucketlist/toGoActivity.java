package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class toGoActivity extends AppCompatActivity {

    RecyclerView recyclerToGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_go);


        findViews();

        BucketList[] toGo = {
                new BucketList("1", "Barcelona"),
                new BucketList("2", "Tokyo"),
                new BucketList("3", "Amsterdam"),
                new BucketList("4", "Germany"),
                new BucketList("5", "Praga"),
        };

        BucketListAdapter adapter = new BucketListAdapter(toGo);

        recyclerToGo.setAdapter(adapter);

    }

    private void findViews() {

        recyclerToGo = findViewById(R.id.recyler_view_toGo);

    }
}