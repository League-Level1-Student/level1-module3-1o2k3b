package _04_netflix;
import _04_netflix.NetflixQueue;
import _04_netflix.Movie;

public class binge_time {
public static void main(String[] args) {
	Movie movie1 = new Movie("black panther", 10);
	Movie movie2 = new Movie("mean girls", 9);
	Movie movie3 = new Movie("night swim", 8);
	Movie movie4 = new Movie("meg 2", 9);
	Movie movie5 = new Movie("Descipable me 4", 9);
	movie1.getTicketPrice();
	movie2.getTicketPrice();
	movie3.getTicketPrice();
	movie4.getTicketPrice();
	movie5.getTicketPrice();
	NetflixQueue movie = new NetflixQueue();
	movie.addMovie(movie1);
	movie.addMovie(movie2);
	movie.addMovie(movie3);
	movie.addMovie(movie4);
	movie.addMovie(movie5);
	movie.printMovies();
System.out.println("the best movie is " + movie.getBestMovie());

}
}
