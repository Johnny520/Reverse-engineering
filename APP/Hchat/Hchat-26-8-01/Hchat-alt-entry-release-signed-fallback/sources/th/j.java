package th;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements th.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1.b f13318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.l f13319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.j1 f13320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public vh.c f13323f;

    public j(i1.b r1, b0.l r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f13318a = r1
            r0.f13319b = r2
            r1 = 0
            i0.j1 r1 = i0.r.u(r1)
            r0.f13320c = r1
            return
    }

    @Override // th.a
    public final void a(h1.d r17, u2.c r18, v1.t r19, fg.l r20, int r21) {
            r16 = this;
            r1 = r16
            r4 = r18
            r0 = r19
            r8 = r21
            r17.getClass()
            r4.getClass()
            if (r0 != 0) goto L11
            goto L1b
        L11:
            i0.j1 r2 = r1.f13320c
            java.lang.Object r2 = r2.getValue()
            v1.t r2 = (v1.t) r2
            if (r2 != 0) goto L1c
        L1b:
            return
        L1c:
            r9 = 0
            long r2 = r2.W(r0, r9)     // Catch: java.lang.Exception -> L24
        L22:
            r11 = r2
            goto L31
        L24:
            long r5 = r0.m(r9)
            long r2 = r2.m(r9)
            long r2 = e1.b.d(r5, r2)
            goto L22
        L31:
            boolean r0 = r4 instanceof th.g
            if (r0 == 0) goto L39
            r0 = r4
            th.g r0 = (th.g) r0
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L40
            long r2 = r0.f13290i
        L3e:
            r5 = r2
            goto L45
        L40:
            long r2 = r17.a()
            goto L3e
        L45:
            b5.c r13 = r17.z0()
            long r14 = r13.v()
            f1.u r0 = r13.p()
            r0.e()
            java.lang.Object r0 = r13.f469a     // Catch: java.lang.Throwable -> L65
            r3 = r0
            androidx.lifecycle.x r3 = (androidx.lifecycle.x) r3     // Catch: java.lang.Throwable -> L65
            if (r20 == 0) goto L67
            vh.c r2 = r1.e()     // Catch: java.lang.Throwable -> L65
            r7 = r20
            r2.e(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L65
            goto L67
        L65:
            r0 = move-exception
            goto Ld7
        L67:
            r0 = 1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 32
            if (r8 <= r0) goto Lae
            float r0 = (float) r8     // Catch: java.lang.Throwable -> L65
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 / r0
            long r7 = r11 >> r2
            int r2 = (int) r7     // Catch: java.lang.Throwable -> L65
            float r2 = java.lang.Float.intBitsToFloat(r2)     // Catch: java.lang.Throwable -> L65
            float r2 = r2 * r6
            long r4 = r4 & r11
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L65
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch: java.lang.Throwable -> L65
            float r4 = r4 * r6
            r5 = 1056964608(0x3f000000, float:0.5)
            float r7 = r2 * r5
            double r7 = (double) r7     // Catch: java.lang.Throwable -> L65
            double r7 = java.lang.Math.rint(r7)     // Catch: java.lang.Throwable -> L65
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L65
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L65
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L65
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r8
            float r5 = r5 * r4
            double r11 = (double) r5     // Catch: java.lang.Throwable -> L65
            double r11 = java.lang.Math.rint(r11)     // Catch: java.lang.Throwable -> L65
            float r5 = (float) r11     // Catch: java.lang.Throwable -> L65
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L65
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L65
            float r5 = r5 * r8
            float r2 = r2 - r7
            float r2 = r2 * r0
            r1.f13321d = r2     // Catch: java.lang.Throwable -> L65
            float r4 = r4 - r5
            float r4 = r4 * r0
            r1.f13322e = r4     // Catch: java.lang.Throwable -> L65
            float r0 = -r7
            float r2 = -r5
            r3.c0(r0, r2)     // Catch: java.lang.Throwable -> L65
            r3.S(r6, r6, r9)     // Catch: java.lang.Throwable -> L65
            goto Lc5
        Lae:
            r0 = 0
            r1.f13321d = r0     // Catch: java.lang.Throwable -> L65
            r1.f13322e = r0     // Catch: java.lang.Throwable -> L65
            long r6 = r11 >> r2
            int r0 = (int) r6     // Catch: java.lang.Throwable -> L65
            float r0 = java.lang.Float.intBitsToFloat(r0)     // Catch: java.lang.Throwable -> L65
            float r0 = -r0
            long r4 = r4 & r11
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L65
            float r2 = java.lang.Float.intBitsToFloat(r2)     // Catch: java.lang.Throwable -> L65
            float r2 = -r2
            r3.c0(r0, r2)     // Catch: java.lang.Throwable -> L65
        Lc5:
            i1.b r0 = r1.f13318a     // Catch: java.lang.Throwable -> L65
            r2 = r17
            oh.h.u(r2, r0)     // Catch: java.lang.Throwable -> L65
            f1.u r0 = r13.p()
            r0.p()
            r13.U(r14)
            return
        Ld7:
            f1.u r2 = r13.p()
            r2.p()
            r13.U(r14)
            throw r0
    }

    @Override // th.a
    public final boolean b() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // th.a
    public final float c() {
            r1 = this;
            float r0 = r1.f13321d
            return r0
    }

    @Override // th.a
    public final float d() {
            r1 = this;
            float r0 = r1.f13322e
            return r0
    }

    public final vh.c e() {
            r4 = this;
            vh.c r0 = r4.f13323f
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            if (r0 == 0) goto L1d
            r0.f14374g = r2
            r0.f14375h = r1
            r0.f14376i = r1
            r0.f14377j = r1
            r0.f14378k = r1
            int r1 = f1.e0.f3046b
            r1 = 0
            r0.f14379l = r1
            long r1 = f1.u0.f3122b
            return r0
        L1d:
            vh.c r0 = new vh.c
            r0.<init>()
            r0.f14374g = r2
            r0.f14375h = r1
            r0.f14376i = r1
            r0.f14377j = r1
            r0.f14378k = r1
            int r1 = f1.e0.f3046b
            long r1 = f1.u0.f3122b
            r4.f13323f = r0
            return r0
    }
}
