package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "TimingKt")
public final class C6259 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final long m23332(@Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r4) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r4, r0)
            long r0 = java.lang.System.nanoTime()
            r4.invoke()
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long m23333(@Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r4) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r4, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r4.invoke()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            return r2
    }
}
