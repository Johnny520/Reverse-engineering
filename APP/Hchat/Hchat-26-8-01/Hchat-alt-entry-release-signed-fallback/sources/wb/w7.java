package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w7 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sh.x f19876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.z f19877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19882n;

    public /* synthetic */ w7(sh.x r1, r.z r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, int r8) {
            r0 = this;
            r0.f19875g = r8
            r0.f19876h = r1
            r0.f19877i = r2
            r0.f19878j = r3
            r0.f19879k = r4
            r0.f19880l = r5
            r0.f19881m = r6
            r0.f19882n = r7
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
            r19 = this;
            r0 = r19
            int r1 = r0.f19875g
            switch(r1) {
                case 0: goto L1b7;
                case 1: goto L127;
                case 2: goto L97;
                default: goto L7;
            }
        L7:
            r1 = r20
            p.x0 r1 = (p.x0) r1
            r11 = r21
            i0.h0 r11 = (i0.h0) r11
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r3 = r2 & 6
            if (r3 != 0) goto L28
            boolean r3 = r11.f(r1)
            if (r3 == 0) goto L26
            r3 = 4
            goto L27
        L26:
            r3 = 2
        L27:
            r2 = r2 | r3
        L28:
            r3 = r2 & 19
            r4 = 18
            r5 = 1
            if (r3 == r4) goto L31
            r3 = r5
            goto L32
        L31:
            r3 = 0
        L32:
            r2 = r2 & r5
            boolean r2 = r11.S(r2, r3)
            if (r2 == 0) goto L91
            p.a0 r2 = p.h1.f9915c
            sh.x r3 = r0.f19876h
            m.a r3 = r3.f12897e
            r4 = 0
            y0.o r2 = r1.f.a(r2, r3, r4)
            float r3 = r1.c()
            r4 = 8
            float r4 = (float) r4
            float r3 = r3 + r4
            float r1 = r1.a()
            r4 = 84
            float r4 = (float) r4
            float r1 = r1 + r4
            r4 = 5
            p.z0 r4 = p.d.b(r3, r1, r4)
            android.content.SharedPreferences r13 = r0.f19878j
            boolean r1 = r11.h(r13)
            java.lang.Object r3 = r11.P()
            if (r1 != 0) goto L69
            i0.e r1 = i0.l.f5952a
            if (r3 != r1) goto L80
        L69:
            wb.eh r12 = new wb.eh
            r18 = 4
            i0.a1 r14 = r0.f19879k
            i0.a1 r15 = r0.f19880l
            i0.a1 r1 = r0.f19881m
            i0.a1 r3 = r0.f19882n
            r16 = r1
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r11.k0(r12)
            r3 = r12
        L80:
            r10 = r3
            fg.l r10 = (fg.l) r10
            r12 = 0
            r13 = 504(0x1f8, float:7.06E-43)
            r.z r3 = r0.f19877i
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            a.a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L94
        L91:
            r11.V()
        L94:
            sf.n r1 = sf.n.f12433a
            return r1
        L97:
            r1 = r20
            p.x0 r1 = (p.x0) r1
            r11 = r21
            i0.h0 r11 = (i0.h0) r11
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r3 = r2 & 6
            if (r3 != 0) goto Lb8
            boolean r3 = r11.f(r1)
            if (r3 == 0) goto Lb6
            r3 = 4
            goto Lb7
        Lb6:
            r3 = 2
        Lb7:
            r2 = r2 | r3
        Lb8:
            r3 = r2 & 19
            r4 = 18
            r5 = 1
            if (r3 == r4) goto Lc1
            r3 = r5
            goto Lc2
        Lc1:
            r3 = 0
        Lc2:
            r2 = r2 & r5
            boolean r2 = r11.S(r2, r3)
            if (r2 == 0) goto L121
            p.a0 r2 = p.h1.f9915c
            sh.x r3 = r0.f19876h
            m.a r3 = r3.f12897e
            r4 = 0
            y0.o r2 = r1.f.a(r2, r3, r4)
            float r3 = r1.c()
            r4 = 8
            float r4 = (float) r4
            float r3 = r3 + r4
            float r1 = r1.a()
            r4 = 84
            float r4 = (float) r4
            float r1 = r1 + r4
            r4 = 5
            p.z0 r4 = p.d.b(r3, r1, r4)
            android.content.SharedPreferences r13 = r0.f19878j
            boolean r1 = r11.h(r13)
            java.lang.Object r3 = r11.P()
            if (r1 != 0) goto Lf9
            i0.e r1 = i0.l.f5952a
            if (r3 != r1) goto L110
        Lf9:
            wb.eh r12 = new wb.eh
            r18 = 2
            i0.a1 r14 = r0.f19879k
            i0.a1 r15 = r0.f19880l
            i0.a1 r1 = r0.f19881m
            i0.a1 r3 = r0.f19882n
            r16 = r1
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r11.k0(r12)
            r3 = r12
        L110:
            r10 = r3
            fg.l r10 = (fg.l) r10
            r12 = 0
            r13 = 504(0x1f8, float:7.06E-43)
            r.z r3 = r0.f19877i
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            a.a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L124
        L121:
            r11.V()
        L124:
            sf.n r1 = sf.n.f12433a
            return r1
        L127:
            r1 = r20
            p.x0 r1 = (p.x0) r1
            r11 = r21
            i0.h0 r11 = (i0.h0) r11
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r3 = r2 & 6
            if (r3 != 0) goto L148
            boolean r3 = r11.f(r1)
            if (r3 == 0) goto L146
            r3 = 4
            goto L147
        L146:
            r3 = 2
        L147:
            r2 = r2 | r3
        L148:
            r3 = r2 & 19
            r4 = 18
            r5 = 1
            if (r3 == r4) goto L151
            r3 = r5
            goto L152
        L151:
            r3 = 0
        L152:
            r2 = r2 & r5
            boolean r2 = r11.S(r2, r3)
            if (r2 == 0) goto L1b1
            p.a0 r2 = p.h1.f9915c
            sh.x r3 = r0.f19876h
            m.a r3 = r3.f12897e
            r4 = 0
            y0.o r2 = r1.f.a(r2, r3, r4)
            float r3 = r1.c()
            r4 = 8
            float r4 = (float) r4
            float r3 = r3 + r4
            float r1 = r1.a()
            r4 = 84
            float r4 = (float) r4
            float r1 = r1 + r4
            r4 = 5
            p.z0 r4 = p.d.b(r3, r1, r4)
            android.content.SharedPreferences r13 = r0.f19878j
            boolean r1 = r11.h(r13)
            java.lang.Object r3 = r11.P()
            if (r1 != 0) goto L189
            i0.e r1 = i0.l.f5952a
            if (r3 != r1) goto L1a0
        L189:
            wb.eh r12 = new wb.eh
            r18 = 3
            i0.a1 r14 = r0.f19879k
            i0.a1 r15 = r0.f19880l
            i0.a1 r1 = r0.f19881m
            i0.a1 r3 = r0.f19882n
            r16 = r1
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r11.k0(r12)
            r3 = r12
        L1a0:
            r10 = r3
            fg.l r10 = (fg.l) r10
            r12 = 0
            r13 = 504(0x1f8, float:7.06E-43)
            r.z r3 = r0.f19877i
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            a.a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L1b4
        L1b1:
            r11.V()
        L1b4:
            sf.n r1 = sf.n.f12433a
            return r1
        L1b7:
            r1 = r20
            p.x0 r1 = (p.x0) r1
            r11 = r21
            i0.h0 r11 = (i0.h0) r11
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r3 = r2 & 6
            if (r3 != 0) goto L1d8
            boolean r3 = r11.f(r1)
            if (r3 == 0) goto L1d6
            r3 = 4
            goto L1d7
        L1d6:
            r3 = 2
        L1d7:
            r2 = r2 | r3
        L1d8:
            r3 = r2 & 19
            r4 = 18
            r5 = 1
            if (r3 == r4) goto L1e1
            r3 = r5
            goto L1e2
        L1e1:
            r3 = 0
        L1e2:
            r2 = r2 & r5
            boolean r2 = r11.S(r2, r3)
            if (r2 == 0) goto L241
            p.a0 r2 = p.h1.f9915c
            sh.x r3 = r0.f19876h
            m.a r3 = r3.f12897e
            r4 = 0
            y0.o r2 = r1.f.a(r2, r3, r4)
            float r3 = r1.c()
            r4 = 8
            float r4 = (float) r4
            float r3 = r3 + r4
            float r1 = r1.a()
            r4 = 84
            float r4 = (float) r4
            float r1 = r1 + r4
            r4 = 5
            p.z0 r4 = p.d.b(r3, r1, r4)
            android.content.SharedPreferences r13 = r0.f19878j
            boolean r1 = r11.h(r13)
            java.lang.Object r3 = r11.P()
            if (r1 != 0) goto L219
            i0.e r1 = i0.l.f5952a
            if (r3 != r1) goto L230
        L219:
            wb.eh r12 = new wb.eh
            r18 = 1
            i0.a1 r14 = r0.f19879k
            i0.a1 r15 = r0.f19880l
            i0.a1 r1 = r0.f19881m
            i0.a1 r3 = r0.f19882n
            r16 = r1
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r11.k0(r12)
            r3 = r12
        L230:
            r10 = r3
            fg.l r10 = (fg.l) r10
            r12 = 0
            r13 = 504(0x1f8, float:7.06E-43)
            r.z r3 = r0.f19877i
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            a.a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L244
        L241:
            r11.V()
        L244:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
