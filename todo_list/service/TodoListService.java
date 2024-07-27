package com.example.todo_list.service;

import com.example.todo_list.model.TodoListEntity;
import java.util.List;
import com.example.todo_list.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface TodoListService {
    public List<TodoListEntity> getList();
    public TodoListEntity addTask(TodoListEntity todoListEntity);
    public TodoListEntity updateTask();
    public TodoListEntity deleteTask();
}
