package p000;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: Bo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0074Bo {
    /* JADX INFO: renamed from: a */
    public static void m123a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    /* JADX INFO: renamed from: b */
    public static void m124b(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
