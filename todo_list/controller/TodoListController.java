package com.example.todo_list.controller;

import com.example.todo_list.model.TodoListEntity;
import com.example.todo_list.service.TodoListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoListController {

    @Autowired
    private TodoListServiceImpl todoListService;

    @GetMapping("/todo")
    public List<TodoListEntity> getTodoList(){
        return todoListService.getList();
    }

    @PostMapping("/todo")
    public TodoListEntity addTodoTask(@RequestBody TodoListEntity todoListEntity){
        return todoListService.addTask(todoListEntity);
    }
}
