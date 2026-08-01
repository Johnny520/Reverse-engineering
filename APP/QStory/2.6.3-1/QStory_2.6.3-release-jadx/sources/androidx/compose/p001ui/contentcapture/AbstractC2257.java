package androidx.compose.p001ui.contentcapture;

/* JADX INFO: renamed from: androidx.compose.ui.contentcapture.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f4445;

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
        f4445 = iArr;
    }
}
