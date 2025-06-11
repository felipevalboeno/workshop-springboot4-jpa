package com.valbtecnologia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valbtecnologia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
