/*
Используйте предыдущие задачи из прошлого домашнего задания. Необходимо гарантированно продумать иерархию компонент и взаимодействия их между собой.
Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т е работаем не с:
конкретным экземпляром генеалогического древа, а с интерфейсом “ генеалогическое древо”
 */
package Lesson2;
public class main {
    public static void main(String[] args){
        Person natalia = new Person("Наталья", 55);
        Person vacheslav = new Person("Вячеслав", 65);
        Person misha = new Person("Миша", 27);
        Person masha = new Person("Маша", 24);
        Person jane = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Person Sasha = new Person("Саша", 9);
        Person Sasha2 = new Person("Саша", 3);

        GeoTree gt = new GeoTree();
        Tree treeG;
        treeG = gt;
        treeG.appendPerentChild(natalia, misha);
        treeG.appendPerentChild(natalia, masha);
        treeG.appendPerentChild(misha, jane);
        treeG.appendPerentChild(misha, ivan);
        treeG.appendVifeHusbent(natalia, vacheslav);
        treeG.appendPerentChild(vacheslav, misha);
        treeG.appendPerentChild(vacheslav, masha);
        treeG.appendPerentChild(vacheslav, Sasha);
        treeG.appendPerentChild(misha, Sasha2);

        System.out.println("Дети Натальи");
        System.out.println(new Research(treeG).spend(natalia, Relationship.parent));
        System.out.println("Муж Натальи");
        System.out.println(new Research(treeG).spend(natalia, Relationship.vife));
        System.out.println("Дети Вячеслава");
        System.out.println(new Research(treeG).spend(vacheslav, Relationship.parent));

        System.out.println(new Research(treeG).searchAge());

    }
}
