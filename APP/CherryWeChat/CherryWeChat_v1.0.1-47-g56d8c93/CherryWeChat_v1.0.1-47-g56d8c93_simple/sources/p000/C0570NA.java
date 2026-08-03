package p000;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: NA */
/* JADX INFO: loaded from: classes.dex */
public final class C0570NA extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0613OA f1862a;

    public C0570NA(C0613OA r1) {
        this.f1862a = r1;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector r7) {
        AbstractC0295Gu.m625r(-490824567617589L);
        float r0 = r7.getScaleFactor();
        C0613OA r1 = this.f1862a;
        float r2 = r1.f1964e;
        float r3 = r2 * r0;
        float r4 = r1.f1965f;
        if (r3 >= r4) goto L5;
        r0 = r4 / r2;
        r1.f1964e = r4;
    L9:
        r1.f1960a.postScale(r0, r0, r7.getFocusX(), r7.getFocusY());
        r1.m1190b();
        r1.setImageMatrix(r1.f1960a);
        return true;
    L5:
        float r42 = r1.f1966g;
        if (r3 <= r42) goto L8;
        r0 = r42 / r2;
        r1.f1964e = r42;
        goto L9
    L8:
        r1.f1964e = r3;
        goto L9
    }
}
