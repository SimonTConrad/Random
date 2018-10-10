import java.util.Scanner;

public class Talk 
{

	public static void main(String[] args) 
	{
		//printing
		System.out.println("I know how to print!");
		
		//printing the value of a variable
		int dice; //declaration
		dice = 6; //initialized
		double america = 3.5; // declared and initialized in the same line
		String yeezy = "everyone likes yeezy";
		dice = dice + 30;
		america = america - 25.12345;
		yeezy = yeezy + " more stuff";
		System.out.println(dice);
		System.out.println(america);
		System.out.println(yeezy);
		
		Scanner Koosha = new Scanner(System.in);
		String favSport;
		System.out.print("What is your favorite sport?:  " + " and mine is");
		favSport = Koosha.nextLine();
		System.out.print("\n favorite sport is " + favSport + " and mine is bowling");
		
	}

}
