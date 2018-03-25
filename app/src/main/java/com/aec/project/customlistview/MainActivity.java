package com.aec.project.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.movies_list);
        final ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie(R.drawable.cover, "After Earth" , "Kolkata","Rs 1500/-"));
        moviesList.add(new Movie(R.drawable.cover, "Baby Driver" , "Asansol Durgapur","Rs 1500/-"));
        moviesList.add(new Movie(R.drawable.cover, "Deadpool" , "Kolkata","Rs 1500/-"));
        moviesList.add(new Movie(R.drawable.cover, "Divergent" , "Jaipur","Rs 1500/-"));
        moviesList.add(new Movie(R.drawable.cover, "Fight Club" , "West Bengal","Rs 1500/-"));


        mAdapter = new MovieAdapter(this,moviesList);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, moviesList.get(i).getmName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),HotelDetails.class);
                startActivity(intent);
            }
        });

    }
}