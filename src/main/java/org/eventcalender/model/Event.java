package org.eventcalender.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

import static javax.persistence.GenerationType.AUTO;


@Entity
@Table(name="events",schema="eventcalender")
public class Event {
   @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

   @Column(name="eName")
   private String eName;

    @Column(name="ePlace")
    private String ePlace;

    @Column(name="eDate")
    private Date eDate;

    @Column(name="eTime")
    private Time eTime;


    public Event() {
    }

    public Event(long id, String eName, String ePlace, Date eDate, Time eTime) {
        this.id = id;
        this.eName = eName;
        this.ePlace = ePlace;
        this.eDate = eDate;
        this.eTime = eTime;
    }

    public long getId() {
        return id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getePlace() {
        return ePlace;
    }

    public void setePlace(String ePlace) {
        this.ePlace = ePlace;
    }

    public Date geteDate() {
        return eDate;
    }

    public void seteDate(Date eDate) {
        this.eDate = eDate;
    }

    public Time geteTime() {
        return eTime;
    }

    public void seteTime(Time eTime) {
        this.eTime = eTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eventName='" + eName + '\'' +
                ", eventPlace='" + ePlace + '\'' +
                ", eventDate=" + eDate +
                ", eventTime=" + eTime +
                '}';
    }
}