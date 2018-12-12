package com.example.vacho.mobileappcatfacts;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    //Declare our view variables
    private TextView factTextView;
    private Button showFactButton;
    private ConstraintLayout constraintLayout;
    private Button nextButton;
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_facts);

        String message = " ";
        message = getIntent().getStringExtra("message_key");

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        constraintLayout = findViewById(R.id.relativeLayout);
        nextButton = findViewById(R.id.SwapActivityButton);
        messageTextView = findViewById(R.id.MainFavoriteDog);

        if (message == null) {
            messageTextView.setText(" ");
        }
        else {
            messageTextView.setText("Your Favorite Dog Is: " + message);
        }

        final MediaPlayer dogBarkMP = MediaPlayer.create(this, R.raw.pitbull);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();
                int color = colorWheel.getColor();
                factTextView.setText(fact);
                constraintLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                nextButton.setTextColor(color);
                dogBarkMP.start();

            }
        };
        showFactButton.setOnClickListener(listener);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                dogBarkMP.start();
            }
        });
    }
}

