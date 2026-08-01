package p211o0;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: o0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2751j {

    /* JADX INFO: renamed from: a */
    public final PathMeasure f8745a;

    public C2751j(PathMeasure pathMeasure) {
        this.f8745a = pathMeasure;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4884a(float f2, float f5, C2750i c2750i) {
        if (c2750i == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f8745a.getSegment(f2, f5, c2750i.f8742a, true);
    }
}
