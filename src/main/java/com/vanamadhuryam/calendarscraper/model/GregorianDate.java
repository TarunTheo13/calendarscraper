package com.vanamadhuryam.calendarscraper.model;

import java.util.Date;
import java.util.Objects;

public class GregorianDate {

    private Long id;
    private Date date;

    public GregorianDate() {
    }

    public GregorianDate(Long id, Date date) {
        this.id = id;
        this.date = date;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GregorianDate that = (GregorianDate) o;
        return getId().equals(that.getId()) && getDate().equals(that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDate());
    }

    @Override
    public String toString() {
        return "GregorianDate{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
