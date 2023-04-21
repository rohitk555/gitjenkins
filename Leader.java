package innternal;

public class Leader {


		void printLeaders(int arr[], int size) 
	    {
	        for (int i = 0; i < size; i++) 
	        {
	            int j;
	            for (j = i + 1; j < size; j++) 
	            {
	                if (arr[i] <=arr[j])
	                    break;
	            }
	            if (j == size) 
	                System.out.print(arr[i] + " ");
	        }
	    }
	  
	   
	    public static void main(String[] args) 
	    {
	        Leader lead = new Leader();
	        int arr[] = new int[]{4, 7, 1, 10, 0};
	        int n = arr.length;
	        lead.printLeaders(arr, n);
	}

}
