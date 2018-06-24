package com.example.administrator.contentprovidershare;

import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String newId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button querydata=(Button)findViewById(R.id.query);
        querydata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
                Uri uri=Uri.parse("content://com.example.administrator.contentprovidershare.provider/contacts");
                Cursor cursor=getContentResolver().query(uri,null,null,null,null);
                if(cursor!=null){
                    while(cursor.moveToNext()){
                        String name=cursor.getString(cursor.getColumnIndex("name"));
                        String number=cursor.getString(cursor.getColumnIndex("number"));
                        String sex=cursor.getString(cursor.getColumnIndex("sex"));
                        Log.d("MainActivity","contacts name is "+name);
                        Log.d("MainActivity","contacts number is "+number);
                        Log.d("MainActivity","contacts sex is "+sex);
                    }
                    cursor.close();
                }
            }
        });
    }
}
