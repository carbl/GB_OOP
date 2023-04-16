/*
Создать ( продолжить задание с семинара) любую структуру на выбор - Phone, Person, Библиотеки, Автомобили,
Интрнет магазин, Животные (Реализовать все инструменты ООП которые мы прошли). Работа нужна для выполнения
ДЗ к следующему семинару.
 */
package Lesson5;
import Lesson5.Action.Numbers;
import Lesson5.Animal.Animal;
import Lesson5.Animal.Cat;
import Lesson5.Animal.Dog;
import Lesson5.Human.Human;
import Lesson5.Human.Doctor;
import Lesson5.Action.PneumoniaTreatment;
import Lesson5.Action.RabiesTreatment;
import Lesson5.Action.AnimalTreatment;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
        public static void main(String[] args) {
            // Экземпляры классов
            Cat c = new Cat("Сиамский", "Максим", "Серый", "Мужской", Numbers.getR(2), Numbers.getR(5), 100);
            Dog dog = new Dog("Овчарка", "Арчи", "Черный", "Мужской", Numbers.getR(5), Numbers.getR(5), 100);
            Doctor d = new Doctor("Артем", "Ветеринар", "Мужской", Numbers.getR(25));
            // Списки зверей и людей
            List<Human> human = new ArrayList<>();
            List<Animal> animal = new ArrayList<>();

            animal.add(dog);
            animal.add(c);
            human.add(d);

            //показать информацию всех зверей
            for (Animal animal2 : animal) {System.out.println(animal2);}
            System.out.println("---------------------------------------");
            //цикл проведения проверки и лечения всех животных
            for (int i = 0; i < animal.size(); i++) {
                Random r = new Random();
                int number = r.nextInt(1, 4);
                System.out.println(animal.get(i).getStatus()+" "+ "На приеме у"+" " + d.getStatus());
                //рандомное присвоение статуса здоровья животному
                switch (number){
                    case (1):
                        System.out.println("У животного обнаружена пневмания");
                        //метод получения урона от болезни
                        animal.get(i).setHealth(PneumoniaTreatment.Pneumonia((int)animal.get(i).getHealth()));
                        //цикл лечения животного
                        while ((int) animal.get(i).getHealth()<100){
                            animal.get(i).setHealth(AnimalTreatment.healing((int) animal.get(i).getHealth()));
                            if ((int) animal.get(i).getHealth() > 100){
                                animal.get(i).setHealth(100);
                            }
                            System.out.println(animal.get(i).getStatus()+" "+ "Прошло курс лечения"+" " + animal.get(i).getHealth());
                        }
                        System.out.println(animal.get(i).voice());
                        System.out.println("---------------------------------------");
                        break;
                    case (2):
                        System.out.println("У животного обнаружено бешенство");
                        //метод получения урона от болезни
                        animal.get(i).setHealth(RabiesTreatment.Rabies((int)animal.get(i).getHealth()));
                        //цикл лечения животного
                        while ((int) animal.get(i).getHealth()<100){
                            animal.get(i).setHealth(AnimalTreatment.healing((int) animal.get(i).getHealth()));
                            if ((int) animal.get(i).getHealth() > 100){
                                animal.get(i).setHealth(100);
                            }
                            System.out.println(animal.get(i).getStatus()+" "+ "Прошло курс лечения"+" " + animal.get(i).getHealth());
                        }
                        System.out.println(animal.get(i).voice());
                        System.out.println("---------------------------------------");
                        break;
                    default:
                        System.out.println("Животное здоровое");
                        System.out.println(animal.get(i).voice());
                        System.out.println("---------------------------------------");
                        break;
                }

            }
        }
}
