package com.sirier.domain;
// Generated 2017-8-3 15:28:13 by Hibernate Tools 3.2.2.GA


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
 * Standard generated by hbm2java
 */
@Entity
@Table(name="t_standard"
    ,catalog="bos2"
    , uniqueConstraints = @UniqueConstraint(columnNames="name") 
)
public class Standard  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Integer minWeight;
     private Integer maxWeight;
     private Integer minLength;
     private Integer maxLength;
     private Date operationTime;
     private String operator;
     private String operatorCompany;
     private Integer deltag;

    public Standard() {
    }

	
    public Standard(Date operationTime) {
        this.operationTime = operationTime;
    }
    public Standard(String name, Integer minWeight, Integer maxWeight, Integer minLength, Integer maxLength, Date operationTime, String operator, String operatorCompany, Integer deltag) {
       this.name = name;
       this.minWeight = minWeight;
       this.maxWeight = maxWeight;
       this.minLength = minLength;
       this.maxLength = maxLength;
       this.operationTime = operationTime;
       this.operator = operator;
       this.operatorCompany = operatorCompany;
       this.deltag = deltag;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="name", unique=true, length=20)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="minWeight")
    public Integer getMinWeight() {
        return this.minWeight;
    }
    
    public void setMinWeight(Integer minWeight) {
        this.minWeight = minWeight;
    }
    
    @Column(name="maxWeight")
    public Integer getMaxWeight() {
        return this.maxWeight;
    }
    
    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    @Column(name="minLength")
    public Integer getMinLength() {
        return this.minLength;
    }
    
    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }
    
    @Column(name="maxLength")
    public Integer getMaxLength() {
        return this.maxLength;
    }
    
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="operationTime", nullable=false, length=0)
    public Date getOperationTime() {
        return this.operationTime;
    }
    
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }
    
    @Column(name="operator", length=20)
    public String getOperator() {
        return this.operator;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    @Column(name="operatorCompany")
    public String getOperatorCompany() {
        return this.operatorCompany;
    }
    
    public void setOperatorCompany(String operatorCompany) {
        this.operatorCompany = operatorCompany;
    }
    
    @Column(name="deltag")
    public Integer getDeltag() {
        return this.deltag;
    }
    
    public void setDeltag(Integer deltag) {
        this.deltag = deltag;
    }

    @Override
    public String toString() {
        return "Standard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", minWeight=" + minWeight +
                ", maxWeight=" + maxWeight +
                ", minLength=" + minLength +
                ", maxLength=" + maxLength +
                ", operationTime=" + operationTime +
                ", operator='" + operator + '\'' +
                ", operatorCompany='" + operatorCompany + '\'' +
                ", deltag=" + deltag +
                '}';
    }
}


