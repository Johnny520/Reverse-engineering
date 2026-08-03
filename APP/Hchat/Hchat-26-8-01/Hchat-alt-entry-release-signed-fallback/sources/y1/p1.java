package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements android.view.GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1.q1 f22048a;

    public p1(y1.q1 r1) {
            r0 = this;
            r0.<init>()
            r0.f22048a = r1
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent r5, android.view.MotionEvent r6, float r7, float r8) {
            r4 = this;
            y1.q1 r5 = r4.f22048a
            y1.p r6 = r5.f22053a
            boolean r0 = r5.f22055c
            r1 = 1
            if (r0 == 0) goto La
            goto L4c
        La:
            int r5 = r5.f22054b
            r0 = 0
            r2 = 0
            r3 = 2
            if (r5 != r1) goto L2e
            float r5 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L4c
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 <= 0) goto L22
            r3 = r1
        L22:
            y1.t r5 = r6.f22046h
            d1.l r5 = r5.getFocusOwner()
            d1.p r5 = (d1.p) r5
            r5.g(r3, r0)
            return r1
        L2e:
            if (r5 != r3) goto L4c
            float r5 = java.lang.Math.abs(r8)
            float r7 = java.lang.Math.abs(r7)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L4c
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 <= 0) goto L41
            r3 = r1
        L41:
            y1.t r5 = r6.f22046h
            d1.l r5 = r5.getFocusOwner()
            d1.p r5 = (d1.p) r5
            r5.g(r3, r0)
        L4c:
            return r1
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent r1) {
            r0 = this;
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent r1) {
            r0 = this;
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
