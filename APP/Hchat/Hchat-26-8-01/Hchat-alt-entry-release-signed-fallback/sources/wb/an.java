package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class an implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sh.x f15047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.z f15048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.l f15050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f15051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.p f15052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ fg.l f15053n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fg.l f15054o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15055p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15056q;

    public /* synthetic */ an(sh.x r1, r.z r2, java.lang.String r3, fg.l r4, java.util.ArrayList r5, fg.p r6, fg.l r7, fg.l r8, i0.a1 r9, i0.a1 r10, int r11) {
            r0 = this;
            r0.f15046g = r11
            r0.f15047h = r1
            r0.f15048i = r2
            r0.f15049j = r3
            r0.f15050k = r4
            r0.f15051l = r5
            r0.f15052m = r6
            r0.f15053n = r7
            r0.f15054o = r8
            r0.f15055p = r9
            r0.f15056q = r10
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
            r22 = this;
            r0 = r22
            int r1 = r0.f15046g
            switch(r1) {
                case 0: goto Lbc;
                default: goto L7;
            }
        L7:
            r1 = r23
            p.x0 r1 = (p.x0) r1
            r11 = r24
            i0.h0 r11 = (i0.h0) r11
            r2 = r25
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
            if (r2 == 0) goto Lb6
            p.a0 r2 = p.h1.f9915c
            sh.x r3 = r0.f15047h
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
            java.lang.String r14 = r0.f15049j
            boolean r1 = r11.f(r14)
            fg.l r15 = r0.f15050k
            boolean r3 = r11.f(r15)
            r1 = r1 | r3
            java.util.ArrayList r13 = r0.f15051l
            boolean r3 = r11.h(r13)
            r1 = r1 | r3
            fg.p r3 = r0.f15052m
            boolean r5 = r11.f(r3)
            r1 = r1 | r5
            fg.l r5 = r0.f15053n
            boolean r6 = r11.f(r5)
            r1 = r1 | r6
            fg.l r6 = r0.f15054o
            boolean r7 = r11.f(r6)
            r1 = r1 | r7
            java.lang.Object r7 = r11.P()
            if (r1 != 0) goto L8c
            i0.e r1 = i0.l.f5952a
            if (r7 != r1) goto La5
        L8c:
            wb.f9 r12 = new wb.f9
            r21 = 0
            i0.a1 r1 = r0.f15055p
            i0.a1 r7 = r0.f15056q
            r19 = r1
            r16 = r3
            r17 = r5
            r18 = r6
            r20 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r11.k0(r12)
            r7 = r12
        La5:
            r10 = r7
            fg.l r10 = (fg.l) r10
            r12 = 0
            r13 = 504(0x1f8, float:7.06E-43)
            r.z r3 = r0.f15048i
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            a.a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto Lb9
        Lb6:
            r11.V()
        Lb9:
            sf.n r1 = sf.n.f12433a
            return r1
        Lbc:
            r1 = r23
            p.x0 r1 = (p.x0) r1
            r11 = r24
            i0.h0 r11 = (i0.h0) r11
            r2 = r25
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r3 = r2 & 6
            if (r3 != 0) goto Ldd
            boolean r3 = r11.f(r1)
            if (r3 == 0) goto Ldb
            r3 = 4
            goto Ldc
        Ldb:
            r3 = 2
        Ldc:
            r2 = r2 | r3
        Ldd:
            r3 = r2 & 19
            r4 = 18
            r5 = 1
            if (r3 == r4) goto Le6
            r3 = r5
            goto Le7
        Le6:
            r3 = 0
        Le7:
            r2 = r2 & r5
            boolean r2 = r11.S(r2, r3)
            if (r2 == 0) goto L16b
            p.a0 r2 = p.h1.f9915c
            sh.x r3 = r0.f15047h
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
            java.lang.String r14 = r0.f15049j
            boolean r1 = r11.f(r14)
            fg.l r15 = r0.f15050k
            boolean r3 = r11.f(r15)
            r1 = r1 | r3
            java.util.ArrayList r13 = r0.f15051l
            boolean r3 = r11.h(r13)
            r1 = r1 | r3
            fg.p r3 = r0.f15052m
            boolean r5 = r11.f(r3)
            r1 = r1 | r5
            fg.l r5 = r0.f15053n
            boolean r6 = r11.f(r5)
            r1 = r1 | r6
            fg.l r6 = r0.f15054o
            boolean r7 = r11.f(r6)
            r1 = r1 | r7
            java.lang.Object r7 = r11.P()
            if (r1 != 0) goto L141
            i0.e r1 = i0.l.f5952a
            if (r7 != r1) goto L15a
        L141:
            wb.f9 r12 = new wb.f9
            r21 = 1
            i0.a1 r1 = r0.f15055p
            i0.a1 r7 = r0.f15056q
            r19 = r1
            r16 = r3
            r17 = r5
            r18 = r6
            r20 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r11.k0(r12)
            r7 = r12
        L15a:
            r10 = r7
            fg.l r10 = (fg.l) r10
            r12 = 0
            r13 = 504(0x1f8, float:7.06E-43)
            r.z r3 = r0.f15048i
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            a.a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L16e
        L16b:
            r11.V()
        L16e:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
