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

    public static void task1 () {
        System.out.println("Задача 1");
        int apples = 9923533;
        System.out.println("Значение переменной apples с типом int равно " + apples);
        byte pineapples = 99;
        System.out.println("Значение переменной pineapples с типом byte равно " + pineapples);
        short oranges = 9977;
        System.out.println("Значение переменной oranges с типом short равно " + oranges);
        long strawberry = 99342423525L;
        System.out.println("Значение переменной strawberry с типом long равно " + strawberry);
        float grape = 3.7f;
        System.out.println("Значение переменной grape с типом float равно " + grape);
        double rottenTomatoes = 9999.314;
        System.out.println("Значение переменной rottenTomatoes с типом double равно " + rottenTomatoes);
        }
    public static void task2 () {
        System.out.println("Задача 2");
        float A = 27.12f;
        System.out.println("Значение переменной A с типом float равно " + A);
        long B = 987678965549L;
        System.out.println("Значение переменной B с типом long равно " + B);
        float C = 2.786f;
        System.out.println("Значение переменной C с типом float равно " + C);
        short D = 569;
        System.out.println("Значение переменной D с типом short равно " + D);
        short E = -159;
        System.out.println("Значение переменной E с типом short равно " + E);
        short F = 27897;
        System.out.println("Значение переменной F с типом double равно " + F);
        byte G = 67;
        System.out.println("Значение переменной G с типом byte равно " + G);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte studentsLydmilla = 23;
        System.out.println("There are " + studentsLydmilla + " students at Lydmilla's class.");
        byte studentsAnna = 27;
        System.out.println("There are " + studentsAnna + " students at Anna's class.");
        byte studentsEkaterina = 30;
        System.out.println("There are " + studentsEkaterina + " students at Ekaterina's class.");
        short paperPurchased = 480;
        System.out.println(paperPurchased + " pieces of paper are purchased");
        int paperForEachStudent = paperPurchased / (studentsAnna + studentsEkaterina + studentsLydmilla);
        System.out.println("Consequently, " + paperForEachStudent + " pieces of paper fall on each student");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte machineProductivity = 16/2;
        System.out.println("Machine's productivity is " + machineProductivity + " bottles in a minute");
        byte period1 = 20;
        int machinePerformance1 = machineProductivity * period1;
        System.out.println("Machine performance in 20 minutes is " + machinePerformance1 + " bottles");
        short period2 = 60 * 24;
        int machinePerformance2 = machineProductivity * period2;
        System.out.println("Machine performance in a day is " + machinePerformance2 + " bottles");
        short period3 = 60 * 24 * 3;
        int machinePerformance3 = machineProductivity * period3;
        System.out.println("Machine performance in three days is " + machinePerformance3 + " bottles");
        int period4 = 60 * 24 * 30;
        int machinePerformance4 = machineProductivity * period4;
        System.out.println("Machine performance in a month is " + machinePerformance4 + " bottles");
            }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPaintNeed = 120;
        System.out.println("There is a need of " + totalPaintNeed + " white and brown paint cans for school maintenance");
        byte whitePaintConsumption = 2;
        System.out.println("White paint consumption is " + whitePaintConsumption + " cans for every class");
        byte brownPaintConsumption = 4;
        System.out.println("Brown paint consumption is " + brownPaintConsumption + " cans for every class");
        int classesPainted = totalPaintNeed / (whitePaintConsumption + brownPaintConsumption);
        int whitePaintUsed = whitePaintConsumption * classesPainted;
        int brownPaintUsed = brownPaintConsumption * classesPainted;
        System.out.println("There is a need of " + whitePaintUsed + " white and " + brownPaintUsed + " brown paint cans in the school which has " + classesPainted + " classes");
            }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananaAmount = 5;
        short bananaWeight = 80;
        byte milkAmountOfHundred = 2;
        byte milkWeight = 105;
        byte milkyIceCreamAmount = 2;
        byte milkyIceCreamWeight = 100;
        byte rawEggAmount = 4;
        byte rawEggWeight = 70;
        int totalWeight1 = bananaWeight * bananaAmount + milkWeight * milkAmountOfHundred + milkyIceCreamWeight * milkyIceCreamAmount + rawEggWeight * rawEggAmount;
        System.out.println("The total weight of the dish is " + totalWeight1 + " gram.");
        float totalWeight2 = totalWeight1 / 1000f;
        System.out.println("The total weight of the dish is " + totalWeight2 + " kilogram.");
         }
    public static void task7 () {
        System.out.println("Задача 7");
        byte weightToLose = 7;
        float weightLoseDayRate1 = 0.25f;
        float weightLoseDayRate2 = 0.5f;
        float daysToLoseWeight1 = weightToLose / weightLoseDayRate1;
        float daysToLoseWeight2 = weightToLose / weightLoseDayRate2;
        System.out.println("First option. The amount of days to lose " + weightToLose + " kilogram is " + daysToLoseWeight1 + " days");
        System.out.println("Second option. The amount of days to lose " + weightToLose + " kilogram is " + daysToLoseWeight2 + " days");
            }
    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary2022 = 67760;
        int denisSalary2022 = 83690;
        int khristinaSalary2022 = 76230;
        double mashaSalary2023 = mashaSalary2022 * 1.1;
        double denisSalary2023 = denisSalary2022 * 1.1;
        double khristinaSalary2023 = khristinaSalary2022 * 1.1;
        double mashaAnnualSalaryGrowth = (mashaSalary2023 - mashaSalary2022) * 12;
        double denisAnnualSalaryGrowth = (denisSalary2023 - denisSalary2022) * 12;
        double khristinaAnnualSalaryGrowth = (khristinaSalary2023 - khristinaSalary2022) * 12;
        System.out.println("Masha's monthly salary now is " + mashaSalary2023 + " rubles. Her annual income's increased by " + mashaAnnualSalaryGrowth + " rubles");
        System.out.println("Den's monthly salary now is " + denisSalary2023 + " rubles. His annual income's increased by " + denisAnnualSalaryGrowth + " rubles");
        System.out.println("Khristina's monthly salary now is " + khristinaSalary2023 + " rubles. Her annual income's increased by " + khristinaAnnualSalaryGrowth + " rubles");
    }
}