import { Injectable } from '@angular/core';
import {HttpClient, HttpResponse} from "@angular/common/http";
import {IPerson} from "../model/person.model";
import {Observable} from "rxjs";

type EntityResponseType = HttpResponse<IPerson>;
type EntityArrayResponseType = HttpResponse<IPerson[]>;

@Injectable({
  providedIn: 'root'
})
export class PersonServiceService {
  public resourceUrl = 'http://localhost/person-service/api/all';

  constructor(private http: HttpClient) { }

  query(): Observable<EntityArrayResponseType> {
    return this.http.get<IPerson[]>(this.resourceUrl, { observe: 'response' });
  }
}
