/*
Обязательное . Делайте по своим силам, главное реализовать то что было на семинаре.
1. Реализовать, с учетом ооп подхода, генеалогическое дерево Человек.
Идея: описать некоторое количество компонент, например:
модель человека
компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение,
брат, свекровь, сестра и т. д.
компонент для проведения исследований
дополнительные компоненты по желанию, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл,
получение\построение отдельных моделей человека
Под “проведением исследования” можно понимать получение всех детей выбранного человека.
 */
package Lesson1_1;

public class main {
    public static void main(String[] args) {
        Person natalia = new Person("Наталья", 55);
        Person vacheslav = new Person("Вячеслав", 65);
        Person misha = new Person("Миша", 27);
        Person masha = new Person("Маша", 24);
        Person jane = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Person Sasha = new Person("Саша", 9);
        Person Sasha2 = new Person("Саша", 3);

        GeoTree gt = new GeoTree();
        gt.appendPerentChild(natalia, misha);
        gt.appendPerentChild(natalia, masha);
        gt.appendPerentChild(misha, jane);
        gt.appendPerentChild(misha, ivan);
        gt.appendVifeHusbent(natalia, vacheslav);
        gt.appendPerentChild(vacheslav, misha);
        gt.appendPerentChild(vacheslav, masha);
        gt.appendPerentChild(vacheslav, Sasha);
        gt.appendPerentChild(misha, Sasha2);

        System.out.println("Дети Натальи");
        System.out.println(new Research(gt).spend(natalia, Relationship.parent));
        System.out.println("Муж Натальи");
        System.out.println(new Research(gt).spend(natalia, Relationship.vife));
        System.out.println("Дети Вячеслава");
        System.out.println(new Research(gt).spend(vacheslav, Relationship.parent));

        System.out.println(new Research(gt).searchAge());
    }
}
