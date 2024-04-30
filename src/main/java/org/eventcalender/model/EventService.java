package org.eventcalender.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService
{
    @Autowired
    EventRepository eventRepository;

    public List<Event> viewAll(){

       List<Event> event=new ArrayList<Event>();
       eventRepository.findAll().forEach(events -> event.add(events));
        return event;

    }


    public Event getEventById(long id){
        return eventRepository.findById(id).get();
    }


    @Autowired
        public void  addEvent(Event event){
         eventRepository.save(event);
    }

    public void  deleteEvent(long id){
        eventRepository.deleteById(id);
    }

    public void  updateEvent(Event event,long id){
        eventRepository.save(event);
    }
}
