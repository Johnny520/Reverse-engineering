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
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.Iterator;
import p050.AbstractC7176;
import p330.AbstractC9490;
import p333.AbstractC9501;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f11166 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f11167;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f11168;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public double f11169;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f11170;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float f11171;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f11172;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f11173;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float f11174;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Paint f11175;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final RectF f11176;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f11177;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f11178;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ValueAnimator f11179;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0328R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f11179 = valueAnimator;
        this.f11178 = new ArrayList();
        Paint paint = new Paint();
        this.f11175 = paint;
        this.f11176 = new RectF();
        this.f11167 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9490.f24768, C0328R.attr.materialClockStyle, C0328R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC7176.m12481(context, C0328R.attr.motionDurationLong2, 200);
        AbstractC7176.m12482(context, C0328R.attr.motionEasingEmphasizedInterpolator, AbstractC9501.f24812);
        this.f11168 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f11172 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f11173 = getResources().getDimensionPixelSize(C0328R.dimen.material_clock_hand_stroke_width);
        this.f11171 = r5.getDimensionPixelSize(C0328R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m7842(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.飘花落叶言子楪世哲兰苏
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.f11166;
                this.f11187.m7841(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new C4035());
    }

    public void addOnRotateListener(InterfaceC4045 interfaceC4045) {
        this.f11178.add(interfaceC4045);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.f11167;
        int iRound = this.f11168;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f = width;
        float f2 = iRound;
        float fCos = (((float) Math.cos(this.f11169)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.f11169))) + f3;
        Paint paint = this.f11175;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f11172, paint);
        double dSin = Math.sin(this.f11169);
        paint.setStrokeWidth(this.f11173);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.f11169) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.f11171, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f11179.isRunning()) {
            return;
        }
        m7842(this.f11174);
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
            this.f11170 = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f11170;
            if (this.f11177) {
                this.f11167 = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.f11168) * 0.66f)) + TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f11170;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f11174 != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            m7842(f);
            z3 = true;
        }
        this.f11170 = z4 | z3;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7841(float f) {
        float f2 = f % 360.0f;
        this.f11174 = f2;
        this.f11169 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.f11167;
        int iRound = this.f11168;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f3 = width;
        float f4 = iRound;
        float fCos = (((float) Math.cos(this.f11169)) * f4) + f3;
        float fSin = (f4 * ((float) Math.sin(this.f11169))) + height;
        float f5 = this.f11172;
        this.f11176.set(fCos - f5, fSin - f5, fCos + f5, fSin + f5);
        Iterator it = this.f11178.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC4045) it.next());
            if (Math.abs(clockFaceView.f11151 - f2) > 0.001f) {
                clockFaceView.f11151 = f2;
                clockFaceView.m7839();
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7842(float f) {
        this.f11179.cancel();
        m7841(f);
    }

    public void setOnActionUpListener(InterfaceC4034 interfaceC4034) {
    }
}
