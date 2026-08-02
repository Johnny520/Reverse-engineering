package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z9 {
    public final PathMeasure a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z9(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(float f, float f2, y9 y9Var) {
        if (y9Var == null) {
            c80.t("Unable to obtain android.graphics.Path");
        } else {
            this.a.getSegment(f, f2, y9Var.a, true);
        }
    }
}
