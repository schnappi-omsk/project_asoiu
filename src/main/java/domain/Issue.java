package domain;

import java.util.Date;

/**
 * User: oleg
 * Date: 10.01.14
 * Time: 13:21
 */
public interface Issue {

    void open();

    void close(Resolution resolution);

    void assignTo(Staff assignee);

    void estimate(int hours);

    Date startDate();

    Date dueDate();

    Resolution status();

}
