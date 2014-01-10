package domain.issue;

import domain.Issue;
import domain.Person;

/**
 * User: oleg
 * Date: 10.01.14
 * Time: 14:12
 */
public class Defect implements Issue {

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public void assignTo(Person assignee) {

    }

    @Override
    public void create() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void estimate(int hours) {

    }
}
