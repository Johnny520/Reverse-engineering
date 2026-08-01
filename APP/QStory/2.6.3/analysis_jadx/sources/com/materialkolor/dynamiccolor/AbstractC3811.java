package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3811 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12003;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12004;

    static {
        int[] iArr = new int[ToneDeltaPair$DeltaConstraint.values().length];
        try {
            iArr[ToneDeltaPair$DeltaConstraint.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ToneDeltaPair$DeltaConstraint.NEARER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ToneDeltaPair$DeltaConstraint.FARTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f12004 = iArr;
        int[] iArr2 = new int[Variant.values().length];
        try {
            iArr2[Variant.NEUTRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Variant.TONAL_SPOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Variant.EXPRESSIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Variant.VIBRANT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f12003 = iArr2;
    }
}
