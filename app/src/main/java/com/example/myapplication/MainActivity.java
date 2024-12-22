package com.example.myapplication;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    int[] birdImages = {
            R.drawable.eagle, R.drawable.parrot, R.drawable.peacock, R.drawable.sparrow,
            R.drawable.owl, R.drawable.pigeon, R.drawable.duck, R.drawable.swan,
            R.drawable.crow, R.drawable.kingfisher
    };
    String[] birdNames = {
            "Eagle", "Parrot", "Peacock", "Sparrow",
            "Owl", "Pigeon", "Duck", "Swan",
            "Crow", "Kingfisher"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        BirdAdapter adapter = new BirdAdapter(this, birdImages, birdNames);
        recyclerView.setAdapter(adapter);
    }
    private void showBirdName(String birdName) {
        Toast.makeText(this, birdName, Toast.LENGTH_SHORT).show();
    }
}
