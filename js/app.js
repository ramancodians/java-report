//Coded By : Raman Choudhary

var app = angular.module('app',[]);

app.controller('PageCtrl',function($scope){
	$scope.programs = [
		'To demonstrate the usage of Math class.',
		'To implement the methods of String class',
		'Implementation of inheritance',
		'Implementation of super and this',
		'Implementation of static variables and methods',
		'Implementation of interfaces.',
		'Implementation of Exceptions',
		'To implement multithreading by extending Thread class',
		'To demonstrate FileInputStream and FileOutput Stream Classes',
		'To demonstrate the creation of applets and passing parameters to applets',
		'To demonstrate Mouse and Keyboard events in an applet',
		'To demonstrate the creation of a frame',
		'To demonstrate Labels and Buttons with proper events',
		'To demonstrate Checkboxes with proper events',
		'To demonstrate Checkbox Groups with proper events',
		'To demonstrate Lists and TextFields with proper events',
		'To demonstrate different layout Managers',
		'To demonstrate Inner Classes'
	];
	
	$scope.dates = ['20/11/2014','20/11/2014','27/11/2014','27/11/2014','04/12/2014','12/12/2014','19/12/2014','08/01/2015','16/01/2015','02/02/2015','02/05/2015','02/09/2015','02/09/2015','16/02/2015','16/02/2015','23/02/2015','23/02/2015'];
	$scope.author_name="Raman Choudhary";
	
	$scope.getPro = function(no){
		$.ajax({
          type: "GET",
          url: "ajax/do-not-delete.php",
			data : {
				'no' : no
			}
        })
          .done(function(msg) {
            $scope.pData = msg;
			console.log('.code-id-'+no);
			$('.code-id-'+no).text(msg);
			console.log(msg);
          }).fail(function(){
			console.log("AJAX FAILED");
		});
	}
	
	
});