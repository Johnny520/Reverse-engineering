package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements v1.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.x f13945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.j0 f13946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f13947c;

    public h0(v1.j0 r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f13946b = r1
            r0.f13947c = r2
            int[] r1 = f.m.f2860a
            f.x r1 = new f.x
            r1.<init>()
            r0.f13945a = r1
            return
    }

    @Override // v1.h1
    public final void a() {
            r2 = this;
            v1.j0 r0 = r2.f13946b
            java.lang.Object r1 = r2.f13947c
            v1.j0.c(r0, r1)
            return
    }

    @Override // v1.h1
    public final int b() {
            r2 = this;
            v1.j0 r0 = r2.f13946b
            f.k0 r0 = r0.f13964p
            java.lang.Object r1 = r2.f13947c
            java.lang.Object r0 = r0.g(r1)
            x1.f0 r0 = (x1.f0) r0
            if (r0 == 0) goto L1b
            java.util.List r0 = r0.n()
            f.d0 r0 = (f.d0) r0
            java.lang.Object r0 = r0.f2789h
            j0.b r0 = (j0.b) r0
            int r0 = r0.f6673i
            return r0
        L1b:
            r0 = 0
            return r0
    }

    @Override // v1.h1
    public final void c(int r6, long r7) {
            r5 = this;
            v1.j0 r0 = r5.f13946b
            f.k0 r1 = r0.f13964p
            java.lang.Object r2 = r5.f13947c
            java.lang.Object r1 = r1.g(r2)
            x1.f0 r1 = (x1.f0) r1
            if (r1 == 0) goto L6f
            boolean r2 = r1.G()
            if (r2 == 0) goto L6f
            java.util.List r2 = r1.n()
            f.d0 r2 = (f.d0) r2
            java.lang.Object r2 = r2.f2789h
            j0.b r2 = (j0.b) r2
            int r2 = r2.f6673i
            if (r6 < 0) goto L24
            if (r6 < r2) goto L42
        L24:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Index ("
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r4 = ") is out of bound of [0, "
            r3.append(r4)
            r3.append(r2)
            r2 = 41
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            u1.a.d(r2)
        L42:
            boolean r2 = r1.H()
            if (r2 == 0) goto L4d
            java.lang.String r2 = "Pre-measure called on node that is not placed"
            u1.a.a(r2)
        L4d:
            x1.f0 r0 = r0.f13955g
            r2 = 1
            r0.f20905w = r2
            x1.r1 r2 = x1.i0.a(r1)
            java.util.List r1 = r1.n()
            f.d0 r1 = (f.d0) r1
            java.lang.Object r1 = r1.get(r6)
            x1.f0 r1 = (x1.f0) r1
            y1.t r2 = (y1.t) r2
            r2.y(r1, r7)
            r7 = 0
            r0.f20905w = r7
            f.x r7 = r5.f13945a
            r7.a(r6)
        L6f:
            return
    }

    @Override // v1.h1
    public final void d(d9.g r3) {
            r2 = this;
            v1.j0 r0 = r2.f13946b
            f.k0 r0 = r0.f13964p
            java.lang.Object r1 = r2.f13947c
            java.lang.Object r0 = r0.g(r1)
            x1.f0 r0 = (x1.f0) r0
            if (r0 == 0) goto L15
            x1.b1 r0 = r0.L
            if (r0 == 0) goto L15
            y0.n r0 = r0.f20844f
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L21
            boolean r1 = r0.f21832t
            if (r1 == 0) goto L21
            java.lang.String r1 = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"
            x1.k.C(r0, r1, r3)
        L21:
            return
    }
}
