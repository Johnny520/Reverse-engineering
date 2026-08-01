package p121i3;

import p250r1.C6461k;

/* JADX INFO: renamed from: i3.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3190t {
    /* JADX INFO: renamed from: a */
    public static final long m12089a(long j10) {
        return C3185o.m12044d((((j10 << 32) >> 33) & 4294967295L) | ((j10 >> 33) << 32));
    }

    /* JADX INFO: renamed from: b */
    public static final long m12090b(long j10) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j10 >> 32)));
        return C3189s.m12082c((((long) Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32));
    }

    /* JADX INFO: renamed from: c */
    public static final long m12091c(long j10) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j10 >> 32));
        return C3189s.m12082c((((long) ((int) Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32));
    }

    /* JADX INFO: renamed from: d */
    public static final long m12092d(long j10) {
        return C6461k.m25616d((((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32));
    }
}
