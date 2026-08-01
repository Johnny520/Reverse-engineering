package p166l2;

/* JADX INFO: renamed from: l2.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4581r {
    /* JADX INFO: renamed from: a */
    public static final int m18190a(long j10, long j11) {
        boolean zM18194e = m18194e(j10);
        if (zM18194e != m18194e(j11)) {
            return zM18194e ? -1 : 1;
        }
        return (Math.min(m18192c(j10), m18192c(j11)) >= 0.0f && m18193d(j10) != m18193d(j11)) ? m18193d(j10) ? -1 : 1 : (int) Math.signum(m18192c(j10) - m18192c(j11));
    }

    /* JADX INFO: renamed from: c */
    public static final float m18192c(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m18193d(long j10) {
        return (j10 & 2) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m18194e(long j10) {
        return (j10 & 1) != 0;
    }

    /* JADX INFO: renamed from: b */
    public static long m18191b(long j10) {
        return j10;
    }
}
