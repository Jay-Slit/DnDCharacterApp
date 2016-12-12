package com.example.justice.a5echaractersheet;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CreateCharacter extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_character);
        context = getApplicationContext();
    }

    private void showInstructionsDialog(){
        AlertDialog.Builder builder1 = new AlertDialog.Builder(context);
        builder1.setMessage("@string/dialog_createCharacter_CharInfo");
        builder1.setCancelable(true);

        builder1.setPositiveButton("@dialog_ok", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id){
                dialog.cancel();
            }
        });

        AlertDialog alert1 = builder1.create();
        alert1.show();
    }
}
