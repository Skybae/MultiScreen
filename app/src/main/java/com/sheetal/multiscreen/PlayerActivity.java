package com.sheetal.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        EditText playerOne = findViewById(R.id.playerOne);
        EditText playerTwo = findViewById(R.id.playerTwo);
        Button play = findViewById(R.id.play);

        play.setOnClickListener(view -> {
            String getPlayerOneName = playerOne.getText().toString();
            String getPlayerTwoName = playerTwo.getText().toString();

            if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()) {
                playerOne.setText("Player 1");
                playerTwo.setText("Player 2");
            } else {
                Intent intent = new Intent(getApplicationContext(), StartActivity.class);
                intent.putExtra("player1", getPlayerOneName);
                intent.putExtra("player2", getPlayerTwoName);
                startActivity(intent);
            }
        });

    }
}