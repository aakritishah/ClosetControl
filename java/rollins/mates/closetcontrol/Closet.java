package rollins.mates.closetcontrol;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Closet extends AppCompatActivity {

    private ImageButton catTwo;
    private ImageButton catThree;
    private ImageButton catFour;
    private ImageButton catFive;
    private ImageButton catSix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closet);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();
        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        ImageButton catOne = findViewById(R.id.item_one);
        catTwo = findViewById(R.id.item_two);
        catThree = findViewById(R.id.item_three);
        catFour = findViewById(R.id.item_four);
        catFive = findViewById(R.id.item_five);
        catSix = findViewById(R.id.item_six);

        View.OnClickListener myOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.item_one:
                        Intent intent = new Intent(Closet.this, Category.class);
                        intent.putExtra("image", R.drawable.image1);
                        setResult(RESULT_OK, intent);
                        startActivity(intent);
                        break;
                    /*case R.id.item_two:
                        Intent intent2 = new Intent(Closet.this, Category.class);
                        intent2.putExtra("image", R.drawable.image1);
                        startActivity(intent2);
                        break;
                    case R.id.item_three:
                        Intent intent3 = new Intent(Closet.this, Category.class);
                        intent3.putExtra("image", R.drawable.image1);
                        startActivity(intent3);
                        break;
                    case R.id.item_four:
                        Intent intent4 = new Intent(Closet.this, Category.class);
                        intent4.putExtra("image", R.drawable.image1);
                        startActivity(intent4);
                        break;
                    case R.id.item_five:
                        Intent intent5 = new Intent(Closet.this, Category.class);
                        intent5.putExtra("image", R.drawable.image1);
                        startActivity(intent5);
                        break;
                    case R.id.item_six:
                        Intent intent6 = new Intent(Closet.this, Category.class);
                        intent6.putExtra("image", R.drawable.image1);
                        startActivity(intent6);
                        break;*/
                }
            }
        };

        catOne.setOnClickListener(myOnClickListener);
        catTwo.setOnClickListener(myOnClickListener);
        catThree.setOnClickListener(myOnClickListener);
        catFour.setOnClickListener(myOnClickListener);
        catFive.setOnClickListener(myOnClickListener);
        catSix.setOnClickListener(myOnClickListener);

    }

    // implements the back/up button
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
