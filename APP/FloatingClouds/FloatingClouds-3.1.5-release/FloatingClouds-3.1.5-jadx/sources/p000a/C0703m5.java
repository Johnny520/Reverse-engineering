package p000a;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: a.m5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0703m5 {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f2651a;

    /* JADX INFO: renamed from: a.m5$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static DisplayCutout m1595a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* JADX INFO: renamed from: b */
        public static List<Rect> m1596b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* JADX INFO: renamed from: c */
        public static int m1597c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* JADX INFO: renamed from: d */
        public static int m1598d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* JADX INFO: renamed from: e */
        public static int m1599e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* JADX INFO: renamed from: f */
        public static int m1600f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C0703m5(DisplayCutout displayCutout) {
        this.f2651a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0703m5.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2651a, ((C0703m5) obj).f2651a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f2651a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2651a + "}";
    }
}
