public class Lead extends Employee implements Delegator{
    private final int DAY_BONUS = 2;

    private Days holiday = Days.MONDAY;

    public Lead(String name, int rating) {
        super(name);
    }


    @Override
    public void delegate(Employee e) {

    }
}
