package com.demo.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

    @Test
    public void contextLoads() {
        // 补码       00000000 00000000 00000000 00000010
        // 取反       11111111 11111111 11111111 11111101   运算后的补码
        // 运算后的反码 11111111 11111111 11111111 11111100
        // 运算后的原码 10000000 00000000 00000000 00000011
        // 结果 -3
        System.out.println(~2);

        // 2补码  00000000 00000000 00000000 00000010
        // 3补码  00000000 00000000 00000000 00000011
        // &运算  00000000 00000000 00000000 00000010
        // 结果 2
        System.out.println(2&3);

        // 2补码  00000000 00000000 00000000 00000010
        // 3补码  00000000 00000000 00000000 00000011
        // |运算  00000000 00000000 00000000 00000011
        // 结果 3
        System.out.println(2|3);

        // -5原码         10000000 00000000 00000000 00000101
        // 补码（反码+1）  11111111 11111111 11111111 11111011
        // ~取反          00000000 00000000 00000000 00000100
        // 结果 4
        System.out.println(~-5);

        // -3原码         10000000 00000000 00000000 00000011
        // -3补码         11111111 11111111 11111111 11111101
        // 3补码          00000000 00000000 00000000 00000011
        // ^运算          11111111 11111111 11111111 11111110
        // 反码（补码-1）  11111111 11111111 11111111 11111101
        // 原码（反码-1）  10000000 00000000 00000000 00000010
        // 结果 -1
        System.out.println(-3^3);

        // 1 00000000 00000000 00000000 00000001
        //   00000000 00000000 00000000 00000000 10000000
        System.out.println("1>>2=");
        System.out.println(1>>2);

        int x = 1;
        System.out.println(++x+1);
        System.out.println(x++ +1);
        System.out.println(x);

        char c1 = 's';
        String s1 = String.valueOf(c1);
        System.out.println(s1);

        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        List list = new ArrayList<Integer>();
        System.out.println(peach(9));

        // register
    }

    public int peach(int day){
        if(day==10){
            return 1;
        }
        return (peach(day+1)+1)*2;
    }

    @Test
    public void lambdaTest(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("111");
            }
        };
        r1.run();
        System.out.println("*******************");
        Runnable r2 = () -> System.out.println("222");
        r2.run();
    }

    @Test
    public void lambdaTest2(){
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        int compare = c1.compare(12, 21);
        System.out.println(compare);
        System.out.println("*******************");
        Comparator<Integer> c2 = (o1,o2) ->  Integer.compare(o1,o2);
        int compare1 = c2.compare(22, 21);
        System.out.println(compare1);

        Consumer<String> c3 = s -> System.out.println(s);
        c3.accept("333");
    }

    @Test
    public void lambdaTest3(){
        Consumer<String> c1 = System.out::println;
        c1.accept("test111");

    }
}
