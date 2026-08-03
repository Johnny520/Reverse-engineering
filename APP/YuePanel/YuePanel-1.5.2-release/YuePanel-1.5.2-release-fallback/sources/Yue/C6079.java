package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6079 {
    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m22822() {
            return
    }

    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> T m22823(@Yue.InterfaceC4418 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r2) {
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> Le
            Yue.C3249.m13687(r0)
            monitor-exit(r1)
            Yue.C3249.m13686(r0)
            return r2
        Le:
            r2 = move-exception
            Yue.C3249.m13687(r0)
            monitor-exit(r1)
            Yue.C3249.m13686(r0)
            throw r2
    }
}
