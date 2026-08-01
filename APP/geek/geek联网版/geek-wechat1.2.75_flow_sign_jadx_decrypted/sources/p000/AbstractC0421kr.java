package p000;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: kr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0421kr {
    /* JADX INFO: renamed from: a */
    public static void m1706a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    /* JADX INFO: renamed from: b */
    public static void m1707b(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
