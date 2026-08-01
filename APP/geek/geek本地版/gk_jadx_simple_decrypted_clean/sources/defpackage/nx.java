package defpackage;

import android.graphics.Path;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class nx {
    public static PathInterpolator a(float r1, float r2) {
        return new PathInterpolator(r1, r2);
    }

    public static PathInterpolator b(float r1, float r2, float r3, float r4) {
        return new PathInterpolator(r1, r2, r3, r4);
    }

    public static PathInterpolator c(Path r1) {
        return new PathInterpolator(r1);
    }
}
