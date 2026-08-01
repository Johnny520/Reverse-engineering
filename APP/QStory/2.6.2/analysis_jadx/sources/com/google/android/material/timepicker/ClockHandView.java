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
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Iterator;
import p175.AbstractC7738;
import p314.AbstractC8669;
import p317.AbstractC8680;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f10816 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f10817;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f10818;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public double f10819;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f10820;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float f10821;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f10822;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f10823;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float f10824;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Paint f10825;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final RectF f10826;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f10827;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f10828;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ValueAnimator f10829;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f10829 = valueAnimator;
        this.f10828 = new ArrayList();
        Paint paint = new Paint();
        this.f10825 = paint;
        this.f10826 = new RectF();
        this.f10817 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8669.f24432, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC7738.m13024(context, R.attr.motionDurationLong2, 200);
        AbstractC7738.m13027(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC8680.f24475);
        this.f10818 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f10822 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f10823 = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f10821 = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m7296(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.飘花落叶言子楪世哲兰苏
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.f10816;
                this.f10837.m7295(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new C3202());
    }

    public void addOnRotateListener(InterfaceC3212 interfaceC3212) {
        this.f10828.add(interfaceC3212);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.f10817;
        int iRound = this.f10818;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f = width;
        float f2 = iRound;
        float fCos = (((float) Math.cos(this.f10819)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.f10819))) + f3;
        Paint paint = this.f10825;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f10822, paint);
        double dSin = Math.sin(this.f10819);
        paint.setStrokeWidth(this.f10823);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.f10819) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.f10821, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f10829.isRunning()) {
            return;
        }
        m7296(this.f10824);
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
            this.f10820 = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f10820;
            if (this.f10827) {
                this.f10817 = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.f10818) * 0.66f)) + TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f10820;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f10824 != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            m7296(f);
            z3 = true;
        }
        this.f10820 = z4 | z3;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7295(float f) {
        float f2 = f % 360.0f;
        this.f10824 = f2;
        this.f10819 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.f10817;
        int iRound = this.f10818;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f3 = width;
        float f4 = iRound;
        float fCos = (((float) Math.cos(this.f10819)) * f4) + f3;
        float fSin = (f4 * ((float) Math.sin(this.f10819))) + height;
        float f5 = this.f10822;
        this.f10826.set(fCos - f5, fSin - f5, fCos + f5, fSin + f5);
        Iterator it = this.f10828.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC3212) it.next());
            if (Math.abs(clockFaceView.f10801 - f2) > 0.001f) {
                clockFaceView.f10801 = f2;
                clockFaceView.m7293();
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7296(float f) {
        this.f10829.cancel();
        m7295(f);
    }

    public void setOnActionUpListener(InterfaceC3201 interfaceC3201) {
    }
}
