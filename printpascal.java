import java.util.*;
class pascal{
public static void main(String []args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the value: ");
	int t = sc.nextInt();
	int space = t;
	int num = 1;
	for(int i=0;i<t;i++){
		for(int s=0;s<space;s++){
			System.out.println(" ");
		}
		num = 1;
		for(int j=0;j<=i;j++){
			System.out.print(num+" ");
			num = num*(i-j)/(j+1);
		}

	}
   }
}