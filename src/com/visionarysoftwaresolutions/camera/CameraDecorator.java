package com.visionarysoftwaresolutions.camera;

import com.visionarysoftwaresolutions.camera.interfaces.Camera;

public class CameraDecorator implements Camera {
	private Camera camera;
	
	public CameraDecorator(Camera cam){
		camera = cam;
	}

	@Override
	public byte[] capture() {
		return camera.capture();
	}
}
