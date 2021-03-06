package com.example.week8tutov2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar; //use this

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Toolbar myChildToolbar = (Toolbar) findViewById(R.id.TBChild);
        setSupportActionBar(myChildToolbar);

        //get a support actionbar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        //enable the up button
        ab.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
            case R.id.action_settings:
                //user chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_favorite:
                //user chose the "Favorite" action, mark the current item
                //as a favorite
                return true;

            default:
                //if we got here, the user's action not recognized
                //invoke the superclass to handle it
                return super.onOptionsItemSelected(item);
        }
    }
}