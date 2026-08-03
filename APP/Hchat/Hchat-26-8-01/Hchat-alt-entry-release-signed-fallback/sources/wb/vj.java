package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vj implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vb.a f19735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f19737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19741n;

    public /* synthetic */ vj(vb.a r1, android.content.SharedPreferences r2, fg.a r3, android.content.Context r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, int r8) {
            r0 = this;
            r0.f19734g = r8
            r0.f19735h = r1
            r0.f19736i = r2
            r0.f19737j = r3
            r0.f19738k = r4
            r0.f19739l = r5
            r0.f19740m = r6
            r0.f19741n = r7
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
            r13 = this;
            int r0 = r13.f19734g
            switch(r0) {
                case 0: goto Lf9;
                default: goto L5;
            }
        L5:
            r2 = r14
            wb.no r2 = (wb.no) r2
            r7 = r15
            i0.h0 r7 = (i0.h0) r7
            r14 = r16
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r2.getClass()
            r0 = r14 & 6
            r1 = 4
            if (r0 != 0) goto L2e
            r0 = r14 & 8
            if (r0 != 0) goto L24
            boolean r0 = r7.f(r2)
            goto L28
        L24:
            boolean r0 = r7.h(r2)
        L28:
            if (r0 == 0) goto L2c
            r0 = r1
            goto L2d
        L2c:
            r0 = 2
        L2d:
            r14 = r14 | r0
        L2e:
            r0 = r14 & 19
            r3 = 18
            r4 = 1
            r12 = 0
            if (r0 == r3) goto L38
            r0 = r4
            goto L39
        L38:
            r0 = r12
        L39:
            r3 = r14 & 1
            boolean r0 = r7.S(r3, r0)
            if (r0 == 0) goto Lf2
            wb.mo r0 = wb.mo.f17734a
            boolean r0 = r2.equals(r0)
            android.content.SharedPreferences r3 = r13.f19736i
            i0.a1 r5 = r13.f19739l
            r6 = r4
            i0.a1 r4 = r13.f19740m
            r8 = r6
            i0.a1 r6 = r13.f19741n
            i0.e r9 = i0.l.f5952a
            if (r0 == 0) goto L8f
            r14 = -2114031208(0xffffffff81fe7198, float:-9.3467863E-38)
            r7.a0(r14)
            r14 = r3
            wb.y2 r3 = wb.y2.f20286k
            java.lang.Object r0 = r5.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r1 = r4.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r2 = r7.P()
            if (r2 != r9) goto L7a
            wb.ad r2 = new wb.ad
            r8 = 8
            r2.<init>(r4, r5, r6, r8)
            r7.k0(r2)
        L7a:
            r9 = r2
            fg.l r9 = (fg.l) r9
            r11 = 1769472(0x1b0000, float:2.479558E-39)
            vb.a r4 = r13.f19735h
            fg.a r8 = r13.f19737j
            r5 = r14
            r6 = r0
            r10 = r7
            r7 = r1
            r3.v(r4, r5, r6, r7, r8, r9, r10, r11)
            r10.p(r12)
            goto Lf6
        L8f:
            r10 = r7
            boolean r0 = r2 instanceof wb.lo
            if (r0 == 0) goto Lea
            r0 = -2113998806(0xffffffff81fef02a, float:-9.364948E-38)
            r10.a0(r0)
            r0 = r2
            wb.lo r0 = (wb.lo) r0
            wb.v0 r0 = r0.f17535b
            java.lang.Object r7 = r10.P()
            if (r7 != r9) goto Laf
            wb.gl r7 = new wb.gl
            r11 = 20
            r7.<init>(r6, r11)
            r10.k0(r7)
        Laf:
            r11 = r7
            fg.a r11 = (fg.a) r11
            r7 = r14 & 14
            if (r7 == r1) goto Lc2
            r14 = r14 & 8
            if (r14 == 0) goto Lc1
            boolean r14 = r10.h(r2)
            if (r14 == 0) goto Lc1
            goto Lc2
        Lc1:
            r8 = r12
        Lc2:
            boolean r14 = r10.h(r3)
            r14 = r14 | r8
            java.lang.Object r1 = r10.P()
            if (r14 != 0) goto Lcf
            if (r1 != r9) goto Ld9
        Lcf:
            eb.o r1 = new eb.o
            r7 = 19
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.k0(r1)
        Ld9:
            r6 = r1
            fg.l r6 = (fg.l) r6
            r8 = 384(0x180, float:5.38E-43)
            android.content.Context r3 = r13.f19738k
            r4 = r0
            r7 = r10
            r5 = r11
            wb.ho.b0(r3, r4, r5, r6, r7, r8)
            r10.p(r12)
            goto Lf6
        Lea:
            r14 = -2114032214(0xffffffff81fe6daa, float:-9.3462224E-38)
            af.d r14 = bc.e.d(r10, r14, r12)
            throw r14
        Lf2:
            r10 = r7
            r10.V()
        Lf6:
            sf.n r14 = sf.n.f12433a
            return r14
        Lf9:
            r1 = r14
            wb.to r1 = (wb.to) r1
            r6 = r15
            i0.h0 r6 = (i0.h0) r6
            r14 = r16
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r1.getClass()
            r0 = r14 & 6
            r2 = 4
            if (r0 != 0) goto L122
            r0 = r14 & 8
            if (r0 != 0) goto L118
            boolean r0 = r6.f(r1)
            goto L11c
        L118:
            boolean r0 = r6.h(r1)
        L11c:
            if (r0 == 0) goto L120
            r0 = r2
            goto L121
        L120:
            r0 = 2
        L121:
            r14 = r14 | r0
        L122:
            r0 = r14 & 19
            r3 = 18
            r4 = 1
            r10 = 0
            if (r0 == r3) goto L12c
            r0 = r4
            goto L12d
        L12c:
            r0 = r10
        L12d:
            r3 = r14 & 1
            boolean r0 = r6.S(r3, r0)
            if (r0 == 0) goto L1e9
            wb.so r0 = wb.so.f19123a
            boolean r0 = r1.equals(r0)
            android.content.SharedPreferences r3 = r13.f19736i
            r5 = r4
            i0.a1 r4 = r13.f19739l
            r7 = r3
            i0.a1 r3 = r13.f19740m
            r8 = r5
            i0.a1 r5 = r13.f19741n
            i0.e r9 = i0.l.f5952a
            if (r0 == 0) goto L181
            r14 = -312475028(0xffffffffed60026c, float:-4.332973E27)
            r6.a0(r14)
            java.lang.Object r14 = r4.getValue()
            java.util.Set r14 = (java.util.Set) r14
            java.lang.Object r0 = r3.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r1 = r6.P()
            if (r1 != r9) goto L16b
            wb.ad r1 = new wb.ad
            r2 = 6
            r1.<init>(r3, r4, r5, r2)
            r6.k0(r1)
        L16b:
            fg.l r1 = (fg.l) r1
            r9 = 196608(0x30000, float:2.75506E-40)
            vb.a r2 = r13.f19735h
            r8 = r6
            fg.a r6 = r13.f19737j
            r4 = r14
            r5 = r0
            r3 = r7
            r7 = r1
            wb.ho.m2(r2, r3, r4, r5, r6, r7, r8, r9)
            r7 = r8
            r7.p(r10)
            goto L1ed
        L181:
            r0 = r7
            r7 = r6
            boolean r6 = r1 instanceof wb.ro
            if (r6 == 0) goto L1e0
            r6 = -312442551(0xffffffffed608149, float:-4.3425586E27)
            r7.a0(r6)
            r6 = r1
            wb.ro r6 = (wb.ro) r6
            wb.v0 r11 = r6.f18929b
            java.lang.Object r6 = r7.P()
            if (r6 != r9) goto L1a2
            wb.yk r6 = new wb.yk
            r12 = 23
            r6.<init>(r5, r12)
            r7.k0(r6)
        L1a2:
            r12 = r6
            fg.a r12 = (fg.a) r12
            r6 = r14 & 14
            if (r6 == r2) goto L1b5
            r14 = r14 & 8
            if (r14 == 0) goto L1b4
            boolean r14 = r7.h(r1)
            if (r14 == 0) goto L1b4
            goto L1b5
        L1b4:
            r8 = r10
        L1b5:
            boolean r14 = r7.h(r0)
            r14 = r14 | r8
            java.lang.Object r2 = r7.P()
            if (r14 != 0) goto L1c2
            if (r2 != r9) goto L1ce
        L1c2:
            r2 = r0
            eb.o r0 = new eb.o
            r6 = 18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.k0(r0)
            r2 = r0
        L1ce:
            r5 = r2
            fg.l r5 = (fg.l) r5
            r8 = r7
            r7 = 384(0x180, float:5.38E-43)
            android.content.Context r2 = r13.f19738k
            r6 = r8
            r3 = r11
            r4 = r12
            wb.ho.b0(r2, r3, r4, r5, r6, r7)
            r8.p(r10)
            goto L1ed
        L1e0:
            r8 = r7
            r14 = -312475959(0xffffffffed5ffec9, float:-4.3326983E27)
            af.d r14 = bc.e.d(r8, r14, r10)
            throw r14
        L1e9:
            r8 = r6
            r8.V()
        L1ed:
            sf.n r14 = sf.n.f12433a
            return r14
    }
}
