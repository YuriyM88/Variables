public class Main{
    public static void main(String[] args){
        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println("Собака " +dog);
        var cat = 3.6;
        System.out.println("Кошка " +cat);
        var paper = 763789;
        System.out.println("Бумага " +paper);

        System.out.println("Задание 2");
        var dog2 = 8.0;
        dog2 = dog2 + 4;
        System.out.println("Собака плюс 4 = " +dog2);
        var cat2 = 3.6;
        cat2 = cat2 + 4;
        System.out.println("Кошка плюс 4 " +cat2);
        var paper2 = 763789;
        paper2 = paper2 + 4;
        System.out.println("Бумага плюс 4 = " + paper2);

        System.out.println("Задание 3");
        var dog3 = 8.0;
        dog3 = dog3 - 3.5;
        System.out.println("Собака минус 3.5 = " +dog3);
        var cat3 = 3.6;
        cat3 = cat3 - 1.6;
        System.out.println("Кошка минус 1.6 =  " +cat3);
        var paper3 = 763789;
        paper3 = paper3 - 7639;
        System.out.println("Бумага минус 7639 =  " +paper3);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println("Начальное значение = " +friend);
        friend = friend + 2;
        System.out.println("Плюс два = " +friend);
        var friend1 = friend / 7;
        System.out.println("Делить на семь = " +friend1);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println("Начальное значение = " +frog);
        frog = frog * 10;
        System.out.println("Увеличено в 10 раз = " +frog);
        frog = frog / 3.5;
        System.out.println("Поделено на 3,5 = " +frog);
        frog = frog + 4;
        System.out.println("Добавлено 4 = " + frog);

        System.out.println("Задание 6");
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var weightBoxer = oneBoxer + twoBoxer;
        System.out.println("Общий вес бойцов " +weightBoxer +" кг!");
        var differenceBoxer = twoBoxer - oneBoxer;
        System.out.println("Разница в весе " +differenceBoxer +" кг!");

        System.out.println("Задание 7");
        var weightRemainder = (twoBoxer % oneBoxer);
        System.out.println("Остаток " +weightRemainder);

    }
}