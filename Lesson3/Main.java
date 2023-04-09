/*
Проделать код ревью своих работ. Продумать, какие компоненты можно и нужно переписать.
По желанию добавить функционнальные интерфесы.
 */
package Lesson3;

public class Main {
    public static void main (String[] args) {
        Person natalia = new Person("Наталья", 55);
        Person vacheslav = new Person("Вячеслав", 65);
        Person misha = new Person("Миша", 27);
        Person masha = new Person("Маша", 24);
        Person jane = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Person Sasha = new Person("Саша", 9);
        Person Sasha2 = new Person("Саша", 3);

        GeoGTree gt = new GeoGTree();
        gTree gTreeG;
        gTreeG = gt;
        gTreeG.appendPerentChild(natalia, misha);
        gTreeG.appendPerentChild(natalia, masha);
        gTreeG.appendPerentChild(misha, jane);
        gTreeG.appendPerentChild(misha, ivan);
        gTreeG.appendVifeHusbent(natalia, vacheslav);
        gTreeG.appendPerentChild(vacheslav, misha);
        gTreeG.appendPerentChild(vacheslav, masha);
        gTreeG.appendPerentChild(vacheslav, Sasha);
        gTreeG.appendPerentChild(misha, Sasha2);

        System.out.println("Дети Натальи");
        System.out.println(new Research(gTreeG).spend(natalia, Relationship.parent));
        System.out.println("Муж Натальи");
        System.out.println(new Research(gTreeG).spend(natalia, Relationship.vife));
        System.out.println("Дети Вячеслава");
        System.out.println(new Research(gTreeG).spend(vacheslav, Relationship.parent));

        System.out.println(new Research(gTreeG).searchAge());

    }
}
