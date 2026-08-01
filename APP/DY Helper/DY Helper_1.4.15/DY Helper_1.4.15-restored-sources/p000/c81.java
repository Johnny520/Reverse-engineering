package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c81 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.d81 f1990;

    public c81(p000.d81 r1) {
            r0 = this;
            r0.f1990 = r1
            r0.<init>()
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent r1) {
            r0 = this;
            r1.getClass()
            r0 = 1
            return r0
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent r2, android.view.MotionEvent r3, float r4, float r5) {
            r1 = this;
            r3.getClass()
            if (r2 != 0) goto L6
            goto L42
        L6:
            float r3 = r3.getX()
            float r2 = r2.getX()
            float r3 = r3 - r2
            float r2 = java.lang.Math.abs(r3)
            r5 = 48
            d81 r1 = r1.f1990
            android.app.Activity r0 = r1.f2948
            int r5 = p000.jx0.m3056(r0, r5)
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L42
            float r2 = java.lang.Math.abs(r4)
            r4 = 1135542272(0x43af0000, float:350.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L2d
            goto L42
        L2d:
            r2 = 0
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            int r3 = r1.f2958
            if (r2 >= 0) goto L3b
            int r3 = r3 + 1
            boolean r1 = r1.m1671(r3)
            return r1
        L3b:
            int r3 = r3 + (-1)
            boolean r1 = r1.m1671(r3)
            return r1
        L42:
            r1 = 0
            return r1
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent r1) {
            r0 = this;
            r1.getClass()
            d81 r0 = r0.f1990
            android.view.View r0 = r0.f2960
            if (r0 == 0) goto Lc
            r0.performLongClick()
        Lc:
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent r1) {
            r0 = this;
            r1.getClass()
            d81 r0 = r0.f1990
            android.view.View r0 = r0.f2960
            if (r0 == 0) goto L11
            boolean r0 = r0.performClick()
            r1 = 1
            if (r0 != r1) goto L11
            return r1
        L11:
            r0 = 0
            return r0
    }
}
