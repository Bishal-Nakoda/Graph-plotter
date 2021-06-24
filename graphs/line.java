package graphs;
import javax.swing.*;  
import java.awt.*;  
import java.lang.Math;
import java.util.*;
public class line extends Canvas
{  
	double m=0,c=0;
	public line(double a,double b)
	{
		m=a;
		c=b;
	}
    public void paint(Graphics g)
	{  	
    	g.drawLine(0,250,500,250);
		g.drawLine(250,0,250,500); 
    	g.translate(250, 250);
    	double x1 = -250;
   		double x2 = 250;
  		double y1 = m*x1+c;
   		double y2 = m*x2+c;
   		g.drawLine((int)x1, (int)-y1, (int)x2, (int)-y2);
	}
}