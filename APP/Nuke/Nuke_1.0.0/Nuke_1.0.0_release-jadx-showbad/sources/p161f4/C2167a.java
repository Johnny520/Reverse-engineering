package p161f4;

/* JADX INFO: renamed from: f4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2167a {

    /* JADX INFO: renamed from: a */
    public final int f7125a;

    /* JADX INFO: renamed from: b */
    public long f7126b;

    /* JADX INFO: renamed from: c */
    public long f7127c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2167a(int i5) {
        this.f7125a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m4004b(C2167a c2167a, long j5, long j6, int i5) {
        if ((i5 & 1) != 0) {
            j5 = 0;
        }
        if ((i5 & 2) != 0) {
            j6 = 0;
        }
        synchronized (c2167a) {
            try {
                if (j5 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j6 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j7 = c2167a.f7126b + j5;
                c2167a.f7126b = j7;
                long j8 = c2167a.f7127c + j6;
                c2167a.f7127c = j8;
                if (j8 > j7) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized long m4005a() {
        return this.f7126b - this.f7127c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "WindowCounter(streamId=" + this.f7125a + ", total=" + this.f7126b + ", acknowledged=" + this.f7127c + ", unacknowledged=" + m4005a() + ')';
    }
}
