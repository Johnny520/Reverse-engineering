package p250r1;

import p152k3.AbstractC3950d;

/* JADX INFO: renamed from: r1.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6456f {
    /* JADX INFO: renamed from: a */
    public static final long m25570a(float f10, float f11) {
        return C6455e.m25551e((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* JADX INFO: renamed from: b */
    public static final long m25571b(long j10, long j11, float f10) {
        float fM15660b = AbstractC3950d.m15660b(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fM15660b2 = AbstractC3950d.m15660b(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10);
        return C6455e.m25551e((((long) Float.floatToRawIntBits(fM15660b)) << 32) | (((long) Float.floatToRawIntBits(fM15660b2)) & 4294967295L));
    }
}
