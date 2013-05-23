import java.util.*;
import java.math.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//This is only my demo of how to create a frame.  Ignore it.

public class QuadraticSolver extends Frame implements ActionListener
{
  private TextField afield, bfield, cfield, answerField;
	private Button calculateB;
	public static void main(String[] args)
	{
		QuadraticSolver frame=new QuadraticSolver();
	}
	
	public QuadraticSolver()
	{
		afield = new TextField("0.0", 5);
		bfield = new TextField("0.0", 5);
		cfield = new TextField("0.0", 5);
		answerField= new TextField(50);
		calculateB = new Button("Calculate");
		setTitle("Noah's Fancy Quadratic Solver");
		
		Panel myPanel = new Panel();
		myPanel.setLayout(new FlowLayout());
		myPanel.add(new Label("AX^2"));
		myPanel.add(afield);
		myPanel.add(new Label("BX"));
		myPanel.add(bfield);
		myPanel.add(new Label("+C"));
		myPanel.add(cfield);
		myPanel.add(calculateB);
		add(answerField, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
		
		calculateB.addActionListener(this);
		
		pack();
		addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				});
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==calculateB)
		{
			double a=Double.parseDouble(afield.getText().trim());
			double b=Double.parseDouble(bfield.getText().trim());
			double c=Double.parseDouble(cfield.getText().trim());
			
			if(real(a,b,c)==true)
			{
				 answerField.setText(realRoots(a,b,c));
			}
			else
			{
				answerField.setText(imaginaryRoots(a,b,c));
			}
		}
	}
	public String realRoots(double a, double b, double c)
	{
		String result;
		double root1, root2;
		if(real(a,b,c)==true)
		{
			root1=(((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a));
			root2=(((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a));
			if(root1==root2)
			{
				result=("There is one double root, "+root1);
			}
			else
			{
				result=("There are two roots, "+root1+" and "+root2);
			}
		}
		else
		{
			result=("These roots are imaginary...they shouldn't be.");
		}
		return result;
	}
	public String imaginaryRoots(double a, double b, double c)
	{
		double root1;
		String result;
		if(real(a,b,c)!=true)
		{
			double det=Math.sqrt(Math.abs((b*b)-(4*a*(c))))/(2*a);
			//fixed the issue!  Hooray!
			root1=(-b)/(2*a);
			result=("There are two imaginary roots, "+root1+"+"+det+("i, and ")+root1+"-"+det+"i");
		}
		else
		{
			result=("These roots are real...they shouldn't be...");
		}
		return result;
	}
	public boolean real(double a, double b, double c)
	{
		boolean isReal;
		double test=determinant(a, b, c);
		if(test>=0)
		{
			isReal=true;
		}
		else
		{
			isReal=false;
		}
		return isReal;
	}
	public double determinant(double a, double b, double c)
	{
		return ((b*b)-4*a*c);
	}
}
