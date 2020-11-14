package com.example.demo.controller;

import com.example.demo.model.TodoItem;
import com.example.demo.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private final TodoRepo todoRepo;

    @Autowired
    public TodoController(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }


    @GetMapping
    public List<TodoItem> findAll() {
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem createTodoItem(@Valid @RequestBody @NonNull TodoItem todoItem) {
        return todoRepo.save(todoItem);
    }

    @GetMapping(path = "{id}")
    public TodoItem getTodoItem(@PathVariable("id") Long id) {
        return todoRepo.getOne(id);
    }

    @PutMapping
    public TodoItem update(@Valid @RequestBody @NonNull TodoItem updateTodoItem) {
        return todoRepo.save(updateTodoItem);
    }

    @DeleteMapping(path = "{id}")
    public void deleteTodoItem(@PathVariable("id") Long id) {
        todoRepo.deleteById(id);
    }


}
