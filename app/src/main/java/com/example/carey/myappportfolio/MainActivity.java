package com.example.carey.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    protected CharSequence spotify_toast = "Launch Spotify Streamer!";
    protected CharSequence scores_toast = "Launch Scores App!";
    protected CharSequence library_toast = "Launch Library App!";
    protected CharSequence build_it_bigger_toast = "Launch Build it Bigger!";
    protected CharSequence xyz_toast = "Launch XYZ App!";
    protected CharSequence capstone_toast = "Launch Capstone App!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /** Called when Spotify Streamer button is pressed */
    public void launchSpotifyStreamer(View view) {
        // Do a toast
        Toast toast = Toast.makeText(this, spotify_toast,  Toast.LENGTH_SHORT);
        toast.show();
    }

    /** Called when Scores button is presed */
    public void launchScoresApp(View view) {
        // Do a toast
        Toast toast = Toast.makeText(this, scores_toast,  Toast.LENGTH_SHORT);
        toast.show();
    }

    /** Called when Library button is pressed */
    public void launchLibraryApp(View view) {
        // Do a toast
        Toast toast = Toast.makeText(this, library_toast,  Toast.LENGTH_SHORT);
        toast.show();
    }

    /** Called when Build it Bigger button is pressed */
    public void launchBuildItBigger(View view) {
        // Do a toast
        Toast toast = Toast.makeText(this, build_it_bigger_toast,  Toast.LENGTH_SHORT);
        toast.show();
    }

    /** Called when XYZ Reader button is pressed */
    public void launchXyzReader(View view) {
        // Do a toast
        Toast toast = Toast.makeText(this, xyz_toast,  Toast.LENGTH_SHORT);
        toast.show();
    }

    /** Called when Capstone button is pressed */
    public void launchCapstone(View view) {
        // Do a toast
        Toast toast = Toast.makeText(this, capstone_toast,  Toast.LENGTH_SHORT);
        toast.show();
    }
}
