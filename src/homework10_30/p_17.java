package homework10_30;

public class p_17 {
public static void main(String[] args){	//P17
		
		Car cars[]=new Car[2];
		
		cars[0]=new Car();
		cars[0].setCar(1234, 20.5);
		
		cars[1]=new RacingCar();
		cars[1].setCar(4567, 30.5);
		
		for(int i=0;i<cars.length;i++) {
			cars[i].show();
		}
	}
}
