(function(angular) {
  angular.module("myAccount.controllers", []);
  angular.module("myAccount.services", []);
  angular.module("myAccount", ["ngResource", "myAccount.controllers", "myAccount.services"]);
}(angular));
