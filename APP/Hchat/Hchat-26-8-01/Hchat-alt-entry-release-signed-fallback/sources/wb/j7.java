package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j7 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sh.x f16972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.z f16973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.a f16975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.a f16977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f16981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ fg.p f16982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16985u;

    public /* synthetic */ j7(sh.x r2, r.z r3, java.util.List r4, fg.a r5, java.util.List r6, fg.a r7, java.util.List r8, i0.a1 r9, i0.a1 r10, java.util.ArrayList r11, fg.p r12, i0.a1 r13, i0.a1 r14, i0.a1 r15, int r16) {
            r1 = this;
            r0 = r16
            r1.f16971g = r0
            r1.f16972h = r2
            r1.f16973i = r3
            r1.f16974j = r4
            r1.f16975k = r5
            r1.f16976l = r6
            r1.f16977m = r7
            r1.f16978n = r8
            r1.f16979o = r9
            r1.f16980p = r10
            r1.f16981q = r11
            r1.f16982r = r12
            r1.f16983s = r13
            r1.f16984t = r14
            r1.f16985u = r15
            r1.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
            r26 = this;
            r0 = r26
            int r1 = r0.f16971g
            switch(r1) {
                case 0: goto Ldb;
                default: goto L7;
            }
        L7:
            r1 = r27
            p.x0 r1 = (p.x0) r1
            r11 = r28
            i0.h0 r11 = (i0.h0) r11
            r2 = r29
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
            if (r2 == 0) goto Ld5
            p.a0 r2 = p.h1.f9915c
            sh.x r3 = r0.f16972h
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
            java.util.List r15 = r0.f16974j
            boolean r1 = r11.h(r15)
            fg.a r3 = r0.f16975k
            boolean r5 = r11.f(r3)
            r1 = r1 | r5
            java.util.List r5 = r0.f16976l
            boolean r6 = r11.h(r5)
            r1 = r1 | r6
            fg.a r6 = r0.f16977m
            boolean r7 = r11.f(r6)
            r1 = r1 | r7
            java.util.List r7 = r0.f16978n
            boolean r8 = r11.h(r7)
            r1 = r1 | r8
            i0.a1 r8 = r0.f16979o
            boolean r9 = r11.f(r8)
            r1 = r1 | r9
            i0.a1 r9 = r0.f16980p
            boolean r10 = r11.f(r9)
            r1 = r1 | r10
            java.util.ArrayList r10 = r0.f16981q
            boolean r12 = r11.h(r10)
            r1 = r1 | r12
            fg.p r12 = r0.f16982r
            boolean r13 = r11.f(r12)
            r1 = r1 | r13
            java.lang.Object r13 = r11.P()
            if (r1 != 0) goto La1
            i0.e r1 = i0.l.f5952a
            if (r13 != r1) goto Lc4
        La1:
            r23 = r12
            wb.v9 r12 = new wb.v9
            r25 = 1
            i0.a1 r13 = r0.f16983s
            i0.a1 r14 = r0.f16984t
            i0.a1 r1 = r0.f16985u
            r24 = r1
            r16 = r3
            r17 = r5
            r18 = r6
            r19 = r7
            r21 = r8
            r22 = r9
            r20 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r11.k0(r12)
            r13 = r12
        Lc4:
            r10 = r13
            fg.l r10 = (fg.l) r10
            r12 = 0
            r13 = 504(0x1f8, float:7.06E-43)
            r.z r3 = r0.f16973i
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            a.a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto Ld8
        Ld5:
            r11.V()
        Ld8:
            sf.n r1 = sf.n.f12433a
            return r1
        Ldb:
            r1 = r27
            p.x0 r1 = (p.x0) r1
            r11 = r28
            i0.h0 r11 = (i0.h0) r11
            r2 = r29
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r3 = r2 & 6
            if (r3 != 0) goto Lfc
            boolean r3 = r11.f(r1)
            if (r3 == 0) goto Lfa
            r3 = 4
            goto Lfb
        Lfa:
            r3 = 2
        Lfb:
            r2 = r2 | r3
        Lfc:
            r3 = r2 & 19
            r4 = 18
            r5 = 1
            if (r3 == r4) goto L105
            r3 = r5
            goto L106
        L105:
            r3 = 0
        L106:
            r2 = r2 & r5
            boolean r2 = r11.S(r2, r3)
            if (r2 == 0) goto L1a9
            p.a0 r2 = p.h1.f9915c
            sh.x r3 = r0.f16972h
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
            java.util.List r15 = r0.f16974j
            boolean r1 = r11.h(r15)
            fg.a r3 = r0.f16975k
            boolean r5 = r11.f(r3)
            r1 = r1 | r5
            java.util.List r5 = r0.f16976l
            boolean r6 = r11.h(r5)
            r1 = r1 | r6
            fg.a r6 = r0.f16977m
            boolean r7 = r11.f(r6)
            r1 = r1 | r7
            java.util.List r7 = r0.f16978n
            boolean r8 = r11.h(r7)
            r1 = r1 | r8
            i0.a1 r8 = r0.f16979o
            boolean r9 = r11.f(r8)
            r1 = r1 | r9
            i0.a1 r9 = r0.f16980p
            boolean r10 = r11.f(r9)
            r1 = r1 | r10
            java.util.ArrayList r10 = r0.f16981q
            boolean r12 = r11.h(r10)
            r1 = r1 | r12
            fg.p r12 = r0.f16982r
            boolean r13 = r11.f(r12)
            r1 = r1 | r13
            java.lang.Object r13 = r11.P()
            if (r1 != 0) goto L175
            i0.e r1 = i0.l.f5952a
            if (r13 != r1) goto L198
        L175:
            r23 = r12
            wb.v9 r12 = new wb.v9
            r25 = 0
            i0.a1 r13 = r0.f16983s
            i0.a1 r14 = r0.f16984t
            i0.a1 r1 = r0.f16985u
            r24 = r1
            r16 = r3
            r17 = r5
            r18 = r6
            r19 = r7
            r21 = r8
            r22 = r9
            r20 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r11.k0(r12)
            r13 = r12
        L198:
            r10 = r13
            fg.l r10 = (fg.l) r10
            r12 = 0
            r13 = 504(0x1f8, float:7.06E-43)
            r.z r3 = r0.f16973i
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            a.a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L1ac
        L1a9:
            r11.V()
        L1ac:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
