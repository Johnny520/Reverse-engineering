package androidx.compose.ui.focus;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1453 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f4152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f4153;

    static {
        int[] iArr = new int[CustomDestinationResult.values().length];
        try {
            iArr[CustomDestinationResult.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f4153 = iArr;
        int[] iArr2 = new int[FocusStateImpl.values().length];
        try {
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[FocusStateImpl.Captured.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f4152 = iArr2;
    }
}
