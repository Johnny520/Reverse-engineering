package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: et */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0199et {
    /* JADX INFO: renamed from: a */
    public static int m1069a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    /* JADX INFO: renamed from: b */
    public static int m1070b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    /* JADX INFO: renamed from: c */
    public static int m1071c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1072d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    /* JADX INFO: renamed from: e */
    public static void m1073e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }

    /* JADX INFO: renamed from: f */
    public static void m1074f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: g */
    public static void m1075g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    /* JADX INFO: renamed from: h */
    public static void m1076h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }
}
