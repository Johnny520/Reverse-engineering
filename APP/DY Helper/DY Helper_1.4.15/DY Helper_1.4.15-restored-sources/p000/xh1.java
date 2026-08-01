package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xh1 extends java.util.concurrent.CancellationException {
    public xh1(long r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Timed out waiting for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " ms"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            java.lang.StackTraceElement[] r0 = p000.h62.f4594
            r1.setStackTrace(r0)
            return r1
    }
}
