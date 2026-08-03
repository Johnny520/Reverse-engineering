package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends qg.u0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qg.g f11060l;

    public /* synthetic */ i(qg.g r1, int r2) {
            r0 = this;
            r0.f11059k = r2
            r0.<init>()
            r0.f11060l = r1
            return
    }

    @Override // qg.u0
    public final boolean k() {
            r1 = this;
            int r0 = r1.f11059k
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            r0 = 1
            return r0
    }

    @Override // qg.u0
    public final void l(java.lang.Throwable r7) {
            r6 = this;
            int r7 = r6.f11059k
            switch(r7) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            qg.g r7 = r6.f11060l
            sf.n r0 = sf.n.f12433a
            r7.resumeWith(r0)
            return
        Ld:
            qg.y0 r7 = r6.j()
            qg.g r0 = r6.f11060l
            java.lang.Throwable r7 = r0.n(r7)
            boolean r1 = r0.t()
            if (r1 != 0) goto L1e
            goto L4a
        L1e:
            wf.c r1 = r0.f11049j
            vg.f r1 = (vg.f) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = vg.f.f14329n
        L24:
            java.lang.Object r3 = r2.get(r1)
            l3.q r4 = vg.a.f14319c
            boolean r5 = gg.l.a(r3, r4)
            if (r5 == 0) goto L3e
        L30:
            boolean r3 = r2.compareAndSet(r1, r4, r7)
            if (r3 == 0) goto L37
            goto L56
        L37:
            java.lang.Object r3 = r2.get(r1)
            if (r3 == r4) goto L30
            goto L24
        L3e:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L43
            goto L56
        L43:
            r4 = 0
            boolean r4 = r2.compareAndSet(r1, r3, r4)
            if (r4 == 0) goto L57
        L4a:
            r0.w(r7)
            boolean r7 = r0.t()
            if (r7 != 0) goto L56
            r0.l()
        L56:
            return
        L57:
            java.lang.Object r4 = r2.get(r1)
            if (r4 == r3) goto L43
            goto L24
    }
}
