package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6089 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int m22851(@Yue.InterfaceC4418 java.lang.String r7, int r8, int r9, int r10) {
            long r1 = (long) r8
            long r3 = (long) r9
            long r5 = (long) r10
            r0 = r7
            long r7 = Yue.C6087.m22844(r0, r1, r3, r5)
            int r7 = (int) r7
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long m22852(@Yue.InterfaceC4418 java.lang.String r4, long r5, long r7, long r9) {
            java.lang.String r0 = Yue.C6087.m22845(r4)
            if (r0 != 0) goto L7
            return r5
        L7:
            java.lang.Long r5 = Yue.C5987.m22244(r0)
            r6 = 39
            java.lang.String r1 = "System property '"
            if (r5 == 0) goto L52
            long r2 = r5.longValue()
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 > 0) goto L1e
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 > 0) goto L1e
            return r2
        L1e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "' should be in range "
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = ".."
            r0.append(r4)
            r0.append(r9)
            java.lang.String r4 = ", but is '"
            r0.append(r4)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r4)
            java.lang.String r4 = "' has unrecognized value '"
            r7.append(r4)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m22853(@Yue.InterfaceC4418 java.lang.String r0, boolean r1) {
            java.lang.String r0 = Yue.C6087.m22845(r0)
            if (r0 == 0) goto La
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
        La:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ int m22854(java.lang.String r0, int r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 4
            if (r5 == 0) goto L5
            r2 = 1
        L5:
            r4 = r4 & 8
            if (r4 == 0) goto Lc
            r3 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            int r0 = Yue.C6087.m22843(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ long m22855(java.lang.String r7, long r8, long r10, long r12, int r14, java.lang.Object r15) {
            r15 = r14 & 4
            if (r15 == 0) goto L6
            r10 = 1
        L6:
            r3 = r10
            r10 = r14 & 8
            if (r10 == 0) goto L10
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L10:
            r5 = r12
            r0 = r7
            r1 = r8
            long r7 = Yue.C6087.m22844(r0, r1, r3, r5)
            return r7
    }
}
