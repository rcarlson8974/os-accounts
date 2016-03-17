(function (angular) {
  var AccountController = function ($scope, Account, DTOptionsBuilder, DTColumnBuilder) {

    console.log("here");
    $scope.dtOptions = DTOptionsBuilder.newOptions().withPaginationType('full_numbers');
    //$scope.dtOptions = DTOptionsBuilder.fromSource($scope.accounts).withPaginationType('full_numbers');

    //$scope.dtColumns = [
    //  DTColumnBuilder.newColumn('ID').withTitle('ID'),
    //  DTColumnBuilder.newColumn('FNAME').withTitle('First name'),
    //  DTColumnBuilder.newColumn('HA_Email').withTitle('Email').notVisible()
    //];

    $scope.dtColumns = [
      DTColumnBuilder.newColumn('id').withTitle('ID'),
      DTColumnBuilder.newColumn('accountDesc').withTitle('Account Desc'),
      DTColumnBuilder.newColumn('userId').withTitle('User ID'),
      DTColumnBuilder.newColumn('passwordHint').withTitle('Password Hint'),
      DTColumnBuilder.newColumn('pinHint').withTitle('Pin Hint'),
      DTColumnBuilder.newColumn('url').withTitle('URL')
    ];

    Account.query(function (response) {
      console.log("there");
      $scope.accounts = response ? response : [];
      $scope.dtOptions.aaData = $scope.accounts;
    });

    $scope.addAccount = function (description) {
      new Account({
        description: description,
        checked: false
      }).$save(function (account) {
        $scope.accounts.push(account);
      });
      $scope.newAccount = "";
    };

    $scope.updateAccount = function (account) {
      account.$update();
    };

    $scope.deleteAccount = function (account) {
      account.$remove(function () {
        $scope.accounts.splice($scope.accounts.indexOf(account), 1);
      });
    };
  };

  AccountController.$inject = ['$scope', 'Account', 'DTOptionsBuilder', 'DTColumnBuilder'];
  angular.module("myAccount.controllers").controller("AccountController", AccountController);
}(angular));