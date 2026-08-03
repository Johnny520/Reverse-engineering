package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View f21888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.o f21889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.q f21890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u3.c f21891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.a1 f21892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d2.c f21893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d2.d f21894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.content.res.Configuration f21895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0.a1 f21896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y1.g f21897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y1.p0 f21898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y1.i f21899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y1.h f21900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m2.c f21901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0.a1 f21902o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n1.a f21903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y1.q0 f21904q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x1.h0 f21905r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y1.v1 f21906s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f1.v f21907t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21908u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d1.c0 f21909v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y1.e1 f21910w;

    public f1(y1.f1 r4, android.view.View r5, i0.o r6, androidx.lifecycle.q r7, u3.c r8, c9.a1 r9) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto Lc
            android.view.View r1 = r4.f21888a
            if (r1 == 0) goto Lc
            android.content.Context r1 = r1.getContext()
            goto Ld
        Lc:
            r1 = r0
        Ld:
            android.content.Context r2 = r5.getContext()
            boolean r1 = gg.l.a(r1, r2)
            r3.<init>()
            r3.f21888a = r5
            r3.f21889b = r6
            r3.f21890c = r7
            r3.f21891d = r8
            r3.f21892e = r9
            if (r1 == 0) goto L2a
            r4.getClass()
            d2.c r6 = r4.f21893f
            goto L2f
        L2a:
            d2.c r6 = new d2.c
            r6.<init>()
        L2f:
            r3.f21893f = r6
            if (r4 == 0) goto L37
            d2.d r6 = r4.f21894g
            if (r6 != 0) goto L3c
        L37:
            d2.d r6 = new d2.d
            r6.<init>()
        L3c:
            r3.f21894g = r6
            if (r1 == 0) goto L46
            r4.getClass()
            android.content.res.Configuration r6 = r4.f21895h
            goto L57
        L46:
            android.content.res.Configuration r6 = new android.content.res.Configuration
            android.content.Context r7 = r5.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            r6.<init>(r7)
        L57:
            r3.f21895h = r6
            if (r1 == 0) goto L61
            r4.getClass()
            i0.a1 r6 = r4.f21896i
            goto L6a
        L61:
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>(r6)
            i0.j1 r6 = i0.r.u(r7)
        L6a:
            r3.f21896i = r6
            if (r1 == 0) goto L74
            r4.getClass()
            y1.g r6 = r4.f21897j
            goto L88
        L74:
            y1.g r6 = new y1.g
            android.content.Context r7 = r5.getContext()
            r6.<init>()
            java.lang.String r8 = "accessibility"
            java.lang.Object r7 = r7.getSystemService(r8)
            r7.getClass()
            android.view.accessibility.AccessibilityManager r7 = (android.view.accessibility.AccessibilityManager) r7
        L88:
            r3.f21897j = r6
            if (r1 == 0) goto L92
            r4.getClass()
            y1.p0 r6 = r4.f21898k
            goto L9b
        L92:
            y1.p0 r6 = new y1.p0
            android.content.Context r7 = r5.getContext()
            r6.<init>(r7)
        L9b:
            r3.f21898k = r6
            if (r1 == 0) goto La5
            r4.getClass()
            y1.i r6 = r4.f21899l
            goto Lae
        La5:
            y1.i r6 = new y1.i
            android.content.Context r7 = r5.getContext()
            r6.<init>(r7)
        Lae:
            r3.f21899l = r6
            if (r1 == 0) goto Lb8
            r4.getClass()
            y1.h r6 = r4.f21900m
            goto Lbe
        Lb8:
            y1.h r7 = new y1.h
            r7.<init>(r6)
            r6 = r7
        Lbe:
            r3.f21900m = r6
            if (r1 == 0) goto Lc8
            r4.getClass()
            m2.c r6 = r4.f21901n
            goto Ld0
        Lc8:
            y1.r1 r6 = new y1.r1
            r5.getContext()
            r6.<init>()
        Ld0:
            r3.f21901n = r6
            if (r1 == 0) goto Lda
            r4.getClass()
            i0.a1 r6 = r4.f21902o
            goto Lea
        Lda:
            android.content.Context r6 = r5.getContext()
            m2.e r6 = ig.a.k(r6)
            i0.e r7 = i0.e.f5868k
            i0.j1 r8 = new i0.j1
            r8.<init>(r6, r7)
            r6 = r8
        Lea:
            r3.f21902o = r6
            if (r4 == 0) goto Lf0
            android.view.View r0 = r4.f21888a
        Lf0:
            if (r5 != r0) goto Lf5
            n1.a r6 = r4.f21903p
            goto Lfa
        Lf5:
            n1.c r6 = new n1.c
            r6.<init>(r5)
        Lfa:
            r3.f21903p = r6
            if (r1 == 0) goto L104
            r4.getClass()
            y1.q0 r5 = r4.f21904q
            goto L112
        L104:
            y1.q0 r6 = new y1.q0
            android.content.Context r5 = r5.getContext()
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            r6.<init>(r5)
            r5 = r6
        L112:
            r3.f21904q = r5
            if (r4 == 0) goto L11a
            x1.h0 r5 = r4.f21905r
            if (r5 != 0) goto L11f
        L11a:
            x1.h0 r5 = new x1.h0
            r5.<init>()
        L11f:
            r3.f21905r = r5
            y1.v1 r5 = new y1.v1
            r5.<init>()
            r3.f21906s = r5
            if (r4 == 0) goto L12e
            f1.v r4 = r4.f21907t
            if (r4 != 0) goto L133
        L12e:
            f1.v r4 = new f1.v
            r4.<init>()
        L133:
            r3.f21907t = r4
            d1.c0 r4 = new d1.c0
            r5 = 20
            r4.<init>(r3, r5)
            r3.f21909v = r4
            y1.e1 r4 = new y1.e1
            r4.<init>(r3)
            r3.f21910w = r4
            return
    }

    public final void a(y1.t r25, fg.p r26, i0.h0 r27, int r28) {
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r0 = 123858079(0x761ec9f, float:1.6996655E-34)
            r4.b0(r0)
            boolean r0 = r4.h(r2)
            if (r0 == 0) goto L18
            r0 = 4
            goto L19
        L18:
            r0 = 2
        L19:
            r0 = r0 | r5
            boolean r6 = r4.h(r3)
            if (r6 == 0) goto L23
            r6 = 32
            goto L25
        L23:
            r6 = 16
        L25:
            r0 = r0 | r6
            boolean r6 = r4.h(r1)
            if (r6 == 0) goto L2f
            r6 = 256(0x100, float:3.59E-43)
            goto L31
        L2f:
            r6 = 128(0x80, float:1.8E-43)
        L31:
            r0 = r0 | r6
            r6 = r0 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            r8 = 0
            r9 = 1
            if (r6 == r7) goto L3c
            r6 = r9
            goto L3d
        L3c:
            r6 = r8
        L3d:
            r0 = r0 & r9
            boolean r0 = r4.S(r0, r6)
            if (r0 == 0) goto L258
            r0 = 2131099722(0x7f06004a, float:1.7811805E38)
            java.lang.Object r6 = r2.getTag(r0)
            boolean r7 = r6 instanceof java.util.Set
            r10 = 0
            if (r7 == 0) goto L5b
            boolean r7 = r6 instanceof hg.a
            if (r7 == 0) goto L58
            boolean r7 = r6 instanceof hg.e
            if (r7 == 0) goto L5b
        L58:
            java.util.Set r6 = (java.util.Set) r6
            goto L5c
        L5b:
            r6 = r10
        L5c:
            if (r6 != 0) goto L83
            android.view.ViewParent r6 = r2.getParent()
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L69
            android.view.View r6 = (android.view.View) r6
            goto L6a
        L69:
            r6 = r10
        L6a:
            if (r6 == 0) goto L71
            java.lang.Object r0 = r6.getTag(r0)
            goto L72
        L71:
            r0 = r10
        L72:
            boolean r6 = r0 instanceof java.util.Set
            if (r6 == 0) goto L82
            boolean r6 = r0 instanceof hg.a
            if (r6 == 0) goto L7e
            boolean r6 = r0 instanceof hg.e
            if (r6 == 0) goto L82
        L7e:
            r6 = r0
            java.util.Set r6 = (java.util.Set) r6
            goto L83
        L82:
            r6 = r10
        L83:
            if (r6 == 0) goto La6
            x0.c r0 = r4.y()
            r6.add(r0)
            r4.f5910q = r9
            r4.C = r9
            l0.h r0 = r4.f5896c
            r0.c()
            l0.h r0 = r4.H
            r0.c()
            l0.k r0 = r4.I
            l0.h r7 = r0.f7694a
            java.util.HashMap r11 = r7.f7689p
            r0.f7698e = r11
            f.w r7 = r7.f7690q
            r0.f7699f = r7
        La6:
            java.lang.Object r0 = r4.P()
            i0.e r7 = i0.l.f5952a
            if (r0 != r7) goto L18f
            u3.c r0 = r1.f21891d
            android.view.ViewParent r7 = r2.getParent()
            r7.getClass()
            android.view.View r7 = (android.view.View) r7
            r11 = 2131099699(0x7f060033, float:1.7811759E38)
            java.lang.Object r11 = r7.getTag(r11)
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto Lc7
            java.lang.String r11 = (java.lang.String) r11
            goto Lc8
        Lc7:
            r11 = r10
        Lc8:
            if (r11 != 0) goto Ld2
            int r7 = r7.getId()
            java.lang.String r11 = java.lang.String.valueOf(r7)
        Ld2:
            java.lang.String r7 = "SaveableStateRegistry:"
            java.lang.String r7 = wb.en.g(r7, r11)
            m.a r11 = r0.b()
            android.os.Bundle r0 = r11.l(r7)
            if (r0 == 0) goto L108
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Set r13 = r0.keySet()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        Lf1:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L109
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            java.util.ArrayList r15 = r0.getParcelableArrayList(r14)
            r15.getClass()
            r12.put(r14, r15)
            goto Lf1
        L108:
            r12 = r10
        L109:
            y1.o r0 = y1.o.f22021k
            i0.m2 r13 = v0.h.f13882a
            v0.g r13 = new v0.g
            r13.<init>(r12, r0)
            java.lang.Object r0 = r11.f8069h
            pa.c r0 = (pa.c) r0
            java.lang.Object r12 = r0.f10456e
            uf.d r12 = (uf.d) r12
            monitor-enter(r12)
            java.lang.Object r0 = r0.f10457f     // Catch: java.lang.Throwable -> L14b
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14b
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L14b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L14b
        L127:
            boolean r14 = r0.hasNext()     // Catch: java.lang.Throwable -> L14b
            if (r14 == 0) goto L14d
            java.lang.Object r14 = r0.next()     // Catch: java.lang.Throwable -> L14b
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch: java.lang.Throwable -> L14b
            java.lang.Object r15 = r14.getKey()     // Catch: java.lang.Throwable -> L14b
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L14b
            java.lang.Object r14 = r14.getValue()     // Catch: java.lang.Throwable -> L14b
            y1.l1 r14 = (y1.l1) r14     // Catch: java.lang.Throwable -> L14b
            boolean r15 = gg.l.a(r15, r7)     // Catch: java.lang.Throwable -> L14b
            if (r15 == 0) goto L146
            goto L147
        L146:
            r14 = r10
        L147:
            if (r14 == 0) goto L127
            r10 = r14
            goto L14d
        L14b:
            r0 = move-exception
            goto L18d
        L14d:
            monitor-exit(r12)
            if (r10 == 0) goto L151
            goto L17f
        L151:
            y1.l1 r0 = new y1.l1     // Catch: java.lang.IllegalArgumentException -> L17f
            r0.<init>(r13)     // Catch: java.lang.IllegalArgumentException -> L17f
            java.lang.Object r10 = r11.f8069h     // Catch: java.lang.IllegalArgumentException -> L17f
            pa.c r10 = (pa.c) r10     // Catch: java.lang.IllegalArgumentException -> L17f
            java.lang.Object r12 = r10.f10456e     // Catch: java.lang.IllegalArgumentException -> L17f
            uf.d r12 = (uf.d) r12     // Catch: java.lang.IllegalArgumentException -> L17f
            monitor-enter(r12)     // Catch: java.lang.IllegalArgumentException -> L17f
            java.lang.Object r14 = r10.f10457f     // Catch: java.lang.Throwable -> L173
            java.util.LinkedHashMap r14 = (java.util.LinkedHashMap) r14     // Catch: java.lang.Throwable -> L173
            boolean r14 = r14.containsKey(r7)     // Catch: java.lang.Throwable -> L173
            if (r14 != 0) goto L175
            java.lang.Object r10 = r10.f10457f     // Catch: java.lang.Throwable -> L173
            java.util.LinkedHashMap r10 = (java.util.LinkedHashMap) r10     // Catch: java.lang.Throwable -> L173
            r10.put(r7, r0)     // Catch: java.lang.Throwable -> L173
            monitor-exit(r12)     // Catch: java.lang.IllegalArgumentException -> L17f
            r8 = r9
            goto L17f
        L173:
            r0 = move-exception
            goto L17d
        L175:
            java.lang.String r0 = "SavedStateProvider with the given key is already registered"
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L173
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L173
            throw r9     // Catch: java.lang.Throwable -> L173
        L17d:
            monitor-exit(r12)     // Catch: java.lang.IllegalArgumentException -> L17f
            throw r0     // Catch: java.lang.IllegalArgumentException -> L17f
        L17f:
            y1.k1 r0 = new y1.k1
            y1.m1 r9 = new y1.m1
            r9.<init>(r8, r11, r7)
            r0.<init>(r13, r9)
            r4.k0(r0)
            goto L18f
        L18d:
            monitor-exit(r12)
            throw r0
        L18f:
            y1.k1 r0 = (y1.k1) r0
            sf.n r7 = sf.n.f12433a
            boolean r8 = r4.h(r0)
            java.lang.Object r9 = r4.P()
            if (r8 != 0) goto L1a1
            i0.e r8 = i0.l.f5952a
            if (r9 != r8) goto L1ab
        L1a1:
            b1.f r9 = new b1.f
            r8 = 24
            r9.<init>(r0, r8)
            r4.k0(r9)
        L1ab:
            fg.l r9 = (fg.l) r9
            i0.r.c(r7, r9, r4)
            i0.u r7 = y1.h1.f21961w
            java.lang.Object r8 = r4.j(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            boolean r9 = r2.getScrollCaptureInProgress$ui()
            r8 = r8 | r9
            android.view.View r9 = r2.getView()
            boolean r9 = r4.f(r9)
            java.lang.Object r10 = r4.P()
            if (r9 != 0) goto L1d3
            i0.e r9 = i0.l.f5952a
            if (r10 != r9) goto L1de
        L1d3:
            y1.n2 r10 = new y1.n2
            r2.getView()
            r10.<init>()
            r4.k0(r10)
        L1de:
            y1.n2 r10 = (y1.n2) r10
            i0.p1 r9 = o3.a.f9501a
            androidx.lifecycle.q r11 = r1.f21890c
            i0.q1 r12 = r9.a(r11)
            i0.p1 r9 = v3.a.f14063a
            u3.c r11 = r1.f21891d
            i0.q1 r13 = r9.a(r11)
            i0.m2 r9 = y1.i0.f21968d
            d2.c r11 = r1.f21893f
            i0.q1 r14 = r9.a(r11)
            i0.m2 r9 = y1.i0.f21969e
            d2.d r11 = r1.f21894g
            i0.q1 r15 = r9.a(r11)
            i0.m2 r9 = y1.i0.f21966b
            android.content.Context r11 = r2.getContext()
            i0.q1 r16 = r9.a(r11)
            i0.m2 r9 = x0.g.f20829a
            i0.q1 r17 = r9.a(r6)
            i0.u r6 = y1.i0.f21965a
            android.content.res.Configuration r9 = r2.getConfiguration()
            i0.q1 r18 = r6.a(r9)
            i0.m2 r6 = v0.h.f13882a
            i0.q1 r19 = r6.a(r0)
            i0.m2 r0 = y1.i0.f21970f
            android.view.View r6 = r2.getView()
            i0.q1 r20 = r0.a(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            i0.q1 r21 = r7.a(r0)
            i0.m2 r0 = y1.h1.f21958t
            y1.l2 r6 = r2.getViewConfiguration()
            i0.q1 r22 = r0.a(r6)
            i0.u r0 = i0.l0.f5953a
            i0.q1 r23 = r0.a(r10)
            i0.q1[] r0 = new i0.q1[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            y1.d1 r6 = new y1.d1
            r6.<init>(r2, r1, r3)
            r7 = 1317454175(0x4e86c15f, float:1.1304099E9)
            s0.d r6 = s0.i.e(r7, r6, r4)
            r7 = 56
            i0.r.b(r0, r6, r4, r7)
            goto L25b
        L258:
            r4.V()
        L25b:
            i0.r1 r0 = r4.t()
            if (r0 == 0) goto L268
            y1.d1 r4 = new y1.d1
            r4.<init>(r1, r2, r3, r5)
            r0.f6035d = r4
        L268:
            return
    }

    public final void b() {
            r4 = this;
            int r0 = r4.f21908u
            int r0 = r0 + (-1)
            r4.f21908u = r0
            if (r0 >= 0) goto L12
            java.lang.String r0 = "ComposeViewContext"
            java.lang.String r1 = "View count has dropped below 0"
            android.util.Log.e(r0, r1)
            r0 = 0
            r4.f21908u = r0
        L12:
            int r0 = r4.f21908u
            if (r0 != 0) goto L31
            android.view.View r0 = r4.f21888a
            android.content.Context r1 = r0.getContext()
            y1.e1 r2 = r4.f21910w
            r1.unregisterComponentCallbacks(r2)
            y1.v1 r1 = r4.f21906s
            i0.j1 r3 = r1.f22136b
            if (r3 != 0) goto L2a
            r3 = 0
            r1.f22135a = r3
        L2a:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnWindowFocusChangeListener(r2)
        L31:
            return
    }

    public final void c() {
            r5 = this;
            int r0 = r5.f21908u
            r1 = 1
            int r0 = r0 + r1
            r5.f21908u = r0
            if (r0 != r1) goto L45
            android.view.View r0 = r5.f21888a
            android.content.Context r1 = r0.getContext()
            y1.e1 r2 = r5.f21910w
            r1.registerComponentCallbacks(r2)
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r5.d(r1)
            boolean r1 = r0.hasWindowFocus()
            y1.v1 r3 = r5.f21906s
            i0.j1 r4 = r3.f22137c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.setValue(r1)
            i0.j1 r1 = r3.f22136b
            d1.c0 r4 = r5.f21909v
            if (r1 != 0) goto L35
            r3.f22135a = r4
        L35:
            if (r1 == 0) goto L3e
            java.lang.Object r3 = r4.invoke()
            r1.setValue(r3)
        L3e:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.addOnWindowFocusChangeListener(r2)
        L45:
            return
    }

    public final void d(android.content.res.Configuration r4) {
            r3 = this;
            android.content.res.Configuration r0 = r3.f21895h
            int r0 = r0.updateFrom(r4)
            if (r0 == 0) goto L70
            d2.c r1 = r3.f21893f
            java.util.HashMap r1 = r1.f1970a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            d2.a r2 = (d2.a) r2
            r1.remove()
            goto L14
        L30:
            i0.a1 r1 = r3.f21896i
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>(r4)
            r1.setValue(r2)
            d2.d r4 = r3.f21894g
            monitor-enter(r4)
            f.w r1 = r4.f1971a     // Catch: java.lang.Throwable -> L6d
            r1.c()     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r4)
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r4 = r4 & r0
            if (r4 == 0) goto L57
            i0.a1 r4 = r3.f21902o
            android.view.View r1 = r3.f21888a
            android.content.Context r1 = r1.getContext()
            m2.e r1 = ig.a.k(r1)
            r4.setValue(r1)
        L57:
            r4 = -1342235264(0xffffffffafff1d80, float:-4.640519E-10)
            r4 = r4 & r0
            if (r4 == 0) goto L70
            y1.v1 r4 = r3.f21906s
            d1.c0 r0 = r3.f21909v
            i0.j1 r4 = r4.f22136b
            if (r4 == 0) goto L70
            java.lang.Object r0 = r0.invoke()
            r4.setValue(r0)
            return
        L6d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L70:
            return
    }
}
