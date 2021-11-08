package com.example.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.BucketListViewHolder> {

    private BucketList[] array;

    public BucketListAdapter(BucketList[] array) {
        this.array = array;
    }

    @Override
    public int getItemCount() {
        return array.length;
    }

    @NonNull
    @Override
    public BucketListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket,parent,false);

        return new BucketListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListViewHolder holder, int position) {

        holder.bind(array[position]);

    }

    static class BucketListViewHolder extends RecyclerView.ViewHolder {
        // Para definir as coisas do layout criado
        private TextView textViewID;
        private TextView textViewTitle;

        public BucketListViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewID = itemView.findViewById(R.id.text_view_id);
            textViewTitle = itemView.findViewById(R.id.text_view_title);

        }

        public void bind(BucketList array){
            // Setting
            textViewID.setText(array.id);
            textViewTitle.setText(array.title);
        }

    }


}
