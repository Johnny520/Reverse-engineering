package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
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
import com.google.android.material.C1247R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0866ug;
import p000a.C0888w0;
import p000a.C0899wb;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a */
    public final ValueAnimator f6011a;

    /* JADX INFO: renamed from: b */
    public boolean f6012b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f6013c;

    /* JADX INFO: renamed from: d */
    public final int f6014d;

    /* JADX INFO: renamed from: e */
    public final float f6015e;

    /* JADX INFO: renamed from: f */
    public final Paint f6016f;

    /* JADX INFO: renamed from: g */
    public final RectF f6017g;

    /* JADX INFO: renamed from: h */
    public final int f6018h;

    /* JADX INFO: renamed from: i */
    public float f6019i;

    /* JADX INFO: renamed from: j */
    public boolean f6020j;

    /* JADX INFO: renamed from: k */
    public double f6021k;

    /* JADX INFO: renamed from: l */
    public int f6022l;

    /* JADX INFO: renamed from: m */
    public int f6023m;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public interface InterfaceC1320a {
        /* JADX INFO: renamed from: a */
        void mo3297a(float f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ClockHandView(Context context, AttributeSet attributeSet) {
        int i = C1247R.attr.materialClockStyle;
        super(context, attributeSet, i);
        this.f6011a = new ValueAnimator();
        this.f6013c = new ArrayList();
        Paint paint = new Paint();
        this.f6016f = paint;
        this.f6017g = new RectF();
        this.f6023m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1247R.styleable.ClockHandView, i, C1247R.style.Widget_MaterialComponents_TimePicker_Clock);
        C0899wb.m2187c(context, C1247R.attr.motionDurationLong2, 200);
        C0899wb.m2188d(context, C1247R.attr.motionEasingEmphasizedInterpolator, C0888w0.f3469b);
        this.f6022l = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.ClockHandView_materialCircleRadius, 0);
        this.f6014d = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.ClockHandView_selectorSize, 0);
        this.f6018h = getResources().getDimensionPixelSize(C1247R.dimen.material_clock_hand_stroke_width);
        this.f6015e = r0.getDimensionPixelSize(C1247R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(C1247R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m3300b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m3299a(int i) {
        return i == 2 ? Math.round(this.f6022l * 0.66f) : this.f6022l;
    }

    /* JADX INFO: renamed from: b */
    public final void m3300b(float f) {
        ValueAnimator valueAnimator = this.f6011a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.f6019i = f2;
        this.f6021k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM3299a = m3299a(this.f6023m);
        float fCos = (((float) Math.cos(this.f6021k)) * fM3299a) + width;
        float fSin = (fM3299a * ((float) Math.sin(this.f6021k))) + height;
        float f3 = this.f6014d;
        this.f6017g.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f6013c.iterator();
        while (it.hasNext()) {
            ((InterfaceC1320a) it.next()).mo3297a(f2);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fM3299a = m3299a(this.f6023m);
        float fCos = (((float) Math.cos(this.f6021k)) * fM3299a) + f;
        float f2 = height;
        float fSin = (fM3299a * ((float) Math.sin(this.f6021k))) + f2;
        Paint paint = this.f6016f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f6014d, paint);
        double dSin = Math.sin(this.f6021k);
        paint.setStrokeWidth(this.f6018h);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f6021k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.f6015e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f6011a.isRunning()) {
            return;
        }
        m3300b(this.f6019i);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f6020j = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f6020j;
            if (this.f6012b) {
                this.f6023m = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) m3299a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f6020j;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f6019i != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            m3300b(f);
            z3 = true;
        }
        this.f6020j = z4 | z3;
        return true;
    }
}
