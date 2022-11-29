package binarySearch;

public class BinarySearch {
	
	public static boolean binarySearch(int arr[], int key){  
		int first=0;
		int last= arr.length-1;
		
		int mid = (first + last)/2;  
		   while( first < last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        return true; 
		        
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      return false; 
		   }  
		   
		   return false;
	}

	public static void main(String[] args) {
		 int arr[] = {10,20,30,40,50};  
	        int key = 2;  
//	        int key=40;
	        System.out.println(binarySearch(arr,key));

	}

}
