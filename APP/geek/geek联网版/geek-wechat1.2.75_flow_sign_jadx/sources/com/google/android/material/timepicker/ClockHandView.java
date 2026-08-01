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
import p000.AbstractC0168dz;
import p000.AbstractC0274gu;
import p000.AbstractC0618q2;
import p000.InterfaceC0145db;
import p000.oa0;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a */
    public final ValueAnimator f1192a;

    /* JADX INFO: renamed from: b */
    public boolean f1193b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1194c;

    /* JADX INFO: renamed from: d */
    public final int f1195d;

    /* JADX INFO: renamed from: e */
    public final float f1196e;

    /* JADX INFO: renamed from: f */
    public final Paint f1197f;

    /* JADX INFO: renamed from: g */
    public final RectF f1198g;

    /* JADX INFO: renamed from: h */
    public final int f1199h;

    /* JADX INFO: renamed from: i */
    public float f1200i;

    /* JADX INFO: renamed from: j */
    public boolean f1201j;

    /* JADX INFO: renamed from: k */
    public double f1202k;

    /* JADX INFO: renamed from: l */
    public int f1203l;

    /* JADX INFO: renamed from: m */
    public int f1204m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f1192a = new ValueAnimator();
        this.f1194c = new ArrayList();
        Paint paint = new Paint();
        this.f1197f = paint;
        this.f1198g = new RectF();
        this.f1204m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1442e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC0274gu.m1302E(context, R.attr.motionDurationLong2, 200);
        AbstractC0274gu.m1303F(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0618q2.f3771b);
        this.f1203l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1195d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f1199h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1196e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m759b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2671s(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m758a(int i) {
        return i == 2 ? Math.round(this.f1203l * 0.66f) : this.f1203l;
    }

    /* JADX INFO: renamed from: b */
    public final void m759b(float f) {
        ValueAnimator valueAnimator = this.f1192a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.f1200i = f2;
        this.f1202k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM758a = m758a(this.f1204m);
        float fCos = (((float) Math.cos(this.f1202k)) * fM758a) + width;
        float fSin = (fM758a * ((float) Math.sin(this.f1202k))) + height;
        float f3 = this.f1195d;
        this.f1198g.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        ArrayList arrayList = this.f1194c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0145db) obj);
            if (Math.abs(clockFaceView.f1182F - f2) > 0.001f) {
                clockFaceView.f1182F = f2;
                clockFaceView.m757f();
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
        float fM758a = m758a(this.f1204m);
        float fCos = (((float) Math.cos(this.f1202k)) * fM758a) + f;
        float f2 = height;
        float fSin = (fM758a * ((float) Math.sin(this.f1202k))) + f2;
        Paint paint = this.f1197f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f1195d, paint);
        double dSin = Math.sin(this.f1202k);
        paint.setStrokeWidth(this.f1199h);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f1202k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.f1196e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1192a.isRunning()) {
            return;
        }
        m759b(this.f1200i);
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
            this.f1201j = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f1201j;
            if (this.f1193b) {
                this.f1204m = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) m758a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f1201j;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f1200i != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            m759b(f);
            z3 = true;
        }
        this.f1201j = z4 | z3;
        return true;
    }
}
