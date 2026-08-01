package defpackage;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class gr {
    public static void a(PopupWindow r0, Rect r1) {
        r0.setEpicenterBounds(r1);
    }

    public static void b(PopupWindow r0, boolean r1) {
        r0.setIsClippedToScreen(r1);
    }
}
