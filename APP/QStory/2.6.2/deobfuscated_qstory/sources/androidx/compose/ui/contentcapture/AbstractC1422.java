package androidx.compose.ui.contentcapture;

/* JADX INFO: renamed from: androidx.compose.ui.contentcapture.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1422 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f4099;

    static {
        int[] iArr = new int[ContentCaptureEventType.values().length];
        try {
            iArr[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f4099 = iArr;
    }
}
