package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0.i f2955h;

    public /* synthetic */ f(f0.i r1, int r2) {
            r0 = this;
            r0.f2954g = r2
            r0.f2955h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f2954g
            switch(r0) {
                case 0: goto L67;
                case 1: goto L5c;
                case 2: goto L51;
                case 3: goto L47;
                case 4: goto L3f;
                case 5: goto L35;
                case 6: goto L21;
                default: goto L5;
            }
        L5:
            f0.i r0 = r3.f2955h
            w.q0 r1 = r0.f2962y
            d1.v r0 = r0.D
            boolean r2 = r1.b()
            if (r2 != 0) goto L15
            d1.v.a(r0)
            goto L1e
        L15:
            y1.g2 r0 = r1.f14602c
            if (r0 == 0) goto L1e
            y1.i1 r0 = (y1.i1) r0
            r0.b()
        L1e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L21:
            f0.i r0 = r3.f2955h
            w.q0 r1 = r0.f2962y
            w.w r1 = r1.f14622w
            n2.j r0 = r0.C
            int r0 = r0.f8957e
            w.q0 r1 = r1.f14689h
            b5.c r1 = r1.f14617r
            r1.M(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L35:
            f0.i r0 = r3.f2955h
            h0.d1 r0 = r0.B
            r0.p()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L3f:
            f0.i r0 = r3.f2955h
            x1.k.s(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L47:
            f0.i r0 = r3.f2955h
            h0.d1 r0 = r0.B
            r0.f()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L51:
            f0.i r0 = r3.f2955h
            h0.d1 r0 = r0.B
            r1 = 1
            r0.d(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L5c:
            f0.i r0 = r3.f2955h
            h0.d1 r0 = r0.B
            r1 = 1
            r0.h(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L67:
            f0.i r0 = r3.f2955h
            x1.k.s(r0)
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
