package com.neuedu.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Emp {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.empno
     *
     * @mbg.generated
     */
    private Integer empno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.ename
     *
     * @mbg.generated
     */
    private String ename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.job
     *
     * @mbg.generated
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.mgr
     *
     * @mbg.generated
     */
    private Integer mgr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.hiredate
     *
     * @mbg.generated
     */
    private Date hiredate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.sal
     *
     * @mbg.generated
     */
    private Double sal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.comm
     *
     * @mbg.generated
     */
    private Double comm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.deptno
     *
     * @mbg.generated
     */
    private Integer deptno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.empno
     *
     * @return the value of emp.empno
     *
     * @mbg.generated
     */
    public Integer getEmpno() {
        return empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.empno
     *
     * @param empno the value for emp.empno
     *
     * @mbg.generated
     */
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.ename
     *
     * @return the value of emp.ename
     *
     * @mbg.generated
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.ename
     *
     * @param ename the value for emp.ename
     *
     * @mbg.generated
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.job
     *
     * @return the value of emp.job
     *
     * @mbg.generated
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.job
     *
     * @param job the value for emp.job
     *
     * @mbg.generated
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.mgr
     *
     * @return the value of emp.mgr
     *
     * @mbg.generated
     */
    public Integer getMgr() {
        return mgr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.mgr
     *
     * @param mgr the value for emp.mgr
     *
     * @mbg.generated
     */
    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.hiredate
     *
     * @return the value of emp.hiredate
     *
     * @mbg.generated
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.hiredate
     *
     * @param hiredate the value for emp.hiredate
     *
     * @mbg.generated
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.sal
     *
     * @return the value of emp.sal
     *
     * @mbg.generated
     */
    public Double getSal() {
        return sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.sal
     *
     * @param sal the value for emp.sal
     *
     * @mbg.generated
     */
    public void setSal(Double sal) {
        this.sal = sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.comm
     *
     * @return the value of emp.comm
     *
     * @mbg.generated
     */
    public Double getComm() {
        return comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.comm
     *
     * @param comm the value for emp.comm
     *
     * @mbg.generated
     */
    public void setComm(Double comm) {
        this.comm = comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.deptno
     *
     * @return the value of emp.deptno
     *
     * @mbg.generated
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.deptno
     *
     * @param deptno the value for emp.deptno
     *
     * @mbg.generated
     */
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}