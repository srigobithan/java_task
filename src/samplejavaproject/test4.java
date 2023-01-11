package samplejavaproject;

public class test4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]= {10,12,15,18};
		
		int length = A.length;
		int sum=0;
		
		System.out.print("Input Characters");
		for (int i=0;i<length;i++)
		{
			System.out.print(A[i]+ " ");
		}
		System.out.println(""); 
		System.out.print("Input Characters Reversely "); 
		for (int j=3;j<length;j--)
		{
			System.out.print(A[j]+ " ");
		}
			
	}
}
