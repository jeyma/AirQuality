package com.casic.sensorhub.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.casic.sensorhub.R;
import com.casic.sensorhub.adaptor.DeviceAdapter;
import com.casic.sensorhub.bean.HCHCDevice;
import java.util.ArrayList;
import java.util.List;

public class DeviceListActivity extends Activity {

	private static final String LOG_TAG = "DeviceListActivity";

	//widgets
	private ListView lv_devices;
	//local members
	private BaseAdapter mAdapter;

    public void showDevice(HCHCDevice device)
    {
        //TODO LIST:显示设备详细信息
        Intent i = new Intent(DeviceListActivity.this, MainActivity.class);
        startActivity(i);
    }

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//set up title on action bar
            ActionBar actionBar = getActionBar();
            actionBar.setTitle(R.string.devicelist_title);
            setContentView(R.layout.activity_devicelist);
            initWidgets();
    }

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater  inflater =  getMenuInflater();
		inflater.inflate(R.menu.dl_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.action_add:
			Intent i = new Intent(this, ScanActivity.class);
			startActivity(i);
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	/*
	 * local methods
	 */
	private void initWidgets(){
		lv_devices = (ListView) findViewById(R.id.lv_devices);
		//TODO LIST:修改为实时扫描设备
		HCHCDevice d1 = new HCHCDevice("客厅的检测仪", "123456574", "192.168.1.101", 12314, 3233);
		HCHCDevice d2 = new HCHCDevice("卧室的检测仪", "1234574", "192.168.1.102", 12314, 3233);
		List<HCHCDevice> list = new ArrayList<HCHCDevice>();
		list.add(d1);
		list.add(d2);
		mAdapter = new DeviceAdapter(list,this);
		lv_devices.setAdapter(mAdapter);
	}
}
