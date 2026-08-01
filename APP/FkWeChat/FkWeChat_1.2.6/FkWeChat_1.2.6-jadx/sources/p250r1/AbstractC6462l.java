package p250r1;

/* JADX INFO: renamed from: r1.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6462l {
    /* JADX INFO: renamed from: a */
    public static final long m25628a(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f;
        return C6455e.m25551e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    /* JADX INFO: renamed from: b */
    public static final C6457g m25629b(long j10) {
        return AbstractC6458h.m25597c(C6455e.f20314b.m25569c(), j10);
    }
}
