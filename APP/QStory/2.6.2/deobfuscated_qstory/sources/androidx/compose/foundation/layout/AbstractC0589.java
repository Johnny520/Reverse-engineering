package androidx.compose.foundation.layout;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0589 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f1650;

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
        f1650 = iArr;
    }
}
