package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sh.x f17419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.z f17420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17423l;

    public /* synthetic */ lb(sh.x r1, r.z r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, int r6) {
            r0 = this;
            r0.f17418g = r6
            r0.f17419h = r1
            r0.f17420i = r2
            r0.f17421j = r3
            r0.f17422k = r4
            r0.f17423l = r5
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
            r12 = this;
            int r0 = r12.f17418g
            p.x0 r13 = (p.x0) r13
            r9 = r14
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r13.getClass()
            r15 = r14 & 6
            switch(r0) {
                case 0: goto L81;
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
            if (r14 == 0) goto L7b
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f17419h
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
            java.lang.Object r13 = r9.P()
            i0.e r14 = i0.l.f5952a
            if (r13 != r14) goto L69
            wb.ad r13 = new wb.ad
            r14 = 7
            i0.a1 r15 = r12.f17421j
            i0.a1 r1 = r12.f17422k
            i0.a1 r3 = r12.f17423l
            r13.<init>(r15, r1, r3, r14)
            r9.k0(r13)
        L69:
            r8 = r13
            fg.l r8 = (fg.l) r8
            r10 = 805306368(0x30000000, float:4.656613E-10)
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f17420i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L7e
        L7b:
            r9.V()
        L7e:
            sf.n r13 = sf.n.f12433a
            return r13
        L81:
            if (r15 != 0) goto L8d
            boolean r15 = r9.f(r13)
            if (r15 == 0) goto L8b
            r15 = 4
            goto L8c
        L8b:
            r15 = 2
        L8c:
            r14 = r14 | r15
        L8d:
            r15 = r14 & 19
            r0 = 18
            r1 = 1
            if (r15 == r0) goto L96
            r15 = r1
            goto L97
        L96:
            r15 = 0
        L97:
            r14 = r14 & r1
            boolean r14 = r9.S(r14, r15)
            if (r14 == 0) goto Le7
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f17419h
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
            java.lang.Object r13 = r9.P()
            i0.e r14 = i0.l.f5952a
            if (r13 != r14) goto Ld5
            wb.ad r13 = new wb.ad
            r14 = 0
            i0.a1 r15 = r12.f17421j
            i0.a1 r1 = r12.f17422k
            i0.a1 r3 = r12.f17423l
            r13.<init>(r15, r1, r3, r14)
            r9.k0(r13)
        Ld5:
            r8 = r13
            fg.l r8 = (fg.l) r8
            r10 = 805306368(0x30000000, float:4.656613E-10)
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f17420i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lea
        Le7:
            r9.V()
        Lea:
            sf.n r13 = sf.n.f12433a
            return r13
    }
}
