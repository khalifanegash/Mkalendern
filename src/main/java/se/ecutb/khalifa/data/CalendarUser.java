package se.ecutb.khalifa.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class CalendarUser implements Serializable {
    private UUID id;
    private String email;
    private String name;
    private List<YearCalendar> yearCalendars;



    public CalendarUser( String email, String name, List<YearCalendar> yearCalender) {
        this.id = UUID.randomUUID();
        this.email = email;
        this.name = name;
        this.yearCalendars = yearCalender;

    }

    public UUID getId() {
        return id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<YearCalendar> getYearCalendars() {
        return yearCalendars;
    }

    public void setYearCalendars(List<YearCalendar> yearCalendars) {
        this.yearCalendars = yearCalendars;
    }

    public void addCalendar(int year){
        if(yearCalendars.stream().anyMatch(y -> y.getYear() == year)){
            System.out.println("this year is found");
        }
        yearCalendars.add(new YearCalendar(this.id,year));
    }

    public List<CalenderDay> searchCalendar(LocalDate date){
        return yearCalendars.stream().map(YearCalendar::getCalenderDays).filter(calenderDays -> calenderDays.get(0).getDate() == date).findFirst().get();

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalendarUser that = (CalendarUser) o;
        return id == that.id &&
                email.equals(that.email) &&
                name.equals(that.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, name);
    }

    @Override
    public String toString() {
        return "CalendarUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", yearCalender='" + yearCalendars + '\'' +
                '}';

    }
}
