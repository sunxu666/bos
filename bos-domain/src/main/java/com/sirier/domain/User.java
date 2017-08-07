package com.sirier.domain;
// Generated 2017-8-3 15:28:13 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="t_user"
    ,catalog="bos2"
    , uniqueConstraints = {@UniqueConstraint(columnNames="username"), @UniqueConstraint(columnNames="telephone")} 
)
public class User  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String password;
     private BigDecimal salary;
     private Date birthday;
     private String gender;
     private String station;
     private String telephone;
     private String remark;

    public User() {
    }

	
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User(String username, String password, BigDecimal salary, Date birthday, String gender, String station, String telephone, String remark) {
       this.username = username;
       this.password = password;
       this.salary = salary;
       this.birthday = birthday;
       this.gender = gender;
       this.station = station;
       this.telephone = telephone;
       this.remark = remark;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="username", unique=true, nullable=false, length=30)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Column(name="password", nullable=false, length=32)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="salary", precision=10)
    public BigDecimal getSalary() {
        return this.salary;
    }
    
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="birthday", length=0)
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    @Column(name="gender", length=10)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Column(name="station", length=40)
    public String getStation() {
        return this.station;
    }
    
    public void setStation(String station) {
        this.station = station;
    }
    
    @Column(name="telephone", unique=true, length=11)
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Column(name="remark")
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", station='" + station + '\'' +
                ", telephone='" + telephone + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}


