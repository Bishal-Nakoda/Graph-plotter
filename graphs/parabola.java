package graphs;
import javax.swing.*;  
import java.awt.*;  
import java.lang.Math;
import java.util.*;
public class parabola extends Canvas
{  
	double a=0,h=0,k=0,m=0;
	public parabola(double r,double b,double c,double d)
	{
		a=r;
		h=b;
		k=c;
		m=d;
	}	 
    	public void paint(Graphics g)
	{  	
		g.drawLine(0,250,500,250);
    		g.drawLine(250,0,250,500); 
		g.translate(250, 250);
		if(m==1)
		{	
			double x=0;
			double y;
			for(int i=0;i<=2500;i++)
			{
		 		y=Math.sqrt(4*a*(x-h))+k;
		 		g.drawLine((int)(x),(int)-y,(int)(x),(int)-y);
				g.drawLine((int)(x),(int)(y-2*k),(int)(x),(int)(y-2*k));
				x=x+0.1;
			}
		}
		else if(m==2)
		{
			double x=0;
			double y;
			for(int i=0;i<=2500;i++)
			{
			 	y=Math.sqrt(4*a*(x-h))+k;
		 		g.drawLine((int)-(x),(int)-y,(int)-(x),(int)-y);
				g.drawLine((int)-(x),(int)(y-2*k),(int)-(x),(int)(y-2*k));
				x=x+0.1;
			}
		}
		else if(m==3)
		{
			double x;
			double y=0;
			for(int i=0;i<=2500;i++)
			{
		 		x=Math.sqrt(4*a*(y-k))+h;
		 		g.drawLine((int)-x,(int)-(y),(int)-x,(int)-(y));
				g.drawLine((int)(x-2*h),(int)-(y),(int)(x-2*h),(int)-(y));
				y=y+0.1;
			}
		}
		else if(m==4)
		{
			double x;
			double y=0;
			for(int i=0;i<=2500;i++)
			{
			 	x=Math.sqrt(4*a*(y-k))+h;
		 		g.drawLine((int)-x,(int)(y),(int)-x,(int)(y));
				g.drawLine((int)(x-2*h),(int)(y),(int)(x-2*h),(int)(y));
				y=y+0.1;
			}
		}
	}
}