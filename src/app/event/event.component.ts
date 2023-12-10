import { Component,OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { eventService } from '../service/eventService';
import { Location } from '@angular/common';


@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit {
  id:any;
  event : any;

 constructor(private route :ActivatedRoute,private EventService : eventService,private location: Location) { }

 ngOnInit(): void {
   this.id= this.route.snapshot.params['id'];
   
   this.EventService.getEvents().subscribe( data => {
     this.event = data;
   });

 }

}
