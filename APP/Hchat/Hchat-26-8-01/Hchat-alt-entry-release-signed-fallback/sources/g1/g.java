package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends g1.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1.r f4093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1.r f4094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f4095g;

    public g(g1.r r9, g1.r r10) {
            r8 = this;
            r0 = 0
            r8.<init>(r10, r9, r10, r0)
            r8.f4093e = r9
            r8.f4094f = r10
            g1.a r0 = g1.a.f4056b
            float[] r0 = r0.f4057a
            g1.t r1 = r9.f4120d
            float[] r9 = r9.f4125i
            g1.t r2 = r10.f4120d
            float[] r3 = r10.f4126j
            boolean r4 = g1.k.d(r1, r2)
            if (r4 == 0) goto L1f
            float[] r9 = g1.k.g(r3, r9)
            goto L5a
        L1f:
            float[] r4 = r1.a()
            float[] r5 = r2.a()
            g1.t r6 = g1.k.f4102b
            boolean r1 = g1.k.d(r1, r6)
            r7 = 3
            if (r1 != 0) goto L3d
            float[] r1 = new float[r7]
            r1 = {x005e: FILL_ARRAY_DATA , data: [1064752793, 1065353216, 1062420357} // fill-array
            float[] r1 = g1.k.c(r0, r4, r1)
            float[] r9 = g1.k.g(r1, r9)
        L3d:
            boolean r1 = g1.k.d(r2, r6)
            if (r1 != 0) goto L56
            float[] r1 = new float[r7]
            r1 = {x0068: FILL_ARRAY_DATA , data: [1064752793, 1065353216, 1062420357} // fill-array
            float[] r0 = g1.k.c(r0, r5, r1)
            float[] r10 = r10.f4125i
            float[] r10 = g1.k.g(r0, r10)
            float[] r3 = g1.k.f(r10)
        L56:
            float[] r9 = g1.k.g(r3, r9)
        L5a:
            r8.f4095g = r9
            return
    }

    @Override // g1.h
    public final long a(long r7) {
            r6 = this;
            float r0 = f1.w.h(r7)
            float r1 = f1.w.g(r7)
            float r2 = f1.w.e(r7)
            float r7 = f1.w.d(r7)
            g1.r r8 = r6.f4093e
            g1.n r8 = r8.f4132p
            double r3 = (double) r0
            double r3 = r8.c(r3)
            float r0 = (float) r3
            double r3 = (double) r1
            double r3 = r8.c(r3)
            float r1 = (float) r3
            double r2 = (double) r2
            double r2 = r8.c(r2)
            float r8 = (float) r2
            r2 = 0
            float[] r3 = r6.f4095g
            r2 = r3[r2]
            float r2 = r2 * r0
            r4 = 3
            r4 = r3[r4]
            float r4 = r4 * r1
            float r4 = r4 + r2
            r2 = 6
            r2 = r3[r2]
            float r2 = r2 * r8
            float r2 = r2 + r4
            r4 = 1
            r4 = r3[r4]
            float r4 = r4 * r0
            r5 = 4
            r5 = r3[r5]
            float r5 = r5 * r1
            float r5 = r5 + r4
            r4 = 7
            r4 = r3[r4]
            float r4 = r4 * r8
            float r4 = r4 + r5
            r5 = 2
            r5 = r3[r5]
            float r5 = r5 * r0
            r0 = 5
            r0 = r3[r0]
            float r0 = r0 * r1
            float r0 = r0 + r5
            r1 = 8
            r1 = r3[r1]
            float r1 = r1 * r8
            float r1 = r1 + r0
            g1.r r8 = r6.f4094f
            g1.n r0 = r8.f4129m
            double r2 = (double) r2
            double r2 = r0.c(r2)
            float r0 = (float) r2
            g1.n r2 = r8.f4129m
            double r3 = (double) r4
            double r3 = r2.c(r3)
            float r3 = (float) r3
            double r4 = (double) r1
            double r1 = r2.c(r4)
            float r1 = (float) r1
            long r7 = f1.c0.b(r0, r3, r1, r7, r8)
            return r7
    }
}
