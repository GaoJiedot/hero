import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class hhh {

    static String[] hero = {"美国队长", "钢铁侠", "绿巨人", "蜘蛛侠", "黑寡妇", "鹰眼", "蝙蝠侠", "金刚狼", "泰迦奥特曼", "假面骑士zero one"};

    public static void main(String[] args) {
        System.out.println("输入s开始抽奖");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.next().equals("s")) {
                for (int j = 0; j < 5; j++) {
                    for (int i = 0; i < hero.length; i++) {
                        System.out.println(hero[i]);

                    }

                }
                int a = (int) (Math.random() * hero.length);
                System.out.println("恭喜" + hero[a] + "中奖");
            }
            if (n = 1)
                choose(hero);
            else
                choose(n.hero);
            break;
        }else{
            System.out.println("输入s开始抽奖");


        }
    }

    static void choose(int n, String[] hero) {
        int a = (int) (Math.random() * hero.length);
        for (int i = 1; i < -n; i++) {
            int d = ThreadLocalRandom.current().nextInt();
            System.out.println(hreo[n]);
        }
    }
}
