package sg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends vg.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sg.c f12478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f12479f;

    public k(long r1, sg.k r3, sg.c r4, int r5) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            r0.f12478e = r4
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = sg.e.f12455b
            int r2 = r2 * 2
            r1.<init>(r2)
            r0.f12479f = r1
            return
    }

    @Override // vg.q
    public final int f() {
            r1 = this;
            int r0 = sg.e.f12455b
            return r0
    }

    @Override // vg.q
    public final void g(int r5, wf.g r6) {
            r4 = this;
            int r6 = sg.e.f12455b
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
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f12479f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.k(r5)
            boolean r1 = r6 instanceof qg.o1
            sg.c r2 = r4.f12478e
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof sg.q
            if (r1 == 0) goto L21
            goto L50
        L21:
            l3.q r1 = sg.e.f12463j
            if (r6 == r1) goto L47
            l3.q r1 = sg.e.f12464k
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            l3.q r1 = sg.e.f12460g
            if (r6 == r1) goto L11
            l3.q r1 = sg.e.f12459f
            if (r6 != r1) goto L33
            goto L11
        L33:
            l3.q r5 = sg.e.f12462i
            if (r6 == r5) goto L6a
            l3.q r5 = sg.e.f12457d
            if (r6 != r5) goto L3c
            goto L6a
        L3c:
            l3.q r5 = sg.e.f12465l
            if (r6 != r5) goto L41
            goto L6a
        L41:
            java.lang.String r5 = "unexpected state: "
            okio.a.p(r6, r5)
            return
        L47:
            r4.m(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            l3.q r1 = sg.e.f12463j
            goto L57
        L55:
            l3.q r1 = sg.e.f12464k
        L57:
            boolean r6 = r4.j(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.m(r5, r3)
            r6 = r0 ^ 1
            r4.l(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
    }

    public final boolean j(java.lang.Object r4, int r5, java.lang.Object r6) {
            r3 = this;
            int r5 = r5 * 2
            r0 = 1
            int r5 = r5 + r0
        L4:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.f12479f
            boolean r2 = r1.compareAndSet(r5, r4, r6)
            if (r2 == 0) goto Ld
            return r0
        Ld:
            java.lang.Object r1 = r1.get(r5)
            if (r1 == r4) goto L4
            r4 = 0
            return r4
    }

    public final java.lang.Object k(int r2) {
            r1 = this;
            int r2 = r2 * 2
            int r2 = r2 + 1
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f12479f
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public final void l(int r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L12
            sg.c r6 = r4.f12478e
            r6.getClass()
            int r0 = sg.e.f12455b
            long r0 = (long) r0
            long r2 = r4.f14357c
            long r2 = r2 * r0
            long r0 = (long) r5
            long r2 = r2 + r0
            r6.E(r2)
        L12:
            r4.h()
            return
    }

    public final void m(int r2, java.lang.Object r3) {
            r1 = this;
            int r2 = r2 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f12479f
            r0.set(r2, r3)
            return
    }

    public final void n(int r2, java.lang.Object r3) {
            r1 = this;
            int r2 = r2 * 2
            int r2 = r2 + 1
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f12479f
            r0.set(r2, r3)
            return
    }
}
