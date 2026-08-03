package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4095 {
    public C4095() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m16009(int r4, int r5) {
            int r0 = r4 + r5
            r1 = 0
            r2 = 1
            if (r4 < 0) goto L8
            r3 = r2
            goto L9
        L8:
            r3 = r1
        L9:
            if (r5 < 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            if (r3 != r5) goto L23
            if (r4 < 0) goto L14
            r4 = r2
            goto L15
        L14:
            r4 = r1
        L15:
            if (r0 < 0) goto L18
            r1 = r2
        L18:
            if (r4 != r1) goto L1b
            goto L23
        L1b:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "integer overflow"
            r4.<init>(r5)
            throw r4
        L23:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static long m16010(long r6, long r8) {
            long r0 = r6 + r8
            r2 = 0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r7 = 0
            r4 = 1
            if (r6 < 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r7
        Ld:
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 < 0) goto L13
            r8 = r4
            goto L14
        L13:
            r8 = r7
        L14:
            if (r5 != r8) goto L2b
            if (r6 < 0) goto L1a
            r6 = r4
            goto L1b
        L1a:
            r6 = r7
        L1b:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 < 0) goto L20
            r7 = r4
        L20:
            if (r6 != r7) goto L23
            goto L2b
        L23:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            java.lang.String r7 = "integer overflow"
            r6.<init>(r7)
            throw r6
        L2b:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static double m16011(double r1, double r3, double r5) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto La
            return r5
        La:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static float m16012(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r2
        L5:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto La
            return r3
        La:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m16013(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static long m16014(long r1, long r3, long r5) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto La
            return r5
        La:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m16015(int r1) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L7
            int r1 = r1 + (-1)
            return r1
        L7:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static long m16016(long r2) {
            r0 = -9223372036854775808
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = 1
            long r2 = r2 - r0
            return r2
        La:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m16017(int r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L8
            int r1 = r1 + 1
            return r1
        L8:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static long m16018(long r2) {
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Ld
            r0 = 1
            long r2 = r2 + r0
            return r2
        Ld:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m16019(int r2, int r3) {
            int r0 = r2 * r3
            if (r2 == 0) goto L17
            if (r3 == 0) goto L17
            int r1 = r0 / r2
            if (r1 != r3) goto Lf
            int r3 = r0 / r3
            if (r3 != r2) goto Lf
            goto L17
        Lf:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
        L17:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static long m16020(long r5, long r7) {
            long r0 = r5 * r7
            r2 = 0
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            long r2 = r0 / r5
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L19
            long r7 = r0 / r7
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L19
            goto L21
        L19:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "integer overflow"
            r5.<init>(r6)
            throw r5
        L21:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m16021(int r1) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L6
            int r1 = -r1
            return r1
        L6:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static long m16022(long r2) {
            r0 = -9223372036854775808
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L8
            long r2 = -r2
            return r2
        L8:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m16023(int r4, int r5) {
            int r0 = r4 - r5
            r1 = 0
            r2 = 1
            if (r4 >= 0) goto L8
            r3 = r2
            goto L9
        L8:
            r3 = r1
        L9:
            if (r5 >= 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            if (r3 == r5) goto L23
            if (r4 >= 0) goto L14
            r4 = r2
            goto L15
        L14:
            r4 = r1
        L15:
            if (r0 >= 0) goto L18
            r1 = r2
        L18:
            if (r4 != r1) goto L1b
            goto L23
        L1b:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "integer overflow"
            r4.<init>(r5)
            throw r4
        L23:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static long m16024(long r6, long r8) {
            long r0 = r6 - r8
            r2 = 0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r7 = 0
            r4 = 1
            if (r6 >= 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r7
        Ld:
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 >= 0) goto L13
            r8 = r4
            goto L14
        L13:
            r8 = r7
        L14:
            if (r5 == r8) goto L2b
            if (r6 >= 0) goto L1a
            r6 = r4
            goto L1b
        L1a:
            r6 = r7
        L1b:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L20
            r7 = r4
        L20:
            if (r6 != r7) goto L23
            goto L2b
        L23:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            java.lang.String r7 = "integer overflow"
            r6.<init>(r7)
            throw r6
        L2b:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static int m16025(long r2) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            int r2 = (int) r2
            return r2
        L10:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
    }
}
