package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}
	
	public void loops1()
	{
		stroke(255);
		int numLines = (int)(30 * (mouseX / (float)width));
		float gap = width/(float)numLines; //dividing integer by an integer so need to cast numLines
		
		for(int i=0; i<=numLines; i++)
		{
			float x = i * gap;
			line(x, 0, width - x, height);
			line(0, x, width, height - x);
		}
	}
	
	public void loops2()
	{
		int numCircles = (int)(20 * (mouseX / (float)width));
		int numCircles1 = (int)(20 * (mouseY / (float)height));
		
		float w = width/(float) numCircles;
		float h = height/(float) numCircles1;
		
		float radius = w/2.0f; //making 2 a floating point constant
		colorMode(HSB);
		float cGap = 255 / (float)(numCircles * numCircles);
		noStroke();
		
		for(int j=0; j<numCircles1; j++)
		{
			for(int i=0; i<numCircles; i++)
			{
				float x = radius + (i * w);
				float y = radius + (j * w);
				fill(cGap * i * j, 255, 255);
				ellipse(x, y, w, w);
			}
		}
	}
	
	public void loops3()
	{
		float gap = width * 0.1f;
		float halfGap = gap / 2.0f;
		colorMode(RGB);
		stroke(0, 255, 0);
		textAlign(CENTER, CENTER);
		for(int i=-5; i<=5; i++)
		{
			float x = map(i, -5, 5, gap, width - gap);
			line(x, gap, x, height - gap);
			line(gap, x, width - gap, x);
			fill(255);
			text(i, x, halfGap);
			text(i, halfGap, x);
		}
	}

	
	public void keyPressed()
	{

	}	


	public void draw()
	{	
		background(0);
		
		// for(int y = 10; y <= 40; y += 10)
		// {
			// line(200, y, 100, y);
		// }
		
		//loops1();
		loops2();
		//loops3();
	}
}
