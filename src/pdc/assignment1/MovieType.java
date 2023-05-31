package pdc.assignment1;

public enum MovieType 
{
    _3D("3D"), _4D("4D"), IMAX("IMAX"), NORMAL("Normal");
    
    private final String movieType;
    
    MovieType(String movieType)
    {
        this.movieType = movieType;
    }
    
    public String getMovieType()
    {
        return this.movieType;
    }
}
