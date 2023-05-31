package pdc.assignment1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NonMemberTicket extends Ticket {

    private HashMap<AgeGroup, Integer> numberOfPeople;
    private HashMap<AgeGroup, Double> tickets;

    private MovieType movieType;

    private double adultTotal;
    private double childTotal;
    private double studentTotal;
    private double seniorTotal;
    private double totalPrice;

    /*
    * The class has a constructor that takes two parameters: 
    * a HashMap that maps AgeGroup to Integer representing the number of people in each age group, 
    * and a MovieType representing the type of movie. Depending on the type of movie, 
    * the constructor calls one of the four different movie price calculation methods: 
    * normalMoviePrice(), _3DMoviePrice(), _4DMoviePrice(), or IMAXMoviePrice().
     */
    public NonMemberTicket(HashMap<AgeGroup, Integer> numberOfPeople, MovieType movieType) {
        this.numberOfPeople = numberOfPeople;
        this.tickets = new HashMap();

        this.movieType = movieType;

        switch (movieType) {
            case NORMAL:
                this.normalMoviePrice();
                break;

            case _3D:
                this._3DMoviePrice();
                break;

            case _4D:
                this._4DMoviePrice();
                break;

            case IMAX:
                this.IMAXMoviePrice();
                break;

            default:
                break;
        }
    }

    /*
    * The normalMoviePrice() method calculates the cost of tickets for a normal movie. 
    * It iterates through the numberOfPeople HashMap, calculates the total cost for each age group, 
    * and adds the cost to the appropriate instance variable (adultTotal, childTotal, studentTotal, or seniorTotal). 
    * It also adds the cost for each age group to the tickets HashMap, and adds the total cost for all age groups to 
    * the totalPrice instance variable. 
    * It returns the total price of all the tickets.
     */
    @Override
    public double normalMoviePrice() {
        Set eSet = this.numberOfPeople.entrySet();
        Iterator it = eSet.iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();

            if ((int) entry.getValue() > 0) {
                if (entry.getKey().equals(AgeGroup.Adult)) {
                    this.adultTotal += 24.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Adult, this.adultTotal);

                    this.totalPrice += this.adultTotal;
                } else if (entry.getKey().equals(AgeGroup.Child)) {
                    this.childTotal += 18.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Child, this.childTotal);

                    this.totalPrice += this.childTotal;
                } else if (entry.getKey().equals(AgeGroup.Student)) {
                    this.studentTotal += 21.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Student, this.studentTotal);

                    this.totalPrice += this.studentTotal;
                } else if (entry.getKey().equals(AgeGroup.Senior)) {
                    this.seniorTotal += 18.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Senior, this.seniorTotal);

                    this.totalPrice += this.seniorTotal;
                }
            }
        }

        return this.totalPrice;
    }

    /*
    * This method has similar function to the normalMoviePrice() method, only 
    * this method is to calculate 3D Movie ticket price.
     */
    @Override
    public double _3DMoviePrice() {
        Set eSet = this.numberOfPeople.entrySet();
        Iterator it = eSet.iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();

            if ((int) entry.getValue() > 0) {
                if (entry.getKey().equals(AgeGroup.Adult)) {
                    this.adultTotal += 27.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Adult, this.adultTotal);

                    this.totalPrice += this.adultTotal;
                } else if (entry.getKey().equals(AgeGroup.Child)) {
                    this.childTotal += 21.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Child, this.childTotal);

                    this.totalPrice += this.childTotal;
                } else if (entry.getKey().equals(AgeGroup.Student)) {
                    this.studentTotal += 24.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Student, this.studentTotal);

                    this.totalPrice += this.studentTotal;
                } else if (entry.getKey().equals(AgeGroup.Senior)) {
                    this.seniorTotal += 21.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Senior, this.seniorTotal);

                    this.totalPrice += this.seniorTotal;
                }
            }
        }

        return this.totalPrice;
    }

    /*
    * This method has similar function to the normalMoviePrice() method, only 
    * this method is to calculate 4D Movie ticket price.
     */
    @Override
    public double _4DMoviePrice() {
        Set eSet = this.numberOfPeople.entrySet();
        Iterator it = eSet.iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();

            if ((int) entry.getValue() > 0) {
                if (entry.getKey().equals(AgeGroup.Adult)) {
                    this.adultTotal += 30.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Adult, this.adultTotal);

                    this.totalPrice += this.adultTotal;
                } else if (entry.getKey().equals(AgeGroup.Child)) {
                    this.childTotal += 24.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Child, this.childTotal);

                    this.totalPrice += this.childTotal;
                } else if (entry.getKey().equals(AgeGroup.Student)) {
                    this.studentTotal += 27.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Student, this.studentTotal);

                    this.totalPrice += this.studentTotal;
                } else if (entry.getKey().equals(AgeGroup.Senior)) {
                    this.seniorTotal += 24.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Senior, this.seniorTotal);

                    this.totalPrice += this.seniorTotal;
                }
            }
        }

        return this.totalPrice;
    }

    /*
    * This method has similar function to the normalMoviePrice() method, only 
    * this method is to calculate IMAX Movie ticket price.
     */
    @Override
    public double IMAXMoviePrice() {
        Set eSet = this.numberOfPeople.entrySet();
        Iterator it = eSet.iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();

            if ((int) entry.getValue() > 0) {
                if (entry.getKey().equals(AgeGroup.Adult)) {
                    this.adultTotal += 28.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Adult, this.adultTotal);

                    this.totalPrice += this.adultTotal;
                } else if (entry.getKey().equals(AgeGroup.Child)) {
                    this.childTotal += 22.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Child, this.childTotal);

                    this.totalPrice += this.childTotal;
                } else if (entry.getKey().equals(AgeGroup.Student)) {
                    this.studentTotal += 25.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Student, this.studentTotal);

                    this.totalPrice += this.studentTotal;
                } else if (entry.getKey().equals(AgeGroup.Senior)) {
                    this.seniorTotal += 22.0 * (int) entry.getValue();

                    this.tickets.put(AgeGroup.Senior, this.seniorTotal);

                    this.totalPrice += this.seniorTotal;
                }
            }
        }

        return this.totalPrice;
    }

    /*
    * This method uses numberOfPeople, and tickets variables to iterate and to print the value it stores
    * if the numberOfPeople's key stores a value that's bigger than 0.
    * The method returns a String value that are readable for the user.
     */
    @Override
    public String printTicket() {
        Set eSet1 = this.numberOfPeople.entrySet();
        Set eSet2 = this.tickets.entrySet();

        Iterator peopleIt = eSet1.iterator();
        Iterator ticketIt = eSet2.iterator();

        BigDecimal bd = new BigDecimal(this.totalPrice).setScale(2, RoundingMode.HALF_UP);
        this.totalPrice = bd.doubleValue();

        String output = "";

        while (peopleIt.hasNext() && ticketIt.hasNext()) {
            Map.Entry peopleMap = (Map.Entry) peopleIt.next();
            Map.Entry ticketMap = (Map.Entry) ticketIt.next();

            if ((int) peopleMap.getValue() > 0) {
                output += (peopleMap.getKey() + " X " + (int) peopleMap.getValue()
                        + " = $" + (bd = new BigDecimal((double) ticketMap.getValue()).setScale(2, RoundingMode.HALF_UP)) + "\n");
            }
        }

        output += ("Total Price: $" + this.totalPrice + "\n");

        return output;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }
}
