package com.csdj.oaserviceimpl;

import com.csdj.oadao.userMapper;
import com.csdj.pojo.Users;
import com.csdj.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements userService {

    @Autowired
    userMapper mapper;

    @Override
    public List<Users> getAll() {
        return mapper.selectAll();
    }



}
