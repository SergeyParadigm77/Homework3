public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        float e = 1.12345678f;
        double f = 1.1234567890123456;
        System.out.println("Значение пересенной 'a' с типом byte равно " + a);
        System.out.println("Значение пересенной 'b' с типом short равно " + b);
        System.out.println("Значение пересенной 'c' с типом int равно " + c);
        System.out.println("Значение пересенной 'd' с типом long равно " + d);
        System.out.println("Значение пересенной 'e' с типом float равно " + e);
        System.out.println("Значение пересенной 'f' с типом double равно " + f);
    }

    public static void task2() {
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = - 159;
        short f = 27897;
        byte g = 67;
    }

    public static void task3() {
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short allPaper = 480;
        int onePaper = allPaper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + onePaper + " листов бумаги");
    }

    public static void task4() {
        byte performancePerTwoMinutes = 16;
        byte timeTwoMinutes = 2;
        int performancePerOneMinute = performancePerTwoMinutes / timeTwoMinutes;
        byte timeTwentyMinutes = 20;
        int performancePerTwentyMinutes = performancePerOneMinute * timeTwentyMinutes;
        System.out.println("За 20 минут машина произвела " + performancePerTwentyMinutes + " штук бутылок");
        byte timeOneDay = 1;
        int performancePerDay = performancePerOneMinute * timeOneDay * 24 * 60;
        System.out.println("За 1 день машина произвела " + performancePerDay + " штук бутылок");
        byte timeThreeDays = 3;
        int performancePerThreeDays = performancePerDay * timeThreeDays;
        System.out.println("За 3 дня машина произвела " + performancePerThreeDays + " штук бутылок");
        byte timeOneMonth = 1;
        int performancePerOneMonth = performancePerDay * timeOneMonth * 30;
        System.out.println("За 1 месяц машина произвела " + performancePerOneMonth + " штук бутылок");
    }

    public static void task5() {
        byte numberPerSchoolWhiteBrown = 120;
        byte numberPerClassWhite = 2;
        byte numberPerClassBrown = 4;
        int numberPerSchoolClass = numberPerSchoolWhiteBrown / (numberPerClassWhite + numberPerClassBrown);
        int numberPerSchoolWhite = numberPerSchoolClass * numberPerClassWhite;
        int numberPerSchoolBrown = numberPerSchoolWhiteBrown - numberPerSchoolWhite;
        System.out.println("В школе где "+ numberPerSchoolClass + " классов, нужно " + numberPerSchoolWhite + " банок белой краски и " + numberPerSchoolBrown + " банок коричневой краски");
    }

    public static void task6() {
        byte numberBanana = 5;
        byte weightGramBanana = 80;
        short volumeMilliliterMilk = 200;
        byte weightGramOneHundredMilliliterMilk = 105;
        byte numberIceCream = 2;
        byte weightGramIceCream = 100;
        byte numberRawEgg = 4;
        byte weightGramRawEgg = 70;
        int weightGramBreakfast = numberBanana * weightGramBanana + volumeMilliliterMilk * weightGramOneHundredMilliliterMilk / 100 + numberIceCream * weightGramIceCream + numberRawEgg * weightGramRawEgg;
        float weightKilogramBreakfast = weightGramBreakfast / 1000f;
        System.out.println("Вес завтрака составляет " + weightGramBreakfast + " грамм" + " или " + weightKilogramBreakfast + " килограмм");
    }

    public static void task7() {
        byte taskKilogramWeightLoss = 7;
        short taskGramWeightLossPerDayOne = 250;
        short taskGramWeightLossPerDayTwo = 500;
        int numberDayWeightLossOne = taskKilogramWeightLoss * 1000 / taskGramWeightLossPerDayOne;
        int numberDayWeightLossTwo = taskKilogramWeightLoss * 1000 / taskGramWeightLossPerDayTwo;
        int numberDayWeightLossAverage = (numberDayWeightLossOne + numberDayWeightLossTwo) / 2;
        System.out.println(numberDayWeightLossOne + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + taskGramWeightLossPerDayOne + " грамм в день, и " + numberDayWeightLossTwo + "  дней уйдет на похудение, если спортсмен будет терять каждый день по " + taskGramWeightLossPerDayTwo +" грамм в день");
        System.out.println("Чтобы добиться результата похудения в среднем может потребоваться " + numberDayWeightLossAverage +" день");
    }
    public static void task8() {
        int salaryMonthMasha = 67760;
        int salaryMonthDenis = 83690;
        int salaryMonthKristina = 76230;
        float newSalaryMonthMasha = salaryMonthMasha + salaryMonthMasha * 0.1f;
        float newSalaryMonthDenis = salaryMonthDenis + salaryMonthDenis * 0.1f;
        float newSalaryMonthKristina = salaryMonthKristina + salaryMonthKristina * 0.1f;
        float salaryIncreaseYearMasha = (newSalaryMonthMasha - salaryMonthMasha) * 12f;
        float salaryIncreaseYearDenis = (newSalaryMonthDenis - salaryMonthDenis) * 12f;
        float salaryIncreaseYearKristina = (newSalaryMonthKristina - salaryMonthKristina) * 12f;
        System.out.println("«Маша теперь получает " + newSalaryMonthMasha + " рублей. Годовой доход вырос на " + salaryIncreaseYearMasha + " рублей».");
        System.out.println("«Денис теперь получает " + newSalaryMonthDenis + " рублей. Годовой доход вырос на " + salaryIncreaseYearDenis + " рублей».");
        System.out.println("«Кристина теперь получает " + newSalaryMonthKristina + " рублей. Годовой доход вырос на " + salaryIncreaseYearKristina + " рублей».");
        System.out.println("Домашка выполнена!");
    }
}