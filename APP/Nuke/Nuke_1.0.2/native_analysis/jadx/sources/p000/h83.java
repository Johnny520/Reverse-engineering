package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h83 extends u92 implements ht2 {

    /* JADX INFO: renamed from: j */
    public final vf1 f3900j;

    /* JADX INFO: renamed from: k */
    public final long f3901k;

    public h83(vf1 vf1Var, long j) {
        this.f3900j = vf1Var;
        this.f3901k = j;
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: a */
    public final o23 mo889a() {
        return o23.f7455d;
    }

    @Override // p000.u92
    /* JADX INFO: renamed from: c */
    public final long mo273c() {
        return this.f3901k;
    }

    @Override // p000.u92
    /* JADX INFO: renamed from: e */
    public final vf1 mo274e() {
        return this.f3900j;
    }

    @Override // p000.u92
    /* JADX INFO: renamed from: g */
    public final InterfaceC0549on mo275g() {
        return new o52(this);
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: n */
    public final long mo891n(C0209fn c0209fn, long j) {
        c0209fn.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // p000.u92, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
