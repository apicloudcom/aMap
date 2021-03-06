//
//UZModule
//
//Modified by magic 16/2/23.
//Copyright (c) 2016年 APICloud. All rights reserved.
//
package com.apicloud.devlop.uzAMap;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.amap.api.maps.MapView;
import com.amap.api.maps.TextureMapView;

@SuppressLint("ClickableViewAccessibility")
public class UzMapView extends TextureMapView {

	public UzMapView(Context context) {
		super(context);
		//setLayerType(View.LAYER_TYPE_HARDWARE, null);
	}
	
	public UzMapView(Context context, AttributeSet attrs){
		super(context, attrs);
	}

	
	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		try {
			return super.onTouchEvent(ev);
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		try {
			requestParentDisallowInterceptTouchEvent(true);
			return super.onInterceptTouchEvent(ev);
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	private void requestParentDisallowInterceptTouchEvent(
			boolean disallowIntercept) {
		final ViewParent parent = getParent();
		if (parent != null) {
			parent.requestDisallowInterceptTouchEvent(disallowIntercept);
		}
	}
}
