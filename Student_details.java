




package com.PS.JFSD_HQL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student_details {
@Id
	int sid;
	  String sname;
	  String gender;
	  String dept;
	  String pgm;
	  String dob;
	  int phno;
	  String gs;
	  int cgpa;
	  int nblogs;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPgm() {
		return pgm;
	}
	public void setPgm(String pgm) {
		this.pgm = pgm;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getGs() {
		return gs;
	}
	public void setGs(String gs) {
		this.gs = gs;
	}
	public int getCgpa() {
		return cgpa;
	}
	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	public int getNblogs() {
		return nblogs;
	}
	public void setNblogs(int nblogs) {
		this.nblogs = nblogs;
	}
	@Override
	public String toString() {
		return "Student_details [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", dept=" + dept + ", pgm="
				+ pgm + ", dob=" + dob + ", phno=" + phno + ", gs=" + gs + ", cgpa=" + cgpa + ", nblogs=" + nblogs
				+ "]";
	}
}
