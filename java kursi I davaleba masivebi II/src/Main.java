import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1


        int[] arr1 = {5, 3, 8, 2, 7};

        while (true) {
            boolean zero = true;

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != 0) {
                    zero = false;}}

            if (zero) {
                break;}

            System.out.println("შეიყვანეთ რიცხვი");
            int num = sc.nextInt();

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == num) {
                    arr1[i] = 0;
                }
            }

            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }

            System.out.println();
        }

        System.out.println("ყველა ელემენტი განულებულია");

// 2
        int[] arr2 = {7, 1, 5, 3, 6, 4};

        int m = arr2[0];
        int mD = 0;
        int bD = 0;
        int sD = 0;
        int pf = 0;

        for (int i = 1; i < arr2.length; i++) {

            if (arr2[i] - m > pf) {
                pf = arr2[i] - m;
                bD = mD;
                sD = i;
            }

            if (arr2[i] < m) {
                m = arr2[i];
                mD = i;
            }
        }

        System.out.println("მაქსიმალური მოგება " + pf);
        System.out.println("ყიდვის დღე " + bD);
        System.out.println("გაყიდვის დღე " + sD);

//  3

        int[] arr3 = {1, 2, 0, 2, 1};

        boolean p = true;

        for (int i = 0; i < arr3.length / 2; i++) {
            if (arr3[i] != arr3[arr3.length - 1 - i]) {
                p = false;
                break;
            }
        }

        if (p) {
            System.out.println("კი");
        } else {
            System.out.println("არა");
        }

        //4


        int[] arr4 = {1, 2, 1, 1, 4, 5, 2, 1, 4, 2};

        System.out.println("შეიყვანეთ რიცხვი");
        int r = sc.nextInt();

        int c = 0;

        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] != r) {
                c++;
            }
        }

        int[] newArr = new int[c];
        int index = 0;

        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] != r) {
                newArr[index] = arr4[i];
                index++;
            }
        }

        System.out.println("ახალი მასივი:");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        sc.close();}}