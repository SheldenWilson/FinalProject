package com.example.swilson4264.imdb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Movies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
    }

    public void movieScreen(View view){
        Intent intent = new Intent(this, Movies.class);
        startActivity(intent);
    }

    public void homeScreen(View hV) {
        Intent intent = new Intent(this, HomeScrean.class);
        startActivity(intent);
    }

    public void tvShowScreen(View tV) {
        Intent intent = new Intent(this, TvShows.class);
        startActivity(intent);
    }

    public void itPageScreen(View ItV) {
        Intent intent = new Intent(this, movieIT.class);
        startActivity(intent);
    }

    public void addMovieScreen(View aMV){
        Intent intent = new Intent(this, AddMovie.class);
        startActivity(intent);
    }
}
