package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fm implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.a f16208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f16209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16211p;

    public /* synthetic */ fm(i0.a1 r2, android.content.Context r3, i0.a1 r4, i0.a1 r5, fg.l r6, java.util.List r7, fg.a r8, java.util.Set r9, boolean r10) {
            r1 = this;
            r0 = 1
            r1.f16202g = r0
            r1.<init>()
            r1.f16203h = r2
            r1.f16204i = r3
            r1.f16205j = r4
            r1.f16206k = r5
            r1.f16210o = r6
            r1.f16207l = r7
            r1.f16208m = r8
            r1.f16211p = r9
            r1.f16209n = r10
            return
    }

    public /* synthetic */ fm(java.lang.String r2, java.util.List r3, java.lang.String r4, fg.l r5, i0.a1 r6, i0.a1 r7, boolean r8, fg.a r9, i0.a1 r10) {
            r1 = this;
            r0 = 2
            r1.f16202g = r0
            r1.<init>()
            r1.f16210o = r2
            r1.f16207l = r3
            r1.f16204i = r4
            r1.f16211p = r5
            r1.f16203h = r6
            r1.f16205j = r7
            r1.f16209n = r8
            r1.f16208m = r9
            r1.f16206k = r10
            return
    }

    public /* synthetic */ fm(java.util.ArrayList r2, android.content.Context r3, java.util.LinkedHashSet r4, boolean r5, fg.a r6, java.util.List r7, i0.a1 r8, i0.a1 r9, i0.a1 r10) {
            r1 = this;
            r0 = 0
            r1.f16202g = r0
            r1.<init>()
            r1.f16210o = r2
            r1.f16204i = r3
            r1.f16211p = r4
            r1.f16209n = r5
            r1.f16208m = r6
            r1.f16207l = r7
            r1.f16203h = r8
            r1.f16205j = r9
            r1.f16206k = r10
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
            r13 = this;
            int r0 = r13.f16202g
            switch(r0) {
                case 0: goto L12b;
                case 1: goto L5a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r13.f16210o
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r13.f16204i
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r13.f16211p
            r5 = r0
            fg.l r5 = (fg.l) r5
            r.d r14 = (r.d) r14
            r0 = r15
            i0.h0 r0 = (i0.h0) r0
            r1 = r16
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r14.getClass()
            r14 = r1 & 17
            r3 = 16
            r11 = 1
            if (r14 == r3) goto L2d
            r14 = r11
            goto L2e
        L2d:
            r14 = 0
        L2e:
            r1 = r1 & r11
            boolean r14 = r0.S(r1, r14)
            if (r14 == 0) goto L54
            r.b r1 = new r.b
            java.util.List r3 = r13.f16207l
            i0.a1 r6 = r13.f16203h
            i0.a1 r7 = r13.f16205j
            boolean r8 = r13.f16209n
            fg.a r9 = r13.f16208m
            i0.a1 r10 = r13.f16206k
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14 = -9882400(0xffffffffff6934e0, float:-3.0998467E38)
            s0.d r14 = s0.i.e(r14, r1, r0)
            r1 = 48
            r2 = 0
            wb.ho.C3(r2, r14, r0, r1, r11)
            goto L57
        L54:
            r0.V()
        L57:
            sf.n r14 = sf.n.f12433a
            return r14
        L5a:
            java.lang.Object r0 = r13.f16204i
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r13.f16210o
            r3 = r0
            fg.l r3 = (fg.l) r3
            java.lang.Object r0 = r13.f16211p
            java.util.Set r0 = (java.util.Set) r0
            th.a r14 = (th.a) r14
            r10 = r15
            i0.h0 r10 = (i0.h0) r10
            r1 = r16
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r14.getClass()
            r14 = r1 & 17
            r4 = 16
            r5 = 1
            r9 = 0
            if (r14 == r4) goto L82
            r14 = r5
            goto L83
        L82:
            r14 = r9
        L83:
            r1 = r1 & r5
            boolean r14 = r10.S(r1, r14)
            if (r14 == 0) goto L125
            i0.a1 r4 = r13.f16203h
            boolean r14 = r10.f(r4)
            boolean r1 = r10.h(r2)
            r14 = r14 | r1
            i0.a1 r5 = r13.f16205j
            boolean r1 = r10.f(r5)
            r14 = r14 | r1
            i0.a1 r6 = r13.f16206k
            boolean r1 = r10.f(r6)
            r14 = r14 | r1
            boolean r1 = r10.f(r3)
            r14 = r14 | r1
            java.util.List r7 = r13.f16207l
            boolean r1 = r10.h(r7)
            r14 = r14 | r1
            java.lang.Object r1 = r10.P()
            i0.e r11 = i0.l.f5952a
            if (r14 != 0) goto Lb9
            if (r1 != r11) goto Lc2
        Lb9:
            c9.p0 r1 = new c9.p0
            r8 = 4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10.k0(r1)
        Lc2:
            fg.a r1 = (fg.a) r1
            r14 = r0
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r2 = r14.isEmpty()
            boolean r3 = r13.f16209n
            r4 = 0
            if (r2 != 0) goto Ld9
            if (r3 == 0) goto Ld5
            java.lang.String r2 = "取消全选"
            goto Ld7
        Ld5:
            java.lang.String r2 = "全选"
        Ld7:
            r8 = r2
            goto Lda
        Ld9:
            r8 = r4
        Lda:
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L10d
            r14 = 895630946(0x35623e62, float:8.428234E-7)
            r10.a0(r14)
            boolean r14 = r10.f(r5)
            boolean r2 = r10.g(r3)
            r14 = r14 | r2
            boolean r2 = r10.h(r0)
            r14 = r14 | r2
            java.lang.Object r2 = r10.P()
            if (r14 != 0) goto Lfc
            if (r2 != r11) goto L105
        Lfc:
            wb.p1 r2 = new wb.p1
            r14 = 2
            r2.<init>(r3, r0, r5, r14)
            r10.k0(r2)
        L105:
            r4 = r2
            fg.a r4 = (fg.a) r4
            r10.p(r9)
        L10b:
            r9 = r4
            goto L117
        L10d:
            r14 = 895818650(0x35651b9a, float:8.5349313E-7)
            r10.a0(r14)
            r10.p(r9)
            goto L10b
        L117:
            r11 = 390(0x186, float:5.47E-43)
            r12 = 0
            java.lang.String r4 = "套用模板"
            java.lang.String r6 = "返回"
            fg.a r7 = r13.f16208m
            r5 = r1
            wb.ho.M(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L128
        L125:
            r10.V()
        L128:
            sf.n r14 = sf.n.f12433a
            return r14
        L12b:
            java.lang.Object r0 = r13.f16210o
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r13.f16204i
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r13.f16211p
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            th.a r14 = (th.a) r14
            r9 = r15
            i0.h0 r9 = (i0.h0) r9
            r3 = r16
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r14.getClass()
            r14 = r3 & 17
            r4 = 16
            r5 = 1
            r12 = 0
            if (r14 == r4) goto L151
            r14 = r5
            goto L152
        L151:
            r14 = r12
        L152:
            r3 = r3 & r5
            boolean r14 = r9.S(r3, r14)
            if (r14 == 0) goto L251
            i0.a1 r14 = r13.f16203h
            java.lang.Object r3 = r14.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            i0.a1 r4 = r13.f16206k
            i0.e r5 = i0.l.f5952a
            r6 = 0
            if (r3 == 0) goto L203
            r3 = -561355646(0xffffffffde8a6482, float:-4.986119E18)
            r9.a0(r3)
            int r3 = r0.size()
            java.lang.String r7 = "删除所选（"
            java.lang.String r8 = "）"
            java.lang.String r3 = eh.a.m(r3, r7, r8)
            boolean r7 = r9.h(r0)
            boolean r8 = r9.h(r1)
            r7 = r7 | r8
            java.lang.Object r8 = r9.P()
            if (r7 != 0) goto L18f
            if (r8 != r5) goto L19a
        L18f:
            wb.w8 r8 = new wb.w8
            r7 = 4
            i0.a1 r10 = r13.f16205j
            r8.<init>(r0, r1, r10, r7)
            r9.k0(r8)
        L19a:
            fg.a r8 = (fg.a) r8
            java.lang.Object r0 = r9.P()
            if (r0 != r5) goto L1ac
            c9.x0 r0 = new c9.x0
            r1 = 11
            r0.<init>(r1, r14, r4)
            r9.k0(r0)
        L1ac:
            fg.a r0 = (fg.a) r0
            boolean r14 = r2.isEmpty()
            boolean r1 = r13.f16209n
            if (r14 == 0) goto L1b8
            r7 = r6
            goto L1c1
        L1b8:
            if (r1 == 0) goto L1be
            java.lang.String r14 = "取消全选"
        L1bc:
            r7 = r14
            goto L1c1
        L1be:
            java.lang.String r14 = "全选"
            goto L1bc
        L1c1:
            boolean r14 = r2.isEmpty()
            if (r14 == 0) goto L1d1
            r14 = -560598069(0xffffffffde95f3cb, float:-5.4026016E18)
            r9.a0(r14)
        L1cd:
            r9.p(r12)
            goto L1f4
        L1d1:
            r14 = -560578228(0xffffffffde96414c, float:-5.413509E18)
            r9.a0(r14)
            boolean r14 = r9.g(r1)
            boolean r6 = r9.h(r2)
            r14 = r14 | r6
            java.lang.Object r6 = r9.P()
            if (r14 != 0) goto L1e8
            if (r6 != r5) goto L1f1
        L1e8:
            wb.x8 r6 = new wb.x8
            r14 = 4
            r6.<init>(r1, r2, r4, r14)
            r9.k0(r6)
        L1f1:
            fg.a r6 = (fg.a) r6
            goto L1cd
        L1f4:
            r10 = 3456(0xd80, float:4.843E-42)
            r11 = 0
            java.lang.String r5 = "取消"
            r4 = r8
            r8 = r6
            r6 = r0
            wb.ho.M(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r9.p(r12)
            goto L254
        L203:
            r0 = -560214412(0xffffffffde9bce74, float:-5.613519E18)
            r9.a0(r0)
            java.util.List r0 = r13.f16207l
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L213
            r7 = r6
            goto L216
        L213:
            java.lang.String r1 = "批量删除"
            r7 = r1
        L216:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L227
            r14 = -559976085(0xffffffffde9f716b, float:-5.744541E18)
            r9.a0(r14)
        L222:
            r9.p(r12)
            r8 = r6
            goto L241
        L227:
            r0 = -559960739(0xffffffffde9fad5d, float:-5.7529774E18)
            r9.a0(r0)
            java.lang.Object r0 = r9.P()
            if (r0 != r5) goto L23d
            c9.x0 r0 = new c9.x0
            r1 = 12
            r0.<init>(r1, r14, r4)
            r9.k0(r0)
        L23d:
            r6 = r0
            fg.a r6 = (fg.a) r6
            goto L222
        L241:
            r10 = 6
            r11 = 12
            java.lang.String r3 = "返回"
            fg.a r4 = r13.f16208m
            r5 = 0
            r6 = 0
            wb.ho.M(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r9.p(r12)
            goto L254
        L251:
            r9.V()
        L254:
            sf.n r14 = sf.n.f12433a
            return r14
    }
}
