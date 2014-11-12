package com.verphen.ridding;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener{
	
	private Button loginButton;
	private ImageButton imageButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		loginButton = (Button)findViewById(R.id.id_button_login);
		loginButton.setOnClickListener(listener);
		
		imageButton = (ImageButton)findViewById(R.id.id_imageButton_test);
		imageButton.setOnClickListener(this);
	}
	
	OnClickListener listener = new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Log.i("info", "-------test login button");
		}
	};

	@Override
	public void onClick(View arg0) {
		Log.i("info", "-------test image button");
	}
}
