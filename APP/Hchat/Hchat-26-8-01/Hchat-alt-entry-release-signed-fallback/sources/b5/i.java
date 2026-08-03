package b5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.util.RandomAccess f480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object f481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f485k;

    public i() {
            r3 = this;
            r3.<init>()
            j0.b r0 = new j0.b
            r1 = 16
            i0.k0[] r2 = new i0.k0[r1]
            r0.<init>(r2)
            r3.f478d = r0
            f.l0 r2 = f.s0.f2899a
            f.l0 r2 = new f.l0
            r2.<init>()
            r3.f479e = r2
            r3.f480f = r0
            j0.b r0 = new j0.b
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2)
            r3.f481g = r0
            j0.b r0 = new j0.b
            fg.a[] r1 = new fg.a[r1]
            r0.<init>(r1)
            r3.f482h = r0
            return
    }

    public i(b5.c r11, k5.z r12, ac.k r13) {
            r10 = this;
            r10.<init>()
            b5.h r0 = new b5.h
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f474a = r1
            r10.f482h = r0
            r10.f476b = r11
            r10.f477c = r12
            r10.f478d = r13
            r0 = 0
            k5.b0 r13 = r13.p()     // Catch: java.lang.Exception -> L9f
            f6.e r13 = f6.e.h(r13)     // Catch: java.lang.Exception -> L9f
            r10.f479e = r13     // Catch: java.lang.Exception -> L9f
            java.util.List r1 = r12.j1()     // Catch: java.lang.Exception -> L9f
            f6.e r1 = f6.e.g(r1)     // Catch: java.lang.Exception -> L9f
            r10.f480f = r1     // Catch: java.lang.Exception -> L9f
            r13.getClass()     // Catch: java.lang.Exception -> L9f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L9f
            r1.<init>(r13)     // Catch: java.lang.Exception -> L9f
            r10.f475a = r1     // Catch: java.lang.Exception -> L9f
            ac.k r1 = new ac.k     // Catch: java.lang.Exception -> L9f
            r2 = 1
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L9f
            r10.f483i = r1     // Catch: java.lang.Exception -> L9f
            ac.k r1 = new ac.k     // Catch: java.lang.Exception -> L9f
            r2 = 1
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L9f
            r10.f484j = r1     // Catch: java.lang.Exception -> L9f
            androidx.lifecycle.x r1 = new androidx.lifecycle.x     // Catch: java.lang.Exception -> L9f
            r1.<init>(r13)     // Catch: java.lang.Exception -> L9f
            r10.f485k = r1     // Catch: java.lang.Exception -> L9f
            int r2 = r13.size()     // Catch: java.lang.Exception -> L9f
            r3 = 1
            int r2 = r2 - r3
            int r1 = r1.u(r2)     // Catch: java.lang.Exception -> L9f
            int r2 = r13.size()     // Catch: java.lang.Exception -> L9f
            int r2 = r2 - r3
            java.lang.Object r13 = r13.get(r2)     // Catch: java.lang.Exception -> L9f
            t5.d r13 = (t5.d) r13     // Catch: java.lang.Exception -> L9f
            int r13 = r13.c()     // Catch: java.lang.Exception -> L9f
            int r1 = r1 + r13
            r13 = r0
        L6a:
            java.lang.Object r2 = r10.f479e     // Catch: java.lang.Exception -> L9f
            f6.e r2 = (f6.e) r2     // Catch: java.lang.Exception -> L9f
            int r2 = r2.size()     // Catch: java.lang.Exception -> L9f
            if (r13 >= r2) goto L136
            java.lang.Object r2 = r10.f479e     // Catch: java.lang.Exception -> L9f
            f6.e r2 = (f6.e) r2     // Catch: java.lang.Exception -> L9f
            java.lang.Object r2 = r2.get(r13)     // Catch: java.lang.Exception -> L9f
            t5.d r2 = (t5.d) r2     // Catch: java.lang.Exception -> L9f
            f5.f r4 = r2.i()     // Catch: java.lang.Exception -> L9f
            f5.f r5 = f5.f.f3282p     // Catch: java.lang.Exception -> L9f
            r6 = -1
            if (r4 != r5) goto Ldc
            java.lang.Object r5 = r10.f485k     // Catch: java.lang.Exception -> L9f
            androidx.lifecycle.x r5 = (androidx.lifecycle.x) r5     // Catch: java.lang.Exception -> L9f
            int r5 = r5.u(r13)     // Catch: java.lang.Exception -> L9f
            r7 = r2
            t5.f r7 = (t5.f) r7     // Catch: java.lang.Exception -> L9f
            int r7 = r7.l()     // Catch: java.lang.Exception -> L9f
            int r7 = r7 + r5
            f5.f r8 = f5.f.f3285s     // Catch: java.lang.Exception -> L9f b5.g -> La2
            int r7 = r10.e(r7, r8)     // Catch: java.lang.Exception -> L9f b5.g -> La2
            r8 = r3
            goto La3
        L9f:
            r13 = move-exception
            goto L137
        La2:
            r8 = r0
        La3:
            if (r8 == 0) goto L132
            java.lang.Object r8 = r10.f483i     // Catch: java.lang.Exception -> L9f
            ac.k r8 = (ac.k) r8     // Catch: java.lang.Exception -> L9f
            int r8 = r8.k(r7)     // Catch: java.lang.Exception -> L9f
            if (r8 == r6) goto Ld2
            f5.f r6 = f5.f.f3285s     // Catch: java.lang.Exception -> L9f
            t5.d r6 = r10.f(r7, r6)     // Catch: java.lang.Exception -> L9f
            java.util.ArrayList r7 = r10.f475a     // Catch: java.lang.Exception -> L9f
            y5.a r8 = new y5.a     // Catch: java.lang.Exception -> L9f
            u5.a r2 = (u5.a) r2     // Catch: java.lang.Exception -> L9f
            int r2 = r2.h()     // Catch: java.lang.Exception -> L9f
            int r9 = r1 - r5
            r8.<init>(r4, r2, r9)     // Catch: java.lang.Exception -> L9f
            r7.set(r13, r8)     // Catch: java.lang.Exception -> L9f
            java.util.ArrayList r2 = r10.f475a     // Catch: java.lang.Exception -> L9f
            r2.add(r6)     // Catch: java.lang.Exception -> L9f
            int r2 = r6.c()     // Catch: java.lang.Exception -> L9f
            int r2 = r2 + r1
            goto Ld4
        Ld2:
            r2 = r1
            r1 = r7
        Ld4:
            java.lang.Object r4 = r10.f483i     // Catch: java.lang.Exception -> L9f
            ac.k r4 = (ac.k) r4     // Catch: java.lang.Exception -> L9f
            r4.c(r1, r5)     // Catch: java.lang.Exception -> L9f
            goto L131
        Ldc:
            f5.f r5 = f5.f.f3283q     // Catch: java.lang.Exception -> L9f
            if (r4 != r5) goto L132
            java.lang.Object r5 = r10.f485k     // Catch: java.lang.Exception -> L9f
            androidx.lifecycle.x r5 = (androidx.lifecycle.x) r5     // Catch: java.lang.Exception -> L9f
            int r5 = r5.u(r13)     // Catch: java.lang.Exception -> L9f
            r7 = r2
            t5.f r7 = (t5.f) r7     // Catch: java.lang.Exception -> L9f
            int r7 = r7.l()     // Catch: java.lang.Exception -> L9f
            int r7 = r7 + r5
            f5.f r8 = f5.f.f3286t     // Catch: java.lang.Exception -> L9f b5.g -> Lf8
            int r7 = r10.e(r7, r8)     // Catch: java.lang.Exception -> L9f b5.g -> Lf8
            r8 = r3
            goto Lf9
        Lf8:
            r8 = r0
        Lf9:
            if (r8 == 0) goto L132
            java.lang.Object r8 = r10.f484j     // Catch: java.lang.Exception -> L9f
            ac.k r8 = (ac.k) r8     // Catch: java.lang.Exception -> L9f
            int r8 = r8.k(r7)     // Catch: java.lang.Exception -> L9f
            if (r8 == r6) goto L128
            f5.f r6 = f5.f.f3286t     // Catch: java.lang.Exception -> L9f
            t5.d r6 = r10.f(r7, r6)     // Catch: java.lang.Exception -> L9f
            java.util.ArrayList r7 = r10.f475a     // Catch: java.lang.Exception -> L9f
            y5.a r8 = new y5.a     // Catch: java.lang.Exception -> L9f
            u5.a r2 = (u5.a) r2     // Catch: java.lang.Exception -> L9f
            int r2 = r2.h()     // Catch: java.lang.Exception -> L9f
            int r9 = r1 - r5
            r8.<init>(r4, r2, r9)     // Catch: java.lang.Exception -> L9f
            r7.set(r13, r8)     // Catch: java.lang.Exception -> L9f
            java.util.ArrayList r2 = r10.f475a     // Catch: java.lang.Exception -> L9f
            r2.add(r6)     // Catch: java.lang.Exception -> L9f
            int r2 = r6.c()     // Catch: java.lang.Exception -> L9f
            int r2 = r2 + r1
            goto L12a
        L128:
            r2 = r1
            r1 = r7
        L12a:
            java.lang.Object r4 = r10.f484j     // Catch: java.lang.Exception -> L9f
            ac.k r4 = (ac.k) r4     // Catch: java.lang.Exception -> L9f
            r4.c(r1, r5)     // Catch: java.lang.Exception -> L9f
        L131:
            r1 = r2
        L132:
            int r13 = r13 + 1
            goto L6a
        L136:
            return
        L137:
            java.lang.Object r11 = r11.f471c     // Catch: java.lang.Exception -> L15e
            a2.a r11 = (a2.a) r11     // Catch: java.lang.Exception -> L15e
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Exception -> L15e
            r1.<init>()     // Catch: java.lang.Exception -> L15e
            q5.a r11 = r11.j(r1)     // Catch: java.io.IOException -> L156 java.lang.Exception -> L15e
            r11.i(r12)     // Catch: java.io.IOException -> L156 java.lang.Exception -> L15e
            java.lang.String r11 = r1.toString()     // Catch: java.lang.Exception -> L15e
            java.lang.String r12 = "Error while processing method %s"
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            d6.f r11 = d6.f.a(r13, r12, r11)
            throw r11
        L156:
            java.lang.AssertionError r11 = new java.lang.AssertionError     // Catch: java.lang.Exception -> L15e
            java.lang.String r12 = "Unexpected IOException"
            r11.<init>(r12)     // Catch: java.lang.Exception -> L15e
            throw r11     // Catch: java.lang.Exception -> L15e
        L15e:
            java.lang.String r11 = "Error while processing method"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            d6.f r11 = d6.f.a(r13, r11, r12)
            throw r11
    }

    public static final boolean h(i0.k0 r5, j0.b r6) {
            java.lang.Object[] r0 = r6.f6671g
            int r6 = r6.f6673i
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r6) goto L28
            r3 = r0[r2]
            i0.k0 r3 = (i0.k0) r3
            i0.a2 r3 = r3.f5944a
            boolean r4 = r3 instanceof s0.f
            if (r4 == 0) goto L25
            s0.f r3 = (s0.f) r3
            j0.b r3 = r3.f12188h
            boolean r4 = r3.j(r5)
            if (r4 == 0) goto L1d
            goto L23
        L1d:
            boolean r3 = h(r5, r3)
            if (r3 == 0) goto L25
        L23:
            r5 = 1
            return r5
        L25:
            int r2 = r2 + 1
            goto L6
        L28:
            return r1
    }

    public static void j(e5.a r9, int r10, java.util.Set r11) {
            f5.a[] r0 = f5.a.f3260n
            int r1 = r0.length
            r2 = 0
            r3 = r2
            r4 = r3
        L6:
            if (r3 >= r1) goto L18
            r5 = r0[r3]
            boolean r6 = r5.f3266j
            if (r6 == 0) goto L15
            int r5 = r5.f3263g
            r5 = r5 & r10
            if (r5 == 0) goto L15
            int r4 = r4 + 1
        L15:
            int r3 = r3 + 1
            goto L6
        L18:
            f5.a[] r1 = new f5.a[r4]
            int r3 = r0.length
            r5 = r2
            r6 = r5
        L1d:
            if (r5 >= r3) goto L32
            r7 = r0[r5]
            boolean r8 = r7.f3266j
            if (r8 == 0) goto L2f
            int r8 = r7.f3263g
            r8 = r8 & r10
            if (r8 == 0) goto L2f
            int r8 = r6 + 1
            r1[r6] = r7
            r6 = r8
        L2f:
            int r5 = r5 + 1
            goto L1d
        L32:
            r10 = 32
            if (r2 >= r4) goto L43
            r0 = r1[r2]
            java.lang.String r0 = r0.f3264h
            r9.write(r0)
            r9.write(r10)
            int r2 = r2 + 1
            goto L32
        L43:
            java.util.Iterator r11 = r11.iterator()
        L47:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r11.next()
            f5.c r0 = (f5.c) r0
            java.lang.String r0 = r0.f3274h
            r9.write(r0)
            r9.write(r10)
            goto L47
        L5c:
            return
    }

    public static void k(e5.a r3, k5.z r4, b5.c r5) {
            java.lang.String r0 = ".method "
            r3.write(r0)
            int r0 = r4.f7304l
            int r1 = r4.f7308p
            r2 = 7
            if (r1 != r2) goto Lf
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            goto L17
        Lf:
            java.util.Set r1 = f5.c.a(r1)
            java.util.EnumSet r1 = java.util.EnumSet.copyOf(r1)
        L17:
            j(r3, r0, r1)
            java.lang.String r0 = r4.getName()
            r3.write(r0)
            java.lang.String r0 = "("
            r3.write(r0)
            java.util.List r0 = r4.j1()
            f6.e r0 = f6.e.g(r0)
            r1 = 0
            f6.c r1 = r0.i(r1)
        L33:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()
            o5.p r2 = (o5.p) r2
            java.lang.String r2 = r2.f9535l
            r3.t(r2)
            goto L33
        L45:
            java.lang.String r1 = ")"
            r3.write(r1)
            java.lang.String r1 = r4.h1()
            r3.write(r1)
            r1 = 10
            r3.write(r1)
            r3.w()
            l(r5, r3, r4, r0)
            k5.u r5 = r4.f7302j
            int r4 = r4.f7307o
            java.util.Set r4 = o5.e.a(r5, r4)
            java.util.Set r4 = (java.util.Set) r4
            ac.p.Q(r3, r4)
            r3.u()
            java.lang.String r4 = ".end method\n"
            r3.write(r4)
            return
    }

    public static void l(b5.c r4, e5.a r5, k5.z r6, java.util.List r7) {
            f5.a r0 = f5.a.f3258l
            int r6 = r6.f7304l
            boolean r6 = r0.a(r6)
            r6 = r6 ^ 1
            java.util.Iterator r7 = r7.iterator()
        Le:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r7.next()
            o5.p r0 = (o5.p) r0
            java.lang.String r1 = r0.f9535l
            java.lang.String r2 = r0.f9534k
            java.util.Set r0 = r0.f9533j
            java.lang.Object r3 = r4.f469a
            if (r2 != 0) goto L2a
            int r3 = r0.size()
            if (r3 == 0) goto L5f
        L2a:
            java.lang.String r3 = ".param p"
            r5.write(r3)
            r5.z(r6)
            if (r2 == 0) goto L3c
            java.lang.String r3 = ", "
            r5.write(r3)
            r5.m(r2)
        L3c:
            java.lang.String r2 = "    # "
            r5.write(r2)
            r5.t(r1)
            java.lang.String r2 = "\n"
            r5.write(r2)
            int r2 = r0.size()
            if (r2 <= 0) goto L5f
            r5.w()
            java.util.Set r0 = (java.util.Set) r0
            ac.p.Q(r5, r0)
            r5.u()
            java.lang.String r0 = ".end param\n"
            r5.write(r0)
        L5f:
            int r0 = r6 + 1
            r2 = 0
            char r1 = r1.charAt(r2)
            r2 = 74
            if (r1 == r2) goto L71
            r2 = 68
            if (r1 != r2) goto L6f
            goto L71
        L6f:
            r6 = r0
            goto Le
        L71:
            int r6 = r6 + 2
            goto Le
        L74:
            return
    }

    public void a() {
            r3 = this;
            r0 = 0
            r3.f476b = r0
            r3.f477c = r0
            java.lang.Object r1 = r3.f478d
            j0.b r1 = (j0.b) r1
            r1.g()
            java.lang.Object r2 = r3.f479e
            f.l0 r2 = (f.l0) r2
            r2.b()
            r3.f480f = r1
            java.lang.Object r1 = r3.f481g
            j0.b r1 = (j0.b) r1
            r1.g()
            java.lang.Object r1 = r3.f482h
            j0.b r1 = (j0.b) r1
            r1.g()
            r3.f483i = r0
            r3.f484j = r0
            r3.f475a = r0
            return
    }

    public void b() {
            r2 = this;
            java.lang.Object r0 = r2.f476b
            java.util.Set r0 = (java.util.Set) r0
            if (r0 != 0) goto L7
            goto L36
        L7:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L36
            java.lang.String r1 = "Compose:abandons"
            android.os.Trace.beginSection(r1)
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2c
        L19:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2c
            i0.a2 r1 = (i0.a2) r1     // Catch: java.lang.Throwable -> L2c
            r0.remove()     // Catch: java.lang.Throwable -> L2c
            r1.d()     // Catch: java.lang.Throwable -> L2c
            goto L19
        L2c:
            r0 = move-exception
            goto L32
        L2e:
            android.os.Trace.endSection()
            return
        L32:
            android.os.Trace.endSection()
            throw r0
        L36:
            return
    }

    public void c() {
            r7 = this;
            java.lang.Object r0 = r7.f478d
            j0.b r0 = (j0.b) r0
            java.lang.Object r1 = r7.f481g
            j0.b r1 = (j0.b) r1
            java.lang.Object r2 = r7.f476b
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L10
            goto Lb7
        L10:
            r3 = 0
            r7.f485k = r3
            int r3 = r1.f6673i
            if (r3 == 0) goto L74
            java.lang.String r3 = "Compose:onForgotten"
            android.os.Trace.beginSection(r3)
            java.lang.Object r3 = r7.f483i     // Catch: java.lang.Throwable -> L6a
            f.l0 r3 = (f.l0) r3     // Catch: java.lang.Throwable -> L6a
            int r4 = r1.f6673i     // Catch: java.lang.Throwable -> L6a
            int r4 = r4 + (-1)
        L24:
            r5 = -1
            if (r5 >= r4) goto L6c
            java.lang.Object[] r5 = r1.f6671g     // Catch: java.lang.Throwable -> L6a
            r5 = r5[r4]     // Catch: java.lang.Throwable -> L6a
            boolean r6 = r5 instanceof i0.k0     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L3d
            r6 = r5
            i0.k0 r6 = (i0.k0) r6     // Catch: java.lang.Throwable -> L3b
            i0.a2 r6 = r6.f5944a     // Catch: java.lang.Throwable -> L3b
            r2.remove(r6)     // Catch: java.lang.Throwable -> L3b
            r6.f()     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r0 = move-exception
            goto L59
        L3d:
            boolean r6 = r5 instanceof i0.h     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L56
            if (r3 == 0) goto L50
            boolean r6 = r3.c(r5)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L50
            r6 = r5
            i0.h r6 = (i0.h) r6     // Catch: java.lang.Throwable -> L3b
            r6.a()     // Catch: java.lang.Throwable -> L3b
            goto L56
        L50:
            r6 = r5
            i0.h r6 = (i0.h) r6     // Catch: java.lang.Throwable -> L3b
            r6.b()     // Catch: java.lang.Throwable -> L3b
        L56:
            int r4 = r4 + (-1)
            goto L24
        L59:
            java.lang.Object r1 = r7.f477c     // Catch: java.lang.Throwable -> L6a
            x0.d r1 = (x0.d) r1     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L69
            wb.xi r2 = new wb.xi     // Catch: java.lang.Throwable -> L6a
            r3 = 24
            r2.<init>(r1, r3, r5)     // Catch: java.lang.Throwable -> L6a
            ig.a.b0(r0, r2)     // Catch: java.lang.Throwable -> L6a
        L69:
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            goto L70
        L6c:
            android.os.Trace.endSection()
            goto L74
        L70:
            android.os.Trace.endSection()
            throw r0
        L74:
            int r1 = r0.f6673i
            if (r1 == 0) goto Lb7
            java.lang.String r1 = "Compose:onRemembered"
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r7.f476b     // Catch: java.lang.Throwable -> Lac
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> Lac
            if (r1 != 0) goto L84
            goto Laf
        L84:
            java.lang.Object[] r2 = r0.f6671g     // Catch: java.lang.Throwable -> Lac
            int r0 = r0.f6673i     // Catch: java.lang.Throwable -> Lac
            r3 = 0
        L89:
            if (r3 >= r0) goto Laf
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lac
            i0.k0 r4 = (i0.k0) r4     // Catch: java.lang.Throwable -> Lac
            i0.a2 r5 = r4.f5944a     // Catch: java.lang.Throwable -> Lac
            r1.remove(r5)     // Catch: java.lang.Throwable -> Lac
            r5.j()     // Catch: java.lang.Throwable -> L9a
            int r3 = r3 + 1
            goto L89
        L9a:
            r0 = move-exception
            java.lang.Object r1 = r7.f477c     // Catch: java.lang.Throwable -> Lac
            x0.d r1 = (x0.d) r1     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto Lae
            wb.xi r2 = new wb.xi     // Catch: java.lang.Throwable -> Lac
            r3 = 24
            r2.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> Lac
            ig.a.b0(r0, r2)     // Catch: java.lang.Throwable -> Lac
            goto Lae
        Lac:
            r0 = move-exception
            goto Lb3
        Lae:
            throw r0     // Catch: java.lang.Throwable -> Lac
        Laf:
            android.os.Trace.endSection()
            return
        Lb3:
            android.os.Trace.endSection()
            throw r0
        Lb7:
            return
    }

    public void d() {
            r5 = this;
            java.lang.Object r0 = r5.f482h
            j0.b r0 = (j0.b) r0
            int r1 = r0.f6673i
            if (r1 == 0) goto L2b
            java.lang.String r1 = "Compose:sideeffects"
            android.os.Trace.beginSection(r1)
            java.lang.Object[] r1 = r0.f6671g     // Catch: java.lang.Throwable -> L1e
            int r2 = r0.f6673i     // Catch: java.lang.Throwable -> L1e
            r3 = 0
        L12:
            if (r3 >= r2) goto L20
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L1e
            fg.a r4 = (fg.a) r4     // Catch: java.lang.Throwable -> L1e
            r4.invoke()     // Catch: java.lang.Throwable -> L1e
            int r3 = r3 + 1
            goto L12
        L1e:
            r0 = move-exception
            goto L27
        L20:
            r0.g()     // Catch: java.lang.Throwable -> L1e
            android.os.Trace.endSection()
            return
        L27:
            android.os.Trace.endSection()
            throw r0
        L2b:
            return
    }

    public int e(int r7, f5.f r8) {
            r6 = this;
            java.lang.Object r0 = r6.f485k
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            java.lang.Object r1 = r6.f479e
            f6.e r1 = (f6.e) r1
            r2 = 1
            int r3 = r0.x(r7, r2)     // Catch: c6.b -> L40
            java.lang.Object r4 = r1.get(r3)
            t5.d r4 = (t5.d) r4
            f5.f r5 = r4.i()
            if (r5 == r8) goto L3f
            f5.f r4 = r4.i()
            f5.f r5 = f5.f.f3280n
            if (r4 != r5) goto L39
            int r3 = r3 + r2
            int r2 = r1.size()
            if (r3 >= r2) goto L39
            java.lang.Object r1 = r1.get(r3)
            t5.d r1 = (t5.d) r1
            f5.f r1 = r1.i()
            if (r1 != r8) goto L39
            int r7 = r0.u(r3)
            return r7
        L39:
            b5.g r8 = new b5.g
            r8.<init>(r7)
            throw r8
        L3f:
            return r7
        L40:
            b5.g r8 = new b5.g
            r8.<init>(r7)
            throw r8
    }

    public t5.d f(int r6, f5.f r7) {
            r5 = this;
            java.lang.Object r0 = r5.f479e
            f6.e r0 = (f6.e) r0
            java.lang.Object r1 = r5.f485k     // Catch: c6.b -> L3c
            androidx.lifecycle.x r1 = (androidx.lifecycle.x) r1     // Catch: c6.b -> L3c
            r2 = 1
            int r1 = r1.x(r6, r2)     // Catch: c6.b -> L3c
            java.lang.Object r3 = r0.get(r1)
            t5.d r3 = (t5.d) r3
            f5.f r4 = r3.i()
            if (r4 == r7) goto L3b
            f5.f r3 = r3.i()
            f5.f r4 = f5.f.f3280n
            if (r3 != r4) goto L35
            int r1 = r1 + r2
            int r2 = r0.size()
            if (r1 >= r2) goto L35
            java.lang.Object r0 = r0.get(r1)
            t5.d r0 = (t5.d) r0
            f5.f r1 = r0.i()
            if (r1 != r7) goto L35
            return r0
        L35:
            b5.g r7 = new b5.g
            r7.<init>(r6)
            throw r7
        L3b:
            return r3
        L3c:
            b5.g r7 = new b5.g
            r7.<init>(r6)
            throw r7
    }

    public void g(i0.k0 r3) {
            r2 = this;
            java.lang.Object r0 = r2.f478d
            j0.b r0 = (j0.b) r0
            java.lang.Object r1 = r2.f479e
            f.l0 r1 = (f.l0) r1
            boolean r1 = r1.c(r3)
            if (r1 == 0) goto L36
            java.lang.Object r1 = r2.f479e
            f.l0 r1 = (f.l0) r1
            r1.l(r3)
            java.util.RandomAccess r1 = r2.f480f
            j0.b r1 = (j0.b) r1
            boolean r1 = r1.j(r3)
            if (r1 != 0) goto L29
            boolean r1 = r0.j(r3)
            if (r1 == 0) goto L26
            goto L29
        L26:
            h(r3, r0)
        L29:
            java.lang.Object r0 = r2.f476b
            java.util.Set r0 = (java.util.Set) r0
            if (r0 != 0) goto L30
            goto L43
        L30:
            i0.a2 r3 = r3.f5944a
            r0.add(r3)
            return
        L36:
            java.lang.Object r0 = r2.f485k
            f.l0 r0 = (f.l0) r0
            if (r0 == 0) goto L44
            boolean r0 = r0.c(r3)
            if (r0 != 0) goto L43
            goto L44
        L43:
            return
        L44:
            java.lang.Object r0 = r2.f481g
            j0.b r0 = (j0.b) r0
            r0.b(r3)
            return
    }

    public void i(java.util.Set r1, x0.d r2) {
            r0 = this;
            r0.a()
            r0.f476b = r1
            r0.f477c = r2
            return
    }

    public void m(e5.a r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Object r2 = r0.f482h
            b5.h r2 = (b5.h) r2
            java.lang.Object r3 = r0.f478d
            ac.k r3 = (ac.k) r3
            java.lang.Object r4 = r0.f476b
            b5.c r4 = (b5.c) r4
            f5.a r5 = f5.a.f3258l
            java.lang.Object r6 = r0.f477c
            k5.z r6 = (k5.z) r6
            int r7 = r6.f7304l
            boolean r5 = r5.a(r7)
            r5 = r5 ^ 1
            java.lang.String r7 = ".method "
            r1.write(r7)
            int r7 = r6.f7304l
            int r8 = r6.f7308p
            r9 = 7
            if (r8 != r9) goto L2d
            java.util.Set r8 = java.util.Collections.EMPTY_SET
            goto L35
        L2d:
            java.util.Set r8 = f5.c.a(r8)
            java.util.EnumSet r8 = java.util.EnumSet.copyOf(r8)
        L35:
            j(r1, r7, r8)
            java.lang.String r7 = r6.getName()
            r1.s(r7)
            java.lang.String r7 = "("
            r1.write(r7)
            java.util.RandomAccess r7 = r0.f480f
            f6.e r7 = (f6.e) r7
            r8 = 0
            f6.c r9 = r7.i(r8)
        L4d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L72
            java.lang.Object r10 = r9.next()
            o5.p r10 = (o5.p) r10
            java.lang.String r10 = r10.f9535l
            r1.t(r10)
            int r11 = r5 + 1
            char r10 = r10.charAt(r8)
            r12 = 74
            if (r10 == r12) goto L6f
            r12 = 68
            if (r10 != r12) goto L6d
            goto L6f
        L6d:
            r5 = r11
            goto L4d
        L6f:
            int r5 = r5 + 2
            goto L4d
        L72:
            java.lang.String r9 = ")"
            r1.write(r9)
            java.lang.String r9 = r6.h1()
            r1.t(r9)
            r9 = 10
            r1.write(r9)
            r1.w()
            java.lang.Object r10 = r4.f469a
            java.lang.Object r10 = r4.f469a
            r12 = r10
            a5.a r12 = (a5.a) r12
            java.lang.String r10 = ".registers "
            r1.write(r10)
            int r10 = r3.t()
            r1.z(r10)
            r1.write(r9)
            l(r4, r1, r6, r7)
            java.lang.Object r7 = r0.f481g
            b5.k r7 = (b5.k) r7
            if (r7 != 0) goto Lb0
            b5.k r7 = new b5.k
            int r10 = r3.t()
            r7.<init>(r12, r10, r5)
            r0.f481g = r7
        Lb0:
            k5.u r5 = r6.f7302j
            int r6 = r6.f7307o
            java.util.Set r5 = o5.e.a(r5, r6)
            java.util.Set r5 = (java.util.Set) r5
            ac.p.Q(r1, r5)
            r1.write(r9)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = r0.f475a
            r7 = r8
            r10 = r7
        Lc9:
            int r11 = r6.size()
            if (r7 >= r11) goto L197
            java.lang.Object r11 = r6.get(r7)
            t5.d r11 = (t5.d) r11
            boolean r14 = r11 instanceof t5.f
            if (r14 == 0) goto L134
            d5.f r14 = new d5.f
            java.lang.Object r15 = r4.f469a
            a5.a r15 = (a5.a) r15
            r13 = r11
            t5.f r13 = (t5.f) r13
            r14.<init>(r0, r10, r13)
            b5.f r9 = new b5.f
            int r17 = r13.l()
            int r8 = r17 + r10
            f5.f r13 = r13.i()
            r17 = r4
            int r4 = r13.f3295m
            int r4 = t3.c.b(r4)
            r18 = r6
            if (r4 == 0) goto L126
            r6 = 6
            if (r4 == r6) goto L126
            r6 = 11
            if (r4 == r6) goto L123
            r6 = 16
            if (r4 == r6) goto L123
            r6 = 19
            if (r4 == r6) goto L126
            r6 = 22
            if (r4 == r6) goto L112
            r13 = 0
            goto L128
        L112:
            f5.f r4 = f5.f.f3281o
            if (r13 != r4) goto L119
            java.lang.String r13 = "array_"
            goto L128
        L119:
            f5.f r4 = f5.f.f3282p
            if (r13 != r4) goto L120
            java.lang.String r13 = "pswitch_data_"
            goto L128
        L120:
            java.lang.String r13 = "sswitch_data_"
            goto L128
        L123:
            java.lang.String r13 = "cond_"
            goto L128
        L126:
            java.lang.String r13 = "goto_"
        L128:
            r9.<init>(r15, r8, r13)
            r14.f1991j = r9
            b5.f r4 = r2.b(r9)
            r14.f1991j = r4
            goto L174
        L134:
            r17 = r4
            r18 = r6
            boolean r4 = r11 instanceof g5.a
            if (r4 == 0) goto L146
            d5.a r14 = new d5.a
            r4 = r11
            g5.a r4 = (g5.a) r4
            r6 = 1
            r14.<init>(r0, r10, r4, r6)
            goto L174
        L146:
            f5.f r4 = r11.i()
            int r4 = r4.f3295m
            int r4 = t3.c.b(r4)
            switch(r4) {
                case 33: goto L16b;
                case 34: goto L162;
                case 35: goto L159;
                default: goto L153;
            }
        L153:
            d5.e r14 = new d5.e
            r14.<init>(r0, r10, r11)
            goto L174
        L159:
            d5.n r14 = new d5.n
            r4 = r11
            l5.e0 r4 = (l5.e0) r4
            r14.<init>(r0, r10, r4)
            goto L174
        L162:
            d5.j r14 = new d5.j
            r4 = r11
            l5.c0 r4 = (l5.c0) r4
            r14.<init>(r0, r10, r4)
            goto L174
        L16b:
            d5.a r14 = new d5.a
            r4 = r11
            l5.b r4 = (l5.b) r4
            r6 = 0
            r14.<init>(r0, r10, r4, r6)
        L174:
            r5.add(r14)
            int r4 = r18.size()
            int r4 = r4 + (-1)
            if (r7 == r4) goto L187
            b5.a r4 = new b5.a
            r4.<init>(r10)
            r5.add(r4)
        L187:
            int r4 = r11.c()
            int r10 = r10 + r4
            int r7 = r7 + 1
            r4 = r17
            r6 = r18
            r8 = 0
            r9 = 10
            goto Lc9
        L197:
            java.lang.Object r4 = r0.f479e
            f6.e r4 = (f6.e) r4
            java.lang.Object r6 = r0.f485k
            androidx.lifecycle.x r6 = (androidx.lifecycle.x) r6
            java.lang.Object r7 = r3.f178i
            k5.u r7 = (k5.u) r7
            androidx.lifecycle.x r8 = r7.f7264b
            int r9 = r3.f177h
            int r10 = r9 + 6
            int r8 = r8.P(r10)
            if (r8 <= 0) goto L1ca
            androidx.lifecycle.x r7 = r7.f7264b
            int r10 = r9 + 12
            int r7 = r7.N(r10)
            int r9 = r9 + 16
            r10 = 2
            r11 = 3
            int r7 = p.a.g(r7, r10, r9, r11)
            r7 = r7 & (-4)
            int r9 = r8 * 8
            int r9 = r9 + r7
            k5.c0 r10 = new k5.c0
            r10.<init>(r3, r7, r9, r8)
            goto L1cc
        L1ca:
            java.util.List r10 = java.util.Collections.EMPTY_LIST
        L1cc:
            int r7 = r10.size()
            if (r7 != 0) goto L1d5
        L1d2:
            r9 = 0
            goto L293
        L1d5:
            int r7 = r4.size()
            int r7 = r7 + (-1)
            int r7 = r6.u(r7)
            int r8 = r4.size()
            int r8 = r8 + (-1)
            java.lang.Object r4 = r4.get(r8)
            t5.d r4 = (t5.d) r4
            int r4 = r4.c()
            int r4 = r4 + r7
            java.util.Iterator r7 = r10.iterator()
        L1f4:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L1d2
            java.lang.Object r8 = r7.next()
            k5.f0 r8 = (k5.f0) r8
            int r9 = r8.c()
            int r10 = r8.a()
            int r10 = r10 + r9
            if (r9 >= r4) goto L27d
            if (r10 > r4) goto L267
            int r11 = r10 + (-1)
            r13 = 0
            int r11 = r6.x(r11, r13)
            int r14 = r6.u(r11)
            java.util.List r8 = r8.b()
            java.util.Iterator r8 = r8.iterator()
        L220:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L1f4
            java.lang.Object r11 = r8.next()
            k5.v r11 = (k5.v) r11
            int r15 = r11.b()
            if (r15 >= r4) goto L254
            r17 = r11
            b5.b r11 = new b5.b
            java.lang.Object r13 = r0.f482h
            b5.h r13 = (b5.h) r13
            java.lang.String r17 = r17.a()
            r16 = r9
            r18 = r15
            r15 = r17
            r9 = 0
            r19 = 0
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r5.add(r11)
            r9 = r16
            r13 = r19
            goto L220
        L254:
            r18 = r15
            r9 = 0
            d6.f r1 = new d6.f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "Exception handler offset %d is past the end of the code block."
            r1.<init>(r9, r3, r2)
            throw r1
        L267:
            r17 = r10
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "Try end offset %d is past the end of the code block."
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2)
            throw r1
        L27d:
            r16 = r9
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "Try start offset %d is past the end of the code block."
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2)
            throw r1
        L293:
            o5.j r3 = r3.n()
            java.util.Iterator r3 = r3.iterator()
        L29b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L307
            java.lang.Object r4 = r3.next()
            x5.a r4 = (x5.a) r4
            java.lang.Object r6 = r0.f481g
            b5.k r6 = (b5.k) r6
            int r7 = r4.f21181g
            int r8 = r4.a()
            r10 = -4
            switch(r8) {
                case 3: goto L2fa;
                case 4: goto L2b5;
                case 5: goto L2f1;
                case 6: goto L2e7;
                case 7: goto L2e0;
                case 8: goto L2d9;
                case 9: goto L2d1;
                case 10: goto L2c9;
                default: goto L2b5;
            }
        L2b5:
            d6.f r1 = new d6.f
            int r2 = r4.a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "Invalid debug item type: %d"
            r1.<init>(r9, r3, r2)
            throw r1
        L2c9:
            c5.d r6 = new c5.d
            x5.d r4 = (x5.d) r4
            r6.<init>(r7, r4)
            goto L303
        L2d1:
            c5.e r6 = new c5.e
            x5.f r4 = (x5.f) r4
            r6.<init>(r7, r4)
            goto L303
        L2d9:
            c5.a r6 = new c5.a
            r4 = 0
            r6.<init>(r7, r10, r4)
            goto L303
        L2e0:
            c5.a r6 = new c5.a
            r4 = 1
            r6.<init>(r7, r10, r4)
            goto L303
        L2e7:
            c5.c r8 = new c5.c
            x5.e r4 = (x5.e) r4
            r10 = 1
            r8.<init>(r7, r6, r4, r10)
        L2ef:
            r6 = r8
            goto L303
        L2f1:
            c5.c r8 = new c5.c
            x5.b r4 = (x5.b) r4
            r10 = 0
            r8.<init>(r7, r6, r4, r10)
            goto L2ef
        L2fa:
            c5.c r8 = new c5.c
            x5.g r4 = (x5.g) r4
            r10 = 2
            r8.<init>(r7, r6, r4, r10)
            goto L2ef
        L303:
            r5.add(r6)
            goto L29b
        L307:
            java.util.HashMap r2 = r2.f474a
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L311:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L321
            java.lang.Object r3 = r2.next()
            b5.f r3 = (b5.f) r3
            r5.add(r3)
            goto L311
        L321:
            java.util.Collections.sort(r5)
            java.util.Iterator r2 = r5.iterator()
        L328:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L343
            java.lang.Object r3 = r2.next()
            b5.j r3 = (b5.j) r3
            boolean r3 = r3.c(r1)
            if (r3 == 0) goto L340
            r3 = 10
            r1.write(r3)
            goto L328
        L340:
            r3 = 10
            goto L328
        L343:
            r1.u()
            java.lang.String r2 = ".end method\n"
            r1.write(r2)
            return
    }
}
