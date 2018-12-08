/*
Princess Hernandez
N01099524
This is an app that uses a widget called SearchView
It searches countries in a ListView
 */
package com.hernandez.princess.searchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> arrList;
    ArrayAdapter<String > adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.lv1);

        // Created an ArrayList that lists a few countries
        arrList = new ArrayList<>();
        arrList.add("Afghanistan");
        arrList.add("Albania");
        arrList.add("Belgium");
        arrList.add("Cambodia");
        arrList.add("Canada");
        arrList.add("Ethiopia");
        arrList.add("Ghana");
        arrList.add("Iceland");
        arrList.add("Romania");
        arrList.add("United States");
        arrList.add("Vietnam");

        // Adapter sets the array into a widget
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrList);
        listView.setAdapter(adapter);

        // The user is able to send a query on the SearchView
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if(arrList.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    // When query is unsearchable it makes a toast message
                    Toast.makeText(MainActivity.this, "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //    adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}