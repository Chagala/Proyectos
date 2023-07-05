package com.baz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baz.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
