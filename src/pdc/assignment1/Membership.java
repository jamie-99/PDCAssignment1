package pdc.assignment1;

public enum Membership 
{
    NON_MEMBER("Non-Member"), REWARDS_MEMBER("Rewards Member"), REWARDS_VIP("Rewards VIP");
    
    private String membership;
    
    Membership(String membership)
    {
        this.membership = membership;
    }
    
    public String getMembership()
    {
        return this.membership;
    }
}