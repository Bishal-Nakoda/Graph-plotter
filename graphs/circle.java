package graphs;
import javax.swing.*;  
import java.awt.*;  
import java.lang.Math;
import java.util.*;
public class circle extends Canvas
{  
	double r=0,x=0,y=0;
	public circle(double a,double b,double c)
	{
		r=a;
		x=b;
		y=c;
	}
    	public void paint(Graphics g)
	{  	

		g.drawLine(0,250,500,250);
    		g.drawLine(250,0,250,500); 
		g.translate(250, 250);
		g.drawOval((int)(x-r),(int)-(y+r),(int)(2*r),(int)(2*r));
	}
}