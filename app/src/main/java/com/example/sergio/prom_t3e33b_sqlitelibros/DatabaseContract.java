package com.example.sergio.prom_t3e33b_sqlitelibros;

import android.provider.BaseColumns;

/**
 * Created by Sergio on 21/12/2016.
 *
 * fuente: http://stackoverflow.com/questions/17451931/how-to-use-a-contract-class-in-android
 */

public final class DatabaseContract {

    public static final  int    DATABASE_VERSION   = 1;
    public static final  String DATABASE_NAME      = "database.db";

    private static final String PRIMARY_KEY         = " PRIMARY KEY";
    private static final String TEXT_TYPE           = " TEXT";
    private static final String INTEGER_TYPE        = " INTEGER";
    private static final String COMMA_SEP           = ",";

    // Para prevenir la instanciación, constructor privado y vacío
    private DatabaseContract() {}

    /**
     * Clase abstracta para la tabla Libros
     * Implementa BaseColumns: https://developer.android.com/training/basics/data-storage/databases.html#DbHelper
     */
    public static abstract class Libros implements BaseColumns {
        public static final String TABLE_NAME           = "libros";
        public static final String COLUMN_NAME_ISBN     = "isbn";
        public static final String COLUMN_NAME_TITULO   = "titulo";
        public static final String COLUMN_NAME_AUTOR    = "autor";
        public static final String COLUMN_NAME_ANIO     = "anio";

        /*
         * campo _ID: http://stackoverflow.com/questions/3192064/about-id-field-in-android-sqlite
         * El campo _ID puede ponerse como alias de ISBN y vale para un CursorAdapter
         * TODO Cursor adapter con listview - https://github.com/codepath/android_guides/wiki/Populating-a-ListView-with-a-CursorAdapter
         */
        public static final String CREATE_TABLE = "CREATE TABLE " +
                TABLE_NAME + " (" +
                    //_ID + INTEGER_TYPE + PRIMARY_KEY + COMMA_SEP +
                    COLUMN_NAME_ISBN + INTEGER_TYPE + PRIMARY_KEY + COMMA_SEP +
                    COLUMN_NAME_TITULO + TEXT_TYPE + COMMA_SEP +
                    COLUMN_NAME_AUTOR + TEXT_TYPE + COMMA_SEP +
                    COLUMN_NAME_ANIO + INTEGER_TYPE + " )";

        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}
