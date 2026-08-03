package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends w0.w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5929c;

    public i2(long r1, long r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f5929c = r3
            return
    }

    @Override // w0.w
    public final void a(w0.w r3) {
            r2 = this;
            r3.getClass()
            i0.i2 r3 = (i0.i2) r3
            long r0 = r3.f5929c
            r2.f5929c = r0
            return
    }

    @Override // w0.w
    public final w0.w b(long r4) {
            r3 = this;
            i0.i2 r0 = new i0.i2
            long r1 = r3.f5929c
            r0.<init>(r4, r1)
            return r0
    }
}
