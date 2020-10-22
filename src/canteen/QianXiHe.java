package canteen;

import food.Food;

import java.util.Random;
import java.util.Scanner;

public class QianXiHe implements CanteenBehavior{

    private static double first_money=10000;
    private double price;
    Food food=new Food();
    Scanner scanner=new Scanner(System.in);

    @Override
    public void sell(int a) {
        switch (a){
            case 0:
                System.out.println("要吃什么面条：");
                food.show(0);
                break;
            case 1:
                System.out.println("要吃什么炒饭讨饭：");
                food.show(1);
                break;
        }
    }

    @Override
    public void collect_money() {
        first_money+=food.getPrice();
        System.out.println("当前的💰："+first_money+"元");
    }

    @Override
    public void pay_way(int a) {
        switch (a){
            case 0:
                System.out.println("支付宝支付"+food.getPrice()+"成功");
                collect_money();
                break;
            case 1:
                System.out.println("微信支付"+food.getPrice()+"成功");
                collect_money();
                break;
        }
    }

    @Override
    public void show() {
        System.out.println("千喜鹤食堂的窗口：");
        System.out.println("1.面条窗口 2.炒饭套饭窗口");
        Random random=new Random();
        int a=random.nextInt(2);
        sell(a);
    }
}
