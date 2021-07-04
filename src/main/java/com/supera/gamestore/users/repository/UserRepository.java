package com.supera.gamestore.users.repository;

import com.supera.gamestore.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
