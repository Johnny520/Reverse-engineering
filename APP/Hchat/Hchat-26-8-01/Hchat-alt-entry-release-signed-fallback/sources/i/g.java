package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface g {
    boolean a();

    long b();

    i.m1 c();

    i.q d(long r1);

    default boolean e(long r3) {
            r2 = this;
            long r0 = r2.b()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto La
            r3 = 1
            return r3
        La:
            r3 = 0
            return r3
    }

    java.lang.Object f(long r1);

    java.lang.Object g();
}
