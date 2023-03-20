public class Manager extends Employee implements Delegator{
    private final int DAY_BONUS = 1;
    private Days holiday = Days.TUESDAY;

    public Manager(String name, int rating) {
        super(name);
    }

    @Override
    public void delegate(Employee e) {

    }


}
