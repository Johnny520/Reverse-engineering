package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1375 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f3980;

    static {
        int[] iArr = new int[PausedCompositionState.values().length];
        try {
            iArr[PausedCompositionState.InitialPending.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PausedCompositionState.RecomposePending.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PausedCompositionState.Recomposing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PausedCompositionState.ApplyPending.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PausedCompositionState.Applied.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PausedCompositionState.Cancelled.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PausedCompositionState.Invalid.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f3980 = iArr;
    }
}
