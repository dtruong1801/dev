package com.devops.backend.persistence.repositories;

import com.devops.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dtruong1801 on 8/24/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * Returns a User from given user name or null if not found
     * @param username  The user name
     * @return a User or null if not found
     */
    public User findByUsername(String username);
}
