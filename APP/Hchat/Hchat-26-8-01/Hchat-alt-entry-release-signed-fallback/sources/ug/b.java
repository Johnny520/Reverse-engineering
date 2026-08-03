package ug;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ug.d[] f13802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ug.p f13805j;

    public final ug.d a() {
            r4 = this;
            monitor-enter(r4)
            ug.d[] r0 = r4.f13802g     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            ug.d[] r0 = r4.d()     // Catch: java.lang.Throwable -> Lc
            r4.f13802g = r0     // Catch: java.lang.Throwable -> Lc
            goto L21
        Lc:
            r0 = move-exception
            goto L4a
        Le:
            int r1 = r4.f13803h     // Catch: java.lang.Throwable -> Lc
            int r2 = r0.length     // Catch: java.lang.Throwable -> Lc
            if (r1 < r2) goto L21
            int r1 = r0.length     // Catch: java.lang.Throwable -> Lc
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> Lc
            r1 = r0
            ug.d[] r1 = (ug.d[]) r1     // Catch: java.lang.Throwable -> Lc
            r4.f13802g = r1     // Catch: java.lang.Throwable -> Lc
            ug.d[] r0 = (ug.d[]) r0     // Catch: java.lang.Throwable -> Lc
        L21:
            int r1 = r4.f13804i     // Catch: java.lang.Throwable -> Lc
        L23:
            r2 = r0[r1]     // Catch: java.lang.Throwable -> Lc
            if (r2 != 0) goto L2d
            ug.d r2 = r4.c()     // Catch: java.lang.Throwable -> Lc
            r0[r1] = r2     // Catch: java.lang.Throwable -> Lc
        L2d:
            int r1 = r1 + 1
            int r3 = r0.length     // Catch: java.lang.Throwable -> Lc
            if (r1 < r3) goto L33
            r1 = 0
        L33:
            boolean r3 = r2.a(r4)     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L23
            r4.f13804i = r1     // Catch: java.lang.Throwable -> Lc
            int r0 = r4.f13803h     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            int r0 = r0 + r1
            r4.f13803h = r0     // Catch: java.lang.Throwable -> Lc
            ug.p r0 = r4.f13805j     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r4)
            if (r0 == 0) goto L49
            r0.v(r1)
        L49:
            return r2
        L4a:
            monitor-exit(r4)
            throw r0
    }

    public abstract ug.d c();

    public abstract ug.d[] d();

    public final void f(ug.d r7) {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f13803h     // Catch: java.lang.Throwable -> Lf
            r1 = -1
            int r0 = r0 + r1
            r6.f13803h = r0     // Catch: java.lang.Throwable -> Lf
            ug.p r2 = r6.f13805j     // Catch: java.lang.Throwable -> Lf
            r3 = 0
            if (r0 != 0) goto L11
            r6.f13804i = r3     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r7 = move-exception
            goto L2e
        L11:
            r7.getClass()     // Catch: java.lang.Throwable -> Lf
            wf.c[] r7 = r7.b(r6)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r6)
            int r0 = r7.length
        L1a:
            if (r3 >= r0) goto L28
            r4 = r7[r3]
            if (r4 == 0) goto L25
            sf.n r5 = sf.n.f12433a
            r4.resumeWith(r5)
        L25:
            int r3 = r3 + 1
            goto L1a
        L28:
            if (r2 == 0) goto L2d
            r2.v(r1)
        L2d:
            return
        L2e:
            monitor-exit(r6)
            throw r7
    }

    public final ug.p g() {
            r5 = this;
            monitor-enter(r5)
            ug.p r0 = r5.f13805j     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1e
            ug.p r0 = new ug.p     // Catch: java.lang.Throwable -> L1c
            int r1 = r5.f13803h     // Catch: java.lang.Throwable -> L1c
            sg.a r2 = sg.a.f12437h     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r3, r4, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1c
            r0.p(r1)     // Catch: java.lang.Throwable -> L1c
            r5.f13805j = r0     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r0 = move-exception
            goto L20
        L1e:
            monitor-exit(r5)
            return r0
        L20:
            monitor-exit(r5)
            throw r0
    }
}
