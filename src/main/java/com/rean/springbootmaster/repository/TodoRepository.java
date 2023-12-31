package com.rean.springbootmaster.repository;

import com.rean.springbootmaster.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    Optional<Todo> findFirstByIdAndStatus(Long id, String status);
    Optional<Todo> findFirstById(Long id);

}
