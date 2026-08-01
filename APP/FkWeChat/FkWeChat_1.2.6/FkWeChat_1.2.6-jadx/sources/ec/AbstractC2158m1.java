package ec;

import p145jc.C3801d0;

/* JADX INFO: renamed from: ec.m1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2158m1 {

    /* JADX INFO: renamed from: a */
    public static final C3801d0 f5984a = new C3801d0("REMOVED_TASK");

    /* JADX INFO: renamed from: b */
    public static final C3801d0 f5985b = new C3801d0("CLOSED_EMPTY");

    /* JADX INFO: renamed from: c */
    public static final long m7843c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
