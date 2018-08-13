package com.neuedu.service;

import com.neuedu.entity.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpService {

    List<Emp> findAll();
    void addEmp(Emp emp);
}
