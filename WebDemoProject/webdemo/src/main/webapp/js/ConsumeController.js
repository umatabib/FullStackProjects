var app = angular.module('ngdemo.controllers',["ngRoute"]);

app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "home.html"
    })
    .when("/about", {
        templateUrl : "about.html"
    })
    .when("/contact", {
        templateUrl : "contact.html"
    });
});

app.controller('MyCrtl1',['$scope','$http', function($scope,$http){
	var promise = $http.get("rest/user");
	promise.success(function(response){
		$scope.firstName = response.firstName;
	});
	promise.error(function(response){
		$scope.errorMsg = "error!";//response.status
	});
	
	var promiseAll = $http.get("rest/user/all");
	promiseAll.success(function(response){
		$scope.allUsers = response.user; 
	});
	promiseAll.error(function(response){
		$scope.errorMsg = "error!";//response.status
	});
	

	$scope.onClick = function(uid){
		console.log("UID: " + uid);
		var promiseId = $http.get("rest/user/"+uid);
		promiseId.success(function(response){
			$scope.fname = response.firstName;
			$scope.lname = response.lastName;
		});
	};
	
	
}]);

