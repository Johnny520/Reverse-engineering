package sg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends sg.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sg.a f12480q;

    public n(int r2, sg.a r3) {
            r1 = this;
            r1.<init>(r2)
            r1.f12480q = r3
            sg.a r0 = sg.a.f12436g
            if (r3 == r0) goto L1a
            r3 = 1
            if (r2 < r3) goto Ld
            return
        Ld:
            java.lang.String r3 = "Buffered channel capacity must be at least 1, but "
            java.lang.String r0 = " was specified"
            java.lang.String r2 = eh.a.m(r2, r3, r0)
            j8.o.q(r2)
            r2 = 0
            throw r2
        L1a:
            java.lang.Class<sg.c> r2 = sg.c.class
            gg.f r2 = gg.v.a(r2)
            java.lang.String r2 = r2.c()
            java.lang.String r3 = " instead"
            java.lang.String r0 = "This implementation does not support suspension for senders, use "
            okio.a.h(r2, r0, r3)
            r2 = 0
            throw r2
    }

    public final java.lang.Object F(java.lang.Object r16, boolean r17) {
            r15 = this;
            sg.a r1 = r15.f12480q
            sg.a r2 = sg.a.f12438i
            sf.n r8 = sf.n.f12433a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.p(r16)
            boolean r2 = r1 instanceof sg.i
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof sg.h
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            l3.q r6 = sg.e.f12457d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = sg.c.f12447l
            java.lang.Object r1 = r1.get(r15)
            sg.k r1 = (sg.k) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = sg.c.f12443h
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.t(r2, r7)
            int r9 = sg.e.f12455b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f14357c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            sg.k r2 = sg.c.b(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.o()
            sg.h r2 = new sg.h
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = sg.c.e(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb6
            r3 = 1
            if (r12 == r3) goto Lb5
            r3 = 2
            if (r12 == r3) goto L8f
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = sg.c.f12444i
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r1 = r15.o()
            sg.h r2 = new sg.h
            r2.<init>(r1)
            return r2
        L88:
            java.lang.String r1 = "unexpected"
            j8.o.A(r1)
            r1 = 0
            return r1
        L8f:
            if (r7 == 0) goto L9e
            r1.h()
            java.lang.Throwable r1 = r15.o()
            sg.h r2 = new sg.h
            r2.<init>(r1)
            return r2
        L9e:
            boolean r3 = r6 instanceof qg.o1
            if (r3 == 0) goto La5
            qg.o1 r6 = (qg.o1) r6
            goto La6
        La5:
            r6 = 0
        La6:
            if (r6 == 0) goto Lad
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lad:
            long r3 = r1.f14357c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.j(r3)
        Lb5:
            return r8
        Lb6:
            r1.a()
            return r8
    }

    @Override // sg.c, sg.p
    public final java.lang.Object p(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.F(r2, r0)
            return r2
    }

    @Override // sg.c, sg.p
    public final java.lang.Object q(java.lang.Object r1, wf.c r2) {
            r0 = this;
            r2 = 1
            java.lang.Object r1 = r0.F(r1, r2)
            boolean r1 = r1 instanceof sg.h
            if (r1 != 0) goto Lc
            sf.n r1 = sf.n.f12433a
            return r1
        Lc:
            java.lang.Throwable r1 = r0.o()
            throw r1
    }

    @Override // sg.c
    public final boolean v() {
            r2 = this;
            sg.a r0 = r2.f12480q
            sg.a r1 = sg.a.f12437h
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
