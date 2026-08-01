package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jl implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final android.view.View d;
    public defpackage.il e;
    public defpackage.il f;
    public boolean g;
    public int h;
    public final int[] i;

    public jl(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.i = r1
            r2.d = r3
            r1 = 1
            r3.setLongClickable(r1)
            r3.addOnAttachStateChangeListener(r2)
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            float r3 = (float) r3
            r2.a = r3
            int r3 = android.view.ViewConfiguration.getTapTimeout()
            r2.b = r3
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r1 = r1 + r3
            int r1 = r1 / r0
            r2.c = r1
            return
    }

    public final void a() {
            r2 = this;
            il r0 = r2.f
            android.view.View r1 = r2.d
            if (r0 == 0) goto L9
            r1.removeCallbacks(r0)
        L9:
            il r0 = r2.e
            if (r0 == 0) goto L10
            r1.removeCallbacks(r0)
        L10:
            return
    }

    public abstract defpackage.r30 b();

    public abstract boolean c();

    public boolean d() {
            r2 = this;
            r30 r0 = r2.b()
            if (r0 == 0) goto Lf
            boolean r1 = r0.b()
            if (r1 == 0) goto Lf
            r0.dismiss()
        Lf:
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
            r12 = this;
            boolean r13 = r12.g
            r0 = 3
            android.view.View r1 = r12.d
            r2 = 0
            r3 = 1
            if (r13 == 0) goto L68
            r30 r4 = r12.b()
            if (r4 == 0) goto L5c
            boolean r5 = r4.b()
            if (r5 != 0) goto L16
            goto L5c
        L16:
            kh r4 = r4.j()
            if (r4 == 0) goto L5c
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L23
            goto L5c
        L23:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r14)
            int[] r6 = r12.i
            r1.getLocationOnScreen(r6)
            r1 = r6[r2]
            float r1 = (float) r1
            r7 = r6[r3]
            float r7 = (float) r7
            r5.offsetLocation(r1, r7)
            r4.getLocationOnScreen(r6)
            r1 = r6[r2]
            int r1 = -r1
            float r1 = (float) r1
            r6 = r6[r3]
            int r6 = -r6
            float r6 = (float) r6
            r5.offsetLocation(r1, r6)
            int r1 = r12.h
            boolean r1 = r4.b(r5, r1)
            r5.recycle()
            int r14 = r14.getActionMasked()
            if (r14 == r3) goto L56
            if (r14 == r0) goto L56
            r14 = r3
            goto L57
        L56:
            r14 = r2
        L57:
            if (r1 == 0) goto L5c
            if (r14 == 0) goto L5c
            goto L62
        L5c:
            boolean r14 = r12.d()
            if (r14 != 0) goto L65
        L62:
            r14 = r3
            goto L113
        L65:
            r14 = r2
            goto L113
        L68:
            boolean r4 = r1.isEnabled()
            if (r4 != 0) goto L70
            goto Lfd
        L70:
            int r4 = r14.getActionMasked()
            if (r4 == 0) goto Lcf
            if (r4 == r3) goto Lcb
            r5 = 2
            if (r4 == r5) goto L7f
            if (r4 == r0) goto Lcb
            goto Lfd
        L7f:
            int r0 = r12.h
            int r0 = r14.findPointerIndex(r0)
            if (r0 < 0) goto Lfd
            float r4 = r14.getX(r0)
            float r14 = r14.getY(r0)
            float r0 = r12.a
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto Lb9
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto Lb9
            int r5 = r1.getRight()
            int r6 = r1.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto Lb9
            int r4 = r1.getBottom()
            int r5 = r1.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto Lb9
            goto Lfd
        Lb9:
            r12.a()
            android.view.ViewParent r14 = r1.getParent()
            r14.requestDisallowInterceptTouchEvent(r3)
            boolean r14 = r12.c()
            if (r14 == 0) goto Lfd
            r14 = r3
            goto Lfe
        Lcb:
            r12.a()
            goto Lfd
        Lcf:
            int r14 = r14.getPointerId(r2)
            r12.h = r14
            il r14 = r12.e
            if (r14 != 0) goto Le1
            il r14 = new il
            r0 = 0
            r14.<init>(r12, r0)
            r12.e = r14
        Le1:
            il r14 = r12.e
            int r0 = r12.b
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
            il r14 = r12.f
            if (r14 != 0) goto Lf5
            il r14 = new il
            r0 = 1
            r14.<init>(r12, r0)
            r12.f = r14
        Lf5:
            il r14 = r12.f
            int r0 = r12.c
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
        Lfd:
            r14 = r2
        Lfe:
            if (r14 == 0) goto L113
            long r4 = android.os.SystemClock.uptimeMillis()
            r10 = 0
            r11 = 0
            r8 = 3
            r9 = 0
            r6 = r4
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r1.onTouchEvent(r0)
            r0.recycle()
        L113:
            r12.g = r14
            if (r14 != 0) goto L11b
            if (r13 == 0) goto L11a
            goto L11b
        L11a:
            return r2
        L11b:
            return r3
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            r2 = 0
            r1.g = r2
            r2 = -1
            r1.h = r2
            il r2 = r1.e
            if (r2 == 0) goto Lf
            android.view.View r0 = r1.d
            r0.removeCallbacks(r2)
        Lf:
            return
    }
}
