package p01_GenericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Box> boxes = new ArrayList<>();
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            boxes.add(
                    new Box(reader.readLine()));
        }

        for (Box box : boxes) {
            System.out.println(box.toString());
        }
    }
}
