package Infrastructure;

import java.util.Scanner;

public class Console {
    public int introduceData() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public void showData(String data){
        System.out.println(data);

    }
}
