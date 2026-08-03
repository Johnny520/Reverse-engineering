package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w.q0 f14689h;

    public /* synthetic */ w(w.q0 r1, int r2) {
            r0 = this;
            r0.f14688g = r2
            r0.f14689h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f14688g
            switch(r0) {
                case 0: goto L85;
                case 1: goto L33;
                case 2: goto L25;
                case 3: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            w.q0 r0 = r5.f14689h
            i0.j1 r0 = r0.f14616q
            r0.setValue(r6)
            sf.n r6 = sf.n.f12433a
            return r6
        L14:
            n2.i r6 = (n2.i) r6
            w.q0 r0 = r5.f14689h
            b5.c r0 = r0.f14617r
            int r6 = r6.f8951a
            boolean r6 = r0.M(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L25:
            n2.i r6 = (n2.i) r6
            w.q0 r0 = r5.f14689h
            b5.c r0 = r0.f14617r
            int r6 = r6.f8951a
            r0.M(r6)
            sf.n r6 = sf.n.f12433a
            return r6
        L33:
            w.q0 r0 = r5.f14689h
            i0.j1 r1 = r0.f14619t
            n2.s r6 = (n2.s) r6
            i2.g r2 = r6.f8976a
            java.lang.String r2 = r2.f6314h
            i2.g r3 = r0.f14609j
            r4 = 0
            if (r3 == 0) goto L45
            java.lang.String r3 = r3.f6314h
            goto L46
        L45:
            r3 = r4
        L46:
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L6c
            w.h0 r2 = w.h0.f14484g
            i0.j1 r3 = r0.f14610k
            r3.setValue(r2)
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L65
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            goto L6c
        L65:
            i0.j1 r1 = r0.f14618s
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
        L6c:
            long r1 = i2.m0.f6358b
            r0.f(r1)
            r0.e(r1)
            fg.l r1 = r0.f14620u
            r1.invoke(r6)
            i0.r1 r6 = r0.f14601b
            i0.q r0 = r6.f6032a
            if (r0 == 0) goto L82
            r0.s(r6, r4)
        L82:
            sf.n r6 = sf.n.f12433a
            return r6
        L85:
            v1.t r6 = (v1.t) r6
            w.q0 r0 = r5.f14689h
            w.m1 r0 = r0.d()
            if (r0 == 0) goto L91
            r0.f14571c = r6
        L91:
            sf.n r6 = sf.n.f12433a
            return r6
    }
}
