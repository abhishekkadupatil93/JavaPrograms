import java.util.*;

public class Frequncy{
    public static void main(String[] args)
    {
		
		 int n; 
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number of elements you want to store: ");
		 n=sc.nextInt();
		 String[] array = new String[n];
		 for(int i=0; i<n; i++) {
		 array[i]=sc.nextLine();
		 } 
		 List<String> al = new ArrayList<>(Arrays.asList(array)); 
		 for(String x:al) {		 
			 if(Collections.frequency(al,x)==1){
				 System.out.println("unique elements is : "+x); 		 
			 }
		 }
		 for(String x:al) { 
			 if(Collections.frequency(al, x)!=1){
				 System.out.println("Non unique elements is : "+x+"  and its occurance is: "+Collections.frequency(al, x));		 
			 	} 
			 }
    }
}