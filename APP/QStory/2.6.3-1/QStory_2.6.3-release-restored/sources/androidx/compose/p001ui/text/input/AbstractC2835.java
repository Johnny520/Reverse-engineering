package androidx.compose.p001ui.text.input;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2835 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f6251;

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
        f6251 = iArr;
    }
}
