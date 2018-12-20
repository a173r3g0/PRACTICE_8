проверить правильно ли расставлены скобки: [], {} и (). Обпащать внимание остальноеи не надо.

import java.util.Objects;
import java.util.Vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lineS;
        Vector <Character> vect = new Vector<Character>();
        System.out.println("Введите выражение и правильно расставьте скобки\n");
        lineS = input.nextLine();
        for (int i = 0; i < lineS.length(); i++)
        {
            char simb = lineS.charAt(i);
            if (simb == '(' || simb == '[' || simb == '{')
            {
                vect.add(simb);
            }
            else if (simb == ')' || simb == ']' || simb == '}')
                for (int vSize = 0; vSize < vect.size(); vSize++)
                {
                    if ( vect.get(vSize).equals('(') && simb == ')' || vect.get(vSize).equals('[') && simb == ']' || vect.get(vSize).equals('{') && simb == '}' )

                    {
                        vect.remove(vSize);
                    }
                }
        }
        if (vect.isEmpty()) System.out.println("Всё хорошо");
        else System.out.println("Скобки плохо расставлены");
    }

}
