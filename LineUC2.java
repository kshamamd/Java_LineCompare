import java.util.Scanner;

public class {

	public static void main (String[] args){


		Scanner fetch = new Scanner(System.in);

                System.out.println("Give me the First X Co-ordinate of First Line");
                int x1 = fetch.nextInt();
                System.out.println("Give me the First Y Co-ordinate of First Line");
                int y1 = fetch.nextInt();
                System.out.println("Give me the Second X Co-ordinate of First Line");
                int x2 = fetch.nextInt();
                System.out.println("Give me the Second Y Co-ordinate of First Line");
                int y2 = fetch.nextInt();

                double line_one_length = Math.sqrt(( Math.pow((x2 - x1) , 2 )+ Math.pow((y2- y1) ,2 )));

                System.out.println("The length of the line is "+line_one_length);

		System.out.println("Give me the First X Co-ordinate of second Line");
                int x21 = fetch.nextInt();
                System.out.println("Give me the First Y Co-ordinate of Second Line");
                int y21 = fetch.nextInt();
                System.out.println("Give me the Second X Co-ordinate of Second Line");
                int x22 = fetch.nextInt();
                System.out.println("Give me the Second Y Co-ordinate of Second Line");
                int y22 = fetch.nextInt();

                double line_two_length = Math.sqrt(( Math.pow((x22 - x21) , 2 )+ Math.pow((y22 - y21) ,2 )));

                System.out.println("The length of the line is "+line_two_length);

		if ( line_two_length == line_one_length ) {

			System.out.println("THE LINES ARE EQUAL IN LENGTH");
		}

		else {

			System.out.println("THE LINES ARE NOT EQUAL IN LENGTH");

		}


		}

}
