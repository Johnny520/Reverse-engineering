package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xe implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sh.x f20147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.z f20148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f20149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20150k;

    public /* synthetic */ xe(sh.x r1, r.z r2, android.content.SharedPreferences r3, i0.a1 r4, int r5) {
            r0 = this;
            r0.f20146g = r5
            r0.f20147h = r1
            r0.f20148i = r2
            r0.f20149j = r3
            r0.f20150k = r4
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
            r12 = this;
            int r0 = r12.f20146g
            p.x0 r13 = (p.x0) r13
            r9 = r14
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r13.getClass()
            r15 = r14 & 6
            switch(r0) {
                case 0: goto Lf5;
                case 1: goto L85;
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
            if (r14 == 0) goto L7f
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f20147h
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
            android.content.SharedPreferences r13 = r12.f20149j
            boolean r14 = r9.h(r13)
            java.lang.Object r15 = r9.P()
            if (r14 != 0) goto L62
            i0.e r14 = i0.l.f5952a
            if (r15 != r14) goto L6e
        L62:
            wb.di r15 = new wb.di
            r14 = 15
            i0.a1 r1 = r12.f20150k
            r15.<init>(r13, r1, r14)
            r9.k0(r15)
        L6e:
            r8 = r15
            fg.l r8 = (fg.l) r8
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f20148i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L82
        L7f:
            r9.V()
        L82:
            sf.n r13 = sf.n.f12433a
            return r13
        L85:
            if (r15 != 0) goto L91
            boolean r15 = r9.f(r13)
            if (r15 == 0) goto L8f
            r15 = 4
            goto L90
        L8f:
            r15 = 2
        L90:
            r14 = r14 | r15
        L91:
            r15 = r14 & 19
            r0 = 18
            r1 = 1
            if (r15 == r0) goto L9a
            r15 = r1
            goto L9b
        L9a:
            r15 = 0
        L9b:
            r14 = r14 & r1
            boolean r14 = r9.S(r14, r15)
            if (r14 == 0) goto Lef
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f20147h
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
            android.content.SharedPreferences r13 = r12.f20149j
            boolean r14 = r9.h(r13)
            java.lang.Object r15 = r9.P()
            if (r14 != 0) goto Ld2
            i0.e r14 = i0.l.f5952a
            if (r15 != r14) goto Lde
        Ld2:
            wb.di r15 = new wb.di
            r14 = 12
            i0.a1 r1 = r12.f20150k
            r15.<init>(r13, r1, r14)
            r9.k0(r15)
        Lde:
            r8 = r15
            fg.l r8 = (fg.l) r8
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f20148i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lf2
        Lef:
            r9.V()
        Lf2:
            sf.n r13 = sf.n.f12433a
            return r13
        Lf5:
            if (r15 != 0) goto L101
            boolean r15 = r9.f(r13)
            if (r15 == 0) goto Lff
            r15 = 4
            goto L100
        Lff:
            r15 = 2
        L100:
            r14 = r14 | r15
        L101:
            r15 = r14 & 19
            r0 = 18
            r1 = 1
            if (r15 == r0) goto L10a
            r15 = r1
            goto L10b
        L10a:
            r15 = 0
        L10b:
            r14 = r14 & r1
            boolean r14 = r9.S(r14, r15)
            if (r14 == 0) goto L15f
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f20147h
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
            android.content.SharedPreferences r13 = r12.f20149j
            boolean r14 = r9.h(r13)
            java.lang.Object r15 = r9.P()
            if (r14 != 0) goto L142
            i0.e r14 = i0.l.f5952a
            if (r15 != r14) goto L14e
        L142:
            wb.di r15 = new wb.di
            r14 = 10
            i0.a1 r1 = r12.f20150k
            r15.<init>(r13, r1, r14)
            r9.k0(r15)
        L14e:
            r8 = r15
            fg.l r8 = (fg.l) r8
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f20148i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L162
        L15f:
            r9.V()
        L162:
            sf.n r13 = sf.n.f12433a
            return r13
    }
}
