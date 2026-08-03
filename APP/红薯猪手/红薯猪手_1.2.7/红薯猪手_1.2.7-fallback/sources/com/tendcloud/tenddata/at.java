package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
final class at {
    public at() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(double r2) {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = "######0"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = r0.format(r2)     // Catch: java.lang.Throwable -> L10
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L10
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    private static int a(double[][] r11) {
            r0 = 4
            double[][] r1 = new double[r0][]
            double[] r2 = new double[r0]
            r3 = 0
            r4 = r11[r3]
            r5 = r4[r3]
            r2[r3] = r5
            r5 = 1
            r6 = r4[r5]
            r2[r5] = r6
            r6 = 2
            r7 = r4[r6]
            r2[r6] = r7
            r7 = 3
            r8 = r4[r7]
            r2[r7] = r8
            r1[r3] = r2
            double[] r2 = new double[r0]
            r4 = r11[r5]
            r8 = r4[r3]
            r2[r3] = r8
            r8 = r4[r5]
            r2[r5] = r8
            r8 = r4[r6]
            r2[r6] = r8
            r8 = r4[r7]
            r2[r7] = r8
            r1[r5] = r2
            double[] r2 = new double[r0]
            r4 = r11[r6]
            r8 = r4[r3]
            r2[r3] = r8
            r8 = r4[r5]
            r2[r5] = r8
            r8 = r4[r6]
            r2[r6] = r8
            r8 = r4[r7]
            r2[r7] = r8
            r1[r6] = r2
            double[] r2 = new double[r0]
            r4 = r11[r7]
            r8 = r4[r3]
            r2[r3] = r8
            r8 = r4[r5]
            r2[r5] = r8
            r8 = r4[r6]
            r2[r6] = r8
            r8 = r4[r7]
            r2[r7] = r8
            r1[r7] = r2
            double[][] r2 = new double[r0][]
            double[] r4 = new double[r0]
            r8 = r11[r3]
            r9 = r8[r3]
            r4[r3] = r9
            r9 = r8[r5]
            r4[r5] = r9
            r9 = r8[r6]
            r4[r6] = r9
            r9 = r8[r0]
            r4[r7] = r9
            r2[r3] = r4
            double[] r4 = new double[r0]
            r8 = r11[r5]
            r9 = r8[r3]
            r4[r3] = r9
            r9 = r8[r5]
            r4[r5] = r9
            r9 = r8[r6]
            r4[r6] = r9
            r9 = r8[r0]
            r4[r7] = r9
            r2[r5] = r4
            double[] r4 = new double[r0]
            r8 = r11[r6]
            r9 = r8[r3]
            r4[r3] = r9
            r9 = r8[r5]
            r4[r5] = r9
            r9 = r8[r6]
            r4[r6] = r9
            r9 = r8[r0]
            r4[r7] = r9
            r2[r6] = r4
            double[] r4 = new double[r0]
            r11 = r11[r7]
            r8 = r11[r3]
            r4[r3] = r8
            r8 = r11[r5]
            r4[r5] = r8
            r8 = r11[r6]
            r4[r6] = r8
            r5 = r11[r0]
            r4[r7] = r5
            r2[r7] = r4
            double r0 = b(r1)
            r4 = 0
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 != 0) goto Lc4
            return r3
        Lc4:
            double r2 = b(r2)
            double r2 = r2 / r0
            int r11 = a(r2)
            return r11
    }

    public static int a(int[][] r14) {
            r0 = 0
            if (r14 == 0) goto L8a
            int r1 = r14.length     // Catch: java.lang.Throwable -> L8a
            r2 = 4
            if (r1 >= r2) goto L9
            goto L8a
        L9:
            double[][] r1 = new double[r2][]     // Catch: java.lang.Throwable -> L8a
            r3 = 5
            double[] r4 = new double[r3]     // Catch: java.lang.Throwable -> L8a
            r5 = r14[r0]     // Catch: java.lang.Throwable -> L8a
            r6 = r5[r0]     // Catch: java.lang.Throwable -> L8a
            int r7 = r6 * r6
            int r7 = r7 * r6
            double r7 = (double) r7     // Catch: java.lang.Throwable -> L8a
            r4[r0] = r7     // Catch: java.lang.Throwable -> L8a
            int r7 = r6 * r6
            double r7 = (double) r7     // Catch: java.lang.Throwable -> L8a
            r9 = 1
            r4[r9] = r7     // Catch: java.lang.Throwable -> L8a
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L8a
            r8 = 2
            r4[r8] = r6     // Catch: java.lang.Throwable -> L8a
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r10 = 3
            r4[r10] = r6     // Catch: java.lang.Throwable -> L8a
            r5 = r5[r9]     // Catch: java.lang.Throwable -> L8a
            double r11 = (double) r5     // Catch: java.lang.Throwable -> L8a
            r4[r2] = r11     // Catch: java.lang.Throwable -> L8a
            r1[r0] = r4     // Catch: java.lang.Throwable -> L8a
            double[] r4 = new double[r3]     // Catch: java.lang.Throwable -> L8a
            r5 = r14[r9]     // Catch: java.lang.Throwable -> L8a
            r11 = r5[r0]     // Catch: java.lang.Throwable -> L8a
            int r12 = r11 * r11
            int r12 = r12 * r11
            double r12 = (double) r12     // Catch: java.lang.Throwable -> L8a
            r4[r0] = r12     // Catch: java.lang.Throwable -> L8a
            int r12 = r11 * r11
            double r12 = (double) r12     // Catch: java.lang.Throwable -> L8a
            r4[r9] = r12     // Catch: java.lang.Throwable -> L8a
            double r11 = (double) r11     // Catch: java.lang.Throwable -> L8a
            r4[r8] = r11     // Catch: java.lang.Throwable -> L8a
            r4[r10] = r6     // Catch: java.lang.Throwable -> L8a
            r5 = r5[r9]     // Catch: java.lang.Throwable -> L8a
            double r11 = (double) r5     // Catch: java.lang.Throwable -> L8a
            r4[r2] = r11     // Catch: java.lang.Throwable -> L8a
            r1[r9] = r4     // Catch: java.lang.Throwable -> L8a
            double[] r4 = new double[r3]     // Catch: java.lang.Throwable -> L8a
            r5 = r14[r8]     // Catch: java.lang.Throwable -> L8a
            r11 = r5[r0]     // Catch: java.lang.Throwable -> L8a
            int r12 = r11 * r11
            int r12 = r12 * r11
            double r12 = (double) r12     // Catch: java.lang.Throwable -> L8a
            r4[r0] = r12     // Catch: java.lang.Throwable -> L8a
            int r12 = r11 * r11
            double r12 = (double) r12     // Catch: java.lang.Throwable -> L8a
            r4[r9] = r12     // Catch: java.lang.Throwable -> L8a
            double r11 = (double) r11     // Catch: java.lang.Throwable -> L8a
            r4[r8] = r11     // Catch: java.lang.Throwable -> L8a
            r4[r10] = r6     // Catch: java.lang.Throwable -> L8a
            r5 = r5[r9]     // Catch: java.lang.Throwable -> L8a
            double r11 = (double) r5     // Catch: java.lang.Throwable -> L8a
            r4[r2] = r11     // Catch: java.lang.Throwable -> L8a
            r1[r8] = r4     // Catch: java.lang.Throwable -> L8a
            double[] r3 = new double[r3]     // Catch: java.lang.Throwable -> L8a
            r14 = r14[r10]     // Catch: java.lang.Throwable -> L8a
            r4 = r14[r0]     // Catch: java.lang.Throwable -> L8a
            int r5 = r4 * r4
            int r5 = r5 * r4
            double r11 = (double) r5     // Catch: java.lang.Throwable -> L8a
            r3[r0] = r11     // Catch: java.lang.Throwable -> L8a
            int r5 = r4 * r4
            double r11 = (double) r5     // Catch: java.lang.Throwable -> L8a
            r3[r9] = r11     // Catch: java.lang.Throwable -> L8a
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L8a
            r3[r8] = r4     // Catch: java.lang.Throwable -> L8a
            r3[r10] = r6     // Catch: java.lang.Throwable -> L8a
            r14 = r14[r9]     // Catch: java.lang.Throwable -> L8a
            double r4 = (double) r14     // Catch: java.lang.Throwable -> L8a
            r3[r2] = r4     // Catch: java.lang.Throwable -> L8a
            r1[r10] = r3     // Catch: java.lang.Throwable -> L8a
            int r14 = a(r1)     // Catch: java.lang.Throwable -> L8a
            return r14
        L8a:
            return r0
    }

    private static double b(double[][] r15) {
            r0 = 3
            double[][] r1 = new double[r0][]
            double[] r2 = new double[r0]
            r3 = 1
            r4 = r15[r3]
            r5 = r4[r3]
            r7 = 0
            r2[r7] = r5
            r5 = 2
            r8 = r4[r5]
            r2[r3] = r8
            r8 = r4[r0]
            r2[r5] = r8
            r1[r7] = r2
            double[] r2 = new double[r0]
            r4 = r15[r5]
            r8 = r4[r3]
            r2[r7] = r8
            r8 = r4[r5]
            r2[r3] = r8
            r8 = r4[r0]
            r2[r5] = r8
            r1[r3] = r2
            double[] r2 = new double[r0]
            r4 = r15[r0]
            r8 = r4[r3]
            r2[r7] = r8
            r8 = r4[r5]
            r2[r3] = r8
            r8 = r4[r0]
            r2[r5] = r8
            r1[r5] = r2
            double[][] r2 = new double[r0][]
            double[] r6 = new double[r0]
            r10 = r15[r3]
            r11 = r10[r7]
            r6[r7] = r11
            r11 = r10[r5]
            r6[r3] = r11
            r11 = r10[r0]
            r6[r5] = r11
            r2[r7] = r6
            double[] r6 = new double[r0]
            r10 = r15[r5]
            r11 = r10[r7]
            r6[r7] = r11
            r11 = r10[r5]
            r6[r3] = r11
            r11 = r10[r0]
            r6[r5] = r11
            r2[r3] = r6
            double[] r6 = new double[r0]
            r10 = r4[r7]
            r6[r7] = r10
            r10 = r4[r5]
            r6[r3] = r10
            r6[r5] = r8
            r2[r5] = r6
            double[][] r6 = new double[r0][]
            double[] r10 = new double[r0]
            r11 = r15[r3]
            r12 = r11[r7]
            r10[r7] = r12
            r12 = r11[r3]
            r10[r3] = r12
            r12 = r11[r0]
            r10[r5] = r12
            r6[r7] = r10
            double[] r10 = new double[r0]
            r11 = r15[r5]
            r12 = r11[r7]
            r10[r7] = r12
            r12 = r11[r3]
            r10[r3] = r12
            r12 = r11[r0]
            r10[r5] = r12
            r6[r3] = r10
            double[] r10 = new double[r0]
            r11 = r4[r7]
            r10[r7] = r11
            r11 = r4[r3]
            r10[r3] = r11
            r10[r5] = r8
            r6[r5] = r10
            double[][] r8 = new double[r0][]
            double[] r9 = new double[r0]
            r10 = r15[r3]
            r11 = r10[r7]
            r9[r7] = r11
            r11 = r10[r3]
            r9[r3] = r11
            r11 = r10[r5]
            r9[r5] = r11
            r8[r7] = r9
            double[] r9 = new double[r0]
            r10 = r15[r5]
            r11 = r10[r7]
            r9[r7] = r11
            r11 = r10[r3]
            r9[r3] = r11
            r11 = r10[r5]
            r9[r5] = r11
            r8[r3] = r9
            double[] r9 = new double[r0]
            r10 = r4[r7]
            r9[r7] = r10
            r10 = r4[r3]
            r9[r3] = r10
            r10 = r4[r5]
            r9[r5] = r10
            r8[r5] = r9
            r9 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r11 = 0
            double r11 = java.lang.Math.pow(r9, r11)
            r4 = r15[r7]
            r13 = r4[r7]
            double r11 = r11 * r13
            double r13 = c(r1)
            double r11 = r11 * r13
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = java.lang.Math.pow(r9, r13)
            r1 = r15[r7]
            r3 = r1[r3]
            double r13 = r13 * r3
            double r1 = c(r2)
            double r13 = r13 * r1
            double r13 = r13 + r11
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = java.lang.Math.pow(r9, r1)
            r3 = r15[r7]
            r4 = r3[r5]
            double r1 = r1 * r4
            double r3 = c(r6)
            double r1 = r1 * r3
            double r1 = r1 + r13
            r3 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r3 = java.lang.Math.pow(r9, r3)
            r15 = r15[r7]
            r5 = r15[r0]
            double r3 = r3 * r5
            double r5 = c(r8)
            double r3 = r3 * r5
            double r3 = r3 + r1
            return r3
    }

    private static double c(double[][] r24) {
            r0 = 0
            r1 = r24[r0]
            r2 = r1[r0]
            r4 = 1
            r5 = r24[r4]
            r6 = r5[r4]
            double r8 = r2 * r6
            r10 = 2
            r11 = r24[r10]
            r12 = r11[r10]
            double r8 = r8 * r12
            r14 = r1[r4]
            r16 = r5[r10]
            double r18 = r14 * r16
            r20 = r11[r0]
            double r18 = r18 * r20
            double r18 = r18 + r8
            r8 = r1[r10]
            r0 = r5[r0]
            double r22 = r8 * r0
            r4 = r11[r4]
            double r22 = r22 * r4
            double r22 = r22 + r18
            double r8 = -r8
            double r8 = r8 * r6
            double r8 = r8 * r20
            double r8 = r8 + r22
            double r14 = r14 * r0
            double r14 = r14 * r12
            double r8 = r8 - r14
            double r2 = r2 * r4
            double r2 = r2 * r16
            double r8 = r8 - r2
            return r8
    }
}
