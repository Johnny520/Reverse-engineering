package j7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k7.b implements java.util.Comparator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f6773m;

    @Override // k7.b, k7.a
    public final void B(q7.b r3) {
            r2 = this;
        L0:
            r3.getClass()
            p7.b r0 = p7.b.T(r3)
            if (r0 != 0) goto La
            goto L36
        La:
            int r0 = r0.Q()
            r1 = 13
            if (r0 == r1) goto L13
            goto L36
        L13:
            p7.k r0 = p7.k.U(r3)
            byte r1 = r2.k0()
            if (r1 == 0) goto L26
            r7.c r0 = r0.f10298r
            int r0 = r0.get()
            if (r0 == r1) goto L26
            goto L36
        L26:
            int r0 = r3.f10666k
            k7.a r1 = r2.P()
            l7.m r1 = (l7.m) r1
            r1.G(r3)
            int r1 = r3.f10666k
            if (r1 <= r0) goto L36
            goto L0
        L36:
            return
    }

    @Override // o7.b
    public final void X() {
            r0 = this;
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            l7.m r1 = (l7.m) r1
            l7.m r2 = (l7.m) r2
            int r1 = r1.U(r2)
            return r1
    }

    public final byte k0() {
            r6 = this;
            java.lang.Class<o7.j> r0 = o7.j.class
            k7.a r1 = r6.u(r0)
            o7.j r1 = (o7.j) r1
            r2 = 0
            if (r1 == 0) goto Le
            l7.j r1 = r1.f9585l
            goto Lf
        Le:
            r1 = r2
        Lf:
            if (r1 == 0) goto L18
            byte r3 = r1.V()
            if (r3 == 0) goto L18
            return r3
        L18:
            byte r3 = r6.f6773m
            if (r3 == 0) goto L1d
            return r3
        L1d:
            z7.c r3 = r6.f9563k
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L76
            java.lang.Object r4 = r3.next()
            l7.m r4 = (l7.m) r4
            if (r4 != 0) goto L33
            goto L23
        L33:
            p7.a r4 = r4.f7869m
            p7.k r4 = (p7.k) r4
            r7.c r4 = r4.f10298r
            byte[] r4 = r4.f11553k
            r4 = r4[r5]
            if (r4 != 0) goto L40
            goto L23
        L40:
            if (r1 == 0) goto L73
            p7.a r3 = r1.f7869m
            p7.g r3 = (p7.g) r3
            r7.c r3 = r3.f10286r
            r3.P(r4)
            k7.a r0 = r1.u(r0)
            o7.j r0 = (o7.j) r0
            if (r0 == 0) goto L55
            j7.e r2 = r0.f9586m
        L55:
            r2.f6773m = r4
            z7.c r0 = r2.f9563k
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L73
            java.lang.Object r1 = r0.next()
            l7.m r1 = (l7.m) r1
            p7.a r1 = r1.f7869m
            p7.k r1 = (p7.k) r1
            r7.c r1 = r1.f10298r
            r1.P(r4)
            goto L5d
        L73:
            r6.f6773m = r4
            return r4
        L76:
            return r5
    }

    @Override // k7.d
    public final k7.a n() {
            r3 = this;
            byte r0 = r3.k0()
            l7.m r1 = new l7.m
            r1.<init>()
            p7.a r2 = r1.f7869m
            p7.k r2 = (p7.k) r2
            r7.c r2 = r2.f10298r
            r2.P(r0)
            return r1
    }
}
