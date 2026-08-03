package p017J;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: J.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0224m {
    /* JADX INFO: renamed from: a */
    public static boolean m612a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    /* JADX INFO: renamed from: b */
    public static int m613b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* JADX INFO: renamed from: c */
    public static void m614c(PopupWindow popupWindow, boolean z2) {
        popupWindow.setOverlapAnchor(z2);
    }

    /* JADX INFO: renamed from: d */
    public static void m615d(PopupWindow popupWindow, int i2) {
        popupWindow.setWindowLayoutType(i2);
    }
}
