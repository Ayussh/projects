package com.zaika.ayussh;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class Italian extends ListActivity{
	 
	String classes[] = {"Hundreds_Heritage", "GRT_Regency", "Tom's_Diner"};


@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String italian = classes[position];
		try {
		Class<?> ourClass = Class.forName("com.zaika.ayussh."+italian);
		Intent ourIntent = new Intent(Italian.this, ourClass );
		startActivity(ourIntent);
	}catch (ClassNotFoundException e){
		e.printStackTrace(); 
	}
}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Italian.this, android.R.layout.simple_list_item_1  , classes));
	}

}