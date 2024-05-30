public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    //Задача 1
    int a = 12222;
    byte b = 23;
    short c = 10000;
    long d = 234567623L;
    float f = 22.234f;
    double e = 21.123456789;
    System.out.println("Значение переменной a с типом int равно " + a + ".");
    System.out.println("Значение переменной b с типом byte равно " + b + ".");
    System.out.println("Значение переменной c с типом short равно " + c + ".");
    System.out.println("Значение переменной d с типом long равно " + d + ".");
    System.out.println("Значение переменной f с типом float равно " + f + ".");
    System.out.println("Значение переменной e с типом double равно " + e + ".");
        //Задача 2
        int newA = -159;
        byte newB = 67;
        short newC = 569;
        short newD = 27897;
        long newE = 987678965549L;
        float newF = 27.12f;
        float newR = 2.786f;
        //Задача 3
        byte firstTeacherPupils = 23;
        byte secondTeacherPupils = 27;
        byte thirdTeacherPupils = 30;
        short allPapers = 480;
        int allPapersForPupils = (allPapers/(firstTeacherPupils+secondTeacherPupils+thirdTeacherPupils));
        System.out.println("На каждого ученика рассчитано " + allPapersForPupils  + " листов бумаги.");
        //Задача 4
        byte capacity = 16/2;
        byte minutes = 20;
        short day = 24 * 60;
        short threeDays = 72 * 60;
        int month = 720 * 60;
        int capacityMinutes = (capacity * minutes);
        int capacityDay = (capacity * day);
        int capacityThreeDays = (capacity * threeDays);
        int capacityMonth = (capacity * month);
        System.out.println("За 20 минут машина произвела " + capacityMinutes  + " штук бутылок.");
        System.out.println("За сутки машина произвела " + capacityDay  + " штук бутылок.");
        System.out.println("За 3 дня  машина произвела " + capacityThreeDays  + " штук бутылок.");
        System.out.println("За месяц машина произвела " + capacityMonth  + " штук бутылок.");
        //Задача 5
        byte whitePaint = 2;
        byte brownPaint = 4;
        int allClassroom = 120/(whitePaint + brownPaint);
        int allClassroomWhitePaint = whitePaint * allClassroom;
        int allClassroomBrownPaint = brownPaint * allClassroom;
        System.out.println("В школе, где " + allClassroom + " классов, нужно " + allClassroomWhitePaint +" банок белой краски и " + allClassroomBrownPaint + " банок коричневой краски");
        //Задача 6
        short bananaWheght = 5 * 80;
        short milkWheght = 100 * 2 * 105;
        short iceCreamWheght = 2 * 100;
        short eggsWheght = 4 * 70;
        float allWheght = (bananaWheght + milkWheght + iceCreamWheght + eggsWheght)/ 1000f;
        System.out.println("Общий вес завтрака " + allWheght + " кг");
        //Задача 7
        byte firstWheghtDay = 7000/250;
        byte secondWheghtDay = 7000/500;
        int allWheghtDay = (firstWheghtDay + secondWheghtDay)/2;
        System.out.println("Колличество дней при 250 грамм: " + firstWheghtDay);
        System.out.println("Колличество дней при 500 грамм: " + secondWheghtDay);
        System.out.println("Среднее колличество дней: " + allWheghtDay);
        //Задача 8
        int ZpMasha = 67760;
        int ZpDenis = 83690;
        int ZpKristina = 76230;
        float newZpMasha = ZpMasha + (ZpMasha * 0.1f);
        float newZpDenis = ZpDenis + (ZpDenis * 0.1f);
        float newZpKristina = ZpKristina + (ZpKristina * 0.1f);
        float differenceAllYearZpMasha = newZpMasha*12 - ZpMasha*12;
        float differenceAllYearZpDenis = newZpDenis*12 - ZpDenis*12;
        float differenceAllYearZpkristina = newZpKristina*12 - ZpKristina*12;
        System.out.println("Маша теперь получает " + newZpMasha + " рублей. Годовой доход вырос на " + differenceAllYearZpMasha + " рублей");
        System.out.println("Денис теперь получает " + newZpDenis + " рублей. Годовой доход вырос на " + differenceAllYearZpDenis + " рублей");
        System.out.println("Кристина теперь получает " + newZpKristina + " рублей. Годовой доход вырос на " + differenceAllYearZpkristina + " рублей");



    }
}