package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class b0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.r0 f3031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f3034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f1.n f3035h;

    public b0(float r1, float r2, long r3, f1.r0 r5, boolean r6, long r7, long r9, f1.n r11) {
            r0 = this;
            r0.<init>()
            r0.f3028a = r1
            r0.f3029b = r2
            r0.f3030c = r3
            r0.f3031d = r5
            r0.f3032e = r6
            r0.f3033f = r7
            r0.f3034g = r9
            r0.f3035h = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto La3
        L4:
            boolean r0 = r5 instanceof f1.b0
            if (r0 != 0) goto La
            goto La1
        La:
            f1.b0 r5 = (f1.b0) r5
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = java.lang.Float.compare(r0, r0)
            if (r1 == 0) goto L16
            goto La1
        L16:
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L1e
            goto La1
        L1e:
            float r0 = r4.f3028a
            float r1 = r5.f3028a
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L2a
            goto La1
        L2a:
            r0 = 0
            int r1 = java.lang.Float.compare(r0, r0)
            if (r1 == 0) goto L33
            goto La1
        L33:
            int r1 = java.lang.Float.compare(r0, r0)
            if (r1 == 0) goto L3b
            goto La1
        L3b:
            float r1 = r4.f3029b
            float r2 = r5.f3029b
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 == 0) goto L46
            goto La1
        L46:
            int r1 = java.lang.Float.compare(r0, r0)
            if (r1 == 0) goto L4d
            goto La1
        L4d:
            int r1 = java.lang.Float.compare(r0, r0)
            if (r1 == 0) goto L54
            goto La1
        L54:
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L5b
            goto La1
        L5b:
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L64
            goto La1
        L64:
            long r0 = r4.f3030c
            long r2 = r5.f3030c
            boolean r0 = f1.u0.a(r0, r2)
            if (r0 != 0) goto L6f
            goto La1
        L6f:
            f1.r0 r0 = r4.f3031d
            f1.r0 r1 = r5.f3031d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L7a
            goto La1
        L7a:
            boolean r0 = r4.f3032e
            boolean r1 = r5.f3032e
            if (r0 == r1) goto L81
            goto La1
        L81:
            long r0 = r4.f3033f
            long r2 = r5.f3033f
            boolean r0 = f1.w.c(r0, r2)
            if (r0 != 0) goto L8c
            goto La1
        L8c:
            long r0 = r4.f3034g
            long r2 = r5.f3034g
            boolean r0 = f1.w.c(r0, r2)
            if (r0 != 0) goto L97
            goto La1
        L97:
            f1.n r0 = r4.f3035h
            f1.n r5 = r5.f3035h
            boolean r5 = gg.l.a(r0, r5)
            if (r5 != 0) goto La3
        La1:
            r5 = 0
            return r5
        La3:
            r5 = 1
            return r5
    }

    @Override // x1.x0
    public final y0.n f() {
            r3 = this;
            f1.s0 r0 = new f1.s0
            r0.<init>()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f3114u = r1
            r0.f3115v = r1
            float r1 = r3.f3028a
            r0.f3116w = r1
            float r1 = r3.f3029b
            r0.f3117x = r1
            r1 = 1090519040(0x41000000, float:8.0)
            r0.f3118y = r1
            long r1 = r3.f3030c
            r0.f3119z = r1
            f1.r0 r1 = r3.f3031d
            r0.A = r1
            boolean r1 = r3.f3032e
            r0.B = r1
            long r1 = r3.f3033f
            r0.C = r1
            long r1 = r3.f3034g
            r0.D = r1
            r1 = 3
            r0.E = r1
            f1.n r1 = r3.f3035h
            r0.F = r1
            b1.f r1 = new b1.f
            r2 = 7
            r1.<init>(r0, r2)
            r0.G = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            f1.s0 r3 = (f1.s0) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.f3114u = r0
            r3.f3115v = r0
            float r0 = r2.f3028a
            r3.f3116w = r0
            float r0 = r2.f3029b
            r3.f3117x = r0
            r0 = 1090519040(0x41000000, float:8.0)
            r3.f3118y = r0
            long r0 = r2.f3030c
            r3.f3119z = r0
            f1.r0 r0 = r2.f3031d
            r3.A = r0
            boolean r0 = r2.f3032e
            r3.B = r0
            long r0 = r2.f3033f
            r3.C = r0
            long r0 = r2.f3034g
            r3.D = r0
            r0 = 3
            r3.E = r0
            f1.n r0 = r2.f3035h
            r3.F = r0
            b1.f r0 = r3.G
            y0.n r1 = r3.f21819g
            boolean r1 = r1.f21832t
            if (r1 != 0) goto L38
            goto L45
        L38:
            r1 = 2
            x1.i1 r3 = x1.k.t(r3, r1)
            x1.i1 r3 = r3.f20944v
            if (r3 == 0) goto L45
            r1 = 1
            r3.Q1(r0, r1)
        L45:
            return
    }

    public final int hashCode() {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = java.lang.Float.hashCode(r0)
            r2 = 31
            int r1 = r1 * r2
            int r0 = eh.a.d(r0, r1, r2)
            float r1 = r5.f3028a
            int r0 = eh.a.d(r1, r0, r2)
            r1 = 0
            int r0 = eh.a.d(r1, r0, r2)
            int r0 = eh.a.d(r1, r0, r2)
            float r3 = r5.f3029b
            int r0 = eh.a.d(r3, r0, r2)
            int r0 = eh.a.d(r1, r0, r2)
            int r0 = eh.a.d(r1, r0, r2)
            int r0 = eh.a.d(r1, r0, r2)
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = eh.a.d(r1, r0, r2)
            int r1 = f1.u0.f3123c
            long r3 = r5.f3030c
            int r0 = eh.a.f(r0, r2, r3)
            f1.r0 r1 = r5.f3031d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            boolean r0 = r5.f3032e
            r3 = 961(0x3c1, float:1.347E-42)
            int r0 = eh.a.h(r1, r3, r0)
            int r1 = f1.w.f3132h
            long r3 = r5.f3033f
            int r0 = eh.a.f(r0, r2, r3)
            long r3 = r5.f3034g
            int r0 = eh.a.f(r0, r2, r3)
            r1 = 0
            int r0 = eh.a.e(r1, r0, r2)
            r3 = 3
            int r0 = eh.a.e(r3, r0, r2)
            f1.n r2 = r5.f3035h
            if (r2 != 0) goto L69
            goto L6d
        L69:
            int r1 = r2.hashCode()
        L6d:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha="
            r0.<init>(r1)
            float r1 = r3.f3028a
            r0.append(r1)
            java.lang.String r1 = ", translationX=0.0, translationY=0.0, shadowElevation="
            r0.append(r1)
            float r1 = r3.f3029b
            r0.append(r1)
            java.lang.String r1 = ", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin="
            r0.append(r1)
            long r1 = r3.f3030c
            java.lang.String r1 = f1.u0.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", shape="
            r0.append(r1)
            f1.r0 r1 = r3.f3031d
            r0.append(r1)
            java.lang.String r1 = ", clip="
            r0.append(r1)
            boolean r1 = r3.f3032e
            r0.append(r1)
            java.lang.String r1 = ", renderEffect=null, ambientShadowColor="
            r0.append(r1)
            long r1 = r3.f3033f
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", spotShadowColor="
            r0.append(r1)
            long r1 = r3.f3034g
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", compositingStrategy=CompositingStrategy(value=0), blendMode="
            r0.append(r1)
            r1 = 3
            java.lang.String r1 = f1.c0.A(r1)
            r0.append(r1)
            java.lang.String r1 = ", colorFilter="
            r0.append(r1)
            f1.n r1 = r3.f3035h
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
