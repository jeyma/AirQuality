package com.casic.sensorhub.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.*;
import com.casic.sensorhub.R;

public class ProfileFragment extends Fragment {
	//constants
		private static final String LOG_TAG = "ProfileFragment";
		//singleton
		private static ProfileFragment singleton = null;
		//widgets
		private ImageView iv_photo;
		private ListView lv_devices;
		private Button btn_signin;
		private Button btn_signup;
		//local members
		private BaseAdapter mAdapter;
		//demo data
		private String[] devices = new String[]{"模拟设备001"};
		public static ProfileFragment getInstance(){
			if(singleton == null){
				singleton = new ProfileFragment();
				
			}
			return singleton;
		}
		
		public ProfileFragment(){
			
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			View root = inflater.inflate(R.layout.fragment_profile, container, false);
			//initialize widgets
			iv_photo =  (ImageView) root.findViewById(R.id.iv_photo);
			lv_devices = (ListView) root.findViewById(R.id.lv_devices);
			btn_signin =  (Button) root.findViewById(R.id.btn_signin);
			btn_signup = (Button) root.findViewById(R.id.btn_signup);
			//for demo purpose
			iv_photo.setImageResource(R.drawable.icon_demo_photo);
			mAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, devices);
			lv_devices.setAdapter(mAdapter);
			
			btn_signin.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
				}
			});
			
			btn_signup.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
				}
			});
			return root;
		}
		
		
}
