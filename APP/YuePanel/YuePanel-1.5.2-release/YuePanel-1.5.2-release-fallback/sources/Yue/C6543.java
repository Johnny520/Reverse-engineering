package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6543 {
    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final long[] m25113(int r4, Yue.InterfaceC2825<? super java.lang.Integer, Yue.C6539> r5) {
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r5, r0)
            long[] r0 = new long[r4]
            r1 = 0
        L8:
            if (r1 >= r4) goto L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r5.invoke(r2)
            Yue.ۥۢۢۧ۟ r2 = (Yue.C6539) r2
            long r2 = r2.m25092()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L1d:
            long[] r4 = Yue.C6541.m25095(r0)
            return r4
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long[] m25114(long... r1) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r1, r0)
            return r1
    }
}
