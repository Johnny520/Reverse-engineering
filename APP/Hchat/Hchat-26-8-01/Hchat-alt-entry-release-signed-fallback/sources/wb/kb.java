package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kb implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sh.x f17234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.z f17235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f17236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17239m;

    public /* synthetic */ kb(sh.x r1, r.z r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, int r7) {
            r0 = this;
            r0.f17233g = r7
            r0.f17234h = r1
            r0.f17235i = r2
            r0.f17236j = r3
            r0.f17237k = r4
            r0.f17238l = r5
            r0.f17239m = r6
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
            r12 = this;
            int r0 = r12.f17233g
            p.x0 r13 = (p.x0) r13
            r9 = r14
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r13.getClass()
            r15 = r14 & 6
            switch(r0) {
                case 0: goto L89;
                default: goto L15;
            }
        L15:
            if (r15 != 0) goto L21
            boolean r15 = r9.f(r13)
            if (r15 == 0) goto L1f
            r15 = 4
            goto L20
        L1f:
            r15 = 2
        L20:
            r14 = r14 | r15
        L21:
            r15 = r14 & 19
            r0 = 18
            r1 = 1
            if (r15 == r0) goto L2a
            r15 = r1
            goto L2b
        L2a:
            r15 = 0
        L2b:
            r14 = r14 & r1
            boolean r14 = r9.S(r14, r15)
            if (r14 == 0) goto L83
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f17234h
            m.a r15 = r15.f12897e
            r0 = 0
            y0.o r0 = r1.f.a(r14, r15, r0)
            float r14 = r13.c()
            r15 = 8
            float r15 = (float) r15
            float r14 = r14 + r15
            float r13 = r13.a()
            r15 = 84
            float r15 = (float) r15
            float r13 = r13 + r15
            r15 = 5
            p.z0 r2 = p.d.b(r14, r13, r15)
            android.content.SharedPreferences r4 = r12.f17236j
            boolean r13 = r9.h(r4)
            java.lang.Object r14 = r9.P()
            if (r13 != 0) goto L62
            i0.e r13 = i0.l.f5952a
            if (r14 != r13) goto L72
        L62:
            wb.ng r3 = new wb.ng
            r8 = 2
            i0.a1 r5 = r12.f17237k
            i0.a1 r6 = r12.f17238l
            i0.a1 r7 = r12.f17239m
            r3.<init>(r4, r5, r6, r7, r8)
            r9.k0(r3)
            r14 = r3
        L72:
            r8 = r14
            fg.l r8 = (fg.l) r8
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f17235i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L86
        L83:
            r9.V()
        L86:
            sf.n r13 = sf.n.f12433a
            return r13
        L89:
            if (r15 != 0) goto L95
            boolean r15 = r9.f(r13)
            if (r15 == 0) goto L93
            r15 = 4
            goto L94
        L93:
            r15 = 2
        L94:
            r14 = r14 | r15
        L95:
            r15 = r14 & 19
            r0 = 18
            r1 = 1
            if (r15 == r0) goto L9e
            r15 = r1
            goto L9f
        L9e:
            r15 = 0
        L9f:
            r14 = r14 & r1
            boolean r14 = r9.S(r14, r15)
            if (r14 == 0) goto Lf7
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f17234h
            m.a r15 = r15.f12897e
            r0 = 0
            y0.o r0 = r1.f.a(r14, r15, r0)
            float r14 = r13.c()
            r15 = 8
            float r15 = (float) r15
            float r14 = r14 + r15
            float r13 = r13.a()
            r15 = 84
            float r15 = (float) r15
            float r13 = r13 + r15
            r15 = 5
            p.z0 r2 = p.d.b(r14, r13, r15)
            android.content.SharedPreferences r4 = r12.f17236j
            boolean r13 = r9.h(r4)
            java.lang.Object r14 = r9.P()
            if (r13 != 0) goto Ld6
            i0.e r13 = i0.l.f5952a
            if (r14 != r13) goto Le6
        Ld6:
            wb.ng r3 = new wb.ng
            r8 = 1
            i0.a1 r5 = r12.f17237k
            i0.a1 r6 = r12.f17238l
            i0.a1 r7 = r12.f17239m
            r3.<init>(r4, r5, r6, r7, r8)
            r9.k0(r3)
            r14 = r3
        Le6:
            r8 = r14
            fg.l r8 = (fg.l) r8
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f17235i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lfa
        Lf7:
            r9.V()
        Lfa:
            sf.n r13 = sf.n.f12433a
            return r13
    }
}
