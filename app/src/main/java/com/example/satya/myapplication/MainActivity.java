package com.example.satya.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//Array of options --> ArrayAdapter --> ListView
//List view: (views: da_item.xml)

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateListView();
    }

    private void populateListView() {
        //crete list of items
        String[] myItems = {"Blue","Green","Purple","Red"};
        //Built adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,                 //context for activity
                R.layout.da_item,     //layout to use(create)
                myItems);             //items to be displayed

        //configure the list view

        ListView list = (ListView) findViewById(R.id.listViewMain);
        list.setAdapter(adapter);
    }
}
