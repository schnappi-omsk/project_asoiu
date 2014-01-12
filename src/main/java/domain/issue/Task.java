package domain.issue;

import domain.Issue;
import domain.Resolution;
import domain.Staff;

import java.util.Date;

/**
 * User: oleg
 * Date: 10.01.14
 * Time: 14:13
 */
public class Task implements Issue {

    private Date startDate;

    private Date dueDate;

    private Staff assignee;

    private Resolution resolution;

    @Override
    public void assignTo(Staff assignee) {
        this.assignee = assignee;
    }

    @Override
    public void open() {
        startDate = new Date(System.currentTimeMillis());
    }

    @Override
    public void estimate(int hours) {
        long creation = startDate.getTime();
        long due = creation + hours;
        dueDate = new Date(due);
    }

    @Override
    public void close(Resolution resolution) {

    }

    @Override
    public Date startDate() {
        return startDate;
    }

    @Override
    public Date dueDate() {
        return dueDate;
    }

    @Override
    public Resolution status() {
        return null;
    }
}
