package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.l f16476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f16477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16480o;

    public /* synthetic */ h1(java.lang.String r2, wb.lv r3, java.util.ArrayList r4, java.util.Set r5, java.lang.String r6, boolean r7, android.app.Activity r8, fg.l r9) {
            r1 = this;
            r0 = 3
            r1.f16472g = r0
            r1.<init>()
            r1.f16473h = r2
            r1.f16474i = r3
            r1.f16480o = r4
            r1.f16478m = r5
            r1.f16479n = r6
            r1.f16477l = r7
            r1.f16475j = r8
            r1.f16476k = r9
            return
    }

    public /* synthetic */ h1(sh.x r2, r.z r3, i0.a1 r4, java.util.Set r5, fg.l r6, n9.a r7, boolean r8, fg.a r9) {
            r1 = this;
            r0 = 1
            r1.f16472g = r0
            r1.<init>()
            r1.f16473h = r2
            r1.f16474i = r3
            r1.f16475j = r4
            r1.f16478m = r5
            r1.f16476k = r6
            r1.f16479n = r7
            r1.f16477l = r8
            r1.f16480o = r9
            return
    }

    public /* synthetic */ h1(sh.x r2, r.z r3, boolean r4, fg.l r5, java.util.List r6, java.util.ArrayList r7, fg.l r8, i0.a1 r9) {
            r1 = this;
            r0 = 0
            r1.f16472g = r0
            r1.<init>()
            r1.f16473h = r2
            r1.f16474i = r3
            r1.f16477l = r4
            r1.f16476k = r5
            r1.f16479n = r6
            r1.f16480o = r7
            r1.f16478m = r8
            r1.f16475j = r9
            return
    }

    public /* synthetic */ h1(wb.v0 r2, i0.a1 r3, i0.a1 r4, android.content.Context r5, fg.l r6, fg.a r7, java.util.Set r8, boolean r9) {
            r1 = this;
            r0 = 2
            r1.f16472g = r0
            r1.<init>()
            r1.f16473h = r2
            r1.f16475j = r3
            r1.f16474i = r4
            r1.f16478m = r5
            r1.f16476k = r6
            r1.f16479n = r7
            r1.f16480o = r8
            r1.f16477l = r9
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
            r17 = this;
            r0 = r17
            int r1 = r0.f16472g
            switch(r1) {
                case 0: goto L226;
                case 1: goto L16b;
                case 2: goto L81;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f16473h
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r0.f16474i
            r4 = r1
            wb.lv r4 = (wb.lv) r4
            java.lang.Object r1 = r0.f16480o
            r6 = r1
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r1 = r0.f16478m
            r7 = r1
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r1 = r0.f16479n
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r0.f16475j
            r11 = r1
            android.app.Activity r11 = (android.app.Activity) r11
            r5 = r18
            fg.a r5 = (fg.a) r5
            r1 = r19
            i0.h0 r1 = (i0.h0) r1
            r2 = r20
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5.getClass()
            r9 = r2 & 6
            if (r9 != 0) goto L46
            boolean r9 = r1.h(r5)
            if (r9 == 0) goto L44
            r9 = 4
            goto L45
        L44:
            r9 = 2
        L45:
            r2 = r2 | r9
        L46:
            r9 = r2 & 19
            r10 = 18
            if (r9 == r10) goto L4e
            r9 = 1
            goto L4f
        L4e:
            r9 = 0
        L4f:
            r10 = r2 & 1
            boolean r9 = r1.S(r10, r9)
            if (r9 == 0) goto L7a
            r13 = r2
            wb.y2 r2 = wb.y2.f20291p
            r9 = r5
            wb.ef r5 = new wb.ef
            boolean r10 = r0.f16477l
            fg.l r12 = r0.f16476k
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r6 = -1650797776(0xffffffff9d9ad330, float:-4.0981823E-21)
            s0.d r6 = s0.i.e(r6, r5, r1)
            int r5 = r13 << 9
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r7 = 221190(0x36006, float:3.09953E-40)
            r8 = r5 | r7
            r7 = r1
            r5 = r9
            r2.J(r3, r4, r5, r6, r7, r8)
            goto L7e
        L7a:
            r7 = r1
            r7.V()
        L7e:
            sf.n r1 = sf.n.f12433a
            return r1
        L81:
            java.lang.Object r1 = r0.f16473h
            r3 = r1
            wb.v0 r3 = (wb.v0) r3
            java.lang.Object r1 = r0.f16475j
            r6 = r1
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r1 = r0.f16474i
            r7 = r1
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r1 = r0.f16478m
            r4 = r1
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r1 = r0.f16479n
            r11 = r1
            fg.a r11 = (fg.a) r11
            java.lang.Object r1 = r0.f16480o
            java.util.Set r1 = (java.util.Set) r1
            r2 = r18
            th.a r2 = (th.a) r2
            r14 = r19
            i0.h0 r14 = (i0.h0) r14
            r5 = r20
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.getClass()
            r2 = r5 & 17
            r8 = 16
            r9 = 1
            r10 = 0
            if (r2 == r8) goto Lbb
            r2 = r9
            goto Lbc
        Lbb:
            r2 = r10
        Lbc:
            r5 = r5 & r9
            boolean r2 = r14.S(r5, r2)
            if (r2 == 0) goto L165
            boolean r9 = r3.f19585c
            if (r9 == 0) goto Lcb
            java.lang.String r2 = "保存选择"
        Lc9:
            r12 = r2
            goto Lce
        Lcb:
            java.lang.String r2 = r3.f19590h
            goto Lc9
        Lce:
            boolean r2 = r14.f(r6)
            boolean r5 = r14.f(r7)
            r2 = r2 | r5
            boolean r5 = r14.f(r3)
            r2 = r2 | r5
            boolean r5 = r14.h(r4)
            r2 = r2 | r5
            fg.l r5 = r0.f16476k
            boolean r8 = r14.f(r5)
            r2 = r2 | r8
            java.lang.Object r8 = r14.P()
            i0.e r13 = i0.l.f5952a
            if (r2 != 0) goto Lf2
            if (r8 != r13) goto Lfd
        Lf2:
            c9.r0 r2 = new c9.r0
            r8 = 8
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r14.k0(r2)
            r8 = r2
        Lfd:
            fg.a r8 = (fg.a) r8
            boolean r2 = r0.f16477l
            r3 = 0
            if (r9 == 0) goto L115
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L115
            if (r2 == 0) goto L112
            java.lang.String r4 = "取消全选"
            goto L116
        L112:
            java.lang.String r4 = "全选"
            goto L116
        L115:
            r4 = r3
        L116:
            if (r9 == 0) goto L14e
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L14e
            r3 = -1582943175(0xffffffffa1a63439, float:-1.1262421E-18)
            r14.a0(r3)
            boolean r3 = r14.f(r7)
            boolean r5 = r14.g(r2)
            r3 = r3 | r5
            boolean r5 = r14.h(r1)
            r3 = r3 | r5
            java.lang.Object r5 = r14.P()
            if (r3 != 0) goto L13d
            if (r5 != r13) goto L146
        L13d:
            wb.p1 r5 = new wb.p1
            r3 = 1
            r5.<init>(r2, r1, r7, r3)
            r14.k0(r5)
        L146:
            r3 = r5
            fg.a r3 = (fg.a) r3
            r14.p(r10)
        L14c:
            r13 = r3
            goto L158
        L14e:
            r1 = -1582637949(0xffffffffa1aadc83, float:-1.1578017E-18)
            r14.a0(r1)
            r14.p(r10)
            goto L14c
        L158:
            r15 = 384(0x180, float:5.38E-43)
            r16 = 0
            java.lang.String r10 = "返回"
            r9 = r8
            r8 = r12
            r12 = r4
            wb.ho.M(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L168
        L165:
            r14.V()
        L168:
            sf.n r1 = sf.n.f12433a
            return r1
        L16b:
            java.lang.Object r1 = r0.f16473h
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f16474i
            r4 = r2
            r.z r4 = (r.z) r4
            java.lang.Object r2 = r0.f16475j
            r7 = r2
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r2 = r0.f16478m
            r8 = r2
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r2 = r0.f16479n
            r10 = r2
            n9.a r10 = (n9.a) r10
            java.lang.Object r2 = r0.f16480o
            r11 = r2
            fg.a r11 = (fg.a) r11
            r2 = r18
            p.x0 r2 = (p.x0) r2
            r3 = r19
            i0.h0 r3 = (i0.h0) r3
            r5 = r20
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.getClass()
            r6 = r5 & 6
            if (r6 != 0) goto L1a9
            boolean r6 = r3.f(r2)
            if (r6 == 0) goto L1a7
            r6 = 4
            goto L1a8
        L1a7:
            r6 = 2
        L1a8:
            r5 = r5 | r6
        L1a9:
            r6 = r5 & 19
            r9 = 18
            r12 = 1
            if (r6 == r9) goto L1b2
            r6 = r12
            goto L1b3
        L1b2:
            r6 = 0
        L1b3:
            r5 = r5 & r12
            boolean r5 = r3.S(r5, r6)
            if (r5 == 0) goto L21f
            p.a0 r5 = p.h1.f9915c
            m.a r1 = r1.f12897e
            r6 = 0
            y0.o r1 = r1.f.a(r5, r1, r6)
            float r5 = r2.c()
            r6 = 8
            float r6 = (float) r6
            float r5 = r5 + r6
            float r2 = r2.a()
            r6 = 84
            float r6 = (float) r6
            float r2 = r2 + r6
            r6 = 5
            p.z0 r2 = p.d.b(r5, r2, r6)
            boolean r5 = r3.f(r7)
            boolean r6 = r3.h(r8)
            r5 = r5 | r6
            fg.l r9 = r0.f16476k
            boolean r6 = r3.f(r9)
            r5 = r5 | r6
            boolean r6 = r3.h(r10)
            r5 = r5 | r6
            boolean r6 = r0.f16477l
            boolean r12 = r3.g(r6)
            r5 = r5 | r12
            boolean r12 = r3.f(r11)
            r5 = r5 | r12
            java.lang.Object r12 = r3.P()
            if (r5 != 0) goto L203
            i0.e r5 = i0.l.f5952a
            if (r12 != r5) goto L20d
        L203:
            hb.x r5 = new hb.x
            r12 = 4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3.k0(r5)
            r12 = r5
        L20d:
            r11 = r12
            fg.l r11 = (fg.l) r11
            r13 = 0
            r14 = 504(0x1f8, float:7.06E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r2
            r12 = r3
            r3 = r1
            a.a.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L223
        L21f:
            r12 = r3
            r12.V()
        L223:
            sf.n r1 = sf.n.f12433a
            return r1
        L226:
            java.lang.Object r1 = r0.f16473h
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f16474i
            r4 = r2
            r.z r4 = (r.z) r4
            java.lang.Object r2 = r0.f16479n
            r9 = r2
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f16480o
            r10 = r2
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r2 = r0.f16478m
            r11 = r2
            fg.l r11 = (fg.l) r11
            java.lang.Object r2 = r0.f16475j
            r8 = r2
            i0.a1 r8 = (i0.a1) r8
            r2 = r18
            p.x0 r2 = (p.x0) r2
            r12 = r19
            i0.h0 r12 = (i0.h0) r12
            r3 = r20
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.getClass()
            r5 = r3 & 6
            if (r5 != 0) goto L264
            boolean r5 = r12.f(r2)
            if (r5 == 0) goto L262
            r5 = 4
            goto L263
        L262:
            r5 = 2
        L263:
            r3 = r3 | r5
        L264:
            r5 = r3 & 19
            r6 = 18
            r7 = 1
            if (r5 == r6) goto L26d
            r5 = r7
            goto L26e
        L26d:
            r5 = 0
        L26e:
            r3 = r3 & r7
            boolean r3 = r12.S(r3, r5)
            if (r3 == 0) goto L2d1
            p.a0 r3 = p.h1.f9915c
            m.a r1 = r1.f12897e
            r5 = 0
            y0.o r3 = r1.f.a(r3, r1, r5)
            float r1 = r2.c()
            r5 = 8
            float r5 = (float) r5
            float r1 = r1 + r5
            float r2 = r2.a()
            r5 = 84
            float r5 = (float) r5
            float r2 = r2 + r5
            r5 = 5
            p.z0 r1 = p.d.b(r1, r2, r5)
            boolean r6 = r0.f16477l
            boolean r2 = r12.g(r6)
            fg.l r7 = r0.f16476k
            boolean r5 = r12.f(r7)
            r2 = r2 | r5
            boolean r5 = r12.h(r9)
            r2 = r2 | r5
            boolean r5 = r12.h(r10)
            r2 = r2 | r5
            boolean r5 = r12.f(r11)
            r2 = r2 | r5
            java.lang.Object r5 = r12.P()
            if (r2 != 0) goto L2b9
            i0.e r2 = i0.l.f5952a
            if (r5 != r2) goto L2c1
        L2b9:
            hb.x r5 = new hb.x
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.k0(r5)
        L2c1:
            r11 = r5
            fg.l r11 = (fg.l) r11
            r13 = 0
            r14 = 504(0x1f8, float:7.06E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r1
            a.a.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L2d4
        L2d1:
            r12.V()
        L2d4:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
