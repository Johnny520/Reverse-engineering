package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f14810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f14811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0.t f14813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nb.a f14814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j0.b f14815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f14816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q9.a f14817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w0.r f14818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f14819j;

    public s(fg.l r3) {
            r2 = this;
            r2.<init>()
            r2.f14810a = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r0 = 0
            r3.<init>(r0)
            r2.f14811b = r3
            b0.t r3 = new b0.t
            r0 = 25
            r3.<init>(r2, r0)
            r2.f14813d = r3
            nb.a r3 = new nb.a
            r0 = 22
            r3.<init>(r2, r0)
            r2.f14814e = r3
            j0.b r3 = new j0.b
            r0 = 16
            w0.r[] r0 = new w0.r[r0]
            r3.<init>(r0)
            r2.f14815f = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.f14816g = r3
            r0 = -1
            r2.f14819j = r0
            return
    }

    public final void a() {
            r6 = this;
            java.lang.Object r0 = r6.f14816g
            monitor-enter(r0)
            j0.b r1 = r6.f14815f     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r2 = r1.f6671g     // Catch: java.lang.Throwable -> L27
            int r1 = r1.f6673i     // Catch: java.lang.Throwable -> L27
            r3 = 0
        La:
            if (r3 >= r1) goto L29
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L27
            w0.r r4 = (w0.r) r4     // Catch: java.lang.Throwable -> L27
            f.k0 r5 = r4.f14801e     // Catch: java.lang.Throwable -> L27
            r5.a()     // Catch: java.lang.Throwable -> L27
            f.k0 r5 = r4.f14802f     // Catch: java.lang.Throwable -> L27
            r5.a()     // Catch: java.lang.Throwable -> L27
            f.k0 r5 = r4.f14808l     // Catch: java.lang.Throwable -> L27
            r5.a()     // Catch: java.lang.Throwable -> L27
            java.util.HashMap r4 = r4.f14809m     // Catch: java.lang.Throwable -> L27
            r4.clear()     // Catch: java.lang.Throwable -> L27
            int r3 = r3 + 1
            goto La
        L27:
            r1 = move-exception
            goto L2b
        L29:
            monitor-exit(r0)
            return
        L2b:
            monitor-exit(r0)
            throw r1
    }

    public final boolean b() {
            r10 = this;
            java.lang.Object r0 = r10.f14816g
            monitor-enter(r0)
            boolean r1 = r10.f14812c     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)
            r0 = 0
            if (r1 == 0) goto La
            return r0
        La:
            r1 = r0
        Lb:
            java.util.concurrent.atomic.AtomicReference r2 = r10.f14811b
        Ld:
            java.lang.Object r3 = r2.get()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L16
            goto L4d
        L16:
            boolean r6 = r3 instanceof java.util.Set
            if (r6 == 0) goto L1e
            r6 = r3
            java.util.Set r6 = (java.util.Set) r6
            goto L46
        L1e:
            boolean r6 = r3 instanceof java.util.List
            if (r6 == 0) goto L7c
            r6 = r3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r6.get(r0)
            java.util.Set r7 = (java.util.Set) r7
            int r8 = r6.size()
            r9 = 2
            if (r8 != r9) goto L37
            java.lang.Object r4 = r6.get(r5)
            goto L45
        L37:
            int r8 = r6.size()
            if (r8 <= r9) goto L45
            int r4 = r6.size()
            java.util.List r4 = r6.subList(r5, r4)
        L45:
            r6 = r7
        L46:
            boolean r7 = r2.compareAndSet(r3, r4)
            if (r7 == 0) goto L75
            r4 = r6
        L4d:
            if (r4 != 0) goto L50
            return r1
        L50:
            java.lang.Object r2 = r10.f14816g
            monitor-enter(r2)
            j0.b r3 = r10.f14815f     // Catch: java.lang.Throwable -> L6f
            java.lang.Object[] r6 = r3.f6671g     // Catch: java.lang.Throwable -> L6f
            int r3 = r3.f6673i     // Catch: java.lang.Throwable -> L6f
            r7 = r0
        L5a:
            if (r7 >= r3) goto L71
            r8 = r6[r7]     // Catch: java.lang.Throwable -> L6f
            w0.r r8 = (w0.r) r8     // Catch: java.lang.Throwable -> L6f
            boolean r8 = r8.a(r4)     // Catch: java.lang.Throwable -> L6f
            if (r8 != 0) goto L6b
            if (r1 == 0) goto L69
            goto L6b
        L69:
            r1 = r0
            goto L6c
        L6b:
            r1 = r5
        L6c:
            int r7 = r7 + 1
            goto L5a
        L6f:
            r0 = move-exception
            goto L73
        L71:
            monitor-exit(r2)
            goto Lb
        L73:
            monitor-exit(r2)
            throw r0
        L75:
            java.lang.Object r7 = r2.get()
            if (r7 == r3) goto L46
            goto Ld
        L7c:
            java.lang.String r0 = "Unexpected notification"
            i0.m.b(r0)
            okio.a.c()
            r0 = 0
            return r0
        L86:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void c(java.lang.Object r27, fg.l r28, fg.a r29) {
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r28
            long r3 = s0.i.c()
            java.lang.Object r5 = r1.f14816g
            monitor-enter(r5)
            j0.b r6 = r1.f14815f     // Catch: java.lang.Throwable -> L224
            java.lang.Object[] r7 = r6.f6671g     // Catch: java.lang.Throwable -> L224
            int r8 = r6.f6673i     // Catch: java.lang.Throwable -> L224
            r10 = 0
        L14:
            if (r10 >= r8) goto L23
            r12 = r7[r10]     // Catch: java.lang.Throwable -> L224
            r13 = r12
            w0.r r13 = (w0.r) r13     // Catch: java.lang.Throwable -> L224
            fg.l r13 = r13.f14797a     // Catch: java.lang.Throwable -> L224
            if (r13 != r2) goto L20
            goto L24
        L20:
            int r10 = r10 + 1
            goto L14
        L23:
            r12 = 0
        L24:
            w0.r r12 = (w0.r) r12     // Catch: java.lang.Throwable -> L224
            r7 = 1
            if (r12 != 0) goto L37
            w0.r r12 = new w0.r     // Catch: java.lang.Throwable -> L224
            r2.getClass()     // Catch: java.lang.Throwable -> L224
            gg.x.c(r7, r2)     // Catch: java.lang.Throwable -> L224
            r12.<init>(r2)     // Catch: java.lang.Throwable -> L224
            r6.b(r12)     // Catch: java.lang.Throwable -> L224
        L37:
            w0.r r2 = r1.f14818i     // Catch: java.lang.Throwable -> L224
            long r13 = r1.f14819j     // Catch: java.lang.Throwable -> L224
            monitor-exit(r5)
            r5 = -1
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 == 0) goto L6e
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 != 0) goto L47
            goto L6e
        L47:
            java.lang.String r5 = "Detected multithreaded access to SnapshotStateObserver: previousThreadId="
            java.lang.String r6 = "), currentThread={id="
            java.lang.StringBuilder r5 = p.a.o(r13, r5, r6)
            r5.append(r3)
            java.lang.String r6 = ", name="
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            i0.n1.a(r5)
        L6e:
            java.lang.Object r5 = r1.f14816g     // Catch: java.lang.Throwable -> L9e
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L9e
            r1.f14818i = r12     // Catch: java.lang.Throwable -> L214
            r1.f14819j = r3     // Catch: java.lang.Throwable -> L214
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9e
            nb.a r3 = r1.f14814e     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r4 = r12.f14798b     // Catch: java.lang.Throwable -> L9e
            f.b0 r5 = r12.f14799c     // Catch: java.lang.Throwable -> L9e
            int r6 = r12.f14800d     // Catch: java.lang.Throwable -> L9e
            r12.f14798b = r0     // Catch: java.lang.Throwable -> L9e
            f.k0 r8 = r12.f14802f     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = r8.g(r0)     // Catch: java.lang.Throwable -> L9e
            f.b0 r0 = (f.b0) r0     // Catch: java.lang.Throwable -> L9e
            r12.f14799c = r0     // Catch: java.lang.Throwable -> L9e
            int r0 = r12.f14800d     // Catch: java.lang.Throwable -> L9e
            r8 = -1
            if (r0 != r8) goto La2
            w0.f r0 = w0.m.j()     // Catch: java.lang.Throwable -> L9e
            long r15 = r0.g()     // Catch: java.lang.Throwable -> L9e
            int r0 = java.lang.Long.hashCode(r15)     // Catch: java.lang.Throwable -> L9e
            r12.f14800d = r0     // Catch: java.lang.Throwable -> L9e
            goto La2
        L9e:
            r0 = move-exception
            r6 = r13
            goto L218
        La2:
            i0.g0 r0 = r12.f14805i     // Catch: java.lang.Throwable -> L9e
            j0.b r8 = i0.r.o()     // Catch: java.lang.Throwable -> L9e
            r8.b(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r3 != 0) goto Lba
            r29.invoke()     // Catch: java.lang.Throwable -> Lb4
            r28 = r12
            goto L13c
        Lb4:
            r0 = move-exception
            r18 = r7
            r6 = r13
            goto L20a
        Lba:
            b5.c r0 = w0.m.f14785b     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r0.o()     // Catch: java.lang.Throwable -> Lb4
            r10 = r0
            w0.f r10 = (w0.f) r10     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r10 instanceof w0.y     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L106
            r0 = r10
            w0.y r0 = (w0.y) r0     // Catch: java.lang.Throwable -> Lb4
            r28 = r12
            long r11 = r0.f14835t     // Catch: java.lang.Throwable -> Lb4
            long r16 = s0.i.c()     // Catch: java.lang.Throwable -> Lb4
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 != 0) goto L108
            r0 = r10
            w0.y r0 = (w0.y) r0     // Catch: java.lang.Throwable -> Lb4
            fg.l r11 = r0.f14833r     // Catch: java.lang.Throwable -> Lb4
            r0 = r10
            w0.y r0 = (w0.y) r0     // Catch: java.lang.Throwable -> Lb4
            fg.l r12 = r0.f14834s     // Catch: java.lang.Throwable -> Lb4
            r0 = r10
            w0.y r0 = (w0.y) r0     // Catch: java.lang.Throwable -> Lfb
            fg.l r3 = w0.m.k(r3, r11, r7)     // Catch: java.lang.Throwable -> Lfb
            r0.f14833r = r3     // Catch: java.lang.Throwable -> Lfb
            r0 = r10
            w0.y r0 = (w0.y) r0     // Catch: java.lang.Throwable -> Lfb
            r0.f14834s = r12     // Catch: java.lang.Throwable -> Lfb
            r29.invoke()     // Catch: java.lang.Throwable -> Lfb
            r0 = r10
            w0.y r0 = (w0.y) r0     // Catch: java.lang.Throwable -> Lb4
            r0.f14833r = r11     // Catch: java.lang.Throwable -> Lb4
            w0.y r10 = (w0.y) r10     // Catch: java.lang.Throwable -> Lb4
            r10.f14834s = r12     // Catch: java.lang.Throwable -> Lb4
            goto L13c
        Lfb:
            r0 = move-exception
            r3 = r10
            w0.y r3 = (w0.y) r3     // Catch: java.lang.Throwable -> Lb4
            r3.f14833r = r11     // Catch: java.lang.Throwable -> Lb4
            w0.y r10 = (w0.y) r10     // Catch: java.lang.Throwable -> Lb4
            r10.f14834s = r12     // Catch: java.lang.Throwable -> Lb4
            throw r0     // Catch: java.lang.Throwable -> Lb4
        L106:
            r28 = r12
        L108:
            if (r10 == 0) goto L10e
            boolean r0 = r10 instanceof w0.b     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L110
        L10e:
            r0 = 0
            goto L116
        L110:
            w0.f r0 = r10.u(r3)     // Catch: java.lang.Throwable -> Lb4
            r15 = r0
            goto L12f
        L116:
            w0.y r15 = new w0.y     // Catch: java.lang.Throwable -> Lb4
            boolean r11 = r10 instanceof w0.b     // Catch: java.lang.Throwable -> Lb4
            if (r11 == 0) goto L122
            r11 = r10
            w0.b r11 = (w0.b) r11     // Catch: java.lang.Throwable -> Lb4
            r16 = r11
            goto L124
        L122:
            r16 = r0
        L124:
            r19 = 1
            r20 = 0
            r18 = 0
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> Lb4
        L12f:
            w0.f r3 = r15.j()     // Catch: java.lang.Throwable -> L1f7
            r29.invoke()     // Catch: java.lang.Throwable -> L1fc
            w0.f.q(r3)     // Catch: java.lang.Throwable -> L1f7
            r15.c()     // Catch: java.lang.Throwable -> Lb4
        L13c:
            int r0 = r8.f6673i     // Catch: java.lang.Throwable -> L9e
            int r0 = r0 - r7
            r8.k(r0)     // Catch: java.lang.Throwable -> L9e
            r12 = r28
            java.lang.Object r0 = r12.f14798b     // Catch: java.lang.Throwable -> L9e
            r0.getClass()     // Catch: java.lang.Throwable -> L9e
            int r3 = r12.f14800d     // Catch: java.lang.Throwable -> L9e
            f.b0 r8 = r12.f14799c     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L1d8
            long[] r10 = r8.f2774a     // Catch: java.lang.Throwable -> L1db
            int r11 = r10.length     // Catch: java.lang.Throwable -> L1db
            int r11 = r11 + (-2)
            if (r11 < 0) goto L1d8
            r17 = r10
            r15 = 0
        L159:
            r9 = r17[r15]     // Catch: java.lang.Throwable -> L1db
            r18 = r7
            r19 = r8
            long r7 = ~r9     // Catch: java.lang.Throwable -> L1db
            r20 = 7
            long r7 = r7 << r20
            long r7 = r7 & r9
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto L1ca
            int r7 = r15 - r11
            int r7 = ~r7     // Catch: java.lang.Throwable -> L1db
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r27 = r8
            r8 = 0
        L17c:
            if (r8 >= r7) goto L1c1
            r20 = 255(0xff, double:1.26E-321)
            long r20 = r9 & r20
            r22 = 128(0x80, double:6.3E-322)
            int r20 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r20 >= 0) goto L1ad
            int r20 = r15 << 3
            r21 = r8
            int r8 = r20 + r21
            r28 = r9
            r9 = r19
            java.lang.Object[] r10 = r9.f2775b     // Catch: java.lang.Throwable -> L1db
            r10 = r10[r8]     // Catch: java.lang.Throwable -> L1db
            r19 = r13
            int[] r13 = r9.f2776c     // Catch: java.lang.Throwable -> L1f3
            r13 = r13[r8]     // Catch: java.lang.Throwable -> L1f3
            if (r13 == r3) goto L1a1
            r13 = r18
            goto L1a2
        L1a1:
            r13 = 0
        L1a2:
            if (r13 == 0) goto L1a7
            r12.c(r0, r10)     // Catch: java.lang.Throwable -> L1f3
        L1a7:
            if (r13 == 0) goto L1b5
            r9.f(r8)     // Catch: java.lang.Throwable -> L1f3
            goto L1b5
        L1ad:
            r21 = r8
            r28 = r9
            r9 = r19
            r19 = r13
        L1b5:
            long r13 = r28 >> r27
            int r8 = r21 + 1
            r24 = r19
            r19 = r9
            r9 = r13
            r13 = r24
            goto L17c
        L1c1:
            r8 = r27
            r9 = r19
            r19 = r13
            if (r7 != r8) goto L1df
            goto L1ce
        L1ca:
            r9 = r19
            r19 = r13
        L1ce:
            if (r15 == r11) goto L1df
            int r15 = r15 + 1
            r8 = r9
            r7 = r18
            r13 = r19
            goto L159
        L1d8:
            r19 = r13
            goto L1df
        L1db:
            r0 = move-exception
            r19 = r13
            goto L1f4
        L1df:
            r12.f14798b = r4     // Catch: java.lang.Throwable -> L1f3
            r12.f14799c = r5     // Catch: java.lang.Throwable -> L1f3
            r12.f14800d = r6     // Catch: java.lang.Throwable -> L1f3
            java.lang.Object r3 = r1.f14816g
            monitor-enter(r3)
            r1.f14818i = r2     // Catch: java.lang.Throwable -> L1f0
            r6 = r19
            r1.f14819j = r6     // Catch: java.lang.Throwable -> L1f0
            monitor-exit(r3)
            return
        L1f0:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L1f3:
            r0 = move-exception
        L1f4:
            r6 = r19
            goto L218
        L1f7:
            r0 = move-exception
            r18 = r7
            r6 = r13
            goto L205
        L1fc:
            r0 = move-exception
            r18 = r7
            r6 = r13
            w0.f.q(r3)     // Catch: java.lang.Throwable -> L204
            throw r0     // Catch: java.lang.Throwable -> L204
        L204:
            r0 = move-exception
        L205:
            r15.c()     // Catch: java.lang.Throwable -> L209
            throw r0     // Catch: java.lang.Throwable -> L209
        L209:
            r0 = move-exception
        L20a:
            int r3 = r8.f6673i     // Catch: java.lang.Throwable -> L212
            int r3 = r3 + (-1)
            r8.k(r3)     // Catch: java.lang.Throwable -> L212
            throw r0     // Catch: java.lang.Throwable -> L212
        L212:
            r0 = move-exception
            goto L218
        L214:
            r0 = move-exception
            r6 = r13
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L212
            throw r0     // Catch: java.lang.Throwable -> L212
        L218:
            java.lang.Object r3 = r1.f14816g
            monitor-enter(r3)
            r1.f14818i = r2     // Catch: java.lang.Throwable -> L221
            r1.f14819j = r6     // Catch: java.lang.Throwable -> L221
            monitor-exit(r3)
            throw r0
        L221:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L224:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public final void d() {
            r3 = this;
            b0.t r0 = r3.f14813d
            w0.l r1 = w0.m.f14784a
            w0.m.e(r1)
            java.lang.Object r1 = w0.m.f14786c
            monitor-enter(r1)
            java.lang.Object r2 = w0.m.f14791h     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList r2 = tf.m.G1(r2, r0)     // Catch: java.lang.Throwable -> L1d
            w0.m.f14791h = r2     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            q9.a r1 = new q9.a
            r2 = 10
            r1.<init>(r0, r2)
            r3.f14817h = r1
            return
        L1d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
