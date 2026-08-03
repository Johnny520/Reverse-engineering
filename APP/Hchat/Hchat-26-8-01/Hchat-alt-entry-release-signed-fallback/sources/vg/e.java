package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient wf.g f14328g;

    public e(wf.g r1) {
            r0 = this;
            r0.<init>()
            r0.f14328g = r1
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    @Override // java.lang.Throwable
    public final java.lang.String getLocalizedMessage() {
            r1 = this;
            wf.g r0 = r1.f14328g
            java.lang.String r0 = r0.toString()
            return r0
    }
}
