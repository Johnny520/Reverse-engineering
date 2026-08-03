package yg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements qg.f, qg.o1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qg.g f22440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yg.b f22441h;

    public a(yg.b r1, qg.g r2) {
            r0 = this;
            r0.<init>()
            r0.f22441h = r1
            r0.f22440g = r2
            return
    }

    @Override // qg.f
    public final void A(java.lang.Object r2) {
            r1 = this;
            qg.g r0 = r1.f22440g
            r0.A(r2)
            return
    }

    @Override // qg.o1
    public final void a(vg.q r2, int r3) {
            r1 = this;
            qg.g r0 = r1.f22440g
            r0.a(r2, r3)
            return
    }

    @Override // wf.c
    public final wf.g getContext() {
            r1 = this;
            qg.g r0 = r1.f22440g
            wf.g r0 = r0.f11050k
            return r0
    }

    @Override // qg.f
    public final l3.q j(java.lang.Object r3, fg.q r4) {
            r2 = this;
            sf.n r3 = (sf.n) r3
            f0.h r4 = new f0.h
            yg.b r0 = r2.f22441h
            r4.<init>(r0, r2)
            qg.g r1 = r2.f22440g
            l3.q r3 = r1.j(r3, r4)
            if (r3 == 0) goto L17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = yg.b.f22442g
            r1 = 0
            r4.set(r0, r1)
        L17:
            return r3
    }

    @Override // wf.c
    public final void resumeWith(java.lang.Object r2) {
            r1 = this;
            qg.g r0 = r1.f22440g
            r0.resumeWith(r2)
            return
    }

    @Override // qg.f
    public final boolean w(java.lang.Throwable r2) {
            r1 = this;
            qg.g r0 = r1.f22440g
            boolean r2 = r0.w(r2)
            return r2
    }
}
