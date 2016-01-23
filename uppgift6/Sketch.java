package com.arcada.uppgift6;
import processing.core.*;

public class Sketch extends PApplet {

	Particle p;
	ReverseParticle r;
	 
	public void setup() {
	  size(1000,1000);
	  p = new Particle(new PVector(width/2,10));
	  r = new ReverseParticle(new PVector(width/2,500));
	  p.velocity = new PVector(random(-1,1),random(-2,0));
	  r.velocity = new PVector(random(-1,1),random(-2,0));
	}
	 
	public void draw() {
	  background(255);


	  p.run();
	  r.run();
	  display();
	  if (p.isDead()) {
	    println("Particle dead!");
	  }
	  if (r.isDead()) {
		    println("Reverse particle dead!");
		  }
	}
	 public void display() {
		    stroke(0,p.lifespan);
		    fill(0,p.lifespan);
		    ellipse(p.location.x,p.location.y,8,8);
		    stroke(0,r.lifespan);
		    fill(0,r.lifespan);
		    ellipse(r.location.x,r.location.y,8,8);
		  }
}