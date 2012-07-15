package com.visionarysoftwaresolutions.camera;

import com.visionarysoftwaresolutions.camera.interfaces.Dimension;

public class BasicDimension implements Dimension {
	private int width = 0;
	private int height = 0;
	
	public BasicDimension(int width, int height){
		setWidth(width);
		setHeight(height);
	}
	
	private void setWidth(int width){
		if(width < 0){
			throw new UnsupportedOperationException("Width cannot be less than 0");
		}
		this.width = width;
	}
	
	private void setHeight(int height){
		if(height < 0){
			throw new UnsupportedOperationException("Height cannot be less than 0");
		}
		this.height = height;
	}
	
	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}
}
