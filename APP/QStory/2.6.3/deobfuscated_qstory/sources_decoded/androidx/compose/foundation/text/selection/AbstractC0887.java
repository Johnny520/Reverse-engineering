package androidx.compose.foundation.text.selection;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f2517;

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
        f2517 = iArr;
    }
}
