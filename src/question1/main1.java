package question1;
import java.util.Scanner;

public class main1 {
	

		public static void main(String[] args) {
			Player player=new Player();
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			String country=sc.next();
			String skill=sc.next();
			player.setname(name);
			player.setcountry(country);
			player.setskill(skill);
			System.out.println("playername :"+player.getname());
			System.out.println("playercountry :"+player.getcountry());
			System.out.println("playerskill :"+player.getskill());


		}

}
