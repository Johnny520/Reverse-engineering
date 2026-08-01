package defpackage;

/* JADX INFO: renamed from: ᛱᛱᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0027 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.RunnableC1335 f483;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final int[] f484;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f485;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f486;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f487;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final float f488;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f489;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final android.view.View f490;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.RunnableC1335 f491;

    public AbstractViewOnTouchListenerC0027(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.f484 = r1
            r2.f490 = r3
            r1 = 1
            r3.setLongClickable(r1)
            r3.addOnAttachStateChangeListener(r2)
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            float r3 = (float) r3
            r2.f488 = r3
            int r3 = android.view.ViewConfiguration.getTapTimeout()
            r2.f487 = r3
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r1 = r1 + r3
            int r1 = r1 / r0
            r2.f486 = r1
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
            r12 = this;
            boolean r13 = r12.f485
            r0 = 3
            android.view.View r1 = r12.f490
            r2 = 0
            r3 = 1
            if (r13 == 0) goto L68
            ᲇᲁᛲᲀ r4 = r12.mo336()
            if (r4 == 0) goto L5c
            boolean r5 = r4.mo2605()
            if (r5 != 0) goto L16
            goto L5c
        L16:
            ᛲᲈᲁᛸ r4 = r4.mo2603()
            if (r4 == 0) goto L5c
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L23
            goto L5c
        L23:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r14)
            int[] r6 = r12.f484
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
            int r1 = r12.f489
            boolean r1 = r4.m1160(r5, r1)
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
            boolean r14 = r12.mo333()
            if (r14 != 0) goto L65
        L62:
            r14 = r3
            goto L10d
        L65:
            r14 = r2
            goto L10d
        L68:
            boolean r4 = r1.isEnabled()
            if (r4 != 0) goto L70
            goto Lf7
        L70:
            int r4 = r14.getActionMasked()
            if (r4 == 0) goto Lcf
            if (r4 == r3) goto Lcb
            r5 = 2
            if (r4 == r5) goto L7f
            if (r4 == r0) goto Lcb
            goto Lf7
        L7f:
            int r0 = r12.f489
            int r0 = r14.findPointerIndex(r0)
            if (r0 < 0) goto Lf7
            float r4 = r14.getX(r0)
            float r14 = r14.getY(r0)
            float r0 = r12.f488
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
            goto Lf7
        Lb9:
            r12.m335()
            android.view.ViewParent r14 = r1.getParent()
            r14.requestDisallowInterceptTouchEvent(r3)
            boolean r14 = r12.mo334()
            if (r14 == 0) goto Lf7
            r14 = r3
            goto Lf8
        Lcb:
            r12.m335()
            goto Lf7
        Lcf:
            int r14 = r14.getPointerId(r2)
            r12.f489 = r14
            ᛷᛸᛶᛵ r14 = r12.f491
            if (r14 != 0) goto Le0
            ᛷᛸᛶᛵ r14 = new ᛷᛸᛶᛵ
            r14.<init>(r12, r2)
            r12.f491 = r14
        Le0:
            int r0 = r12.f487
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
            ᛷᛸᛶᛵ r14 = r12.f483
            if (r14 != 0) goto Lf1
            ᛷᛸᛶᛵ r14 = new ᛷᛸᛶᛵ
            r14.<init>(r12, r3)
            r12.f483 = r14
        Lf1:
            int r0 = r12.f486
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
        Lf7:
            r14 = r2
        Lf8:
            if (r14 == 0) goto L10d
            long r4 = android.os.SystemClock.uptimeMillis()
            r10 = 0
            r11 = 0
            r8 = 3
            r9 = 0
            r6 = r4
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r1.onTouchEvent(r0)
            r0.recycle()
        L10d:
            r12.f485 = r14
            if (r14 != 0) goto L115
            if (r13 == 0) goto L114
            goto L115
        L114:
            return r2
        L115:
            return r3
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.f485 = r1
            r1 = -1
            r0.f489 = r1
            ᛷᛸᛶᛵ r1 = r0.f491
            if (r1 == 0) goto Lf
            android.view.View r0 = r0.f490
            r0.removeCallbacks(r1)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean mo333() {
            r1 = this;
            ᲇᲁᛲᲀ r1 = r1.mo336()
            if (r1 == 0) goto Lf
            boolean r0 = r1.mo2605()
            if (r0 == 0) goto Lf
            r1.dismiss()
        Lf:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public abstract boolean mo334();

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m335() {
            r2 = this;
            ᛷᛸᛶᛵ r0 = r2.f483
            android.view.View r1 = r2.f490
            if (r0 == 0) goto L9
            r1.removeCallbacks(r0)
        L9:
            ᛷᛸᛶᛵ r2 = r2.f491
            if (r2 == 0) goto L10
            r1.removeCallbacks(r2)
        L10:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public abstract defpackage.InterfaceC2128 mo336();
}
