import java.util.*;

class Spinebiz {
	public void itApps() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Emp1 Name:--");
		String Emp1= input.next();
		System.out.println("Enter Emp2 Name:--");
		String Emp2=input.next();
		System.out.println("Enter Number 1:--");
		int num1 = input.nextInt();
		System.out.println("Enter Number 2:--");
		int num2 = input.nextInt();
		System.out.println(Emp1+" "+num1+" " +"\n"+""+Emp2+" "+num2);
	}
}


public class Employee {

	public static void main(String[] args) {
	Spinebiz emp = new Spinebiz();
	emp.itApps();
	}

}
