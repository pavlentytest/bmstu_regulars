package ru.samsung.itschool.mdev;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	  // Регулярные выражения - описываются в виде строк (шаблонов)
        // При выполнения компилирует эту строку (шаблон) в объект класс Pattern
        // Для поиска совпадений используется класс Matcher

        // bmstu.ru
        Pattern p1 = Pattern.compile(".+\\.(org|ru)");
        Matcher m1 = p1.matcher("bmstu.org");
        System.out.println(m1.matches());

        Pattern p2 = Pattern.compile("^[a-c0-5A-Z]+$");
        Matcher m2 = p2.matcher("cZ6");
        System.out.println(m2.matches());

        String text = "Егор Алла Александр";
        //String str = "A.+a"; // жадный
        // String str = "A.++a"; // сверхжадный - то обратно не идет
        // String str = "А.+?а"; // ленивый
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            System.out.println(text.substring(matcher.start(),matcher.end()));
        }

        String str2 = "adfgadfgadfg";
        // str2.charAt()

        String[] words = {"Ivan", "Table", "Chair"};
        for(int i=0;i<words.length;i++) {
            char ch = words[i].charAt(0);
            if(ch >= 'B' && ch <= 'H') {
                // что-то
            }
        }



    }
}
