package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements r7.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r7.b f14157h;

    public /* synthetic */ h0(r7.b r1, int r2) {
            r0 = this;
            r0.f14156g = r2
            r0.f14157h = r1
            r0.<init>()
            return
    }

    @Override // r7.m
    public final k7.a d(java.lang.Class r3) {
            r2 = this;
            int r0 = r2.f14156g
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            r7.b r0 = r2.f14157h
            v7.j0 r0 = (v7.j0) r0
            boolean r1 = r3.isInstance(r0)
            if (r1 == 0) goto L10
            goto L14
        L10:
            k7.a r0 = r0.v(r3)
        L14:
            return r0
        L15:
            r7.b r0 = r2.f14157h
            v7.i0 r0 = (v7.i0) r0
            boolean r1 = r3.isInstance(r0)
            if (r1 == 0) goto L20
            goto L24
        L20:
            k7.a r0 = r0.v(r3)
        L24:
            return r0
    }

    @Override // r7.g
    public final int get() {
            r1 = this;
            int r0 = r1.f14156g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r7.b r0 = r1.f14157h
            v7.j0 r0 = (v7.j0) r0
            int r0 = r0.O()
            return r0
        Le:
            r7.b r0 = r1.f14157h
            v7.i0 r0 = (v7.i0) r0
            int r0 = r0.N()
            return r0
    }

    @Override // r7.g
    public final void k(int r5) {
            r4 = this;
            int r0 = r4.f14156g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            r7.b r0 = r4.f14157h
            v7.j0 r0 = (v7.j0) r0
            r0.X(r5)
            return
        Ld:
            r7.b r0 = r4.f14157h
            v7.i0 r0 = (v7.i0) r0
            byte[] r1 = r0.f11553k
            r2 = 2
            r3 = 3
            boolean r1 = k7.a.q(r1, r2, r3)
            byte[] r0 = r0.f11553k
            if (r1 == 0) goto L22
            r1 = 0
            k7.a.E(r0, r1, r5)
            goto L26
        L22:
            r1 = 4
            k7.a.D(r0, r1, r5)
        L26:
            return
    }
}
