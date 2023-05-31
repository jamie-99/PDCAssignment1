package pdc.assignment1;

public class User 
{
    private String name;
    private Membership membership;
    private int pointBalance;    
    
    public User(String name, Membership membership)
    {
        this.name = name;
        this.membership = membership;
        this.pointBalance = 0;
    }
    
    public void updatePointBalance(int inputPoints)
    {
        this.pointBalance += inputPoints;
    }
    
    @Override
    public String toString()
    {
        return this.name + "(" + this.membership.getMembership() + ")";
    }

    public String getName() 
    {
        return name;
    }

    public Membership getMembership() 
    {
        return membership;
    }
        
    public int getPointBalance() 
    {
        return pointBalance;
    }
}