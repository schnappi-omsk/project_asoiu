package domain;

/**
 * User: oleg
 * Date: 10.01.14
 * Time: 13:21
 */
public interface Issue {

    boolean isClosed();

    void create();

    void open();

    void assignTo(Person assignee);

    void close();

    void estimate(int hours);

}
