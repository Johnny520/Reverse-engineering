package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends android.view.View {
    public final android.animation.ValueAnimator a;
    public boolean b;
    public final java.util.ArrayList c;
    public final int d;
    public final float e;
    public final android.graphics.Paint f;
    public final android.graphics.RectF g;
    public final int h;
    public float i;
    public boolean j;
    public double k;
    public int l;
    public int m;

    public ClockHandView(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r0 = 2130969286(0x7f0402c6, float:1.754725E38)
            r6.<init>(r7, r8, r0)
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r6.a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.c = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r6.f = r1
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.g = r2
            r2 = 1
            r6.m = r2
            int[] r3 = defpackage.wy.e
            r4 = 2131821646(0x7f11044e, float:1.9276041E38)
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r3, r0, r4)
            r0 = 2130969335(0x7f0402f7, float:1.7547349E38)
            r3 = 200(0xc8, float:2.8E-43)
            defpackage.ct.v(r7, r0, r3)
            r0 = 2130969351(0x7f040307, float:1.7547381E38)
            tj r3 = defpackage.q2.b
            defpackage.ct.w(r7, r0, r3)
            r0 = 0
            int r3 = r8.getDimensionPixelSize(r2, r0)
            r6.l = r3
            r3 = 2
            int r4 = r8.getDimensionPixelSize(r3, r0)
            r6.d = r4
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131165731(0x7f070223, float:1.7945687E38)
            int r5 = r4.getDimensionPixelSize(r5)
            r6.h = r5
            r5 = 2131165729(0x7f070221, float:1.7945683E38)
            int r4 = r4.getDimensionPixelSize(r5)
            float r4 = (float) r4
            r6.e = r4
            int r0 = r8.getColor(r0, r0)
            r1.setAntiAlias(r2)
            r1.setColor(r0)
            r0 = 0
            r6.b(r0)
            android.view.ViewConfiguration r7 = android.view.ViewConfiguration.get(r7)
            r7.getScaledTouchSlop()
            java.util.WeakHashMap r7 = defpackage.ja0.a
            defpackage.s90.s(r6, r3)
            r8.recycle()
            return
    }

    public final int a(int r2) {
            r1 = this;
            r0 = 2
            if (r2 != r0) goto Lf
            int r2 = r1.l
            float r2 = (float) r2
            r0 = 1059648963(0x3f28f5c3, float:0.66)
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            return r2
        Lf:
            int r2 = r1.l
            return r2
    }

    public final void b(float r7) {
            r6 = this;
            android.animation.ValueAnimator r0 = r6.a
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 1135869952(0x43b40000, float:360.0)
            float r7 = r7 % r0
            r6.i = r7
            r0 = 1119092736(0x42b40000, float:90.0)
            float r0 = r7 - r0
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            r6.k = r0
            int r0 = r6.getHeight()
            int r0 = r0 / 2
            int r1 = r6.getWidth()
            int r1 = r1 / 2
            int r2 = r6.m
            int r2 = r6.a(r2)
            float r1 = (float) r1
            float r2 = (float) r2
            double r3 = r6.k
            double r3 = java.lang.Math.cos(r3)
            float r3 = (float) r3
            float r3 = r3 * r2
            float r3 = r3 + r1
            float r0 = (float) r0
            double r4 = r6.k
            double r4 = java.lang.Math.sin(r4)
            float r1 = (float) r4
            float r2 = r2 * r1
            float r2 = r2 + r0
            int r0 = r6.d
            float r0 = (float) r0
            float r1 = r3 - r0
            float r4 = r2 - r0
            float r3 = r3 + r0
            float r2 = r2 + r0
            android.graphics.RectF r0 = r6.g
            r0.set(r1, r4, r3, r2)
            java.util.ArrayList r0 = r6.c
            int r1 = r0.size()
            r2 = 0
        L53:
            if (r2 >= r1) goto L73
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            va r3 = (defpackage.va) r3
            com.google.android.material.timepicker.ClockFaceView r3 = (com.google.android.material.timepicker.ClockFaceView) r3
            float r4 = r3.F
            float r4 = r4 - r7
            float r4 = java.lang.Math.abs(r4)
            r5 = 981668463(0x3a83126f, float:0.001)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L53
            r3.F = r7
            r3.f()
            goto L53
        L73:
            r6.invalidate()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            super.onDraw(r14)
            int r0 = r13.getHeight()
            int r0 = r0 / 2
            int r1 = r13.getWidth()
            int r1 = r1 / 2
            int r2 = r13.m
            int r2 = r13.a(r2)
            float r4 = (float) r1
            float r3 = (float) r2
            double r5 = r13.k
            double r5 = java.lang.Math.cos(r5)
            float r5 = (float) r5
            float r5 = r5 * r3
            float r5 = r5 + r4
            r6 = r5
            float r5 = (float) r0
            double r7 = r13.k
            double r7 = java.lang.Math.sin(r7)
            float r7 = (float) r7
            float r3 = r3 * r7
            float r3 = r3 + r5
            r7 = 0
            android.graphics.Paint r8 = r13.f
            r8.setStrokeWidth(r7)
            int r7 = r13.d
            float r9 = (float) r7
            r14.drawCircle(r6, r3, r9, r8)
            double r9 = r13.k
            double r9 = java.lang.Math.sin(r9)
            double r11 = r13.k
            double r11 = java.lang.Math.cos(r11)
            int r2 = r2 - r7
            float r2 = (float) r2
            double r2 = (double) r2
            double r11 = r11 * r2
            int r6 = (int) r11
            int r1 = r1 + r6
            float r6 = (float) r1
            double r2 = r2 * r9
            int r1 = (int) r2
            int r0 = r0 + r1
            float r7 = (float) r0
            int r0 = r13.h
            float r0 = (float) r0
            r8.setStrokeWidth(r0)
            r3 = r14
            r3.drawLine(r4, r5, r6, r7, r8)
            float r14 = r13.e
            r3.drawCircle(r4, r5, r14, r8)
            return
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r1 = r0
            android.animation.ValueAnimator r2 = r1.a
            boolean r2 = r2.isRunning()
            if (r2 != 0) goto L11
            float r2 = r1.i
            r0.b(r2)
        L11:
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            int r0 = r10.getActionMasked()
            float r1 = r10.getX()
            float r10 = r10.getY()
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L59
            if (r0 == r3) goto L18
            if (r0 == r2) goto L18
            r0 = r4
            r5 = r0
            goto L5d
        L18:
            boolean r0 = r9.j
            boolean r5 = r9.b
            if (r5 == 0) goto L57
            int r5 = r9.getWidth()
            int r5 = r5 / r2
            int r6 = r9.getHeight()
            int r6 = r6 / r2
            float r5 = (float) r5
            float r6 = (float) r6
            float r5 = r1 - r5
            float r6 = r10 - r6
            double r7 = (double) r5
            double r5 = (double) r6
            double r5 = java.lang.Math.hypot(r7, r5)
            float r5 = (float) r5
            int r6 = r9.a(r2)
            android.content.Context r7 = r9.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 12
            float r8 = (float) r8
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = android.util.TypedValue.applyDimension(r3, r8, r7)
            float r6 = (float) r6
            float r6 = r6 + r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L54
            r5 = r2
            goto L55
        L54:
            r5 = r3
        L55:
            r9.m = r5
        L57:
            r5 = r4
            goto L5d
        L59:
            r9.j = r4
            r5 = r3
            r0 = r4
        L5d:
            boolean r6 = r9.j
            int r7 = r9.getWidth()
            int r7 = r7 / r2
            int r8 = r9.getHeight()
            int r8 = r8 / r2
            float r2 = (float) r7
            float r1 = r1 - r2
            double r1 = (double) r1
            float r7 = (float) r8
            float r10 = r10 - r7
            double r7 = (double) r10
            double r1 = java.lang.Math.atan2(r7, r1)
            double r1 = java.lang.Math.toDegrees(r1)
            int r10 = (int) r1
            int r1 = r10 + 90
            if (r1 >= 0) goto L7e
            int r1 = r10 + 450
        L7e:
            float r10 = r9.i
            float r1 = (float) r1
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 == 0) goto L87
            r10 = r3
            goto L88
        L87:
            r10 = r4
        L88:
            if (r5 == 0) goto L8e
            if (r10 == 0) goto L8e
        L8c:
            r4 = r3
            goto L96
        L8e:
            if (r10 != 0) goto L92
            if (r0 == 0) goto L96
        L92:
            r9.b(r1)
            goto L8c
        L96:
            r10 = r6 | r4
            r9.j = r10
            return r3
    }
}
