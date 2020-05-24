package com.niladri_pvt_ltd.basics.dto;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.BitSet;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="covid_DB")
public class Person implements Serializable {
	
	@Id
	@GenericGenerator(name="p_auto",strategy = "com.niladri_pvt_ltd.basics.utils.CustomGenerator")
	@GeneratedValue(generator = "p_auto")
	@Column(name="ID")
	private int id;
	@Column(name="p_name")
	private String name;
	@Column(name="p_address")
	private String address;
	@Column(name="p_phno")
	private BigInteger phoneno;
	@Column(name="p_status")
	private boolean status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BigInteger getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(BigInteger phoneno) {
		this.phoneno = phoneno;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", phoneno=" + phoneno + ", status="
				+ status + "]";
	}
}
