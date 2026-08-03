package p006D;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: D.v */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0130v {
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m444i(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ WindowInsetsAnimation m445j(int i2, Interpolator interpolator, long j2) {
        return new WindowInsetsAnimation(i2, interpolator, j2);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m446k(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m450o() {
    }
}
