package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4266 extends Yue.AbstractC1685 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f13181 = "MonotonicCurveFit";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public double[] f13182;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public double[][] f13183;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public double[][] f13184;

    public C4266(double[] r22, double[][] r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r21.<init>()
            int r3 = r1.length
            r4 = 0
            r5 = r2[r4]
            int r5 = r5.length
            int r6 = r3 + (-1)
            r7 = 2
            int[] r8 = new int[r7]
            r9 = 1
            r8[r9] = r5
            r8[r4] = r6
            java.lang.Class r10 = java.lang.Double.TYPE
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r10, r8)
            double[][] r8 = (double[][]) r8
            int[] r11 = new int[r7]
            r11[r9] = r5
            r11[r4] = r3
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r10, r11)
            double[][] r9 = (double[][]) r9
            r10 = r4
        L2d:
            if (r10 >= r5) goto L6f
            r11 = r4
        L30:
            if (r11 >= r6) goto L62
            int r12 = r11 + 1
            r13 = r1[r12]
            r15 = r1[r11]
            double r13 = r13 - r15
            r15 = r8[r11]
            r16 = r2[r12]
            r17 = r16[r10]
            r16 = r2[r11]
            r19 = r16[r10]
            double r17 = r17 - r19
            double r17 = r17 / r13
            r15[r10] = r17
            if (r11 != 0) goto L50
            r11 = r9[r11]
            r11[r10] = r17
            goto L60
        L50:
            r13 = r9[r11]
            int r11 = r11 + (-1)
            r11 = r8[r11]
            r14 = r11[r10]
            double r14 = r14 + r17
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r14 = r14 * r16
            r13[r10] = r14
        L60:
            r11 = r12
            goto L30
        L62:
            r11 = r9[r6]
            int r12 = r3 + (-2)
            r12 = r8[r12]
            r13 = r12[r10]
            r11[r10] = r13
            int r10 = r10 + 1
            goto L2d
        L6f:
            r3 = r4
        L70:
            if (r3 >= r6) goto Lc1
            r7 = r4
        L73:
            if (r7 >= r5) goto Lbe
            r10 = r8[r3]
            r11 = r10[r7]
            r13 = 0
            int r10 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r10 != 0) goto L8a
            r10 = r9[r3]
            r10[r7] = r13
            int r10 = r3 + 1
            r10 = r9[r10]
            r10[r7] = r13
            goto Lbb
        L8a:
            r10 = r9[r3]
            r13 = r10[r7]
            double r13 = r13 / r11
            int r10 = r3 + 1
            r15 = r9[r10]
            r16 = r15[r7]
            double r11 = r16 / r11
            double r15 = java.lang.Math.hypot(r13, r11)
            r17 = 4621256167635550208(0x4022000000000000, double:9.0)
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 <= 0) goto Lbb
            r17 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r17 = r17 / r15
            r15 = r9[r3]
            double r13 = r13 * r17
            r16 = r8[r3]
            r19 = r16[r7]
            double r13 = r13 * r19
            r15[r7] = r13
            r10 = r9[r10]
            double r17 = r17 * r11
            r11 = r16[r7]
            double r17 = r17 * r11
            r10[r7] = r17
        Lbb:
            int r7 = r7 + 1
            goto L73
        Lbe:
            int r3 = r3 + 1
            goto L70
        Lc1:
            r0.f13182 = r1
            r0.f13183 = r2
            r0.f13184 = r9
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static double m16562(double r10, double r12, double r14, double r16, double r18, double r20) {
            double r0 = r12 * r12
            r2 = -4604930618986332160(0xc018000000000000, double:-6.0)
            double r2 = r2 * r0
            double r2 = r2 * r16
            r4 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r6 = r12 * r4
            double r8 = r6 * r16
            double r2 = r2 + r8
            double r4 = r4 * r0
            double r4 = r4 * r14
            double r2 = r2 + r4
            double r6 = r6 * r14
            double r2 = r2 - r6
            r4 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r4 = r4 * r10
            double r6 = r4 * r20
            double r6 = r6 * r0
            double r2 = r2 + r6
            double r4 = r4 * r18
            double r4 = r4 * r0
            double r2 = r2 + r4
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r10
            double r0 = r0 * r20
            double r0 = r0 * r12
            double r2 = r2 - r0
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = r0 * r10
            double r0 = r0 * r18
            double r0 = r0 * r12
            double r2 = r2 - r0
            double r0 = r10 * r18
            double r2 = r2 + r0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static double m16563(double r12, double r14, double r16, double r18, double r20, double r22) {
            double r0 = r14 * r14
            double r2 = r0 * r14
            r4 = -4611686018427387904(0xc000000000000000, double:-2.0)
            double r4 = r4 * r2
            double r4 = r4 * r18
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r6 = r6 * r0
            double r8 = r6 * r18
            double r4 = r4 + r8
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r2 * r8
            double r10 = r10 * r16
            double r4 = r4 + r10
            double r6 = r6 * r16
            double r4 = r4 - r6
            double r4 = r4 + r16
            double r6 = r12 * r22
            double r10 = r6 * r2
            double r4 = r4 + r10
            double r10 = r12 * r20
            double r2 = r2 * r10
            double r4 = r4 + r2
            double r6 = r6 * r0
            double r4 = r4 - r6
            double r2 = r12 * r8
            double r2 = r2 * r20
            double r2 = r2 * r0
            double r4 = r4 - r2
            double r10 = r10 * r14
            double r4 = r4 + r10
            return r4
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟ */
    public double mo1915(double r22, int r24) {
            r21 = this;
            r0 = r21
            double[] r1 = r0.f13182
            int r2 = r1.length
            r3 = 0
            r4 = r1[r3]
            int r4 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r4 > 0) goto L13
            double[][] r1 = r0.f13183
            r1 = r1[r3]
            r2 = r1[r24]
            return r2
        L13:
            int r2 = r2 + (-1)
            r4 = r1[r2]
            int r1 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r1 < 0) goto L22
            double[][] r1 = r0.f13183
            r1 = r1[r2]
            r2 = r1[r24]
            return r2
        L22:
            if (r3 >= r2) goto L5c
            double[] r1 = r0.f13182
            r4 = r1[r3]
            int r6 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r6 != 0) goto L33
            double[][] r1 = r0.f13183
            r1 = r1[r3]
            r2 = r1[r24]
            return r2
        L33:
            int r6 = r3 + 1
            r7 = r1[r6]
            int r1 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r1 >= 0) goto L5a
            double r9 = r7 - r4
            double r1 = r22 - r4
            double r11 = r1 / r9
            double[][] r1 = r0.f13183
            r2 = r1[r3]
            r13 = r2[r24]
            r1 = r1[r6]
            r15 = r1[r24]
            double[][] r1 = r0.f13184
            r2 = r1[r3]
            r17 = r2[r24]
            r1 = r1[r6]
            r19 = r1[r24]
            double r1 = m16563(r9, r11, r13, r15, r17, r19)
            return r1
        L5a:
            r3 = r6
            goto L22
        L5c:
            r1 = 0
            return r1
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo1916(double r24, double[] r26) {
            r23 = this;
            r0 = r23
            double[] r1 = r0.f13182
            int r2 = r1.length
            double[][] r3 = r0.f13183
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            r5 = r1[r4]
            int r5 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r5 > 0) goto L20
            r1 = r4
        L12:
            if (r1 >= r3) goto L1f
            double[][] r2 = r0.f13183
            r2 = r2[r4]
            r5 = r2[r1]
            r26[r1] = r5
            int r1 = r1 + 1
            goto L12
        L1f:
            return
        L20:
            int r2 = r2 + (-1)
            r5 = r1[r2]
            int r1 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r1 < 0) goto L36
        L28:
            if (r4 >= r3) goto L35
            double[][] r1 = r0.f13183
            r1 = r1[r2]
            r5 = r1[r4]
            r26[r4] = r5
            int r4 = r4 + 1
            goto L28
        L35:
            return
        L36:
            r1 = r4
        L37:
            if (r1 >= r2) goto L83
            double[] r5 = r0.f13182
            r6 = r5[r1]
            int r5 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = r4
        L42:
            if (r5 >= r3) goto L4f
            double[][] r6 = r0.f13183
            r6 = r6[r1]
            r7 = r6[r5]
            r26[r5] = r7
            int r5 = r5 + 1
            goto L42
        L4f:
            double[] r5 = r0.f13182
            int r6 = r1 + 1
            r7 = r5[r6]
            int r9 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r9 >= 0) goto L81
            r9 = r5[r1]
            double r7 = r7 - r9
            double r9 = r24 - r9
            double r9 = r9 / r7
        L5f:
            if (r4 >= r3) goto L80
            double[][] r2 = r0.f13183
            r5 = r2[r1]
            r15 = r5[r4]
            r2 = r2[r6]
            r17 = r2[r4]
            double[][] r2 = r0.f13184
            r5 = r2[r1]
            r19 = r5[r4]
            r2 = r2[r6]
            r21 = r2[r4]
            r11 = r7
            r13 = r9
            double r11 = m16563(r11, r13, r15, r17, r19, r21)
            r26[r4] = r11
            int r4 = r4 + 1
            goto L5f
        L80:
            return
        L81:
            r1 = r6
            goto L37
        L83:
            return
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo1917(double r24, float[] r26) {
            r23 = this;
            r0 = r23
            double[] r1 = r0.f13182
            int r2 = r1.length
            double[][] r3 = r0.f13183
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            r5 = r1[r4]
            int r5 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r5 > 0) goto L21
            r1 = r4
        L12:
            if (r1 >= r3) goto L20
            double[][] r2 = r0.f13183
            r2 = r2[r4]
            r5 = r2[r1]
            float r2 = (float) r5
            r26[r1] = r2
            int r1 = r1 + 1
            goto L12
        L20:
            return
        L21:
            int r2 = r2 + (-1)
            r5 = r1[r2]
            int r1 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r1 < 0) goto L38
        L29:
            if (r4 >= r3) goto L37
            double[][] r1 = r0.f13183
            r1 = r1[r2]
            r5 = r1[r4]
            float r1 = (float) r5
            r26[r4] = r1
            int r4 = r4 + 1
            goto L29
        L37:
            return
        L38:
            r1 = r4
        L39:
            if (r1 >= r2) goto L87
            double[] r5 = r0.f13182
            r6 = r5[r1]
            int r5 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r5 != 0) goto L52
            r5 = r4
        L44:
            if (r5 >= r3) goto L52
            double[][] r6 = r0.f13183
            r6 = r6[r1]
            r7 = r6[r5]
            float r6 = (float) r7
            r26[r5] = r6
            int r5 = r5 + 1
            goto L44
        L52:
            double[] r5 = r0.f13182
            int r6 = r1 + 1
            r7 = r5[r6]
            int r9 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r9 >= 0) goto L85
            r9 = r5[r1]
            double r7 = r7 - r9
            double r9 = r24 - r9
            double r9 = r9 / r7
        L62:
            if (r4 >= r3) goto L84
            double[][] r2 = r0.f13183
            r5 = r2[r1]
            r15 = r5[r4]
            r2 = r2[r6]
            r17 = r2[r4]
            double[][] r2 = r0.f13184
            r5 = r2[r1]
            r19 = r5[r4]
            r2 = r2[r6]
            r21 = r2[r4]
            r11 = r7
            r13 = r9
            double r11 = m16563(r11, r13, r15, r17, r19, r21)
            float r2 = (float) r11
            r26[r4] = r2
            int r4 = r4 + 1
            goto L62
        L84:
            return
        L85:
            r1 = r6
            goto L39
        L87:
            return
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public double mo1918(double r24, int r26) {
            r23 = this;
            r0 = r23
            double[] r1 = r0.f13182
            int r2 = r1.length
            r3 = 0
            r4 = r1[r3]
            int r6 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ld
            goto L18
        Ld:
            int r4 = r2 + (-1)
            r4 = r1[r4]
            int r1 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r1 < 0) goto L16
            goto L18
        L16:
            r4 = r24
        L18:
            int r1 = r2 + (-1)
            if (r3 >= r1) goto L49
            double[] r1 = r0.f13182
            int r6 = r3 + 1
            r7 = r1[r6]
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L47
            r9 = r1[r3]
            double r7 = r7 - r9
            double r4 = r4 - r9
            double r13 = r4 / r7
            double[][] r1 = r0.f13183
            r2 = r1[r3]
            r15 = r2[r26]
            r1 = r1[r6]
            r17 = r1[r26]
            double[][] r1 = r0.f13184
            r2 = r1[r3]
            r19 = r2[r26]
            r1 = r1[r6]
            r21 = r1[r26]
            r11 = r7
            double r1 = m16562(r11, r13, r15, r17, r19, r21)
            double r1 = r1 / r7
            return r1
        L47:
            r3 = r6
            goto L18
        L49:
            r1 = 0
            return r1
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo1919(double r26, double[] r28) {
            r25 = this;
            r0 = r25
            double[] r1 = r0.f13182
            int r2 = r1.length
            double[][] r3 = r0.f13183
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            r5 = r1[r4]
            int r7 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r7 > 0) goto L12
            goto L1d
        L12:
            int r5 = r2 + (-1)
            r5 = r1[r5]
            int r1 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r1 < 0) goto L1b
            goto L1d
        L1b:
            r5 = r26
        L1d:
            r1 = r4
        L1e:
            int r7 = r2 + (-1)
            if (r1 >= r7) goto L55
            double[] r7 = r0.f13182
            int r8 = r1 + 1
            r9 = r7[r8]
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 > 0) goto L53
            r11 = r7[r1]
            double r9 = r9 - r11
            double r5 = r5 - r11
            double r5 = r5 / r9
        L31:
            if (r4 >= r3) goto L55
            double[][] r2 = r0.f13183
            r7 = r2[r1]
            r17 = r7[r4]
            r2 = r2[r8]
            r19 = r2[r4]
            double[][] r2 = r0.f13184
            r7 = r2[r1]
            r21 = r7[r4]
            r2 = r2[r8]
            r23 = r2[r4]
            r13 = r9
            r15 = r5
            double r11 = m16562(r13, r15, r17, r19, r21, r23)
            double r11 = r11 / r9
            r28[r4] = r11
            int r4 = r4 + 1
            goto L31
        L53:
            r1 = r8
            goto L1e
        L55:
            return
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public double[] mo1920() {
            r1 = this;
            double[] r0 = r1.f13182
            return r0
    }
}
