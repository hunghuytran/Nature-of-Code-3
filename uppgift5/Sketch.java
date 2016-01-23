package com.arcada.uppgift5;
import processing.core.*;

public class Sketch extends PApplet {

	Particle p;
	 
	public void setup() {
	  size(640,360);
	  p = new Particle(new PVector(width/2,10));
	  p.velocity = new PVector(random(-1,1),random(-2,0));
	}
	 
	public void draw() {
	  background(255);


	  p.run();
	  display();
	  if (p.isDead()) {
	    println("Particle dead!");
	  }
	}
	 public void display() {
		    stroke(0,p.lifespan);
		    fill(0,p.lifespan);
		    ellipse(p.location.x,p.location.y,8,8);
		  }
}