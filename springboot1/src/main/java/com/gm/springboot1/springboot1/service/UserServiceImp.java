package com.gm.springboot1.springboot1.service;

import com.gm.springboot1.springboot1.dao.EuserMapper;
import com.gm.springboot1.springboot1.entity.Euser;
import com.gm.springboot1.springboot1.entity.EuserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    EuserMapper euserMapper;
    @Override
    public List<Euser> selectAll() {
        EuserExample euserExample=new EuserExample();
        return euserMapper.selectByExample(euserExample);
    }
}
