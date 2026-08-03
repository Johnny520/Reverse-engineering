package p000;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: NA */
/* JADX INFO: loaded from: classes.dex */
public final class C0570NA extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0613OA f1862a;

    public C0570NA(C0613OA c0613oa) {
        this.f1862a = c0613oa;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        AbstractC0295Gu.m625r(-490824567617589L);
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        C0613OA c0613oa = this.f1862a;
        float f = c0613oa.f1964e;
        float f2 = f * scaleFactor;
        float f3 = c0613oa.f1965f;
        if (f2 < f3) {
            scaleFactor = f3 / f;
            c0613oa.f1964e = f3;
        } else {
            float f4 = c0613oa.f1966g;
            if (f2 > f4) {
                scaleFactor = f4 / f;
                c0613oa.f1964e = f4;
            } else {
                c0613oa.f1964e = f2;
            }
        }
        c0613oa.f1960a.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        c0613oa.m1190b();
        c0613oa.setImageMatrix(c0613oa.f1960a);
        return true;
    }
}
