package rollins.mates.closetcontrol;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Category extends AppCompatActivity {

    final ImageView imageView = findViewById(R.id.item_one);
    Bundle bundle = getIntent().getExtras();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Intent data = getIntent();
        int imageId = data.getIntExtra("image", R.drawable.image1);
        imageView.setImageResource(imageId);

    }
}
