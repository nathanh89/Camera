package com.visionarysoftwaresolutions.camera;

import org.junit.Test;

public class DimensionTests {

	@Test(expected=UnsupportedOperationException.class)
	public void testNegativeWidth() {
		new BasicDimension(-10, 400); 
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testNegativeHeight() {
		new BasicDimension(400, -10); 
	}

}
