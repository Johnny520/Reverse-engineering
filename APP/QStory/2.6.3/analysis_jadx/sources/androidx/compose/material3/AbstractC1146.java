package androidx.compose.material3;

import androidx.compose.material3.tokens.MotionSchemeKeyTokens;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f3285;

    static {
        int[] iArr = new int[MotionSchemeKeyTokens.values().length];
        try {
            iArr[MotionSchemeKeyTokens.DefaultSpatial.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MotionSchemeKeyTokens.FastSpatial.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MotionSchemeKeyTokens.SlowSpatial.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MotionSchemeKeyTokens.DefaultEffects.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MotionSchemeKeyTokens.FastEffects.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MotionSchemeKeyTokens.SlowEffects.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f3285 = iArr;
    }
}
