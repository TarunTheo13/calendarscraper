package com.vanamadhuryam.calendarscraper.model;

import java.util.Objects;

public class Tithi {

    private Long id;
    private Long dateId;
    private String day;
    private String month;
    private String year;
    private String paksha;
    private String sunriseTime;
    private String sunsetTime;
    private String nakshatra;

    public Tithi() {
    }

    public Tithi(Long id, Long dateId, String day, String month, String year, String paksha, String sunriseTime, String sunsetTime, String nakshatra) {
        this.id = id;
        this.dateId = dateId;
        this.day = day;
        this.month = month;
        this.year = year;
        this.paksha = paksha;
        this.sunriseTime = sunriseTime;
        this.sunsetTime = sunsetTime;
        this.nakshatra = nakshatra;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPaksha() {
        return paksha;
    }

    public void setPaksha(String paksha) {
        this.paksha = paksha;
    }

    public String getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(String sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public String getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(String sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public String getNakshatra() {
        return nakshatra;
    }

    public void setNakshatra(String nakshatra) {
        this.nakshatra = nakshatra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tithi tithi = (Tithi) o;
        return getId().equals(tithi.getId()) && getDateId().equals(tithi.getDateId()) && Objects.equals(getDay(), tithi.getDay()) && Objects.equals(getMonth(), tithi.getMonth()) && Objects.equals(getYear(), tithi.getYear()) && Objects.equals(getPaksha(), tithi.getPaksha()) && Objects.equals(getSunriseTime(), tithi.getSunriseTime()) && Objects.equals(getSunsetTime(), tithi.getSunsetTime()) && Objects.equals(getNakshatra(), tithi.getNakshatra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDateId(), getDay(), getMonth(), getYear(), getPaksha(), getSunriseTime(), getSunsetTime(), getNakshatra());
    }

    @Override
    public String toString() {
        return "Tithi{" +
                "id=" + id +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", paksha='" + paksha + '\'' +
                '}';
    }
}
