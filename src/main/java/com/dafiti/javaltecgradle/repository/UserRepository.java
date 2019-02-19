package com.dafiti.javaltecgradle.repository;

import com.dafiti.javaltecgradle.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, String> {
}
