package com.example.alu2015059.pruebas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by alu2015059 on 18/12/2017.
 */

public class BBDD extends SQLiteOpenHelper {

    String usuario = "CREATE TABLE Usuarios (id INTEGER, nombre TEXT, apellido TEXT, correo TEXT, contraseña TEXT)";
    

    public BBDD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
