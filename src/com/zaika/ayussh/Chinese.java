package com.zaika.ayussh;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class Chinese extends ListActivity{
	 
	String classes[] = {"GRT_Residency", "Food_Court", "China_Valley", "Indian_kitchen"};


@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String indian = classes[position];
		try {
		Class<?> ourClass = Class.forName("com.zaika.ayussh."+indian);
		Intent ourIntent = new Intent(Chinese.this, ourClass );
		startActivity(ourIntent);
	}catch (ClassNotFoundException e){
		e.printStackTrace(); 
	}
}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Chinese.this, android.R.layout.simple_list_item_1  , classes));
	  	   
	}

}