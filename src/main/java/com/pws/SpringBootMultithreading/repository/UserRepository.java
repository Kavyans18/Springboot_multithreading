package com.pws.SpringBootMultithreading.repository;

import com.pws.SpringBootMultithreading.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
