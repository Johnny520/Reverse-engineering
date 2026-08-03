package kg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends jg.a {
    @Override // jg.d
    public final int c(int r2, int r3) {
            r1 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            int r2 = r0.nextInt(r2, r3)
            return r2
    }

    @Override // jg.d
    public final long e(long r2, long r4) {
            r1 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            long r2 = r0.nextLong(r2, r4)
            return r2
    }

    @Override // jg.a
    public final java.util.Random f() {
            r1 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            r0.getClass()
            return r0
    }
}
