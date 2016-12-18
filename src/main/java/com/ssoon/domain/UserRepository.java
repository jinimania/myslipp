package com.ssoon.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LeeSoohoon
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
