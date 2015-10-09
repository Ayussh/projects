package com.zaika.ayussh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash_scr extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread n=new Thread (){
			public void run()
			{
				try{
			
				sleep(5000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			finally
			{
				Intent x=new Intent("com.zaika.ayussh.MAINACTIVITY");
				startActivity(x);
			}
				}
		};
		n.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	

}
