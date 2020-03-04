package se.ecutb.khalifa.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class YearCalendar implements Serializable {
    private UUID id;
    private UUID userId;
    private int year;
    private List<CalenderDay> calenderDays;

    public YearCalendar(UUID userId, int year) {
        this.id = UUID.randomUUID();
        this.userId = userId;
        this.year = year;
        this.calenderDays = new ArrayList<>();
    }

    public UUID getId(){
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<CalenderDay> getCalenderDays() {
        return calenderDays;
    }

    public void setCalenderDays(List<CalenderDay> calenderDays) {
        this.calenderDays = calenderDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YearCalendar that = (YearCalendar) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, year);
    }

    @Override
    public String toString() {
        return "YearCalendar{" +
                "userId='" + userId + '\'' +
                ", year=" + year +
                ", calenderDays=" + calenderDays +
                '}';
    }
}
