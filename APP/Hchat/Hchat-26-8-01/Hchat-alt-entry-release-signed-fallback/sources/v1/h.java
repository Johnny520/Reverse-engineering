package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements v1.m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v1.m0 f13942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Enum f13943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.Enum f13944j;

    public /* synthetic */ h(v1.m0 r1, java.lang.Enum r2, java.lang.Enum r3, int r4) {
            r0 = this;
            r0.f13941g = r4
            r0.f13942h = r1
            r0.f13943i = r2
            r0.f13944j = r3
            r0.<init>()
            return
    }

    @Override // v1.m0
    public final int G(int r2) {
            r1 = this;
            int r0 = r1.f13941g
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.G(r2)
            return r2
        Lc:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.G(r2)
            return r2
        L13:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.G(r2)
            return r2
    }

    @Override // v1.m0
    public final int M(int r2) {
            r1 = this;
            int r0 = r1.f13941g
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.M(r2)
            return r2
        Lc:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.M(r2)
            return r2
        L13:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.M(r2)
            return r2
    }

    @Override // v1.m0
    public final v1.b1 Q(long r7) {
            r6 = this;
            int r0 = r6.f13941g
            switch(r0) {
                case 0: goto Lb9;
                case 1: goto L5f;
                default: goto L5;
            }
        L5:
            java.lang.Enum r0 = r6.f13944j
            x1.l1 r0 = (x1.l1) r0
            java.lang.Enum r1 = r6.f13943i
            x1.k1 r1 = (x1.k1) r1
            x1.k1 r2 = x1.k1.f20975h
            r3 = 32767(0x7fff, float:4.5916E-41)
            v1.m0 r4 = r6.f13942h
            x1.l1 r5 = x1.l1.f20985g
            if (r0 != r5) goto L3b
            if (r1 != r2) goto L22
            int r0 = u2.a.g(r7)
            int r0 = r4.M(r0)
            goto L2a
        L22:
            int r0 = u2.a.g(r7)
            int r0 = r4.G(r0)
        L2a:
            boolean r1 = u2.a.c(r7)
            if (r1 == 0) goto L34
            int r3 = u2.a.g(r7)
        L34:
            v1.i r7 = new v1.i
            r8 = 2
            r7.<init>(r0, r3, r8)
            goto L5e
        L3b:
            if (r1 != r2) goto L46
            int r0 = u2.a.h(r7)
            int r0 = r4.j(r0)
            goto L4e
        L46:
            int r0 = u2.a.h(r7)
            int r0 = r4.p0(r0)
        L4e:
            boolean r1 = u2.a.d(r7)
            if (r1 == 0) goto L58
            int r3 = u2.a.h(r7)
        L58:
            v1.i r7 = new v1.i
            r8 = 2
            r7.<init>(r3, r0, r8)
        L5e:
            return r7
        L5f:
            java.lang.Enum r0 = r6.f13944j
            v1.r0 r0 = (v1.r0) r0
            java.lang.Enum r1 = r6.f13943i
            v1.q0 r1 = (v1.q0) r1
            v1.q0 r2 = v1.q0.f14019h
            r3 = 32767(0x7fff, float:4.5916E-41)
            v1.m0 r4 = r6.f13942h
            v1.r0 r5 = v1.r0.f14027g
            if (r0 != r5) goto L95
            if (r1 != r2) goto L7c
            int r0 = u2.a.g(r7)
            int r0 = r4.M(r0)
            goto L84
        L7c:
            int r0 = u2.a.g(r7)
            int r0 = r4.G(r0)
        L84:
            boolean r1 = u2.a.c(r7)
            if (r1 == 0) goto L8e
            int r3 = u2.a.g(r7)
        L8e:
            v1.i r7 = new v1.i
            r8 = 1
            r7.<init>(r0, r3, r8)
            goto Lb8
        L95:
            if (r1 != r2) goto La0
            int r0 = u2.a.h(r7)
            int r0 = r4.j(r0)
            goto La8
        La0:
            int r0 = u2.a.h(r7)
            int r0 = r4.p0(r0)
        La8:
            boolean r1 = u2.a.d(r7)
            if (r1 == 0) goto Lb2
            int r3 = u2.a.h(r7)
        Lb2:
            v1.i r7 = new v1.i
            r8 = 1
            r7.<init>(r3, r0, r8)
        Lb8:
            return r7
        Lb9:
            java.lang.Enum r0 = r6.f13944j
            v1.q r0 = (v1.q) r0
            java.lang.Enum r1 = r6.f13943i
            v1.p r1 = (v1.p) r1
            v1.p r2 = v1.p.f14010h
            r3 = 32767(0x7fff, float:4.5916E-41)
            v1.m0 r4 = r6.f13942h
            v1.q r5 = v1.q.f14015g
            if (r0 != r5) goto Lef
            if (r1 != r2) goto Ld6
            int r0 = u2.a.g(r7)
            int r0 = r4.M(r0)
            goto Lde
        Ld6:
            int r0 = u2.a.g(r7)
            int r0 = r4.G(r0)
        Lde:
            boolean r1 = u2.a.c(r7)
            if (r1 == 0) goto Le8
            int r3 = u2.a.g(r7)
        Le8:
            v1.i r7 = new v1.i
            r8 = 0
            r7.<init>(r0, r3, r8)
            goto L112
        Lef:
            if (r1 != r2) goto Lfa
            int r0 = u2.a.h(r7)
            int r0 = r4.j(r0)
            goto L102
        Lfa:
            int r0 = u2.a.h(r7)
            int r0 = r4.p0(r0)
        L102:
            boolean r1 = u2.a.d(r7)
            if (r1 == 0) goto L10c
            int r3 = u2.a.h(r7)
        L10c:
            v1.i r7 = new v1.i
            r8 = 0
            r7.<init>(r3, r0, r8)
        L112:
            return r7
    }

    @Override // v1.m0
    public final java.lang.Object X() {
            r1 = this;
            int r0 = r1.f13941g
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            v1.m0 r0 = r1.f13942h
            java.lang.Object r0 = r0.X()
            return r0
        Lc:
            v1.m0 r0 = r1.f13942h
            java.lang.Object r0 = r0.X()
            return r0
        L13:
            v1.m0 r0 = r1.f13942h
            java.lang.Object r0 = r0.X()
            return r0
    }

    @Override // v1.m0
    public final int j(int r2) {
            r1 = this;
            int r0 = r1.f13941g
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.j(r2)
            return r2
        Lc:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.j(r2)
            return r2
        L13:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.j(r2)
            return r2
    }

    @Override // v1.m0
    public final int p0(int r2) {
            r1 = this;
            int r0 = r1.f13941g
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.p0(r2)
            return r2
        Lc:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.p0(r2)
            return r2
        L13:
            v1.m0 r0 = r1.f13942h
            int r2 = r0.p0(r2)
            return r2
    }
}
