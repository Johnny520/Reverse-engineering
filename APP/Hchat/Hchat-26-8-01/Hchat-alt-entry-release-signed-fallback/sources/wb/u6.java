package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u6 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f19360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19365m;

    public /* synthetic */ u6(sh.x r2, r.z r3, android.content.SharedPreferences r4, boolean r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 4
            r1.f19359g = r0
            r1.<init>()
            r1.f19361i = r2
            r1.f19363k = r3
            r1.f19364l = r4
            r1.f19360h = r5
            r1.f19362j = r6
            r1.f19365m = r7
            return
    }

    public /* synthetic */ u6(sh.x r2, r.z r3, boolean r4, fg.l r5, java.util.List r6, fg.a r7) {
            r1 = this;
            r0 = 5
            r1.f19359g = r0
            r1.<init>()
            r1.f19361i = r2
            r1.f19362j = r3
            r1.f19360h = r4
            r1.f19363k = r5
            r1.f19365m = r6
            r1.f19364l = r7
            return
    }

    public /* synthetic */ u6(sh.x r2, r.z r3, boolean r4, fg.l r5, java.util.List r6, fg.l r7) {
            r1 = this;
            r0 = 1
            r1.f19359g = r0
            r1.<init>()
            r1.f19361i = r2
            r1.f19362j = r3
            r1.f19360h = r4
            r1.f19363k = r5
            r1.f19364l = r6
            r1.f19365m = r7
            return
    }

    public /* synthetic */ u6(wb.b3 r2, i0.a1 r3, android.content.Context r4, fg.a r5, java.util.Set r6, boolean r7) {
            r1 = this;
            r0 = 0
            r1.f19359g = r0
            r1.<init>()
            r1.f19361i = r2
            r1.f19362j = r3
            r1.f19363k = r4
            r1.f19364l = r5
            r1.f19365m = r6
            r1.f19360h = r7
            return
    }

    public /* synthetic */ u6(boolean r2, android.content.Context r3, android.content.SharedPreferences r4, fg.a r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 3
            r1.f19359g = r0
            r1.<init>()
            r1.f19360h = r2
            r1.f19363k = r3
            r1.f19361i = r4
            r1.f19364l = r5
            r1.f19362j = r6
            r1.f19365m = r7
            return
    }

    public /* synthetic */ u6(boolean r2, i0.a1 r3, android.content.SharedPreferences r4, java.lang.String r5, i0.a1 r6, java.lang.String r7) {
            r1 = this;
            r0 = 2
            r1.f19359g = r0
            r1.<init>()
            r1.f19360h = r2
            r1.f19362j = r3
            r1.f19361i = r4
            r1.f19363k = r5
            r1.f19364l = r6
            r1.f19365m = r7
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
            r16 = this;
            r0 = r16
            int r1 = r0.f19359g
            switch(r1) {
                case 0: goto L2be;
                case 1: goto L218;
                case 2: goto L1c0;
                case 3: goto L149;
                case 4: goto Lad;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f19361i
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f19362j
            r4 = r2
            r.z r4 = (r.z) r4
            java.lang.Object r2 = r0.f19363k
            r7 = r2
            fg.l r7 = (fg.l) r7
            java.lang.Object r2 = r0.f19365m
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r0.f19364l
            r9 = r2
            fg.a r9 = (fg.a) r9
            r2 = r17
            p.x0 r2 = (p.x0) r2
            r12 = r18
            i0.h0 r12 = (i0.h0) r12
            r3 = r19
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.getClass()
            r5 = r3 & 6
            if (r5 != 0) goto L40
            boolean r5 = r12.f(r2)
            if (r5 == 0) goto L3e
            r5 = 4
            goto L3f
        L3e:
            r5 = 2
        L3f:
            r3 = r3 | r5
        L40:
            r5 = r3 & 19
            r6 = 18
            r10 = 1
            if (r5 == r6) goto L49
            r5 = r10
            goto L4a
        L49:
            r5 = 0
        L4a:
            r3 = r3 & r10
            boolean r3 = r12.S(r3, r5)
            if (r3 == 0) goto La7
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
            boolean r6 = r0.f19360h
            boolean r2 = r12.g(r6)
            boolean r5 = r12.f(r7)
            r2 = r2 | r5
            boolean r5 = r12.h(r8)
            r2 = r2 | r5
            boolean r5 = r12.f(r9)
            r2 = r2 | r5
            java.lang.Object r5 = r12.P()
            if (r2 != 0) goto L8e
            i0.e r2 = i0.l.f5952a
            if (r5 != r2) goto L97
        L8e:
            d9.h r5 = new d9.h
            r10 = 4
            r5.<init>(r6, r7, r8, r9, r10)
            r12.k0(r5)
        L97:
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
            goto Laa
        La7:
            r12.V()
        Laa:
            sf.n r1 = sf.n.f12433a
            return r1
        Lad:
            java.lang.Object r1 = r0.f19361i
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f19363k
            r4 = r2
            r.z r4 = (r.z) r4
            java.lang.Object r2 = r0.f19364l
            r7 = r2
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.lang.Object r2 = r0.f19362j
            r8 = r2
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r2 = r0.f19365m
            r9 = r2
            i0.a1 r9 = (i0.a1) r9
            r2 = r17
            p.x0 r2 = (p.x0) r2
            r12 = r18
            i0.h0 r12 = (i0.h0) r12
            r3 = r19
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.getClass()
            r5 = r3 & 6
            if (r5 != 0) goto Le6
            boolean r5 = r12.f(r2)
            if (r5 == 0) goto Le4
            r5 = 4
            goto Le5
        Le4:
            r5 = 2
        Le5:
            r3 = r3 | r5
        Le6:
            r5 = r3 & 19
            r6 = 18
            r10 = 1
            if (r5 == r6) goto Lef
            r5 = r10
            goto Lf0
        Lef:
            r5 = 0
        Lf0:
            r3 = r3 & r10
            boolean r3 = r12.S(r3, r5)
            if (r3 == 0) goto L143
            p.a0 r3 = p.h1.f9915c
            m.a r1 = r1.f12897e
            r5 = 0
            y0.o r3 = r1.f.a(r3, r1, r5)
            float r1 = r2.c()
            r5 = 8
            float r5 = (float) r5
            float r1 = r1 + r5
            float r2 = r2.a()
            r5 = 20
            float r5 = (float) r5
            float r2 = r2 + r5
            r5 = 5
            p.z0 r1 = p.d.b(r1, r2, r5)
            boolean r2 = r12.h(r7)
            boolean r10 = r0.f19360h
            boolean r5 = r12.g(r10)
            r2 = r2 | r5
            java.lang.Object r5 = r12.P()
            if (r2 != 0) goto L12a
            i0.e r2 = i0.l.f5952a
            if (r5 != r2) goto L133
        L12a:
            d9.h r5 = new d9.h
            r6 = 6
            r5.<init>(r6, r7, r8, r9, r10)
            r12.k0(r5)
        L133:
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
            goto L146
        L143:
            r12.V()
        L146:
            sf.n r1 = sf.n.f12433a
            return r1
        L149:
            java.lang.Object r1 = r0.f19363k
            r4 = r1
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r1 = r0.f19361i
            r5 = r1
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.Object r1 = r0.f19364l
            r9 = r1
            fg.a r9 = (fg.a) r9
            java.lang.Object r1 = r0.f19362j
            r6 = r1
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r1 = r0.f19365m
            r7 = r1
            i0.a1 r7 = (i0.a1) r7
            r1 = r17
            th.a r1 = (th.a) r1
            r12 = r18
            i0.h0 r12 = (i0.h0) r12
            r2 = r19
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r3 = 16
            r8 = 1
            if (r1 == r3) goto L17e
            r1 = r8
            goto L17f
        L17e:
            r1 = 0
        L17f:
            r2 = r2 & r8
            boolean r1 = r12.S(r2, r1)
            if (r1 == 0) goto L1ba
            boolean r3 = r0.f19360h
            boolean r1 = r12.g(r3)
            boolean r2 = r12.h(r4)
            r1 = r1 | r2
            boolean r2 = r12.h(r5)
            r1 = r1 | r2
            java.lang.Object r2 = r12.P()
            if (r1 != 0) goto L1a0
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L1a9
        L1a0:
            wb.ji r2 = new wb.ji
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r12.k0(r2)
        L1a9:
            r7 = r2
            fg.a r7 = (fg.a) r7
            r13 = 390(0x186, float:5.47E-43)
            r14 = 48
            java.lang.String r6 = "保存设置"
            java.lang.String r8 = "返回"
            r10 = 0
            r11 = 0
            wb.ho.M(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L1bd
        L1ba:
            r12.V()
        L1bd:
            sf.n r1 = sf.n.f12433a
            return r1
        L1c0:
            java.lang.Object r1 = r0.f19362j
            r4 = r1
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r1 = r0.f19361i
            r5 = r1
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.Object r1 = r0.f19363k
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r0.f19364l
            r7 = r1
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r1 = r0.f19365m
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            r1 = r17
            r.d r1 = (r.d) r1
            r9 = r18
            i0.h0 r9 = (i0.h0) r9
            r2 = r19
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r3 = 16
            r10 = 1
            if (r1 == r3) goto L1f5
            r1 = r10
            goto L1f6
        L1f5:
            r1 = 0
        L1f6:
            r2 = r2 & r10
            boolean r1 = r9.S(r2, r1)
            if (r1 == 0) goto L212
            wb.z4 r2 = new wb.z4
            boolean r3 = r0.f19360h
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = 920026191(0x36d67c4f, float:6.3921684E-6)
            s0.d r1 = s0.i.e(r1, r2, r9)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r9, r2, r10)
            goto L215
        L212:
            r9.V()
        L215:
            sf.n r1 = sf.n.f12433a
            return r1
        L218:
            java.lang.Object r1 = r0.f19361i
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f19362j
            r4 = r2
            r.z r4 = (r.z) r4
            java.lang.Object r2 = r0.f19363k
            r8 = r2
            fg.l r8 = (fg.l) r8
            java.lang.Object r2 = r0.f19364l
            r7 = r2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r0.f19365m
            r9 = r2
            fg.l r9 = (fg.l) r9
            r2 = r17
            p.x0 r2 = (p.x0) r2
            r12 = r18
            i0.h0 r12 = (i0.h0) r12
            r3 = r19
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.getClass()
            r5 = r3 & 6
            if (r5 != 0) goto L251
            boolean r5 = r12.f(r2)
            if (r5 == 0) goto L24f
            r5 = 4
            goto L250
        L24f:
            r5 = 2
        L250:
            r3 = r3 | r5
        L251:
            r5 = r3 & 19
            r6 = 18
            r10 = 1
            if (r5 == r6) goto L25a
            r5 = r10
            goto L25b
        L25a:
            r5 = 0
        L25b:
            r3 = r3 & r10
            boolean r3 = r12.S(r3, r5)
            if (r3 == 0) goto L2b8
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
            boolean r10 = r0.f19360h
            boolean r2 = r12.g(r10)
            boolean r5 = r12.f(r8)
            r2 = r2 | r5
            boolean r5 = r12.h(r7)
            r2 = r2 | r5
            boolean r5 = r12.f(r9)
            r2 = r2 | r5
            java.lang.Object r5 = r12.P()
            if (r2 != 0) goto L29f
            i0.e r2 = i0.l.f5952a
            if (r5 != r2) goto L2a8
        L29f:
            d9.h r5 = new d9.h
            r6 = 3
            r5.<init>(r6, r7, r8, r9, r10)
            r12.k0(r5)
        L2a8:
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
            goto L2bb
        L2b8:
            r12.V()
        L2bb:
            sf.n r1 = sf.n.f12433a
            return r1
        L2be:
            java.lang.Object r1 = r0.f19361i
            r3 = r1
            wb.b3 r3 = (wb.b3) r3
            java.lang.Object r1 = r0.f19362j
            r6 = r1
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r1 = r0.f19363k
            r4 = r1
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r1 = r0.f19364l
            r5 = r1
            fg.a r5 = (fg.a) r5
            java.lang.Object r1 = r0.f19365m
            java.util.Set r1 = (java.util.Set) r1
            r2 = r17
            th.a r2 = (th.a) r2
            r13 = r18
            i0.h0 r13 = (i0.h0) r13
            r7 = r19
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.getClass()
            r2 = r7 & 17
            r8 = 16
            r9 = 1
            r10 = 0
            if (r2 == r8) goto L2f3
            r2 = r9
            goto L2f4
        L2f3:
            r2 = r10
        L2f4:
            r7 = r7 & r9
            boolean r2 = r13.S(r7, r2)
            if (r2 == 0) goto L390
            boolean r2 = r13.f(r3)
            boolean r7 = r13.f(r6)
            r2 = r2 | r7
            boolean r7 = r13.h(r4)
            r2 = r2 | r7
            boolean r7 = r13.f(r5)
            r2 = r2 | r7
            java.lang.Object r7 = r13.P()
            i0.e r8 = i0.l.f5952a
            if (r2 != 0) goto L318
            if (r7 != r8) goto L323
        L318:
            c9.n0 r2 = new c9.n0
            r7 = 12
            r2.<init>(r3, r4, r5, r6, r7)
            r13.k0(r2)
            r7 = r2
        L323:
            fg.a r7 = (fg.a) r7
            boolean r2 = r3.f15149d
            boolean r4 = r0.f19360h
            r9 = 0
            if (r2 == 0) goto L33e
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L33e
            if (r4 == 0) goto L33a
            java.lang.String r2 = "取消全选"
            goto L33c
        L33a:
            java.lang.String r2 = "全选"
        L33c:
            r11 = r2
            goto L33f
        L33e:
            r11 = r9
        L33f:
            boolean r2 = r3.f15149d
            if (r2 == 0) goto L379
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L379
            r2 = -655094133(0xffffffffd8f40e8b, float:-2.1467464E15)
            r13.a0(r2)
            boolean r2 = r13.f(r6)
            boolean r3 = r13.g(r4)
            r2 = r2 | r3
            boolean r3 = r13.h(r1)
            r2 = r2 | r3
            java.lang.Object r3 = r13.P()
            if (r2 != 0) goto L368
            if (r3 != r8) goto L371
        L368:
            wb.p1 r3 = new wb.p1
            r2 = 4
            r3.<init>(r4, r1, r6, r2)
            r13.k0(r3)
        L371:
            r9 = r3
            fg.a r9 = (fg.a) r9
            r13.p(r10)
        L377:
            r12 = r9
            goto L383
        L379:
            r1 = -654806205(0xffffffffd8f87343, float:-2.1853914E15)
            r13.a0(r1)
            r13.p(r10)
            goto L377
        L383:
            r14 = 390(0x186, float:5.47E-43)
            r15 = 0
            r8 = r7
            java.lang.String r7 = "保存选择"
            java.lang.String r9 = "返回"
            r10 = r5
            wb.ho.M(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L393
        L390:
            r13.V()
        L393:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
