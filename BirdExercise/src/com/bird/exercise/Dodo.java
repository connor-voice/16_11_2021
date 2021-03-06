package com.bird.exercise;

import interfaces.EggLayingCreature;
import interfaces.ExtinctCreature;

public class Dodo implements EggLayingCreature, ExtinctCreature {
    private String currentLocation;
    private int numberOfEggs;

    public Dodo(int initialEggCount) {
        this.setNumberOfEggs(initialEggCount);
    }

    public void layEggs() {
        this.setNumberOfEggs(getNumberOfEggs() + 1);
    }

    @Override
	public void goExtinct() {
		// TODO Auto-generated method stub
		this.setCurrentLocation("in a museum");
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