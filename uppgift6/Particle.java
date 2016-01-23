package com.arcada.uppgift6;

import processing.core.PVector;
 
public class Particle {
  PVector location;
  PVector velocity;
  PVector acceleration;
  float lifespan;
 
  Particle(PVector l) {

    acceleration = new PVector(0,(float) 0.05);
    location = l.get();
    lifespan = (float) 255.0;
  }
 

  void run() {
    update();
  }
 
  void update() {
    velocity.add(acceleration);
    location.add(velocity);
    lifespan -= 2.0;
  }
 


  boolean isDead() {
    if (lifespan < 0.0) {
      return true;
    } else {
      return false;
    }
  }
}

