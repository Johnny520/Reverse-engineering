package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0832 {
    @Yue.InterfaceC4418
    @Yue.InterfaceC4556
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <E> Yue.InterfaceC0830<E> m4786(int r1) {
            r0 = -2
            if (r1 == r0) goto L29
            r0 = -1
            if (r1 == r0) goto L23
            if (r1 == 0) goto L1b
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L13
            Yue.ۥ۟ۡۦۨ r0 = new Yue.ۥ۟ۡۦۨ
            r0.<init>(r1)
            goto L34
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported UNLIMITED capacity for BroadcastChannel"
            r1.<init>(r0)
            throw r1
        L1b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported 0 capacity for BroadcastChannel"
            r1.<init>(r0)
            throw r1
        L23:
            Yue.ۥ۟ۦۧۡ r0 = new Yue.ۥ۟ۦۧۡ
            r0.<init>()
            goto L34
        L29:
            Yue.ۥ۟ۡۦۨ r0 = new Yue.ۥ۟ۡۦۨ
            Yue.ۥ۟ۤ۠ۨ$ۥ۟ r1 = Yue.InterfaceC0996.f2858
            int r1 = r1.m5525()
            r0.<init>(r1)
        L34:
            return r0
    }
}
