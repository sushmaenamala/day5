package question5;
import java.util.Scanner;

public class main5 {
	public static void main(String[] args) {
		PlayerSplit playersplit=new PlayerSplit();
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String country=sc.next();
		String skill=sc.next();
		playersplit.setname(name);
		playersplit.setcountry(country);
		playersplit.setskill(skill);
		System.out.println("Player Details");
		System.out.println("playername :"+playersplit.getname());
		System.out.println("country :"+playersplit.getcountry());
		System.out.println("skill :"+playersplit.getskill());

}



}
