package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ac.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f168b;

    @Override // ac.b
    public final byte a() {
            r1 = this;
            r0 = 5
            return r0
    }

    @Override // ac.b
    public final boolean b() {
            r4 = this;
            double r0 = r4.f168b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // ac.b
    public final float c() {
            r2 = this;
            double r0 = r2.f168b
            float r0 = (float) r0
            return r0
    }

    @Override // ac.b
    public final int d() {
            r2 = this;
            double r0 = r2.f168b
            int r0 = (int) r0
            return r0
    }

    @Override // ac.b
    public final long e() {
            r2 = this;
            double r0 = r2.f168b
            long r0 = (long) r0
            return r0
    }

    @Override // ac.b
    public final java.lang.String f() {
            r2 = this;
            double r0 = r2.f168b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
