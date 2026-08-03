package p000;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: S */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0773S {
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m1577h(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ WindowInsetsAnimation m1578i(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m1579j(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m1582m() {
    }
}
