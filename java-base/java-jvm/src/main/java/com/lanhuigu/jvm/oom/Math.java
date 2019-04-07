package com.lanhuigu.jvm.oom;

/**
 * Java内存结构分析
 *
 * @author yihonglei
 * @date 2019/4/6 16:03
 */
public class Math {
    public static final Integer CONSTANT_1 = 666;

    public int math() {
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.math());
        System.out.println("end");
    }
}
