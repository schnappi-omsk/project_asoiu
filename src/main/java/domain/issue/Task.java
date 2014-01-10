package domain.issue;

import domain.Issue;
import domain.Person;

import java.util.Date;

/**
 * User: oleg
 * Date: 10.01.14
 * Time: 14:13
 */
public class Task implements Issue {

    private Person assignee;

    private boolean closed;

    private Date creationDate;

    private Date dueDate;

    public Person getAssignee() {
        return assignee;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public boolean isClosed() {
        return closed;
    }

    @Override
    public void assignTo(Person assignee) {
        this.assignee = assignee;
    }

    @Override
    public void create() {
        creationDate = new Date(System.currentTimeMillis());
    }

    @Override
    public void open() {
        closed = false;
    }

    @Override
    public void close() {
        closed = true;
    }

    @Override
    public void estimate(int hours) {
        long creation = creationDate.getTime();
        long due = creation + hours;
        dueDate = new Date(due);
    }
}
