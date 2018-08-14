package com.neuedu.controller;

import com.neuedu.entity.Dept;
import com.neuedu.entity.Emp;
import com.neuedu.service.DeptService;
import com.neuedu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/emp")
public class EmpController {
    @Autowired
    EmpService empService;
    @Autowired
    DeptService deptService;
    @Autowired
    Emp emp;


    @RequestMapping(value = "/find")
    public ModelAndView findAll(ModelAndView modelAndView){

        List<Emp> list=empService.findAll();
        modelAndView.addObject("emps",list);
       modelAndView.setViewName("emp");
       return modelAndView;

    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public ModelAndView addView(ModelAndView modelAndView){
        List<Dept> depts= deptService.findAllDept();
        modelAndView.addObject("depts",depts);
        List<Emp> list=empService.findAll();
        modelAndView.addObject("emps",list);
        modelAndView.setViewName("addView");
        return modelAndView;
    }

    /*@RequestMapping(value = "/addView")
    public ModelAndView addView(ModelAndView modelAndView){
        modelAndView.setViewName("addView");
        return modelAndView;

    }
    @RequestMapping(value = "/addEmp")
    public ModelAndView addEmp(String empno,String ename,String job,String mgr,String hiredate,String sal, String comm,String deptno,ModelAndView modelAndView){
       emp.setEmpno(Integer.parseInt(empno));
        emp.setEname(ename);
       emp.setJob(job);
       emp.setMgr(Integer.parseInt(mgr));
     *//*  emp.setHiredate(Date.parseLong(hiredate));*//*
     emp.setSal(Double.parseDouble(sal));
       emp.setComm(Double.parseDouble(comm));
       emp.setDeptno(Integer.parseInt(deptno));


        empService.addEmp(emp);
        *//*modelAndView.setViewName("emp");*//*
        findAll(modelAndView);
        return modelAndView;
    }*/
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addEmp(String empno,String ename,String job,String mgr,String hiredate,String sal, String comm,String deptno,ModelAndView modelAndView){
        emp.setEmpno(Integer.parseInt(empno));
        emp.setEname(ename);
        emp.setJob(job);
        emp.setMgr(Integer.parseInt(mgr));
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            emp.setHiredate(simpleDateFormat.parse(hiredate));
            emp.setSal(Double.parseDouble(sal));
            emp.setComm(Double.parseDouble(comm));
            System.out.println(deptno);
            emp.setDeptno(Integer.parseInt(deptno));
            empService.addEmp(emp);
            return "forward:find";

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "forward:find";
    }

    @RequestMapping(value = "/delete/{emp.empno}")
    public String deleteEmp(@PathVariable("emp.empno") Integer empno){

        empService.deleteEmp(empno);


        return "forward:/emp/find";

    }
    @RequestMapping(value = "update/{emp.empno}",method = RequestMethod.GET)
    public  ModelAndView update(@PathVariable("emp.empno") Integer empno,ModelAndView modelAndView){


        Emp emp=empService.findByEmpno(empno);
        modelAndView.addObject("emp",emp);
        List<Dept> depts= deptService.findAllDept();
        modelAndView.addObject("depts",depts);
        List<Emp> emps=empService.findAll();
        modelAndView.addObject("emps",emps);
        modelAndView.setViewName("updateView");

        return modelAndView;
    }

    @RequestMapping(value = "update/{emp.empno}",method = RequestMethod.POST)
    public String updateEmp(@PathVariable("emp.empno") String empno,String ename,String job,String mgr,String hiredate,String sal, String comm,String deptno,ModelAndView modelAndView){
        emp.setEmpno(Integer.parseInt(empno));
        emp.setEname(ename);
        emp.setJob(job);
        emp.setMgr(Integer.parseInt(mgr));
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            emp.setHiredate(simpleDateFormat.parse(hiredate));
            emp.setSal(Double.parseDouble(sal));
            emp.setComm(Double.parseDouble(comm));
            System.out.println(deptno);
            emp.setDeptno(Integer.parseInt(deptno));
            empService.updateEmp(emp);
            return "forward:/emp/find";

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "forward:/emp/find";
    }








}
