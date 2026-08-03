package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements tg.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4933i;

    public /* synthetic */ l0(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f4931g = r2
            r0.f4932h = r1
            r0.f4933i = r3
            r0.<init>()
            return
    }

    public l0(tg.c r1, gg.u r2, tg.e r3) {
            r0 = this;
            r1 = 1
            r0.f4931g = r1
            r0.<init>()
            r0.f4932h = r2
            r0.f4933i = r3
            return
    }

    @Override // tg.e
    public final java.lang.Object e(java.lang.Object r12, wf.c r13) {
            r11 = this;
            int r0 = r11.f4931g
            switch(r0) {
                case 0: goto L135;
                case 1: goto Le2;
                case 2: goto L83;
                default: goto L5;
            }
        L5:
            n.j r12 = (n.j) r12
            java.lang.Object r13 = r11.f4933i
            w.r0 r13 = (w.r0) r13
            java.lang.Object r0 = r11.f4932h
            f.f0 r0 = (f.f0) r0
            boolean r1 = r12 instanceof n.h
            if (r1 != 0) goto L4c
            boolean r1 = r12 instanceof n.f
            if (r1 != 0) goto L4c
            boolean r1 = r12 instanceof n.m
            if (r1 == 0) goto L1c
            goto L4c
        L1c:
            boolean r1 = r12 instanceof n.i
            if (r1 == 0) goto L28
            n.i r12 = (n.i) r12
            n.h r12 = r12.f8910a
            r0.j(r12)
            goto L4f
        L28:
            boolean r1 = r12 instanceof n.g
            if (r1 == 0) goto L34
            n.g r12 = (n.g) r12
            n.f r12 = r12.f8909a
            r0.j(r12)
            goto L4f
        L34:
            boolean r1 = r12 instanceof n.n
            if (r1 == 0) goto L40
            n.n r12 = (n.n) r12
            n.m r12 = r12.f8913a
            r0.j(r12)
            goto L4f
        L40:
            boolean r1 = r12 instanceof n.l
            if (r1 == 0) goto L4f
            n.l r12 = (n.l) r12
            n.m r12 = r12.f8912a
            r0.j(r12)
            goto L4f
        L4c:
            r0.a(r12)
        L4f:
            java.lang.Object[] r12 = r0.f2803a
            int r0 = r0.f2804b
            r1 = 0
            r2 = r1
        L55:
            if (r1 >= r0) goto L7b
            r3 = r12[r1]
            n.j r3 = (n.j) r3
            boolean r4 = r3 instanceof n.h
            if (r4 == 0) goto L65
            r13.getClass()
            r2 = r2 | 2
            goto L78
        L65:
            boolean r4 = r3 instanceof n.f
            if (r4 == 0) goto L6f
            r13.getClass()
            r2 = r2 | 1
            goto L78
        L6f:
            boolean r3 = r3 instanceof n.m
            if (r3 == 0) goto L78
            r13.getClass()
            r2 = r2 | 4
        L78:
            int r1 = r1 + 1
            goto L55
        L7b:
            i0.g1 r12 = r13.f14636b
            r12.h(r2)
            sf.n r12 = sf.n.f12433a
            return r12
        L83:
            boolean r0 = r13 instanceof tg.j
            if (r0 == 0) goto L96
            r0 = r13
            tg.j r0 = (tg.j) r0
            int r1 = r0.f13212i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L96
            int r1 = r1 - r2
            r0.f13212i = r1
            goto L9b
        L96:
            tg.j r0 = new tg.j
            r0.<init>(r11, r13)
        L9b:
            java.lang.Object r13 = r0.f13211h
            int r1 = r0.f13212i
            r2 = 1
            if (r1 == 0) goto Lb3
            if (r1 != r2) goto Lac
            java.lang.Object r12 = r0.f13214k
            h0.l0 r0 = r0.f13210g
            f8.i.I0(r13)
            goto Lcb
        Lac:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r12 = 0
            goto Ld5
        Lb3:
            f8.i.I0(r13)
            java.lang.Object r13 = r11.f4932h
            fg.p r13 = (fg.p) r13
            r0.f13210g = r11
            r0.f13214k = r12
            r0.f13212i = r2
            java.lang.Object r13 = r13.invoke(r12, r0)
            xf.a r0 = xf.a.f21579g
            if (r13 != r0) goto Lca
            r12 = r0
            goto Ld5
        Lca:
            r0 = r11
        Lcb:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto Ld6
            sf.n r12 = sf.n.f12433a
        Ld5:
            return r12
        Ld6:
            java.lang.Object r13 = r0.f4933i
            gg.u r13 = (gg.u) r13
            r13.f4564g = r12
            ug.a r12 = new ug.a
            r12.<init>(r0)
            throw r12
        Le2:
            java.lang.Object r0 = r11.f4932h
            gg.u r0 = (gg.u) r0
            boolean r1 = r13 instanceof tg.b
            if (r1 == 0) goto Lf9
            r1 = r13
            tg.b r1 = (tg.b) r1
            int r2 = r1.f13189i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto Lf9
            int r2 = r2 - r3
            r1.f13189i = r2
            goto Lfe
        Lf9:
            tg.b r1 = new tg.b
            r1.<init>(r11, r13)
        Lfe:
            java.lang.Object r13 = r1.f13187g
            int r2 = r1.f13189i
            sf.n r3 = sf.n.f12433a
            r4 = 1
            if (r2 == 0) goto L114
            if (r2 != r4) goto L10d
            f8.i.I0(r13)
            goto L134
        L10d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r3 = 0
            goto L134
        L114:
            f8.i.I0(r13)
            java.lang.Object r13 = r0.f4564g
            l3.q r2 = ug.c.f13807b
            if (r13 == r2) goto L123
            boolean r13 = gg.l.a(r13, r12)
            if (r13 != 0) goto L134
        L123:
            r0.f4564g = r12
            java.lang.Object r13 = r11.f4933i
            tg.e r13 = (tg.e) r13
            r1.f13189i = r4
            java.lang.Object r12 = r13.e(r12, r1)
            xf.a r13 = xf.a.f21579g
            if (r12 != r13) goto L134
            r3 = r13
        L134:
            return r3
        L135:
            e1.b r12 = (e1.b) r12
            long r2 = r12.f2294a
            java.lang.Object r12 = r11.f4932h
            r1 = r12
            i.c r1 = (i.c) r1
            java.lang.Object r12 = r1.d()
            e1.b r12 = (e1.b) r12
            long r4 = r12.f2294a
            r6 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r4 = r4 & r6
            r8 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            sf.n r10 = sf.n.f12433a
            if (r12 == 0) goto L18c
            long r4 = r2 & r6
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 == 0) goto L18c
            java.lang.Object r12 = r1.d()
            e1.b r12 = (e1.b) r12
            long r4 = r12.f2294a
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r12 = (int) r4
            float r12 = java.lang.Float.intBitsToFloat(r12)
            long r4 = r2 & r6
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 != 0) goto L17c
            goto L18c
        L17c:
            java.lang.Object r12 = r11.f4933i
            qg.t r12 = (qg.t) r12
            h0.k0 r0 = new h0.k0
            r5 = 0
            r4 = 0
            r0.<init>(r1, r2, r4, r5)
            r13 = 3
            qg.v.q(r12, r4, r0, r13)
            goto L19a
        L18c:
            e1.b r12 = new e1.b
            r12.<init>(r2)
            java.lang.Object r12 = r1.e(r12, r13)
            xf.a r13 = xf.a.f21579g
            if (r12 != r13) goto L19a
            r10 = r12
        L19a:
            return r10
    }
}
