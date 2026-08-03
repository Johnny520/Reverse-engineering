package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4766b;

    public v0(float r1, u2.c r2) {
            r0 = this;
            r0.<init>()
            r0.f4765a = r1
            float r1 = r2.d()
            float r2 = h.w0.f4771a
            r2 = 1136724797(0x43c10b3d, float:386.0878)
            float r1 = r1 * r2
            r2 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 * r2
            r2 = 1062668861(0x3f570a3d, float:0.84)
            float r1 = r1 * r2
            r0.f4766b = r1
            return
    }

    public final h.u0 a(float r10) {
            r9 = this;
            double r0 = r9.b(r10)
            float r2 = h.w0.f4771a
            double r2 = (double) r2
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r2 - r4
            h.u0 r6 = new h.u0
            float r7 = r9.f4765a
            float r8 = r9.f4766b
            float r7 = r7 * r8
            double r7 = (double) r7
            double r2 = r2 / r4
            double r2 = r2 * r0
            double r2 = java.lang.Math.exp(r2)
            double r2 = r2 * r7
            float r2 = (float) r2
            double r0 = r0 / r4
            double r0 = java.lang.Math.exp(r0)
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r3
            long r0 = (long) r0
            r6.<init>(r10, r2, r0)
            return r6
    }

    public final double b(float r6) {
            r5 = this;
            float[] r0 = h.b.f4614a
            float r0 = r5.f4765a
            float r1 = r5.f4766b
            float r0 = r0 * r1
            r1 = 1051931443(0x3eb33333, float:0.35)
            float r6 = java.lang.Math.abs(r6)
            float r6 = r6 * r1
            double r1 = (double) r6
            double r3 = (double) r0
            double r1 = r1 / r3
            double r0 = java.lang.Math.log(r1)
            return r0
    }
}
