package com.visionarysoftwaresolutions.camera;

import com.visionarysoftwaresolutions.camera.interfaces.Dimension;
import com.visionarysoftwaresolutions.camera.interfaces.Viewfinder;

public class BasicViewfinder implements Viewfinder {
	private Dimension dimensions;
	
	public BasicViewfinder(Dimension size){
		setDimensions(size);
	}
	
	public BasicViewfinder(int width, int height){
		setDimensions(new BasicDimension(width, height));
	}
	
	public void setDimensions(Dimension dim){
		this.dimensions = dim;
	}
	
	@Override
	public Dimension getDimensions() {
		return this.dimensions;
	}

	@Override
	public byte[] getContents() {
		byte[] results = new byte[dimensions.getWidth()*dimensions.getHeight()];
		for(int i = 0; i < dimensions.getWidth(); i++){
			for(int j = 0; j < dimensions.getHeight(); j++){
				results = collect();
			}
		}
		return results;
	}

	// TODO Could be abstract and subclassed to make BasicViewFinder a Template Method. 
	// This part would do Native I/O interface 
	private byte[] collect() {
		return new byte[dimensions.getWidth()*dimensions.getHeight()] ;
	}
}
