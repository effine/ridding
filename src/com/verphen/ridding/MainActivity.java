package com.verphen.ridding;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity implements OnClickListener{
	
	private Button loginButton;
	private ImageButton imageButton;
	private AutoCompleteTextView actv;
	private MultiAutoCompleteTextView mactv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frame);
		
		loginButton = (Button)findViewById(R.id.id_button_login);
		loginButton.setOnClickListener(listener);
		
		imageButton = (ImageButton)findViewById(R.id.id_imageButton_test);
		imageButton.setOnClickListener(this);
		
		/*
		 * 1、初始化控件
		 * 2、需要适配器
		 * 3、初始化数据源
		 * 4、将adapter和autoCompleteTextView绑定
		 */
		actv = (AutoCompleteTextView)findViewById(R.id.id_autoCompleteTextView);
		String[] arr = new String[]{"chuan","change","chanl","china","share"};
		ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
		actv.setAdapter(adapter);
		
		mactv = (MultiAutoCompleteTextView)findViewById(R.id.id_multiAutoCompleteTextView);
		mactv.setAdapter(adapter);
		mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
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
