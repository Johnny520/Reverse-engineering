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
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC0714Qj;
import p000.AbstractC0776S2;
import p000.AbstractC0939Vu;
import p000.C0612O9;
import p000.InterfaceC0655P9;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f4686n = 0;

    /* JADX INFO: renamed from: a */
    public final ValueAnimator f4687a;

    /* JADX INFO: renamed from: b */
    public boolean f4688b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4689c;

    /* JADX INFO: renamed from: d */
    public final int f4690d;

    /* JADX INFO: renamed from: e */
    public final float f4691e;

    /* JADX INFO: renamed from: f */
    public final Paint f4692f;

    /* JADX INFO: renamed from: g */
    public final RectF f4693g;

    /* JADX INFO: renamed from: h */
    public final int f4694h;

    /* JADX INFO: renamed from: i */
    public float f4695i;

    /* JADX INFO: renamed from: j */
    public boolean f4696j;

    /* JADX INFO: renamed from: k */
    public double f4697k;

    /* JADX INFO: renamed from: l */
    public int f4698l;

    /* JADX INFO: renamed from: m */
    public int f4699m;

    public ClockHandView(Context r8, AttributeSet r9) {
        super(r8, r9, R.attr.materialClockStyle);
        ValueAnimator r1 = new ValueAnimator();
        this.f4687a = r1;
        this.f4689c = new ArrayList();
        Paint r2 = new Paint();
        this.f4692f = r2;
        this.f4693g = new RectF();
        this.f4699m = 1;
        TypedArray r92 = r8.obtainStyledAttributes(r9, AbstractC0939Vu.f2936e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC0714Qj.m1473D(r8, R.attr.motionDurationLong2, 200);
        AbstractC0714Qj.m1474E(r8, R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2454b);
        this.f4698l = r92.getDimensionPixelSize(1, 0);
        this.f4690d = r92.getDimensionPixelSize(2, 0);
        this.f4694h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f4691e = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int r0 = r92.getColor(0, 0);
        r2.setAntiAlias(true);
        r2.setColor(r0);
        m2507b(0.0f);
        ViewConfiguration.get(r8).getScaledTouchSlop();
        setImportantForAccessibility(2);
        r92.recycle();
        r1.addUpdateListener(new C1282d(this));
        r1.addListener(new C0612O9());
    }

    /* JADX INFO: renamed from: a */
    public final int m2506a(int r2) {
        if (r2 != 2) goto L7;
        return Math.round(this.f4698l * 0.66f);
    L7:
        return this.f4698l;
    }

    /* JADX INFO: renamed from: b */
    public final void m2507b(float r2) {
        this.f4687a.cancel();
        m2508c(r2);
    }

    /* JADX INFO: renamed from: c */
    public final void m2508c(float r7) {
        float r72 = r7 % 360.0f;
        this.f4695i = r72;
        this.f4697k = Math.toRadians(r72 - 90.0f);
        int r0 = getHeight() / 2;
        int r1 = getWidth() / 2;
        float r2 = m2506a(this.f4699m);
        float r3 = (((float) Math.cos(this.f4697k)) * r2) + r1;
        float r22 = (r2 * ((float) Math.sin(this.f4697k))) + r0;
        float r02 = this.f4690d;
        this.f4693g.set(r3 - r02, r22 - r02, r3 + r02, r22 + r02);
        Iterator r03 = this.f4689c.iterator();
    L4:
        if (r03.hasNext() == false) goto L8;
        ClockFaceView r12 = (ClockFaceView) ((InterfaceC0655P9) r03.next());
        if (Math.abs(r12.f4677G - r72) <= 0.001f) goto L4;
        r12.f4677G = r72;
        r12.m2505n();
        goto L4
    L8:
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas r14) {
        super.onDraw(r14);
        int r0 = getHeight() / 2;
        int r1 = getWidth() / 2;
        float r4 = r1;
        float r3 = m2506a(this.f4699m);
        float r5 = (((float) Math.cos(this.f4697k)) * r3) + r4;
        float r52 = r0;
        float r32 = (r3 * ((float) Math.sin(this.f4697k))) + r52;
        Paint r8 = this.f4692f;
        r8.setStrokeWidth(0.0f);
        r14.drawCircle(r5, r32, this.f4690d, r8);
        double r9 = Math.sin(this.f4697k);
        r8.setStrokeWidth(this.f4694h);
        r14.drawLine(r4, r52, r1 + ((int) (Math.cos(this.f4697k) * r2)), r0 + ((int) (r2 * r9)), r8);
        r14.drawCircle(r4, r52, this.f4691e, r8);
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        if (this.f4687a.isRunning() == true) goto L6;
        m2507b(this.f4695i);
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
        boolean r6 = this.f4696j;
        int r103 = (int) Math.toDegrees(Math.atan2(r102 - (getHeight() / 2), r1 - (getWidth() / 2)));
        int r12 = r103 + 90;
        if (r12 >= 0) goto L19;
        r12 = r103 + 450;
    L19:
        float r13 = r12;
        if (this.f4695i == r13) goto L22;
        boolean r104 = true;
    L23:
        if (r5 == false) goto L26;
        if (r104 == false) goto L26;
    L25:
        r4 = true;
    L29:
        this.f4696j = r6 | r4;
        return true;
    L26:
        if (r104 == true) goto L28;
        if (r02 == false) goto L29;
    L28:
        m2507b(r13);
        goto L25
    L22:
        r104 = false;
    L7:
        r02 = this.f4696j;
        if (this.f4688b == false) goto L14;
        int r52 = getWidth() / 2;
        if (((float) Math.hypot(r1 - r52, r102 - (getHeight() / 2))) > (m2506a(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics()))) goto L12;
        int r53 = 2;
    L13:
        this.f4699m = r53;
        goto L14
    L12:
        r53 = 1;
    L14:
        r5 = false;
        goto L16
    L15:
        this.f4696j = false;
        r5 = true;
        r02 = false;
        goto L16
    }
}
