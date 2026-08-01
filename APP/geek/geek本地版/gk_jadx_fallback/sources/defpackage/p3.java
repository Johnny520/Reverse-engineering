package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p3 extends androidx.appcompat.widget.ContentFrameLayout {
    public final /* synthetic */ defpackage.r3 i;

    public p3(defpackage.r3 r1, defpackage.kd r2) {
            r0 = this;
            r0.i = r1
            r1 = 0
            r0.<init>(r2, r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            r3 r0 = r1.i
            boolean r0 = r0.u(r2)
            if (r0 != 0) goto L11
            boolean r2 = super.dispatchKeyEvent(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L31
            float r0 = r4.getX()
            int r0 = (int) r0
            float r1 = r4.getY()
            int r1 = (int) r1
            r2 = -5
            if (r0 < r2) goto L25
            if (r1 < r2) goto L25
            int r2 = r3.getWidth()
            int r2 = r2 + 5
            if (r0 > r2) goto L25
            int r0 = r3.getHeight()
            int r0 = r0 + 5
            if (r1 <= r0) goto L31
        L25:
            r4 = 0
            r3 r0 = r3.i
            q3 r4 = r0.z(r4)
            r1 = 1
            r0.s(r4, r1)
            return r1
        L31:
            boolean r4 = super.onInterceptTouchEvent(r4)
            return r4
    }

    @Override // android.view.View
    public final void setBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            r1.setBackgroundDrawable(r2)
            return
    }
}
