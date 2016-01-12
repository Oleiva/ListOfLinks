package io.github.oleiva.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.github.oleiva.utils.JsonViews;

import org.codehaus.jackson.map.annotate.JsonView;


/**
 * JPA Annotated Pojo that represents a news entry.
 *
 */
@javax.persistence.Entity
public class NewsEntry implements Entity {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private Date date;

	@Column
	private String content;

	@Column
	private String SURNAME;

	@Column
	private String NAME;

	@Column
	private String WEBSITE;

	@Column
	private String CITY;

	@Column
	private String TAGLINE;

	@Column
	private String SUBJECTS;

	@Column
	private String LANGUAGE;

	@Column
	private String TWITTER;

	@Column
	private String GITHUB;

	@Column
	private String INSTAGRAM;

	@Column
	private String FACEBOOK;

	@Column
	private String EMAIL;

	@Column
	private String RATING;


	public NewsEntry()
	{
		this.date = new Date();
	}


	@JsonView(JsonViews.Admin.class)
	public Long getId()
	{
		return this.id;
	}


	@JsonView(JsonViews.User.class)
	public Date getDate()
	{
		return this.date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@JsonView(JsonViews.User.class)
	public String getContent() {
		return this.content;
	}


	public void setContent(String content) {
		this.content = content;
	}

	@JsonView(JsonViews.Admin.class)
	public String getSURNAME() {
		return SURNAME;
	}

	public void setSURNAME(String SURNAME) {
		this.SURNAME = SURNAME;
	}

	@JsonView(JsonViews.Admin.class)
	public String getNAME() {
		return NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	@JsonView(JsonViews.Admin.class)
	public String getWEBSITE() {
		return WEBSITE;
	}

	public void setWEBSITE(String WEBSITE) {
		this.WEBSITE = WEBSITE;
	}

	@JsonView(JsonViews.Admin.class)
	public String getCITY() {
		return CITY;
	}

	public void setCITY(String CITY) {
		this.CITY = CITY;
	}

	@JsonView(JsonViews.Admin.class)
	public String getTAGLINE() {
		return TAGLINE;
	}

	public void setTAGLINE(String TAGLINE) {
		this.TAGLINE = TAGLINE;
	}

	@JsonView(JsonViews.Admin.class)
	public String getSUBJECTS() {
		return SUBJECTS;
	}

	public void setSUBJECTS(String SUBJECTS) {
		this.SUBJECTS = SUBJECTS;
	}

	@JsonView(JsonViews.Admin.class)
	public String getLANGUAGE() {
		return LANGUAGE;
	}

	public void setLANGUAGE(String LANGUAGE) {
		this.LANGUAGE = LANGUAGE;
	}

	@JsonView(JsonViews.Admin.class)
	public String getTWITTER() {
		return TWITTER;
	}

	public void setTWITTER(String TWITTER) {
		this.TWITTER = TWITTER;
	}

	@JsonView(JsonViews.Admin.class)
	public String getGITHUB() {
		return GITHUB;
	}

	public void setGITHUB(String GITHUB) {
		this.GITHUB = GITHUB;
	}

	@JsonView(JsonViews.Admin.class)
	public String getINSTAGRAM() {
		return INSTAGRAM;
	}

	public void setINSTAGRAM(String INSTAGRAM) {
		this.INSTAGRAM = INSTAGRAM;
	}

	@JsonView(JsonViews.Admin.class)
	public String getFACEBOOK() {
		return FACEBOOK;
	}

	public void setFACEBOOK(String FACEBOOK) {
		this.FACEBOOK = FACEBOOK;
	}

	@JsonView(JsonViews.Admin.class)
	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}

	@JsonView(JsonViews.Admin.class)
	public String getRATING() {
		return RATING;
	}

	public void setRATING(String RATING) {
		this.RATING = RATING;
	}

//	@Override
//	public String toString() {
//		return String.format("NewsEntry[%d, %s]", this.id, this.content);
//	}

}