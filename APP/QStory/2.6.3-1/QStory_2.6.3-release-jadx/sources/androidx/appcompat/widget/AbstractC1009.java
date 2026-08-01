package androidx.appcompat.widget;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1009 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m1177(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m1178(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }
}
