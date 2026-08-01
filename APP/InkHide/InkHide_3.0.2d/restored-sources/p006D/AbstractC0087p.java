package p006D;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: D.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0087p {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m224a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m225b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m226c(PopupWindow popupWindow, boolean z2) {
        popupWindow.setOverlapAnchor(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m227d(PopupWindow popupWindow, int i2) {
        popupWindow.setWindowLayoutType(i2);
    }
}
