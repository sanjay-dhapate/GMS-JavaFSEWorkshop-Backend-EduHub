package com.atos.eduhub.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Mentor {
	
	private int 		availabilityid;
	private int 		userid;
	private Timestamp 	startdatetime;
	private Timestamp 	enddatetime;
	private String 		mentoringskill;
	private String 		mentoredhours;
	private String 		mentorrating;
	private String 		aboutmentor;
	private Timestamp 	lastupdatedon; 
	
	
	public Mentor() {
		// TODO Auto-generated constructor stub
	}

	public int getAvailabilityid() {
		return availabilityid;
	}

	public void setAvailabilityid(int availabilityid) {
		this.availabilityid = availabilityid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Timestamp getStartdatetime() {
		return startdatetime;
	}

	public void setStartdatetime(Timestamp startdatetime) {
		this.startdatetime = startdatetime;
	}

	public Timestamp getEnddatetime() {
		return enddatetime;
	}

	public void setEnddatetime(Timestamp enddatetime) {
		this.enddatetime = enddatetime;
	}

	public String getMentoringskill() {
		return mentoringskill;
	}

	public void setMentoringskill(String mentoringskill) {
		this.mentoringskill = mentoringskill;
	}

	public String getMentoredhours() {
		return mentoredhours;
	}

	public void setMentoredhours(String mentoredhours) {
		this.mentoredhours = mentoredhours;
	}

	public String getMentorrating() {
		return mentorrating;
	}


	public void setMentorrating(String mentorrating) {
		this.mentorrating = mentorrating;
	}


	public String getAboutmentor() {
		return aboutmentor;
	}


	public void setAboutmentor(String aboutmentor) {
		this.aboutmentor = aboutmentor;
	}


	public Timestamp getLastupdatedon() {
		return lastupdatedon;
	}


	public void setLastupdatedon() {
		this.lastupdatedon = Timestamp.valueOf(LocalDateTime.now());
	}


	@Override
	public String toString() {
		return "MentorModel [availabilityid=" + availabilityid + ", userid=" + userid + ", startdatetime="
				+ startdatetime + ", enddatetime=" + enddatetime + ", mentoringskill=" + mentoringskill
				+ ", mentoredhours=" + mentoredhours + ", mentorrating=" + mentorrating + ", aboutmentor=" + aboutmentor
				+ ", lastupdatedon=" + lastupdatedon + "]";
	}	
}

/* Adding comment */