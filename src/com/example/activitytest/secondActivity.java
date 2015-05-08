package com.example.activitytest;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class secondActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.layout_2);
		getClass().getSimpleName();
		Button button_2 = (Button)findViewById(R.id.button_dialout);
		button_2.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_DIAL);
				EditText input_text = (EditText)findViewById(R.id.phone_number);
				activityTest.phoneNumber = input_text.getText().toString();
				Toast.makeText(secondActivity.this, "saved", Toast.LENGTH_SHORT).show();
				finish();
//				intent.setData(Uri.parse("tel:"+s));
//				startActivity(intent);
			}
		});
	}
	
	
}
