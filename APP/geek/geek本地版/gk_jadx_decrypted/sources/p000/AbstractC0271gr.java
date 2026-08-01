package p000;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: gr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0271gr {
    /* JADX INFO: renamed from: a */
    public static void m1295a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    /* JADX INFO: renamed from: b */
    public static void m1296b(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
