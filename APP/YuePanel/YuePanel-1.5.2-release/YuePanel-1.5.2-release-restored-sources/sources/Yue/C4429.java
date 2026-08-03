package Yue;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4429 {

    /* JADX INFO: renamed from: ۥ */
    public final DisplayCutout f892;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟۠$ۥ */
    @InterfaceC7113(28)
    public static class C0406 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static DisplayCutout m1384(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static List<Rect> m1385(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m12897(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static int m12898(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static int m12899(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static int m12900(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟۠$ۥ۟ */
    @InterfaceC7113(29)
    public static class C0407 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static DisplayCutout m1386(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟۠$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C4430 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static DisplayCutout m1387(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Insets m1388(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4429(@InterfaceC6490 Rect rect, @InterfaceC6490 List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? C0406.m1384(rect, list) : null);
    }

    /* JADX INFO: renamed from: ۥ */
    public static DisplayCutout m1382(@InterfaceC6391 C5450 c5450, @InterfaceC6490 Rect rect, @InterfaceC6490 Rect rect2, @InterfaceC6490 Rect rect3, @InterfaceC6490 Rect rect4, @InterfaceC6391 C5450 c54502) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C4430.m1387(c5450.m16963(), rect, rect2, rect3, rect4, c54502.m16963());
        }
        if (i >= 29) {
            return C0407.m1386(c5450.m16963(), rect, rect2, rect3, rect4);
        }
        if (i < 28) {
            return null;
        }
        Rect rect5 = new Rect(c5450.f1520, c5450.f1521, c5450.f13399, c5450.f13400);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return C0406.m1384(rect5, arrayList);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static C4429 m12890(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C4429(displayCutout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4429.class != obj.getClass()) {
            return false;
        }
        return C6499.m2995(this.f892, ((C4429) obj).f892);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f892;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @InterfaceC6391
    public String toString() {
        return "DisplayCutoutCompat{" + this.f892 + "}";
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public List<Rect> m1383() {
        return Build.VERSION.SDK_INT >= 28 ? C0406.m1385(this.f892) : Collections.emptyList();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m12891() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0406.m12897(this.f892);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m12892() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0406.m12898(this.f892);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m12893() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0406.m12899(this.f892);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m12894() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0406.m12900(this.f892);
        }
        return 0;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C5450 m12895() {
        return Build.VERSION.SDK_INT >= 30 ? C5450.m16961(C4430.m1388(this.f892)) : C5450.f13398;
    }

    @InterfaceC7113(28)
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public DisplayCutout m12896() {
        return this.f892;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4429(@InterfaceC6391 C5450 c5450, @InterfaceC6490 Rect rect, @InterfaceC6490 Rect rect2, @InterfaceC6490 Rect rect3, @InterfaceC6490 Rect rect4, @InterfaceC6391 C5450 c54502) {
        this(m1382(c5450, rect, rect2, rect3, rect4, c54502));
    }

    public C4429(DisplayCutout displayCutout) {
        this.f892 = displayCutout;
    }
}
