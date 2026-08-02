package p000;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: z9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0954z9 {

    /* JADX INFO: renamed from: a */
    public final PathMeasure f13787a;

    public C0954z9(PathMeasure pathMeasure) {
        this.f13787a = pathMeasure;
    }

    /* JADX INFO: renamed from: a */
    public final void m6401a(float f, float f2, C0915y9 c0915y9) {
        if (c0915y9 == null) {
            c80.m676t("Unable to obtain android.graphics.Path");
        } else {
            this.f13787a.getSegment(f, f2, c0915y9.f13365a, true);
        }
    }
}
