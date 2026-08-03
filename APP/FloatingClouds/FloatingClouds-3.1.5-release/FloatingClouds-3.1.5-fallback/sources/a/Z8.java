package a;

/* JADX INFO: loaded from: classes.dex */
public final class Z8 implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Dialog f372a;
    public final int b;
    public final int c;

    public Z8(android.app.Dialog r2, android.graphics.Rect r3) {
            r1 = this;
            r1.<init>()
            r1.f372a = r2
            int r0 = r3.left
            r1.b = r0
            int r3 = r3.top
            r1.c = r3
            android.content.Context r2 = r2.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            r2.getScaledWindowTouchSlop()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r6.findViewById(r0)
            int r1 = r0.getLeft()
            int r2 = r5.b
            int r1 = r1 + r2
            int r2 = r0.getWidth()
            int r2 = r2 + r1
            int r3 = r5.c
            int r4 = r0.getTop()
            int r4 = r4 + r3
            int r0 = r0.getHeight()
            int r0 = r0 + r4
            android.graphics.RectF r3 = new android.graphics.RectF
            float r1 = (float) r1
            float r4 = (float) r4
            float r2 = (float) r2
            float r0 = (float) r0
            r3.<init>(r1, r4, r2, r0)
            float r0 = r7.getX()
            float r1 = r7.getY()
            boolean r0 = r3.contains(r0, r1)
            if (r0 == 0) goto L38
            r6 = 0
            return r6
        L38:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r7)
            int r7 = r7.getAction()
            r1 = 1
            if (r7 != r1) goto L47
            r7 = 4
            r0.setAction(r7)
        L47:
            r6.performClick()
            android.app.Dialog r6 = r5.f372a
            boolean r6 = r6.onTouchEvent(r0)
            return r6
    }
}
