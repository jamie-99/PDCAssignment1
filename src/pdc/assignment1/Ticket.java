package pdc.assignment1;
/*
This class is an abstract class for ticket prices calculations
*/
public abstract class Ticket 
{    
    public abstract double normalMoviePrice();
    public abstract double _3DMoviePrice();
    public abstract double _4DMoviePrice();
    public abstract double IMAXMoviePrice();
    public abstract String printTicket();
}
