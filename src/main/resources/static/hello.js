angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8017/project').
        then(function(response) {
            $scope.greeting = response.data;
        });
});