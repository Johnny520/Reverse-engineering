package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends wf.a implements qg.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.d f5850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.c2 f5851i;

    public b2(x0.d r2, i0.c2 r3) {
            r1 = this;
            qg.q r0 = qg.q.f11089g
            r1.f5850h = r2
            r1.f5851i = r3
            r1.<init>(r0)
            return
    }

    @Override // qg.r
    public final void m(java.lang.Throwable r5, wf.g r6) {
            r4 = this;
            wb.xi r0 = new wb.xi
            r1 = 24
            x0.d r2 = r4.f5850h
            i0.c2 r3 = r4.f5851i
            r0.<init>(r2, r1, r3)
            ig.a.b0(r5, r0)
            qg.q r0 = qg.q.f11089g
            wf.g r1 = r3.f5856g
            wf.e r0 = r1.s(r0)
            qg.r r0 = (qg.r) r0
            if (r0 == 0) goto L1e
            r0.m(r5, r6)
            return
        L1e:
            throw r5
    }
}
