package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ljx.wechatmod.R;
import defpackage.ct;
import defpackage.ja0;
import defpackage.q2;
import defpackage.s90;
import defpackage.va;
import defpackage.wy;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {
    public final ValueAnimator a;
    public boolean b;
    public final ArrayList c;
    public final int d;
    public final float e;
    public final Paint f;
    public final RectF g;
    public final int h;
    public float i;
    public boolean j;
    public double k;
    public int l;
    public int m;

    public ClockHandView(Context r7, AttributeSet r8) {
        super(r7, r8, R.attr.materialClockStyle);
        this.a = new ValueAnimator();
        this.c = new ArrayList();
        Paint r1 = new Paint();
        this.f = r1;
        this.g = new RectF();
        this.m = 1;
        TypedArray r82 = r7.obtainStyledAttributes(r8, wy.e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        ct.v(r7, R.attr.motionDurationLong2, 200);
        ct.w(r7, R.attr.motionEasingEmphasizedInterpolator, q2.b);
        this.l = r82.getDimensionPixelSize(1, 0);
        this.d = r82.getDimensionPixelSize(2, 0);
        this.h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int r0 = r82.getColor(0, 0);
        r1.setAntiAlias(true);
        r1.setColor(r0);
        b(0.0f);
        ViewConfiguration.get(r7).getScaledTouchSlop();
        WeakHashMap r72 = ja0.a;
        s90.s(this, 2);
        r82.recycle();
    }

    public final int a(int r2) {
        if (r2 != 2) goto L7;
        return Math.round(this.l * 0.66f);
    L7:
        return this.l;
    }

    public final void b(float r7) {
        ValueAnimator r0 = this.a;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        float r72 = r7 % 360.0f;
        this.i = r72;
        this.k = Math.toRadians(r72 - 90.0f);
        int r02 = getHeight() / 2;
        int r1 = getWidth() / 2;
        float r2 = a(this.m);
        float r3 = (((float) Math.cos(this.k)) * r2) + r1;
        float r22 = (r2 * ((float) Math.sin(this.k))) + r02;
        float r03 = this.d;
        this.g.set(r3 - r03, r22 - r03, r3 + r03, r22 + r03);
        ArrayList r04 = this.c;
        int r12 = r04.size();
        int r23 = 0;
    L6:
        if (r23 >= r12) goto L10;
        Object r32 = r04.get(r23);
        r23 = r23 + 1;
        ClockFaceView r33 = (ClockFaceView) ((va) r32);
        if (Math.abs(r33.F - r72) <= 0.001f) goto L6;
        r33.F = r72;
        r33.f();
        goto L6
    L10:
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas r14) {
        super.onDraw(r14);
        int r0 = getHeight() / 2;
        int r1 = getWidth() / 2;
        float r4 = r1;
        float r3 = a(this.m);
        float r5 = (((float) Math.cos(this.k)) * r3) + r4;
        float r52 = r0;
        float r32 = (r3 * ((float) Math.sin(this.k))) + r52;
        Paint r8 = this.f;
        r8.setStrokeWidth(0.0f);
        r14.drawCircle(r5, r32, this.d, r8);
        double r9 = Math.sin(this.k);
        r8.setStrokeWidth(this.h);
        r14.drawLine(r4, r52, r1 + ((int) (Math.cos(this.k) * r2)), r0 + ((int) (r2 * r9)), r8);
        r14.drawCircle(r4, r52, this.e, r8);
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        if (this.a.isRunning() == true) goto L6;
        b(this.i);
        return;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r10) {
        int r0 = r10.getActionMasked();
        float r1 = r10.getX();
        float r102 = r10.getY();
        boolean r4 = false;
        if (r0 == 0) goto L15;
        if (r0 == 1) goto L7;
        if (r0 == 2) goto L7;
        boolean r02 = false;
        boolean r5 = false;
    L16:
        boolean r6 = this.j;
        int r103 = (int) Math.toDegrees(Math.atan2(r102 - (getHeight() / 2), r1 - (getWidth() / 2)));
        int r12 = r103 + 90;
        if (r12 >= 0) goto L19;
        r12 = r103 + 450;
    L19:
        float r13 = r12;
        if (this.i == r13) goto L22;
        boolean r104 = true;
    L23:
        if (r5 == false) goto L26;
        if (r104 == false) goto L26;
    L25:
        r4 = true;
    L29:
        this.j = r6 | r4;
        return true;
    L26:
        if (r104 == true) goto L28;
        if (r02 == false) goto L29;
    L28:
        b(r13);
        goto L25
    L22:
        r104 = false;
    L7:
        r02 = this.j;
        if (this.b == false) goto L14;
        int r52 = getWidth() / 2;
        if (((float) Math.hypot(r1 - r52, r102 - (getHeight() / 2))) > (a(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics()))) goto L12;
        int r53 = 2;
    L13:
        this.m = r53;
        goto L14
    L12:
        r53 = 1;
    L14:
        r5 = false;
        goto L16
    L15:
        this.j = false;
        r5 = true;
        r02 = false;
        goto L16
    }
}
