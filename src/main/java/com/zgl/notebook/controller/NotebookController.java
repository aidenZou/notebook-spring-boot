package com.zgl.notebook.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zgl.notebook.entity.Notebook;
import com.zgl.notebook.dao.NotebookMapper;

@Api(description = "Notebook 接口")
@RequestMapping("notebook")
@RestController
public class NotebookController {
    @Autowired
    private NotebookMapper notebookMapper;

    @ApiOperation(value = "列表", notes = "我是 notes，我是 notes，我是 notes")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        return "Hello World...";
    }

    @ApiOperation(value = "查找一条")
    @GetMapping(value = "/find")
    public Notebook find() {
        return notebookMapper.selectByPrimaryKey(1);
    }
}