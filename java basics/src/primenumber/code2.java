package primenumber;

public class code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//prime is a greater than 1 divided by 1
		int x, m=0,flag=0;
		int c=3;
		m=c/2;
		if(c==0||c==1) {
			System.out.println(c+"is not prime number");
		}
		else {
			for(x=2;x<=m;x++) {
				if(c%x==0) {
					System.out.println(c+"is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(c+"is prime number");
			}
					
				}
			}
				
		}
