package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6532 {
    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int[] m25012(int r3, Yue.InterfaceC2825<? super java.lang.Integer, Yue.C6528> r4) {
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r4, r0)
            int[] r0 = new int[r3]
            r1 = 0
        L8:
            if (r1 >= r3) goto L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r2)
            Yue.ۥۢۢۦۣ r2 = (Yue.C6528) r2
            int r2 = r2.m24991()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L1d:
            int[] r3 = Yue.C6530.m24994(r0)
            return r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int[] m25013(int... r1) {
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r1, r0)
            return r1
    }
}
