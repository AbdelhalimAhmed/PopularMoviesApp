package com.example.abdelhalim.popularmoviesapp;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView textView1 = (TextView) findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById(R.id.filmDate);
        TextView textView3 = (TextView) findViewById(R.id.filmRate);
        TextView textView4 = (TextView) findViewById(R.id.tvOverview);

        ImageView imageView = (ImageView) findViewById(R.id.poster);




        //Intent in1 = getIntent();
        String p = (String) getIntent().getExtras().get("poster");
        String j =(String) getIntent().getExtras().get("title");
        String jj =(String) getIntent().getExtras().get("date");
        Double jjj =(Double) getIntent().getExtras().get("Vote");
        String over = (String) getIntent().getExtras().get("overview");

        String s = jjj.toString();

        textView1.setText(j);
        textView2.setText(jj);
        textView3.setText(s);
        textView4.setText(over);

        Picasso.with(this)
                .load(p)
                .into(imageView);



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.details, menu);
        return true;
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