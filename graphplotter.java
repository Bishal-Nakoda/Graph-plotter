import graphs.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class graphplotter
{
	public static void main(String[] args)
	{	
		JFrame f1=new JFrame("HOME-SCREEN");
		JFrame f2=new JFrame("SELECTION-SCREEN");
		JFrame f3=new JFrame("INPUT-SCREEN");
		JFrame f4=new JFrame("OUTPUT");

		JButton b1=new JButton("Select An Equation To Plot");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{  
				f1.setVisible(false); 
				JButton e1=new JButton("Straight Line");
				JButton e2=new JButton("Circle");
				JButton e3=new JButton("Ellipse");
				JButton e4=new JButton("Exponential");
				JButton e5=new JButton("Logarithm");
				JButton e6=new JButton("Parabola");
				JButton e7=new JButton("Sine");
				JButton e8=new JButton("Cosine");
				JButton e9=new JButton("Tan");	
				e1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{  	
						f2.setVisible(false); 
						JLabel l1=new JLabel("M(Slope)=");
						JTextField tf1=new JTextField();  
						JLabel l2=new JLabel("C(Constant)=");
						JTextField tf2=new JTextField();    
						JButton p=new JButton("PLOT");
						f3.add(l1);
						f3.add(tf1);
						f3.add(l2);
						f3.add(tf2);
						f3.add(p);
						f3.setLayout(new GridLayout(5,1));
						f3.setSize(500,500);     
						f3.setVisible(true);  
						p.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{	
								f3.setVisible(false); 
								double a=Double.parseDouble(tf1.getText());
								double b=Double.parseDouble(tf2.getText());
								line o=new line(a,b);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
						});
								
       					}
				});
				e2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{  
						f2.setVisible(false); 
						JLabel l1=new JLabel("R(Radius)=");
						JTextField tf1=new JTextField();   
						JLabel l2=new JLabel("H(X Co-ordinate of Centre)=");
						JTextField tf2=new JTextField(); 
						JLabel l3=new JLabel("Y(Y Co-ordionate of Centre)=");
						JTextField tf3=new JTextField();  
						JButton p=new JButton("PLOT");
						f3.add(l1);
						f3.add(tf1);
						f3.add(l2);
						f3.add(tf2);
						f3.add(l3);
						f3.add(tf3);
						f3.add(p);
						f3.setLayout(new GridLayout(7,1));
						f3.setSize(500,500);     
						f3.setVisible(true);  
						p.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								double a=Double.parseDouble(tf1.getText());
								double b=Double.parseDouble(tf2.getText());
								double c=Double.parseDouble(tf3.getText());
								circle o=new circle(a,b,c);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
						});
						
            					
       					}
				});
				e3.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{  
						f2.setVisible(false); 
            					JLabel l1=new JLabel("Height=");
						JTextField tf1=new JTextField(); 
						JLabel l2=new JLabel("Width=");
						JTextField tf2=new JTextField();   
						JLabel l3=new JLabel("H(X Co-ordinate of Centre)=");
						JTextField tf3=new JTextField(); 
						JLabel l4=new JLabel("K(Y Co-ordinate of Centre)=");
						JTextField tf4=new JTextField();  
						JButton p=new JButton("PLOT");
						f3.add(l1);
						f3.add(tf1);
						f3.add(l2);
						f3.add(tf2);
						f3.add(l3);
						f3.add(tf3);
						f3.add(l4);
						f3.add(tf4);
						f3.add(p);
						f3.setLayout(new GridLayout(9,1));
						f3.setSize(500,500);     
						f3.setVisible(true);  
						p.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								double a=Double.parseDouble(tf1.getText());
								double b=Double.parseDouble(tf2.getText());
								double c=Double.parseDouble(tf3.getText());
								double d=Double.parseDouble(tf4.getText());
								ellipse o=new ellipse(a,b,c,d);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
						});
       					}
				});
				e4.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{  
						f2.setVisible(false); 
						JLabel l1=new JLabel("A=");
						JTextField tf1=new JTextField();     
						JButton p=new JButton("PLOT");
						f3.add(l1);
						f3.add(tf1);
						f3.add(p);
						f3.setLayout(new GridLayout(3,1));
						f3.setSize(500,500);     
						f3.setVisible(true);  
						p.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								double a=Double.parseDouble(tf1.getText());
								exp o=new exp(a);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
						});
            					
       					}
				});
				e5.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{  
						f2.setVisible(false); 
						JLabel l1=new JLabel("Base=");
						JTextField tf1=new JTextField();     
						JButton p=new JButton("PLOT");
						f3.add(l1);
						f3.add(tf1);
						f3.add(p);
						f3.setLayout(new GridLayout(3,1));
						f3.setSize(500,500);     
						f3.setVisible(true);  
						p.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								double a=Double.parseDouble(tf1.getText());
								loga o=new loga(a);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
						});
            					
       					}
				});
				e6.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{  
						f2.setVisible(false); 
						JRadioButton r1=new JRadioButton("A)Plot Along +X Axis");    
						JRadioButton r2=new JRadioButton("B)Plot Along -X Axis"); 
						JRadioButton r3=new JRadioButton("A)Plot Along +Y Axis");    
						JRadioButton r4=new JRadioButton("B)plot Along -Y Axis");  
						ButtonGroup bg=new ButtonGroup();    
						bg.add(r1);
						bg.add(r2);  
						bg.add(r3);
						bg.add(r4);      
            					JLabel l1=new JLabel("A=");
						JTextField tf1=new JTextField();   
						JLabel l2=new JLabel("H(X Co-ordinate of Centre)=");
						JTextField tf2=new JTextField(); 
						JLabel l3=new JLabel("K(Y Co-ordinate of Centre)=");
						JTextField tf3=new JTextField();  
						f3.add(l1);
						f3.add(tf1);
						f3.add(l2);
						f3.add(tf2);
						f3.add(l3);
						f3.add(tf3);
						f3.add(r1);
						f3.add(r2);
						f3.add(r3);
						f3.add(r4);
						f3.setLayout(new GridLayout(11,1));
						f3.setSize(500,500);     
						f3.setVisible(true);  
						r1.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{

								double a=Double.parseDouble(tf1.getText());
								double b=Double.parseDouble(tf2.getText());
								double c=Double.parseDouble(tf3.getText());
								parabola o=new parabola(a,b,c,1);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
							
						});
						r2.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{	
								double a=Double.parseDouble(tf1.getText());
								double b=Double.parseDouble(tf2.getText());
								double c=Double.parseDouble(tf3.getText());
								parabola o=new parabola(a,b,c,2);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
						});
						r3.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								double a=Double.parseDouble(tf1.getText());
								double b=Double.parseDouble(tf2.getText());
								double c=Double.parseDouble(tf3.getText());
								parabola o=new parabola(a,b,c,3);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
						});
						r4.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{	
								double a=Double.parseDouble(tf1.getText());
								double b=Double.parseDouble(tf2.getText());
								double c=Double.parseDouble(tf3.getText());
								parabola o=new parabola(a,b,c,4);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
						});		
						
       					}
				});
				e7.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{  
						f2.setVisible(false); 
            					JLabel l1=new JLabel("A=");
						JTextField tf1=new JTextField();     
						JButton p=new JButton("PLOT");
						f3.add(l1);
						f3.add(tf1);
						f3.add(p);
						f3.setLayout(new GridLayout(3,1));
						f3.setSize(500,500);     
						f3.setVisible(true);  
						p.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								double a=Double.parseDouble(tf1.getText());
								sin o=new sin(a);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
						});
       					}
				});
				e8.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{  
						f2.setVisible(false); 
						JLabel l1=new JLabel("A=");
						JTextField tf1=new JTextField();     
						JButton p=new JButton("PLOT");
						f3.add(l1);
						f3.add(tf1);
						f3.add(p);
						f3.setLayout(new GridLayout(3,1));
						f3.setSize(500,500);     
						f3.setVisible(true);  
						p.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								double a=Double.parseDouble(tf1.getText());
								cos o=new cos(a);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
						});
            					
       					}
				});
				e9.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{  
						f2.setVisible(false); 
            					JLabel l1=new JLabel("A=");
						JTextField tf1=new JTextField();     
						JButton p=new JButton("PLOT");
						f3.add(l1);
						f3.add(tf1);
						f3.add(p);
						f3.setLayout(new GridLayout(3,1));
						f3.setSize(500,500);     
						f3.setVisible(true);  
						p.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e)
							{
								double a=Double.parseDouble(tf1.getText());
								tan o=new tan(a);
								f4.add(o,BorderLayout.CENTER);
								JButton z=new JButton("BACK");
								f4.setSize(500,500);
								f4.setVisible(true);
								f4.add(z,BorderLayout.SOUTH);
								z.addActionListener(new ActionListener(){
  									public void actionPerformed(ActionEvent e)
    									{
										f4.getContentPane().removeAll();
										f4.dispose();
										f3.getContentPane().removeAll();
										f3.dispose();
										f2.getContentPane().removeAll();
										f2.dispose();
										f1.setVisible(true); 
										f1.revalidate();
										f1.repaint();
    									}
								});
							}
						});
       					}
				});
				f2.add(e1);
				f2.add(e2);
				f2.add(e3);
				f2.add(e4);
				f2.add(e5);
				f2.add(e6);
				f2.add(e7);
				f2.add(e8);
				f2.add(e9);
				f2.setLayout(new GridLayout(3,3,20,20));  
				f2.setSize(500,500);     
				f2.setVisible(true);  
       			}
		});

		f1.add(b1);
		JButton b2=new JButton("QUIT");
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{  
            			System.exit(0);
       			}
		});
		f1.add(b2);
		f1.setLayout(new GridLayout(2,1,0,20));
		f1.setSize(500,500);     
		f1.setVisible(true);   
	} 

} 
