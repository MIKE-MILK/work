package student;

import canteen.CenterCanteen;
import canteen.QianXiHe;

import java.util.Random;
import java.util.Scanner;

public class Student {

    public void run(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Random random1=new Random();
                    int a=random1.nextInt(100);
                    for (int i=0;i<a;i++){
                        Student student=new Student();
                        Random random=new Random();
                        int x=random.nextInt(2);
                        student.choose(x);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void choose(int i){
        switch (i){
            case 0:
                System.out.println("去中心食堂吃饭");
                CenterCanteen centerCanteen=new CenterCanteen();
                centerCanteen.show();
//                Scanner scanner=new Scanner(System.in);
                System.out.println("1.支付宝支付 2.微信支付");
                Random random=new Random();
                int a=random.nextInt(2);
//                int a=scanner.nextInt();
                centerCanteen.pay_way(a);
                break;
            case 1:
                System.out.println("去千喜鹤吃饭");
                QianXiHe qianXiHe=new QianXiHe();
                qianXiHe.show();
//                Scanner scanner1=new Scanner(System.in);
                System.out.println("1.支付宝支付 2.微信支付");
//                int b=scanner1.nextInt();
                Random random1=new Random();
                int b=random1.nextInt(2);
                qianXiHe.pay_way(b);
                break;
        }
    }
}
