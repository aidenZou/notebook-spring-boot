package com.zgl.notebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zgl.notebook.entity.Notebook;
import com.zgl.notebook.dao.NotebookMapper;

@RequestMapping("notebook")
@RestController
public class NotebookController {
    @Autowired
    private NotebookMapper notebookMapper;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        return "Hello World...";
    }

    @GetMapping(value = "/find")
    public Notebook find() {
        return notebookMapper.selectByPrimaryKey(1);
    }
}