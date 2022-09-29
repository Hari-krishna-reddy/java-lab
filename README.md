# java-files
#binary search in java
import java.util .*;

public class Java {


		public static void main(String[] args){
		int[] arr=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			
			System.out.println("Enter element:");
	       int e=s.nextInt();
	       arr[i]=e;
	       
		
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter search element:");
		int key=s.nextInt();
		int l=0;
		int h=arr.length-1;
		int mid=(l+h)/2;
		while (l<=h) {
		
		    if (key==arr[mid]) {
			
			  System.out.println("Element found at:"+ mid +"index");
			   break;
		     }
		   else if(key>arr[mid]) {
			
			  l=mid+1;
		      }
		    else {
			  h=mid-1;}
		 }
	if (l>h){
	 System.out.println("Element not found");	
		}
		
		s.close();
		
		
		
		
	}

}
