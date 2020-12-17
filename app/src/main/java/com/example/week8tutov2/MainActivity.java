package com.example.week8tutov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar; //use this
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.TB);
        setSupportActionBar(myToolbar);

        //button to next activity
        Button btnchild = (Button) findViewById(R.id.btnchild);
        Intent childintent = new Intent(this, ChildActivity.class);
        btnchild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(childintent);
            }
        });
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