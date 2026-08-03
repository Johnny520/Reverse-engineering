package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ll implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sh.x f17523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.z f17524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ fg.p f17527l;

    public /* synthetic */ ll(sh.x r1, r.z r2, java.util.List r3, java.util.List r4, fg.p r5, int r6) {
            r0 = this;
            r0.f17522g = r6
            r0.f17523h = r1
            r0.f17524i = r2
            r0.f17525j = r3
            r0.f17526k = r4
            r0.f17527l = r5
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
            r12 = this;
            int r0 = r12.f17522g
            p.x0 r13 = (p.x0) r13
            r9 = r14
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r13.getClass()
            r15 = r14 & 6
            switch(r0) {
                case 0: goto L90;
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
            if (r14 == 0) goto L8a
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f17523h
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
            java.util.List r13 = r12.f17525j
            boolean r14 = r9.h(r13)
            java.util.List r15 = r12.f17526k
            boolean r1 = r9.h(r15)
            r14 = r14 | r1
            fg.p r1 = r12.f17527l
            boolean r3 = r9.f(r1)
            r14 = r14 | r3
            java.lang.Object r3 = r9.P()
            if (r14 != 0) goto L70
            i0.e r14 = i0.l.f5952a
            if (r3 != r14) goto L79
        L70:
            wb.a9 r3 = new wb.a9
            r14 = 1
            r3.<init>(r13, r15, r1, r14)
            r9.k0(r3)
        L79:
            r8 = r3
            fg.l r8 = (fg.l) r8
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f17524i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L8d
        L8a:
            r9.V()
        L8d:
            sf.n r13 = sf.n.f12433a
            return r13
        L90:
            if (r15 != 0) goto L9c
            boolean r15 = r9.f(r13)
            if (r15 == 0) goto L9a
            r15 = 4
            goto L9b
        L9a:
            r15 = 2
        L9b:
            r14 = r14 | r15
        L9c:
            r15 = r14 & 19
            r0 = 18
            r1 = 1
            if (r15 == r0) goto La5
            r15 = r1
            goto La6
        La5:
            r15 = 0
        La6:
            r14 = r14 & r1
            boolean r14 = r9.S(r14, r15)
            if (r14 == 0) goto L105
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f17523h
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
            java.util.List r13 = r12.f17525j
            boolean r14 = r9.h(r13)
            java.util.List r15 = r12.f17526k
            boolean r1 = r9.h(r15)
            r14 = r14 | r1
            fg.p r1 = r12.f17527l
            boolean r3 = r9.f(r1)
            r14 = r14 | r3
            java.lang.Object r3 = r9.P()
            if (r14 != 0) goto Leb
            i0.e r14 = i0.l.f5952a
            if (r3 != r14) goto Lf4
        Leb:
            wb.a9 r3 = new wb.a9
            r14 = 0
            r3.<init>(r13, r15, r1, r14)
            r9.k0(r3)
        Lf4:
            r8 = r3
            fg.l r8 = (fg.l) r8
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f17524i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L108
        L105:
            r9.V()
        L108:
            sf.n r13 = sf.n.f12433a
            return r13
    }
}
