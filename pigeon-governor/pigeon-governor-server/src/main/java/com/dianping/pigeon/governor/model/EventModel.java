package com.dianping.pigeon.governor.model;

import java.util.Date;

public class EventModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.id
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.event_type
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    private Integer eventType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.project_id
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.relate_project_id
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    private Integer relateProjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.event_signature
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    private String eventSignature;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.level
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    private Integer level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.title
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.summary
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    private String summary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.updateTime
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.id
     *
     * @return the value of event.id
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.id
     *
     * @param id the value for event.id
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.event_type
     *
     * @return the value of event.event_type
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public Integer getEventType() {
        return eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.event_type
     *
     * @param eventType the value for event.event_type
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.project_id
     *
     * @return the value of event.project_id
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.project_id
     *
     * @param projectId the value for event.project_id
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.relate_project_id
     *
     * @return the value of event.relate_project_id
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public Integer getRelateProjectId() {
        return relateProjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.relate_project_id
     *
     * @param relateProjectId the value for event.relate_project_id
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public void setRelateProjectId(Integer relateProjectId) {
        this.relateProjectId = relateProjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.event_signature
     *
     * @return the value of event.event_signature
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public String getEventSignature() {
        return eventSignature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.event_signature
     *
     * @param eventSignature the value for event.event_signature
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public void setEventSignature(String eventSignature) {
        this.eventSignature = eventSignature == null ? null : eventSignature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.level
     *
     * @return the value of event.level
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.level
     *
     * @param level the value for event.level
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.title
     *
     * @return the value of event.title
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.title
     *
     * @param title the value for event.title
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.summary
     *
     * @return the value of event.summary
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.summary
     *
     * @param summary the value for event.summary
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.updateTime
     *
     * @return the value of event.updateTime
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.updateTime
     *
     * @param updatetime the value for event.updateTime
     *
     * @mbggenerated Fri Jul 29 11:28:48 CST 2016
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}