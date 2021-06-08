from Python.car import Car

if __name__ == "__main__":
    print("Hola")
    car = Car()
    car.license = "AMS234"
    car.driver = "Andres Herrera"
    print(vars(car))
