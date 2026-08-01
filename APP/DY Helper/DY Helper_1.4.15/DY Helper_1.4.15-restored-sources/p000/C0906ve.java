package p000;

/* JADX INFO: renamed from: ve */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0906ve extends p000.sr1 {

    /* JADX INFO: renamed from: ε */
    public final p000.C0942wc f11248;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f11249;

    public C0906ve(long r1, p000.C0906ve r3, p000.C0942wc r4, int r5) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            r0.f11248 = r4
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = p000.AbstractC1016yc.f12557
            int r2 = r2 * 2
            r1.<init>(r2)
            r0.f11249 = r1
            return
    }

    @Override // p000.sr1
    /* JADX INFO: renamed from: ζ */
    public final int mo4588() {
            r0 = this;
            int r0 = p000.AbstractC1016yc.f12557
            return r0
    }

    @Override // p000.sr1
    /* JADX INFO: renamed from: η */
    public final void mo4589(int r5, p000.InterfaceC0880up r6) {
            r4 = this;
            int r6 = p000.AbstractC1016yc.f12557
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f11249
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.m6199(r5)
            boolean r1 = r6 instanceof p000.jb2
            wc r2 = r4.f11248
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof p000.kb2
            if (r1 == 0) goto L21
            goto L50
        L21:
            uy r1 = p000.AbstractC1016yc.f12565
            if (r6 == r1) goto L47
            uy r1 = p000.AbstractC1016yc.f12566
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            uy r1 = p000.AbstractC1016yc.f12562
            if (r6 == r1) goto L11
            uy r1 = p000.AbstractC1016yc.f12561
            if (r6 != r1) goto L33
            goto L11
        L33:
            uy r4 = p000.AbstractC1016yc.f12564
            if (r6 == r4) goto L6a
            uy r4 = p000.AbstractC1016yc.f12559
            if (r6 != r4) goto L3c
            goto L6a
        L3c:
            uy r4 = p000.AbstractC1016yc.f12567
            if (r6 != r4) goto L41
            goto L6a
        L41:
            java.lang.String r4 = "unexpected state: "
            p000.C1080.m7278(r6, r4)
            return
        L47:
            r4.m6201(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            uy r1 = p000.AbstractC1016yc.f12565
            goto L57
        L55:
            uy r1 = p000.AbstractC1016yc.f12566
        L57:
            boolean r6 = r4.m6198(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.m6201(r5, r3)
            r6 = r0 ^ 1
            r4.m6200(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
    }

    /* JADX INFO: renamed from: κ */
    public final boolean m6198(java.lang.Object r4, int r5, java.lang.Object r6) {
            r3 = this;
            int r5 = r5 * 2
            r0 = 1
            int r5 = r5 + r0
        L4:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.f11249
            boolean r2 = r1.compareAndSet(r5, r4, r6)
            if (r2 == 0) goto Ld
            return r0
        Ld:
            java.lang.Object r1 = r1.get(r5)
            if (r1 == r4) goto L4
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: λ */
    public final java.lang.Object m6199(int r1) {
            r0 = this;
            int r1 = r1 * 2
            int r1 = r1 + 1
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f11249
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public final void m6200(int r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L12
            wc r6 = r4.f11248
            r6.getClass()
            int r0 = p000.AbstractC1016yc.f12557
            long r0 = (long) r0
            long r2 = r4.f10004
            long r2 = r2 * r0
            long r0 = (long) r5
            long r2 = r2 + r0
            r6.m6360(r2)
        L12:
            r4.m5531()
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m6201(int r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r1 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f11249
            r0.set(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final void m6202(int r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r1 * 2
            int r1 = r1 + 1
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f11249
            r0.set(r1, r2)
            return
    }
}
