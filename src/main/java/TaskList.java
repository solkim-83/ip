import java.io.*;
import java.util.ArrayList;

/**
 * stores the tasks in a list
 */
public class TaskList implements Serializable {
    ArrayList<Task> taskList = new ArrayList<>();

    private final static long serialVersionUID = 1234L;

    /**
     * shows the entire task list
     */
    public String toString() {
        int counter = 1;
        String taskListString = "";
        for (Task task : taskList) {
            taskListString += counter + ". " + task + "\n";
            counter++;
        }
        return taskListString;
    }

    /**
     * returns the total number of tasks in the task list
     *
     * @return the number of tasks
     */
    public int getTaskLength() {
        return taskList.size();
    }

    /**
     * getter for the task of a particular number
     *
     * @param index of the task
     * @return the task that user wants to retrieve (based on task number)
     */
    public Task getTask(int index) {
        return taskList.get(index - 1);
    }

    /**
     * removes the tasks
     *
     * @param task
     */
    public void removeTask(Task task) {
        taskList.remove(task);
    }

    /**
     * adds the tasks
     *
     * @param task
     */
    public void addTask(Task task) {
        taskList.add(task);
    }
}

