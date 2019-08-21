package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     *
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     *
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 96, 18, 26 и 0.</p>
     */
    public int[] getAllNumbers(String text) {
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(text);
        List<String> stringsList = new ArrayList<>();
        while (m.find()) {
            stringsList.add(m.group());
        }
        int[] result = new int[stringsList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(stringsList.get(i)) * 2;
        }
        return result;
    }
}
