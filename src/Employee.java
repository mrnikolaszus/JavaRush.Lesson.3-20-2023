import java.util.ArrayList;

public abstract class Employee {
    private String name;
    private int rating;
    private ArrayList<Task> tasks;

    public Employee(String name) {
        this.name = name;
        this.rating = 0;
    }



    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
