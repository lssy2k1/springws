package com.kbstar.controller;

import com.kbstar.dto.Cust;
import com.kbstar.frame.KBService;
import com.kbstar.service.CustService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
@Controller
@RequestMapping("/cust")
public class CustController {
    @Autowired
    CustService service;

    //Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    String dir = "cust/";
    @RequestMapping("")
    public String main(Model model){
        model.addAttribute("left", dir + "left");
        model.addAttribute("center", dir + "center");
        //logger.info("-----------------------------------------------------------");
        Random r = new Random();
        int inx = r.nextInt(1000)+1;
        log.info(inx+"");
        return "index";
    }
    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("left", dir + "left");
        model.addAttribute("center", dir + "add");
        return "index";
    }
    @RequestMapping("/all")
    public String all(Model model){
        List<Cust> list = null;
        try {
            list = service.get();
        } catch (Exception e) {
            log.info("에러발생");
        }
//        for(Cust obj:list){
//            list.add(obj);
//        }
        model.addAttribute("clist", list);
        model.addAttribute("left", dir + "left");
        model.addAttribute("center", dir + "all");
        return "index";
    }
    @RequestMapping("/get")
    public String add(Model model, String id){
        Cust cust = null;
        try {
            cust = service.get(id);
        } catch (Exception e) {
            log.info("error get id");
        }
        model.addAttribute("gcust", cust);
        model.addAttribute("left", dir + "left");
        model.addAttribute("center", dir + "get");
        return "index";
    }
}
