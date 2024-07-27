package com.example.todo_list.service;

import com.example.todo_list.model.TodoListEntity;
import com.example.todo_list.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TodoListServiceImpl implements TodoListService {

    @Autowired
    private TodoListRepository todoListRepository;

    @Override
    public List<TodoListEntity> getList() {
        List<TodoListEntity> listOfTask =todoListRepository.findAll();
        return listOfTask;
    }

    @Override
    public TodoListEntity addTask(@RequestBody TodoListEntity todoListEntity) {
        TodoListEntity addedTask = todoListRepository.save(todoListEntity);
        return addedTask;
    }

    @Override
    public TodoListEntity updateTask() {
        return null;
    }

    @Override
    public TodoListEntity deleteTask() {
        return null;
    }
}
