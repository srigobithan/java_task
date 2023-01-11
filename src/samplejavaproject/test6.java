package samplejavaproject;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	int arr[] = {1,5,3,2,9};    
	        int temp = 0;    
	              
	        System.out.println("Integer array: ");    
	        for (int i = 0; i < arr.length; i++) 
	        {     
	            System.out.print(arr[i] + " ");    
	            
	        }    
	        
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }   
	        
	        System.out.println();    
	        System.out.println("Integer array element in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }   
	}

}
