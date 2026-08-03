package a1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f24g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f25h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f26i;

    public /* synthetic */ g(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f24g = r2
            r0.f25h = r1
            r0.f26i = r3
            r1 = 2
            r0.<init>(r1)
            return
    }

    public g(y0.o r1, fg.p r2, int r3) {
            r0 = this;
            r3 = 2
            r0.f24g = r3
            r0.f25h = r1
            r0.f26i = r2
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f24g
            r1 = 0
            r2 = 1
            sf.n r3 = sf.n.f12433a
            java.lang.Object r4 = r7.f26i
            java.lang.Object r5 = r7.f25h
            switch(r0) {
                case 0: goto Ld3;
                case 1: goto L4d;
                case 2: goto L3a;
                default: goto Ld;
            }
        Ld:
            f1.u r8 = (f1.u) r8
            i1.b r9 = (i1.b) r9
            x1.i1 r5 = (x1.i1) r5
            x1.f0 r0 = r5.f20943u
            boolean r6 = r0.H()
            if (r6 == 0) goto L37
            r5.N = r8
            r5.M = r9
            x1.r1 r8 = x1.i0.a(r0)
            y1.t r8 = (y1.t) r8
            x1.t1 r8 = r8.getSnapshotObserver()
            f1.o0 r9 = x1.i1.T
            x1.d r9 = x1.d.f20857j
            x1.f1 r4 = (x1.f1) r4
            w0.s r8 = r8.f21066a
            r8.c(r5, r9, r4)
            r5.Q = r1
            goto L39
        L37:
            r5.Q = r2
        L39:
            return r3
        L3a:
            i0.h0 r8 = (i0.h0) r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            y0.o r5 = (y0.o) r5
            fg.p r4 = (fg.p) r4
            int r9 = i0.r.C(r2)
            v1.w.b(r5, r4, r8, r9)
            return r3
        L4d:
            i0.h0 r8 = (i0.h0) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0 = r9 & 3
            r6 = 2
            if (r0 == r6) goto L5c
            r0 = r2
            goto L5d
        L5c:
            r0 = r1
        L5d:
            r9 = r9 & r2
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto Lcf
            v1.b0 r5 = (v1.b0) r5
            i0.j1 r9 = r5.f13898g
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            fg.p r4 = (fg.p) r4
            r8.c0(r9)
            boolean r9 = r8.g(r0)
            if (r0 == 0) goto L85
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r4.invoke(r8, r9)
            goto Lba
        L85:
            int r0 = r8.f5905l
            if (r0 != 0) goto L8a
            goto L8f
        L8a:
            java.lang.String r0 = "No nodes can be emitted before calling deactivateToEndGroup"
            i0.m.a(r0)
        L8f:
            boolean r0 = r8.S
            if (r0 != 0) goto Lba
            if (r9 != 0) goto L99
            r8.U()
            goto Lba
        L99:
            l0.g r9 = r8.G
            int r0 = r9.f7672g
            int r9 = r9.f7673h
            m0.b r2 = r8.M
            r2.getClass()
            r2.d(r1)
            m0.a r2 = r2.f8440b
            m0.l0 r2 = r2.f8437j
            m0.i r4 = m0.i.f8465c
            r2.U(r4)
            java.util.ArrayList r2 = r8.f5912s
            i0.r.k(r2, r0, r9)
            l0.g r9 = r8.G
            r9.t()
        Lba:
            boolean r9 = r8.f5918y
            if (r9 == 0) goto Lcb
            l0.g r9 = r8.G
            int r9 = r9.f7674i
            int r0 = r8.f5919z
            if (r9 != r0) goto Lcb
            r9 = -1
            r8.f5919z = r9
            r8.f5918y = r1
        Lcb:
            r8.p(r1)
            goto Ld2
        Lcf:
            r8.V()
        Ld2:
            return r3
        Ld3:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            f2.q r9 = (f2.q) r9
            a1.i r4 = (a1.i) r4
            y1.f2 r5 = (y1.f2) r5
            f.x r0 = r5.f21912b
            int r1 = r9.f3215f
            boolean r0 = r0.b(r1)
            if (r0 != 0) goto Lf1
            r4.m(r8, r9)
            sg.c r8 = r4.f36n
            r8.p(r3)
        Lf1:
            return r3
    }
}
