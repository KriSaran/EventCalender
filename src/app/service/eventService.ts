import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Event } from '../ModelInterface/Event';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root',
  })
export class eventService{
    
    
    private baseURL = 'http://localhost:8080/api/v1/events';

    requestHeader = new HttpHeaders();

    constructor(private httpClient:HttpClient){}

    public getEvents():Observable<Event>{
        const url=this.baseURL + "/" + "viewall";
        return this.httpClient.get<Event>(url,{headers:this.requestHeader});
     }


    


}
