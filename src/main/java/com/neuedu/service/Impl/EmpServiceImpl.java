package com.neuedu.service.Impl;

import com.neuedu.dao.EmpMapper;
import com.neuedu.entity.Emp;
import com.neuedu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {

        return empMapper.selectAll();
    }

    @Override
    public void addEmp(Emp emp) {
        empMapper.insert(emp);
    }

    @Override
    public void deleteEmp(Integer empno) {
        empMapper.deleteByPrimaryKey(empno);
    }

    @Override
    public Emp findByEmpno(Integer empno) {

        return empMapper.selectByPrimaryKey(empno);
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateByPrimaryKey(emp);

    }
}
