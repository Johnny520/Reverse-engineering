package p000;

/* JADX INFO: renamed from: rs */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0772rs extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: ε */
    public final transient p000.InterfaceC0880up f9478;

    public C0772rs(p000.InterfaceC0880up r1) {
            r0 = this;
            r0.<init>()
            r0.f9478 = r1
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
            r0 = this;
            up r0 = r0.f9478
            java.lang.String r0 = r0.toString()
            return r0
    }
}
