package io.ktor.network.selector;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4000 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12248;

    static {
        int[] iArr = new int[SelectInterest.values().length];
        try {
            iArr[SelectInterest.READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectInterest.WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectInterest.ACCEPT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SelectInterest.CONNECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f12248 = iArr;
    }
}
