package com.arcada.uppgift4;

import processing.core.PVector;


public class Wave {
	float startAngle;
	float angleVel;
	float angle;
	
	Wave(float switchleVel){
		angleVel = (float) 0.1;
		startAngle = switchleVel;
		angle = startAngle;
	}
	
	void method(){
		go();
		
	}

	void go() {
		 angle += angleVel;
	}
}