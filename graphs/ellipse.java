package graphs;
import javax.swing.*;  
import java.awt.*;  
import java.lang.Math;
import java.util.*;
public class ellipse extends Canvas
{  
	double h=0,w=0,x=0,y=0;
	public ellipse(double a,double b,double c,double d)
	{
		h=a;
		w=b;
		x=c;
		y=d;
	}
    	public void paint(Graphics g)
	{  	

		g.drawLine(0,250,500,250);
    	g.drawLine(250,0,250,500); 
		g.translate(250, 250);
		g.drawOval((int)(x-w),(int)-(y+h),(int)(2*h),(int)(2*w));
	}
}