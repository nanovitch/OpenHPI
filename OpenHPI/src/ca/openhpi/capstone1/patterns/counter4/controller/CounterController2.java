package ca.openhpi.capstone1.patterns.counter4.controller;

import ca.openhpi.capstone1.patterns.counter4.model.Counter;

public class CounterController2 implements Controller{

	Counter counter;
	
	public CounterController2(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void handleEvent() {
		counter.updateCount(30);
	}
}
