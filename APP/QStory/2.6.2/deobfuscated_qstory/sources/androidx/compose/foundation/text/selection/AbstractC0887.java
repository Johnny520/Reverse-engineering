package androidx.compose.foundation.text.selection;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f2516;

    static {
        int[] iArr = new int[SelectedTextType.values().length];
        try {
            iArr[SelectedTextType.EditableText.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectedTextType.StaticText.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f2516 = iArr;
    }
}
