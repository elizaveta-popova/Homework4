public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Вы ещё не достигли совершеннолетия.");
        }

        //Задача 2
        System.out.println("Задача 2");
        int age1 = 88;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Человек закончил школу и может идти в университет");
        }
        if (age1 >= 24) {
            System.out.println("Человек окончил университет, пора искать первую работу");
        }

        //Задача 3
        System.out.println("Задача 3");
        int places = 103;
        if (places <= 60) {
            System.out.println("Место сидячее.");
        }
        if (places > 60 && places <= 102) {
            System.out.println("Место стоячее.");
        }
        if (places > 102) {
            System.out.println("Мест нет.");
        }

        //Задание 1
        System.out.println("Задание 1");
        int age2 = 1;
        if (age2 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Вы ещё не достигли совершеннолетия.");
        }

        //Задание 2
        System.out.println("Задание 2");
        int age3 = 88;
        if (age3 >= 7 && age3 < 18) {
            System.out.println("Ребёнок ходит в школу");
        }

            if (age3 >= 18 && age3 < 24) {
                System.out.println("Человек закончил школу и может идти в университет");
        }
        if (age3 >= 24) {
            System.out.println("Человек окончил университет, пора искать первую работу");
        }
        //Задание 3
        System.out.println("Задание 3");
        int places1 = 10;

        if (places1 > 60 && places1 <= 102) {
            System.out.println("Сидячих мест нет.");
        } else {
            System.out.println("Мест нет.");
        }

        //Задача 1
        System.out.println("Задача 1");
        int age8 = 18;
        boolean kindergarten1 = age8 >= 2 && age8 <= 6;
        boolean school1 = age8 >= 7 && age8 <= 18;
        boolean university1 = age8 > 18 && age8 <=24;
        boolean work1 = age8 > 24;
        if (kindergarten1) {
            System.out.println("Если возраст человека равен " + age8 + " , то ему нужно ходить в детский сад.");
        } else if (school1) {
            System.out.println("Если возраст человека равен " + age8 + " , то ему нужно ходить в школу.");
        } else if (university1) {
            System.out.println("Если возраст человека равен " + age8 + " , то ему нужно ходить в университет.");
        } else if (work1) {
            System.out.println("Если возраст человека равен " + age8 + " , то ему нужно ходить на работу.");
        }

        //Задача 2
        System.out.println("Задача 2");
        int childage = 4;
        boolean prohibited = childage < 5;
        boolean withAdult = childage > 5 && childage < 14;
        boolean free = childage > 14;
        if (prohibited) {
            System.out.println("Если ребёнку " + childage + " лет, то ему нельзя кататься на аттракционе.");
        } else if (withAdult) {
            System.out.println("Если ребёнку " + childage + " лет, то ему можно кататься на аттракционе только с родителем.");
        } else if (free) {
            System.out.println("Если ребёнку " + childage + " лет, то ему можно самостоятельно кататься на аттракционе.");
        }

        //Задача 3
        System.out.println("Задача 3");
        int one = 11;
        int two = 23;
        int three = 3;
        boolean theBiggestOne = one > two && one > three;
        boolean theBiggestTwo = two > one && two > three;
        boolean theBiggestThree = three > one && three > two;
        if (theBiggestOne) {
            System.out.println("Число, равное " + one + " большее.");
        } else if (theBiggestTwo) {
            System.out.println("Число, равное " + two + " большее.");
        } else if (theBiggestThree) {
            System.out.println("Число, равное " + three + " большее.");
        }




    }
}