package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends s0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qg.g f5847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fg.l f5848b;

    @Override // s0.b
    public final void a() {
            r1 = this;
            r0 = 0
            r1.f5848b = r0
            r1.f5847a = r0
            return
    }

    @Override // s0.b
    public final void b(java.lang.Throwable r2) {
            r1 = this;
            qg.g r0 = r1.f5847a
            if (r0 == 0) goto Lb
            sf.f r2 = f8.i.q(r2)
            r0.resumeWith(r2)
        Lb:
            return
    }
}
