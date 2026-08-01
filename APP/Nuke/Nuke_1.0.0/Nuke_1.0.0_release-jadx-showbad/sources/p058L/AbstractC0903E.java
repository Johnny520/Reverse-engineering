package p058L;

import p077P0.C1135v;

/* JADX INFO: renamed from: L.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0903E {

    /* JADX INFO: renamed from: a */
    public static final float f2809a;

    /* JADX INFO: renamed from: b */
    public static final float f2810b;

    /* JADX INFO: renamed from: c */
    public static final C1135v f2811c = new C1135v("SelectionHandleInfo");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float f2 = 25;
        f2809a = f2;
        f2810b = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m1906a(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
