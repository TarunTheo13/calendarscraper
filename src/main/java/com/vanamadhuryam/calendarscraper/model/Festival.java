package com.vanamadhuryam.calendarscraper.model;

import java.util.Objects;

public class Festival {

    private Long id;
    private Long dateId;
    private Long tithiId;
    private String description;

    public Festival() {
    }

    public Festival(Long id, Long dateId, String description) {
        this.id = id;
        this.dateId = dateId;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDateId() {
        return dateId;
    }

    public void setDateId(Long dateId) {
        this.dateId = dateId;
    }

    public Long getTithiId() {
        return tithiId;
    }

    public void setTithiId(Long tithiId) {
        this.tithiId = tithiId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Festival festival = (Festival) o;
        return getId().equals(festival.getId()) && getDateId().equals(festival.getDateId()) && getTithiId().equals(festival.getTithiId()) && Objects.equals(getDescription(), festival.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDateId(), getTithiId(), getDescription());
    }

    @Override
    public String toString() {
        return "Festival{" +
                "id=" + id +
                ", dateId=" + dateId +
                ", description='" + description + '\'' +
                '}';
    }
}
