package p000;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: ey */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0204ey {
    /* JADX INFO: renamed from: a */
    public static boolean m1033a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    /* JADX INFO: renamed from: b */
    public static int m1034b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* JADX INFO: renamed from: c */
    public static void m1035c(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    /* JADX INFO: renamed from: d */
    public static void m1036d(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
