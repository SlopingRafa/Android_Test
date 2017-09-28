package com.example.secomp.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvlista;
    List<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strings = new ArrayList<>();
        strings.add("Teste ");
        strings.add("Hello");
        strings.add("World");
        strings.add("Gw won, slacking gets results");

        lvlista = (ListView) findViewById(R.id.lvLista);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);

        lvlista.setAdapter(adapter);

    }
}
