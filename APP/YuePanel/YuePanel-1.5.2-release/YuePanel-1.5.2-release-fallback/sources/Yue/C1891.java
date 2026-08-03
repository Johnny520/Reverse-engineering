package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1891 implements Yue.InterfaceC1892 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.Future<?> f5818;

    public C1891(@Yue.InterfaceC4418 java.util.concurrent.Future<?> r1) {
            r0 = this;
            r0.<init>()
            r0.f5818 = r1
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DisposableFutureHandle["
            r0.append(r1)
            java.util.concurrent.Future<?> r1 = r2.f5818
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC1892
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public void mo352() {
            r2 = this;
            java.util.concurrent.Future<?> r0 = r2.f5818
            r1 = 0
            r0.cancel(r1)
            return
    }
}
