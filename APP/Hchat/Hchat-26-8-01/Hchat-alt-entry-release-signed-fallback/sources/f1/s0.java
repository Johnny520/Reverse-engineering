package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends y0.n implements x1.v, x1.z1 {
    public f1.r0 A;
    public boolean B;
    public long C;
    public long D;
    public int E;
    public f1.n F;
    public b1.f G;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f3114u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f3115v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f3116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f3117x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f3118y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f3119z;

    @Override // x1.z1
    public final boolean A() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // x1.z1
    public final void X0(f2.y r2) {
            r1 = this;
            boolean r0 = r1.B
            if (r0 != 0) goto L5
            return
        L5:
            f1.r0 r0 = r1.A
            f2.w.d(r2, r0)
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r3, v1.m0 r4, long r5) {
            r2 = this;
            v1.b1 r4 = r4.Q(r5)
            int r5 = r4.f13900g
            int r6 = r4.f13901h
            f1.p r0 = new f1.p
            r1 = 1
            r0.<init>(r4, r1, r2)
            tf.u r4 = tf.u.f13168g
            v1.o0 r3 = r3.z(r5, r6, r4, r0)
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SimpleGraphicsLayerModifier(scaleX="
            r0.<init>(r1)
            float r1 = r3.f3114u
            r0.append(r1)
            java.lang.String r1 = ", scaleY="
            r0.append(r1)
            float r1 = r3.f3115v
            r0.append(r1)
            java.lang.String r1 = ", alpha = "
            r0.append(r1)
            float r1 = r3.f3116w
            r0.append(r1)
            java.lang.String r1 = ", translationX=0.0, translationY=0.0, shadowElevation="
            r0.append(r1)
            float r1 = r3.f3117x
            r0.append(r1)
            java.lang.String r1 = ", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance="
            r0.append(r1)
            float r1 = r3.f3118y
            r0.append(r1)
            java.lang.String r1 = ", transformOrigin="
            r0.append(r1)
            long r1 = r3.f3119z
            java.lang.String r1 = f1.u0.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", shape="
            r0.append(r1)
            f1.r0 r1 = r3.A
            r0.append(r1)
            java.lang.String r1 = ", clip="
            r0.append(r1)
            boolean r1 = r3.B
            r0.append(r1)
            java.lang.String r1 = ", renderEffect=null, ambientShadowColor="
            r0.append(r1)
            long r1 = r3.C
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", spotShadowColor="
            r0.append(r1)
            long r1 = r3.D
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", compositingStrategy=CompositingStrategy(value=0), blendMode="
            r0.append(r1)
            int r1 = r3.E
            java.lang.String r1 = f1.c0.A(r1)
            r0.append(r1)
            java.lang.String r1 = ", colorFilter="
            r0.append(r1)
            f1.n r1 = r3.F
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
