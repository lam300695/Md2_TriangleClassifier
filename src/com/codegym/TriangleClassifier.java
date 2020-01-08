package com.codegym;

public class TriangleClassifier {
    public static String TriangleClassifier(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            if (a == b && b == c) {
                return "tam giac deu";
            }
            return "Tam giac can";
        }

        else if (a<=0 || b<=0 || c<=0){
            return "Khong phai tam giac";
        }

        else if ((a + b) < c || (a + c) < b || (b + c) < a){
            return "Khong phai tam giac";
        }

        return "Tam giac thuong";
    }
}
