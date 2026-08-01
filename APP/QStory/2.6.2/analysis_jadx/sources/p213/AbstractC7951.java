package p213;

import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;

/* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f22021;

    static {
        int[] iArr = new int[MenuItemOption.values().length];
        try {
            iArr[MenuItemOption.Copy.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MenuItemOption.Paste.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MenuItemOption.Cut.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MenuItemOption.SelectAll.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MenuItemOption.Autofill.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f22021 = iArr;
    }
}
