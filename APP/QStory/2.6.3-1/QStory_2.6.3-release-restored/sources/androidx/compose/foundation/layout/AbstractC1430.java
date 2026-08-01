package androidx.compose.foundation.layout;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1430 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f1996;

    static {
        int[] iArr = new int[FlowLayoutOverflow$OverflowType.values().length];
        try {
            iArr[FlowLayoutOverflow$OverflowType.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FlowLayoutOverflow$OverflowType.Clip.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FlowLayoutOverflow$OverflowType.ExpandIndicator.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FlowLayoutOverflow$OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f1996 = iArr;
    }
}
