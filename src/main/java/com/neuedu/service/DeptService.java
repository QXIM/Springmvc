package com.neuedu.service;

import com.neuedu.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {

    List<Dept> findAllDept();

}
