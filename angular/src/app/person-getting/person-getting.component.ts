import { Component, OnInit } from '@angular/core';
import {IPerson, Person} from "../model/person.model";
import {PersonServiceService} from "../service/person-service.service";

@Component({
  selector: 'app-person-getting',
  templateUrl: './person-getting.component.html',
  styleUrls: ['./person-getting.component.css']
})
export class PersonGettingComponent implements OnInit {

  people: IPerson[];
  title = 'angular-app';

  constructor(private personService: PersonServiceService) {
  }

  ngOnInit(): void {
    this.getAllPeople();
  }

  getAllPeople(): void {
    this.personService.query().subscribe(people => {
      this.people = people.body;
    });
  }

  addNewPerson(): void {
    const person = new Person();
    person.name = 'Kaan';
    person.surname = 'Günay';
    this.personService.create(person).subscribe(_ => {
      this.getAllPeople();
    });
  }

}
