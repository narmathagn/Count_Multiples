import java.util.*;
public class Addandmul{

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(ENter the value of a:);
		int a = s.nextInt();
		
		for(int i=0;i<a;i++) {
		    long sum = 1;
		    String k = "1";
		    for(int j=1;j<a-i;j++) {
		        if(i%2==0) {
		            k = k + "+" + String.valueOf(j+1);
		            sum += (j+1);
		        } else {
		            k = k + "*" + String.valueOf(j+1);
		            sum *= (j+1);
		        }
		    }
		    System.out.println(k + "=" + sum);
		}

	}
}