package com.example.chetan.sunshine2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public static class PlaceholderFragment extends Fragment{
        public PlaceholderFragment(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater,ViewGroup container,
                                 Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.fragment_main,container,false);
            String[] forecastArray = {
                    "Today - Sunny - 8863",
                    "Tomorrow - Foggy - 70/40",
                    "Weds - Cloudy - 42/63",
                    "Thurs - Asteroids - 75/65",
                    "Fri - Heavy Rains - 65/56",
                    "Sat - Help Trapped In WeatherStation - 60/51",
                    "Sun - Sunny - 80/68"
            };
            List<String> weekForecast = new ArrayList<String>(
                    Array.asList(forecastArray)
            );

            mForecastAdapter = new ArrayAdapter<String>(
              getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast
            );
            return rootView;

        }

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
