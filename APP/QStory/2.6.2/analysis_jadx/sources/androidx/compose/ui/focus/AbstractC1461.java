package androidx.compose.ui.focus;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1461 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f4158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f4159;

    static {
        int[] iArr = new int[LayoutDirection.values().length];
        try {
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f4159 = iArr;
        int[] iArr2 = new int[FocusStateImpl.values().length];
        try {
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FocusStateImpl.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f4158 = iArr2;
    }
}
