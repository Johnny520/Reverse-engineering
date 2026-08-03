package c1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.r0 f1002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1005d;

    public p(f1.r0 r2, boolean r3, long r4, long r6) {
            r1 = this;
            float r0 = l.f.f7625a
            r1.<init>()
            r1.f1002a = r2
            r1.f1003b = r3
            r1.f1004c = r4
            r1.f1005d = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3c
        L3:
            boolean r0 = r5 instanceof c1.p
            if (r0 != 0) goto L8
            goto L3a
        L8:
            c1.p r5 = (c1.p) r5
            float r0 = l.f.f7628d
            boolean r0 = u2.f.b(r0, r0)
            if (r0 != 0) goto L13
            goto L3a
        L13:
            f1.r0 r0 = r4.f1002a
            f1.r0 r1 = r5.f1002a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1e
            goto L3a
        L1e:
            boolean r0 = r4.f1003b
            boolean r1 = r5.f1003b
            if (r0 == r1) goto L25
            goto L3a
        L25:
            long r0 = r4.f1004c
            long r2 = r5.f1004c
            boolean r0 = f1.w.c(r0, r2)
            if (r0 != 0) goto L30
            goto L3a
        L30:
            long r0 = r4.f1005d
            long r2 = r5.f1005d
            boolean r5 = f1.w.c(r0, r2)
            if (r5 != 0) goto L3c
        L3a:
            r5 = 0
            return r5
        L3c:
            r5 = 1
            return r5
    }

    @Override // x1.x0
    public final y0.n f() {
            r3 = this;
            f1.q r0 = new f1.q
            b1.f r1 = new b1.f
            r2 = 2
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            f1.q r3 = (f1.q) r3
            b1.f r0 = new b1.f
            r1 = 2
            r0.<init>(r2, r1)
            r3.f3107u = r0
            y0.n r1 = r3.f21819g
            boolean r1 = r1.f21832t
            if (r1 != 0) goto L11
            goto L1e
        L11:
            r1 = 2
            x1.i1 r3 = x1.k.t(r3, r1)
            x1.i1 r3 = r3.f20944v
            if (r3 == 0) goto L1e
            r1 = 1
            r3.Q1(r0, r1)
        L1e:
            return
    }

    public final int hashCode() {
            r4 = this;
            float r0 = l.f.f7628d
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            f1.r0 r2 = r4.f1002a
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.f1003b
            int r0 = eh.a.h(r2, r1, r0)
            int r2 = f1.w.f3132h
            long r2 = r4.f1004c
            int r0 = eh.a.f(r0, r1, r2)
            long r1 = r4.f1005d
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ShadowGraphicsLayerElement(elevation="
            r0.<init>(r1)
            float r1 = l.f.f7628d
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", shape="
            r0.append(r1)
            f1.r0 r1 = r3.f1002a
            r0.append(r1)
            java.lang.String r1 = ", clip="
            r0.append(r1)
            boolean r1 = r3.f1003b
            r0.append(r1)
            java.lang.String r1 = ", ambientColor="
            r0.append(r1)
            long r1 = r3.f1004c
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", spotColor="
            r0.append(r1)
            long r1 = r3.f1005d
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
