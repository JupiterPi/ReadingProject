angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8017/greeting').
        then(function(response) {
            $scope.greeting = response.data;
        });
});