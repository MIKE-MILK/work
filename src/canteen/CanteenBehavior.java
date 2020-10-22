package canteen;

public interface CanteenBehavior {
    //出售
    void sell(int a);
    //收钱
    void collect_money();
    //支付方式
    void pay_way(int a);
    //菜单的展示
    void show();
}
