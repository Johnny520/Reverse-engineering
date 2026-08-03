package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1649 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.List<Yue.InterfaceC1646> f5101 = null;

    static {
            java.lang.Class<Yue.ۥ۟ۧۧ> r0 = Yue.InterfaceC1646.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            Yue.ۥۡۨۢ r0 = Yue.C5616.m20985(r0)
            java.util.List r0 = Yue.C5629.m21197(r0)
            Yue.C1649.f5101 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m7931(@Yue.InterfaceC4418 Yue.InterfaceC1632 r4, @Yue.InterfaceC4418 java.lang.Throwable r5) {
            java.util.List<Yue.ۥ۟ۧۧ> r0 = Yue.C1649.f5101
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۧۧ r1 = (Yue.InterfaceC1646) r1
            r1.mo1412(r4, r5)     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r3 = r2.getUncaughtExceptionHandler()
            java.lang.Throwable r1 = Yue.C1650.m7934(r5, r1)
            r3.uncaughtException(r2, r1)
            goto L6
        L27:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L3b
            Yue.ۥ۠۟۠۟ r1 = new Yue.ۥ۠۟۠۟     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L3b
            Yue.C2268.m10468(r5, r1)     // Catch: java.lang.Throwable -> L3b
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L3b
            Yue.C5388.m20377(r4)     // Catch: java.lang.Throwable -> L3b
            goto L45
        L3b:
            r4 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            java.lang.Object r4 = Yue.C5391.m20390(r4)
            Yue.C5388.m20377(r4)
        L45:
            java.lang.Thread$UncaughtExceptionHandler r4 = r0.getUncaughtExceptionHandler()
            r4.uncaughtException(r0, r5)
            return
    }
}
