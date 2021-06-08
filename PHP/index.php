<?php
require_once('Car.php');
require_once('Account.php');
require_once("UberX.php");
require_once("UberPool.php");
require_once("UberVan.php");

$uberX = new UberX("ADS134", new Account("JuanchoPerez", "AND134"), "Chevrolet", "Spark");
$uberX->setPassenger(4);
$uberX->PrintDataCar();

$uberPool = new UberPool("FFD135", new Account("PepePopotes", "KLJ564"), "Dogdge", "Attitude");
$uberPool->PrintDataCar();


$car = new Car("AW456", new Account("Andres Herrera", "AMS123"));
$car->printDataCar();

$uberVan = new UberVan("DFG6261", new Account("chuchito Mendez", "ADW546"), "TESLA", "Model X");
$uberVan->setPassenger(6);
$uberVan->PrintDataCar();
