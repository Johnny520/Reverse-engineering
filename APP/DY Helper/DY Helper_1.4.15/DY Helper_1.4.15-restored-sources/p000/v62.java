package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class v62 extends p000.bo1 implements p000.rx1 {

    /* JADX INFO: renamed from: ζ */
    public final p000.ez0 f11122;

    /* JADX INFO: renamed from: η */
    public final long f11123;

    public v62(p000.ez0 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f11122 = r1
            r0.f11123 = r2
            return
    }

    @Override // p000.bo1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2105() {
            r0 = this;
            l42 r0 = p000.m42.f6935
            return r0
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r1, p000.C0793sc r3) {
            r0 = this;
            r3.getClass()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)"
            r0.<init>(r1)
            throw r0
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: η */
    public final long mo565() {
            r2 = this;
            long r0 = r2.f11123
            return r0
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: θ */
    public final p000.ez0 mo566() {
            r0 = this;
            ez0 r0 = r0.f11122
            return r0
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: κ */
    public final p000.InterfaceC0014ad mo567() {
            r1 = this;
            rk1 r0 = new rk1
            r0.<init>(r1)
            return r0
    }
}
