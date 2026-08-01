package p283t8;

import p376zd.C9987e;

/* JADX INFO: renamed from: t8.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8205c {
    /* JADX INFO: renamed from: a */
    public static final int m31892a(int i10, int i11, int i12) {
        return m31896e(m31896e(i10, i12) - m31896e(i11, i12), i12);
    }

    /* JADX INFO: renamed from: b */
    public static final long m31893b(long j10, long j11, long j12) {
        return m31897f(m31897f(j10, j12) - m31897f(j11, j12), j12);
    }

    /* JADX INFO: renamed from: c */
    public static final int m31894c(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                return i11 - m31892a(i11, i10, i12);
            }
        } else {
            if (i12 >= 0) {
                C9987e.m38645a("Step is zero.");
                return 0;
            }
            if (i10 > i11) {
                return i11 + m31892a(i10, i11, -i12);
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: d */
    public static final long m31895d(long j10, long j11, long j12) {
        if (j12 > 0) {
            return j10 >= j11 ? j11 : j11 - m31893b(j11, j10, j12);
        }
        if (j12 < 0) {
            return j10 <= j11 ? j11 : j11 + m31893b(j10, j11, -j12);
        }
        C9987e.m38645a("Step is zero.");
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public static final int m31896e(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }

    /* JADX INFO: renamed from: f */
    public static final long m31897f(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }
}
