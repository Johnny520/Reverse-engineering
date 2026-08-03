package fh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends x6.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public gh.c f3935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fh.a f3936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fh.j f3937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fh.l f3938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.ArrayList f3939k;

    public static void r0(fh.a r4, java.util.Collection r5) {
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            gh.c r2 = new gh.c
            r3 = 1
            r2.<init>(r1, r3)
            r0.add(r2)
            goto L12
        L28:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            r4.f3939k = r5
            return
    }

    @Override // x6.d
    public final int G(g6.b r9) {
            r8 = this;
            gh.c r0 = r8.f3935g
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.G(r9)
            goto Lb
        La:
            r0 = r1
        Lb:
            fh.a r2 = r8.f3936h
            if (r2 == 0) goto L14
            int r2 = r2.G(r9)
            goto L15
        L14:
            r2 = r1
        L15:
            fh.j r3 = r8.f3937i
            if (r3 == 0) goto L1e
            int r3 = r3.G(r9)
            goto L1f
        L1e:
            r3 = r1
        L1f:
            fh.l r4 = r8.f3938j
            if (r4 == 0) goto L28
            int r4 = r4.G(r9)
            goto L29
        L28:
            r4 = r1
        L29:
            java.util.ArrayList r5 = r8.f3939k
            if (r5 == 0) goto L5b
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = tf.n.e1(r5)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L3a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L52
            java.lang.Object r7 = r5.next()
            gh.c r7 = (gh.c) r7
            int r7 = r7.G(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto L3a
        L52:
            int[] r5 = tf.m.O1(r6)
            int r5 = r9.f(r5)
            goto L5c
        L5b:
            r5 = r1
        L5c:
            r6 = 9
            r9.n(r6)
            r6 = 8
            r9.c(r6, r5)
            r5 = 7
            r9.c(r5, r4)
            r4 = 6
            r9.c(r4, r3)
            r3 = 5
            r9.c(r3, r1)
            r3 = 4
            r9.c(r3, r1)
            r3 = 3
            r9.c(r3, r2)
            r2 = 2
            r9.c(r2, r1)
            r2 = 1
            r9.c(r2, r0)
            r9.c(r1, r1)
            int r0 = r9.g()
            r9.i(r0)
            return r0
    }

    public final void k0(java.lang.Class r5) {
            r4 = this;
            r5.getClass()
            fh.j r0 = r4.f3937i
            if (r0 != 0) goto Ld
            fh.j r0 = new fh.j
            r1 = 0
            r0.<init>(r1)
        Ld:
            r4.f3937i = r0
            fh.i r1 = new fh.i
            r1.<init>()
            fh.a r2 = new fh.a
            r2.<init>()
            java.lang.String r5 = kh.b.d(r5)
            r3 = 5
            r2.m0(r3, r5)
            r1.f3946g = r2
            java.util.List r5 = r0.f3948h
            if (r5 != 0) goto L2c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L2c:
            r0.f3948h = r5
            r5.add(r1)
            return
    }

    public final void l0(fh.k r2) {
            r1 = this;
            fh.l r0 = r1.f3938j
            if (r0 != 0) goto L9
            fh.l r0 = new fh.l
            r0.<init>()
        L9:
            r1.f3938j = r0
            r0.k0(r2)
            return
    }

    public final void m0(int r2, java.lang.String r3) {
            r1 = this;
            r3.getClass()
            if (r2 == 0) goto Ld
            gh.c r0 = new gh.c
            r0.<init>(r3, r2)
            r1.f3935g = r0
            return
        Ld:
            r2 = 0
            throw r2
    }

    public final void n0(int r3) {
            r2 = this;
            fh.j r0 = r2.f3937i
            if (r0 != 0) goto La
            fh.j r0 = new fh.j
            r1 = 0
            r0.<init>(r1)
        La:
            r2.f3937i = r0
            gh.a r1 = new gh.a
            r1.<init>(r3)
            r0.f3949i = r1
            return
    }

    public final void o0(java.lang.String r4) {
            r3 = this;
            fh.a r0 = new fh.a
            r0.<init>()
            gh.c r1 = new gh.c
            r2 = 5
            r1.<init>(r4, r2)
            r0.f3935g = r1
            r3.f3936h = r0
            return
    }

    public final void p0(java.lang.String... r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L18
            r3 = r7[r2]
            gh.c r4 = new gh.c
            r5 = 5
            r4.<init>(r3, r5)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L18:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            r6.f3939k = r7
            return
    }

    public final void q0(java.lang.String... r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L18
            r3 = r7[r2]
            gh.c r4 = new gh.c
            r5 = 1
            r4.<init>(r3, r5)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L18:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            r6.f3939k = r7
            return
    }
}
