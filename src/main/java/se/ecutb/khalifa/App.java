package se.ecutb.khalifa;

import se.ecutb.khalifa.data.CalendarUser;
import se.ecutb.khalifa.data.YearCalendar;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Path path = Paths.get("textFile/calendarUsers.dat");

        List<CalendarUser> users = new ArrayList<>(Arrays.asList(
                new CalendarUser("khalifa@gmail.com", "Khalifa",null),
                new CalendarUser("farah@gmail.com","Farah",new ArrayList<>())
        ));

        CalendarUser user =  users.stream().filter(calendarUser -> calendarUser.getName().equalsIgnoreCase("khalifa")).findFirst().get();

        user.setYearCalendars(Arrays.asList(new YearCalendar(user.getId(),2020),
                new YearCalendar(user.getId(),2019)));
        System.out.println( user);

        //CalendarIO.save(users,path);


        //CalendarIO.read(path).forEach(System.out::println);

    }
}
