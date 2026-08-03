package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends java.util.concurrent.CancellationException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5724g;

    public /* synthetic */ l0(java.lang.String r1, int r2) {
            r0 = this;
            r0.f5724g = r2
            r0.<init>(r1)
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            int r0 = r1.f5724g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
        Lc:
            java.lang.StackTraceElement[] r0 = j.a.f6669a
            r1.setStackTrace(r0)
            return r1
    }
}
