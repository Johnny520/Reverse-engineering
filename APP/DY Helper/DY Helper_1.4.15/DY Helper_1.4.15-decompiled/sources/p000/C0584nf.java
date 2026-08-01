package p000;

/* JADX INFO: renamed from: nf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0584nf extends java.util.concurrent.CancellationException {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7590;

    public C0584nf() {
            r1 = this;
            r0 = 1
            r1.f7590 = r0
            java.lang.String r0 = "The coroutine scope left the composition"
            r1.<init>(r0)
            return
    }

    public /* synthetic */ C0584nf(java.lang.String r1, int r2) {
            r0 = this;
            r0.f7590 = r2
            r0.<init>(r1)
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            int r0 = r1.f7590
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.StackTraceElement[] r0 = p000.pd2.f8523
            r1.setStackTrace(r0)
            return r1
        Lb:
            java.lang.StackTraceElement[] r0 = p000.AbstractC0782s1.f9650
            r1.setStackTrace(r0)
            return r1
        L11:
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }
}
