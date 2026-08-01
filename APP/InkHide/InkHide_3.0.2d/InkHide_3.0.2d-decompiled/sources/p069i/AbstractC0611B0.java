package p069i;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: i.B0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0611B0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1210a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1211b(PopupWindow popupWindow, boolean z2) {
        popupWindow.setIsClippedToScreen(z2);
    }
}
