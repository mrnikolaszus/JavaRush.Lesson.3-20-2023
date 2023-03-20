public class Developer extends Employee implements Executor {
    private final int DAY_BONUS = 3;

    public Developer(String name, int rating) {
        super(name);
    }

    @Override
    public void execute(Task t) {

    }

}
