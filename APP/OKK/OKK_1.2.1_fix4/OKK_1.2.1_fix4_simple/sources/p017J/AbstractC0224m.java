package p017J;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: J.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0224m {
    /* JADX INFO: renamed from: a */
    public static boolean m612a(PopupWindow r02) {
        return r02.getOverlapAnchor();
    }

    /* JADX INFO: renamed from: b */
    public static int m613b(PopupWindow r02) {
        return r02.getWindowLayoutType();
    }

    /* JADX INFO: renamed from: c */
    public static void m614c(PopupWindow r02, boolean r1) {
        r02.setOverlapAnchor(r1);
    }

    /* JADX INFO: renamed from: d */
    public static void m615d(PopupWindow r02, int r1) {
        r02.setWindowLayoutType(r1);
    }
}
