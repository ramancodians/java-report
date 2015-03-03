<?php
	error_reporting(0);
//echo $_GET['no'];
	
	$myfile = fopen( $_GET['no'].".java", "r") or die($_GET['no'].".java not found! Make sure you have this file in java-program/ directory.");
	// Output one line until end-of-file
	$s = null;
	while(!feof($myfile)) { 
	   $s = $s.fgets($myfile);
	}
	
	//throwing output
	echo $s;
	fclose($myfile);



?>