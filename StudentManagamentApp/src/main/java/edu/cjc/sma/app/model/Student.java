package edu.cjc.sma.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int studentId;
	private String studentFullName;
	private String studentEmail;
	private byte studentAge;
   private String studentCollegeName;
   private String studentCourseName;
   private String studentBatchNumber;
   private String batchMode;
   private double feesPaid;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentFullName() {
	return studentFullName;
}
public void setStudentFullName(String studentFullName) {
	this.studentFullName = studentFullName;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public byte getStudentAge() {
	return studentAge;
}
public void setStudentAge(byte studentAge) {
	this.studentAge = studentAge;
}
public String getStudentCollegeName() {
	return studentCollegeName;
}
public void setStudentCollegeName(String studentCollegeName) {
	this.studentCollegeName = studentCollegeName;
}
public String getStudentCourseName() {
	return studentCourseName;
}
public void setStudentCourseName(String studentCourseName) {
	this.studentCourseName = studentCourseName;
}
public String getStudentBatchNumber() {
	return studentBatchNumber;
}
public void setStudentBatchNumber(String studentBatchNumber) {
	this.studentBatchNumber = studentBatchNumber;
}
public String getBatchMode() {
	return batchMode;
}
public void setBatchMode(String batchMode) {
	this.batchMode = batchMode;
}
public double getFeesPaid() {
	return feesPaid;
}
public void setFeesPaid(double feesPaid) {
	this.feesPaid = feesPaid;
}
   
   
}
