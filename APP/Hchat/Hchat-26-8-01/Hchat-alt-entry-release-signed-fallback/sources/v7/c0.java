package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends v7.g0 implements java.lang.Iterable {
    @Override // v7.g0
    public final void L(u7.b r5) {
            r4 = this;
            k7.a r0 = r4.f14154l
            j7.c r0 = (j7.c) r0
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            v7.e0 r1 = (v7.e0) r1
            v7.k0 r2 = r1.T()
            v7.k0 r3 = v7.k0.f14178u
            if (r2 != r3) goto La
            r1.U(r5)
            goto La
        L22:
            return
    }

    @Override // v7.g0
    public final void M(k7.a r2, v7.i0 r3) {
            r1 = this;
            j7.c r2 = (j7.c) r2
            v7.f r3 = (v7.f) r3
            byte[] r3 = r3.f11553k
            r0 = 12
            int r3 = k7.a.s(r3, r0)
            r2.c0(r3)
            return
    }

    @Override // v7.g0
    public final void N() {
            r5 = this;
            v7.i0 r0 = r5.f14153k
            v7.f r0 = (v7.f) r0
            v7.h0 r1 = r0.f14159m
            if (r1 != 0) goto L9
            goto L33
        L9:
            r2 = 0
            r0.f14159m = r2
            int r3 = r0.N()
            if (r3 >= 0) goto L13
            goto L2d
        L13:
            k7.a r0 = r0.f7389h
        L15:
            if (r0 == 0) goto L25
            boolean r4 = r0 instanceof l7.g
            if (r4 == 0) goto L22
            l7.g r0 = (l7.g) r0
            u7.c r0 = r0.a()
            goto L26
        L22:
            k7.a r0 = r0.f7389h
            goto L15
        L25:
            r0 = r2
        L26:
            if (r0 != 0) goto L29
            goto L2d
        L29:
            r7.s r2 = r0.V(r3)
        L2d:
            if (r2 != 0) goto L30
            goto L33
        L30:
            r2.a0(r1)
        L33:
            k7.a r0 = r5.f14154l
            j7.c r0 = (j7.c) r0
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
        L3d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            v7.e0 r1 = (v7.e0) r1
            r1.W()
            goto L3d
        L4d:
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            k7.a r0 = r1.f14154l
            j7.c r0 = (j7.c) r0
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // v7.g0
    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            v7.i0 r1 = r6.f14153k
            r0.append(r1)
            k7.a r1 = r6.f14154l
            j7.c r1 = (j7.c) r1
            z7.c r1 = r1.f9563k
            int r2 = r1.size()
            r3 = 4
            if (r2 <= r3) goto L18
            goto L19
        L18:
            r3 = r2
        L19:
            r4 = 0
        L1a:
            if (r4 >= r3) goto L2b
            java.lang.String r5 = "\n    "
            r0.append(r5)
            java.lang.Object[] r5 = r1.f22584g
            r5 = r5[r4]
            r0.append(r5)
            int r4 = r4 + 1
            goto L1a
        L2b:
            if (r2 <= 0) goto L39
            if (r3 == r2) goto L34
            java.lang.String r1 = "\n    ..."
            r0.append(r1)
        L34:
            java.lang.String r1 = "\n   "
            r0.append(r1)
        L39:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
