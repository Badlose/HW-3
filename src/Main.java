public class Main {
    public static void main(String[] args) {

        //Задача 1
        byte itsHard = 127;
        short toComeUp = -32768;
        int withVariable = 2147483647;
        long names = 88888888888L;
        float butI = 1.2345678f;
        double willTry = 9.1011121314151617;

        System.out.println("Значение переменной itsHard с типом byte равно " + itsHard);
        System.out.println("Значение переменной toComeUp с типом short равно " + toComeUp);
        System.out.println("Значение переменной withVariable с типом int равно " + withVariable);
        System.out.println("Значение переменной names с типом long равно " + names);
        System.out.println("Значение переменной butI с типом float равно " + butI);
        System.out.println("Значение переменной willTry с типом double равно " + willTry);


        //Задача 2. В задаче не было условия вывода в консоль инициализированных ниже переменных, я и не выводил
        float my = 27.12f;
        long vocabulary = 987678965549L;
        float isLimited = 2.786f;
        short byGoogle = 569;
        short dictionary = -159;
        short iWillDefinitely = 27897;
        byte learnNewOnes = 67;

        //Задача 3
        byte studentsOfLyudmilaPavlovna = 23;
        byte studentsOfAnnaSergeevna = 27;
        byte studentsOfEkaterinaAndreevna = 30;
        byte totalStudents = (byte) (studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna +
                studentsOfLyudmilaPavlovna);
        /* IDE ругуается на преобразование типов. Не понял, почему так, ведь
        тут byte с byte складывается, типы совпадают */
        short sheetsPerStudent = (short) (480 / totalStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        //Задача 4
        byte bottlesPerOneCycle = 16;
        byte oneCycle = 2;
        byte firstInterval = 20;
        short secondInterval = 24 * 60;
        short thirdInterval = (short) (3 * secondInterval);
        int fourthInterval = 10 * thirdInterval;
        short bottlesPerFirstInterval = (short) ((firstInterval / oneCycle) * bottlesPerOneCycle);
        short bottlesPErSecondInterval = (short) ((secondInterval / oneCycle) * bottlesPerOneCycle);
        int bottlesPerThirdInterval = thirdInterval / oneCycle *  bottlesPerOneCycle;
        int bottlesPerFourthInterval = fourthInterval / oneCycle * bottlesPerOneCycle;

        System.out.println("За 20 минут машина произвела " + bottlesPerFirstInterval + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPErSecondInterval + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPerThirdInterval+ " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerFourthInterval + " штук бутылок");

        //Задача 5
        byte totalAmountOfPaint = 120;
        byte whitePaintPerClassroom = 2;
        byte brownPaintPerClassroom = 4;
        byte sumOfPaints = (byte) (whitePaintPerClassroom + brownPaintPerClassroom);
        byte numberOfClasses = (byte) (totalAmountOfPaint / sumOfPaints);
        byte totalWhitePaint = (byte) (numberOfClasses * whitePaintPerClassroom);
        byte totalBrownPaint = (byte) (numberOfClasses * brownPaintPerClassroom);

        System.out.println("В школе, где "+ numberOfClasses + " классов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        /* Не уверен, что надо было прям так подробно расписывать, но, кажется, такой код проще редактировать в будущем
        хотя и выглядит он громоздким */

        //Задача 6
        byte weightOfBanana = 80;
        byte weightOfMilk = 105;
        byte weightOfIceCream = 100;
        byte weightOfEgg = 70;

        byte numberOfBananas = 5;
        byte quantityOfMilk = 2;
        byte amountOfIceCream = 2;
        byte numberOfEggs = 4;

        short totalWeightInGrams = (short) ((weightOfBanana * numberOfBananas) + (weightOfMilk * quantityOfMilk) +
                        (weightOfIceCream * amountOfIceCream) + (weightOfEgg * numberOfEggs));
        float totalWeightInKilograms = totalWeightInGrams / 1000f;
        //System.out.println("Вес такого завтрака в граммах - " + totalWeightInGrams + " грамм");

        System.out.println(totalWeightInGrams);
        System.out.println(totalWeightInKilograms);

        //Задача 7
        byte weightToLose = 7;
        short weightToLoseInGrams = (short) (weightToLose * 1000);
        short minLossPerOneDay = 250;
        short maxLossPerOneDay = 500;
        byte maxDaysToGoal = (byte) (weightToLoseInGrams / minLossPerOneDay);
        byte minDaysToGoal = (byte) (weightToLoseInGrams / maxLossPerOneDay);
        byte averageDaysToGoal = (byte) ((maxDaysToGoal + minDaysToGoal) / 2);

        System.out.println(maxDaysToGoal);
        System.out.println(minDaysToGoal);
        System.out.println(averageDaysToGoal);

        //Задача 8
        int mashaCurrentSalary = 67760;
        int denisCurrentSalary = 83690;
        int kristinaCurrentSalary = 76230;
        byte salaryIncrease = 10;
        int mashaSalaryIncrease = mashaCurrentSalary / salaryIncrease;
        int denisSalaryIncrease = denisCurrentSalary / salaryIncrease;
        int kristinaSalaryIncrease = kristinaCurrentSalary / salaryIncrease;
        int totalMashaSalary = mashaCurrentSalary + mashaSalaryIncrease;
        int totalDenisSalary = denisCurrentSalary + denisSalaryIncrease;
        int totalKristinaSalary = kristinaCurrentSalary + kristinaSalaryIncrease;

        System.out.println("Маша теперь получает " + totalMashaSalary + " рублей. Годовой доход вырос на "
                + mashaSalaryIncrease + " рублей");
        System.out.println("Денис теперь получает " + totalDenisSalary + " рублей. Годовой доход вырос на "
                + denisSalaryIncrease + " рублей");
        System.out.println("Кристина теперь получает " + totalKristinaSalary + " рублей. Годовой доход вырос на "
                + kristinaSalaryIncrease + " рублей");
    }
}