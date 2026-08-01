package p100y0;

import android.webkit.ConsoleMessage;

/* JADX INFO: renamed from: y0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1096b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3735a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        try {
            iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f3735a = iArr;
    }
}
