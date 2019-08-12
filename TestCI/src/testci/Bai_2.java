/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testci;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author giang
 */
public class Bai_2 {

    public static void main(String[] args) {
        System.out.print("Nhập day so: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x[] = s.split(", ");
        int[] a = new int[x.length];
        System.out.print("Trong day so: ");
        for (int i = 0; i < x.length; i++) {
            a[i] = Integer.parseInt(x[i]);
            System.out.print(a[i] + " ");
        }
        System.out.println("\nCo cac cap so phan biet sau co tich la 256: ");
        ArrayList<Integer> h = new ArrayList();
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] * a[j] == 256) {
                    if (!h.contains((Object) a[i])) {
                        System.out.println(a[i] + " va " + a[j] + " tai vi tri " + (i + 1) + " va " + (j + 1));
                        h.add(a[j]);
                        if (a[i] != a[j]) {
                            h.add(a[j]);
                            h.add(a[i]);
                        }
                    }
                }
            }
        }
    }
}
