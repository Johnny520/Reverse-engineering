package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l7.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f8743s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u7.a f8744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m7.n f8745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d7.b f8746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l7.f f8747r;

    public g() {
            r5 = this;
            p7.a r0 = new p7.a
            r1 = 3
            r0.<init>(r1)
            r5.<init>(r0, r1)
            u7.a r0 = new u7.a
            okio.a r1 = new okio.a
            r2 = 16
            r1.<init>(r2)
            r2 = 1
            r3 = 0
            r0.<init>(r2, r3, r1)
            r5.f8744o = r0
            m7.n r1 = new m7.n
            r1.<init>()
            r5.f8745p = r1
            d7.b r2 = new d7.b
            r3 = 0
            r4 = 2
            r2.<init>(r3, r4)
            r5.f8746q = r2
            r5.P(r0)
            r5.P(r1)
            r5.P(r2)
            return
    }

    @Override // l7.a, k7.c, k7.a
    public final void B(q7.b r11) {
            r10 = this;
            r11.getClass()
            p7.b r0 = p7.b.T(r11)
            if (r0 == 0) goto L14a
            r7.f r1 = r0.f10270o
            int r1 = r1.f11560n
            if (r1 < 0) goto L140
            int r2 = r11.available()
            if (r1 > r2) goto L127
            r7.a r2 = r0.f10269n
            int r2 = r2.f11551o
            if (r1 < r2) goto L121
            q7.b r0 = r11.a(r1)
            p7.a r1 = r10.f7869m
            r1.G(r0)
            r7.a r2 = r1.f10268m
            r3 = 3
            r2.k(r3)
            m7.f r2 = r10.U()
            d7.b r2 = r2.R()
            r2.N()
        L35:
            boolean r2 = r0.b()
            if (r2 == 0) goto L113
            boolean r2 = r0.b()
            r3 = 0
            if (r2 != 0) goto L44
            goto L111
        L44:
            int r2 = r0.f10666k
            p7.b r4 = p7.b.T(r0)
            if (r4 != 0) goto L4e
            goto L111
        L4e:
            int r5 = r4.Q()
            r6 = 2
            r7 = 1
            if (r5 != r6) goto L63
            u7.a r6 = r10.f8744o
            int r8 = r6.size()
            if (r8 != 0) goto L63
            r6.G(r0)
            goto Le6
        L63:
            r6 = 11
            if (r5 != r6) goto L77
            m7.n r6 = r10.f8745p
            s7.f r8 = r6.f8757o
            z7.c r8 = r8.f9563k
            int r8 = r8.size()
            if (r8 != 0) goto L77
            r6.G(r0)
            goto Le6
        L77:
            r6 = 9
            if (r5 != r6) goto L9d
            m7.f r2 = r10.U()
            r2.getClass()
            m7.x r3 = new m7.x
            m7.w r4 = new m7.w
            r4.<init>()
            r5 = 0
            r3.<init>(r4, r5)
            d7.b r2 = r2.R()
            r2.M(r3)
            r3.G(r0)
            boolean r3 = r0.b()
            goto L111
        L9d:
            r6 = 4
            if (r5 != r6) goto Lbb
            m7.f r2 = r10.U()
            r2.getClass()
            m7.f r3 = new m7.f
            r3.<init>()
            d7.b r2 = r2.R()
            r2.M(r3)
            r3.G(r0)
            boolean r3 = r0.b()
            goto L111
        Lbb:
            r6 = 7
            if (r5 == r6) goto Lf2
            r6 = 5
            if (r5 != r6) goto Lc2
            goto Lf2
        Lc2:
            boolean r6 = m7.g.f8743s
            if (r6 != 0) goto Ldb
            m7.g.f8743s = r7
            java.io.PrintStream r6 = java.lang.System.err
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Read unknown chunk: "
            r8.<init>(r9)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r6.println(r4)
        Ldb:
            m7.f r4 = r10.U()
            m7.x r4 = r4.T(r5)
            r4.G(r0)
        Le6:
            boolean r4 = r0.b()
            if (r4 == 0) goto L111
            int r4 = r0.f10666k
            if (r2 == r4) goto L111
            r3 = r7
            goto L111
        Lf2:
            m7.f r2 = r10.U()
            r2.getClass()
            m7.j r3 = new m7.j
            m7.k r4 = new m7.k
            r4.<init>()
            r3.<init>(r4)
            d7.b r2 = r2.R()
            r2.M(r3)
            r3.G(r0)
            boolean r3 = r0.b()
        L111:
            if (r3 != 0) goto L35
        L113:
            r7.f r1 = r1.f10270o
            int r1 = r1.f11560n
            r11.c(r1)
            r0.close()
            r10.R()
            return
        L121:
            java.lang.String r11 = "Higher header size: "
            j8.o.j(r0, r11)
            return
        L127:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Higher chunk size: "
            java.lang.String r3 = ", available = "
            java.lang.StringBuilder r1 = eh.a.t(r1, r2, r3)
            int r11 = r11.available()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L140:
            java.lang.String r11 = "Negative chunk size: "
            java.lang.String r11 = eh.a.l(r1, r11)
            j8.o.y(r11)
            return
        L14a:
            java.lang.String r0 = "Not bin xml: "
            j8.o.j(r11, r0)
            return
    }

    @Override // k7.c
    public final void M() {
            r4 = this;
            m7.f r0 = r4.U()
            ce.n r1 = new ce.n
            r2 = 17
            r1.<init>(r2)
            r0.getClass()
            be.i r2 = new be.i
            r3 = 16
            r2.<init>(r1, r3)
            d7.b r0 = r0.R()
            r0.removeIf(r2)
            d7.b r0 = r4.f8746q
            r0.c()
            return
    }

    @Override // l7.a
    public final void R() {
            r1 = this;
            m7.f r0 = r1.U()
            r0.M()
            return
    }

    @Override // l7.a
    public final void S() {
            r0 = this;
            return
    }

    public final m7.f U() {
            r1 = this;
            java.lang.Class<m7.f> r0 = m7.f.class
            k7.a r0 = r1.v(r0)
            m7.f r0 = (m7.f) r0
            return r0
    }

    @Override // k7.c, k7.a
    public final byte[] r() {
            r2 = this;
            x7.b r0 = new x7.b
            p7.a r1 = r2.f7869m
            r7.f r1 = r1.f10270o
            int r1 = r1.f11560n
            r0.<init>(r1)
            r2.K(r0)     // Catch: java.io.IOException -> L11
            r0.close()     // Catch: java.io.IOException -> L11
        L11:
            byte[] r0 = r0.toByteArray()
            return r0
    }
}
