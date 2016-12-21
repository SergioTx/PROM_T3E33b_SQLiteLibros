package com.example.sergio.prom_t3e33b_sqlitelibros;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

/**
 * Created by Sergio on 20/12/2016.
 */

public class AgendaSQLiteHelper extends SQLiteOpenHelper {

    //constructor del padre
    public AgendaSQLiteHelper(Context context) {
        super(context, DatabaseContract.DATABASE_NAME, null, DatabaseContract.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DatabaseContract.Libros.CREATE_TABLE);
    }

    /**
     * Borra la base de datos y la vuelve a crear
     * @param sqLiteDatabase
     * @param i
     * @param i1
     */
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DatabaseContract.Libros.DELETE_TABLE);
        onCreate(sqLiteDatabase);
    }

}
