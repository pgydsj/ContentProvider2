package com.example.administrator.contentprovidershare;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2018/6/24.
 */

    public class MyDatabaseHelper extends SQLiteOpenHelper {
        public static final String CREATE_CONTACTS="create table Contacts ("
                +" id integer primary key autoincrement,"
                +" name text,"
                +"number text"
                +"sex text)";

        private Context mContext;
        public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int veision){
            super(context,name,factory,veision);
            mContext =context;
        }
        @Override
        public void onCreate(SQLiteDatabase db){
            db.execSQL(CREATE_CONTACTS);
        }
        @Override
        public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVeisrion){
        }

    }
