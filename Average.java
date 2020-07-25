import java.util.*; 
import java.util.stream.IntStream; 
  
class Main { 
  
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; ++i)
            a[i] = sc.nextInt();
            
        IntStream inputs = IntStream.of(a);  
        OptionalDouble avg = inputs.average(); 
        if (avg.isPresent()) { 
            System.out.println(avg.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    }
}