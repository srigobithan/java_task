package samplejavaproject;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sample[] = {10, 15, 20, 25};		
		int length = sample.length;
		int sum=0;

		for (int i=0;i<length;i++)
		{
			sum += sample[i];
		}
		
		System.out.println("Total is : "+sum);
		System.out.println("Total length is : "+length);
		double average = (sum/length);
		System.out.println("Average is : "+average);
				
	}
	
	
}
