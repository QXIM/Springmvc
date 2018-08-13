package com.neuedu.controller;

import com.neuedu.entity.Emp;
import com.neuedu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/emp")
public class EmpController {
    @Autowired
    EmpService empService;
    @Autowired
    Emp emp;


    @RequestMapping(value = "/find")
    public ModelAndView findAll(ModelAndView modelAndView){

        List<Emp> list=empService.findAll();
        modelAndView.addObject("emps",list);
       modelAndView.setViewName("emp");
       return modelAndView;

    }

    @RequestMapping(value = "/addView")
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
     /*  emp.setHiredate(Date.parseLong(hiredate));*/
     emp.setSal(Double.parseDouble(sal));
       emp.setComm(Double.parseDouble(comm));
       emp.setDeptno(Integer.parseInt(deptno));


        empService.addEmp(emp);
        /*modelAndView.setViewName("emp");*/
        findAll(modelAndView);
        return modelAndView;
    }



   /* @RequestMapping(value = "/deleteEmp")
    public
*/





}
