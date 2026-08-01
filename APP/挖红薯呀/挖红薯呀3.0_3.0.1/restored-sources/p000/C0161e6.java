package p000;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: e6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0161e6 {

    /* JADX INFO: renamed from: a */
    public final PathMeasure f1303a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0161e6(PathMeasure pathMeasure) {
        this.f1303a = pathMeasure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m788a(float f, float f2, C0118d6 c0118d6) {
        if (c0118d6 == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f1303a.getSegment(f, f2, c0118d6.f973a, true);
    }
}
