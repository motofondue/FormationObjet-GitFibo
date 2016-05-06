import java.util.Scanner;

public class Main {
	private static Scanner scan;
	public static void main(String[] args) {
		System.out.println("Type a positive vualue : ");		
		int depp=getInputNumber();		
		if (depp<0){
			System.out.println("Positive vualue expected !");
			return;
		}
		
		int n1=1;
		int n2=0;
		for(int i=0; i<=depp;i++){
			if(i==0){
				System.out.println(n2+" ");
			}else if(i==1){
				System.out.println(n1+" ");
			}else{
				System.out.println(n1+n2);
				n1=n1+n2;
				n2=n1;
			}
		}
	}
	
	public static int getInputNumber() {
		//The value of input scanner or a state exception value (-1 or -2)
		int in = 0;
		// Convert the keyboard input to int
		try {
			in = Integer.valueOf(scan.nextLine());
		}
		catch (Exception e) {
			in = -1;
		}
		
		if (in < 0) {
			in = -1;
		}
		
		return in;
	}
}
