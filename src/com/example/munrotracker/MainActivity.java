package com.example.munrotracker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {
	ArrayList<String> munroes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        munroes = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(getAssets().open("mountains.csv")));

            // do reading, usually loop until end of file reading  
            String mLine = reader.readLine();
            while (mLine != null) {
               munroes.add(mLine);
               mLine = reader.readLine(); 
            }

            reader.close();
        } catch (IOException e) {
            //log the exception
        }
        System.out.println(munroes.get(1));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
