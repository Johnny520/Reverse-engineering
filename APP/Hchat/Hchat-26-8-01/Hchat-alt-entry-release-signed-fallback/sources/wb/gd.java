package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f16375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.p f16378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16380m;

    public /* synthetic */ gd(java.util.ArrayList r2, java.util.List r3, java.util.List r4, fg.p r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 1
            r1.f16374g = r0
            r1.<init>()
            r1.f16375h = r2
            r1.f16376i = r3
            r1.f16377j = r4
            r1.f16378k = r5
            r1.f16379l = r6
            r1.f16380m = r7
            return
    }

    public /* synthetic */ gd(java.util.List r1, java.util.ArrayList r2, java.util.List r3, fg.p r4, i0.a1 r5, i0.a1 r6, int r7) {
            r0 = this;
            r0.f16374g = r7
            r0.f16376i = r1
            r0.f16375h = r2
            r0.f16377j = r3
            r0.f16378k = r4
            r0.f16379l = r5
            r0.f16380m = r6
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            int r0 = r10.f16374g
            r.d r11 = (r.d) r11
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.getClass()
            r11 = r13 & 17
            switch(r0) {
                case 0: goto L7d;
                case 1: goto L49;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L1b
            r11 = r1
            goto L1c
        L1b:
            r11 = 0
        L1c:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L43
            wb.hf r2 = new wb.hf
            r9 = 2
            java.util.List r3 = r10.f16376i
            java.util.ArrayList r4 = r10.f16375h
            java.util.List r5 = r10.f16377j
            fg.p r6 = r10.f16378k
            i0.a1 r7 = r10.f16379l
            i0.a1 r8 = r10.f16380m
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = -1496232202(0xffffffffa6d14ef6, float:-1.4523691E-15)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L46
        L43:
            r12.V()
        L46:
            sf.n r11 = sf.n.f12433a
            return r11
        L49:
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L50
            r11 = r1
            goto L51
        L50:
            r11 = 0
        L51:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L77
            wb.hf r2 = new wb.hf
            java.util.ArrayList r3 = r10.f16375h
            java.util.List r4 = r10.f16376i
            java.util.List r5 = r10.f16377j
            fg.p r6 = r10.f16378k
            i0.a1 r7 = r10.f16379l
            i0.a1 r8 = r10.f16380m
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11 = -170380160(0xfffffffff5d83480, float:-5.48145E32)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L7a
        L77:
            r12.V()
        L7a:
            sf.n r11 = sf.n.f12433a
            return r11
        L7d:
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L84
            r11 = r1
            goto L85
        L84:
            r11 = 0
        L85:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto Lac
            wb.hf r2 = new wb.hf
            r9 = 0
            java.util.List r3 = r10.f16376i
            java.util.ArrayList r4 = r10.f16375h
            java.util.List r5 = r10.f16377j
            fg.p r6 = r10.f16378k
            i0.a1 r7 = r10.f16379l
            i0.a1 r8 = r10.f16380m
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = -500083587(0xffffffffe231547d, float:-8.177904E20)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto Laf
        Lac:
            r12.V()
        Laf:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
