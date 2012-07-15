package com.visionarysoftwaresolutions.camera;

import com.visionarysoftwaresolutions.camera.interfaces.Camera;

public class CameraFactory {

	public static Camera create() {
		return new BasicCamera();
	}

}
