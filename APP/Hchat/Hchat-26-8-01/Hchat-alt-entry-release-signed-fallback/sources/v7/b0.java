package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends v7.g0 {
    @Override // v7.g0
    public final void L(u7.b r4) {
            r3 = this;
            k7.a r0 = r3.f14154l
            v7.d0 r0 = (v7.d0) r0
            v7.k0 r1 = r0.T()
            v7.k0 r2 = v7.k0.f14178u
            if (r1 != r2) goto Lf
            r0.U(r4)
        Lf:
            return
    }

    @Override // v7.g0
    public final void N() {
            r5 = this;
            v7.i0 r0 = r5.f14153k
            v7.e r0 = (v7.e) r0
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
            v7.d0 r0 = (v7.d0) r0
            r0.W()
            return
    }
}
