package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends r4.o0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r4.m f11432j = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f11433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f11434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11436i;

    static {
            r4.m r0 = new r4.m
            r1 = 2
            r0.<init>(r1)
            r4.k0.f11432j = r0
            return
    }

    public k0(java.lang.String r1, r4.p r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 100
            r1.<init>(r2)
            r0.f11433f = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r2)
            r0.f11434g = r1
            r0.f11435h = r4
            r1 = -1
            r0.f11436i = r1
            return
    }

    @Override // r4.o0
    public final int a(r4.a0 r1) {
            r0 = this;
            r4.l0 r1 = (r4.l0) r1
            int r1 = r1.f()
            return r1
    }

    @Override // r4.o0
    public final java.util.Collection c() {
            r1 = this;
            java.util.ArrayList r0 = r1.f11433f
            return r0
    }

    @Override // r4.o0
    public final void e() {
            r5 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r5.f11433f
            int r2 = r1.size()
            if (r0 < r2) goto La
            return
        La:
            if (r0 >= r2) goto L1
            java.lang.Object r3 = r1.get(r0)
            r4.l0 r3 = (r4.l0) r3
            r4.p r4 = r5.f11472b
            r3.a(r4)
            int r0 = r0 + 1
            goto La
    }

    @Override // r4.o0
    public final int h() {
            r1 = this;
            r1.f()
            int r0 = r1.f11436i
            return r0
    }

    @Override // r4.o0
    public final void j(z4.d r10) {
            r9 = this;
            boolean r0 = r10.d()
            java.util.ArrayList r1 = r9.f11433f
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = 0
            r5 = r2
            r4 = r3
        Le:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L3f
            java.lang.Object r6 = r1.next()
            r4.l0 r6 = (r4.l0) r6
            if (r0 == 0) goto L25
            if (r5 == 0) goto L20
            r5 = r3
            goto L25
        L20:
            java.lang.String r7 = "\n"
            r10.b(r3, r7)
        L25:
            int r7 = r6.f11443g
            int r7 = r7 - r2
            int r8 = r4 + r7
            int r7 = ~r7
            r7 = r7 & r8
            if (r4 == r7) goto L34
            int r4 = r7 - r4
            r10.o(r4)
            r4 = r7
        L34:
            r4.p r7 = r9.f11472b
            r6.d(r7, r10)
            int r6 = r6.c()
            int r4 = r4 + r6
            goto Le
        L3f:
            int r10 = r9.f11436i
            if (r4 != r10) goto L44
            return
        L44:
            java.lang.String r10 = "output size mismatch"
            bsh.j.g(r10)
            return
    }

    public final void k(r4.l0 r3) {
            r2 = this;
            r2.g()
            int r0 = r3.f11443g     // Catch: java.lang.NullPointerException -> L17
            int r1 = r2.f11473c     // Catch: java.lang.NullPointerException -> L17
            if (r0 > r1) goto Lf
            java.util.ArrayList r0 = r2.f11433f
            r0.add(r3)
            return
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.NullPointerException -> L17
            java.lang.String r0 = "incompatible item alignment"
            r3.<init>(r0)     // Catch: java.lang.NullPointerException -> L17
            throw r3     // Catch: java.lang.NullPointerException -> L17
        L17:
            java.lang.String r3 = "item == null"
            bsh.j.c(r3)
            return
    }

    public final synchronized r4.l0 l(r4.l0 r2) {
            r1 = this;
            monitor-enter(r1)
            r1.g()     // Catch: java.lang.Throwable -> L1a
            java.util.HashMap r0 = r1.f11434g     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L1a
            r4.l0 r0 = (r4.l0) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L10
            monitor-exit(r1)
            return r0
        L10:
            r1.k(r2)     // Catch: java.lang.Throwable -> L1a
            java.util.HashMap r0 = r1.f11434g     // Catch: java.lang.Throwable -> L1a
            r0.put(r2, r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            return r2
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    public final void m() {
            r6 = this;
            r6.f()
            int r0 = r6.f11435h
            int r0 = t3.c.b(r0)
            r1 = 1
            java.util.ArrayList r2 = r6.f11433f
            if (r0 == r1) goto L16
            r1 = 2
            if (r0 == r1) goto L12
            goto L1b
        L12:
            java.util.Collections.sort(r2)
            goto L1b
        L16:
            r4.m r0 = r4.k0.f11432j
            java.util.Collections.sort(r2, r0)
        L1b:
            int r0 = r2.size()
            r1 = 0
            r3 = r1
        L21:
            if (r1 >= r0) goto L63
            java.lang.Object r4 = r2.get(r1)
            r4.l0 r4 = (r4.l0) r4
            int r5 = r4.i(r6, r3)     // Catch: java.lang.RuntimeException -> L37
            if (r5 < r3) goto L39
            int r3 = r4.c()     // Catch: java.lang.RuntimeException -> L37
            int r3 = r3 + r5
            int r1 = r1 + 1
            goto L21
        L37:
            r0 = move-exception
            goto L50
        L39:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.RuntimeException -> L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L37
            r1.<init>()     // Catch: java.lang.RuntimeException -> L37
            java.lang.String r2 = "bogus place() result for "
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L37
            r1.append(r4)     // Catch: java.lang.RuntimeException -> L37
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L37
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L37
            throw r0     // Catch: java.lang.RuntimeException -> L37
        L50:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "...while placing "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            f4.a r0 = f4.a.b(r1, r0)
            throw r0
        L63:
            r6.f11436i = r3
            return
    }
}
