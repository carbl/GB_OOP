package Lesson6.SRP;

public class FindeService {
    public Car findeCar(String carN){
        Car car = new Car();
        return car;
    }
    private Pay pay;
    public FindeService(Pay pay){
        this.pay = pay;
    }
}
