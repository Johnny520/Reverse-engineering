package io.ktor.network.selector;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4833 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12597;

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
        f12597 = iArr;
    }
}
