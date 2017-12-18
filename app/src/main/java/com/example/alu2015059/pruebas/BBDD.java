package com.example.alu2015059.pruebas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by alu2015059 on 18/12/2017.
 */

public class BBDD extends SQLiteOpenHelper {

    String usuario = "CREATE TABLE Usuarios (nombre TEXT, apellido TEXT, correo TEXT, contraseña TEXT, nickname TEXT)";


    public BBDD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqldb) {
        sqldb.execSQL(usuario);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqldb, int versionActual, int versionNueva) {

        sqldb.execSQL("DROP TABLE IF EXISTS Usuarios");
        sqldb.execSQL(usuario);
    }
}
