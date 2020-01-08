package com.codegym;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void triangleClassifier() {
        int a = 5;
        int b = 8;
        int c = 2;

        String protect = "Khong phai tam giac";
        String result = TriangleClassifier.TriangleClassifier(a,b,c);
        assertEquals(protect,result);
    }
}