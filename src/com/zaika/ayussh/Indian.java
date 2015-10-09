package com.zaika.ayussh;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class Indian extends ListActivity{
	 
	String classes[] = {"Hundreds_Heritage", "Olive_Kitchen", "Tara_Maa", "Grt_Regency", "Bihari_Dhaba", "SJT_Canteen", "GDN_Canteen"};


@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String indian = classes[position];
		try {
		Class<?> ourClass = Class.forName("com.zaika.ayussh."+indian);
		Intent ourIntent = new Intent(Indian.this, ourClass );
		startActivity(ourIntent);
	}catch (ClassNotFoundException e){
		e.printStackTrace(); 
	}
}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Indian.this, android.R.layout.simple_list_item_1  , classes));
	  	   
	}

}