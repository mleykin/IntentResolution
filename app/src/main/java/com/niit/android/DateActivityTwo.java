package com.niit.android;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DateActivityTwo extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.date);

	    SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy");
	    String date = sdf.format(new Date(System.currentTimeMillis()));

	    TextView tvDate = (TextView) findViewById(R.id.tvDate);
	    tvDate.setText(date);
	  }
}
