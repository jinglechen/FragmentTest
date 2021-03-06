package com.jing.fragmenttest;
import com.jing.newsapp.*;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RightFragment extends Fragment{
	
	public static final String TAG="RightFragment";
	
	@Override
	public void onAttach(Activity activity){
		super.onAttach(activity);
		Log.d(TAG, "onAttach");
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.d(TAG,"onCreate");
		
	}
	public View onCreateView(LayoutInflater inflater,ViewGroup container,
			Bundle savedInstanceState){
		Log.d(TAG, "onCreateView");
		View view=inflater.inflate(R.layout.right_fragment, container, false);
		return view;
		
	}
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG, "onActivityCreated");
	}
	
	@Override
	public void onStart(){
		super.onStart();
		Log.d(TAG, "onStart");	
	}
	public void onResume(){
		super.onResume();
		Log.d(TAG,"onResume");
	}
	public void onPause(){
		super.onPause();
		Log.d(TAG,"onPause");
	}
	public void onStop(){
		super.onStop();
		Log.d(TAG,"onStop");
	}
	public void onDestroyView(){
		super.onDestroyView();
		Log.d(TAG,"onDestroyView");
	}
	public void onDestroy(){
		super.onDestroy();
		Log.d(TAG,"onDestroy");
	}
	public void onDetach(){
		super.onDetach();
		Log.d(TAG,"onDeTach");
	}

}
