function Car(license, driver) {
    this.id;
    this.lecense = license;
    this.driver = driver; 
    this.passenger;
}

Car.prototype.printDataCar = function(){
    console.log (this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}