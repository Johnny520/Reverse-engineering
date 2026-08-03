package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f15432m;

    public /* synthetic */ cc(i0.a1 r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, java.util.List r6, int r7) {
            r0 = this;
            r0.f15426g = r7
            r0.f15427h = r1
            r0.f15428i = r2
            r0.f15429j = r3
            r0.f15430k = r4
            r0.f15431l = r5
            r0.f15432m = r6
            r0.<init>()
            return
    }

    public /* synthetic */ cc(java.util.List r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, int r7) {
            r0 = this;
            r0.f15426g = r7
            r0.f15432m = r1
            r0.f15427h = r2
            r0.f15428i = r3
            r0.f15429j = r4
            r0.f15430k = r5
            r0.f15431l = r6
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            int r0 = r10.f15426g
            r.d r11 = (r.d) r11
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.getClass()
            r11 = r13 & 17
            switch(r0) {
                case 0: goto Lb3;
                case 1: goto L7e;
                case 2: goto L49;
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
            wb.ue r2 = new wb.ue
            r9 = 0
            i0.a1 r3 = r10.f15427h
            i0.a1 r4 = r10.f15428i
            i0.a1 r5 = r10.f15429j
            i0.a1 r6 = r10.f15430k
            i0.a1 r7 = r10.f15431l
            java.util.List r8 = r10.f15432m
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = 1714513235(0x66316553, float:2.09432E23)
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
            if (r11 == 0) goto L78
            wb.ue r2 = new wb.ue
            r9 = 1
            java.util.List r3 = r10.f15432m
            i0.a1 r4 = r10.f15427h
            i0.a1 r5 = r10.f15428i
            i0.a1 r6 = r10.f15429j
            i0.a1 r7 = r10.f15430k
            i0.a1 r8 = r10.f15431l
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = -450519599(0xffffffffe5259dd1, float:-4.8881354E22)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L7b
        L78:
            r12.V()
        L7b:
            sf.n r11 = sf.n.f12433a
            return r11
        L7e:
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L85
            r11 = r1
            goto L86
        L85:
            r11 = 0
        L86:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto Lad
            wb.ue r2 = new wb.ue
            r9 = 3
            i0.a1 r3 = r10.f15427h
            i0.a1 r4 = r10.f15428i
            i0.a1 r5 = r10.f15429j
            i0.a1 r6 = r10.f15430k
            i0.a1 r7 = r10.f15431l
            java.util.List r8 = r10.f15432m
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = -782445995(0xffffffffd15cd255, float:-5.927635E10)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto Lb0
        Lad:
            r12.V()
        Lb0:
            sf.n r11 = sf.n.f12433a
            return r11
        Lb3:
            r0 = 16
            r1 = 1
            if (r11 == r0) goto Lba
            r11 = r1
            goto Lbb
        Lba:
            r11 = 0
        Lbb:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto Le2
            wb.ue r2 = new wb.ue
            r9 = 2
            java.util.List r3 = r10.f15432m
            i0.a1 r4 = r10.f15427h
            i0.a1 r5 = r10.f15428i
            i0.a1 r6 = r10.f15429j
            i0.a1 r7 = r10.f15430k
            i0.a1 r8 = r10.f15431l
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = -96678377(0xfffffffffa3cce17, float:-2.4508295E35)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto Le5
        Le2:
            r12.V()
        Le5:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
