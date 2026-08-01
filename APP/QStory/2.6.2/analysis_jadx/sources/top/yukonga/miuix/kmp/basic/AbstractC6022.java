package top.yukonga.miuix.kmp.basic;

import top.yukonga.miuix.kmp.utils.PressFeedbackType;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6022 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f16450;

    static {
        int[] iArr = new int[PressFeedbackType.values().length];
        try {
            iArr[PressFeedbackType.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PressFeedbackType.Sink.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PressFeedbackType.Tilt.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f16450 = iArr;
    }
}
