package ug;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements wf.c, yf.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf.c f13835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wf.g f13836h;

    public o(wf.c r1, wf.g r2) {
            r0 = this;
            r0.<init>()
            r0.f13835g = r1
            r0.f13836h = r2
            return
    }

    @Override // yf.d
    public final yf.d getCallerFrame() {
            r2 = this;
            wf.c r0 = r2.f13835g
            boolean r1 = r0 instanceof yf.d
            if (r1 == 0) goto L9
            yf.d r0 = (yf.d) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // wf.c
    public final wf.g getContext() {
            r1 = this;
            wf.g r0 = r1.f13836h
            return r0
    }

    @Override // wf.c
    public final void resumeWith(java.lang.Object r2) {
            r1 = this;
            wf.c r0 = r1.f13835g
            r0.resumeWith(r2)
            return
    }
}
