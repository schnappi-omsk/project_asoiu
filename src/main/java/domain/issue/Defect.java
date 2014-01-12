package domain.issue;

import domain.Issue;
import domain.Resolution;
import domain.Staff;

import java.util.Date;

/**
 * User: oleg
 * Date: 10.01.14
 * Time: 14:12
 */
public class Defect implements Issue {

    @Override
    public void assignTo(Staff assignee) {

    }

    @Override
    public void open() {

    }

    @Override
    public void close(Resolution resolution) {

    }

    @Override
    public void estimate(int hours) {

    }

    @Override
    public Date startDate() {
        return null;
    }

    @Override
    public Date dueDate() {
        return null;
    }

    @Override
    public Resolution status() {
        return null;
    }
}
