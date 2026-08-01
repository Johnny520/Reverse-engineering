package defpackage;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class xg {
    public static DisplayCutout a(Rect r1, List<Rect> r2) {
        return new DisplayCutout(r1, r2);
    }

    public static List<Rect> b(DisplayCutout r0) {
        return r0.getBoundingRects();
    }

    public static int c(DisplayCutout r0) {
        return r0.getSafeInsetBottom();
    }

    public static int d(DisplayCutout r0) {
        return r0.getSafeInsetLeft();
    }

    public static int e(DisplayCutout r0) {
        return r0.getSafeInsetRight();
    }

    public static int f(DisplayCutout r0) {
        return r0.getSafeInsetTop();
    }
}
