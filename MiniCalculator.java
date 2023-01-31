import java.util.*;
class MiniCalculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("===============");
		System.out.println("MINI CALCULATOR");
		System.out.println("===============\n");

		System.out.println("%%%%%%%%%%%%%%%%%%%%");
		System.out.println("1. <--Addition");
		System.out.println("2. <--Subtraction");
		System.out.println("3. <--Multiplication");
		System.out.println("4. <--Division");
		System.out.println("5. <--Module");
		System.out.println("6. <--exit");
		System.out.println("7. <--About us");
		System.out.println("%%%%%%%%%%%%%%%%%%%%\n");

		System.out.print("Select any number from above Mini Calculator:");
		int number=sc.nextInt();
		
		char ch='Y';

		while(ch=='y' || ch=='Y'){

		if(number==1) {
			System.out.print("Enter 1st value:");
			int firstvalue=sc.nextInt();

			System.out.print("Enter 2nd Number:");
			int secondvalue=sc.nextInt();
		
			int add=firstvalue+secondvalue;
			System.out.print("Addition is:"+add);
			System.out.println("\nThank you for using");			
		}
		
		if(number==2){
		System.out.print("Enter 1st value:");
		int sub1=sc.nextInt();
		System.out.print("Enter 2nd value:");
		int sub2=sc.nextInt();
		int subtract=sub1-sub2;
		System.out.println("\nSubtraction is:"+subtract);
		}
		if(number==3){
		System.out.print("Enter 1st value:");
		int multi1=sc.nextInt();
		System.out.print("Enter 2nd value:");
		int multi2=sc.nextInt();
		int multiplication=multi1*multi2;
		System.out.print("Multiplication is:"+multiplication);
		System.out.println("\nThank you for using");
		}

		if(number==4){
		System.out.print("Enter 1st value:");
		int div1=sc.nextInt();
		System.out.print("Enter 2nd value");
		int div2=sc.nextInt();
		int division=div1/div2;
		System.out.print("Division is:"+division);
		System.out.println("\nThank you for using");
		}

		if(number==5){
		System.out.print("Enter 1st value:");
		int mod1=sc.nextInt();
		System.out.print("Enter 2nd value:");
		int mod2=sc.nextInt();
		int module=mod1%mod2;
		System.out.print("Module will be:"+module);
		System.out.println("\nThank you for using");
	
		}

		if(number==6){
		System.out.println("\nThank you for using");
		System.exit(0);
		}

		if(number==7){
		System.out.println("Faraz Ali Mengal);
		System.out.println("\nThank you for using");
		}

		if(number<1 || number>7){
		System.out.println("It is invalid Number:");
		System.out.println("\nThank you for using ");}

		System.out.print("Do You want More Calculator[Y/N]:");
		ch=sc.next().charAt(0);
		}
	}

}
		