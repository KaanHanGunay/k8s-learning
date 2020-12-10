import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonGettingComponent } from './person-getting.component';

describe('PersonGettingComponent', () => {
  let component: PersonGettingComponent;
  let fixture: ComponentFixture<PersonGettingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PersonGettingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonGettingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
