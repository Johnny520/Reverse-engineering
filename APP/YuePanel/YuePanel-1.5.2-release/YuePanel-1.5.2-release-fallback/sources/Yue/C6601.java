package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "UnsignedKt")
public final class C6601 {
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int m25392(double r4) {
            boolean r0 = java.lang.Double.isNaN(r4)
            r1 = 0
            if (r0 == 0) goto L8
            goto L3d
        L8:
            double r2 = m25397(r1)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L3d
        L11:
            r1 = -1
            double r2 = m25397(r1)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L1b
            goto L3d
        L1b:
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L2a
            int r4 = (int) r4
            int r1 = Yue.C6528.m24937(r4)
            goto L3d
        L2a:
            r0 = 2147483647(0x7fffffff, float:NaN)
            double r1 = (double) r0
            double r4 = r4 - r1
            int r4 = (int) r4
            int r4 = Yue.C6528.m24937(r4)
            int r5 = Yue.C6528.m24937(r0)
            int r4 = r4 + r5
            int r1 = Yue.C6528.m24937(r4)
        L3d:
            return r1
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long m25393(double r5) {
            boolean r0 = java.lang.Double.isNaN(r5)
            r1 = 0
            if (r0 == 0) goto L9
            goto L36
        L9:
            double r3 = m25401(r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L12
            goto L36
        L12:
            r1 = -1
            double r3 = m25401(r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L1d
            goto L36
        L1d:
            r0 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L29
            long r5 = (long) r5
            long r1 = Yue.C6539.m25038(r5)
            goto L36
        L29:
            double r5 = r5 - r0
            long r5 = (long) r5
            long r5 = Yue.C6539.m25038(r5)
            r0 = -9223372036854775808
            long r5 = r5 + r0
            long r1 = Yue.C6539.m25038(r5)
        L36:
            return r1
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m25394(int r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 ^ r0
            r2 = r2 ^ r0
            int r1 = Yue.C3329.m13910(r1, r2)
            return r1
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m25395(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = (long) r5
            long r4 = r4 & r2
            long r0 = r0 / r4
            int r4 = (int) r0
            int r4 = Yue.C6528.m24937(r4)
            return r4
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m25396(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = (long) r5
            long r4 = r4 & r2
            long r0 = r0 % r4
            int r4 = (int) r0
            int r4 = Yue.C6528.m24937(r4)
            return r4
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final double m25397(int r6) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r6
            double r0 = (double) r0
            int r6 = r6 >>> 31
            int r6 = r6 << 30
            double r2 = (double) r6
            r6 = 2
            double r4 = (double) r6
            double r2 = r2 * r4
            double r0 = r0 + r2
            return r0
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m25398(long r2, long r4) {
            r0 = -9223372036854775808
            long r2 = r2 ^ r0
            long r4 = r4 ^ r0
            int r2 = Yue.C3329.m13911(r2, r4)
            return r2
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long m25399(long r5, long r7) {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L18
            int r5 = java.lang.Long.compareUnsigned(r5, r7)
            if (r5 >= 0) goto L11
            long r5 = Yue.C6539.m25038(r0)
            goto L17
        L11:
            r5 = 1
            long r5 = Yue.C6539.m25038(r5)
        L17:
            return r5
        L18:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
            long r5 = r5 / r7
            long r5 = Yue.C6539.m25038(r5)
            return r5
        L22:
            r0 = 1
            long r1 = r5 >>> r0
            long r1 = r1 / r7
            long r1 = r1 << r0
            long r3 = r1 * r7
            long r5 = r5 - r3
            long r5 = Yue.C6539.m25038(r5)
            long r7 = Yue.C6539.m25038(r7)
            int r5 = java.lang.Long.compareUnsigned(r5, r7)
            if (r5 < 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            long r5 = (long) r0
            long r1 = r1 + r5
            long r5 = Yue.C6539.m25038(r1)
            return r5
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final long m25400(long r6, long r8) {
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L13
            int r0 = java.lang.Long.compareUnsigned(r6, r8)
            if (r0 >= 0) goto Ld
            goto L12
        Ld:
            long r6 = r6 - r8
            long r6 = Yue.C6539.m25038(r6)
        L12:
            return r6
        L13:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L1d
            long r6 = r6 % r8
            long r6 = Yue.C6539.m25038(r6)
            return r6
        L1d:
            r2 = 1
            long r3 = r6 >>> r2
            long r3 = r3 / r8
            long r2 = r3 << r2
            long r2 = r2 * r8
            long r6 = r6 - r2
            long r2 = Yue.C6539.m25038(r6)
            long r4 = Yue.C6539.m25038(r8)
            int r2 = java.lang.Long.compareUnsigned(r2, r4)
            if (r2 < 0) goto L34
            goto L35
        L34:
            r8 = r0
        L35:
            long r6 = r6 - r8
            long r6 = Yue.C6539.m25038(r6)
            return r6
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final double m25401(long r4) {
            r0 = 11
            long r0 = r4 >>> r0
            double r0 = (double) r0
            r2 = 2048(0x800, float:2.87E-42)
            double r2 = (double) r2
            double r0 = r0 * r2
            r2 = 2047(0x7ff, double:1.0114E-320)
            long r4 = r4 & r2
            double r4 = (double) r4
            double r0 = r0 + r4
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String m25402(long r1) {
            r0 = 10
            java.lang.String r1 = m25403(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String m25403(long r8, int r10) {
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            if (r0 < 0) goto L14
            int r10 = Yue.C1096.m5842(r10)
            java.lang.String r8 = java.lang.Long.toString(r8, r10)
            Yue.C3329.m13905(r8, r1)
            return r8
        L14:
            r0 = 1
            long r2 = r8 >>> r0
            long r4 = (long) r10
            long r2 = r2 / r4
            long r2 = r2 << r0
            long r6 = r2 * r4
            long r8 = r8 - r6
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L25
            long r8 = r8 - r4
            r4 = 1
            long r2 = r2 + r4
        L25:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r4 = Yue.C1096.m5842(r10)
            java.lang.String r2 = java.lang.Long.toString(r2, r4)
            Yue.C3329.m13905(r2, r1)
            r0.append(r2)
            int r10 = Yue.C1096.m5842(r10)
            java.lang.String r8 = java.lang.Long.toString(r8, r10)
            Yue.C3329.m13905(r8, r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            return r8
    }
}
