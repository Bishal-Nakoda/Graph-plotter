package graphs;
import javax.swing.*;  
import java.awt.*;  
import java.lang.Math;
import java.util.*;
public class loga extends Canvas
{  
	double a=10;
	public loga(double b)
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
		for(int i=0;i<=8333;i++)
		{
			y=Math.log(x)/Math.log(a);
			h=30*x;
			k=30*y;
			g.drawLine((int)h,(int)-k,(int)h,(int)-k);
			x=x+0.001;
		}
	}
}