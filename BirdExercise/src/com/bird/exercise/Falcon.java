package com.bird.exercise;

import interfaces.EggLayingCreature;
import interfaces.FlyingCreature;

public class Falcon implements EggLayingCreature, FlyingCreature {
    private String currentLocation;
    private int numberOfEggs;

    public Falcon(int initialEggCount) {
        this.setNumberOfEggs(initialEggCount);
    }

    @Override
	public void fly() {
		// TODO Auto-generated method stub
    	this.setCurrentLocation("soaring above the clouds");
		
	}

	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		this.setNumberOfEggs(getNumberOfEggs() + 1);
	}
    
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
    this.currentLocation = currentLocation;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }

}