import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите пример: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //объект этого класса, открывает поток ввода в консоли
        String s = bufferedReader.readLine(); // Будет читать строку до Enter
        String[] arrS = s.split(" ", (3));  // создаём массив и запихиваем туда нашу строку ввода и при помощи метода сплит разбиваем массив на элементы

        int num1 = Integer.parseInt(arrS[0]); //приведение к целому числу
        int num2 = Integer.parseInt(arrS[2]);
        String sign = arrS[1];
        int res = 0;
        if (Objects.equals(sign, "+") && num1 <= 10 && num1 > 0 && num2 <= 10 && num2 > 0) {    //сравниваем и присваиваем условия для ввода цифр от 1 до 10
            res = num1 + num2;
        } else if (Objects.equals(sign, "-") && num1 <= 10 && num1 > 0 && num2 <= 10 && num2 > 0) { // то же самое для каждого символа
            res = num1 - num2;
        } else if (Objects.equals(sign, "*") && num1 <= 10 && num1 > 0 && num2 <= 10 && num2 > 0) {
            res = num1 * num2;
        } else if (Objects.equals(sign, "/") && num1 <= 10 && num1 > 0 && num2 <= 10 && num2 > 0) {
            res = num1 / num2;
        } else {
            throw new ArithmeticException("Вы ввели не правильное число"); // в случае неврного ввода выводим сообщение
        }
        System.out.println(res);

    }
}