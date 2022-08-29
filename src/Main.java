public class Main {
    public static void main(String[] args) {
        // task1(); // Задача 1
        // task2(); // Задача 2
        // task3(); // Задача 3
        // task4(); // Задача 4
        // task5(); // Задача 5
        // task6(); // Задача 6
        // task7(); // Задача 7
        // task8(); // Задача 8
        task9(); // Задача 9
    }

    // Задача 1
    public static void task1() {
        int age = 17;

        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age <= 17) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать!");
        }
    }

    // Задача 2
    public static void task2() {
        int age = 24;

        if (age >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }

    // Задача 3
    public static void task3() {
        int trainCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = trainCapacity - seatingPlaces;

        if (seatingPlaces <= 60) {
            System.out.println("Сидячие места есть");
        }
        if (standingPlaces <= 42) {
            System.out.println("Стоячие места есть");
        }
        if ((seatingPlaces > 60) && (standingPlaces > 42)) {
            System.out.println("Мест нет, вагон полностью забит");
        }
    }

    // Задача 4
    public static void task4() {
        int userAge = 17;

        if (userAge >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
    }

    // Задача 5
    public static void task5() {
        int age = 24;

        if ((age >= 7) && (age < 18)) {
            System.out.println("Ребенок ходит в школу");
        } else if ((age >= 18) && (age < 24)) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }

    // Задача 6
    public static void task6() {
        int trainCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = trainCapacity - seatingPlaces;

        if (seatingPlaces <= 60) {
            System.out.println("Сидячие места есть");
        } else if (standingPlaces <= 42) {
            System.out.println("Стоячие места есть");
        } else if ((seatingPlaces > 60) && (standingPlaces > 42)) {
            System.out.println("Мест нет, вагон полностью забит");
        }
    }

    // Задача 7
    public static void task7() {
        int age = 24;

        if ((age >= 2 && age <= 6)) {
            System.out.printf("Человеку %d лет/года, ему нужно ходить в детский сад", age);
        } else if (age >= 7 && age <= 18) {
            System.out.printf("Человеку %d лет/года, ему нужно ходить в школу", age);
        } else if (age > 18 && age < 24) {
            System.out.printf("Человеку %d лет/года, его место в университете", age);
        } else if (age >= 24) {
            System.out.printf("Человеку %d лет/года, пора ходить на работу", age);
    }
    }

    // Задача 8
    public static void task8() {
        int age = 2;
        boolean attractionAgeNo = age < 5;
        boolean attractionAgeYes = age >= 5 && age < 14;
        boolean attractionGo = age >= 14;

        if (attractionAgeNo) {
            System.out.println("Ребенку меньше 5 лет, он не может кататься на аттракционе");
        } else if (attractionAgeYes) {
            System.out.println("Ребенку больше 5, но меньше 14 лет, он может кататься только в сопровождении взрослого");
        } else if (attractionGo) {
            System.out.println("Ребёнок старше 14 лет, он может кататься без сопровождения взрослого");
        }
    }

    // Задача 9
    public static void task9() {
        int one = 4;
        int two = 6;
        int free = 1;

        if (one > two && one > free) {
            System.out.printf("%d больше %d и %d", one , two, free);
        } else if (two > one && two > free) {
            System.out.printf("%d больше %d и %d", two , one, free);
        } else if (free > one && free > two) {
            System.out.printf("%d больше %d и %d", free , one, two);
        }
    }
}
