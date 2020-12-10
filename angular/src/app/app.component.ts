import {Component, OnInit} from '@angular/core';
import {PersonServiceService} from "./service/person-service.service";
import {IPerson} from "./model/person.model";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  people: IPerson[];
  title = 'angular-app';

  constructor(private personService: PersonServiceService) {
  }

  ngOnInit(): void {
    this.personService.query().subscribe(people => {
      this.people = people.body;
    })
  }

}
