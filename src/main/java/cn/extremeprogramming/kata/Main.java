package cn.extremeprogramming.kata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner size=new Scanner(System.in);
        int result = size.nextInt();
        Game FizzBuzz_game =new Game(result);
        System.out.println(FizzBuzz_game.words());
    }
}
