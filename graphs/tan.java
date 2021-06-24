package graphs;
import javax.swing.*;  
import java.awt.*;  
import java.lang.Math;
import java.util.*;
public class tan extends Canvas
{  
	double a=0;
	public tan(double b)
	{
		a=b;
	}
    	public void paint(Graphics g)
	{
		double x=0;
		double y,h,k;
		g.drawLine(0,250,500,250);
    		g.drawLine(250,0,250,500); 
		g.translate(250, 250);
		for(int i=0;i<=4710;i++)
		{
			y=Math.tan(a*x);
			h=30*a*x;
			k=30*y;
			g.drawLine((int)h,(int)-k,(int)h,(int)-k);
			g.drawLine((int)-h,(int)k,(int)-h,(int)k);
		 	x=x+0.001;
		}
	}
}
