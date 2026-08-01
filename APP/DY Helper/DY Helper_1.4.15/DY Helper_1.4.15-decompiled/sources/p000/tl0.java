package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tl0 implements android.view.GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.ul0 f10410;

    public tl0(p000.ul0 r1) {
            r0 = this;
            r0.<init>()
            r0.f10410 = r1
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent r3, android.view.MotionEvent r4, float r5, float r6) {
            r2 = this;
            ul0 r2 = r2.f10410
            b1 r3 = r2.f10907
            boolean r4 = r2.f10909
            r0 = 1
            if (r4 == 0) goto La
            goto L45
        La:
            int r2 = r2.f10908
            r4 = 0
            r1 = 2
            if (r2 != r0) goto L2a
            float r2 = java.lang.Math.abs(r5)
            float r6 = java.lang.Math.abs(r6)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L45
            int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r2 <= 0) goto L21
            r1 = r0
        L21:
            q40 r2 = new q40
            r2.<init>(r1)
            r3.invoke(r2)
            return r0
        L2a:
            if (r2 != r1) goto L45
            float r2 = java.lang.Math.abs(r6)
            float r5 = java.lang.Math.abs(r5)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L45
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L3d
            r1 = r0
        L3d:
            q40 r2 = new q40
            r2.<init>(r1)
            r3.invoke(r2)
        L45:
            return r0
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent r1) {
            r0 = this;
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4) {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent r1) {
            r0 = this;
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent r1) {
            r0 = this;
            r0 = 1
            return r0
    }
}
