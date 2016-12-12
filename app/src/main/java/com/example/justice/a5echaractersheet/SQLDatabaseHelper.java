package com.example.justice.a5echaractersheet;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Justice on 12/10/2016.
 */

public class SQLDatabaseHelper extends SQLiteOpenHelper{

    //Database Name
    public static final String DB_NAME = "DnDCharacterCreator";
    public static final int DB_VERSION = 1;

    //Table Name
    public static final String TABLE_CHARACTERS = "CHARACTERS";
    public static final String TABLE_INVENTORIES = "INVENTORIES";

    //Table Coluumns
    public static final String CHARACTERS_COLUMN_NAME = "NAME";
    public static final String CHARACTERS_COLUMN_RACE = "RACE";
    public static final String CHARACTERS_COLUMN_CLASS = "CLASS";
    public static final String CHARACTERS_COLUMN_GENDER = "GENDER";
    public static final String CHARACTERS_COLUMN_ALIGNMENT = "ALIGNMENT";

    private SQLDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
