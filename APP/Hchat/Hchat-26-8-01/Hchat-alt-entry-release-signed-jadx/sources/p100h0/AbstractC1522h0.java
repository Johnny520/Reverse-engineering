package p100h0;

import p072f2.C1061x;

/* JADX INFO: renamed from: h0.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1522h0 {

    /* JADX INFO: renamed from: a */
    public static final float f5084a;

    /* JADX INFO: renamed from: b */
    public static final float f5085b;

    /* JADX INFO: renamed from: c */
    public static final C1061x f5086c = new C1061x("SelectionHandleInfo");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float f3 = 25;
        f5084a = f3;
        f5085b = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m4037a(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
