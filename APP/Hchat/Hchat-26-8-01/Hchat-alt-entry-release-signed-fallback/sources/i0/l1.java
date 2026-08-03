package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.q f5954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.o f5955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.h0 f5956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg.p f5957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x1.f2 f5959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f5960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f5961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f.l0 f5963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b5.i f5964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0.z1 f5965l;

    public l1(i0.q r1, i0.o r2, i0.h0 r3, f.n0 r4, fg.p r5, boolean r6, x1.f2 r7, java.lang.Object r8) {
            r0 = this;
            r0.<init>()
            r0.f5954a = r1
            r0.f5955b = r2
            r0.f5956c = r3
            r0.f5957d = r5
            r0.f5958e = r6
            r0.f5959f = r7
            r0.f5960g = r8
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            i0.m1 r2 = i0.m1.f5975i
            r1.<init>(r2)
            r0.f5961h = r1
            long r1 = s0.i.c()
            r0.f5962i = r1
            f.l0 r1 = f.s0.f2899a
            r1.getClass()
            r0.f5963j = r1
            b5.i r1 = new b5.i
            r1.<init>()
            x0.d r2 = r3.C()
            r1.i(r4, r2)
            r0.f5964k = r1
            i0.z1 r1 = new i0.z1
            java.lang.Object r2 = r7.f20913i
            r1.<init>(r2)
            r0.f5965l = r1
            return
    }

    public final void a() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r5.f5961h
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Exception -> L15
            i0.m1 r1 = (i0.m1) r1     // Catch: java.lang.Exception -> L15
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> L15
            switch(r1) {
                case 0: goto L65;
                case 1: goto L5d;
                case 2: goto L55;
                case 3: goto L55;
                case 4: goto L55;
                case 5: goto L1f;
                case 6: goto L17;
                default: goto Lf;
            }     // Catch: java.lang.Exception -> L15
        Lf:
            af.d r1 = new af.d     // Catch: java.lang.Exception -> L15
            r1.<init>()     // Catch: java.lang.Exception -> L15
            throw r1     // Catch: java.lang.Exception -> L15
        L15:
            r1 = move-exception
            goto L6d
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = "The paused composition has already been applied"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L15
            throw r1     // Catch: java.lang.Exception -> L15
        L1f:
            r5.b()     // Catch: java.lang.Exception -> L15
            i0.m1 r1 = i0.m1.f5978l     // Catch: java.lang.Exception -> L15
            i0.m1 r2 = i0.m1.f5979m     // Catch: java.lang.Exception -> L15
        L26:
            boolean r3 = r0.compareAndSet(r1, r2)     // Catch: java.lang.Exception -> L15
            if (r3 == 0) goto L2d
            return
        L2d:
            java.lang.Object r3 = r0.get()     // Catch: java.lang.Exception -> L15
            if (r3 == r1) goto L26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L15
            r3.<init>()     // Catch: java.lang.Exception -> L15
            java.lang.String r4 = "Unexpected state change from: "
            r3.append(r4)     // Catch: java.lang.Exception -> L15
            r3.append(r1)     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = " to: "
            r3.append(r1)     // Catch: java.lang.Exception -> L15
            r3.append(r2)     // Catch: java.lang.Exception -> L15
            r1 = 46
            r3.append(r1)     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L15
            i0.n1.b(r1)     // Catch: java.lang.Exception -> L15
            return
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = "The paused composition has not completed yet"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L15
            throw r1     // Catch: java.lang.Exception -> L15
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = "The paused composition has been cancelled"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L15
            throw r1     // Catch: java.lang.Exception -> L15
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = "The paused composition is invalid because of a previous exception"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L15
            throw r1     // Catch: java.lang.Exception -> L15
        L6d:
            i0.m1 r2 = i0.m1.f5973g
            r0.set(r2)
            throw r1
    }

    public final void b() {
            r5 = this;
            java.lang.String r0 = "PausedComposition:applyChanges"
            android.os.Trace.beginSection(r0)
            java.lang.Object r0 = r5.f5960g     // Catch: java.lang.Throwable -> L2a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            i0.z1 r2 = r5.f5965l     // Catch: java.lang.Throwable -> L2e
            x1.f2 r3 = r5.f5959f     // Catch: java.lang.Throwable -> L2e
            b5.i r4 = r5.f5964k     // Catch: java.lang.Throwable -> L2e
            r2.a(r3, r4)     // Catch: java.lang.Throwable -> L2e
            b5.i r2 = r5.f5964k     // Catch: java.lang.Throwable -> L2e
            r2.c()     // Catch: java.lang.Throwable -> L2e
            b5.i r2 = r5.f5964k     // Catch: java.lang.Throwable -> L2e
            r2.d()     // Catch: java.lang.Throwable -> L2e
            b5.i r2 = r5.f5964k     // Catch: java.lang.Throwable -> L2c
            r2.b()     // Catch: java.lang.Throwable -> L2c
            i0.q r2 = r5.f5954a     // Catch: java.lang.Throwable -> L2c
            r2.f6012w = r1     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            android.os.Trace.endSection()
            return
        L2a:
            r0 = move-exception
            goto L3b
        L2c:
            r1 = move-exception
            goto L39
        L2e:
            r2 = move-exception
            b5.i r3 = r5.f5964k     // Catch: java.lang.Throwable -> L2c
            r3.b()     // Catch: java.lang.Throwable -> L2c
            i0.q r3 = r5.f5954a     // Catch: java.lang.Throwable -> L2c
            r3.f6012w = r1     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1     // Catch: java.lang.Throwable -> L2a
        L3b:
            android.os.Trace.endSection()
            throw r0
    }

    public final boolean c() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f5961h
            java.lang.Object r0 = r0.get()
            i0.m1 r0 = (i0.m1) r0
            i0.m1 r1 = i0.m1.f5978l
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final void d() {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference r0 = r4.f5961h
            i0.m1 r1 = i0.m1.f5976j
            i0.m1 r2 = i0.m1.f5978l
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto Le
            r0 = 1
            goto L15
        Le:
            java.lang.Object r0 = r0.get()
            if (r0 == r1) goto L0
            r0 = 0
        L15:
            if (r0 != 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected state change from: "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = " to: "
            r0.append(r1)
            r0.append(r2)
            r1 = 46
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            i0.n1.b(r0)
        L35:
            return
    }

    public final boolean e(i0.e2 r14) {
            r13 = this;
            i0.m1 r0 = i0.m1.f5977k
            java.util.concurrent.atomic.AtomicReference r1 = r13.f5961h
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Exception -> L23
            i0.m1 r2 = (i0.m1) r2     // Catch: java.lang.Exception -> L23
            int r2 = r2.ordinal()     // Catch: java.lang.Exception -> L23
            i0.m1 r3 = i0.m1.f5976j
            i0.q r4 = r13.f5954a
            i0.o r5 = r13.f5955b
            r6 = 46
            java.lang.String r7 = " to: "
            java.lang.String r8 = "Unexpected state change from: "
            switch(r2) {
                case 0: goto L13e;
                case 1: goto L136;
                case 2: goto Ldc;
                case 3: goto L41;
                case 4: goto L36;
                case 5: goto L2e;
                case 6: goto L26;
                default: goto L1d;
            }
        L1d:
            af.d r14 = new af.d     // Catch: java.lang.Exception -> L23
            r14.<init>()     // Catch: java.lang.Exception -> L23
            throw r14     // Catch: java.lang.Exception -> L23
        L23:
            r14 = move-exception
            goto L146
        L26:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "The paused composition has been applied"
            r14.<init>(r0)     // Catch: java.lang.Exception -> L23
            throw r14     // Catch: java.lang.Exception -> L23
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "Pausable composition is complete and apply() should be applied"
            r14.<init>(r0)     // Catch: java.lang.Exception -> L23
            throw r14     // Catch: java.lang.Exception -> L23
        L36:
            java.lang.String r14 = "Recursive call to resume()"
            i0.m.b(r14)     // Catch: java.lang.Exception -> L23
            af.d r14 = new af.d     // Catch: java.lang.Exception -> L23
            r14.<init>()     // Catch: java.lang.Exception -> L23
            throw r14     // Catch: java.lang.Exception -> L23
        L41:
            boolean r2 = r1.compareAndSet(r3, r0)     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto L48
            goto L69
        L48:
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Exception -> L23
            if (r2 == r3) goto L41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r2.<init>()     // Catch: java.lang.Exception -> L23
            r2.append(r8)     // Catch: java.lang.Exception -> L23
            r2.append(r3)     // Catch: java.lang.Exception -> L23
            r2.append(r7)     // Catch: java.lang.Exception -> L23
            r2.append(r0)     // Catch: java.lang.Exception -> L23
            r2.append(r6)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L23
            i0.n1.b(r2)     // Catch: java.lang.Exception -> L23
        L69:
            long r9 = r13.f5962i     // Catch: java.lang.Exception -> L23
            long r11 = s0.i.c()     // Catch: java.lang.Throwable -> Lb0
            r13.f5962i = r11     // Catch: java.lang.Throwable -> Lb0
            f.l0 r2 = r13.f5963j     // Catch: java.lang.Throwable -> Lb0
            f.l0 r14 = r5.n(r4, r14, r2)     // Catch: java.lang.Throwable -> Lb0
            r13.f5963j = r14     // Catch: java.lang.Throwable -> Lb0
            r13.f5962i = r9     // Catch: java.lang.Exception -> L23
        L7b:
            boolean r14 = r1.compareAndSet(r0, r3)     // Catch: java.lang.Exception -> L23
            if (r14 == 0) goto L82
            goto La3
        L82:
            java.lang.Object r14 = r1.get()     // Catch: java.lang.Exception -> L23
            if (r14 == r0) goto L7b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r14.<init>()     // Catch: java.lang.Exception -> L23
            r14.append(r8)     // Catch: java.lang.Exception -> L23
            r14.append(r0)     // Catch: java.lang.Exception -> L23
            r14.append(r7)     // Catch: java.lang.Exception -> L23
            r14.append(r3)     // Catch: java.lang.Exception -> L23
            r14.append(r6)     // Catch: java.lang.Exception -> L23
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Exception -> L23
            i0.n1.b(r14)     // Catch: java.lang.Exception -> L23
        La3:
            f.l0 r14 = r13.f5963j     // Catch: java.lang.Exception -> L23
            boolean r14 = r14.g()     // Catch: java.lang.Exception -> L23
            if (r14 == 0) goto L12a
            r13.d()     // Catch: java.lang.Exception -> L23
            goto L12a
        Lb0:
            r14 = move-exception
            r13.f5962i = r9     // Catch: java.lang.Exception -> L23
        Lb3:
            boolean r2 = r1.compareAndSet(r0, r3)     // Catch: java.lang.Exception -> L23
            if (r2 != 0) goto Ldb
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Exception -> L23
            if (r2 != r0) goto Lc0
            goto Lb3
        Lc0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r2.<init>()     // Catch: java.lang.Exception -> L23
            r2.append(r8)     // Catch: java.lang.Exception -> L23
            r2.append(r0)     // Catch: java.lang.Exception -> L23
            r2.append(r7)     // Catch: java.lang.Exception -> L23
            r2.append(r3)     // Catch: java.lang.Exception -> L23
            r2.append(r6)     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L23
            i0.n1.b(r0)     // Catch: java.lang.Exception -> L23
        Ldb:
            throw r14     // Catch: java.lang.Exception -> L23
        Ldc:
            i0.h0 r0 = r13.f5956c
            boolean r2 = r13.f5958e
            if (r2 == 0) goto Le8
            r9 = 0
            r0.f5919z = r9     // Catch: java.lang.Exception -> L23
            r9 = 1
            r0.f5918y = r9     // Catch: java.lang.Exception -> L23
        Le8:
            fg.p r9 = r13.f5957d     // Catch: java.lang.Throwable -> L12f
            f.l0 r14 = r5.b(r4, r14, r9)     // Catch: java.lang.Throwable -> L12f
            r13.f5963j = r14     // Catch: java.lang.Throwable -> L12f
            if (r2 == 0) goto Lf5
            r0.u()     // Catch: java.lang.Exception -> L23
        Lf5:
            i0.m1 r14 = i0.m1.f5975i     // Catch: java.lang.Exception -> L23
        Lf7:
            boolean r0 = r1.compareAndSet(r14, r3)     // Catch: java.lang.Exception -> L23
            if (r0 == 0) goto Lfe
            goto L11f
        Lfe:
            java.lang.Object r0 = r1.get()     // Catch: java.lang.Exception -> L23
            if (r0 == r14) goto Lf7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r0.<init>()     // Catch: java.lang.Exception -> L23
            r0.append(r8)     // Catch: java.lang.Exception -> L23
            r0.append(r14)     // Catch: java.lang.Exception -> L23
            r0.append(r7)     // Catch: java.lang.Exception -> L23
            r0.append(r3)     // Catch: java.lang.Exception -> L23
            r0.append(r6)     // Catch: java.lang.Exception -> L23
            java.lang.String r14 = r0.toString()     // Catch: java.lang.Exception -> L23
            i0.n1.b(r14)     // Catch: java.lang.Exception -> L23
        L11f:
            f.l0 r14 = r13.f5963j     // Catch: java.lang.Exception -> L23
            boolean r14 = r14.g()     // Catch: java.lang.Exception -> L23
            if (r14 == 0) goto L12a
            r13.d()     // Catch: java.lang.Exception -> L23
        L12a:
            boolean r14 = r13.c()
            return r14
        L12f:
            r14 = move-exception
            if (r2 == 0) goto L135
            r0.u()     // Catch: java.lang.Exception -> L23
        L135:
            throw r14     // Catch: java.lang.Exception -> L23
        L136:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "The paused composition has been cancelled"
            r14.<init>(r0)     // Catch: java.lang.Exception -> L23
            throw r14     // Catch: java.lang.Exception -> L23
        L13e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "The paused composition is invalid because of a previous exception"
            r14.<init>(r0)     // Catch: java.lang.Exception -> L23
            throw r14     // Catch: java.lang.Exception -> L23
        L146:
            i0.m1 r0 = i0.m1.f5973g
            r1.set(r0)
            throw r14
    }
}
