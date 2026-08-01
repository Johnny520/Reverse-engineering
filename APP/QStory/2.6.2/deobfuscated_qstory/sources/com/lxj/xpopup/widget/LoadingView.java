package com.lxj.xpopup.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.RunnableC0062;
import com.lxj.xpopup.util.AbstractC3787;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class LoadingView extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final RunnableC0062 f11888;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int f11889;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int f11890;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ArgbEvaluator f11891;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f11892;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f11893;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f11894;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f11895;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Paint f11896;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float f11897;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f11898;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f11899;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f11900;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11901;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f11902;

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11902 = 10;
        this.f11900 = 36.0f;
        this.f11901 = 0;
        this.f11892 = 2.0f;
        this.f11891 = new ArgbEvaluator();
        this.f11890 = Color.parseColor("#EEEEEE");
        this.f11889 = Color.parseColor("#111111");
        this.f11888 = new RunnableC0062(this, 12);
        Paint paint = new Paint(1);
        this.f11896 = paint;
        float fM8119 = AbstractC3787.m8119(context, this.f11892);
        this.f11892 = fM8119;
        paint.setStrokeWidth(fM8119);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RunnableC0062 runnableC0062 = this.f11888;
        removeCallbacks(runnableC0062);
        postDelayed(runnableC0062, 80L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f11888);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f11902;
        int i2 = i - 1;
        while (i2 >= 0) {
            int iIntValue = ((Integer) this.f11891.evaluate((((Math.abs(this.f11901 + i2) % i) + 1) * 1.0f) / i, Integer.valueOf(this.f11890), Integer.valueOf(this.f11889))).intValue();
            Paint paint = this.f11896;
            paint.setColor(iIntValue);
            float f = this.f11898;
            float f2 = this.f11894;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f, f2, this.f11899, f2, paint);
            canvas2.drawCircle(this.f11898, this.f11894, this.f11892 / 2.0f, paint);
            canvas2.drawCircle(this.f11899, this.f11894, this.f11892 / 2.0f, paint);
            canvas2.rotate(this.f11900, this.f11895, this.f11894);
            i2--;
            canvas = canvas2;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        this.f11897 = measuredWidth;
        this.f11893 = measuredWidth / 2.5f;
        this.f11895 = getMeasuredWidth() / 2.0f;
        this.f11894 = getMeasuredHeight() / 2.0f;
        float fM8119 = AbstractC3787.m8119(getContext(), 2.0f);
        this.f11892 = fM8119;
        this.f11896.setStrokeWidth(fM8119);
        float f = this.f11895 + this.f11893;
        this.f11898 = f;
        this.f11899 = (this.f11897 / 3.0f) + f;
    }
}
