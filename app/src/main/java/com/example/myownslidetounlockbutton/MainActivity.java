package com.example.myownslidetounlockbutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     // Retrieve layout elements
     		UnlockBar unlock = (UnlockBar) findViewById(R.id.unlock);
     		
     		// Attach listener
     		unlock.setOnUnlockListener(new com.example.myownslidetounlockbutton.UnlockBar.OnUnlockListener() {
     			@Override
     			public void onUnlock()
     			{
     				Toast.makeText(getBaseContext(), "You've successfully unlocked it !", Toast.LENGTH_LONG).show();
     			}
     		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
