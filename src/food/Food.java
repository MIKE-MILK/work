package food;

import java.util.Random;
import java.util.Scanner;

/**
此类为食物类
 */
public class Food {

    private double price;
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();

    public void noodles(int a){
        switch (a){
            case 0:
                System.out.println("请支付10元");
                price=10;
                getPrice();
                break;
            case 1:
                System.out.println("请支付12元");
                price=12;
                getPrice();
                break;
        }
    }

    public void rice(int a){
        switch (a){
            case 0:
                System.out.println("请支付10元");
                price=10;
                getPrice();
                break;
            case 1:
                System.out.println("请支付15元");
                price=15;
                getPrice();
                break;
        }
    }

    public void show(int a){
        switch (a){
            case 0:
                System.out.println("1.小面 10元 2.牛肉面 12元");
                int x=random.nextInt(2);
                noodles(x);
                break;
            case 1:
                System.out.println("1.蛋炒饭 10元 2.套饭 15元");
                int y=random.nextInt(2);
                rice(y);
        }
    }

    public double getPrice(){
        return price;
    }
}
