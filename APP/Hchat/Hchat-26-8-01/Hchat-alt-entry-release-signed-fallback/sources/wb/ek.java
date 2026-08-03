package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ek implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sh.x f15966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.z f15967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f15969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15977s;

    public /* synthetic */ ek(sh.x r2, r.z r3, android.content.Context r4, android.content.SharedPreferences r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13) {
            r1 = this;
            r0 = 1
            r1.f15965g = r0
            r1.<init>()
            r1.f15966h = r2
            r1.f15967i = r3
            r1.f15968j = r4
            r1.f15969k = r5
            r1.f15970l = r6
            r1.f15971m = r7
            r1.f15972n = r8
            r1.f15973o = r9
            r1.f15974p = r10
            r1.f15975q = r11
            r1.f15976r = r12
            r1.f15977s = r13
            return
    }

    public /* synthetic */ ek(sh.x r2, r.z r3, android.content.SharedPreferences r4, android.content.Context r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13) {
            r1 = this;
            r0 = 0
            r1.f15965g = r0
            r1.<init>()
            r1.f15966h = r2
            r1.f15967i = r3
            r1.f15969k = r4
            r1.f15968j = r5
            r1.f15970l = r6
            r1.f15971m = r7
            r1.f15972n = r8
            r1.f15973o = r9
            r1.f15974p = r10
            r1.f15975q = r11
            r1.f15976r = r12
            r1.f15977s = r13
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r24, java.lang.Object r25, java.lang.Object r26) {
            r23 = this;
            r0 = r23
            int r1 = r0.f15965g
            switch(r1) {
                case 0: goto Lae;
                default: goto L7;
            }
        L7:
            r1 = r24
            p.x0 r1 = (p.x0) r1
            r11 = r25
            i0.h0 r11 = (i0.h0) r11
            r2 = r26
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
            if (r2 == 0) goto La8
            p.a0 r2 = p.h1.f9915c
            sh.x r3 = r0.f15966h
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
            android.content.Context r13 = r0.f15968j
            boolean r1 = r11.h(r13)
            android.content.SharedPreferences r15 = r0.f15969k
            boolean r3 = r11.h(r15)
            r1 = r1 | r3
            java.lang.Object r3 = r11.P()
            if (r1 != 0) goto L70
            i0.e r1 = i0.l.f5952a
            if (r3 != r1) goto L97
        L70:
            wb.bl r12 = new wb.bl
            i0.a1 r14 = r0.f15970l
            i0.a1 r1 = r0.f15971m
            i0.a1 r3 = r0.f15972n
            i0.a1 r5 = r0.f15973o
            i0.a1 r6 = r0.f15974p
            i0.a1 r7 = r0.f15975q
            i0.a1 r8 = r0.f15976r
            i0.a1 r9 = r0.f15977s
            r16 = r1
            r17 = r3
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r11.k0(r12)
            r3 = r12
        L97:
            r10 = r3
            fg.l r10 = (fg.l) r10
            r12 = 0
            r13 = 504(0x1f8, float:7.06E-43)
            r.z r3 = r0.f15967i
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            a.a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto Lab
        La8:
            r11.V()
        Lab:
            sf.n r1 = sf.n.f12433a
            return r1
        Lae:
            r1 = r24
            p.x0 r1 = (p.x0) r1
            r11 = r25
            i0.h0 r11 = (i0.h0) r11
            r2 = r26
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r3 = r2 & 6
            if (r3 != 0) goto Lcf
            boolean r3 = r11.f(r1)
            if (r3 == 0) goto Lcd
            r3 = 4
            goto Lce
        Lcd:
            r3 = 2
        Lce:
            r2 = r2 | r3
        Lcf:
            r3 = r2 & 19
            r4 = 18
            r5 = 1
            if (r3 == r4) goto Ld8
            r3 = r5
            goto Ld9
        Ld8:
            r3 = 0
        Ld9:
            r2 = r2 & r5
            boolean r2 = r11.S(r2, r3)
            if (r2 == 0) goto L14f
            p.a0 r2 = p.h1.f9915c
            sh.x r3 = r0.f15966h
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
            android.content.SharedPreferences r13 = r0.f15969k
            boolean r1 = r11.h(r13)
            android.content.Context r14 = r0.f15968j
            boolean r3 = r11.h(r14)
            r1 = r1 | r3
            java.lang.Object r3 = r11.P()
            if (r1 != 0) goto L117
            i0.e r1 = i0.l.f5952a
            if (r3 != r1) goto L13e
        L117:
            wb.bl r12 = new wb.bl
            i0.a1 r15 = r0.f15970l
            i0.a1 r1 = r0.f15971m
            i0.a1 r3 = r0.f15972n
            i0.a1 r5 = r0.f15973o
            i0.a1 r6 = r0.f15974p
            i0.a1 r7 = r0.f15975q
            i0.a1 r8 = r0.f15976r
            i0.a1 r9 = r0.f15977s
            r16 = r1
            r17 = r3
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r11.k0(r12)
            r3 = r12
        L13e:
            r10 = r3
            fg.l r10 = (fg.l) r10
            r12 = 0
            r13 = 504(0x1f8, float:7.06E-43)
            r.z r3 = r0.f15967i
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            a.a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L152
        L14f:
            r11.V()
        L152:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
