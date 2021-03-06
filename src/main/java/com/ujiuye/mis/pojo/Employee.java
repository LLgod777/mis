package com.ujiuye.mis.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.eid
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    private Integer eid;


    private  Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.ename
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    private String ename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.esex
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    private String esex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.eage
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    private Integer eage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.telephone
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.hiredate
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date hiredate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.pnum
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    private String pnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.username
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.password
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.remark
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.dfk
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    private Integer dfk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.pic
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    private String pic;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.eid
     *
     * @return the value of employee.eid
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.eid
     *
     * @param eid the value for employee.eid
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.ename
     *
     * @return the value of employee.ename
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.ename
     *
     * @param ename the value for employee.ename
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.esex
     *
     * @return the value of employee.esex
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public String getEsex() {
        return esex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.esex
     *
     * @param esex the value for employee.esex
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setEsex(String esex) {
        this.esex = esex == null ? null : esex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.eage
     *
     * @return the value of employee.eage
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public Integer getEage() {
        return eage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.eage
     *
     * @param eage the value for employee.eage
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setEage(Integer eage) {
        this.eage = eage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.telephone
     *
     * @return the value of employee.telephone
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.telephone
     *
     * @param telephone the value for employee.telephone
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.hiredate
     *
     * @return the value of employee.hiredate
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.hiredate
     *
     * @param hiredate the value for employee.hiredate
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.pnum
     *
     * @return the value of employee.pnum
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public String getPnum() {
        return pnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.pnum
     *
     * @param pnum the value for employee.pnum
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setPnum(String pnum) {
        this.pnum = pnum == null ? null : pnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.username
     *
     * @return the value of employee.username
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.username
     *
     * @param username the value for employee.username
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.password
     *
     * @return the value of employee.password
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.password
     *
     * @param password the value for employee.password
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.remark
     *
     * @return the value of employee.remark
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.remark
     *
     * @param remark the value for employee.remark
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.dfk
     *
     * @return the value of employee.dfk
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public Integer getDfk() {
        return dfk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.dfk
     *
     * @param dfk the value for employee.dfk
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setDfk(Integer dfk) {
        this.dfk = dfk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.pic
     *
     * @return the value of employee.pic
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.pic
     *
     * @param pic the value for employee.pic
     *
     * @mbg.generated Tue Aug 25 19:47:38 CST 2020
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}