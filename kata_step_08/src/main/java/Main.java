import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String[] str = {"Мама", "авТо", "гриБ", "яБлоко", "ябЛоко",
                "агент007","стриж", "ГТО","Три богатыря","  Привет"};
        for(int x = 0; x< str.length;x++){
            System.out.println(chekByPattern(str[x]));
        }

    }

    public static boolean chekByPattern(String input){
        return input.matches("([а-яё]+)?[А-ЯЁ]([а-яё]+)?");

    }
}

// Напишите регулярное выражение, которое позволяет выделить все строки отвечающие условиям:
// Состоят только из букв
// Одна и только одна из букв является заглавной