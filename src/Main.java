import java.util.ArrayList;
import java.util.Scanner;
// Adam A. Garantche
// February, 2 2023
// CSCI 73797
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Task> myList = new ArrayList<>();
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(5) Check Priority");
        System.out.println("(0) Exit.");
        try {
            int selection = input.nextInt();
            input.nextLine();


            while (selection > 0) {
                if (selection == 1) {
                    addTask(myList);
                } else if (selection == 2) {
                    removeTask(myList);
                } else if (selection == 3) {
                    updateTask(myList);
                } else if (selection == 4) {
                    System.out.println(myList);
                } else if (selection == 0) {
                    System.exit(0);
                } else if (selection == 5){
                    prioCheck(myList);
                }
                System.out.println("Please make a selection.....");
                selection = input.nextInt();
                input.nextLine();
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }

    static void addTask (ArrayList < Task > a) {
        System.out.println("Please enter a title for the task:");
        String title = input.nextLine();

        System.out.println("Please enter a description for the task");
        String desc = input.nextLine();

        System.out.println("Please enter a priority for the task:");
        int priority = input.nextInt();

        Task aNewTask = new Task(title, desc, priority);

        a.add(aNewTask);
    }
// This function add Tasks List


    static ArrayList<Task> removeTask (ArrayList < Task > a) {
        System.out.println("What index would you like to remove:");
        String task = input.nextLine();
        a.remove(Integer.parseInt(task));
        return a;
    }

    static ArrayList<Task> updateTask (ArrayList < Task > a) {
        System.out.println("What task would you like to update?");
        int update = input.nextInt();
        input.nextLine();

        System.out.println("Please enter a title for the task:");
        String title = input.nextLine();

        System.out.println("Please enter a description for the task");
        String desc = input.nextLine();

        System.out.println("Please enter a priority for the task:");
        int priority = input.nextInt();

        Task aNewTask = new Task(title, desc, priority);

        a.set(update, aNewTask);
        return a;
    }

    static ArrayList<Task> prioCheck (ArrayList<Task>a){
        System.out.println("What would you like me to find");
        for(Task items:a){
            int userInput = input.nextInt();
            int prio = items.getPriority();
            if(prio == userInput){
                System.out.println(items);
            }
        }
        return a;
    }

}

class Task {
    private String title;
    private String description;
    private int priority;

    public Task(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}

class Remove {
    private String title;
    private String description;
    private int priority;

    public Remove(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "remove{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}