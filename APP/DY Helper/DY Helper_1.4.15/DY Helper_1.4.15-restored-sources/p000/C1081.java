package p000;

/* JADX INFO: renamed from: δ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1081 extends java.util.concurrent.CancellationException {

    /* JADX INFO: renamed from: ε */
    public final transient java.lang.Object f13390;

    public C1081(p000.C1070zt r2) {
            r1 = this;
            java.lang.String r0 = "Flow was aborted, no more elements needed"
            r1.<init>(r0)
            r1.f13390 = r2
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
}
