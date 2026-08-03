package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ci.q0 f1785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f1786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f1787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f1788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f1789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f1790f;

    public final void a(float r5, float r6) {
            r4 = this;
            double r0 = (double) r5
            r4.f1787c = r0
            r4.f1789e = r0
            r5 = 0
            double r0 = (double) r5
            r4.f1788d = r0
            double r0 = (double) r6
            r4.f1786b = r0
            r4.f1790f = r0
            ci.q0 r5 = new ci.q0
            float r6 = java.lang.Math.abs(r6)
            double r0 = (double) r6
            r2 = 4662219572839972864(0x40b3880000000000, double:5000.0)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L22
            r6 = 1057803469(0x3f0ccccd, float:0.55)
            goto L25
        L22:
            r6 = 1053609165(0x3ecccccd, float:0.4)
        L25:
            r5.<init>(r6)
            r4.f1785a = r5
            return
    }

    public final boolean b(float r20) {
            r19 = this;
            r0 = r19
            ci.q0 r1 = r0.f1785a
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            r3 = 981668463(0x3a83126f, float:0.001)
            r4 = 1015222895(0x3c83126f, float:0.016)
            r5 = r20
            float r3 = r9.e0.q(r5, r3, r4)
            double r4 = r0.f1786b
            double r6 = r0.f1787c
            double r8 = r0.f1788d
            double r10 = r1.f1793a
            double r12 = (double) r3
            double r10 = r10 * r12
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r14 - r10
            r16 = r2
            double r2 = r1.f1794b
            double r17 = r8 - r6
            double r17 = r17 * r2
            double r17 = r17 * r12
            double r4 = r4 * r10
            double r4 = r4 + r17
            r0.f1786b = r4
            double r12 = r12 * r4
            double r12 = r12 + r6
            r0.f1787c = r12
            double r1 = r0.f1789e
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L40
            int r2 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r2 <= 0) goto L40
            goto L65
        L40:
            if (r1 <= 0) goto L46
            int r2 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r2 < 0) goto L65
        L46:
            if (r1 != 0) goto L58
            double r1 = r0.f1790f
            double r1 = java.lang.Math.signum(r1)
            double r3 = r0.f1787c
            double r3 = java.lang.Math.signum(r3)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L65
        L58:
            double r1 = r0.f1787c
            double r3 = r0.f1788d
            double r1 = r1 - r3
            double r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 >= 0) goto L6f
        L65:
            double r1 = r0.f1788d
            r0.f1787c = r1
            r1 = 0
            r0.f1786b = r1
            r1 = 1
            return r1
        L6f:
            return r16
    }
}
