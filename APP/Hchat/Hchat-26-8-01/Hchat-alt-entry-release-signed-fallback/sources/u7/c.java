package u7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends l7.a implements java.lang.Iterable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Object f13530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s7.g f13531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s7.h f13532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f1.h f13533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13534s;

    public c(boolean r7, boolean r8, okio.a r9) {
            r6 = this;
            p7.i r0 = new p7.i
            r0.<init>()
            r1 = 6
            r6.<init>(r0, r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r6.f13530o = r1
            r1 = 0
            r0.f10296y = r1
            r0.T(r7)
            o7.c r7 = new o7.c
            r7.f r1 = r0.f10289r
            r7.<init>(r1)
            o7.c r1 = new o7.c
            r7.f r2 = r0.f10290s
            r1.<init>(r2)
            r7.a r2 = new r7.a
            r3 = 1
            r4 = 0
            r2.<init>(r4, r3)
            s7.g r3 = new s7.g
            r3.<init>(r2, r0, r7, r9)
            r6.f13531p = r3
            s7.h r9 = new s7.h
            r7.f r4 = r0.f10295x
            okio.a r5 = r7.u.f11586q
            r9.<init>(r4, r1, r5)
            r6.f13532q = r9
            s7.i r4 = new s7.i
            r7.f r0 = r0.f10290s
            r4.<init>(r0)
            r6.P(r7)
            r6.P(r1)
            r6.P(r3)
            r6.P(r2)
            r6.P(r9)
            r6.P(r4)
            r6.f13534s = r8
            f1.h r7 = new f1.h
            r7.<init>()
            r6.f13533r = r7
            b8.c r8 = new b8.c
            r9 = 11
            r8.<init>(r9)
            java.lang.Object r9 = r7.f3058i
            monitor-enter(r9)
            r7.f3060k = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6d
            return
        L6d:
            r7 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6d
            throw r7
    }

    @Override // k7.c
    public void M() {
            r0 = this;
            r0.U()
            return
    }

    @Override // l7.a
    public void R() {
            r0 = this;
            r0.X()
            r0.a0()
            return
    }

    @Override // l7.a
    public final void S() {
            r0 = this;
            return
    }

    public final void U() {
            r2 = this;
            java.lang.Object r0 = r2.f13530o
            monitor-enter(r0)
            boolean r1 = r2.f13534s     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            goto L16
        Lb:
            r1 = 0
            r2.f13534s = r1     // Catch: java.lang.Throwable -> L9
            r2.W()     // Catch: java.lang.Throwable -> L9
            r2.a0()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public final r7.s V(int r2) {
            r1 = this;
            s7.g r0 = r1.f13531p
            k7.a r2 = r0.Q(r2)
            r7.s r2 = (r7.s) r2
            return r2
    }

    public void W() {
            r1 = this;
            s7.h r0 = r1.f13532q
            r0.m0()
            return
    }

    public final void X() {
            r7 = this;
            s7.g r0 = r7.f13531p
            z7.c r1 = r0.f9563k
            int r1 = r1.size()
            s7.h r2 = r7.f13532q
            z7.c r3 = r2.f9563k
            int r3 = r3.size()
            if (r1 >= r3) goto L13
            goto L14
        L13:
            r1 = r3
        L14:
            r3 = 0
        L15:
            if (r3 >= r1) goto L43
            k7.a r4 = r2.Q(r3)
            r7.u r4 = (r7.u) r4
            k7.a r5 = r0.Q(r3)
            r7.s r5 = (r7.s) r5
            if (r4 == 0) goto L3a
            r7.u r6 = r5.f11583q
            if (r6 != r4) goto L2a
            goto L31
        L2a:
            if (r6 != 0) goto L34
            r5.f11583q = r4
            r4.S(r5)
        L31:
            int r3 = r3 + 1
            goto L15
        L34:
            java.lang.String r0 = "Style item is already linked"
            j8.o.A(r0)
            return
        L3a:
            r5.getClass()
            java.lang.String r0 = "Can not link null style item"
            bsh.j.c(r0)
            return
        L43:
            r2.m0()
            return
    }

    public void Y(int r1, r7.s r2) {
            r0 = this;
            return
    }

    public void Z() {
            r1 = this;
            s7.h r0 = r1.f13532q
            r0.n0()
            return
    }

    public final void a0() {
            r9 = this;
            f1.h r0 = r9.f13533r
            java.lang.Object r1 = r0.f3058i
            monitor-enter(r1)
            java.lang.Object r0 = r0.f3059j     // Catch: java.lang.Throwable -> Le
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            r0 = 0
            goto L16
        Le:
            r0 = move-exception
            goto Lc5
        L11:
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
        L16:
            if (r0 != 0) goto Lc4
            f1.h r0 = r9.f13533r
            java.lang.Object r1 = r0.f3058i
            monitor-enter(r1)
            java.lang.Object r2 = r0.f3059j     // Catch: java.lang.Throwable -> L2f
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r2 == 0) goto L37
            int r4 = r0.f3057h     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L32
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L2f
            r0.f3057h = r4     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r0 = move-exception
            goto Lc2
        L32:
            r0.f3059j = r3     // Catch: java.lang.Throwable -> L2f
            r2.clear()     // Catch: java.lang.Throwable -> L2f
        L37:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            f1.h r0 = r9.f13533r
            int r1 = r9.size()
            java.lang.Object r2 = r0.f3058i
            monitor-enter(r2)
            r0.f3057h = r1     // Catch: java.lang.Throwable -> L52
            java.lang.Object r1 = r0.f3059j     // Catch: java.lang.Throwable -> L52
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L55
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L55
            r0.f3059j = r3     // Catch: java.lang.Throwable -> L52
            goto L55
        L52:
            r0 = move-exception
            goto Lc0
        L55:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            f1.h r0 = r9.f13533r
            java.util.Iterator r1 = r9.iterator()
            java.lang.Object r3 = r0.f3058i
            monitor-enter(r3)
        L5f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lba
            r4 = r2
            r7.s r4 = (r7.s) r4     // Catch: java.lang.Throwable -> Lba
            java.lang.String r4 = r4.Y()     // Catch: java.lang.Throwable -> Lba
            if (r4 == 0) goto L5f
            if (r2 != 0) goto L75
            goto L5f
        L75:
            java.lang.Object r5 = r0.f3059j     // Catch: java.lang.Throwable -> Lba
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.Throwable -> Lba
            if (r5 != 0) goto L8d
            int r5 = r0.f3057h     // Catch: java.lang.Throwable -> Lba
            if (r5 != 0) goto L85
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lba
            r5.<init>()     // Catch: java.lang.Throwable -> Lba
            goto L8b
        L85:
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lba
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lba
            r5 = r6
        L8b:
            r0.f3059j = r5     // Catch: java.lang.Throwable -> Lba
        L8d:
            java.lang.Object r6 = r5.get(r4)     // Catch: java.lang.Throwable -> Lba
            if (r6 != 0) goto L97
            r5.put(r4, r2)     // Catch: java.lang.Throwable -> Lba
            goto L5f
        L97:
            java.lang.Class r7 = r6.getClass()     // Catch: java.lang.Throwable -> Lba
            java.lang.Class<z7.o> r8 = z7.o.class
            if (r7 != r8) goto Lae
            z7.o r6 = (z7.o) r6     // Catch: java.lang.Throwable -> Lba
            boolean r4 = r6.c(r2)     // Catch: java.lang.Throwable -> Lba
            if (r4 != 0) goto L5f
            r6.add(r2)     // Catch: java.lang.Throwable -> Lba
            r0.E(r6)     // Catch: java.lang.Throwable -> Lba
            goto L5f
        Lae:
            java.lang.Object r6 = r5.remove(r4)     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r2 = r0.m(r6, r2)     // Catch: java.lang.Throwable -> Lba
            r5.put(r4, r2)     // Catch: java.lang.Throwable -> Lba
            goto L5f
        Lba:
            r0 = move-exception
            goto Lbe
        Lbc:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lba
            return
        Lbe:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lba
            throw r0
        Lc0:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            throw r0
        Lc2:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r0
        Lc4:
            return
        Lc5:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public final void b0(r7.m r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L10
        L3:
            int r0 = r2.get()
            r7.s r0 = r1.V(r0)
            if (r0 == 0) goto L10
            r0.a0(r2)
        L10:
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            s7.g r0 = r1.f13531p
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // k7.c, k7.a
    public final byte[] r() {
            r2 = this;
            x7.b r0 = new x7.b
            p7.a r1 = r2.f7869m
            p7.i r1 = (p7.i) r1
            r7.f r1 = r1.f10270o
            int r1 = r1.f11560n
            r0.<init>(r1)
            r2.K(r0)     // Catch: java.io.IOException -> L13
            r0.close()     // Catch: java.io.IOException -> L13
        L13:
            byte[] r0 = r0.toByteArray()
            return r0
    }

    public final int size() {
            r1 = this;
            s7.g r0 = r1.f13531p
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            return r0
    }
}
