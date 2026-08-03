package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends w0.w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5893c;

    public g2(long r1, float r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f5893c = r3
            return
    }

    @Override // w0.w
    public final void a(w0.w r1) {
            r0 = this;
            r1.getClass()
            i0.g2 r1 = (i0.g2) r1
            float r1 = r1.f5893c
            r0.f5893c = r1
            return
    }

    @Override // w0.w
    public final w0.w b(long r3) {
            r2 = this;
            i0.g2 r0 = new i0.g2
            float r1 = r2.f5893c
            r0.<init>(r3, r1)
            return r0
    }
}
