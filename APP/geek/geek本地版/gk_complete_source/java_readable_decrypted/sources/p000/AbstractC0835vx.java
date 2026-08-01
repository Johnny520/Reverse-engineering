package p000;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: vx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0835vx {
    /* JADX INFO: renamed from: a */
    public static boolean m2527a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    /* JADX INFO: renamed from: b */
    public static int m2528b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* JADX INFO: renamed from: c */
    public static void m2529c(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    /* JADX INFO: renamed from: d */
    public static void m2530d(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
