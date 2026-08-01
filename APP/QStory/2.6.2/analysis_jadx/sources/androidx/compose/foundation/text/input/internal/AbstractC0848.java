package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyCommand;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0848 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f2379;

    static {
        int[] iArr = new int[KeyCommand.values().length];
        try {
            iArr[KeyCommand.COPY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KeyCommand.CUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KeyCommand.PASTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f2379 = iArr;
    }
}
