package com.example.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChooseLevel extends AppCompatActivity {
    // Level One to Ten
    Button btnLevelOne, btnLevelTwo, btnLevelThree, btnLevelFour, btnLevelFive, btnLevelSix,
            btnLevelSeven, btnLevelEight, btnLevelNine, btnLevelTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);
        btnLevelOne = findViewById(R.id.btnLevelOne);
        btnLevelTwo = findViewById(R.id.btnLevelTwo);
        btnLevelThree = findViewById(R.id.btnLevelThree);
        btnLevelFour = findViewById(R.id.btnLevelFour);
        btnLevelFive = findViewById(R.id.btnLevelFive);
        btnLevelSix = findViewById(R.id.btnLevelSix);
        btnLevelSeven = findViewById(R.id.btnLevelSeven);
        btnLevelEight = findViewById(R.id.btnLevelEight);
        btnLevelNine = findViewById(R.id.btnLevelNine);
        btnLevelTen = findViewById(R.id.btnLevelTen);
        btnLevelOne.setOnClickListener(view -> {
            sendValueToReceiverActivity("Level 1"); // 18 Length
        });
        btnLevelTwo.setOnClickListener(view -> {
            sendValueToReceiverActivity("Level 2"); // 35 Length
        });
        btnLevelThree.setOnClickListener(view -> {
            sendValueToReceiverActivity("Level 3"); // 29 Length
        });
        btnLevelFour.setOnClickListener(view -> {
            sendValueToReceiverActivity("Level 4"); // 39 Length
        });
        btnLevelFive.setOnClickListener(view -> {
            sendValueToReceiverActivity("Level 5"); // 44 Length
        });
        btnLevelSix.setOnClickListener(view -> {
            sendValueToReceiverActivity("Level 6"); // 42 Length
        });
        btnLevelSeven.setOnClickListener(view -> {
            sendValueToReceiverActivity("Level 7"); // 33 Length
        });
        btnLevelEight.setOnClickListener(view -> {
            sendValueToReceiverActivity("Level 8"); // 32 Length
        });
        btnLevelNine.setOnClickListener(view -> {
            sendValueToReceiverActivity("Level 9"); // 39 Length
        });
        btnLevelTen.setOnClickListener(view -> {
            sendValueToReceiverActivity("Level 10"); // 40 Length
        });
    }

    private void sendValueToReceiverActivity(String value) {
        Intent intent = new Intent(ChooseLevel.this, Content.class);
        intent.putExtra("key", value);
        startActivity(intent);
    }
}