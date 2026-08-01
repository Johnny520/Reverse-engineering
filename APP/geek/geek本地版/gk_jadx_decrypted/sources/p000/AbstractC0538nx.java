package p000;

import android.graphics.Path;
import android.view.animation.PathInterpolator;

/* JADX INFO: renamed from: nx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0538nx {
    /* JADX INFO: renamed from: a */
    public static PathInterpolator m1949a(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static PathInterpolator m1950b(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: c */
    public static PathInterpolator m1951c(Path path) {
        return new PathInterpolator(path);
    }
}
