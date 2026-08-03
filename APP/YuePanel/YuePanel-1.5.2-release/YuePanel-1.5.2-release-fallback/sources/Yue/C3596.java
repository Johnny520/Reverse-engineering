package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3596 extends Yue.AbstractC1685 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f11471 = "LinearCurveFit";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public double[] f11472;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public double[][] f11473;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public double f11474;

    public C3596(double[] r12, double[][] r13) {
            r11 = this;
            r11.<init>()
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r11.f11474 = r0
            int r0 = r12.length
            r0 = 0
            r1 = r13[r0]
            int r1 = r1.length
            r11.f11472 = r12
            r11.f11473 = r13
            r2 = 2
            if (r1 <= r2) goto L2e
            r1 = 0
            r3 = r0
            r4 = r1
        L17:
            r6 = r4
            int r8 = r12.length
            if (r3 >= r8) goto L2c
            r8 = r13[r3]
            r9 = r8[r0]
            if (r3 <= 0) goto L28
            double r4 = r9 - r4
            double r6 = r9 - r6
            java.lang.Math.hypot(r4, r6)
        L28:
            int r3 = r3 + 1
            r4 = r9
            goto L17
        L2c:
            r11.f11474 = r1
        L2e:
            return
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟ */
    public double mo1915(double r9, int r11) {
            r8 = this;
            double[] r0 = r8.f11472
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 > 0) goto L11
            double[][] r9 = r8.f11473
            r9 = r9[r2]
            r10 = r9[r11]
            return r10
        L11:
            int r1 = r1 + (-1)
            r3 = r0[r1]
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L20
            double[][] r9 = r8.f11473
            r9 = r9[r1]
            r10 = r9[r11]
            return r10
        L20:
            if (r2 >= r1) goto L4f
            double[] r0 = r8.f11472
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 != 0) goto L31
            double[][] r9 = r8.f11473
            r9 = r9[r2]
            r10 = r9[r11]
            return r10
        L31:
            int r5 = r2 + 1
            r6 = r0[r5]
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 >= 0) goto L4d
            double r6 = r6 - r3
            double r9 = r9 - r3
            double r9 = r9 / r6
            double[][] r0 = r8.f11473
            r1 = r0[r2]
            r2 = r1[r11]
            r0 = r0[r5]
            r4 = r0[r11]
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r9
            double r2 = r2 * r0
            double r4 = r4 * r9
            double r2 = r2 + r4
            return r2
        L4d:
            r2 = r5
            goto L20
        L4f:
            r9 = 0
            return r9
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo1916(double r13, double[] r15) {
            r12 = this;
            double[] r0 = r12.f11472
            int r1 = r0.length
            double[][] r2 = r12.f11473
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 > 0) goto L1e
            r13 = r3
        L10:
            if (r13 >= r2) goto L1d
            double[][] r14 = r12.f11473
            r14 = r14[r3]
            r0 = r14[r13]
            r15[r13] = r0
            int r13 = r13 + 1
            goto L10
        L1d:
            return
        L1e:
            int r1 = r1 + (-1)
            r4 = r0[r1]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L34
        L26:
            if (r3 >= r2) goto L33
            double[][] r13 = r12.f11473
            r13 = r13[r1]
            r4 = r13[r3]
            r15[r3] = r4
            int r3 = r3 + 1
            goto L26
        L33:
            return
        L34:
            r0 = r3
        L35:
            if (r0 >= r1) goto L76
            double[] r4 = r12.f11472
            r5 = r4[r0]
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L4d
            r4 = r3
        L40:
            if (r4 >= r2) goto L4d
            double[][] r5 = r12.f11473
            r5 = r5[r0]
            r6 = r5[r4]
            r15[r4] = r6
            int r4 = r4 + 1
            goto L40
        L4d:
            double[] r4 = r12.f11472
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 >= 0) goto L74
            r8 = r4[r0]
            double r6 = r6 - r8
            double r13 = r13 - r8
            double r13 = r13 / r6
        L5c:
            if (r3 >= r2) goto L73
            double[][] r1 = r12.f11473
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 - r13
            double r6 = r6 * r10
            double r8 = r8 * r13
            double r6 = r6 + r8
            r15[r3] = r6
            int r3 = r3 + 1
            goto L5c
        L73:
            return
        L74:
            r0 = r5
            goto L35
        L76:
            return
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo1917(double r13, float[] r15) {
            r12 = this;
            double[] r0 = r12.f11472
            int r1 = r0.length
            double[][] r2 = r12.f11473
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 > 0) goto L1f
            r13 = r3
        L10:
            if (r13 >= r2) goto L1e
            double[][] r14 = r12.f11473
            r14 = r14[r3]
            r0 = r14[r13]
            float r14 = (float) r0
            r15[r13] = r14
            int r13 = r13 + 1
            goto L10
        L1e:
            return
        L1f:
            int r1 = r1 + (-1)
            r4 = r0[r1]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L36
        L27:
            if (r3 >= r2) goto L35
            double[][] r13 = r12.f11473
            r13 = r13[r1]
            r4 = r13[r3]
            float r13 = (float) r4
            r15[r3] = r13
            int r3 = r3 + 1
            goto L27
        L35:
            return
        L36:
            r0 = r3
        L37:
            if (r0 >= r1) goto L7a
            double[] r4 = r12.f11472
            r5 = r4[r0]
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L50
            r4 = r3
        L42:
            if (r4 >= r2) goto L50
            double[][] r5 = r12.f11473
            r5 = r5[r0]
            r6 = r5[r4]
            float r5 = (float) r6
            r15[r4] = r5
            int r4 = r4 + 1
            goto L42
        L50:
            double[] r4 = r12.f11472
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 >= 0) goto L78
            r8 = r4[r0]
            double r6 = r6 - r8
            double r13 = r13 - r8
            double r13 = r13 / r6
        L5f:
            if (r3 >= r2) goto L77
            double[][] r1 = r12.f11473
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 - r13
            double r6 = r6 * r10
            double r8 = r8 * r13
            double r6 = r6 + r8
            float r1 = (float) r6
            r15[r3] = r1
            int r3 = r3 + 1
            goto L5f
        L77:
            return
        L78:
            r0 = r5
            goto L37
        L7a:
            return
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public double mo1918(double r8, int r10) {
            r7 = this;
            double[] r0 = r7.f11472
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.f11472
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f11473
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L33:
            r2 = r3
            goto L15
        L35:
            r8 = 0
            return r8
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo1919(double r13, double[] r15) {
            r12 = this;
            double[] r0 = r12.f11472
            int r1 = r0.length
            double[][] r2 = r12.f11473
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = r3
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r12.f11472
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.f11473
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
    }

    @Override // Yue.AbstractC1685
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public double[] mo1920() {
            r1 = this;
            double[] r0 = r1.f11472
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final double m14545(double r23) {
            r22 = this;
            r0 = r22
            double r1 = r0.f11474
            boolean r1 = java.lang.Double.isNaN(r1)
            r2 = 0
            if (r1 == 0) goto Ld
            return r2
        Ld:
            double[] r1 = r0.f11472
            int r4 = r1.length
            r5 = 0
            r6 = r1[r5]
            int r6 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r6 > 0) goto L18
            return r2
        L18:
            r6 = 1
            int r4 = r4 - r6
            r7 = r1[r4]
            int r1 = (r23 > r7 ? 1 : (r23 == r7 ? 0 : -1))
            if (r1 < 0) goto L23
            double r1 = r0.f11474
            return r1
        L23:
            r7 = r2
            r9 = r7
            r11 = r9
            r1 = r5
        L27:
            if (r1 >= r4) goto L7c
            double[][] r13 = r0.f11473
            r13 = r13[r1]
            r14 = r13[r5]
            r16 = r13[r6]
            if (r1 <= 0) goto L3c
            double r9 = r14 - r9
            double r11 = r16 - r11
            double r9 = java.lang.Math.hypot(r9, r11)
            double r7 = r7 + r9
        L3c:
            double[] r9 = r0.f11472
            r10 = r9[r1]
            int r12 = (r23 > r10 ? 1 : (r23 == r10 ? 0 : -1))
            if (r12 != 0) goto L45
            return r7
        L45:
            int r12 = r1 + 1
            r18 = r9[r12]
            int r9 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r9 >= 0) goto L77
            double r18 = r18 - r10
            double r2 = r23 - r10
            double r2 = r2 / r18
            double[][] r4 = r0.f11473
            r1 = r4[r1]
            r9 = r1[r5]
            r4 = r4[r12]
            r11 = r4[r5]
            r18 = r1[r6]
            r5 = r4[r6]
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r20 = r20 - r2
            double r18 = r18 * r20
            double r5 = r5 * r2
            double r18 = r18 + r5
            double r4 = r16 - r18
            double r9 = r9 * r20
            double r11 = r11 * r2
            double r9 = r9 + r11
            double r14 = r14 - r9
            double r1 = java.lang.Math.hypot(r4, r14)
            double r7 = r7 + r1
            return r7
        L77:
            r1 = r12
            r9 = r14
            r11 = r16
            goto L27
        L7c:
            return r2
    }
}
