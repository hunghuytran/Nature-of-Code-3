package com.arcada.uppgift4;
import processing.core.*;

public class Sketch extends PApplet {

Wave w;
Wave w2;
Wave w3;
 
 
public void setup() {
  size(1500,1000);
  w = new Wave((float) 0);
  w2 = new Wave((float) 4);
  w3 = new Wave((float) -4);
}
 
public void draw() {
  background(255);
  for (int x = 0; x <= width; x += 24) {
	    float y = map(sin(w.angle),-1,1,0,height);
	    stroke(0);
	    fill(0,50);
	    ellipse(x, y,48,48);
	    w.go();
	  }
  for (int x = 0; x <= width; x += 24) {
	    float y = map(sin(w2.angle),-1,1,0,height/3);
	    stroke(0);
	    fill(0,50);
	    ellipse(x, y,48,48);
	    w2.go();
	  }
  for (int x = 0; x <= width; x += 24) {
	    float y = map(sin(w3.angle),-1,1,0, height/2);
	    stroke(0);
	    fill(0,50);
	    ellipse(x, y,48,48);
	    w3.go();
	  }
	  }
}


