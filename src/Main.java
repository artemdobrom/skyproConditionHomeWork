// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task11();
        task12();
        task13();
        task14();
        task15();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int age = 18;
        System.out.println("Если возраст человека равен " + age + " ,то");

        if (age >= 18) {
            System.out.println("Ты можешь водить");
        } else {
            System.out.println("Ты не можешь водить");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");


        int degress= 6;
        System.out.println("На улице "+ degress+" градусов");

        if (degress <5) {
            System.out.println("На улице холодно, нужно надеть шапку!");
        }else {
            System.out.println("Сегодня тепло, можно идти без шапки");
    }
}


    public static void task3() {
        System.out.println("Задача 3");

        int speed = 70;
        System.out.println("Если скорость "+ speed + " ,то ");

        if (speed >60) {
            System.out.println("Придётся заплатить штраф!");
        }else {
            System.out.println("Можно ездить спокойно.");
        }
    }


    public static void task4() {
        System.out.println("Задача 4");

        int age =61;

        if (age < 2) {
            System.out.println("Если возраст человек равен " + age + ", то ему пора спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человек равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >=7 && age <= 18) {
            System.out.println("Если возраст человек равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человек равен " + age + ", то его место в университете");
        }  else if (age >= 24 && age <=60) {
            System.out.println("Если возраст человек равен " + age + ", то ему пора ходить на работу");
        }  else if (age > 60) {
            System.out.println("Если возраст человек равен " + age + ", то он может отдохнуть");
        }else {
            System.out.println("Некорректный возраст");



        }

    }


    public static void task5() {
        System.out.println("Задача 5");

        int age = 14;

        if (age < 5 ) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }else if (age >= 5 && age <14 ) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }else if (age >=14 ) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }else {
            System.out.println("Некорректный возраст");

        }

    }

    public static void task6() {
        System.out.println("Задача 6");

        int NrTckets = 103;

        if (NrTckets <= 60) {
            System.out.println("В вагоне есть сидячие места ");
        }else if (NrTckets >60 && NrTckets <= 102) {
            System.out.println("В вагоне есть стоячие места");
        }else {
            System.out.println("В вагоне нет мест");

        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two= 2;
        int three=3;

        if (one > two || one > three) {
            System.out.println("Самое большое число " + one);
        }else if (two > three || two < one) {
            System.out.println("Самое большое число " + two);
        }else {
            System.out.println("Самое большое число "+ three);

        }


    }
    public static void task11() {
        System.out.println("Задача 1");

        int clientOS = 0;

        if ( clientOS== 0) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        } else if (clientOS==1 ) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        }else {
            System.out.println("Некорректные данные");
        }
    }
    public static void task12() {
        System.out.println("Задача 2");

        int clientOS = 1;
        int year= 2014;

        if ( clientOS== 0 && year >=2015) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        } else if (clientOS==0 && year<=2015 ) {
            System.out.println("Установите облегчённыу версию приложения для iOS по ссылке");
        } else if (clientOS==1 && year>=2015 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS==1 && year<=2015 ) {
            System.out.println("Установите облегчённыу версию приложения для Android по ссылке");
        }else {
            System.out.println("Некорректные данные");
        }
    }


    public static void task13() {
        System.out.println("Задача 3");

        int year = 2021;

        if ( year % 4 == 0 && year % 100 !=0 || year % 400==0) {
            System.out.println( year + " год является высококсным");
        }else {
            System.out.println(" год не является высокосным");
        }
    }

    public static void task14() {
        System.out.println("Задача 4");

        int distantion = 21;
        int day= 1;

        if ( distantion<= 20) {
            System.out.println("Потребуется дней: "+ day);
        } else if (distantion >=20 & distantion <=60 ) {
            System.out.println("Потребуется дней: "+ (day+ 1) );
        } else if (distantion >=60 & distantion <=100 ) {
            System.out.println("Потребуется дней: "+ (day+1+1) );
        }else {
            System.out.println("Доставки нет");
        }
    }

    public static void task15() {
        System.out.println("Задача 5");

        int monthNumber= 12;

        if (monthNumber >12) {
            System.out.println("Некорректный номер!");
        }
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный месяц");
        }

        }


}



