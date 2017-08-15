package com.sirier.domain;
// Generated 2017-8-15 19:42:56 by Hibernate Tools 3.2.2.GA


import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * WorkOrderManage generated by hbm2java
 */
@Entity
@Table(name="qp_workordermanage"
    ,catalog="bos2"
)
public class WorkOrderManage  implements java.io.Serializable {


     private String id;
     private String arrivecity;
     private String product;
     private Integer num;
     private Integer weight;
     private String floadreqr;
     private String prodtimelimit;
     private String prodtype;
     private String sendername;
     private String senderphone;
     private String senderaddr;
     private String receivername;
     private String receiverphone;
     private String receiveraddr;
     private Integer feeitemnum;
     private Integer actlweit;
     private String vol;
     private String managercheck;
     private Date updatetime;

    public WorkOrderManage() {
    }

    public WorkOrderManage(String arrivecity, String product, Integer num, Integer weight, String floadreqr, String prodtimelimit, String prodtype, String sendername, String senderphone, String senderaddr, String receivername, String receiverphone, String receiveraddr, Integer feeitemnum, Integer actlweit, String vol, String managercheck, Date updatetime) {
       this.arrivecity = arrivecity;
       this.product = product;
       this.num = num;
       this.weight = weight;
       this.floadreqr = floadreqr;
       this.prodtimelimit = prodtimelimit;
       this.prodtype = prodtype;
       this.sendername = sendername;
       this.senderphone = senderphone;
       this.senderaddr = senderaddr;
       this.receivername = receivername;
       this.receiverphone = receiverphone;
       this.receiveraddr = receiveraddr;
       this.feeitemnum = feeitemnum;
       this.actlweit = actlweit;
       this.vol = vol;
       this.managercheck = managercheck;
       this.updatetime = updatetime;
    }
   
     @GenericGenerator(name="generator", strategy="uuid")@Id @GeneratedValue(generator="generator")
    
    @Column(name="ID", unique=true, nullable=false, length=32)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="ARRIVECITY", length=20)
    public String getArrivecity() {
        return this.arrivecity;
    }
    
    public void setArrivecity(String arrivecity) {
        this.arrivecity = arrivecity;
    }
    
    @Column(name="PRODUCT", length=20)
    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }
    
    @Column(name="NUM", precision=8, scale=0)
    public Integer getNum() {
        return this.num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }
    
    @Column(name="WEIGHT", precision=8, scale=0)
    public Integer getWeight() {
        return this.weight;
    }
    
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    @Column(name="FLOADREQR")
    public String getFloadreqr() {
        return this.floadreqr;
    }
    
    public void setFloadreqr(String floadreqr) {
        this.floadreqr = floadreqr;
    }
    
    @Column(name="PRODTIMELIMIT", length=40)
    public String getProdtimelimit() {
        return this.prodtimelimit;
    }
    
    public void setProdtimelimit(String prodtimelimit) {
        this.prodtimelimit = prodtimelimit;
    }
    
    @Column(name="PRODTYPE", length=40)
    public String getProdtype() {
        return this.prodtype;
    }
    
    public void setProdtype(String prodtype) {
        this.prodtype = prodtype;
    }
    
    @Column(name="SENDERNAME", length=20)
    public String getSendername() {
        return this.sendername;
    }
    
    public void setSendername(String sendername) {
        this.sendername = sendername;
    }
    
    @Column(name="SENDERPHONE", length=20)
    public String getSenderphone() {
        return this.senderphone;
    }
    
    public void setSenderphone(String senderphone) {
        this.senderphone = senderphone;
    }
    
    @Column(name="SENDERADDR", length=200)
    public String getSenderaddr() {
        return this.senderaddr;
    }
    
    public void setSenderaddr(String senderaddr) {
        this.senderaddr = senderaddr;
    }
    
    @Column(name="RECEIVERNAME", length=20)
    public String getReceivername() {
        return this.receivername;
    }
    
    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }
    
    @Column(name="RECEIVERPHONE", length=20)
    public String getReceiverphone() {
        return this.receiverphone;
    }
    
    public void setReceiverphone(String receiverphone) {
        this.receiverphone = receiverphone;
    }
    
    @Column(name="RECEIVERADDR", length=200)
    public String getReceiveraddr() {
        return this.receiveraddr;
    }
    
    public void setReceiveraddr(String receiveraddr) {
        this.receiveraddr = receiveraddr;
    }
    
    @Column(name="FEEITEMNUM", precision=8, scale=0)
    public Integer getFeeitemnum() {
        return this.feeitemnum;
    }
    
    public void setFeeitemnum(Integer feeitemnum) {
        this.feeitemnum = feeitemnum;
    }
    
    @Column(name="ACTLWEIT", precision=8, scale=0)
    public Integer getActlweit() {
        return this.actlweit;
    }
    
    public void setActlweit(Integer actlweit) {
        this.actlweit = actlweit;
    }
    
    @Column(name="VOL", length=20)
    public String getVol() {
        return this.vol;
    }
    
    public void setVol(String vol) {
        this.vol = vol;
    }
    
    @Column(name="MANAGERCHECK", length=1)
    public String getManagercheck() {
        return this.managercheck;
    }
    
    public void setManagercheck(String managercheck) {
        this.managercheck = managercheck;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="UPDATETIME", length=0)
    public Date getUpdatetime() {
        return this.updatetime;
    }
    
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }




}


