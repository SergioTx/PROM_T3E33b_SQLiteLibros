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
    private static final String TEXT_TYPE          = " TEXT";
    private static final String INTEGER_TYPE          = " INTEGER";
    private static final String COMMA_SEP          = ",";

    // Para prevenir la instanciación, constructor privado y vacío
    private DatabaseContract() {}

    /**
     * Clase abstracta para la tabla Libros
     * Implementa BaseColumns: https://developer.android.com/training/basics/data-storage/databases.html#DbHelper
     */
    public static abstract class Libros implements BaseColumns {
        public static final String TABLE_NAME       = "libros";
        public static final String COLUMN_NAME_COL1 = "isbn";
        public static final String COLUMN_NAME_COL2 = "titulo";
        public static final String COLUMN_NAME_COL3 = "autor";
        public static final String COLUMN_NAME_COL4 = "anio";

        /**
         * http://stackoverflow.com/questions/3192064/about-id-field-in-android-sqlite
         */
        public static final String CREATE_TABLE = "CREATE TABLE " +
                TABLE_NAME + " (" +
                _ID + INTEGER_TYPE + " PRIMARY KEY" + COMMA_SEP +
                COLUMN_NAME_COL1 + TEXT_TYPE + COMMA_SEP +
                COLUMN_NAME_COL2 + TEXT_TYPE + COMMA_SEP +
                COLUMN_NAME_COL3 + TEXT_TYPE + COMMA_SEP +
                COLUMN_NAME_COL4 + INTEGER_TYPE + " )";

        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}
