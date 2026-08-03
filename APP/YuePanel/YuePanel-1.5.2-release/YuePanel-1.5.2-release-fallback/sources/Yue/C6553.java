package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6553 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int m25165(int r1, int r2, int r3) {
            int r1 = java.lang.Integer.remainderUnsigned(r1, r3)
            int r2 = java.lang.Integer.remainderUnsigned(r2, r3)
            int r0 = java.lang.Integer.compareUnsigned(r1, r2)
            int r1 = r1 - r2
            int r1 = Yue.C6528.m24937(r1)
            if (r0 < 0) goto L14
            goto L19
        L14:
            int r1 = r1 + r3
            int r1 = Yue.C6528.m24937(r1)
        L19:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long m25166(long r1, long r3, long r5) {
            long r1 = java.lang.Long.remainderUnsigned(r1, r5)
            long r3 = java.lang.Long.remainderUnsigned(r3, r5)
            int r0 = java.lang.Long.compareUnsigned(r1, r3)
            long r1 = r1 - r3
            long r1 = Yue.C6539.m25038(r1)
            if (r0 < 0) goto L14
            goto L19
        L14:
            long r1 = r1 + r5
            long r1 = Yue.C6539.m25038(r1)
        L19:
            return r1
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m25167(long r7, long r9, long r11) {
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1d
            int r0 = java.lang.Long.compareUnsigned(r7, r9)
            if (r0 < 0) goto Ld
            goto L36
        Ld:
            long r5 = Yue.C6539.m25038(r11)
            r1 = r9
            r3 = r7
            long r7 = m25166(r1, r3, r5)
            long r9 = r9 - r7
            long r9 = Yue.C6539.m25038(r9)
            goto L36
        L1d:
            if (r0 >= 0) goto L37
            int r0 = java.lang.Long.compareUnsigned(r7, r9)
            if (r0 > 0) goto L26
            goto L36
        L26:
            long r11 = -r11
            long r4 = Yue.C6539.m25038(r11)
            r0 = r7
            r2 = r9
            long r7 = m25166(r0, r2, r4)
            long r9 = r9 + r7
            long r9 = Yue.C6539.m25038(r9)
        L36:
            return r9
        L37:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Step is zero."
            r7.<init>(r8)
            throw r7
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m25168(int r1, int r2, int r3) {
            if (r3 <= 0) goto L17
            int r0 = java.lang.Integer.compareUnsigned(r1, r2)
            if (r0 < 0) goto L9
            goto L2e
        L9:
            int r3 = Yue.C6528.m24937(r3)
            int r1 = m25165(r2, r1, r3)
            int r2 = r2 - r1
            int r2 = Yue.C6528.m24937(r2)
            goto L2e
        L17:
            if (r3 >= 0) goto L2f
            int r0 = java.lang.Integer.compareUnsigned(r1, r2)
            if (r0 > 0) goto L20
            goto L2e
        L20:
            int r3 = -r3
            int r3 = Yue.C6528.m24937(r3)
            int r1 = m25165(r1, r2, r3)
            int r2 = r2 + r1
            int r2 = Yue.C6528.m24937(r2)
        L2e:
            return r2
        L2f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Step is zero."
            r1.<init>(r2)
            throw r1
    }
}
