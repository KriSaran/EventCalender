package org.eventcalender.controller;

import org.eventcalender.model.Event;
import org.eventcalender.model.EventRepository;
import org.eventcalender.model.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/events")
public class EventController {


    @Autowired
    EventService eventService;

    @GetMapping("/event")
    public String view()
    {
//        model.addAttribute("view",eventRepository.findAll());
        return eventService.viewAll().toString();

    }

    @PostMapping("/{id}")
    public void updateEvent(@PathVariable Integer id, @RequestBody Event event){

          eventService.addEvent(event);
    }




}


