package com.sirier.domain;
// Generated 2017-8-5 20:09:03 by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * DecidedZone generated by hbm2java
 */
@Entity
@Table(name="bc_decidedzone"
    ,catalog="bos2"
)
public class DecidedZone  implements java.io.Serializable {


     private String id;
     private Staff staff;
     private String name;
     private Set<Subarea> subareas = new HashSet<Subarea>(0);

    public DecidedZone() {
    }

    public DecidedZone(Staff staff, String name, Set<Subarea> subareas) {
       this.staff = staff;
       this.name = name;
       this.subareas = subareas;
    }
   
     @GenericGenerator(name="generator", strategy="uuid")@Id @GeneratedValue(generator="generator")
    
    @Column(name="ID", unique=true, nullable=false, length=32)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STAFF_ID")
    public Staff getStaff() {
        return this.staff;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    
    @Column(name="NAME", length=30)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="decidedZone")
    public Set<Subarea> getSubareas() {
        return this.subareas;
    }
    
    public void setSubareas(Set<Subarea> subareas) {
        this.subareas = subareas;
    }




}


