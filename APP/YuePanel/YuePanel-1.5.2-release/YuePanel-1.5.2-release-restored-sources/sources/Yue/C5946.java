package Yue;

import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C5946 {
    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public static int m2608(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public static int m2609(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m18699(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m18700(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m18701(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m18702(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m18703(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m18704(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }
}
