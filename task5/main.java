package task5;

import java.io.IOException;

class Main {
    public static void main(String[] args) throws SecurityException, IOException,
            ThrowError1, ThrowError2 {

        try {
            globalUse.Use();
            throw new ThrowError1();
        } catch (ThrowError1 e) {
            System.out.println(e.getMessage());
        }

        try {
            globalUse.Use();
            throw new ThrowError2();
        } catch (ThrowError2 e) {
            System.out.println(e.getMessage());
        }
    }
}
