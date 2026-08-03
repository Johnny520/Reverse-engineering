package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends qg.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qg.l f11112o;

    public v0(wf.c r2, qg.l r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            r1.f11112o = r3
            return
    }

    @Override // qg.g
    public final java.lang.Throwable n(qg.y0 r3) {
            r2 = this;
            qg.l r0 = r2.f11112o
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qg.y0.f11124g
            java.lang.Object r0 = r1.get(r0)
            boolean r1 = r0 instanceof qg.x0
            if (r1 == 0) goto L19
            r1 = r0
            qg.x0 r1 = (qg.x0) r1
            java.lang.Throwable r1 = r1.c()
            if (r1 == 0) goto L19
            return r1
        L19:
            boolean r1 = r0 instanceof qg.n
            if (r1 == 0) goto L22
            qg.n r0 = (qg.n) r0
            java.lang.Throwable r3 = r0.f11082a
            return r3
        L22:
            java.util.concurrent.CancellationException r3 = r3.h()
            return r3
    }

    @Override // qg.g
    public final java.lang.String v() {
            r1 = this;
            java.lang.String r0 = "AwaitContinuation"
            return r0
    }
}
