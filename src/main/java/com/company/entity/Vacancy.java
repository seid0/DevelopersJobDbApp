/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Seid
 */
@Entity
@Table(name = "vacancy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vacancy.findAll", query = "SELECT v FROM Vacancy v"),
    @NamedQuery(name = "Vacancy.findById", query = "SELECT v FROM Vacancy v WHERE v.id = :id"),
    @NamedQuery(name = "Vacancy.findBySalary", query = "SELECT v FROM Vacancy v WHERE v.salary = :salary"),
    @NamedQuery(name = "Vacancy.findByJobName", query = "SELECT v FROM Vacancy v WHERE v.jobName = :jobName"),
    @NamedQuery(name = "Vacancy.findByCity", query = "SELECT v FROM Vacancy v WHERE v.city = :city"),
    @NamedQuery(name = "Vacancy.findByAge", query = "SELECT v FROM Vacancy v WHERE v.age = :age"),
    @NamedQuery(name = "Vacancy.findByEducation", query = "SELECT v FROM Vacancy v WHERE v.education = :education"),
    @NamedQuery(name = "Vacancy.findByExperience", query = "SELECT v FROM Vacancy v WHERE v.experience = :experience")})
public class Vacancy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "salary", nullable = false, length = 255)
    private String salary;
    @Basic(optional = false)
    @Column(name = "job_name", nullable = false, length = 255)
    private String jobName;
    @Basic(optional = false)
    @Column(name = "city", nullable = false, length = 255)
    private String city;
    @Basic(optional = false)
    @Column(name = "age", nullable = false, length = 255)
    private String age;
    @Basic(optional = false)
    @Lob
    @Column(name = "job_information", nullable = false, length = 65535)
    private String jobInformation;
    @Basic(optional = false)
    @Lob
    @Column(name = "requirements", nullable = false, length = 65535)
    private String requirements;
    @Basic(optional = false)
    @Column(name = "education", nullable = false, length = 65)
    private String education;
    @Basic(optional = false)
    @Column(name = "experience", nullable = false, length = 255)
    private String experience;

    public Vacancy() {
    }

    public Vacancy(Integer id) {
        this.id = id;
    }

    public Vacancy(Integer id, String salary, String jobName, String city, String age, String jobInformation, String requirements, String education, String experience) {
        this.id = id;
        this.salary = salary;
        this.jobName = jobName;
        this.city = city;
        this.age = age;
        this.jobInformation = jobInformation;
        this.requirements = requirements;
        this.education = education;
        this.experience = experience;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getJobInformation() {
        return jobInformation;
    }

    public void setJobInformation(String jobInformation) {
        this.jobInformation = jobInformation;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacancy)) {
            return false;
        }
        Vacancy other = (Vacancy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entity.Vacancy[ id=" + id + " ]";
    }
    
}
