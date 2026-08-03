package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4652 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.lang.String f14817 = "Oscillator";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f14818 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f14819 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f14820 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f14821 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f14822 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f14823 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f14824 = 6;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float[] f14825;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public double[] f14826;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public double[] f14827;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f14828;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public double f14829;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f14830;

    static {
            return
    }

    public C4652() {
            r3 = this;
            r3.<init>()
            r0 = 0
            float[] r1 = new float[r0]
            r3.f14825 = r1
            double[] r1 = new double[r0]
            r3.f14826 = r1
            r1 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r3.f14829 = r1
            r3.f14830 = r0
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "pos ="
            r0.append(r1)
            double[] r1 = r2.f14826
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " period="
            r0.append(r1)
            float[] r1 = r2.f14825
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m18487(double r5, float r7) {
            r4 = this;
            float[] r0 = r4.f14825
            int r0 = r0.length
            int r0 = r0 + 1
            double[] r1 = r4.f14826
            int r1 = java.util.Arrays.binarySearch(r1, r5)
            if (r1 >= 0) goto L10
            int r1 = -r1
            int r1 = r1 + (-1)
        L10:
            double[] r2 = r4.f14826
            double[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.f14826 = r2
            float[] r2 = r4.f14825
            float[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.f14825 = r2
            double[] r2 = new double[r0]
            r4.f14827 = r2
            double[] r2 = r4.f14826
            int r3 = r1 + 1
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            java.lang.System.arraycopy(r2, r1, r2, r3, r0)
            double[] r0 = r4.f14826
            r0[r1] = r5
            float[] r5 = r4.f14825
            r5[r1] = r7
            r5 = 0
            r4.f14830 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public double m18488(double r9) {
            r8 = this;
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto Lc
            r9 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            goto L17
        Lc:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 < 0) goto L17
            r9 = 4607182409792818153(0x3feffffde7210be9, double:0.999999)
        L17:
            double[] r2 = r8.f14826
            int r2 = java.util.Arrays.binarySearch(r2, r9)
            if (r2 <= 0) goto L20
            return r0
        L20:
            if (r2 == 0) goto L3d
            int r0 = -r2
            int r1 = r0 + (-1)
            float[] r2 = r8.f14825
            r3 = r2[r1]
            int r0 = r0 + (-2)
            r2 = r2[r0]
            float r3 = r3 - r2
            double r3 = (double) r3
            double[] r5 = r8.f14826
            r6 = r5[r1]
            r0 = r5[r0]
            double r6 = r6 - r0
            double r3 = r3 / r6
            double r9 = r9 * r3
            double r5 = (double) r2
            double r3 = r3 * r0
            double r5 = r5 - r3
            double r0 = r9 + r5
        L3d:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public double m18489(double r13) {
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r2 >= 0) goto La
            r13 = r0
            goto Lf
        La:
            int r2 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lf
            r13 = r3
        Lf:
            double[] r2 = r12.f14826
            int r2 = java.util.Arrays.binarySearch(r2, r13)
            if (r2 <= 0) goto L19
            r0 = r3
            goto L44
        L19:
            if (r2 == 0) goto L44
            int r0 = -r2
            int r1 = r0 + (-1)
            float[] r2 = r12.f14825
            r3 = r2[r1]
            int r0 = r0 + (-2)
            r2 = r2[r0]
            float r3 = r3 - r2
            double r3 = (double) r3
            double[] r5 = r12.f14826
            r6 = r5[r1]
            r8 = r5[r0]
            double r6 = r6 - r8
            double r3 = r3 / r6
            double[] r1 = r12.f14827
            r0 = r1[r0]
            double r5 = (double) r2
            double r10 = r3 * r8
            double r5 = r5 - r10
            double r10 = r13 - r8
            double r5 = r5 * r10
            double r0 = r0 + r5
            double r13 = r13 * r13
            double r8 = r8 * r8
            double r13 = r13 - r8
            double r3 = r3 * r13
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = r3 / r13
            double r0 = r0 + r3
        L44:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public double m18490(double r10) {
            r9 = this;
            int r0 = r9.f14828
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = 4616189618054758400(0x4010000000000000, double:4.0)
            switch(r0) {
                case 1: goto L60;
                case 2: goto L4c;
                case 3: goto L47;
                case 4: goto L40;
                case 5: goto L2c;
                case 6: goto L1d;
                default: goto L9;
            }
        L9:
            double r0 = r9.f14829
            double r2 = r9.m18488(r10)
            double r0 = r0 * r2
            double r2 = r9.f14829
            double r10 = r9.m18489(r10)
            double r2 = r2 * r10
            double r10 = java.lang.Math.cos(r2)
        L1b:
            double r0 = r0 * r10
            return r0
        L1d:
            double r5 = r9.m18488(r10)
            double r5 = r5 * r3
            double r10 = r9.m18489(r10)
            double r10 = r10 * r3
            double r10 = r10 + r1
            double r10 = r10 % r3
            double r10 = r10 - r1
        L2a:
            double r5 = r5 * r10
            return r5
        L2c:
            double r0 = r9.f14829
            double r0 = -r0
            double r2 = r9.m18488(r10)
            double r0 = r0 * r2
            double r2 = r9.f14829
            double r10 = r9.m18489(r10)
            double r2 = r2 * r10
            double r10 = java.lang.Math.sin(r2)
            goto L1b
        L40:
            double r10 = r9.m18488(r10)
            double r10 = -r10
        L45:
            double r10 = r10 * r1
            return r10
        L47:
            double r10 = r9.m18488(r10)
            goto L45
        L4c:
            double r5 = r9.m18488(r10)
            double r5 = r5 * r3
            double r10 = r9.m18489(r10)
            double r10 = r10 * r3
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r10 = r10 + r7
            double r10 = r10 % r3
            double r10 = r10 - r1
            double r10 = java.lang.Math.signum(r10)
            goto L2a
        L60:
            r10 = 0
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public double m18491(double r8) {
            r7 = this;
            int r0 = r7.f14828
            r1 = 4616189618054758400(0x4010000000000000, double:4.0)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            switch(r0) {
                case 1: goto L51;
                case 2: goto L44;
                case 3: goto L3b;
                case 4: goto L33;
                case 5: goto L27;
                case 6: goto L17;
                default: goto Lb;
            }
        Lb:
            double r0 = r7.f14829
            double r8 = r7.m18489(r8)
            double r0 = r0 * r8
            double r8 = java.lang.Math.sin(r0)
            return r8
        L17:
            double r8 = r7.m18489(r8)
            double r8 = r8 * r1
            double r8 = r8 % r1
            double r8 = r8 - r3
            double r8 = java.lang.Math.abs(r8)
            double r8 = r5 - r8
            double r8 = r8 * r8
        L25:
            double r5 = r5 - r8
            return r5
        L27:
            double r0 = r7.f14829
            double r8 = r7.m18489(r8)
            double r0 = r0 * r8
            double r8 = java.lang.Math.cos(r0)
            return r8
        L33:
            double r8 = r7.m18489(r8)
            double r8 = r8 * r3
            double r8 = r8 + r5
            double r8 = r8 % r3
            goto L25
        L3b:
            double r8 = r7.m18489(r8)
            double r8 = r8 * r3
            double r8 = r8 + r5
            double r8 = r8 % r3
            double r8 = r8 - r5
            return r8
        L44:
            double r8 = r7.m18489(r8)
            double r8 = r8 * r1
            double r8 = r8 + r5
            double r8 = r8 % r1
            double r8 = r8 - r3
            double r8 = java.lang.Math.abs(r8)
            goto L25
        L51:
            double r8 = r7.m18489(r8)
            double r8 = r8 % r5
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 - r8
            double r8 = java.lang.Math.signum(r0)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m18492() {
            r17 = this;
            r0 = r17
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = r3
        L7:
            float[] r7 = r0.f14825
            int r8 = r7.length
            if (r4 >= r8) goto L13
            r7 = r7[r4]
            double r7 = (double) r7
            double r5 = r5 + r7
            int r4 = r4 + 1
            goto L7
        L13:
            r4 = 1
            r8 = r1
            r7 = r4
        L16:
            float[] r10 = r0.f14825
            int r11 = r10.length
            r12 = 1073741824(0x40000000, float:2.0)
            if (r7 >= r11) goto L32
            int r11 = r7 + (-1)
            r13 = r10[r11]
            r10 = r10[r7]
            float r13 = r13 + r10
            float r13 = r13 / r12
            double[] r10 = r0.f14826
            r14 = r10[r7]
            r11 = r10[r11]
            double r14 = r14 - r11
            double r10 = (double) r13
            double r14 = r14 * r10
            double r8 = r8 + r14
            int r7 = r7 + 1
            goto L16
        L32:
            r7 = r3
        L33:
            float[] r10 = r0.f14825
            int r11 = r10.length
            if (r7 >= r11) goto L44
            r11 = r10[r7]
            double r13 = (double) r11
            double r15 = r5 / r8
            double r13 = r13 * r15
            float r11 = (float) r13
            r10[r7] = r11
            int r7 = r7 + 1
            goto L33
        L44:
            double[] r5 = r0.f14827
            r5[r3] = r1
            r1 = r4
        L49:
            float[] r2 = r0.f14825
            int r3 = r2.length
            if (r1 >= r3) goto L69
            int r3 = r1 + (-1)
            r5 = r2[r3]
            r2 = r2[r1]
            float r5 = r5 + r2
            float r5 = r5 / r12
            double[] r2 = r0.f14826
            r6 = r2[r1]
            r8 = r2[r3]
            double r6 = r6 - r8
            double[] r2 = r0.f14827
            r8 = r2[r3]
            double r10 = (double) r5
            double r6 = r6 * r10
            double r8 = r8 + r6
            r2[r1] = r8
            int r1 = r1 + 1
            goto L49
        L69:
            r0.f14830 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m18493(int r1) {
            r0 = this;
            r0.f14828 = r1
            return
    }
}
