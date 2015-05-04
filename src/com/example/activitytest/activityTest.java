package com.example.activitytest;


import java.security.PublicKey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class activityTest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		Log.i(getPackageName(), getClass().getName());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.layout_1);
		
		Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(activityTest.this, "you have clicked button_1", Toast.LENGTH_LONG).show();
				Intent intent = new Intent(getPackageName()+".SECOND");
				startActivity(intent);
			}
		});
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId()) {
		case R.id.add_item:
			Toast.makeText(this, "add", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "add", Toast.LENGTH_SHORT).show();
			break;
		case R.id.exit_item:
			finish();
			break;
		default:
			Log.w("adc", "nothing clicked");
			break;
		}
		return true;
	}


}

