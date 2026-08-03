package xb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s1.t f21500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s1.k0 f21501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fg.p f21502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s1.k0 f21503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public gg.t f21504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f21505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f21507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f21510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ fg.l f21511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ fg.p f21512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fg.a f21513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ fg.l f21514u;

    public j(fg.l r1, fg.p r2, fg.a r3, fg.l r4, wf.c r5) {
            r0 = this;
            r0.f21511r = r1
            r0.f21512s = r2
            r0.f21513t = r3
            r0.f21514u = r4
            r0.<init>(r5)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r7, wf.c r8) {
            r6 = this;
            xb.j r0 = new xb.j
            fg.a r3 = r6.f21513t
            fg.l r4 = r6.f21514u
            fg.l r1 = r6.f21511r
            fg.p r2 = r6.f21512s
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f21510q = r7
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            s1.k0 r1 = (s1.k0) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            xb.j r1 = (xb.j) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            r25 = this;
            r0 = r25
            java.lang.Object r1 = r0.f21510q
            s1.k0 r1 = (s1.k0) r1
            int r2 = r0.f21509p
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            xf.a r8 = xf.a.f21579g
            if (r2 == 0) goto L4f
            if (r2 == r6) goto L49
            if (r2 == r4) goto L41
            if (r2 != r3) goto L3a
            long r1 = r0.f21507n
            long r9 = r0.f21506m
            int r4 = r0.f21508o
            long r11 = r0.f21505l
            gg.t r6 = r0.f21504k
            s1.k0 r13 = r0.f21503j
            fg.p r14 = r0.f21502i
            s1.k0 r15 = r0.f21501h
            f8.i.I0(r26)
            r3 = r26
            r21 = r1
            r2 = r13
            r1 = r15
            r23 = r9
            r9 = r14
            r14 = r11
            r10 = r21
            r12 = r23
            goto Le2
        L3a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r1 = 0
            return r1
        L41:
            s1.t r2 = r0.f21500g
            f8.i.I0(r26)
            r4 = r26
            goto L70
        L49:
            f8.i.I0(r26)
            r2 = r26
            goto L60
        L4f:
            f8.i.I0(r26)
            r0.f21510q = r1
            r0.f21509p = r6
            s1.l r2 = s1.l.f12274g
            java.lang.Object r2 = m.y2.a(r1, r5, r2, r0)
            if (r2 != r8) goto L60
            goto Le1
        L60:
            s1.t r2 = (s1.t) r2
            r0.f21510q = r1
            r0.f21500g = r2
            r0.f21509p = r4
            java.lang.Object r4 = m.y2.b(r1, r0, r4)
            if (r4 != r8) goto L70
            goto Le1
        L70:
            s1.t r4 = (s1.t) r4
            fg.l r9 = r0.f21511r
            r9.invoke(r4)
            e1.b r4 = new e1.b
            r9 = 0
            r4.<init>(r9)
            fg.p r9 = r0.f21512s
            r9.invoke(r2, r4)
            long r10 = r2.f12291a
            s1.l0 r2 = r1.f12273l
            s1.k r2 = r2.f12283z
            java.lang.Object r2 = r2.f12262a
            int r4 = r2.size()
            r12 = r5
        L90:
            if (r12 >= r4) goto La5
            java.lang.Object r13 = r2.get(r12)
            r14 = r13
            s1.t r14 = (s1.t) r14
            long r14 = r14.f12291a
            boolean r14 = s1.s.e(r14, r10)
            if (r14 == 0) goto La2
            goto La6
        La2:
            int r12 = r12 + 1
            goto L90
        La5:
            r13 = r7
        La6:
            s1.t r13 = (s1.t) r13
            if (r13 == 0) goto Laf
            boolean r2 = r13.f12294d
            if (r2 != r6) goto Laf
            goto Lb0
        Laf:
            r6 = r5
        Lb0:
            r2 = r6 ^ 1
            if (r6 != 0) goto Lb6
            goto L18a
        Lb6:
            r12 = r10
        Lb7:
            gg.t r4 = new gg.t
            r4.<init>()
            r4.f4563g = r10
            r6 = r4
            r14 = r12
            r4 = r2
            r12 = r10
            r2 = r1
        Lc3:
            r0.f21510q = r7
            r0.f21500g = r7
            r0.f21501h = r1
            r0.f21502i = r9
            r0.f21503j = r2
            r0.f21504k = r6
            r0.f21505l = r14
            r0.f21508o = r4
            r0.f21506m = r12
            r0.f21507n = r10
            r0.f21509p = r3
            s1.l r3 = s1.l.f12275h
            java.lang.Object r3 = r2.e(r3, r0)
            if (r3 != r8) goto Le2
        Le1:
            return r8
        Le2:
            s1.k r3 = (s1.k) r3
            java.lang.Object r7 = r3.f12262a
            int r5 = r7.size()
            r26 = r1
            r1 = 0
        Led:
            if (r1 >= r5) goto L113
            java.lang.Object r16 = r7.get(r1)
            r17 = r1
            r1 = r16
            s1.t r1 = (s1.t) r1
            r18 = r2
            long r1 = r1.f12291a
            r19 = r4
            r20 = r5
            long r4 = r6.f4563g
            boolean r1 = s1.s.e(r1, r4)
            if (r1 == 0) goto L10a
            goto L119
        L10a:
            int r1 = r17 + 1
            r2 = r18
            r4 = r19
            r5 = r20
            goto Led
        L113:
            r18 = r2
            r19 = r4
            r16 = 0
        L119:
            r1 = r16
            s1.t r1 = (s1.t) r1
            if (r1 == 0) goto L15e
            boolean r2 = s1.s.d(r1)
            if (r2 == 0) goto L148
            java.lang.Object r2 = r3.f12262a
            int r3 = r2.size()
            r4 = 0
        L12c:
            if (r4 >= r3) goto L13d
            java.lang.Object r5 = r2.get(r4)
            r7 = r5
            s1.t r7 = (s1.t) r7
            boolean r7 = r7.f12294d
            if (r7 == 0) goto L13a
            goto L13e
        L13a:
            int r4 = r4 + 1
            goto L12c
        L13d:
            r5 = 0
        L13e:
            s1.t r5 = (s1.t) r5
            if (r5 != 0) goto L143
            goto L15f
        L143:
            long r1 = r5.f12291a
            r6.f4563g = r1
            goto L153
        L148:
            long r2 = r1.f12297g
            long r4 = r1.f12293c
            boolean r2 = e1.b.b(r2, r4)
            if (r2 != 0) goto L153
            goto L15f
        L153:
            r1 = r26
            r2 = r18
            r4 = r19
            r3 = 3
            r5 = 0
            r7 = 0
            goto Lc3
        L15e:
            r1 = 0
        L15f:
            if (r1 == 0) goto L167
            boolean r2 = r1.b()
            if (r2 == 0) goto L169
        L167:
            r7 = 0
            goto L18a
        L169:
            boolean r2 = s1.s.d(r1)
            if (r2 == 0) goto L171
            r7 = r1
            goto L18a
        L171:
            r2 = 0
            long r3 = s1.s.h(r1, r2)
            e1.b r5 = new e1.b
            r5.<init>(r3)
            r9.invoke(r1, r5)
            long r10 = r1.f12291a
            r1 = r26
            r5 = r2
            r12 = r14
            r2 = r19
            r3 = 3
            r7 = 0
            goto Lb7
        L18a:
            if (r7 != 0) goto L192
            fg.a r1 = r0.f21513t
            r1.invoke()
            goto L197
        L192:
            fg.l r1 = r0.f21514u
            r1.invoke(r7)
        L197:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
