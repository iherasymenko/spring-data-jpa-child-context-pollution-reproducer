package com.example.repository_2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.User;

public interface AdvUserRepository extends JpaRepository<User, String> {
}
