class Stars10
{
	public static void main(String[] args) {
		
		int z=1;
		int i,j,k;
		for (i=1;i<=4;i++) {
			
			for (j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for (k=1;k<=z;k++) {
				System.out.print("*");
			}
			
			System.out.println();
			z+=2;
		}
	}
}
