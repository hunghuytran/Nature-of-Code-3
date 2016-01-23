package com.arcada.uppgift3;
import processing.core.*;

public class Sketch extends PApplet {

float startAngle = 0;
float angleVel = (float) 0.1;
 
public void setup() {
  size(400,200);
}
 
public void draw() {
  background(255);
 

startAngle += 0.02;

float angle = startAngle;

 
  for (int x = 0; x <= width; x += 24) {
    float y = map(sin(angle),-1,1,0,height);
    stroke(0);
    fill(0,50);
    ellipse(x,y,48,48);
    angle += angleVel;
  }
}
}

