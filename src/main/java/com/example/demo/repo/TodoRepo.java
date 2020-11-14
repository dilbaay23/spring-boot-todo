package com.example.demo.repo;

import com.example.demo.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface TodoRepo extends JpaRepository<TodoItem, Long> {

}
