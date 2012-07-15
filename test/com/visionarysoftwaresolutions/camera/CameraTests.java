package com.visionarysoftwaresolutions.camera;

import static org.junit.Assert.*;

import org.junit.Test;

import com.visionarysoftwaresolutions.camera.interfaces.Camera;

public class CameraTests {

	@Test
	public void testCaptureAPicture() {
		Camera toTest = CameraFactory.create();
		byte[] result = toTest.capture();
		assertNotNull(result);
	}
}
