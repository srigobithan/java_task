package samplejavaproject;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     int[] input = {2, 3, 7, 6, 4};
	        int[] output = rotateArray(input);
	        for (int i : output) {
	            System.out.print(i + " ");
	        }
	    }

	    public static int[] rotateArray(int[] arr) {
	        int temp = arr[arr.length-1];
	        for (int i = arr.length-1; i > 0; i--) {
	            arr[i] = arr[i-1];
	        }
	        arr[0] = temp;
	        return arr;
	    }
	}
	

