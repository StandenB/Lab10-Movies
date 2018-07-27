package Lab10movies;

import java.util.ArrayList;
import java.util.Scanner;

public class lab10movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String userInput = null, cont = "no";
		
		ArrayList<String> directory = new ArrayList<>();
		ArrayList<String> genre = new ArrayList<>();
		
		// creating objects in the Movie Class
		Movie movie1 = new Movie("Jaws     ", "action");
		Movie movie2 = new Movie("Mamma Mia!", "musical");
		Movie movie3 = new Movie("Get Smart", "comedy");
		Movie movie4 = new Movie("Moana    ", "family");
		Movie movie5 = new Movie("Star Wars", "scifi");
		Movie movie6 = new Movie("Die Hard", "action");
		Movie movie7 = new Movie("Coco     ", "family");
		Movie movie8 = new Movie("Jurassic Park", "action");
		Movie movie9 = new Movie("Kill Bill", "action");
		Movie movie10 = new Movie("Caddyshack", "comedy");
		Movie movie11 = new Movie("Airplane", "comedy");
		Movie movie12 = new Movie("Animal House", "comedy");
		Movie movie13 = new Movie("West Side Story", "musical");
		Movie movie14 = new Movie("Ghostbusters", "comedy");
		
		// populating ArrayList directory with movie titles
		directory.add(movie1.getTitle());
		directory.add(movie2.getTitle());
		directory.add(movie3.getTitle());
		directory.add(movie4.getTitle());
		directory.add(movie5.getTitle());
		directory.add(movie6.getTitle());
		directory.add(movie7.getTitle());
		directory.add(movie8.getTitle());
		directory.add(movie9.getTitle());
		directory.add(movie10.getTitle());
		directory.add(movie11.getTitle());
		directory.add(movie12.getTitle());
		directory.add(movie13.getTitle());
		directory.add(movie14.getTitle());
		
		// System.out.println(movie1.getTitle());
		// System.out.println(directory.get(0));
		
		// populating ArrayList genre with movie category
		genre.add(movie1.getCategory());
		genre.add(movie2.getCategory());
		genre.add(movie3.getCategory());
		genre.add(movie4.getCategory());
		genre.add(movie5.getCategory());
		genre.add(movie6.getCategory());
		genre.add(movie7.getCategory());
		genre.add(movie8.getCategory());
		genre.add(movie9.getCategory());
		genre.add(movie10.getCategory());
		genre.add(movie11.getCategory());
		genre.add(movie12.getCategory());
		genre.add(movie13.getCategory());
		genre.add(movie14.getCategory());
				
		System.out.println("Welcome to the Movie List Application!\n");
		System.out.println("There are 14 movies on this list.\n");
		System.out.println("Title\t\tCategory");
		System.out.println("=====\t\t========");
		
		
		for (int i = 0; i < directory.size(); i++) {
			System.out.println(directory.get(i) + "\t" + genre.get(i));
		}
		
		do {
			System.out.println("\nWhat category are you interested in?");
			userInput = scnr.next();
			if (genre.contains(userInput)) {
				for (int i = 0; i < directory.size(); i++) {	
					if (genre.get(i).equals(userInput)) {
					System.out.println(directory.get(i));
					}
				}
			}
			else {
				System.out.println("Sorry, we don't have that category.");
				System.out.println("We offer comedy, musical, family, scifi and action.");
				continue;
			}
			System.out.println("Continue (y/n)");
			cont = scnr.next();
			cont = cont.toLowerCase();
		}
		while (cont.equals("y"));
		System.out.println("Goodbye!");
		scnr.close();
	}

}
		//for (Students student : Facebook) {
		// System.out.println(student.name + " is from " + student.hometown);
		//for (Students student : Facebook) {
		//System.out.println(student.name + " is from " + student.hometown);