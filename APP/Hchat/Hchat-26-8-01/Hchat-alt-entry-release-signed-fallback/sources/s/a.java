package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11966b;

    public final long a() {
            r4 = this;
            boolean r0 = r4.f11965a
            if (r0 == 0) goto La
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        La:
            long r0 = r4.f11966b
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)
            return r0
    }
}
