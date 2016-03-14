(function(angular) {
  var AccountController = function($scope, Account) {
    Account.query(function(response) {
      $scope.accounts = response ? response : [];
    });

    $scope.addAccount = function(description) {
      new Account({
        description: description,
        checked: false
      }).$save(function(account) {
        $scope.accounts.push(account);
      });
      $scope.newAccount = "";
    };

    $scope.updateAccount = function(account) {
      account.$update();
    };

    $scope.deleteAccount = function(account) {
      account.$remove(function() {
        $scope.accounts.splice($scope.accounts.indexOf(account), 1);
      });
    };
  };

  AccountController.$inject = ['$scope', 'Account'];
  angular.module("myAccount.controllers").controller("AccountController", AccountController);
}(angular));