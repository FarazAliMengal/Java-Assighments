import java.util.*;
class ArrayCalculator
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String a[]=new String[4];
		int    b[]=new int[4];

		System.out.println("\n=============");
		System.out.print("MARKSHEET");
		System.out.println("\n=============");

		System.out.print("\nEnter Your Name:");
		a[0]=sc.nextLine();

		System.out.print("Enter University Name:");
		a[1]=sc.nextLine();

		System.out.print("Enter Your Year:");
		a[2]=sc.nextLine();

		System.out.print("Enter Your Department Name:");
		a[3]=sc.nextLine();

		System.out.print("\nEnter Your Java Marks:");
		b[0]=sc.nextInt();

		System.out.print("Enter php Marks:");
		b[1]=sc.nextInt();

		System.out.print("Enter Css Marks:");
		b[2]=sc.nextInt();

		int totalmarks=300;
		System.out.println("\nTotal Mark:"+totalmarks);

		int obtain=b[0]+b[1]+b[2];
		System.out.println("Obtained Marks:"+obtain);

		double per=obtain*100/totalmarks;
		System.out.println("Percentage:"+per);

		if (per>=90 && per<=100)
		System.out.println("Grade:A+(Pass)"); 

		if (per>=80 && per<=85)
		System.out.println("Grade:A(Pass)"); 

		if (per>=70 && per<80) 
		System.out.println("Grade:B+(Pass)");

		if(per>=60 && per<70)
		System.out.println("Grade:B(Pass)");

		if(per>=50 && per<60)
			System.out.println("Grade:C(Improve)");

		if(per<50)
			System.out.println("Fail");
	} 
}  