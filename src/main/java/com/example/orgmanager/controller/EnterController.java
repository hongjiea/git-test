package com.example.orgmanager.controller;


import com.example.orgmanager.entity.Enter;
import com.example.orgmanager.model.ResultModel;
import com.example.orgmanager.service.EnterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enter")
public class EnterController {
    @Autowired
    private EnterService enterService;

    @RequestMapping("all")
    public ResultModel all(){
        return enterService.all();
    }

    @RequestMapping("query")
    public ResultModel query() {
        return enterService.query();
    }

    @RequestMapping("delete")
    public ResultModel delete(Integer eid) {
        return enterService.delete(eid);
    }
    @RequestMapping("insert")
    public ResultModel insert(Enter enter)
    {
        return enterService.insert(enter) ;
    }
}
