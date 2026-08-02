package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sd3 {

    /* JADX INFO: renamed from: a */
    public final int f10065a;

    /* JADX INFO: renamed from: b */
    public long f10066b;

    /* JADX INFO: renamed from: c */
    public long f10067c;

    public sd3(int i) {
        this.f10065a = i;
    }

    /* JADX INFO: renamed from: b */
    public static void m4810b(sd3 sd3Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (sd3Var) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = sd3Var.f10066b + j;
                sd3Var.f10066b = j3;
                long j4 = sd3Var.f10067c + j2;
                sd3Var.f10067c = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m4811a() {
        return this.f10066b - this.f10067c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f10065a + ", total=" + this.f10066b + ", acknowledged=" + this.f10067c + ", unacknowledged=" + m4811a() + ')';
    }
}
