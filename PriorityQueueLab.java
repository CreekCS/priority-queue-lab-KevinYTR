// import statements
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class PriorityQueueLab {
    public static void main(String args[]) {
        try {
            PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
            File file = new File("RandIntegers.txt");
            Scanner key = new Scanner(file);

            while (key.hasNextLine()) {
                pQueue.add(key.nextInt());
            }

            while (!pQueue.isEmpty()) {
                out.println(pQueue.remove());
            }

            key.close();
        } catch (FileNotFoundException e){
            out.println("Didn't work m8");
            out.println(e.getMessage());
        }
    }
}

