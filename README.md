# Item_Management_System
This is an Application developed for maintaining information related to various activities in the item store.

## Modules :-
- Modules
- Tech Stacks
- Features
- Installation and Run
- Endpoints
- Roles & Responsibilities
- Contributing

## Modules :-
- item Module

## Tech Stacks :-             
- Java
- Spring Boot
- Lombok
- MySQL
- Spring-Data Jpa
- Hibernate
- Spring MVC

## Features :-
    
- Register item
- get the item details with item id

## Installation and Run  :-

You can clone this repo:
<br>`git clone https://github.com/Chetan0777/Item_Management_API.git`

Before running the API server, update the database config inside the application.properties file.

## Endpoints :-
    
- Register item endpoint
  
  `http://localhost:8080/items/addItem`
  ### Body :-

`{
  "id": 1,
  "name": "mobile",
  "description": "smartphone"
}
### Response :-
`Item added successfully.`
    
- get the item details with item id enpoint

  `http://localhost:8080/items/1`
  ### Response :-

`{
  "id": 1,
  "name": "mobile",
  "description": "smartphone"
}
`

## Roles & Responsibilities :-

- Responsible for All Features

## Contributing :-

- Fork the repository.
- Create a new branch for your feature or bug fix.
- Commit your changes.
- Push your changes to your fork.
- Submit a pull request.
