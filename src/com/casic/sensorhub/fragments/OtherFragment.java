package com.casic.sensorhub.fragments;

import android.app.Fragment;

public class OtherFragment extends Fragment {

	
	private static OtherFragment singleton = null;
	
	public static OtherFragment getInstance(){
		if(singleton == null){
			singleton = new OtherFragment();
		}
		
		return singleton;
	}
	
	public OtherFragment(){
		
	}
}
