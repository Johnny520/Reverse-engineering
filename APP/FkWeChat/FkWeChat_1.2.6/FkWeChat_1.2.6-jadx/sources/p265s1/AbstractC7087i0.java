package p265s1;

import p172l8.C4688c0;
import p265s1.C7128q1;

/* JADX INFO: renamed from: s1.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7087i0 {
    /* JADX INFO: renamed from: a */
    public static final long m27899a(C7128q1.a aVar, long j10) {
        long j11 = 63 & j10;
        if (j11 >= 16) {
            j10 = (j10 & (-64)) | (j11 + 1);
        }
        return C7128q1.m28126l(C4688c0.m18729c(j10));
    }

    /* JADX INFO: renamed from: b */
    public static final long m27900b(long j10) {
        long j11 = 63 & j10;
        return Long.compareUnsigned(C4688c0.m18729c(j11), 16L) < 0 ? j10 : C4688c0.m18729c(C4688c0.m18729c(j10 & C4688c0.m18729c(-64L)) | C4688c0.m18729c(C4688c0.m18729c(j11) - 1));
    }
}
