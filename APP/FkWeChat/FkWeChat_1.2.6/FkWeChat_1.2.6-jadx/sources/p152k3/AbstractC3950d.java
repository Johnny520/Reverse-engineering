package p152k3;

/* JADX INFO: renamed from: k3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3950d {
    /* JADX INFO: renamed from: a */
    public static final float m15659a(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f10)) & 8589934591L) / ((long) 3))) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    /* JADX INFO: renamed from: b */
    public static final float m15660b(float f10, float f11, float f12) {
        return ((1 - f12) * f10) + (f12 * f11);
    }

    /* JADX INFO: renamed from: c */
    public static final int m15661c(int i10, int i11, float f10) {
        return i10 + ((int) Math.round(((double) (i11 - i10)) * ((double) f10)));
    }
}
