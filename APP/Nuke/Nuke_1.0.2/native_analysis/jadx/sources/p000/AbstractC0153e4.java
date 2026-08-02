package p000;

import android.graphics.Insets;
import android.util.CloseGuard;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: e4 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0153e4 {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ CloseGuard m1228g() {
        return new CloseGuard();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ CloseGuard m1229h(Object obj) {
        return (CloseGuard) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m1230i(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ WindowInsetsAnimation m1231j(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m1235n() {
    }
}
