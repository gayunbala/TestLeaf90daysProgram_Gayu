package aaa.Nintydays.program;

public class Day1_ComplexNumber {
	
	double r,i;
	public Day1_ComplexNumber(double real,double img)
	{
		this.r=real;
		this.i=img;
		
	}
	
	public static  Day1_ComplexNumber sum(Day1_ComplexNumber c1,Day1_ComplexNumber c2)
	{
		Day1_ComplexNumber temp=new Day1_ComplexNumber(0, 0);
		
		temp.r=c1.r+c2.r;
		temp.i=c1.i+c2.i;
		return temp;
		
	}
	
	
	public static void main(String[] args) {
		
		Day1_ComplexNumber c1=new Day1_ComplexNumber(2,2);
		Day1_ComplexNumber c2=new Day1_ComplexNumber(3,5);
		Day1_ComplexNumber temp=sum(c1,c2);
		
		System.out.println("The Sum of the Complex Number is :"+temp.r+"+"+temp.i+"i");
		
	}

}
