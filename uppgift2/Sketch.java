package com.arcada.uppgift2;

import processing.core.*;

public class Sketch extends PApplet {
 
	Pendulum p;
	Pendulum p2;
	 
	public void setup() {
	  size(1000,1000);
	  p = new Pendulum(new PVector(width/2,10),125);
	  p2 = new Pendulum(new PVector(width/2,10),125);
      p2.angle = processing.core.PConstants.PI/-4;
	}
	 
	public void draw() {
	  background(255);
	  p.go();
	  p2.go();
	  
	    p.location.add(p.origin);
	    stroke(0);
	    line(p.origin.x,p.origin.y,p.location.x,p.location.y);
	    fill(175);
	    ellipse(p.location.x,p.location.y,16,16);
	    
		    p2.location.add(p2.origin);
		    stroke(0);
		    line(p2.origin.x,p2.origin.y,p2.location.x,p2.location.y);
		    fill(175);
		    ellipse(p2.location.x,p2.location.y,16,16);
	}
}
