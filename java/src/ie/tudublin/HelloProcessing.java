package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}
			

	/*
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
	*/

	int x = 0; // 4 bytes
	
	/*
	public void draw()
	{	
		background(255); //background colour with one parameter is a gray scale value(between white and black)
		stroke(0, 0, 255); // changes outlines of shapes
		line(10, 10, 100, 100); // x1, y1, x2, y2
		point(50, 50); // x, y
		fill(0, 255, 255);
		noStroke();
		ellipse(100, 200, 100, 50); // cx, cy, w, h
		fill(255, 0, 255);
		rect(70, 150, 90, 10); //tlx, tly, w, h
		triangle(150, 90, 200, 100, 100, 250); // vertices
		//background(0);
		//noStroke();
		//fill(255);
		//ellipse(x, mouseY, 50, 50);		
		//x ++;
	}
	*/
	
	public void draw()
	{
		background(255, 0, 0);
		noStroke();
		fill(255, 255, 0);
		ellipse(250, 300, 400, 400);
		fill(51, 204, 204);
		triangle(250, 50, 50, 450, 450, 450);
		fill(255);
		ellipse(250, 250, 200, 85);
		fill(0);
		ellipse(250, 250, 65, 65);
		
	}
}
