// public/js/appRoutes.js
    angular.module('appRoutes', []).config(['$routeProvider', '$locationProvider', function($routeProvider, $locationProvider) {

    $routeProvider

        // home page
        .when('/home', {
            templateUrl: 'views/home.html',
            controller: 'MainController'
        })

        // nerds page that will use the NerdController
        .when('/customerlist', {
            templateUrl: 'views/customer.html',
            controller: 'CustomerController'
        });

    $locationProvider.html5Mode(true);

}]);