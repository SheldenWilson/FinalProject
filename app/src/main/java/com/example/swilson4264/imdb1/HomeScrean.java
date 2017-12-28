package com.example.swilson4264.imdb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class HomeScrean extends AppCompatActivity {

    private User user;
    private AppDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screan);
        database = AppDatabase.getDatabase(getApplicationContext());

        updateFirstUserData();
}
    private void updateFirstUserData() {
        List<User> user = database.userDao().getAllUser();
        TextView textView = findViewById(R.id.Label);
        if (user.size() > 1) {
            textView.setText("Email: " + user.get(1).email + " Password: " + user.get(1).password);
        }
    }
    public void movieScreen(View view){
        Intent intent = new Intent(this, Movies.class);
        startActivity(intent);
    }

    public void homeScreen(View hV) {
        Intent homeIntent = new Intent(this, HomeScrean.class);
        startActivity(homeIntent);
    }

    public void tvShowScreen(View tV) {
        Intent intent = new Intent(this, TvShows.class);
        startActivity(intent);
    }


}
