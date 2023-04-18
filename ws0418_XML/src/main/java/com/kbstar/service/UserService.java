package com.kbstar.service;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyDao;
import com.kbstar.frame.MyService;

import java.util.List;

public class UserService implements MyService<String, UserDTO> {
    MyDao<String, UserDTO> dao;//어떤 dao가 들어올지는 몰라. xml에서 정해줘서 넣어줄거야.
    public UserService(MyDao<String, UserDTO> dao){
        this.dao = dao;
    }
    @Override
    public void register(UserDTO userDTO) {
        dao.insert(userDTO);
        System.out.println("send mail");
    }

    @Override
    public void remove(String s) {
        dao.delete(s);
    }

    @Override
    public void modify(UserDTO userDTO) {
        dao.update(userDTO);
        System.out.println("send mail...");
    }

    @Override
    public UserDTO get(String s) {
        return dao.select(s);
    }

    @Override
    public List<UserDTO> get() {
        return dao.select();
    }
}
