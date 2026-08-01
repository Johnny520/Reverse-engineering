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
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC0126ct;
import p000.AbstractC0619q2;
import p000.AbstractC0873wy;
import p000.InterfaceC0812va;
import p000.ja0;
import p000.s90;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a */
    public final ValueAnimator f1267a;

    /* JADX INFO: renamed from: b */
    public boolean f1268b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1269c;

    /* JADX INFO: renamed from: d */
    public final int f1270d;

    /* JADX INFO: renamed from: e */
    public final float f1271e;

    /* JADX INFO: renamed from: f */
    public final Paint f1272f;

    /* JADX INFO: renamed from: g */
    public final RectF f1273g;

    /* JADX INFO: renamed from: h */
    public final int f1274h;

    /* JADX INFO: renamed from: i */
    public float f1275i;

    /* JADX INFO: renamed from: j */
    public boolean f1276j;

    /* JADX INFO: renamed from: k */
    public double f1277k;

    /* JADX INFO: renamed from: l */
    public int f1278l;

    /* JADX INFO: renamed from: m */
    public int f1279m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f1267a = new ValueAnimator();
        this.f1269c = new ArrayList();
        Paint paint = new Paint();
        this.f1272f = paint;
        this.f1273g = new RectF();
        this.f1279m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5046e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC0126ct.m824v(context, R.attr.motionDurationLong2, 200);
        AbstractC0126ct.m825w(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0619q2.f3972b);
        this.f1278l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1270d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f1274h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1271e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m800b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2327s(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m799a(int i) {
        return i == 2 ? Math.round(this.f1278l * 0.66f) : this.f1278l;
    }

    /* JADX INFO: renamed from: b */
    public final void m800b(float f) {
        ValueAnimator valueAnimator = this.f1267a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.f1275i = f2;
        this.f1277k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM799a = m799a(this.f1279m);
        float fCos = (((float) Math.cos(this.f1277k)) * fM799a) + width;
        float fSin = (fM799a * ((float) Math.sin(this.f1277k))) + height;
        float f3 = this.f1270d;
        this.f1273g.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        ArrayList arrayList = this.f1269c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0812va) obj);
            if (Math.abs(clockFaceView.f1257F - f2) > 0.001f) {
                clockFaceView.f1257F = f2;
                clockFaceView.m798f();
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
        float fM799a = m799a(this.f1279m);
        float fCos = (((float) Math.cos(this.f1277k)) * fM799a) + f;
        float f2 = height;
        float fSin = (fM799a * ((float) Math.sin(this.f1277k))) + f2;
        Paint paint = this.f1272f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f1270d, paint);
        double dSin = Math.sin(this.f1277k);
        paint.setStrokeWidth(this.f1274h);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f1277k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.f1271e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1267a.isRunning()) {
            return;
        }
        m800b(this.f1275i);
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
            this.f1276j = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f1276j;
            if (this.f1268b) {
                this.f1279m = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) m799a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f1276j;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f1275i != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            m800b(f);
            z3 = true;
        }
        this.f1276j = z4 | z3;
        return true;
    }
}
