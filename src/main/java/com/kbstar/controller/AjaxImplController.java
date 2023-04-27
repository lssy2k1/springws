package com.kbstar.controller;
//일반적인 controller는 요청이 들어오면 화면이 리턴됨.
//여기서는 부분만 바꿔주기 위해 따로 컨트롤러를 만듦.

import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.dto.Marker;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
public class AjaxImplController {
    @RequestMapping("/getservertime")
    public Object getservertime(){
        Date date = new Date();
        return date;
    }
    @RequestMapping("/checkid")
    public Object checkid(String id){
        int result = 0;//중복 아니면 0 보낸다고 가정
        if(id.equals("qqqq") || id.equals("aaaa") || id.equals("ssss")){
            result = 1;//중복은 세개밖에 없다고 가정
        }
        return result;
    }
    @RequestMapping("/getdata")//db에 있는 데이터를 가져와서 json으로 바꿔서 보내줄것.
    public Object getdata(){
        List<Cust> list = new ArrayList<>();
        list.add(new Cust("id01","pwd01","james1"));
        list.add(new Cust("id02","pwd02","james2"));
        list.add(new Cust("id03","pwd03","james3"));
        list.add(new Cust("id04","pwd04","james4"));
        list.add(new Cust("id05","pwd05","james5"));

        //Java Object --------> JSON
        //JSON(JavaScript Object Notation)//자바스크립트로 오브젝트를 표현하는 방식
        //[{},{},{},...]
        JSONArray ja = new JSONArray();
        for(Cust obj:list){
            JSONObject jo = new JSONObject();
            Random r = new Random();
            int i = r.nextInt(100) +1 ;
            jo.put("id",obj.getId());
            jo.put("pwd",obj.getPwd());
            jo.put("name",obj.getName()+i);
            ja.add(jo);
        }
        return ja;
    }
    @RequestMapping("/markers")
    public Object markers(String loc){
        List<Marker> list = new ArrayList<>();
        if(loc.equals("s")){
            list.add(new Marker(100, "피자헛", "http://www.nate.com", 37.5766686, 127.0722721, "a.jpg", "s"));
            list.add(new Marker(101, "파파존스", "http://www.naver.com", 37.5066686, 127.0700721, "b.jpg", "s"));
            list.add(new Marker(102, "오뚜기", "http://www.daum.com", 37.5760086, 127.0722700, "c.jpg", "s"));
        }else if(loc.equals("b")){
            list.add(new Marker(103, "부산헛", "http://www.nate.com", 35.1531696, 129.110066, "a.jpg", "b"));
            list.add(new Marker(104, "부산존스", "http://www.naver.com", 35.1500696, 129.108666, "b.jpg", "b"));
            list.add(new Marker(105, "부산뚜기", "http://www.daum.com", 35.1031696, 129.118600, "c.jpg", "b"));
        }else if(loc.equals("j")){
            list.add(new Marker(106, "제주헛", "http://www.nate.com", 33.2001708, 126.5036786, "a.jpg", "j"));
            list.add(new Marker(107, "제주스", "http://www.naver.com", 33.2500708, 126.563086, "b.jpg", "j"));
            list.add(new Marker(108, "제주뚜기", "http://www.daum.com", 33.2501008, 126.563670, "c.jpg", "j"));
        }
        JSONArray ja = new JSONArray();
        for (Marker obj:list) {
            JSONObject jo = new JSONObject();
            jo.put("id", obj.getId());
            jo.put("title", obj.getTitle());
            jo.put("target", obj.getTarget());
            jo.put("lat", obj.getLat());
            jo.put("lng", obj.getLng());
            jo.put("img", obj.getImg());
            jo.put("loc", obj.getLoc());
            ja.add(jo);
        }
        return ja;
    }
}
