import resources.*;
import staff.*;

import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {

            // testing
        Manager John = new Manager("John");
        Lead Bob = new Lead("Bob");
        Developer Mark = new Developer("Mark");
        // new manualSET Day
        Days currentDay = Days.WEDNESDAY;

        // dayStart
        John.cameToTheWorkplace(currentDay);
        Bob.cameToTheWorkplace(currentDay);
        Mark.cameToTheWorkplace(currentDay);

        // makingTasks
        John.addTask(new Task("add new frontendModule"));
        John.addTask(new Task("add new backendModule"));
        John.addTask(new Task("add new DataBase"));
        John.addTask(new Task("fix Bugs"));

        System.out.println(John.getTasks());
        John.delegate(Bob);
        System.out.println( "tasks left "+ John.getTasks().size());


        System.out.println("Bob starts to work");
        System.out.println(Bob.getTasks());
        Bob.delegate(Mark);
        System.out.println( "tasks left "+ Bob.getTasks().size());

        System.out.println("Mark starts to work");
        System.out.println(Mark.getTasks());
        Mark.executeTask();



        John.leftTheWorkplace();
        System.out.println(John +" Today's Bonuses: "+ John.getBonusCount());

        Bob.leftTheWorkplace();
        System.out.println(Bob +" Today's Bonuses: "+ Bob.getBonusCount());

        Mark.leftTheWorkplace();
        System.out.println(Mark +" Today's Bonuses: "+ Mark.getBonusCount());

    }



}