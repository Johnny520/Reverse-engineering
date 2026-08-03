package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends qg.u0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Object f11044l;

    public /* synthetic */ e0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f11043k = r2
            r0.<init>()
            r0.f11044l = r1
            return
    }

    @Override // qg.u0
    public final boolean k() {
            r1 = this;
            int r0 = r1.f11043k
            switch(r0) {
                case 0: goto L9;
                case 1: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            r0 = 0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // qg.u0
    public final void l(java.lang.Throwable r3) {
            r2 = this;
            int r0 = r2.f11043k
            switch(r0) {
                case 0: goto L33;
                case 1: goto L2b;
                default: goto L5;
            }
        L5:
            qg.y0 r3 = r2.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
            java.lang.Object r3 = r0.get(r3)
            boolean r0 = r3 instanceof qg.n
            java.lang.Object r1 = r2.f11044l
            qg.v0 r1 = (qg.v0) r1
            if (r0 == 0) goto L23
            qg.n r3 = (qg.n) r3
            java.lang.Throwable r3 = r3.f11082a
            sf.f r3 = f8.i.q(r3)
            r1.resumeWith(r3)
            goto L2a
        L23:
            java.lang.Object r3 = qg.v.v(r3)
            r1.resumeWith(r3)
        L2a:
            return
        L2b:
            java.lang.Object r0 = r2.f11044l
            fg.l r0 = (fg.l) r0
            r0.invoke(r3)
            return
        L33:
            java.lang.Object r3 = r2.f11044l
            qg.d0 r3 = (qg.d0) r3
            r3.a()
            return
    }
}
