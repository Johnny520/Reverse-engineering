package p006D;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: renamed from: D.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0107j {
    /* JADX INFO: renamed from: a */
    public static DisplayCutout m370a(Rect r1, List<Rect> r2) {
        return new DisplayCutout(r1, r2);
    }

    /* JADX INFO: renamed from: b */
    public static List<Rect> m371b(DisplayCutout r02) {
        return r02.getBoundingRects();
    }

    /* JADX INFO: renamed from: c */
    public static int m372c(DisplayCutout r02) {
        return r02.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: d */
    public static int m373d(DisplayCutout r02) {
        return r02.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: e */
    public static int m374e(DisplayCutout r02) {
        return r02.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: f */
    public static int m375f(DisplayCutout r02) {
        return r02.getSafeInsetTop();
    }
}
