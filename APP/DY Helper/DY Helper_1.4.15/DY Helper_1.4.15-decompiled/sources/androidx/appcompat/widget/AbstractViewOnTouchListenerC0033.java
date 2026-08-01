package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.ζ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0033 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ε */
    public final float f817;

    /* JADX INFO: renamed from: ζ */
    public final int f818;

    /* JADX INFO: renamed from: η */
    public final int f819;

    /* JADX INFO: renamed from: θ */
    public final android.view.View f820;

    /* JADX INFO: renamed from: ι */
    public p000.i60 f821;

    /* JADX INFO: renamed from: κ */
    public p000.i60 f822;

    /* JADX INFO: renamed from: λ */
    public boolean f823;

    /* JADX INFO: renamed from: μ */
    public int f824;

    /* JADX INFO: renamed from: ν */
    public final int[] f825;

    public AbstractViewOnTouchListenerC0033(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.f825 = r1
            r2.f820 = r3
            r1 = 1
            r3.setLongClickable(r1)
            r3.addOnAttachStateChangeListener(r2)
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            float r3 = (float) r3
            r2.f817 = r3
            int r3 = android.view.ViewConfiguration.getTapTimeout()
            r2.f818 = r3
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r1 = r1 + r3
            int r1 = r1 / r0
            r2.f819 = r1
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
            r12 = this;
            boolean r13 = r12.f823
            r0 = 3
            android.view.View r1 = r12.f820
            r2 = 0
            r3 = 1
            if (r13 == 0) goto L6a
            ew1 r4 = r12.mo317()
            if (r4 == 0) goto L5e
            boolean r5 = r4.mo340()
            if (r5 != 0) goto L16
            goto L5e
        L16:
            android.widget.ListView r4 = r4.mo344()
            androidx.appcompat.widget.DropDownListView r4 = (androidx.appcompat.widget.DropDownListView) r4
            if (r4 == 0) goto L5e
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L25
            goto L5e
        L25:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r14)
            int[] r6 = r12.f825
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
            int r1 = r12.f824
            boolean r1 = r4.m274(r5, r1)
            r5.recycle()
            int r14 = r14.getActionMasked()
            if (r14 == r3) goto L58
            if (r14 == r0) goto L58
            r14 = r3
            goto L59
        L58:
            r14 = r2
        L59:
            if (r1 == 0) goto L5e
            if (r14 == 0) goto L5e
            goto L64
        L5e:
            boolean r14 = r12.mo319()
            if (r14 != 0) goto L67
        L64:
            r14 = r3
            goto L115
        L67:
            r14 = r2
            goto L115
        L6a:
            boolean r4 = r1.isEnabled()
            if (r4 != 0) goto L72
            goto Lff
        L72:
            int r4 = r14.getActionMasked()
            if (r4 == 0) goto Ld1
            if (r4 == r3) goto Lcd
            r5 = 2
            if (r4 == r5) goto L81
            if (r4 == r0) goto Lcd
            goto Lff
        L81:
            int r0 = r12.f824
            int r0 = r14.findPointerIndex(r0)
            if (r0 < 0) goto Lff
            float r4 = r14.getX(r0)
            float r14 = r14.getY(r0)
            float r0 = r12.f817
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto Lbb
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto Lbb
            int r5 = r1.getRight()
            int r6 = r1.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto Lbb
            int r4 = r1.getBottom()
            int r5 = r1.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto Lbb
            goto Lff
        Lbb:
            r12.m338()
            android.view.ViewParent r14 = r1.getParent()
            r14.requestDisallowInterceptTouchEvent(r3)
            boolean r14 = r12.mo318()
            if (r14 == 0) goto Lff
            r14 = r3
            goto L100
        Lcd:
            r12.m338()
            goto Lff
        Ld1:
            int r14 = r14.getPointerId(r2)
            r12.f824 = r14
            i60 r14 = r12.f821
            if (r14 != 0) goto Le3
            i60 r14 = new i60
            r0 = 0
            r14.<init>(r12, r0)
            r12.f821 = r14
        Le3:
            i60 r14 = r12.f821
            int r0 = r12.f818
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
            i60 r14 = r12.f822
            if (r14 != 0) goto Lf7
            i60 r14 = new i60
            r0 = 1
            r14.<init>(r12, r0)
            r12.f822 = r14
        Lf7:
            i60 r14 = r12.f822
            int r0 = r12.f819
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
        Lff:
            r14 = r2
        L100:
            if (r14 == 0) goto L115
            long r4 = android.os.SystemClock.uptimeMillis()
            r10 = 0
            r11 = 0
            r8 = 3
            r9 = 0
            r6 = r4
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r1.onTouchEvent(r0)
            r0.recycle()
        L115:
            r12.f823 = r14
            if (r14 != 0) goto L11d
            if (r13 == 0) goto L11c
            goto L11d
        L11c:
            return r2
        L11d:
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
            r0.f823 = r1
            r1 = -1
            r0.f824 = r1
            i60 r1 = r0.f821
            if (r1 == 0) goto Lf
            android.view.View r0 = r0.f820
            r0.removeCallbacks(r1)
        Lf:
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m338() {
            r2 = this;
            i60 r0 = r2.f822
            android.view.View r1 = r2.f820
            if (r0 == 0) goto L9
            r1.removeCallbacks(r0)
        L9:
            i60 r2 = r2.f821
            if (r2 == 0) goto L10
            r1.removeCallbacks(r2)
        L10:
            return
    }

    /* JADX INFO: renamed from: β */
    public abstract p000.ew1 mo317();

    /* JADX INFO: renamed from: γ */
    public abstract boolean mo318();

    /* JADX INFO: renamed from: δ */
    public boolean mo319() {
            r1 = this;
            ew1 r1 = r1.mo317()
            if (r1 == 0) goto Lf
            boolean r0 = r1.mo340()
            if (r0 == 0) goto Lf
            r1.dismiss()
        Lf:
            r1 = 1
            return r1
    }
}
