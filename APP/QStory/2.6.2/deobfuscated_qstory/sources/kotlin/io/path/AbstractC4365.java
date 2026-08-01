package kotlin.io.path;

/* JADX INFO: renamed from: kotlin.io.path.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4365 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12937;

    static {
        int[] iArr = new int[CopyActionResult.values().length];
        try {
            iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f12937 = iArr;
        int[] iArr2 = new int[OnErrorResult.values().length];
        try {
            iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f12936 = iArr2;
    }
}
