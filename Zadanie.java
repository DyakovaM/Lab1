package ST_LAB1;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите № задачи ");
        int zadacha = in.nextInt();
        if (zadacha == 1) {
            System.out.print("Введите целое число ");
            int a = in.nextInt();
            System.out.println("последняя цифра числа = " + one(a));
        }
        if (zadacha == 2) {
            System.out.print("Введите трехзначное число ");
            int a = in.nextInt();
            System.out.println("Сумма цифр трехначного числа " + a + " = " + two(a));
        }
        if (zadacha == 3) {
            System.out.print("Введите целое число ");
            int a = in.nextInt();
            System.out.println("Результат : " + three(a));
        }
        if (zadacha == 4) {
            System.out.print("Введите целое число ");
            int a = in.nextInt();
            System.out.println("Результат : " + four(a));
        }
        if (zadacha == 5) {
            System.out.print("Введите первое число ");
            int a = in.nextInt();
            System.out.print("Введите второе число ");
            int b = in.nextInt();
            System.out.print("Введите третье число ");
            int c = in.nextInt();
            System.out.println("Наименьшее число : " + five(a, b, c));
        }
        if (zadacha == 6) {
            System.out.print("Введите целое число ");
            int a = in.nextInt();
            System.out.println("Результат : " + six(a));
        }
        if (zadacha == 7) {
            System.out.print("Введите код города ");
            int a = in.nextInt();
            System.out.println("Результат : " + seven(a));
        }
        if (zadacha == 8) {
            int[] arr;
            int x;
            System.out.print("Введите длину массива ");
            x = in.nextInt();
            arr = new int[x];
            for (int i = 0; i < x; i++) {
                System.out.print("Введите элемент массива ");
                arr[i] = in.nextInt();
                System.out.println(new StringBuilder().append("Результат : ").append(eight(arr)).toString());
            }
        }
        if (zadacha == 9){
            int[] arr;
            int x;
            System.out.print("Введите длину массива ");
            x = in.nextInt();
            arr= new int[x];
            for(int i=0;i<x;i++){
                System.out.print("Введите элемент массива ");
                arr[i]=in.nextInt();
            }
            System.out.println("Преобразованный массив: " +nine(arr));
        }
        if (zadacha == 10){
            int[] arr;
            int x;
            System.out.print("Введите длину массива ");
            x = in.nextInt();
            arr= new int[x];
            for(int i=0;i<x;i++){
                System.out.print("Введите элемент массива ");
                arr[i]=in.nextInt();
            }
            System.out.println("Преобразованный массив: " +ten(arr));
        }
    }

    public static int one(int a) {
        return a % 10;
    }

    public static int two(int a) {
        int b = 0;
        while (a != 0) {
            b += a % 10;
            a /= 10;
        }
        return b;
    }

    public static int three(int a) {
        if (a > 0) {
            a = a + 1;
        }
        return (a);
    }

    public static int four(int a) {
        if (a > 0) {
            a = a + 1;
        }
        if (a == 0) {
            a = 10;
        } else {
            a = a - 2;
        }
        return (a);
    }

    public static int five(int a, int b, int c) {
        int min = 0;
        if (b > a) {
            min = a;
            if (c > b) {
                min = b;
            } else if (a > c) {
                min = c;
            }

        }

        return (min);
    }

    public static String six(int a) {
        String text = "";
        if (a > 0) {
            text = "Положительное";
        } else if (a < 0) {
            text = "Отрицительное";
        } else if (a == 0) {
            text = "Нулевое";
        }
        if (a % 2 == 0) {
            text += " четное";
        } else {
            text += " нечетное";
        }
        return (text);
    }

    public static String seven(int a) {
        String text = "";
        if (a == 905) {
            text = "Москва. Стоимость разговора: 41,50";
        } else if (a == 194) {
            text = "Ростов. Стоимость разговора: 19,80";
        } else if (a == 491) {
            text = "Краснодар. Стоимость разговора: 26,90";
        } else if (a == 800) {
            text = "Киров. Стоимость разговора: 50,00";
        }
        return (text);
    }

    public static boolean eight(int[] array) {
        int max = 0;
        int sum_posit = 0;
        int sum_negat = 0;
        int k_posit = 0;
        int k_negat = 0;
        int m_negat = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] > 0) {
                sum_posit += array[i];
                k_posit += 1;
            }
            if (array[i] < 0) {
                sum_negat += array[i];
                k_negat += 1;
                if ((array[i] % 2) == 0) {
                    m_negat += array[i];
                }
            }
        }
        int ka;
        ka = sum_negat/k_negat;
        System.out.println("Максимальное значение: " + max + " \n " + "Сумма положительных элементов: " + sum_posit + "\n" +
                "Сумму четных отрицательных элементов: " + m_negat + "\n" + "Количество положительных элементов: " + k_posit + "\n"
                + "Среднее арифметическое отрицательных элементов: " + ka + "\n");
        return false;
    }
    public static String nine(int[] array) {
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        return Arrays.toString(array);
    }
    public static String ten(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0)
            {
                for (int j = i + 1; j < array.length; j++)
                {
                    if (array[j] != 0)
                    {
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                        break;
                    }
                }
            }
        }
        return Arrays.toString(array);
    }
}
