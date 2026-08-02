package p000;

import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s90 {
    /* JADX INFO: renamed from: a */
    public static Handler m4771a(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* JADX INFO: renamed from: b */
    public static List m4772b(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* JADX INFO: renamed from: c */
    public static int m4773c(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* JADX INFO: renamed from: d */
    public static int m4774d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: e */
    public static int m4775e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: f */
    public static int m4776f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: g */
    public static int m4777g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
