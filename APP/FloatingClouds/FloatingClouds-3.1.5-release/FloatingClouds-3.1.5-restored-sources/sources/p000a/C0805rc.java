package p000a;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: renamed from: a.rc */
/* JADX INFO: loaded from: classes.dex */
public final class C0805rc {
    /* JADX INFO: renamed from: a */
    public static Interpolator m1881a(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static Interpolator m1882b(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: c */
    public static Interpolator m1883c(Path path) {
        return new PathInterpolator(path);
    }
}
