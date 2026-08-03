package o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends java.util.concurrent.CancellationException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9468g;

    public /* synthetic */ c(java.lang.String r1, int r2) {
            r0 = this;
            r0.f9468g = r2
            r0.<init>(r1)
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            int r0 = r1.f9468g
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.StackTraceElement[] r0 = u1.b.f13337a
            r1.setStackTrace(r0)
            return r1
        Lb:
            java.lang.StackTraceElement[] r0 = s0.i.f12196a
            r1.setStackTrace(r0)
            return r1
        L11:
            java.lang.StackTraceElement[] r0 = o.d.f9469a
            r1.setStackTrace(r0)
            return r1
    }
}
