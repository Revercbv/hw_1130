package homework10_30;

public class p_25 {
public static void main(String[] args){	//P25
		
		Car1 car1=new Car1();
		Car1 car2=new Car1();
		
		Car1 car3;
		car3=car1;
		
		System.out.println("car1與car2相同"+car1.equals(car2));
		System.out.println("car1與car3相同"+car1.equals(car3));
	}
}
