package com.arcada.uppgift1;

import com.arcada.blank.Sketch;

import processing.core.PVector;


public class Pendulum  {

  public PVector location;    // Location of bob
  public PVector origin;      // Location of arm origin
  public float r;             // Length of arm
  public float angle;         // Pendulum arm angle
  public float aVelocity;     // Angle velocity
  public float aAcceleration; // Angle acceleration
  public float damping;       // Arbitrary damping amount

 
  public Pendulum(PVector origin_, float r_) {
    origin = origin_.get();
    location = new PVector();
    r = r_;
	angle = processing.core.PConstants.PI/4;
 
    aVelocity = (float) 0.0;
    aAcceleration = (float) 0.0;

    damping = (float) 0.995;
  }
 
  public void go() {
    update();
    display();
  }
 
public  void update() {
    float gravity = (float) 0.4;

    aAcceleration = (float) ((-1 * gravity / r) * Math.sin(angle));
 

    aVelocity += aAcceleration;
    angle += aVelocity;
 

    aVelocity *= damping;
  }
public void display() {
	  location.set(r*(float)Math.sin(angle),r*(float)Math.cos(angle),0);
  }
}


