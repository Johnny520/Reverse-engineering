package androidx.compose.ui.text.input;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2001 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f5905;

    static {
        int[] iArr = new int[TextInputServiceAndroid$TextInputCommand.values().length];
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.StartInput.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.StopInput.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.ShowKeyboard.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.HideKeyboard.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f5905 = iArr;
    }
}
