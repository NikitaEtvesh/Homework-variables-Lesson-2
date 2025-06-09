public class Main {
    public static void main(String[] args) {
        System.out.println("Homework variables Lesson 2");
        System.out.println();

        System.out.println("Задача 1");
        int a = 10000;
        byte b = 30;
        short c = 330;
        long d = 5220330;
        float e = 15.7f;
        double f = 308.1;
        System.out.println("Значение переменной с типом int равно " + a );
        System.out.println("Значение переменной с типом byte равно " + b);
        System.out.println("Значение переменной с типом short равно " + c);
        System.out.println("Значение переменной с типом long равно " + d);
        System.out.println("Значение переменной с типом float равно " + e);
        System.out.println("Значение переменной с типом double равно " + f);
        System.out.println();

        System.out.println("Задача 2");
        float g = 27.12f;
        long h = 987678965549L;
        double j = 2.786;
        short k = 569;
        short l = -159;
        short i = 27897;
        byte o = 67;
        System.out.println();

        System.out.println("Задача 3");
        byte studentsLyudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEkaterinaAndreevna = 30;
        short sheetsPaper = 480;
        int sheetsForEach = sheetsPaper / (studentsLyudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + sheetsForEach + " листов бумаги");
        System.out.println();

        System.out.println("Задача 4");
        byte bottleMakingMachinePerfomanceIn2Minutes = 16;
        byte bottleMakingMachinePerfomanceIn1Minute = 16 / 2;
        int bottleMakingMachinePerfomanceIn20Minutes = bottleMakingMachinePerfomanceIn1Minute * 20;
        int bottleMakingMachinePerfomancePerDay = bottleMakingMachinePerfomanceIn1Minute * (60*24);
        int bottleMakingMachinePerfomanceIn3Day = bottleMakingMachinePerfomanceIn1Minute * ((60*24)*3);
        int bottleMakingMachinePerfomanceFor1month = bottleMakingMachinePerfomanceIn1Minute * ((60*24)*30);
        System.out.println("За 2 минуты машина произвела " + bottleMakingMachinePerfomanceIn2Minutes + " штук бутылок");
        System.out.println("За 1 минуту машина произвела " + bottleMakingMachinePerfomanceIn1Minute + "штук бутылок");
        System.out.println("За 20 минут машина произвела " + bottleMakingMachinePerfomanceIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleMakingMachinePerfomancePerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleMakingMachinePerfomanceIn3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottleMakingMachinePerfomanceFor1month + " штук бутылок");
        System.out.println();

        System.out.println("Задача 5");
        short theRequiredNumberOfCansOfPaintForSchool = 120;
        byte whitePaintIsOneClass = 2;
        byte brownPaintIsOneClass = 4;
        int totalPaintConsumptionPerClass = (whitePaintIsOneClass + brownPaintIsOneClass);
        int totalClasses = theRequiredNumberOfCansOfPaintForSchool / totalPaintConsumptionPerClass;
        int totalCansOfWhitePaint = totalClasses * whitePaintIsOneClass;
        int totalCansOfBrownPaint = totalClasses * brownPaintIsOneClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalCansOfWhitePaint + " банок белой краски и " + totalCansOfBrownPaint + " банок коричневой краски");
        System.out.println();

        System.out.println("Задача 6");
        byte bananas = 5;
        byte bananaweight = 80;
        int milkvolume = 200;
        int weight100gOfMilk = 105;
        int massIceCreamSundae = 2 * 100;
        int eggs = 4;
        int eggWeight = 70;
        int totalWeight = (bananas * bananaweight) + (milkvolume / 100 * weight100gOfMilk) + massIceCreamSundae + (eggs * eggWeight);
        double totalWeightKg = totalWeight / 1000.0;
        System.out.println("Общий вес спортивного завтрака: " + totalWeight + " грамм");
        System.out.println("Общий вес спортивного завтрака: " + totalWeightKg + " килограмм");
        System.out.println();

        System.out.println("Задача 7");
        int excessWeightKg = 7;
        int ration1PerDay = 250;
        int ration2PerDay = 500;
        int excessWeightg = 7 * 1000;
        int weightLossDays250g = excessWeightg / ration1PerDay;
        int weightLossDays500g = excessWeightg / ration2PerDay;
        int averageDays = (weightLossDays250g + weightLossDays500g) / 2;
        System.out.println("При потере веса 250 грамм в день, для похудения необходимо " + weightLossDays250g + " дней");
        System.out.println("При потере веса 500 грамм в день, для похудения необходимо " + weightLossDays500g + " дней");
        System.out.println("В среднем может потребоваться " + averageDays + " дней, чтобы добиться результата");
        System.out.println();

        System.out.println("Задача 8");
        int mashaMonthlySalary = 67760;
        double mashaIncreaseSalary = mashaMonthlySalary * 0.10;
        double mashaNewSalary = mashaMonthlySalary + mashaIncreaseSalary;
        int mashaAnnualIncomeBeforePromotion = mashaMonthlySalary * 12;
        double mashaAnnualIncomeAfterTheIncrease = mashaNewSalary * 12;
        double mashaDifference = mashaAnnualIncomeAfterTheIncrease - mashaAnnualIncomeBeforePromotion;

        int denisMonthlySalary = 83690;
        double denisIncreaseSalary = denisMonthlySalary * 0.10;
        double denisNewSalary = denisMonthlySalary + denisIncreaseSalary;
        int denisAnnualIncomeBeforePromotion = denisMonthlySalary * 12;
        double denisAnnualIncomeAfterTheIncrease = denisNewSalary * 12;
        double denisDifference = denisAnnualIncomeAfterTheIncrease - denisAnnualIncomeBeforePromotion;

        int kristinaMonthlySalary = 76230;
        double kristinIncreaseSalary = kristinaMonthlySalary * 0.10;
        double kristinNewSalary = kristinaMonthlySalary + kristinIncreaseSalary;
        int kristinAnnualIncomeBeforePromotion = kristinaMonthlySalary * 12;
        double kristinAnnualIncomeAfterTheIncrease = kristinNewSalary * 12;
        double kristinDifference = kristinAnnualIncomeAfterTheIncrease - kristinAnnualIncomeBeforePromotion;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinNewSalary + " рублей. Годовой доход вырос на " + kristinDifference + " рублей");



    }
    }