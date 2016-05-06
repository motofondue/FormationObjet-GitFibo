import java.util.Scanner;

public class Main {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Type a positive value : ");		
		int depp = scan.nextInt(); //getInputNumber();		
		if (depp<0){
			System.out.println("Positive value expected !");
			return;
		}
		
		long n1=1;
		long n2=1;
		for(int i=0; i<depp;i++){
			if(i==0){
				System.out.print(n2+" ");
			}else if(i==1){
				System.out.print(n1+" ");
			}else{
				System.out.print(n1+n2+" ");
				long n = n1+n2;
				n2=n1;
				n1=n;
			}
		}
	}
	
	public static int getInputNumber() {
		//The value of input scanner or a state exception value -1
		int in = 0;
		// Convert the keyboard input to int
		try {
			in = Integer.valueOf(scan.nextLine());
		}
		catch (Exception e) {
			in = -1;
		}
		
		if (in < -1) {
			in = -1;
		}
		
		return in;
	}
}
