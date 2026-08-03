package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends ug.b implements tg.d, tg.z, tg.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f13190l = null;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13191k;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state$volatile"
            java.lang.Class<tg.b0> r2 = tg.b0.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            tg.b0.f13190l = r0
            return
    }

    public b0(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state$volatile = r1
            return
    }

    @Override // tg.d
    public final java.lang.Object b(tg.e r18, wf.c r19) {
            r17 = this;
            r0 = r19
            boolean r1 = r0 instanceof tg.a0
            if (r1 == 0) goto L17
            r1 = r0
            tg.a0 r1 = (tg.a0) r1
            int r2 = r1.f13186n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f13186n = r2
            r2 = r17
            goto L1e
        L17:
            tg.a0 r1 = new tg.a0
            r2 = r17
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f13184l
            int r3 = r1.f13186n
            xf.a r4 = xf.a.f21579g
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L60
            if (r3 == r8) goto L56
            if (r3 == r7) goto L48
            if (r3 != r6) goto L41
            java.lang.Object r3 = r1.f13183k
            qg.r0 r9 = r1.f13182j
            tg.c0 r10 = r1.f13181i
            tg.e r11 = r1.f13180h
            tg.b0 r12 = r1.f13179g
            f8.i.I0(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r3
            goto L7c
        L3e:
            r0 = move-exception
            goto Lf9
        L41:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L48:
            java.lang.Object r3 = r1.f13183k
            qg.r0 r9 = r1.f13182j
            tg.c0 r10 = r1.f13181i
            tg.e r11 = r1.f13180h
            tg.b0 r12 = r1.f13179g
            f8.i.I0(r0)     // Catch: java.lang.Throwable -> L3e
            goto Lb2
        L56:
            tg.c0 r10 = r1.f13181i
            tg.e r3 = r1.f13180h
            tg.b0 r12 = r1.f13179g
            f8.i.I0(r0)     // Catch: java.lang.Throwable -> L3e
            goto L6d
        L60:
            f8.i.I0(r0)
            ug.d r0 = r2.a()
            tg.c0 r0 = (tg.c0) r0
            r3 = r18
            r10 = r0
            r12 = r2
        L6d:
            wf.g r0 = r1.getContext()     // Catch: java.lang.Throwable -> L3e
            qg.q r9 = qg.q.f11090h     // Catch: java.lang.Throwable -> L3e
            wf.e r0 = r0.s(r9)     // Catch: java.lang.Throwable -> L3e
            qg.r0 r0 = (qg.r0) r0     // Catch: java.lang.Throwable -> L3e
            r9 = r0
            r11 = r3
            r0 = 0
        L7c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = tg.b0.f13190l     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r3.get(r12)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L90
            boolean r13 = r9.b()     // Catch: java.lang.Throwable -> L3e
            if (r13 == 0) goto L8b
            goto L90
        L8b:
            java.util.concurrent.CancellationException r0 = r9.h()     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L90:
            if (r0 == 0) goto L98
            boolean r13 = r0.equals(r3)     // Catch: java.lang.Throwable -> L3e
            if (r13 != 0) goto Lb3
        L98:
            l3.q r0 = ug.c.f13807b     // Catch: java.lang.Throwable -> L3e
            if (r3 != r0) goto L9e
            r0 = 0
            goto L9f
        L9e:
            r0 = r3
        L9f:
            r1.f13179g = r12     // Catch: java.lang.Throwable -> L3e
            r1.f13180h = r11     // Catch: java.lang.Throwable -> L3e
            r1.f13181i = r10     // Catch: java.lang.Throwable -> L3e
            r1.f13182j = r9     // Catch: java.lang.Throwable -> L3e
            r1.f13183k = r3     // Catch: java.lang.Throwable -> L3e
            r1.f13186n = r7     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r11.e(r0, r1)     // Catch: java.lang.Throwable -> L3e
            if (r0 != r4) goto Lb2
            goto Lf8
        Lb2:
            r0 = r3
        Lb3:
            java.util.concurrent.atomic.AtomicReference r3 = r10.f13193a     // Catch: java.lang.Throwable -> L3e
            l3.q r13 = tg.s.f13246b     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r3.getAndSet(r13)     // Catch: java.lang.Throwable -> L3e
            r3.getClass()     // Catch: java.lang.Throwable -> L3e
            l3.q r14 = tg.s.f13247c     // Catch: java.lang.Throwable -> L3e
            if (r3 != r14) goto Lc3
            goto L7c
        Lc3:
            r1.f13179g = r12     // Catch: java.lang.Throwable -> L3e
            r1.f13180h = r11     // Catch: java.lang.Throwable -> L3e
            r1.f13181i = r10     // Catch: java.lang.Throwable -> L3e
            r1.f13182j = r9     // Catch: java.lang.Throwable -> L3e
            r1.f13183k = r0     // Catch: java.lang.Throwable -> L3e
            r1.f13186n = r6     // Catch: java.lang.Throwable -> L3e
            sf.n r3 = sf.n.f12433a     // Catch: java.lang.Throwable -> L3e
            qg.g r14 = new qg.g     // Catch: java.lang.Throwable -> L3e
            wf.c r15 = fb.v0.x(r1)     // Catch: java.lang.Throwable -> L3e
            r14.<init>(r8, r15)     // Catch: java.lang.Throwable -> L3e
            r14.p()     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.atomic.AtomicReference r15 = r10.f13193a     // Catch: java.lang.Throwable -> L3e
        Ldf:
            boolean r16 = r15.compareAndSet(r13, r14)     // Catch: java.lang.Throwable -> L3e
            if (r16 == 0) goto Le6
            goto Lef
        Le6:
            java.lang.Object r5 = r15.get()     // Catch: java.lang.Throwable -> L3e
            if (r5 == r13) goto Ldf
            r14.resumeWith(r3)     // Catch: java.lang.Throwable -> L3e
        Lef:
            java.lang.Object r5 = r14.o()     // Catch: java.lang.Throwable -> L3e
            if (r5 != r4) goto Lf6
            r3 = r5
        Lf6:
            if (r3 != r4) goto L7c
        Lf8:
            return r4
        Lf9:
            r12.f(r10)
            throw r0
    }

    @Override // ug.b
    public final ug.d c() {
            r1 = this;
            tg.c0 r0 = new tg.c0
            r0.<init>()
            return r0
    }

    @Override // ug.b
    public final ug.d[] d() {
            r1 = this;
            r0 = 2
            tg.c0[] r0 = new tg.c0[r0]
            return r0
    }

    @Override // tg.e
    public final java.lang.Object e(java.lang.Object r1, wf.c r2) {
            r0 = this;
            if (r1 != 0) goto L4
            l3.q r1 = ug.c.f13807b
        L4:
            r2 = 0
            r0.h(r2, r1)
            sf.n r1 = sf.n.f12433a
            return r1
    }

    @Override // tg.z
    public final java.lang.Object getValue() {
            r2 = this;
            l3.q r0 = ug.c.f13807b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = tg.b0.f13190l
            java.lang.Object r1 = r1.get(r2)
            if (r1 != r0) goto Lc
            r0 = 0
            return r0
        Lc:
            return r1
    }

    public final boolean h(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = tg.b0.f13190l     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            if (r10 == 0) goto L15
            boolean r10 = gg.l.a(r1, r10)     // Catch: java.lang.Throwable -> L12
            if (r10 != 0) goto L15
            monitor-exit(r9)
            return r2
        L12:
            r10 = move-exception
            goto L8c
        L15:
            boolean r10 = gg.l.a(r1, r11)     // Catch: java.lang.Throwable -> L12
            r1 = 1
            if (r10 == 0) goto L1e
            monitor-exit(r9)
            return r1
        L1e:
            r0.set(r9, r11)     // Catch: java.lang.Throwable -> L12
            int r10 = r9.f13191k     // Catch: java.lang.Throwable -> L12
            r11 = r10 & 1
            if (r11 != 0) goto L86
            int r10 = r10 + r1
            r9.f13191k = r10     // Catch: java.lang.Throwable -> L12
            ug.d[] r11 = r9.f13802g     // Catch: java.lang.Throwable -> L12
            monitor-exit(r9)
        L2d:
            tg.c0[] r11 = (tg.c0[]) r11
            if (r11 == 0) goto L71
            int r0 = r11.length
            r3 = r2
        L33:
            if (r3 >= r0) goto L71
            r4 = r11[r3]
            if (r4 == 0) goto L6e
            java.util.concurrent.atomic.AtomicReference r4 = r4.f13193a
        L3b:
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L42
            goto L6e
        L42:
            l3.q r6 = tg.s.f13247c
            if (r5 != r6) goto L47
            goto L6e
        L47:
            l3.q r7 = tg.s.f13246b
            if (r5 != r7) goto L59
        L4b:
            boolean r7 = r4.compareAndSet(r5, r6)
            if (r7 == 0) goto L52
            goto L6e
        L52:
            java.lang.Object r7 = r4.get()
            if (r7 == r5) goto L4b
            goto L3b
        L59:
            boolean r6 = r4.compareAndSet(r5, r7)
            if (r6 == 0) goto L67
            qg.g r5 = (qg.g) r5
            sf.n r4 = sf.n.f12433a
            r5.resumeWith(r4)
            goto L6e
        L67:
            java.lang.Object r6 = r4.get()
            if (r6 == r5) goto L59
            goto L3b
        L6e:
            int r3 = r3 + 1
            goto L33
        L71:
            monitor-enter(r9)
            int r11 = r9.f13191k     // Catch: java.lang.Throwable -> L7b
            if (r11 != r10) goto L7d
            int r10 = r10 + r1
            r9.f13191k = r10     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r9)
            return r1
        L7b:
            r10 = move-exception
            goto L84
        L7d:
            ug.d[] r10 = r9.f13802g     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r9)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L2d
        L84:
            monitor-exit(r9)
            throw r10
        L86:
            int r10 = r10 + 2
            r9.f13191k = r10     // Catch: java.lang.Throwable -> L12
            monitor-exit(r9)
            return r1
        L8c:
            monitor-exit(r9)
            throw r10
    }
}
