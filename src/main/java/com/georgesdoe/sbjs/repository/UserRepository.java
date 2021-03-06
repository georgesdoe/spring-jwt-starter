package com.georgesdoe.sbjs.repository;

import com.georgesdoe.sbjs.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
    @Override
    Optional<User> findById(Long aLong);

    Optional<User> findByUsername(String username);
}
