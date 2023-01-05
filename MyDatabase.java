package com.example.sjcet.optionmenu;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase

  public class MyDatabase extends SQLiteOpenHelper
  {
      MyDatabase database=new MyDatabase();

        public MyDatabase(Context context) { super(context,"login.db",null,1)}

         }

        public void onCreate(SQLiteDatabase db)
        { db.execSQL(int id);

        }
        public void onCreate(SQLiteDatabase db, int oldversion,int newversion
        { db.execSQL("DROP IF EXISTS USER" );

        }
        public String deletedata()
        {
           String item=database.deletedata();
           int i;
            i = database.deletedata("");

            return item;
        }
