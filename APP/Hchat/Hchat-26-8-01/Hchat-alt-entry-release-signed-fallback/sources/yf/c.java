package yf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends yf.a {
    private final wf.g _context;
    private transient wf.c intercepted;

    public c(wf.c r2) {
            r1 = this;
            if (r2 == 0) goto L7
            wf.g r0 = r2.getContext()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
    }

    public c(wf.c r1, wf.g r2) {
            r0 = this;
            r0.<init>(r1)
            r0._context = r2
            return
    }

    @Override // wf.c
    public wf.g getContext() {
            r1 = this;
            wf.g r0 = r1._context
            r0.getClass()
            return r0
    }

    public final wf.c intercepted() {
            r2 = this;
            wf.c r0 = r2.intercepted
            if (r0 != 0) goto L1c
            wf.g r0 = r2.getContext()
            wf.d r1 = wf.d.f20785g
            wf.e r0 = r0.s(r1)
            qg.p r0 = (qg.p) r0
            if (r0 == 0) goto L18
            vg.f r1 = new vg.f
            r1.<init>(r0, r2)
            goto L19
        L18:
            r1 = r2
        L19:
            r2.intercepted = r1
            return r1
        L1c:
            return r0
    }

    @Override // yf.a
    public void releaseIntercepted() {
            r4 = this;
            wf.c r0 = r4.intercepted
            if (r0 == 0) goto L32
            if (r0 == r4) goto L32
            wf.g r1 = r4.getContext()
            wf.d r2 = wf.d.f20785g
            wf.e r1 = r1.s(r2)
            r1.getClass()
            qg.p r1 = (qg.p) r1
            vg.f r0 = (vg.f) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = vg.f.f14329n
        L19:
            java.lang.Object r2 = r1.get(r0)
            l3.q r3 = vg.a.f14319c
            if (r2 == r3) goto L19
            java.lang.Object r0 = r1.get(r0)
            boolean r1 = r0 instanceof qg.g
            if (r1 == 0) goto L2c
            qg.g r0 = (qg.g) r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            if (r0 == 0) goto L32
            r0.l()
        L32:
            yf.b r0 = yf.b.f22436g
            r4.intercepted = r0
            return
    }
}
