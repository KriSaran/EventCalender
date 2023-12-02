package org.eventcalender.controller;

import org.eventcalender.model.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/events")
public class EventController {


    @Autowired
    private EventRepository eventRepository;

    @GetMapping("")
    public String view()
    {
//        model.addAttribute("view",eventRepository.findAll());
        return eventRepository.findAll().toString();
    }


}


