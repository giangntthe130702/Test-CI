/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testci;

import java.util.Scanner;

/**
 *
 * @author giang
 */
public class Bai_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Nhap vao 1 day so, cach nhau boi dau ' ': ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x[] = s.split(" ");
        int[] a = new int[x.length];
        System.out.println("Day so vua nhap theo chieu nguoc: ");
        for (int i = a.length-1; i >= 0; i--) {
            a[i] = Integer.parseInt(x[i]);
            System.out.println(a[i] + " ");

        }
    }
}
