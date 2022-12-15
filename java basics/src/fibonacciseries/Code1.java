package fibonacciseries;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//fibonacci series = first two numbers  starts with 0 and 1
//2 way we can write , without using  recursion , with using recursion	
		
		int a=0,b=1,c,count=3;
//System.out.println shortcut sysout and press Ctrl +space
		System.out.print(a+""+b);
		for(c=2;c<count;++c)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=a;
		}
				}

}
