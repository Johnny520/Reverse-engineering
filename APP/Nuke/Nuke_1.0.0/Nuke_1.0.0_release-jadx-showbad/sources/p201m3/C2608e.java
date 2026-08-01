package p201m3;

/* JADX INFO: renamed from: m3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2608e extends AbstractC2611h {

    /* JADX INFO: renamed from: g */
    public static final C2608e f8305g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = AbstractC2614k.f8313c;
        int i6 = AbstractC2614k.f8314d;
        long j5 = AbstractC2614k.f8315e;
        String str = AbstractC2614k.f8311a;
        C2608e c2608e = new C2608e();
        c2608e.f8307f = new ExecutorC2606c(i5, i6, j5, str);
        f8305g = c2608e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2153p
    public final String toString() {
        return "Dispatchers.Default";
    }
}
