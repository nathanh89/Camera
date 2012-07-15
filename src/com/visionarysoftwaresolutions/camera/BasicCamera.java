package com.visionarysoftwaresolutions.camera;

import com.visionarysoftwaresolutions.camera.interfaces.Camera;
import com.visionarysoftwaresolutions.camera.interfaces.Viewfinder;

public class BasicCamera implements Camera {
	Viewfinder view;
	
	public BasicCamera(){
		setViewfinder(new BasicViewfinder(10,10));
	}
	
	public BasicCamera(Viewfinder v){
		setViewfinder(v);
	}
	
	private void setViewfinder(Viewfinder v) {
		view = v;
	}

	@Override
	public byte[] capture() {
		return view.getContents();
	}
}
