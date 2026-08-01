package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f2642;

    static {
        int[] iArr = new int[Handle.values().length];
        try {
            iArr[Handle.Cursor.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Handle.SelectionStart.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Handle.SelectionEnd.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f2642 = iArr;
    }
}
