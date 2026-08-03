package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ac.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f171b;

    public g(int r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f166a = r1
            r0.f171b = r2
            return
    }

    @Override // ac.b
    public final byte a() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // ac.b
    public final boolean b() {
            r4 = this;
            long r0 = r4.f171b
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
            long r0 = r2.f171b
            float r0 = (float) r0
            return r0
    }

    @Override // ac.b
    public final int d() {
            r2 = this;
            long r0 = r2.f171b
            int r0 = (int) r0
            return r0
    }

    @Override // ac.b
    public final long e() {
            r2 = this;
            long r0 = r2.f171b
            return r0
    }

    @Override // ac.b
    public final java.lang.String f() {
            r2 = this;
            long r0 = r2.f171b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
