/*
 The MIT License (MIT)

 Copyright (c) 2015 Los Andes University

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */

(function (ng) {

    var mod = ng.module("itemModule");

    mod.controller("userItemNewCtrl", ["$scope", "$state", 'Restangular',
        function ($scope, $state, Restangular) {
            $scope.currentRecord = {};
            $scope.toolbarTitle = "My wish list";
            $scope.references = {};
            $scope.model = {
                fields: {
                    name: {
                        displayName: 'Name',
                        type: 'String',
                        required: true
                    },
                    qty: {
                        displayName: 'Qty',
                        type: 'Long',
                        required: true
                    },
                    trip: {
                        displayName: 'Trip',
                        type: 'Reference',
                        model: 'tripModel',
                        options: [],
                        required: true
                    },
                    product: {
                        displayName: 'Product',
                        type: 'Reference',
                        model: 'productModel',
                        options: [],
                        required: true
                    }
                }
            };

            Restangular.all('trips').getList().then(function (trips) {
                Restangular.all('products').getList().then(function (products) {
                    $scope.references = {trip: trips, product: products};
                })
            });

            $scope.actions = {
                save: {
                    displayName: 'Save',
                    icon: 'save',
                    fn: function () {
                        if ($scope.itemForm.$valid) {
                            Restangular.all('client/wishList').post($scope.currentRecord).then(function (rc) {
                                console.log(rc);
                                $state.go('itemList', {clientId: rc.id}, {reload: true});
                            });
                        }
                    }
                },
                cancel: {
                    displayName: 'Cancel',
                    icon: 'remove',
                    fn: function () {
                        $state.go('tripGallery');
                    }
                }
            };
        }]);
})(window.angular);
