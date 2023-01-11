package samplejavaproject;

public class test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]= {10,12,15,18};
		
		int length = A.length;
		int sum=0;
		
		for (int i=0;i<length;i++)
		{
			sum += A[i];
		}
		
		System.out.println(sum);
			
	}
}
