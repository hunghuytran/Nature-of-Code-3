package com.arcada.uppgift1;

import processing.core.*;

public class Sketch extends PApplet {
 
	Pendulum p;
	 
	public void setup() {
	  size(640,360);


	  p = new Pendulum(new PVector(width/2,10),125);
	}
	 
	public void draw() {
	  background(255);
	  p.go();
	    p.location.add(p.origin);
	    stroke(0);
	    line(p.origin.x,p.origin.y,p.location.x,p.location.y);
	    fill(175);
	    ellipse(p.location.x,p.location.y,16,16);
	}
}
