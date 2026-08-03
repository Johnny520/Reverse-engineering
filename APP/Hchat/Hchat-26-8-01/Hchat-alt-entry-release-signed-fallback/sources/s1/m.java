package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends java.util.concurrent.CancellationException {
    public m(long r3) {
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
            java.lang.StackTraceElement[] r0 = s1.s.f12290d
            r1.setStackTrace(r0)
            return r1
    }
}
