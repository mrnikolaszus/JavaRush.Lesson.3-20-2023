package staff;

import resources.*;

import java.util.ArrayList;
import java.util.Optional;

public abstract class Employee {
    private boolean isWorking;
    private String name;
    private  int dayBonusCount;
    private double rating;
    private final ArrayList<Task> tasks;

    public Employee(String name) {
        this.name = name;
        this.dayBonusCount =0;
        this.rating = 0;
        this.isWorking = false;
        this.tasks = new ArrayList<>();
    }


    // entering workSpace
    abstract public void cameToTheWorkplace(Days d);
    abstract public void leftTheWorkplace();


    // Tasks management
    public ArrayList<Task> getTasks() {
        return this.tasks;
    }
    public void addTask(Task t) {
        this.getTasks().add(t);
    }
    public Task getTask() {
        if(!this.getTasks().isEmpty()){
        return this.getTasks().get(0);}
        else return null;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }


    // later
    public int getBonusCount() {
        return this.dayBonusCount;
    }
    public void setBonusCount(int bonusCount) {
        this.dayBonusCount += bonusCount;
    }




    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee " +
                 name + " " ;
    }
}
