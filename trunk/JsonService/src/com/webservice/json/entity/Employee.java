package com.webservice.json.entity;

/**
 * Rest Json Spring by Adriyadi Savana 
 */

import java.io.Serializable;
import java.util.Date;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_employee") 
public class Employee implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    private Long id;
    private String name;
 
    @Temporal(TemporalType.DATE)
    private Date birthday;
 
    private String image;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
    
}
