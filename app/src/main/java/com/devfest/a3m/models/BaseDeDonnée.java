package com.devfest.a3m.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by faiez on 27/11/2016.
 */

public class BaseDeDonnée extends SQLiteOpenHelper {

    public static final String METIER_KEY = "id";
    public static final String METIER_INTITULE = "intitule";
    public static final String METIER_SALAIRE = "salaire";

    public static final String METIER_TABLE_NAME = "Metier";
    public static final String METIER_TABLE_CREATE =
            "CREATE TABLE " + METIER_TABLE_NAME + " (" +
                    METIER_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    METIER_INTITULE + " TEXT, " +
                    METIER_SALAIRE + " REAL);";

    public BaseDeDonnée(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(METIER_TABLE_CREATE);
    }
    public static final String METIER_TABLE_DROP = S " + METIER_TABLE_NAME + ";";
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)"DROP TABLE IF EXIST {
        db.execSQL(METIER_TABLE_DROP);
        onCreate(db);
    }
}
