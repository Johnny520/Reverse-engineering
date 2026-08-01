package androidx.compose.ui.focus;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f4146;

    static {
        int[] iArr = new int[FocusStateImpl.values().length];
        try {
            iArr[FocusStateImpl.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FocusStateImpl.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f4146 = iArr;
    }
}
