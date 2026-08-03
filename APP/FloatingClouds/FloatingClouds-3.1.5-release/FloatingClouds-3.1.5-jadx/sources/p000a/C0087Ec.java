package p000a;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: a.Ec */
/* JADX INFO: loaded from: classes.dex */
public final class C0087Ec {
    /* JADX INFO: renamed from: a */
    public static boolean m213a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    /* JADX INFO: renamed from: b */
    public static int m214b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* JADX INFO: renamed from: c */
    public static void m215c(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    /* JADX INFO: renamed from: d */
    public static void m216d(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
