import java.util.Scanner;

public class Line_compare {

	public static void main (String[] args){


		Scanner fetch = new Scanner(System.in);

                System.out.println("Give me the First X Co-ordinate");
                int x1 = fetch.nextInt();
                System.out.println("Give me the First Y Co-ordinate");
                int y1 = fetch.nextInt();
                System.out.println("Give me the Second X Co-ordinate");
                int x2 = fetch.nextInt();
                System.out.println("Give me the Second Y Co-ordinate");
                int y2 = fetch.nextInt();

                double line_length = Math.sqrt(( Math.pow((x2 - x1) , 2 )+ Math.pow((y2- y1) ,2 )));

                System.out.println("The length of the line is "+line_length);


		}

}
