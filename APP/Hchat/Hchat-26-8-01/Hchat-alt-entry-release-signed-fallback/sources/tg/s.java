package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3.q f13245a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l3.q f13246b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l3.q f13247c = null;

    static {
            l3.q r0 = new l3.q
            java.lang.String r1 = "NO_VALUE"
            r2 = 1
            r0.<init>(r1, r2)
            tg.s.f13245a = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "NONE"
            r0.<init>(r1, r2)
            tg.s.f13246b = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "PENDING"
            r0.<init>(r1, r2)
            tg.s.f13247c = r0
            return
    }

    public static tg.r a(int r2, sg.a r3) {
            r0 = r2 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r0 = r1
            goto L8
        L7:
            r0 = 1
        L8:
            r2 = r2 & 2
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 16
        Lf:
            if (r0 > 0) goto L1f
            if (r1 > 0) goto L1f
            sg.a r2 = sg.a.f12436g
            if (r3 != r2) goto L18
            goto L1f
        L18:
            java.lang.String r2 = "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "
            j8.o.z(r3, r2)
            r2 = 0
            return r2
        L1f:
            int r1 = r1 + r0
            if (r1 >= 0) goto L25
            r1 = 2147483647(0x7fffffff, float:NaN)
        L25:
            tg.r r2 = new tg.r
            r2.<init>(r0, r1, r3)
            return r2
    }

    public static final tg.b0 b(java.lang.Object r1) {
            tg.b0 r0 = new tg.b0
            if (r1 != 0) goto L6
            l3.q r1 = ug.c.f13807b
        L6:
            r0.<init>(r1)
            return r0
    }

    public static final void c(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            int r1 = (int) r1
            int r2 = r0.length
            int r2 = r2 + (-1)
            r1 = r1 & r2
            r0[r1] = r3
            return
    }

    public static final tg.d d(tg.d r1) {
            boolean r0 = r1 instanceof tg.z
            if (r0 == 0) goto L5
            return r1
        L5:
            boolean r0 = r1 instanceof tg.c
            if (r0 == 0) goto La
            return r1
        La:
            tg.c r0 = new tg.c
            r0.<init>(r1)
            return r0
    }

    public static final java.lang.Object e(tg.e r7, sg.o r8, boolean r9, yf.c r10) {
            boolean r0 = r10 instanceof tg.f
            if (r0 == 0) goto L13
            r0 = r10
            tg.f r0 = (tg.f) r0
            int r1 = r0.f13199l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13199l = r1
            goto L18
        L13:
            tg.f r0 = new tg.f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f13198k
            int r1 = r0.f13199l
            r2 = 0
            r3 = 2
            r4 = 1
            xf.a r5 = xf.a.f21579g
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L37
            boolean r9 = r0.f13197j
            sg.b r7 = r0.f13196i
            sg.g r8 = r0.f13195h
            tg.e r1 = r0.f13194g
            f8.i.I0(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L51
        L35:
            r7 = move-exception
            goto L8b
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            return r7
        L3e:
            boolean r9 = r0.f13197j
            sg.b r7 = r0.f13196i
            sg.g r8 = r0.f13195h
            tg.e r1 = r0.f13194g
            f8.i.I0(r10)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4a:
            f8.i.I0(r10)
            sg.b r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L51:
            r0.f13194g = r7     // Catch: java.lang.Throwable -> L35
            r0.f13195h = r8     // Catch: java.lang.Throwable -> L35
            r0.f13196i = r10     // Catch: java.lang.Throwable -> L35
            r0.f13197j = r9     // Catch: java.lang.Throwable -> L35
            r0.f13199l = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L62
            goto L82
        L62:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L83
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f13194g = r1     // Catch: java.lang.Throwable -> L35
            r0.f13195h = r8     // Catch: java.lang.Throwable -> L35
            r0.f13196i = r7     // Catch: java.lang.Throwable -> L35
            r0.f13197j = r9     // Catch: java.lang.Throwable -> L35
            r0.f13199l = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.e(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L82:
            return r5
        L83:
            if (r9 == 0) goto L88
            r8.a(r2)
        L88:
            sf.n r7 = sf.n.f12433a
            return r7
        L8b:
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r10 = move-exception
            if (r9 == 0) goto La5
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L96
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L96:
            if (r2 != 0) goto La2
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La2:
            r8.a(r2)
        La5:
            throw r10
    }

    public static final java.lang.Object f(tg.d r5, fg.p r6, yf.c r7) {
            l3.q r0 = ug.c.f13807b
            boolean r1 = r7 instanceof tg.l
            if (r1 == 0) goto L15
            r1 = r7
            tg.l r1 = (tg.l) r1
            int r2 = r1.f13223k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f13223k = r2
            goto L1a
        L15:
            tg.l r1 = new tg.l
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f13222j
            int r2 = r1.f13223k
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            h0.l0 r5 = r1.f13221i
            gg.u r6 = r1.f13220h
            yf.i r1 = r1.f13219g
            fg.p r1 = (fg.p) r1
            f8.i.I0(r7)     // Catch: ug.a -> L2f
            goto L68
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L38:
            f8.i.I0(r7)
            gg.u r7 = new gg.u
            r7.<init>()
            r7.f4564g = r0
            h0.l0 r2 = new h0.l0
            r4 = 2
            r2.<init>(r6, r4, r7)
            r4 = r6
            yf.i r4 = (yf.i) r4     // Catch: ug.a -> L5f
            r1.f13219g = r4     // Catch: ug.a -> L5f
            r1.f13220h = r7     // Catch: ug.a -> L5f
            r1.f13221i = r2     // Catch: ug.a -> L5f
            r1.f13223k = r3     // Catch: ug.a -> L5f
            java.lang.Object r5 = r5.b(r2, r1)     // Catch: ug.a -> L5f
            xf.a r1 = xf.a.f21579g
            if (r5 != r1) goto L5c
            return r1
        L5c:
            r1 = r6
            r6 = r7
            goto L68
        L5f:
            r5 = move-exception
            r1 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L64:
            java.lang.Object r2 = r7.f13801g
            if (r2 != r5) goto L81
        L68:
            java.lang.Object r5 = r6.f4564g
            if (r5 == r0) goto L6d
            return r5
        L6d:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L81:
            throw r7
    }

    public static final java.lang.Object g(xb.g r5, yf.c r6) {
            l3.q r0 = ug.c.f13807b
            boolean r1 = r6 instanceof tg.k
            if (r1 == 0) goto L15
            r1 = r6
            tg.k r1 = (tg.k) r1
            int r2 = r1.f13218j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f13218j = r2
            goto L1a
        L15:
            tg.k r1 = new tg.k
            r1.<init>(r6)
        L1a:
            java.lang.Object r6 = r1.f13217i
            int r2 = r1.f13218j
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ci.i r5 = r1.f13216h
            gg.u r1 = r1.f13215g
            f8.i.I0(r6)     // Catch: ug.a -> L2b
            goto L5d
        L2b:
            r6 = move-exception
            goto L59
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
        L32:
            r5 = 0
            return r5
        L34:
            f8.i.I0(r6)
            gg.u r6 = new gg.u
            r6.<init>()
            r6.f4564g = r0
            ci.i r2 = new ci.i
            r4 = 3
            r2.<init>(r6, r4)
            r1.f13215g = r6     // Catch: ug.a -> L55
            r1.f13216h = r2     // Catch: ug.a -> L55
            r1.f13218j = r3     // Catch: ug.a -> L55
            java.lang.Object r5 = r5.b(r2, r1)     // Catch: ug.a -> L55
            xf.a r1 = xf.a.f21579g
            if (r5 != r1) goto L53
            return r1
        L53:
            r1 = r6
            goto L5d
        L55:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L59:
            java.lang.Object r2 = r6.f13801g
            if (r2 != r5) goto L68
        L5d:
            java.lang.Object r5 = r1.f4564g
            if (r5 == r0) goto L62
            return r5
        L62:
            java.lang.String r5 = "Expected at least one element"
            j8.o.l(r5)
            goto L32
        L68:
            throw r6
    }

    public static final tg.o h(m.a r10, vg.c r11, tg.y r12, java.lang.Float r13) {
            sg.f r0 = sg.g.f12475e
            r0.getClass()
            sg.f r0 = sg.f.f12473a
            r0 = 9
            p4.t r1 = new p4.t
            wf.h r2 = wf.h.f20786g
            r1.<init>(r10, r0, r2)
            tg.b0 r6 = b(r13)
            java.lang.Object r10 = r1.f10225i
            wf.g r10 = (wf.g) r10
            java.lang.Object r0 = r1.f10224h
            r5 = r0
            tg.d r5 = (tg.d) r5
            tg.w r0 = tg.v.f13254a
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L28
            qg.u r0 = qg.u.f11096g
            goto L2a
        L28:
            qg.u r0 = qg.u.f11099j
        L2a:
            ci.e r3 = new ci.e
            r8 = 0
            r9 = 8
            r4 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            wf.g r11 = r11.n()
            r12 = 1
            wf.g r10 = qg.v.h(r11, r10, r12)
            xg.e r11 = qg.c0.f11038a
            if (r10 == r11) goto L4d
            wf.d r13 = wf.d.f20785g
            wf.e r13 = r10.s(r13)
            if (r13 != 0) goto L4d
            wf.g r10 = r10.e(r11)
        L4d:
            qg.u r11 = qg.u.f11097h
            if (r0 != r11) goto L57
            qg.z0 r11 = new qg.z0
            r11.<init>(r10, r3)
            goto L5c
        L57:
            qg.e1 r11 = new qg.e1
            r11.<init>(r10, r12)
        L5c:
            r11.c0(r0, r11, r3)
            tg.o r10 = new tg.o
            r10.<init>(r6)
            return r10
    }
}
