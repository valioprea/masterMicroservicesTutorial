package com.valisGroup.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    // JPA / Hibernate to talk to the DB
    // At the moment we create a static List. UserDaoService -> Static List

    private static List<User> users = new ArrayList<>();

    private static Integer usersCount = 0;

    static {
        users.add(new User(++usersCount, "John", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Jane", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "Johnny", LocalDate.now().minusYears(45)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

}
