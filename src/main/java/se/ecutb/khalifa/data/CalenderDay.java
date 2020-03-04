package se.ecutb.khalifa.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class CalenderDay implements Serializable {
    private UUID id;
    private LocalDate date;
    private List<Meeting> meetings;

    public CalenderDay(LocalDate date, List<Meeting> meetings) {
        this.id = UUID.randomUUID();
        this.date = date;
        this.meetings = meetings;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }

    public void addMeeting(Meeting meeting){
       meetings.add(meeting);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalenderDay that = (CalenderDay) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(date, that.date) &&
                Objects.equals(meetings, that.meetings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, meetings);
    }

    @Override
    public String toString() {
        return "CalenderDay{" +
                "id=" + id +
                ", date=" + date +
                ", meetings=" + meetings +
                '}';
    }
}
