package p121i3;

import p250r1.C6455e;

/* JADX INFO: renamed from: i3.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3186p {
    /* JADX INFO: renamed from: a */
    public static final long m12059a(long j10, long j11) {
        return C6455e.m25551e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) - C3185o.m12049i(j11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) - C3185o.m12050j(j11))) & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public static final long m12060b(long j10, long j11) {
        return C6455e.m25551e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) + C3185o.m12049i(j11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) + C3185o.m12050j(j11))) & 4294967295L));
    }

    /* JADX INFO: renamed from: c */
    public static final long m12061c(long j10) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j10 >> 32)));
        return C3185o.m12044d((((long) Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32));
    }
}
