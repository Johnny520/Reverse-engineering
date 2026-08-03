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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p056f0.AbstractC0805P;
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

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1031R.attr.materialClockStyle);
        this.f2532a = new ValueAnimator();
        this.f2534c = new ArrayList();
        Paint paint = new Paint();
        this.f2537f = paint;
        this.f2538g = new RectF();
        this.f2544m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0942a.f3333e, C1031R.attr.materialClockStyle, C1031R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC0805P.m2038R(context, C1031R.attr.motionDurationLong2, 200);
        AbstractC0805P.m2039S(context, C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3355b);
        this.f2543l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2535d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f2539h = getResources().getDimensionPixelSize(C1031R.dimen.material_clock_hand_stroke_width);
        this.f2536e = r4.getDimensionPixelSize(C1031R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m1915b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        Field field = AbstractC0080Q.f219a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m1914a(int i2) {
        return i2 == 2 ? Math.round(this.f2543l * 0.66f) : this.f2543l;
    }

    /* JADX INFO: renamed from: b */
    public final void m1915b(float f2) {
        ValueAnimator valueAnimator = this.f2532a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        m1916c(f2);
    }

    /* JADX INFO: renamed from: c */
    public final void m1916c(float f2) {
        float f3 = f2 % 360.0f;
        this.f2540i = f3;
        this.f2542k = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM1914a = m1914a(this.f2544m);
        float fCos = (((float) Math.cos(this.f2542k)) * fM1914a) + width;
        float fSin = (fM1914a * ((float) Math.sin(this.f2542k))) + height;
        float f4 = this.f2535d;
        this.f2538g.set(fCos - f4, fSin - f4, fCos + f4, fSin + f4);
        Iterator it = this.f2534c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0726d) it.next());
            if (Math.abs(clockFaceView.f2522F - f3) > 0.001f) {
                clockFaceView.f2522F = f3;
                clockFaceView.m1913g();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = width;
        float fM1914a = m1914a(this.f2544m);
        float fCos = (((float) Math.cos(this.f2542k)) * fM1914a) + f2;
        float f3 = height;
        float fSin = (fM1914a * ((float) Math.sin(this.f2542k))) + f3;
        Paint paint = this.f2537f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f2535d, paint);
        double dSin = Math.sin(this.f2542k);
        paint.setStrokeWidth(this.f2539h);
        canvas.drawLine(f2, f3, width + ((int) (Math.cos(this.f2542k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f2, f3, this.f2536e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.f2532a.isRunning()) {
            return;
        }
        m1915b(this.f2540i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked == 0) {
            this.f2541j = false;
            z2 = true;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z3 = this.f2541j;
            if (this.f2533b) {
                this.f2544m = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) m1914a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
        }
        boolean z5 = this.f2541j;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i2 = degrees + 90;
        if (i2 < 0) {
            i2 = degrees + 450;
        }
        float f2 = i2;
        boolean z6 = this.f2540i != f2;
        if (z2 && z6) {
            z4 = true;
        } else if (z6 || z3) {
            m1915b(f2);
            z4 = true;
        }
        this.f2541j = z5 | z4;
        return true;
    }
}
