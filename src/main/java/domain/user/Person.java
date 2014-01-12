package domain.user;

import domain.Role;
import domain.Staff;

/**
 * User: oleg
 * Date: 12.01.14
 * Time: 13:34
 */
public class Person implements Staff {

    private String name;

    private Role role;

    public Person(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Role role() {
        return role;
    }
}
