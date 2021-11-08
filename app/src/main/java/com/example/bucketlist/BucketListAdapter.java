package com.example.bucketlist;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.BucketListViewHolder> {
    @NonNull
    @Override
    public BucketListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }



    static class BucketListViewHolder extends RecyclerView.ViewHolder {
        // Para definir as coisas do layout criado
        
        public BucketListViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
