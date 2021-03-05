import java.io.*;

public class Main {
    public static void main(String[] args) {

        PrintStream ps = null;
        try {
            ps = new PrintStream("errors.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            demo();
        } catch (MainMyExeption e) {
            e.getCause();
            System.out.println("Перехвачено исключение - " + e);
            e.printStackTrace();
            e.printStackTrace(ps);
        }

    }

    static void demo() throws MainMyExeption {
        MainMyExeption e = new MainMyExeption("верхний уровень");
        SecondMyException e2 = new SecondMyException("второй уровень");
        e2.initCause(new ThirdMyExeption("причина - третий уровень"));
        e.initCause(e2);
        throw e;
    }
}
