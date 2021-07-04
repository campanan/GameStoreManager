package com.supera.gamestore.repository.users;

import com.supera.gamestore.entity.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
