package p010F;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: renamed from: F.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0196a {
    /* JADX INFO: renamed from: a */
    public static Interpolator m566a(float r1, float r2) {
        return new PathInterpolator(r1, r2);
    }

    /* JADX INFO: renamed from: b */
    public static Interpolator m567b(float r1, float r2, float r3, float r4) {
        return new PathInterpolator(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: c */
    public static Interpolator m568c(Path r1) {
        return new PathInterpolator(r1);
    }
}
