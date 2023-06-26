package com.juaracoding;

public class LoopingWhile {
    public static void main(String[] args) {
        int sum = 0;
        int item = 0;
        while (item < 5){ //4 < 5 (0+1+2+3+4)
            item++; // 5
            if(item == 2) continue;
            System.out.print(item+" ");
            sum+=item; // sum = sum + item // sum = 1 + 3
//            if(sum >= 6) break;
        }
        System.out.println();
        System.out.println("The sum is "+sum);
    }
}
