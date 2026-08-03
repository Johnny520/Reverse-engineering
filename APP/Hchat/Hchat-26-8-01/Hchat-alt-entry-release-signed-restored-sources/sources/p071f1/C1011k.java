package p071f1;

import android.graphics.PathMeasure;
import p136j8.C2104o;

/* JADX INFO: renamed from: f1.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1011k {

    /* JADX INFO: renamed from: a */
    public final PathMeasure f3196a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1011k(PathMeasure pathMeasure) {
        this.f3196a = pathMeasure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2608a(float f3, float f10, C1009j c1009j) {
        if (c1009j == null) {
            C2104o.m5297w("Unable to obtain android.graphics.Path");
        } else {
            this.f3196a.getSegment(f3, f10, c1009j.f3191a, true);
        }
    }
}
