package androidx.compose.ui.node;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1742 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f5045;

    static {
        int[] iArr = new int[LayoutNode$LayoutState.values().length];
        try {
            iArr[LayoutNode$LayoutState.LookaheadMeasuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayoutNode$LayoutState.Measuring.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LayoutNode$LayoutState.LookaheadLayingOut.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LayoutNode$LayoutState.LayingOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LayoutNode$LayoutState.Idle.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f5045 = iArr;
    }
}
