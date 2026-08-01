package p000;

/* JADX INFO: renamed from: of */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0621of extends p000.co0 {

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ int f8065;

    /* JADX INFO: renamed from: κ */
    public final java.lang.Object f8066;

    public /* synthetic */ C0621of(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f8065 = r1
            r0.<init>()
            r0.f8066 = r2
            return
    }

    @Override // p000.co0
    /* JADX INFO: renamed from: λ */
    public final boolean mo1280() {
            r0 = this;
            int r0 = r0.f8065
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
            r0 = 1
            return r0
    }

    @Override // p000.co0
    /* JADX INFO: renamed from: μ */
    public final void mo1281(java.lang.Throwable r6) {
            r5 = this;
            int r0 = r5.f8065
            switch(r0) {
                case 0: goto L17;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r5 = r5.f8066
            a80 r5 = (p000.a80) r5
            r5.invoke(r6)
            return
        Ld:
            java.lang.Object r5 = r5.f8066
            ae r5 = (p000.C0015ae) r5
            s62 r6 = p000.s62.f9751
            r5.mo75(r6)
            return
        L17:
            java.lang.Object r6 = r5.f8066
            ae r6 = (p000.C0015ae) r6
            fo0 r5 = r5.m1279()
            java.util.concurrent.CancellationException r5 = r5.m2159()
            boolean r0 = r6.m92()
            if (r0 != 0) goto L2a
            goto L56
        L2a:
            op r0 = r6.f196
            gt r0 = (p000.C0334gt) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0334gt.f4444
        L30:
            java.lang.Object r2 = r1.get(r0)
            uy r3 = p000.jx0.f5622
            boolean r4 = p000.ln0.m3626(r2, r3)
            if (r4 == 0) goto L4a
        L3c:
            boolean r2 = r1.compareAndSet(r0, r3, r5)
            if (r2 == 0) goto L43
            goto L62
        L43:
            java.lang.Object r2 = r1.get(r0)
            if (r2 == r3) goto L3c
            goto L30
        L4a:
            boolean r3 = r2 instanceof java.lang.Throwable
            if (r3 == 0) goto L4f
            goto L62
        L4f:
            r3 = 0
            boolean r3 = r1.compareAndSet(r0, r2, r3)
            if (r3 == 0) goto L63
        L56:
            r6.m83(r5)
            boolean r5 = r6.m92()
            if (r5 != 0) goto L62
            r6.m84()
        L62:
            return
        L63:
            java.lang.Object r3 = r1.get(r0)
            if (r3 == r2) goto L4f
            goto L30
    }
}
