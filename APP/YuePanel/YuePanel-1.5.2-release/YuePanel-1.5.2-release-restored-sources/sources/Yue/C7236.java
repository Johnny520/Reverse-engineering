package Yue;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7236 {
    /* JADX INFO: renamed from: ۥ */
    public static boolean m3520(@InterfaceC6391 ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m3521(Object obj) {
        return m3520((ScaleGestureDetector) obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m22643(@InterfaceC6391 ScaleGestureDetector scaleGestureDetector, boolean z) {
        scaleGestureDetector.setQuickScaleEnabled(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m22644(Object obj, boolean z) {
        m22643((ScaleGestureDetector) obj, z);
    }
}
