package j7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends k7.b implements q7.a, java.util.Comparator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r7.f f6772m;

    public b(r7.f r1) {
            r0 = this;
            r0.<init>()
            r0.f6772m = r1
            r1.f7391j = r0
            return
    }

    public static l7.f k0(z7.c r4, int r5) {
            r0 = 0
            if (r4 == 0) goto L4e
            int r1 = r4.size()
            if (r1 != 0) goto La
            goto L4e
        La:
            int r1 = r4.size()
            r2 = 1
            if (r1 != r2) goto L1b
            if (r5 != 0) goto L1b
            r5 = 0
            java.lang.Object[] r4 = r4.f22584g
            r4 = r4[r5]
            l7.f r4 = (l7.f) r4
            return r4
        L1b:
            java.util.Iterator r4 = r4.iterator()
        L1f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r4.next()
            l7.f r1 = (l7.f) r1
            if (r1 != 0) goto L2e
            goto L1f
        L2e:
            if (r5 == 0) goto L37
            int r2 = r1.U()
            if (r5 == r2) goto L37
            goto L1f
        L37:
            if (r0 != 0) goto L3a
            goto L4c
        L3a:
            p7.a r2 = r1.f7869m
            p7.f r2 = (p7.f) r2
            r7.f r2 = r2.f10270o
            int r2 = r2.f11560n
            p7.a r3 = r0.f7869m
            p7.f r3 = (p7.f) r3
            r7.f r3 = r3.f10270o
            int r3 = r3.f11560n
            if (r2 <= r3) goto L1f
        L4c:
            r0 = r1
            goto L1f
        L4e:
            return r0
    }

    @Override // o7.b
    public final void X() {
            r2 = this;
            z7.c r0 = r2.f9563k
            int r0 = r0.size()
            r7.f r1 = r2.f6772m
            r1.k(r0)
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            l7.f r1 = (l7.f) r1
            l7.f r2 = (l7.f) r2
            int r1 = r1.U()
            int r2 = r2.U()
            int r1 = java.lang.Integer.compare(r1, r2)
            return r1
    }

    @Override // q7.a
    public final void m(k7.a r2) {
            r1 = this;
            r7.f r0 = r1.f6772m
            if (r2 == r0) goto L5
            return
        L5:
            int r2 = r0.f11560n
            r1.c0(r2)
            return
    }

    @Override // k7.d
    public final k7.a n() {
            r1 = this;
            l7.f r0 = new l7.f
            r0.<init>()
            return r0
    }
}
