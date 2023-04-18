package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("udao")
public class UserDAO implements MyDao<String, UserDTO> {

    @Override
    public void insert(UserDTO userDTO) {
        System.out.println("inserted oracle :" + userDTO);
    }

    @Override
    public void delete(String K) {
        System.out.println("deleted oracle :" + K);
    }

    @Override
    public void update(UserDTO userDTO) {
        System.out.println("updated oracle :" + userDTO);
    }

    @Override
    public UserDTO select(String s) {
        UserDTO user = null;
        user = new UserDTO("id01", "pwd01", "이말숙");
        return user;
    }

    @Override
    public List<UserDTO> select() {
        List<UserDTO> list = new ArrayList<>();
        list.add(new UserDTO("id01", "pwd01", "이말숙"));
        list.add(new UserDTO("id02", "pwd02", "이말숙"));
        list.add(new UserDTO("id03", "pwd03", "이말숙"));
        return list;
    }
}
