package com.tuna.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "params")
public class Parameter {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "param_id", length = 6, nullable = false)
    private Long param_id;

    @Column(name = "text_value")
    private String textValue;

    @Column(name = "number_value")
    private Long numberValue;

    @Column(name = "dateValue")
    private Date dateValue;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "attr_id", nullable = false)
    private Attribute attribute;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "object_id", nullable = false)
    private Object object;

    public Parameter() {
    }

    public Parameter(String textValue, Long numberValue, Date dateValue, Attribute attribute, Object object) {
        this.textValue = textValue;
        this.numberValue = numberValue;
        this.dateValue = dateValue;
        this.attribute = attribute;
        this.object = object;
    }


    public Long getParam_id() {
        return param_id;
    }

    public void setParam_id(Long param_id) {
        this.param_id = param_id;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public Long getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(Long numberValue) {
        this.numberValue = numberValue;
    }

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}