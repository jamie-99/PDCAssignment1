package pdc.assignment1;

public class Movie 
{
    private String title;
    private int duration;
    private MovieType movieType;
    
    public Movie(String title, int duration)
    {
        this.title = title;
        this.duration = duration;
    }
    
    @Override
    public String toString()
    {
        return this.title + "(" + this.getMovieType().getMovieType() + ") - " + this.getDuration() + " minutes";
    }

    public String getTitle() 
    {
        return this.title;
    }
    
    public int getDuration() 
    {
        return this.duration;
    }
    
    public MovieType getMovieType()
    {
        return this.movieType;
    }
    
    public void setMovieType(MovieType movieType)
    {
        this.movieType = movieType;
    }
}
