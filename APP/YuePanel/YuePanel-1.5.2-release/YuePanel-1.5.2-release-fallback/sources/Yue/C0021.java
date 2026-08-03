package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0021 extends java.util.concurrent.CancellationException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final transient Yue.InterfaceC2466<?> f59;

    public C0021(@Yue.InterfaceC4418 Yue.InterfaceC2466<?> r2) {
            r1 = this;
            java.lang.String r0 = "Flow was aborted, no more elements needed"
            r1.<init>(r0)
            r1.f59 = r2
            return
    }

    @Override // java.lang.Throwable
    @Yue.InterfaceC4418
    public java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }
}
