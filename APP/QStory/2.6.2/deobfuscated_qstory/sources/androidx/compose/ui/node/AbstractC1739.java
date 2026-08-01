package androidx.compose.ui.node;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1739 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f5042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f5043;

    static {
        int[] iArr = new int[LayoutNode$LayoutState.values().length];
        try {
            iArr[LayoutNode$LayoutState.Measuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayoutNode$LayoutState.LayingOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f5043 = iArr;
        int[] iArr2 = new int[LayoutNode$UsageByParent.values().length];
        try {
            iArr2[LayoutNode$UsageByParent.InMeasureBlock.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[LayoutNode$UsageByParent.InLayoutBlock.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f5042 = iArr2;
    }
}
