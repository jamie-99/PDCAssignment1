package pdc.assignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Movies {

    private ArrayList<Movie> movies;

    /*
    * The constructor of Movies initializes the movies list and calls the private method addMovies().
    */
    public Movies() {
        this.movies = new ArrayList();
        this.addMovies();
    }

    public ArrayList<Movie> getMovies() {
        return this.movies;
    }

    public Movie getMovie(int index) {
        return this.movies.get(index - 1);
    }

    public int getSize() {
        return this.movies.size();
    }

    /*
    * The private method getMoviesFromFile() reads a list of movies and their durations 
    * from a text file and returns a HashMap that maps movie titles to their durations in minutes.
    */
    private HashMap<String, Integer> getMoviesFromFile() {
        HashMap<String, Integer> movieMap = new HashMap();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("./resources/movieList.txt"));
            String line = "";

            try {
                while ((line = br.readLine()) != null) {
                    String[] str = line.split("-");
                    movieMap.put(str[0], Integer.parseInt(str[1]));
                }
            } catch (IOException ex) {
                Logger.getLogger(FilmTheatre.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilmTheatre.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(FilmTheatre.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return movieMap;
    }
    
    /*
    * The private method addMovies() uses getMoviesFromFile() to get the movie data and 
    * create Movie objects for each movie. It sets the movieType for each movie based on its duration 
    * and adds the movie to the movies list.
    */
    private void addMovies() {
        Set eSet = this.getMoviesFromFile().entrySet();
        Iterator it = eSet.iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String title = (String) entry.getKey();
            Integer duration = (Integer) entry.getValue();

            Movie movie = new Movie(title, (int) duration);

            if (duration <= 90) {
                movie.setMovieType(MovieType.NORMAL);
            } else if (duration > 90 && duration <= 120) {
                movie.setMovieType(MovieType._4D);
            } else if (duration > 120 && duration <= 150) {
                movie.setMovieType(MovieType._3D);
            } else {
                movie.setMovieType(MovieType.IMAX);
            }

            this.movies.add(movie);
        }
    }
}
