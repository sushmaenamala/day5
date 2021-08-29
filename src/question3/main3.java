package question3;
import java.util.Scanner;

public class main3 {
	public static void main(String[] args) {
		Delivery delivery=new Delivery();
		Scanner sc=new Scanner(System.in);
		Long over=sc.nextLong();
		Long ball=sc.nextLong();
		Long runs=sc.nextLong();
		String batsman=sc.next();
		String bowler=sc.next();
		String nonStriker=sc.next();
		delivery.setover(over);
		delivery.setball(ball);
		delivery.setruns(runs);
		delivery.setbatsman(batsman);
		delivery.setbowler(bowler);
		delivery.setnonStriker(nonStriker);
		System.out.println("Delivery Details");
		System.out.println("over:"+delivery.getover());
		System.out.println("ball:"+delivery.getball());
		System.out.println("runs:"+delivery.getruns());
		System.out.println("batsman:"+delivery.getbatsman());
		System.out.println("bowler:"+delivery.getbowler());
		System.out.println("nonStriker:"+delivery.getnonStriker());
		}
}