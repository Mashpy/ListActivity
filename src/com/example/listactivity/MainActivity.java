package com.example.listactivity;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends ActionBarActivity {
	
	 String[] countryArray = {"India", "Pakistan", "USA", "UK"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayAdapter adapter = new ArrayAdapter<String>(this,
				R.layout.simplerow, countryArray);
				ListView listView = (ListView) findViewById(R.id.mainListView);
				listView.setAdapter(adapter); 
				
				listView.setOnItemClickListener(new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> adapterView, View view, int position, long offset) {		
					Intent intent = new Intent(getApplicationContext(), NextActivity.class);
					intent.putExtra("New_Topic", "abc");
					startActivity(intent); 
					}
				});
	}
	
	
	   /** Called when the user clicks the Send button */
    public void openNewActivity(View view) {
        // Do something in response to button
    	 Intent intent = new Intent(this, NextActivity.class);
    	 startActivity(intent);
    	 
    	
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
