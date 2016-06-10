package com.example.demo;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		Button btnRed = (Button) findViewById(R.id.btnRed);
		btnRed.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TextView txtView = (TextView) findViewById(R.id.txtView);
				txtView.setTextColor(Color.parseColor("#ff0000"));
				txtView.setText("Red");
			}
		});
		
		Button btnGreen = (Button)findViewById(R.id.btnGreen);
		btnGreen.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TextView txtView = (TextView) findViewById(R.id.txtView);
				txtView.setTextColor(Color.parseColor("#00ff00"));
				txtView.setText("Green");
			}
		});
		
		Button btnBlue = (Button)findViewById(R.id.btnBlue);
		btnBlue.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TextView txtView = (TextView) findViewById(R.id.txtView);
				txtView.setText("Blue");
				txtView.setTextColor(Color.parseColor("#0000ff"));
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
