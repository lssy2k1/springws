package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyDao;
import com.kbstar.frame.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("uservice")
public class UserService implements MyService<String, UserDTO> {

//만약 MyDao로 상속받은 두개의 클래스가 있다면 어떻게 찾아? 오류나... 고로 Repository에도 이름을 준다.
//    @Autowired
//    @Qualifier("udao")//어떤게 필요한지 명시해준다
//    MyDao<String, UserDTO> dao;

    //UserDAO dao;//우리회사는 오라클로 쭉 갈거같아. 그럼 인터페이스 없이 그냥 지정해버리는 경우도 있음.

    @Autowired
    UserDAO dao;

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
