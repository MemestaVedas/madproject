package com.example.myapplication;

import android.content.Context;
import android.content.Intent; // Import Intent here
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BirdAdapter extends RecyclerView.Adapter<BirdAdapter.ViewHolder> {

    private final Context context;
    private final int[] birdImages;
    private final String[] birdNames;

    public BirdAdapter(Context context, int[] birdImages, String[] birdNames) {
        this.context = context;
        this.birdImages = birdImages;
        this.birdNames = birdNames;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.birdImage.setImageResource(birdImages[position]);
        holder.birdName.setText(birdNames[position]);

        holder.birdImage.setOnClickListener(v -> {

            Intent intent = new Intent(context, BirdDetailActivity.class);
            intent.putExtra("BIRD_IMAGE", birdImages[position]);
            intent.putExtra("BIRD_NAME", birdNames[position]);
            context.startActivity(intent); // Start the activity
        });
    }

    @Override
    public int getItemCount() {
        return birdImages.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView birdImage;
        TextView birdName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            birdImage = itemView.findViewById(R.id.birdImage);
            birdName = itemView.findViewById(R.id.birdName);
        }
    }
}
