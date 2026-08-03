package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2662i;

    public /* synthetic */ u(long r1, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f2660g = r4
            r0.f2661h = r1
            r0.f2662i = r3
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f2660g
            switch(r0) {
                case 0: goto La8;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f2662i
            r1 = r0
            y0.o r1 = (y0.o) r1
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0 = r11 & 3
            r2 = 2
            r7 = 1
            r8 = 0
            if (r0 == r2) goto L1b
            r0 = r7
            goto L1c
        L1b:
            r0 = r8
        L1c:
            r11 = r11 & r7
            boolean r11 = r10.S(r11, r0)
            if (r11 == 0) goto La2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r4 = r9.f2661h
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 == 0) goto L95
            r11 = -1244013944(0xffffffffb5d9da88, float:-1.6231361E-6)
            r10.a0(r11)
            float r2 = u2.h.b(r4)
            float r3 = u2.h.a(r4)
            r5 = 0
            r6 = 12
            r4 = 0
            y0.o r11 = p.h1.i(r1, r2, r3, r4, r5, r6)
            y0.g r0 = y0.b.f21793h
            v1.n0 r0 = p.o.d(r0, r8)
            long r1 = r10.T
            int r1 = java.lang.Long.hashCode(r1)
            s0.h r2 = r10.l()
            y0.o r11 = y0.a.c(r10, r11)
            x1.f r3 = x1.g.f20914f
            r3.getClass()
            x1.y r3 = x1.f.f20883b
            r10.d0()
            boolean r4 = r10.S
            if (r4 == 0) goto L6a
            r10.k(r3)
            goto L6d
        L6a:
            r10.n0()
        L6d:
            x1.e r3 = x1.f.f20886e
            i0.r.A(r3, r10, r0)
            x1.e r0 = x1.f.f20885d
            i0.r.A(r0, r10, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            x1.e r1 = x1.f.f20887f
            i0.r.A(r1, r10, r0)
            x1.d r0 = x1.f.f20888g
            i0.r.w(r0, r10)
            x1.e r0 = x1.f.f20884c
            i0.r.A(r0, r10, r11)
            r11 = 0
            w.b.b(r11, r10, r8, r7)
            r10.p(r7)
            r10.p(r8)
            goto La5
        L95:
            r11 = -1243644858(0xffffffffb5df7c46, float:-1.6650963E-6)
            r10.a0(r11)
            w.b.b(r1, r10, r8, r8)
            r10.p(r8)
            goto La5
        La2:
            r10.V()
        La5:
            sf.n r10 = sf.n.f12433a
            return r10
        La8:
            java.lang.Object r0 = r9.f2662i
            gg.q r0 = (gg.q) r0
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Long r11 = (java.lang.Long) r11
            long r1 = r9.f2661h
            java.lang.Long r10 = h.Hchat.hooks.items.script.ScriptPluginRuntime.p(r1, r0, r10, r11)
            return r10
    }
}
