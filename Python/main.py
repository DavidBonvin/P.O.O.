from car import Car
if __name__=="__main__":
    print("hola mundo")
    car = Car()
    car.license = "AMS234"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "ATZ123"
    car2.driver = "Andrea Herrera"
    print(vars(car2))