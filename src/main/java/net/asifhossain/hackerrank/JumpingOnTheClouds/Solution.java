package net.asifhossain.hackerrank.JumpingOnTheClouds;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        int e = 100;
        int pos = 0;

        do {
            pos = (pos + k) % n;
            e--;
            if(c[pos] == 1) {
                e = e - 2;
            }
        } while(pos != 0);


        System.out.println(e);
    }
}