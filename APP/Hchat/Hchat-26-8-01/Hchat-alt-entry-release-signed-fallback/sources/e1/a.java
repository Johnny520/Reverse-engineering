package e1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2293d;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2290a = r0
            r1.f2291b = r0
            r1.f2292c = r0
            r1.f2293d = r0
            return
    }

    public final void a(float r2, float r3, float r4, float r5) {
            r1 = this;
            float r0 = r1.f2290a
            float r2 = java.lang.Math.max(r2, r0)
            r1.f2290a = r2
            float r2 = r1.f2291b
            float r2 = java.lang.Math.max(r3, r2)
            r1.f2291b = r2
            float r2 = r1.f2292c
            float r2 = java.lang.Math.min(r4, r2)
            r1.f2292c = r2
            float r2 = r1.f2293d
            float r2 = java.lang.Math.min(r5, r2)
            r1.f2293d = r2
            return
    }

    public final boolean b() {
            r5 = this;
            float r0 = r5.f2290a
            float r1 = r5.f2292c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 < 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            float r3 = r5.f2291b
            float r4 = r5.f2293d
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L16
            r1 = r2
        L16:
            r0 = r0 | r1
            return r0
    }

    public final void c(long r4) {
            r3 = this;
            r0 = 32
            long r0 = r4 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r5 = r3.f2290a
            float r5 = r5 + r0
            r3.f2290a = r5
            float r5 = r3.f2291b
            float r5 = r5 + r4
            r3.f2291b = r5
            float r5 = r3.f2292c
            float r5 = r5 + r0
            r3.f2292c = r5
            float r5 = r3.f2293d
            float r5 = r5 + r4
            r3.f2293d = r5
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MutableRect("
            r0.<init>(r1)
            float r1 = r3.f2290a
            java.lang.String r1 = a7.a.V(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = r3.f2291b
            java.lang.String r2 = a7.a.V(r2)
            r0.append(r2)
            r0.append(r1)
            float r2 = r3.f2292c
            java.lang.String r2 = a7.a.V(r2)
            r0.append(r2)
            r0.append(r1)
            float r1 = r3.f2293d
            java.lang.String r1 = a7.a.V(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
