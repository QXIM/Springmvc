package com.neuedu.service.Impl;

import com.neuedu.dao.DeptMapper;
import com.neuedu.entity.Dept;
import com.neuedu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptMapper;
    @Override
    public List<Dept> findAllDept() {
        return deptMapper.selectAll();
    }
}
