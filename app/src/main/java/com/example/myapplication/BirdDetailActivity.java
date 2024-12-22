package com.example.myapplication;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BirdDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_detail);

        ImageView birdImage = findViewById(R.id.birdImageDetail);
        TextView birdName = findViewById(R.id.birdNameDetail);
        Button backButton = findViewById(R.id.backButton);

        int imageResId = getIntent().getIntExtra("BIRD_IMAGE", 0);
        String birdNameStr = getIntent().getStringExtra("BIRD_NAME");

        birdImage.setImageResource(imageResId);
        birdName.setText(birdNameStr);

        backButton.setOnClickListener(v -> finish());
    }
}








