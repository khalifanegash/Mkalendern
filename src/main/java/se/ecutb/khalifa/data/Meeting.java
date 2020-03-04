package se.ecutb.khalifa.data;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.UUID;

public class Meeting implements Serializable {
    private UUID id;
    private LocalTime startTid;
    private LocalTime slutTid;
    private String heading;
    private String description;

    public Meeting(LocalTime startTid,LocalTime slutTid,String heading, String description) {
        this.id = UUID.randomUUID();
        this.startTid = startTid;
        this.slutTid = slutTid;
        this.heading = heading;
        this.description = description;
    }

    public LocalTime getSlutTid() {
        return slutTid;
    }

    public void setSlutTid(LocalTime slutTid) {
        this.slutTid = slutTid;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", startTid=" + startTid +
                ", slutTid=" + slutTid +
                ", heading='" + heading + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
