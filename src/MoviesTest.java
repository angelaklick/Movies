import java.util.ArrayList;
import java.util.Scanner;

public class MoviesTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		//made an array list of movies called my movies
		ArrayList<Movies> myMovies = new ArrayList<Movies>();

		//made new movie objects
		Movies movie1 = new Movies("Superbad", "Comedy");
		Movies movie2 = new Movies("A Clockwork Orange", "Drama");
		Movies movie3 = new Movies("The Shining", "Horror");
		Movies movie4 = new Movies("Forest Grump", "Drama");
		Movies movie5 = new Movies("Star Wars", "Scifi");
		Movies movie6 = new Movies("Harry Potter", "Scifi");
		Movies movie7 = new Movies("Legally Blonde", "Comedy");
		Movies movie8 = new Movies("Good Will Hunting", "Drama");
		Movies movie9 = new Movies("Titanic", "Drama");
		Movies movie10 = new Movies("The Exorcist", "Horror");

		myMovies.add(movie1);
		myMovies.add(movie2);
		myMovies.add(movie3);
		myMovies.add(movie4);
		myMovies.add(movie5);
		myMovies.add(movie6);
		myMovies.add(movie7);
		myMovies.add(movie8);
		myMovies.add(movie9);
		myMovies.add(movie10);

		while (flag) {

			System.out.println("What category are you interested in? (Scifi) (Comedy) (Drama) (Horror) ");
			String input = scan.next();

			if (input.equalsIgnoreCase("scifi")) {
				//goes through array
				for (int i = 0; i < myMovies.size(); i++) {
					//goes through the movies and gets the category
					if (myMovies.get(i).getCategory().equalsIgnoreCase(input)) {
						System.out.println(myMovies.get(i).getTitle());
					}

				}
			}
			else if (input.equalsIgnoreCase("horror")) {
				for (int i = 0; i < myMovies.size(); i++) {
					if (myMovies.get(i).getCategory().equalsIgnoreCase(input)) {
						System.out.println(myMovies.get(i).getTitle());
					}

				}
			}
			else if (input.equalsIgnoreCase("comedy")) {
				for (int i = 0; i < myMovies.size(); i++) {
					if (myMovies.get(i).getCategory().equalsIgnoreCase(input)) {
						System.out.println(myMovies.get(i).getTitle());
					}

				}
			}
			else if (input.equalsIgnoreCase("drama")) {
				for (int i = 0; i < myMovies.size(); i++) {
					if (myMovies.get(i).getCategory().equalsIgnoreCase(input)) {
						System.out.println(myMovies.get(i).getTitle());
					}

				}
			}
			
			System.out.println("Would you like to continue? (y/n) ");
			String input2 = scan.next();
			
			if(input2.equalsIgnoreCase("n")){
				
				System.out.println("Thanks for coming! ");
				flag = false;
				
			}
			
		}

	}

}