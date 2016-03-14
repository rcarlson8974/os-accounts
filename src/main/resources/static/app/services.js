(function(angular) {
  var AccountFactory = function($resource) {
    return $resource('/accounts/:id', {
      id: '@id'
    }, {
      update: {
        method: "PUT"
      },
      remove: {
        method: "DELETE"
      }
    });
  };

  AccountFactory.$inject = ['$resource'];
  angular.module("myAccount.services").factory("Account", AccountFactory);
}(angular));