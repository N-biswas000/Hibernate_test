package com.niladri_pvt_ltd.basics.utils;
import java.math.BigInteger;
import java.util.BitSet;

import com.niladri_pvt_ltd.basics.dao.PersonDao;
import com.niladri_pvt_ltd.basics.dto.Person;

public class Test {
public static void main(String[] args) {
	Person person = new Person();
	//person.setId(113015);
	person.setName("Abhik");
	person.setAddress("Bankura");
	person.setPhoneno(new BigInteger("32145678"));
	person.setStatus(true);
	
	PersonDao personDao = new PersonDao();
	personDao.savePerson(person);
	
	/*
	PersonDao personDao = new PersonDao();
	Person persondb = personDao.getPersonDetails(113012);
	System.out.println(persondb);
	
	
	PersonDao personDao = new PersonDao();
	String details = personDao.updateDetails(113012, true, "Bangalore");
	System.out.println(details);
	
	PersonDao personDao = new PersonDao();
	personDao.deletePerson(113012);
	*/
}
}
