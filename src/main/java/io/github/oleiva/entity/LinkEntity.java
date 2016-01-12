package io.github.oleiva.entity;

/**
 * Created by OleIva on 12.01.2016.
 */

import io.github.oleiva.utils.JsonViews;
import org.codehaus.jackson.map.annotate.JsonView;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.github.oleiva.utils.JsonViews;

import org.codehaus.jackson.map.annotate.JsonView;

/**
 * JPA Annotated Pojo that represents a news entry.
 */

@javax.persistence.Entity
public class LinkEntity implements Entity {

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

    public LinkEntity(){}
    public LinkEntity(Date date, String content, String SURNAME, String NAME, String WEBSITE, String CITY,
                      String TAGLINE, String SUBJECTS, String LANGUAGE, String TWITTER, String GITHUB,
                      String INSTAGRAM, String FACEBOOK, String EMAIL, String RATING) {
        this.date = date;
        this.content = content;
        this.SURNAME = SURNAME;
        this.NAME = NAME;
        this.WEBSITE = WEBSITE;
        this.CITY = CITY;
        this.TAGLINE = TAGLINE;
        this.SUBJECTS = SUBJECTS;
        this.LANGUAGE = LANGUAGE;
        this.TWITTER = TWITTER;
        this.GITHUB = GITHUB;
        this.INSTAGRAM = INSTAGRAM;
        this.FACEBOOK = FACEBOOK;
        this.EMAIL = EMAIL;
        this.RATING = RATING;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getWEBSITE() {
        return WEBSITE;
    }

    public void setWEBSITE(String WEBSITE) {
        this.WEBSITE = WEBSITE;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getTAGLINE() {
        return TAGLINE;
    }

    public void setTAGLINE(String TAGLINE) {
        this.TAGLINE = TAGLINE;
    }

    public String getSUBJECTS() {
        return SUBJECTS;
    }

    public void setSUBJECTS(String SUBJECTS) {
        this.SUBJECTS = SUBJECTS;
    }

    public String getLANGUAGE() {
        return LANGUAGE;
    }

    public void setLANGUAGE(String LANGUAGE) {
        this.LANGUAGE = LANGUAGE;
    }

    public String getTWITTER() {
        return TWITTER;
    }

    public void setTWITTER(String TWITTER) {
        this.TWITTER = TWITTER;
    }

    public String getGITHUB() {
        return GITHUB;
    }

    public void setGITHUB(String GITHUB) {
        this.GITHUB = GITHUB;
    }

    public String getINSTAGRAM() {
        return INSTAGRAM;
    }

    public void setINSTAGRAM(String INSTAGRAM) {
        this.INSTAGRAM = INSTAGRAM;
    }

    public String getFACEBOOK() {
        return FACEBOOK;
    }

    public void setFACEBOOK(String FACEBOOK) {
        this.FACEBOOK = FACEBOOK;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getRATING() {
        return RATING;
    }

    public void setRATING(String RATING) {
        this.RATING = RATING;
    }
}