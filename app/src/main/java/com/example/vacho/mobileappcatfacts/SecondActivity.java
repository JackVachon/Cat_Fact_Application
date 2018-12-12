package com.example.vacho.mobileappcatfacts;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private Button nextButton;
    private EditText messageEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        constraintLayout = findViewById(R.id.constraintLayout);
        nextButton = findViewById(R.id.SwapActivityButton2);
        messageEditText = findViewById(R.id.EnterFavoriteDog);

        final MediaPlayer dogBarkMP = MediaPlayer.create(this, R.raw.pitbull);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                String message = messageEditText.getText().toString();
                intent.putExtra("message_key", message);
                dogBarkMP.start();
                startActivity(intent);
            }
        });
    }
}
