package p212o1;

import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: renamed from: o1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2768a {
    /* JADX INFO: renamed from: a */
    public static Handler m4956a(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* JADX INFO: renamed from: b */
    public static List m4957b(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* JADX INFO: renamed from: c */
    public static int m4958c(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* JADX INFO: renamed from: d */
    public static int m4959d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: e */
    public static int m4960e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: f */
    public static int m4961f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: g */
    public static int m4962g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
