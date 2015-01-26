package com.artikulpi.listviewcomplex;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    //Declarasi Array Menu dan gambar
    ListView list;
    String[] menu = {
            " About Mac",
            " WiFi",
            " Download",
            " Games",
            " Movies",
            " Camera",
            " Contact",
            " Help"
    } ;
    Integer[] imageId = {
            R.drawable.ic_mac,
            R.drawable.signal,
            R.drawable.download,
            R.drawable.games,
            R.drawable.movies,
            R.drawable.camera,
            R.drawable.contacts,
            R.drawable.ic_help
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Load main Layout
        setContentView(R.layout.activity_main);
        CustomListView adapter = new
                CustomListView(MainActivity.this, menu, imageId);
        //get Id List
        list=(ListView)findViewById(R.id.list);
        //Set adapter to list
        list.setAdapter(adapter);
        //Set ketika salah satu list di pilih(klik)
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                Toast.makeText(MainActivity.this, "Anda Memilih" + menu[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}