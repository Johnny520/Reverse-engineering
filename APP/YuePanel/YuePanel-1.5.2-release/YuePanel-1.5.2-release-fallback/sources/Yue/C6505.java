package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6505 {
    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int m24020(long[] r6, int r7, int r8) {
            int r0 = r7 + r8
            int r0 = r0 / 2
            long r0 = Yue.C6541.m25100(r6, r0)
        L8:
            if (r7 > r8) goto L39
        La:
            long r2 = Yue.C6541.m25100(r6, r7)
            int r2 = java.lang.Long.compareUnsigned(r2, r0)
            if (r2 >= 0) goto L17
            int r7 = r7 + 1
            goto La
        L17:
            long r2 = Yue.C6541.m25100(r6, r8)
            int r2 = java.lang.Long.compareUnsigned(r2, r0)
            if (r2 <= 0) goto L24
            int r8 = r8 + (-1)
            goto L17
        L24:
            if (r7 > r8) goto L8
            long r2 = Yue.C6541.m25100(r6, r7)
            long r4 = Yue.C6541.m25100(r6, r8)
            Yue.C6541.m25106(r6, r7, r4)
            Yue.C6541.m25106(r6, r8, r2)
            int r7 = r7 + 1
            int r8 = r8 + (-1)
            goto L8
        L39:
            return r7
    }

    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int m24021(byte[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r0 = r0 / 2
            byte r0 = Yue.C6519.m24858(r3, r0)
        L8:
            if (r4 > r5) goto L3f
        La:
            byte r1 = Yue.C6519.m24858(r3, r4)
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = Yue.C3329.m13910(r1, r2)
            if (r1 >= 0) goto L1b
            int r4 = r4 + 1
            goto La
        L1b:
            byte r1 = Yue.C6519.m24858(r3, r5)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = Yue.C3329.m13910(r1, r2)
            if (r1 <= 0) goto L2a
            int r5 = r5 + (-1)
            goto L1b
        L2a:
            if (r4 > r5) goto L8
            byte r1 = Yue.C6519.m24858(r3, r4)
            byte r2 = Yue.C6519.m24858(r3, r5)
            Yue.C6519.m24864(r3, r4, r2)
            Yue.C6519.m24864(r3, r5, r1)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L3f:
            return r4
    }

    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m24022(short[] r4, int r5, int r6) {
            int r0 = r5 + r6
            int r0 = r0 / 2
            short r0 = Yue.C6561.m25303(r4, r0)
        L8:
            if (r5 > r6) goto L40
        La:
            short r1 = Yue.C6561.m25303(r4, r5)
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            r3 = r0 & r2
            int r1 = Yue.C3329.m13910(r1, r3)
            if (r1 >= 0) goto L1d
            int r5 = r5 + 1
            goto La
        L1d:
            short r1 = Yue.C6561.m25303(r4, r6)
            r1 = r1 & r2
            int r1 = Yue.C3329.m13910(r1, r3)
            if (r1 <= 0) goto L2b
            int r6 = r6 + (-1)
            goto L1d
        L2b:
            if (r5 > r6) goto L8
            short r1 = Yue.C6561.m25303(r4, r5)
            short r2 = Yue.C6561.m25303(r4, r6)
            Yue.C6561.m25309(r4, r5, r2)
            Yue.C6561.m25309(r4, r6, r1)
            int r5 = r5 + 1
            int r6 = r6 + (-1)
            goto L8
        L40:
            return r5
    }

    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m24023(int[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r0 = r0 / 2
            int r0 = Yue.C6530.m24999(r3, r0)
        L8:
            if (r4 > r5) goto L39
        La:
            int r1 = Yue.C6530.m24999(r3, r4)
            int r1 = java.lang.Integer.compareUnsigned(r1, r0)
            if (r1 >= 0) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            int r1 = Yue.C6530.m24999(r3, r5)
            int r1 = java.lang.Integer.compareUnsigned(r1, r0)
            if (r1 <= 0) goto L24
            int r5 = r5 + (-1)
            goto L17
        L24:
            if (r4 > r5) goto L8
            int r1 = Yue.C6530.m24999(r3, r4)
            int r2 = Yue.C6530.m24999(r3, r5)
            Yue.C6530.m25005(r3, r4, r2)
            Yue.C6530.m25005(r3, r5, r1)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L39:
            return r4
    }

    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m24024(long[] r2, int r3, int r4) {
            int r0 = m24020(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            m24024(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            m24024(r2, r0, r4)
        L10:
            return
    }

    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m24025(byte[] r2, int r3, int r4) {
            int r0 = m24021(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            m24025(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            m24025(r2, r0, r4)
        L10:
            return
    }

    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m24026(short[] r2, int r3, int r4) {
            int r0 = m24022(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            m24026(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            m24026(r2, r0, r4)
        L10:
            return
    }

    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m24027(int[] r2, int r3, int r4) {
            int r0 = m24023(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            m24027(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            m24027(r2, r0, r4)
        L10:
            return
    }

    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final void m24028(@Yue.InterfaceC4418 long[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r1, r0)
            int r3 = r3 + (-1)
            m24024(r1, r2, r3)
            return
    }

    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m24029(@Yue.InterfaceC4418 byte[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r1, r0)
            int r3 = r3 + (-1)
            m24025(r1, r2, r3)
            return
    }

    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m24030(@Yue.InterfaceC4418 short[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r1, r0)
            int r3 = r3 + (-1)
            m24026(r1, r2, r3)
            return
    }

    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m24031(@Yue.InterfaceC4418 int[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r1, r0)
            int r3 = r3 + (-1)
            m24027(r1, r2, r3)
            return
    }
}
