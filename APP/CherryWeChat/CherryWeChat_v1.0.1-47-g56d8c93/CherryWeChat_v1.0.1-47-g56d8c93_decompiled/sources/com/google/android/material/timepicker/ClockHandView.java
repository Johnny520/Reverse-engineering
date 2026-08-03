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

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f4687a = valueAnimator;
        this.f4689c = new ArrayList();
        Paint paint = new Paint();
        this.f4692f = paint;
        this.f4693g = new RectF();
        this.f4699m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2936e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC0714Qj.m1473D(context, R.attr.motionDurationLong2, 200);
        AbstractC0714Qj.m1474E(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2454b);
        this.f4698l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f4690d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f4694h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f4691e = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m2507b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.f4686n;
                this.f4705a.m2508c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new C0612O9());
    }

    /* JADX INFO: renamed from: a */
    public final int m2506a(int i) {
        return i == 2 ? Math.round(this.f4698l * 0.66f) : this.f4698l;
    }

    /* JADX INFO: renamed from: b */
    public final void m2507b(float f) {
        this.f4687a.cancel();
        m2508c(f);
    }

    /* JADX INFO: renamed from: c */
    public final void m2508c(float f) {
        float f2 = f % 360.0f;
        this.f4695i = f2;
        this.f4697k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM2506a = m2506a(this.f4699m);
        float fCos = (((float) Math.cos(this.f4697k)) * fM2506a) + width;
        float fSin = (fM2506a * ((float) Math.sin(this.f4697k))) + height;
        float f3 = this.f4690d;
        this.f4693g.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f4689c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0655P9) it.next());
            if (Math.abs(clockFaceView.f4677G - f2) > 0.001f) {
                clockFaceView.f4677G = f2;
                clockFaceView.m2505n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fM2506a = m2506a(this.f4699m);
        float fCos = (((float) Math.cos(this.f4697k)) * fM2506a) + f;
        float f2 = height;
        float fSin = (fM2506a * ((float) Math.sin(this.f4697k))) + f2;
        Paint paint = this.f4692f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f4690d, paint);
        double dSin = Math.sin(this.f4697k);
        paint.setStrokeWidth(this.f4694h);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f4697k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.f4691e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f4687a.isRunning()) {
            return;
        }
        m2507b(this.f4695i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f4696j = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f4696j;
            if (this.f4688b) {
                this.f4699m = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) m2506a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f4696j;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f4695i != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            m2507b(f);
            z3 = true;
        }
        this.f4696j = z4 | z3;
        return true;
    }
}
