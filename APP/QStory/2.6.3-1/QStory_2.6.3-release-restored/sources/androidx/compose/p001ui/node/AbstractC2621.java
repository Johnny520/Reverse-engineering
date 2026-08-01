package androidx.compose.p001ui.node;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f5569;

    static {
        int[] iArr = new int[Invalidation.values().length];
        try {
            iArr[Invalidation.LookaheadMeasurement.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Invalidation.LookaheadPlacement.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Invalidation.Measurement.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Invalidation.Placement.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f5569 = iArr;
    }
}
