public class Main {
    public static void main(String[] args) {

//OneTask
        for (int i = 0; i <= 10; i++)
            System.out.println(i);

//TwoTask
        for (int a = 10; a >= 0; a--)
            System.out.println(a);

//ThreeTask
        for (int b = 0; b<=17; b++)
            if (b % 2 ==0)
            System.out.println(b);

//FourTask
        for (int c = 10; c>=-10; c--)
            System.out.println(c);

//FiveTask
        for (int year = 1904; year<=2096; year = year + 4) {
            System.out.println(year + " високосный год");
        }

//SixTask
        for (int d = 0; d<=98; d++)
            if (d%7 ==0)
                System.out.println(d);

//SevenTask
        for (int f = 1; f<=512; f= f * 2)
            System.out.println(f);

//EightTask
        int money = 29000;
        int total = 0;
        for (int g = 0; g<12; g++) {
            total = total + money;
            System.out.println("Месяц " + g + " Итого" + total);
        }

//NineTask
        int money1 = 29000;
        int total1 = 0;
        for (int h = 0; h<12; h++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + money;
            System.out.println("Месяц " + h + " Cумма накоплений равна " + total1 + " рублей.");
        }
    }

}