package p010F;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: renamed from: F.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0196a {
    /* JADX INFO: renamed from: a */
    public static Interpolator m566a(float f2, float f3) {
        return new PathInterpolator(f2, f3);
    }

    /* JADX INFO: renamed from: b */
    public static Interpolator m567b(float f2, float f3, float f4, float f5) {
        return new PathInterpolator(f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: c */
    public static Interpolator m568c(Path path) {
        return new PathInterpolator(path);
    }
}
