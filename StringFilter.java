import java.util.stream.Stream; 
import java.util.Scanner;
class StringFilter { 
  
    public static void main(String[] args) 
    { 	
    	Scanner sc = new Scanner(System.in);
    	int n;
    	System.out.println("Enter size of array:");
    	n = sc.nextInt();
    	String[] a = new String[n];
    	for(int i = 0; i < n; ++i)
    		a[i] = sc.next();
        
        Stream<String> stream = Stream.of(a); 
        stream.filter(s -> s.startsWith("a") && s.length()==3)
        .forEach(System.out::println); 
    } 
} 
