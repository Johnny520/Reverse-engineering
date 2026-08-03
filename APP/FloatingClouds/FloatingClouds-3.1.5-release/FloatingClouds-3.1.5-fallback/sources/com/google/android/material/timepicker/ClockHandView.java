package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends android.view.View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.animation.ValueAnimator f1103a;
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

    public interface a {
        void a(float r1);
    }

    public ClockHandView(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            int r0 = com.google.android.material.R.attr.materialClockStyle
            r5.<init>(r6, r7, r0)
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r5.f1103a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.c = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.f = r1
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r5.g = r2
            r2 = 1
            r5.m = r2
            int[] r3 = com.google.android.material.R.styleable.ClockHandView
            int r4 = com.google.android.material.R.style.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r3, r0, r4)
            int r0 = com.google.android.material.R.attr.motionDurationLong2
            r3 = 200(0xc8, float:2.8E-43)
            a.C0445wb.c(r6, r0, r3)
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            a.l6 r3 = a.C0434w0.b
            a.C0445wb.d(r6, r0, r3)
            int r0 = com.google.android.material.R.styleable.ClockHandView_materialCircleRadius
            r3 = 0
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.l = r0
            int r0 = com.google.android.material.R.styleable.ClockHandView_selectorSize
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.d = r0
            android.content.res.Resources r0 = r5.getResources()
            int r4 = com.google.android.material.R.dimen.material_clock_hand_stroke_width
            int r4 = r0.getDimensionPixelSize(r4)
            r5.h = r4
            int r4 = com.google.android.material.R.dimen.material_clock_hand_center_dot_radius
            int r0 = r0.getDimensionPixelSize(r4)
            float r0 = (float) r0
            r5.e = r0
            int r0 = com.google.android.material.R.styleable.ClockHandView_clockHandColor
            int r0 = r7.getColor(r0, r3)
            r1.setAntiAlias(r2)
            r1.setColor(r0)
            r0 = 0
            r5.b(r0)
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            r6.getScaledTouchSlop()
            java.util.WeakHashMap<android.view.View, a.Jg> r6 = a.C0414ug.f721a
            r6 = 2
            r5.setImportantForAccessibility(r6)
            r7.recycle()
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
            android.animation.ValueAnimator r0 = r6.f1103a
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
            java.util.Iterator r0 = r0.iterator()
        L52:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r0.next()
            com.google.android.material.timepicker.ClockHandView$a r1 = (com.google.android.material.timepicker.ClockHandView.a) r1
            r1.a(r7)
            goto L52
        L62:
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
            android.graphics.Paint r8 = r13.f
            r7 = 0
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
            android.animation.ValueAnimator r2 = r1.f1103a
            boolean r2 = r2.isRunning()
            if (r2 != 0) goto L11
            float r2 = r1.i
            r0.b(r2)
        L11:
            return
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
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
