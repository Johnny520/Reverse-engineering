package com.lxj.xpopup.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.RunnableC0909;
import com.lxj.xpopup.util.AbstractC4620;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class LoadingView extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final RunnableC0909 f12238;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int f12239;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int f12240;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ArgbEvaluator f12241;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f12242;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f12243;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f12244;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f12245;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Paint f12246;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float f12247;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f12248;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f12249;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f12250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12251;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f12252;

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f12252 = 10;
        this.f12250 = 36.0f;
        this.f12251 = 0;
        this.f12242 = 2.0f;
        this.f12241 = new ArgbEvaluator();
        this.f12240 = Color.parseColor("#EEEEEE");
        this.f12239 = Color.parseColor("#111111");
        this.f12238 = new RunnableC0909(this, 12);
        Paint paint = new Paint(1);
        this.f12246 = paint;
        float fM8665 = AbstractC4620.m8665(context, this.f12242);
        this.f12242 = fM8665;
        paint.setStrokeWidth(fM8665);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RunnableC0909 runnableC0909 = this.f12238;
        removeCallbacks(runnableC0909);
        postDelayed(runnableC0909, 80L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f12238);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f12252;
        int i2 = i - 1;
        while (i2 >= 0) {
            int iIntValue = ((Integer) this.f12241.evaluate((((Math.abs(this.f12251 + i2) % i) + 1) * 1.0f) / i, Integer.valueOf(this.f12240), Integer.valueOf(this.f12239))).intValue();
            Paint paint = this.f12246;
            paint.setColor(iIntValue);
            float f = this.f12248;
            float f2 = this.f12244;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f, f2, this.f12249, f2, paint);
            canvas2.drawCircle(this.f12248, this.f12244, this.f12242 / 2.0f, paint);
            canvas2.drawCircle(this.f12249, this.f12244, this.f12242 / 2.0f, paint);
            canvas2.rotate(this.f12250, this.f12245, this.f12244);
            i2--;
            canvas = canvas2;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        this.f12247 = measuredWidth;
        this.f12243 = measuredWidth / 2.5f;
        this.f12245 = getMeasuredWidth() / 2.0f;
        this.f12244 = getMeasuredHeight() / 2.0f;
        float fM8665 = AbstractC4620.m8665(getContext(), 2.0f);
        this.f12242 = fM8665;
        this.f12246.setStrokeWidth(fM8665);
        float f = this.f12245 + this.f12243;
        this.f12248 = f;
        this.f12249 = (this.f12247 / 3.0f) + f;
    }
}
