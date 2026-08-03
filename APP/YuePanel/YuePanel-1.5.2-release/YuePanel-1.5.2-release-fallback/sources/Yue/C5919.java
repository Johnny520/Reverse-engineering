package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5919 extends Yue.C5918 {
    public C5919() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <R> R m21981(java.lang.Object r1, Yue.InterfaceC2823<? extends R> r2) {
            java.lang.String r0 = "lock"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r2, r0)
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L18
            Yue.C3249.m13687(r0)
            monitor-exit(r1)
            Yue.C3249.m13686(r0)
            return r2
        L18:
            r2 = move-exception
            Yue.C3249.m13687(r0)
            monitor-exit(r1)
            Yue.C3249.m13686(r0)
            throw r2
    }
}
