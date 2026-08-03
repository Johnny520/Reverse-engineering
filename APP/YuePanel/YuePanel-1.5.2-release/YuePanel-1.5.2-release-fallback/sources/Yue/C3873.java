package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3873 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3873 f12337 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean f12338 = false;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.AbstractC3862 f12339 = null;

    static {
            Yue.ۥ۠ۨۦۢ r0 = new Yue.ۥ۠ۨۦۢ
            r0.<init>()
            Yue.C3873.f12337 = r0
            java.lang.String r1 = "kotlinx.coroutines.fast.service.loader"
            r2 = 1
            Yue.C6087.m22846(r1, r2)
            Yue.ۥ۠ۨۥۥ r0 = r0.m15625()
            Yue.C3873.f12339 = r0
            return
    }

    public C3873() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.AbstractC3862 m15625() {
            r7 = this;
            java.lang.Class<Yue.ۥ۠ۨۦۡ> r0 = Yue.InterfaceC3871.class
            r1 = 0
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L55
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r2)     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L55
            Yue.ۥۡۨۢ r0 = Yue.C5616.m20985(r0)     // Catch: java.lang.Throwable -> L55
            java.util.List r0 = Yue.C5629.m21197(r0)     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L55
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r3 != 0) goto L23
            r3 = r1
            goto L4a
        L23:
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L55
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r4 != 0) goto L2e
            goto L4a
        L2e:
            r4 = r3
            Yue.ۥ۠ۨۦۡ r4 = (Yue.InterfaceC3871) r4     // Catch: java.lang.Throwable -> L55
            int r4 = r4.mo1411()     // Catch: java.lang.Throwable -> L55
        L35:
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L55
            r6 = r5
            Yue.ۥ۠ۨۦۡ r6 = (Yue.InterfaceC3871) r6     // Catch: java.lang.Throwable -> L55
            int r6 = r6.mo1411()     // Catch: java.lang.Throwable -> L55
            if (r4 >= r6) goto L44
            r3 = r5
            r4 = r6
        L44:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto L35
        L4a:
            Yue.ۥ۠ۨۦۡ r3 = (Yue.InterfaceC3871) r3     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L57
            Yue.ۥ۠ۨۥۥ r0 = Yue.C3874.m15631(r3, r0)     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L62
            goto L57
        L55:
            r0 = move-exception
            goto L5d
        L57:
            r0 = 3
            Yue.ۥۡۡۡۨ r0 = Yue.C3874.m15627(r1, r1, r0, r1)     // Catch: java.lang.Throwable -> L55
            goto L62
        L5d:
            r2 = 2
            Yue.ۥۡۡۡۨ r0 = Yue.C3874.m15627(r0, r1, r2, r1)
        L62:
            return r0
    }
}
