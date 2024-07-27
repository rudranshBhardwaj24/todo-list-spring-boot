package com.example.todo_list.repository;

import com.example.todo_list.model.TodoListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoListEntity, Integer> {
}
