package p006D;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: renamed from: D.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0107j {
    /* JADX INFO: renamed from: a */
    public static DisplayCutout m370a(Rect rect, List<Rect> list) {
        return new DisplayCutout(rect, list);
    }

    /* JADX INFO: renamed from: b */
    public static List<Rect> m371b(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* JADX INFO: renamed from: c */
    public static int m372c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: d */
    public static int m373d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: e */
    public static int m374e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: f */
    public static int m375f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
