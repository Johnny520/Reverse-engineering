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
import com.abc.core.runtime.AbstractC0805P;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p058g0.AbstractC0942a;
import p060h0.AbstractC0945a;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a */
    public final ValueAnimator f2532a;

    /* JADX INFO: renamed from: b */
    public boolean f2533b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f2534c;

    /* JADX INFO: renamed from: d */
    public final int f2535d;

    /* JADX INFO: renamed from: e */
    public final float f2536e;

    /* JADX INFO: renamed from: f */
    public final Paint f2537f;

    /* JADX INFO: renamed from: g */
    public final RectF f2538g;

    /* JADX INFO: renamed from: h */
    public final int f2539h;

    /* JADX INFO: renamed from: i */
    public float f2540i;

    /* JADX INFO: renamed from: j */
    public boolean f2541j;

    /* JADX INFO: renamed from: k */
    public double f2542k;

    /* JADX INFO: renamed from: l */
    public int f2543l;

    /* JADX INFO: renamed from: m */
    public int f2544m;

    public ClockHandView(Context r7, AttributeSet r8) {
        super(r7, r8, C1031R.attr.materialClockStyle);
        this.f2532a = new ValueAnimator();
        this.f2534c = new ArrayList();
        Paint r1 = new Paint();
        this.f2537f = r1;
        this.f2538g = new RectF();
        this.f2544m = 1;
        TypedArray r82 = r7.obtainStyledAttributes(r8, AbstractC0942a.f3333e, C1031R.attr.materialClockStyle, C1031R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC0805P.m2038R(r7, C1031R.attr.motionDurationLong2, 200);
        AbstractC0805P.m2039S(r7, C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3355b);
        this.f2543l = r82.getDimensionPixelSize(1, 0);
        this.f2535d = r82.getDimensionPixelSize(2, 0);
        this.f2539h = getResources().getDimensionPixelSize(C1031R.dimen.material_clock_hand_stroke_width);
        this.f2536e = r4.getDimensionPixelSize(C1031R.dimen.material_clock_hand_center_dot_radius);
        int r02 = r82.getColor(0, 0);
        r1.setAntiAlias(true);
        r1.setColor(r02);
        m1915b(0.0f);
        ViewConfiguration.get(r7).getScaledTouchSlop();
        Field r72 = AbstractC0080Q.f219a;
        setImportantForAccessibility(2);
        r82.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m1914a(int r2) {
        if (r2 != 2) goto L6;
        return Math.round(this.f2543l * 0.66f);
    L6:
        return this.f2543l;
    }

    /* JADX INFO: renamed from: b */
    public final void m1915b(float r2) {
        ValueAnimator r02 = this.f2532a;
        if (r02 == null) goto L5;
        r02.cancel();
    L5:
        m1916c(r2);
    }

    /* JADX INFO: renamed from: c */
    public final void m1916c(float r7) {
        float r72 = r7 % 360.0f;
        this.f2540i = r72;
        this.f2542k = Math.toRadians(r72 - 90.0f);
        int r02 = getHeight() / 2;
        int r1 = getWidth() / 2;
        float r2 = m1914a(this.f2544m);
        float r3 = (((float) Math.cos(this.f2542k)) * r2) + r1;
        float r22 = (r2 * ((float) Math.sin(this.f2542k))) + r02;
        float r03 = this.f2535d;
        this.f2538g.set(r3 - r03, r22 - r03, r3 + r03, r22 + r03);
        Iterator r04 = this.f2534c.iterator();
    L4:
        if (r04.hasNext() == false) goto L8;
        ClockFaceView r12 = (ClockFaceView) ((InterfaceC0726d) r04.next());
        if (Math.abs(r12.f2522F - r72) <= 0.001f) goto L4;
        r12.f2522F = r72;
        r12.m1913g();
        goto L4
    L8:
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas r15) {
        super.onDraw(r15);
        int r02 = getHeight() / 2;
        int r1 = getWidth() / 2;
        float r9 = r1;
        float r3 = m1914a(this.f2544m);
        float r4 = (((float) Math.cos(this.f2542k)) * r3) + r9;
        float r10 = r02;
        float r32 = (r3 * ((float) Math.sin(this.f2542k))) + r10;
        Paint r11 = this.f2537f;
        r11.setStrokeWidth(0.0f);
        r15.drawCircle(r4, r32, this.f2535d, r11);
        double r33 = Math.sin(this.f2542k);
        r11.setStrokeWidth(this.f2539h);
        r15.drawLine(r9, r10, r1 + ((int) (Math.cos(this.f2542k) * r12)), r02 + ((int) (r12 * r33)), r11);
        r15.drawCircle(r9, r10, this.f2536e, r11);
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        if (this.f2532a.isRunning() == true) goto L6;
        m1915b(this.f2540i);
        return;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r10) {
        int r02 = r10.getActionMasked();
        float r1 = r10.getX();
        float r102 = r10.getY();
        boolean r4 = false;
        if (r02 == 0) goto L15;
        if (r02 == 1) goto L7;
        if (r02 == 2) goto L7;
        boolean r03 = false;
        boolean r5 = false;
    L16:
        boolean r6 = this.f2541j;
        int r103 = (int) Math.toDegrees(Math.atan2(r102 - (getHeight() / 2), r1 - (getWidth() / 2)));
        int r12 = r103 + 90;
        if (r12 >= 0) goto L19;
        r12 = r103 + 450;
    L19:
        float r13 = r12;
        if (this.f2540i == r13) goto L22;
        boolean r104 = true;
    L23:
        if (r5 == false) goto L26;
        if (r104 == false) goto L26;
    L25:
        r4 = true;
    L29:
        this.f2541j = r6 | r4;
        return true;
    L26:
        if (r104 == true) goto L28;
        if (r03 == false) goto L29;
    L28:
        m1915b(r13);
        goto L25
    L22:
        r104 = false;
    L7:
        r03 = this.f2541j;
        if (this.f2533b == false) goto L14;
        int r52 = getWidth() / 2;
        if (((float) Math.hypot(r1 - r52, r102 - (getHeight() / 2))) > (m1914a(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics()))) goto L12;
        int r53 = 2;
    L13:
        this.f2544m = r53;
        goto L14
    L12:
        r53 = 1;
    L14:
        r5 = false;
        goto L16
    L15:
        this.f2541j = false;
        r5 = true;
        r03 = false;
        goto L16
    }
}
