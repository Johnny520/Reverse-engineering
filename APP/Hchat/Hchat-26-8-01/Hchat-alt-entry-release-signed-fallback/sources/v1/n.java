package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends g3.s implements java.lang.Runnable, g3.e, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g3.r0 f13993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.k0 f13994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i0.g1 f13995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f.f0 f13996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w0.p f13997p;

    public n() {
            r4 = this;
            r0 = 1
            r4.<init>(r0)
            f.k0 r0 = new f.k0
            r1 = 9
            r0.<init>(r1)
            v1.n1 r1 = v1.o1.f14008a
            r1.getClass()
            v1.p1 r1 = v1.n1.f13999b
            v1.r1 r2 = new v1.r1
            java.lang.String r3 = "caption bar"
            r2.<init>(r3)
            r0.m(r1, r2)
            v1.p1 r1 = v1.n1.f14000c
            v1.r1 r2 = new v1.r1
            java.lang.String r3 = "display cutout"
            r2.<init>(r3)
            r0.m(r1, r2)
            v1.p1 r1 = v1.n1.f14001d
            v1.r1 r2 = new v1.r1
            java.lang.String r3 = "ime"
            r2.<init>(r3)
            r0.m(r1, r2)
            v1.p1 r1 = v1.n1.f14002e
            v1.r1 r2 = new v1.r1
            java.lang.String r3 = "mandatory system gestures"
            r2.<init>(r3)
            r0.m(r1, r2)
            v1.p1 r1 = v1.n1.f14003f
            v1.r1 r2 = new v1.r1
            java.lang.String r3 = "navigation bars"
            r2.<init>(r3)
            r0.m(r1, r2)
            v1.p1 r1 = v1.n1.f14004g
            v1.r1 r2 = new v1.r1
            java.lang.String r3 = "status bars"
            r2.<init>(r3)
            r0.m(r1, r2)
            v1.p1 r1 = v1.n1.f14005h
            v1.r1 r2 = new v1.r1
            java.lang.String r3 = "system gestures"
            r2.<init>(r3)
            r0.m(r1, r2)
            v1.p1 r1 = v1.n1.f14006i
            v1.r1 r2 = new v1.r1
            java.lang.String r3 = "tappable element"
            r2.<init>(r3)
            r0.m(r1, r2)
            v1.p1 r1 = v1.n1.f14007j
            v1.r1 r2 = new v1.r1
            java.lang.String r3 = "waterfall"
            r2.<init>(r3)
            r0.m(r1, r2)
            r4.f13994m = r0
            i0.g1 r0 = new i0.g1
            r1 = 0
            r0.<init>(r1)
            r4.f13995n = r0
            f.f0 r0 = new f.f0
            r1 = 4
            r0.<init>(r1)
            r4.f13996o = r0
            w0.p r0 = new w0.p
            r0.<init>()
            r4.f13997p = r0
            return
    }

    @Override // g3.s
    public final void a(g3.b0 r6) {
            r5 = this;
            r0 = 0
            r5.f13991j = r0
            g3.a0 r6 = r6.f4187a
            int r6 = r6.d()
            int r1 = r5.f13992k
            int r2 = ~r6
            r1 = r1 & r2
            r5.f13992k = r1
            r1 = 0
            r5.f13993l = r1
            f.w r1 = v1.q1.f14021a
            java.lang.Object r6 = r1.b(r6)
            v1.o1 r6 = (v1.o1) r6
            if (r6 == 0) goto L72
            f.k0 r1 = r5.f13994m
            java.lang.Object r6 = r1.g(r6)
            r6.getClass()
            v1.r1 r6 = (v1.r1) r6
            i0.f1 r1 = r6.f14032c
            r2 = 0
            r1.h(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            i0.f1 r3 = r6.f14034e
            r3.h(r1)
            r3 = 0
            i0.h1 r1 = r6.f14033d
            r1.h(r3)
            i0.f1 r1 = r6.f14032c
            r1.h(r2)
            i0.j1 r1 = r6.f14031b
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            r1 = -1
            r6.f14039j = r1
            r6.f14040k = r1
            i0.g1 r6 = r5.f13995n
            int r1 = r6.g()
            r2 = 1
            int r1 = r1 + r2
            r6.h(r1)
            java.lang.Object r6 = w0.m.f14786c
            monitor-enter(r6)
            w0.a r1 = w0.m.f14793j     // Catch: java.lang.Throwable -> L6f
            f.l0 r1 = r1.f14751h     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L68
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L6f
            if (r1 != r2) goto L68
            r0 = r2
        L68:
            monitor-exit(r6)
            if (r0 == 0) goto L72
            w0.m.a()
            return
        L6f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L72:
            return
    }

    @Override // g3.s
    public final void b() {
            r1 = this;
            r0 = 1
            r1.f13991j = r0
            return
    }

    @Override // g3.e
    public final g3.r0 c(android.view.View r3, g3.r0 r4) {
            r2 = this;
            boolean r0 = r2.f13991j
            if (r0 == 0) goto L10
            r2.f13993l = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 != r1) goto L17
            r3.post(r2)
            return r4
        L10:
            int r3 = r2.f13992k
            if (r3 != 0) goto L17
            r2.f(r4)
        L17:
            return r4
    }

    @Override // g3.s
    public final g3.r0 d(g3.r0 r7, java.util.List r8) {
            r6 = this;
            int r0 = r8.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L56
            java.lang.Object r2 = r8.get(r1)
            g3.b0 r2 = (g3.b0) r2
            g3.a0 r3 = r2.f4187a
            int r3 = r3.d()
            f.w r4 = v1.q1.f14021a
            java.lang.Object r3 = r4.b(r3)
            v1.o1 r3 = (v1.o1) r3
            if (r3 == 0) goto L53
            f.k0 r4 = r6.f13994m
            java.lang.Object r3 = r4.g(r3)
            r3.getClass()
            v1.r1 r3 = (v1.r1) r3
            i0.j1 r4 = r3.f14031b
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L53
            g3.a0 r2 = r2.f4187a
            float r4 = r2.c()
            i0.f1 r5 = r3.f14032c
            r5.h(r4)
            float r4 = r2.a()
            i0.f1 r5 = r3.f14034e
            r5.h(r4)
            long r4 = r2.b()
            i0.h1 r2 = r3.f14033d
            r2.h(r4)
        L53:
            int r1 = r1 + 1
            goto L5
        L56:
            r6.f(r7)
            return r7
    }

    @Override // g3.s
    public final b.e e(g3.b0 r9, b.e r10) {
            r8 = this;
            g3.r0 r0 = r8.f13993l
            r1 = 0
            r8.f13991j = r1
            r2 = 0
            r8.f13993l = r2
            g3.a0 r2 = r9.f4187a
            long r2 = r2.b()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto La9
            if (r0 == 0) goto La9
            g3.a0 r2 = r9.f4187a
            int r2 = r2.d()
            int r3 = r8.f13992k
            r3 = r3 | r2
            r8.f13992k = r3
            f.w r3 = v1.q1.f14021a
            java.lang.Object r3 = r3.b(r2)
            v1.o1 r3 = (v1.o1) r3
            if (r3 == 0) goto La9
            f.k0 r4 = r8.f13994m
            java.lang.Object r3 = r4.g(r3)
            r3.getClass()
            v1.r1 r3 = (v1.r1) r3
            g3.n0 r0 = r0.f4230a
            b3.a r0 = r0.g(r2)
            int r2 = r0.f445a
            long r4 = (long) r2
            r2 = 48
            long r4 = r4 << r2
            int r2 = r0.f446b
            long r6 = (long) r2
            r2 = 32
            long r6 = r6 << r2
            long r4 = r4 | r6
            int r2 = r0.f447c
            long r6 = (long) r2
            r2 = 16
            long r6 = r6 << r2
            long r4 = r4 | r6
            int r0 = r0.f448d
            long r6 = (long) r0
            long r4 = r4 | r6
            long r6 = r3.f14037h
            boolean r0 = v1.w.g(r4, r6)
            if (r0 != 0) goto La9
            r3.f14039j = r6
            r3.f14040k = r4
            i0.j1 r0 = r3.f14031b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.setValue(r2)
            g3.a0 r9 = r9.f4187a
            float r0 = r9.c()
            i0.f1 r2 = r3.f14032c
            r2.h(r0)
            float r0 = r9.a()
            i0.f1 r2 = r3.f14034e
            r2.h(r0)
            long r4 = r9.b()
            i0.h1 r9 = r3.f14033d
            r9.h(r4)
            i0.g1 r9 = r8.f13995n
            int r0 = r9.g()
            r2 = 1
            int r0 = r0 + r2
            r9.h(r0)
            java.lang.Object r9 = w0.m.f14786c
            monitor-enter(r9)
            w0.a r0 = w0.m.f14793j     // Catch: java.lang.Throwable -> La6
            f.l0 r0 = r0.f14751h     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L9f
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> La6
            if (r0 != r2) goto L9f
            r1 = r2
        L9f:
            monitor-exit(r9)
            if (r1 == 0) goto La9
            w0.m.a()
            return r10
        La6:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        La9:
            return r10
    }

    public final void f(g3.r0 r28) {
            r27 = this;
            r1 = r27
            r0 = r28
            f.w r2 = v1.q1.f14021a
            int[] r3 = r2.f2844b
            java.lang.Object[] r4 = r2.f2845c
            long[] r2 = r2.f2843a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L114
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 16
            r17 = 32
        L18:
            r6 = r2[r13]
            r18 = 1
            long r11 = ~r6
            r19 = 7
            long r11 = r11 << r19
            long r11 = r11 & r6
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r19
            int r11 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r11 == 0) goto L102
            int r11 = r13 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r8 = 0
            r19 = 48
        L39:
            if (r8 >= r11) goto Lf9
            r20 = 255(0xff, double:1.26E-321)
            long r20 = r6 & r20
            r22 = 128(0x80, double:6.3E-322)
            int r20 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r20 >= 0) goto Le5
            int r20 = r13 << 3
            int r20 = r20 + r8
            r12 = r3[r20]
            r20 = r4[r20]
            r9 = r20
            v1.o1 r9 = (v1.o1) r9
            g3.n0 r10 = r0.f4230a
            b3.a r10 = r10.g(r12)
            r20 = r2
            int r2 = r10.f445a
            r24 = r3
            long r2 = (long) r2
            long r2 = r2 << r19
            r25 = r2
            int r2 = r10.f446b
            long r2 = (long) r2
            long r2 = r2 << r17
            long r2 = r25 | r2
            r25 = r2
            int r2 = r10.f447c
            long r2 = (long) r2
            long r2 = r2 << r16
            long r2 = r25 | r2
            int r10 = r10.f448d
            r25 = r2
            long r2 = (long) r10
            long r2 = r25 | r2
            f.k0 r10 = r1.f13994m
            java.lang.Object r9 = r10.g(r9)
            r9.getClass()
            v1.r1 r9 = (v1.r1) r9
            r25 = r6
            long r6 = r9.f14037h
            boolean r6 = v1.w.g(r2, r6)
            if (r6 != 0) goto L9b
            r9.f14037h = r2
            r6 = 0
            boolean r2 = v1.w.g(r2, r6)
            r14 = r18
            if (r2 != 0) goto L9b
            r15 = r14
        L9b:
            r2 = 8
            if (r12 == r2) goto Ld2
            g3.n0 r2 = r0.f4230a
            b3.a r2 = r2.h(r12)
            int r3 = r2.f445a
            long r6 = (long) r3
            long r6 = r6 << r19
            int r3 = r2.f446b
            r10 = r4
            long r3 = (long) r3
            long r3 = r3 << r17
            long r3 = r3 | r6
            int r6 = r2.f447c
            long r6 = (long) r6
            long r6 = r6 << r16
            long r3 = r3 | r6
            int r2 = r2.f448d
            long r6 = (long) r2
            long r2 = r3 | r6
            long r6 = r9.f14038i
            boolean r4 = v1.w.g(r6, r2)
            if (r4 != 0) goto Ld3
            r9.f14038i = r2
            r6 = 0
            boolean r2 = v1.w.g(r2, r6)
            r14 = r18
            if (r2 != 0) goto Ld3
            r15 = r14
            goto Ld3
        Ld2:
            r10 = r4
        Ld3:
            g3.n0 r2 = r0.f4230a
            boolean r2 = r2.q(r12)
            i0.j1 r3 = r9.f14030a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.setValue(r2)
            r2 = 8
            goto Led
        Le5:
            r20 = r2
            r24 = r3
            r10 = r4
            r25 = r6
            r2 = r12
        Led:
            long r6 = r25 >> r2
            int r8 = r8 + 1
            r12 = r2
            r4 = r10
            r2 = r20
            r3 = r24
            goto L39
        Lf9:
            r20 = r2
            r24 = r3
            r10 = r4
            r2 = r12
            if (r11 != r2) goto L11e
            goto L109
        L102:
            r20 = r2
            r24 = r3
            r10 = r4
            r19 = 48
        L109:
            if (r13 == r5) goto L11e
            int r13 = r13 + 1
            r4 = r10
            r2 = r20
            r3 = r24
            goto L18
        L114:
            r16 = 16
            r17 = 32
            r18 = 1
            r19 = 48
            r14 = 0
            r15 = 0
        L11e:
            g3.n0 r0 = r0.f4230a
            g3.d r0 = r0.f()
            if (r0 != 0) goto L129
            r6 = 0
            goto L143
        L129:
            b3.a r2 = r0.a()
            int r3 = r2.f445a
            long r3 = (long) r3
            long r3 = r3 << r19
            int r5 = r2.f446b
            long r5 = (long) r5
            long r5 = r5 << r17
            long r3 = r3 | r5
            int r5 = r2.f447c
            long r5 = (long) r5
            long r5 = r5 << r16
            long r3 = r3 | r5
            int r2 = r2.f448d
            long r5 = (long) r2
            long r6 = r3 | r5
        L143:
            f.k0 r2 = r1.f13994m
            v1.n1 r3 = v1.o1.f14008a
            r3.getClass()
            v1.p1 r3 = v1.n1.f14007j
            java.lang.Object r2 = r2.g(r3)
            r2.getClass()
            v1.r1 r2 = (v1.r1) r2
            r3 = 0
            boolean r5 = v1.w.g(r6, r3)
            r5 = r5 ^ 1
            i0.j1 r8 = r2.f14030a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r8.setValue(r5)
            long r8 = r2.f14037h
            boolean r5 = v1.w.g(r8, r6)
            if (r5 != 0) goto L17b
            r2.f14037h = r6
            r2.f14038i = r6
            boolean r2 = v1.w.g(r6, r3)
            r14 = r18
            if (r2 != 0) goto L17b
            r15 = r14
        L17b:
            if (r0 != 0) goto L18f
            f.f0 r0 = r1.f13996o
            int r2 = r0.f2804b
            if (r2 <= 0) goto L230
            r0.d()
            w0.p r0 = r1.f13997p
            r0.clear()
            r14 = r18
            goto L230
        L18f:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L19c
            android.view.DisplayCutout r0 = r0.f4194a
            java.util.List r0 = c3.a.b(r0)
            goto L19e
        L19c:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L19e:
            int r2 = r0.size()
            f.f0 r3 = r1.f13996o
            int r4 = r3.f2804b
            if (r2 >= r4) goto L1c5
            int r2 = r0.size()
            f.f0 r4 = r1.f13996o
            int r4 = r4.f2804b
            r3.l(r2, r4)
            w0.p r2 = r1.f13997p
            int r3 = r0.size()
            w0.p r4 = r1.f13997p
            int r4 = r4.size()
            r2.e(r3, r4)
            r14 = r18
            goto L201
        L1c5:
            int r2 = r0.size()
            f.f0 r3 = r1.f13996o
            int r3 = r3.f2804b
            int r2 = r2 - r3
            r3 = 0
        L1cf:
            if (r3 >= r2) goto L201
            f.f0 r4 = r1.f13996o
            int r5 = r4.f2804b
            java.lang.Object r5 = r0.get(r5)
            i0.j1 r5 = i0.r.u(r5)
            r4.a(r5)
            w0.p r4 = r1.f13997p
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "display cutout rect "
            r5.<init>(r6)
            f.f0 r6 = r1.f13996o
            int r6 = r6.f2804b
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            v1.m r6 = new v1.m
            r6.<init>(r5)
            r4.add(r6)
            int r3 = r3 + 1
            r14 = r18
            goto L1cf
        L201:
            int r2 = r0.size()
            r3 = 0
        L206:
            if (r3 >= r2) goto L228
            java.lang.Object r4 = r0.get(r3)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            f.f0 r5 = r1.f13996o
            java.lang.Object r5 = r5.f(r3)
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r5.getValue()
            boolean r6 = gg.l.a(r6, r4)
            if (r6 != 0) goto L225
            r5.setValue(r4)
            r14 = r18
        L225:
            int r3 = r3 + 1
            goto L206
        L228:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L230
            r15 = r18
        L230:
            if (r15 != 0) goto L23a
            i0.g1 r0 = r1.f13995n
            int r0 = r0.g()
            if (r0 == 0) goto L265
        L23a:
            if (r14 == 0) goto L265
            i0.g1 r0 = r1.f13995n
            int r2 = r0.g()
            int r2 = r2 + 1
            r0.h(r2)
            java.lang.Object r2 = w0.m.f14786c
            monitor-enter(r2)
            w0.a r0 = w0.m.f14793j     // Catch: java.lang.Throwable -> L262
            f.l0 r0 = r0.f14751h     // Catch: java.lang.Throwable -> L262
            if (r0 == 0) goto L25a
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L262
            r3 = r18
            if (r0 != r3) goto L25a
            r11 = r3
            goto L25b
        L25a:
            r11 = 0
        L25b:
            monitor-exit(r2)
            if (r11 == 0) goto L265
            w0.m.a()
            return
        L262:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L265:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r3) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lb
            android.view.View r0 = (android.view.View) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r3 = r0
        L10:
            int r0 = g3.q.f4227a
            g3.m.b(r3, r2)
            g3.q.b(r3, r2)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r4) {
            r3 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L10
            goto L11
        L10:
            r4 = r0
        L11:
            int r0 = g3.q.f4227a
            g3.m.b(r4, r2)
            g3.q.b(r4, r2)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            boolean r0 = r1.f13991j
            if (r0 == 0) goto L13
            r0 = 0
            r1.f13992k = r0
            r1.f13991j = r0
            g3.r0 r0 = r1.f13993l
            if (r0 == 0) goto L13
            r1.f(r0)
            r0 = 0
            r1.f13993l = r0
        L13:
            return
    }
}
