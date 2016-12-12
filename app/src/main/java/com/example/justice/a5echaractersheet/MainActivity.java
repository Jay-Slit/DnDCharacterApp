package com.example.justice.a5echaractersheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Buttons
    Button newCharBtn;
    Button transferCharBtn;
    Button newPartyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineButtons();
        createOnClicks();
    }

    private void loadActivityCreateCharacter(View view){
        System.out.println("Working, loadActiityCreateCharacter");
        Intent intent = new Intent(this, CreateCharacter.class);

        startActivity(intent);
    }

    private void defineButtons(){
        newCharBtn = (Button) findViewById(R.id.newCharBtn);
        transferCharBtn = (Button) findViewById(R.id.transferCharBtn);
        newPartyBtn = (Button) findViewById(R.id.newPartyBtn);
    }

    private void createOnClicks(){
        newCharBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                loadActivityCreateCharacter(v);
            }
        });
    }
}
