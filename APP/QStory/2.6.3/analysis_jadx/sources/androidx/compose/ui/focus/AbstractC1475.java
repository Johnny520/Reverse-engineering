package androidx.compose.ui.focus;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f4174;

    static {
        int[] iArr = new int[CustomDestinationResult.values().length];
        try {
            iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CustomDestinationResult.None.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f4174 = iArr;
    }
}
