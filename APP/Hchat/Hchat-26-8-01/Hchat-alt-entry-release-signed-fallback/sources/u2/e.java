package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements u2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f13341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f13342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v2.a f13343i;

    public e(float r1, float r2, v2.a r3) {
            r0 = this;
            r0.<init>()
            r0.f13341g = r1
            r0.f13342h = r2
            r0.f13343i = r3
            return
    }

    @Override // u2.c
    public final long J(float r3) {
            r2 = this;
            v2.a r0 = r2.f13343i
            float r3 = r0.a(r3)
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = x6.d.R(r0, r3)
            return r0
    }

    @Override // u2.c
    public final float S(long r5) {
            r4 = this;
            long r0 = u2.o.b(r5)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = u2.p.a(r0, r2)
            if (r0 == 0) goto L1a
            v2.a r0 = r4.f13343i
            float r5 = u2.o.c(r5)
            float r5 = r0.b(r5)
            return r5
        L1a:
            java.lang.String r5 = "Only Sp can convert to Px"
            j8.o.A(r5)
            r5 = 0
            return r5
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            float r0 = r1.f13341g
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof u2.e
            if (r0 != 0) goto L8
            goto L2a
        L8:
            u2.e r3 = (u2.e) r3
            float r0 = r2.f13341g
            float r1 = r3.f13341g
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L15
            goto L2a
        L15:
            float r0 = r2.f13342h
            float r1 = r3.f13342h
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L20
            goto L2a
        L20:
            v2.a r0 = r2.f13343i
            v2.a r3 = r3.f13343i
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f13341g
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f13342h
            int r0 = eh.a.d(r2, r0, r1)
            v2.a r1 = r3.f13343i
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            float r0 = r1.f13342h
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DensityWithConverter(density="
            r0.<init>(r1)
            float r1 = r2.f13341g
            r0.append(r1)
            java.lang.String r1 = ", fontScale="
            r0.append(r1)
            float r1 = r2.f13342h
            r0.append(r1)
            java.lang.String r1 = ", converter="
            r0.append(r1)
            v2.a r1 = r2.f13343i
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
