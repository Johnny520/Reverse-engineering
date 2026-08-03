package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends x1.n0 implements v1.m0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x1.i1 f21007u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f21008v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public java.util.LinkedHashMap f21009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v1.l0 f21010x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public v1.o0 f21011y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f.b0 f21012z;

    public o0(x1.i1 r3) {
            r2 = this;
            r2.<init>()
            r2.f21007u = r3
            r0 = 0
            r2.f21008v = r0
            v1.l0 r3 = new v1.l0
            r3.<init>(r2)
            r2.f21010x = r3
            f.b0 r3 = f.o0.f2877a
            f.b0 r3 = new f.b0
            r3.<init>()
            r2.f21012z = r3
            return
    }

    public static final void g1(x1.o0 r6, v1.o0 r7) {
            if (r7 == 0) goto L1a
            int r0 = r7.h()
            int r1 = r7.g()
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            long r0 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            r6.C0(r0)
            goto L1f
        L1a:
            r0 = 0
            r6.C0(r0)
        L1f:
            v1.o0 r0 = r6.f21011y
            boolean r0 = gg.l.a(r0, r7)
            if (r0 != 0) goto L6e
            if (r7 == 0) goto L6e
            java.util.LinkedHashMap r0 = r6.f21009w
            if (r0 == 0) goto L33
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3d
        L33:
            java.util.Map r0 = r7.e()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6e
        L3d:
            java.util.Map r0 = r7.e()
            java.util.LinkedHashMap r1 = r6.f21009w
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L6e
            x1.i1 r0 = r6.f21007u
            x1.f0 r0 = r0.f20943u
            x1.j0 r0 = r0.M
            x1.r0 r0 = r0.f20967q
            r0.getClass()
            x1.g0 r0 = r0.f21037x
            r0.f()
            java.util.LinkedHashMap r0 = r6.f21009w
            if (r0 != 0) goto L64
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r6.f21009w = r0
        L64:
            r0.clear()
            java.util.Map r1 = r7.e()
            r0.putAll(r1)
        L6e:
            r6.f21011y = r7
            return
    }

    @Override // v1.b1
    public final void A0(long r1, float r3, fg.l r4) {
            r0 = this;
            r0.i1(r1)
            boolean r1 = r0.f20998p
            if (r1 == 0) goto L8
            return
        L8:
            r0.h1()
            return
    }

    @Override // x1.n0
    public final x1.n0 S0() {
            r1 = this;
            x1.i1 r0 = r1.f21007u
            x1.i1 r0 = r0.f20944v
            if (r0 == 0) goto Lb
            x1.o0 r0 = r0.p1()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // x1.n0
    public final v1.t T0() {
            r1 = this;
            v1.l0 r0 = r1.f21010x
            return r0
    }

    @Override // v1.b1, v1.m0
    public final java.lang.Object X() {
            r1 = this;
            x1.i1 r0 = r1.f21007u
            java.lang.Object r0 = r0.X()
            return r0
    }

    @Override // x1.n0
    public final boolean X0() {
            r1 = this;
            v1.o0 r0 = r1.f21011y
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // x1.n0
    public final x1.f0 Y0() {
            r1 = this;
            x1.i1 r0 = r1.f21007u
            x1.f0 r0 = r0.f20943u
            return r0
    }

    @Override // x1.n0
    public final v1.o0 Z0() {
            r1 = this;
            v1.o0 r0 = r1.f21011y
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "LookaheadDelegate has not been measured yet when measureResult is requested."
            af.d r0 = wb.en.a(r0)
            throw r0
    }

    @Override // x1.n0
    public final x1.n0 a1() {
            r1 = this;
            x1.i1 r0 = r1.f21007u
            x1.i1 r0 = r0.f20945w
            if (r0 == 0) goto Lb
            x1.o0 r0 = r0.p1()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // x1.n0
    public final long b1() {
            r2 = this;
            long r0 = r2.f21008v
            return r0
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            x1.i1 r0 = r1.f21007u
            float r0 = r0.d()
            return r0
    }

    @Override // x1.n0
    public final void f1() {
            r4 = this;
            long r0 = r4.f21008v
            r2 = 0
            r3 = 0
            r4.A0(r0, r2, r3)
            return
    }

    @Override // v1.o
    public final u2.m getLayoutDirection() {
            r1 = this;
            x1.i1 r0 = r1.f21007u
            x1.f0 r0 = r0.f20943u
            u2.m r0 = r0.F
            return r0
    }

    public void h1() {
            r1 = this;
            v1.o0 r0 = r1.Z0()
            r0.f()
            return
    }

    public final void i1(long r3) {
            r2 = this;
            long r0 = r2.f21008v
            boolean r0 = u2.j.b(r0, r3)
            if (r0 != 0) goto L1a
            r2.f21008v = r3
            x1.i1 r3 = r2.f21007u
            x1.f0 r4 = r3.f20943u
            x1.j0 r4 = r4.M
            x1.r0 r4 = r4.f20967q
            if (r4 == 0) goto L17
            r4.N0()
        L17:
            x1.n0.d1(r3)
        L1a:
            boolean r3 = r2.f20999q
            if (r3 != 0) goto L25
            v1.o0 r3 = r2.Z0()
            r2.N0(r3)
        L25:
            return
    }

    public final long j1(x1.o0 r6, boolean r7) {
            r5 = this;
            r0 = 0
            r2 = r5
        L3:
            boolean r3 = r2.equals(r6)
            if (r3 != 0) goto L24
            boolean r3 = r2.f20997o
            if (r3 == 0) goto Lf
            if (r7 != 0) goto L15
        Lf:
            long r3 = r2.f21008v
            long r0 = u2.j.d(r0, r3)
        L15:
            x1.i1 r2 = r2.f21007u
            x1.i1 r2 = r2.f20945w
            r2.getClass()
            x1.o0 r2 = r2.p1()
            r2.getClass()
            goto L3
        L24:
            return r0
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            x1.i1 r0 = r1.f21007u
            float r0 = r0.q0()
            return r0
    }

    @Override // x1.n0, v1.o
    public final boolean u0() {
            r1 = this;
            r0 = 1
            return r0
    }
}
