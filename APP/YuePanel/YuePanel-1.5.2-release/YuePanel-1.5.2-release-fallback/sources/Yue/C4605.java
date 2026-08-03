package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4605 {
    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "blackhole")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.InterfaceC5794 m18421() {
            Yue.ۥ۟ۢۧۥ r0 = new Yue.ۥ۟ۢۧۥ
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m18422(@Yue.InterfaceC4418 Yue.InterfaceC5794 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۡۦ۠ۢ r0 = new Yue.ۥۡۦ۠ۢ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC0849 m18423(@Yue.InterfaceC4418 Yue.InterfaceC5839 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۡۦۣ۠ r0 = new Yue.ۥۡۦۣ۠
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T extends java.io.Closeable, R> R m18424(T r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, ? extends R> r4) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r4, r0)
            r0 = 1
            r1 = 0
            java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L19
            Yue.C3249.m13687(r0)
            if (r3 == 0) goto L15
            r3.close()     // Catch: java.lang.Throwable -> L14
            goto L15
        L14:
            r1 = move-exception
        L15:
            Yue.C3249.m13686(r0)
            goto L2d
        L19:
            r4 = move-exception
            Yue.C3249.m13687(r0)
            if (r3 == 0) goto L27
            r3.close()     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r3 = move-exception
            Yue.C2268.m10468(r4, r3)
        L27:
            Yue.C3249.m13686(r0)
            r2 = r1
            r1 = r4
            r4 = r2
        L2d:
            if (r1 != 0) goto L33
            Yue.C3329.m13903(r4)
            return r4
        L33:
            throw r1
    }
}
