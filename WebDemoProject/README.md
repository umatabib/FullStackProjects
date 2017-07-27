webdemo practice project:
Full stack (Technologies: Twitter bootstrap, AngularJS framework, Jersey framework)

For this practice  I have a comma separated file(User.txt) at the server side which contains users data.
(Note: Please place the User.txt file under your 'C:/Temp/ ' folder)

At front end side:
The AngularJS controller functions make REST API request to consume the user information (using the GET,PUT,POST, DELETE methods of $http service.)
3 different functions requests to consume:
	- list of all users.
	- information of particular user from list (on-click).
	-  first name of default user.
Using Promise functions in controller and by binding (ng-bind, ng-model, ng-repeat using $scope service) the data to html for displaying in the browser.
Single page application is implemented using $routeProvider service and by binding it to ng-view in html. 

At back end side:
At server side different service methods are written to implement the business logic to bring the user data using DAO objects from backend file as per type of input.
The Jersey controller methods use these service methods to expose the REST APIs.
DAO objects are passed to front end in JSON format using JAXB library.
