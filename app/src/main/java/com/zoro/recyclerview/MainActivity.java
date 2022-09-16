             package com.zoro.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

             public class MainActivity extends AppCompatActivity {
    private ArrayList<String> CountryList=new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        CountryList.add("Страны мира");
        CountryList.add("Russia");
        CountryList.add("Great Britain");
        CountryList.add("Germany ");
        CountryList.add("The USA");
        CountryList.add("France");
        CountryList.add("Japan ");
        CountryList.add("Spain ");
        CountryList.add("Italy ");
        CountryList.add("Brazil  ");
        CountryList.add("Australia  ");
        CountryList.add("Argentina ");
        CountryList.add("China ");
        CountryList.add("Colombia ");
        CountryList.add("Korea ");
        CountryList.add("Conada ");
        CountryList.add("Cuba ");
        CountryList.add("Egypt ");
        CountryAdapter adapter1 = new CountryAdapter(CountryList);
        recyclerView.setAdapter(adapter1);
    }
}