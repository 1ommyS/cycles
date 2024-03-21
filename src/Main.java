//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1... 1.000.000
        // вывести все четные числа

        int schetshik = 1;

        while (schetshik <= 10) {
            if (schetshik % 2 == 0) {
                System.out.println("четное");
            }

            schetshik++;
        }

        // в последовательности чисел от [1,50] найти 35, остальные числа не выводить

        int i = 1;

        while (i <= 50) {
            if (i == 35) {
                System.out.println(i);
                break;
            }
            System.out.println(i);
            i++;
        }
        // в последовательности чисел от [1;50] найти все нечетные числа тремя способами
/*
        int j = 1;
        while (j <= 50) {
            *//*
            // 1 способ
            if (j % 2 == 1) {
                System.out.println("нечетное " + j);
            }
            j++;
            *//*

            // 2 способ
            *//*
            if (j % 2 == 0) {
                continue;
            }
            System.out.println("нечетное " + j);
            j++;
            *//*

            System.out.println(j);
            j = j + 2;
        }*/

        for (
                int j = 1;
                j <= 50;
                j = j + 2
        ) {
            System.out.println("нечетные числа: " + j);
        }

        // даны три числа: a,b,c. выяснить имеет ли уравнение ax^2+bx+c=0 вещественные корни. Если имеются, вывести их, иначе ошибка.

        double a = 10;
        double b = 7;
        double c = -17;

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d < 0) {
            System.out.println("иди в жопу");
        } else if (d == 0) {
            double x = -1 * b / (2 * a);
            System.out.println(x);
        } else {
            double x1 = (-1 * b + Math.sqrt(d)) / (2 * a);
            double x2 = (-1 * b - Math.sqrt(d)) / (2 * a);
            System.out.println(x1 + ":" + x2);
        }


        /*
        найти все трехзначные числа, чьи квадраты оканчиваются ТРЕМЯ цифрами, которые и составляют изначальное число: 255,**2. последние три цифры тоже 255
        найти все трехзначные числа, кратные семи и у которых сумма цифр также кратна семи
        дано натуральное число, получить всего его делители
         */

        for (int m = 100; m <= 999; m++) {
            int kvadrat = m * m;

            int lastTriCifra = kvadrat % 1000;

            if (lastTriCifra == m) {
                System.out.println(m);
            }
        }

        for (int m = 100; m <= 999; m++) {
            if (m % 7 == 0) {
                int sum = 0;

                int copyM = m;

                while (copyM > 0) {
                    sum += copyM % 10;
                    copyM = copyM / 10;
                    // m /= 10;
                }

                if (sum % 7 == 0)
                    System.out.println(sum);
            }
        }


        int startInterval = 1000;
        int endInteval = 15000;

        int maxSumDeliteley = 0;
        int chislo = 0;

        for (int m = startInterval; m < endInteval; m++) {
            int tekushayaSumaDeliteley = 0;

            for (int delitel = 1; delitel <= m; delitel++) {
                if (m % delitel == 0) {
                    tekushayaSumaDeliteley += m;
                }
            }

            if (tekushayaSumaDeliteley > maxSumDeliteley) {
                maxSumDeliteley = tekushayaSumaDeliteley;
                chislo = m;
            }
        }

        System.out.println(maxSumDeliteley);
        System.out.println(chislo);

        // найти натуральное число из интверала от а до б с максимальной суммой делителей


    }
}
