<?php
require_once("Account.php");
class Car
{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function _construct($license, $driver)
    {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function PrintDataCar()
    {
        echo ("license: $this->license
        conductor:   {$this->driver->name}  
        Numero de pasajeros:   $this->passenger");
    }

    public function getPassenger()
    {
        return $this->passenger;
    }

    public function setPassenger($passenger)
    {
        if ($passenger == 4) {
            $this->passenger = $passenger;
        } else {
            echo "Ocupas asignar 4 pasajeros";
        }
    }
}
