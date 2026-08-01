package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class vx {
    public static boolean a(PopupWindow r0) {
        return r0.getOverlapAnchor();
    }

    public static int b(PopupWindow r0) {
        return r0.getWindowLayoutType();
    }

    public static void c(PopupWindow r0, boolean r1) {
        r0.setOverlapAnchor(r1);
    }

    public static void d(PopupWindow r0, int r1) {
        r0.setWindowLayoutType(r1);
    }
}
