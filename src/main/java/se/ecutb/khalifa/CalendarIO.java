package se.ecutb.khalifa;

import se.ecutb.khalifa.data.CalendarUser;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CalendarIO {

    public static void save(List<CalendarUser> users, Path path){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path.toFile()))){
            out.writeObject(users);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<CalendarUser> read(Path path){
        List<CalendarUser> users = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path.toFile()))){

            users = (List<CalendarUser>) in.readObject();

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

}
