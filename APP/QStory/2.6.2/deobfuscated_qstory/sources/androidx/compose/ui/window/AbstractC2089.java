package androidx.compose.ui.window;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2089 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f6189;

    static {
        int[] iArr = new int[SecureFlagPolicy.values().length];
        try {
            iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f6189 = iArr;
    }
}
