package com.lxj.xpopup.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.RunnableC0062;
import com.lxj.xpopup.util.AbstractC3788;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class LoadingView extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final RunnableC0062 f11893;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int f11894;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int f11895;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ArgbEvaluator f11896;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f11897;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f11898;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f11899;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f11900;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Paint f11901;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float f11902;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f11903;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f11904;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f11905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f11907;

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11907 = 10;
        this.f11905 = 36.0f;
        this.f11906 = 0;
        this.f11897 = 2.0f;
        this.f11896 = new ArgbEvaluator();
        this.f11895 = Color.parseColor("#EEEEEE");
        this.f11894 = Color.parseColor("#111111");
        this.f11893 = new RunnableC0062(this, 12);
        Paint paint = new Paint(1);
        this.f11901 = paint;
        float fM8106 = AbstractC3788.m8106(context, this.f11897);
        this.f11897 = fM8106;
        paint.setStrokeWidth(fM8106);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RunnableC0062 runnableC0062 = this.f11893;
        removeCallbacks(runnableC0062);
        postDelayed(runnableC0062, 80L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f11893);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f11907;
        int i2 = i - 1;
        while (i2 >= 0) {
            int iIntValue = ((Integer) this.f11896.evaluate((((Math.abs(this.f11906 + i2) % i) + 1) * 1.0f) / i, Integer.valueOf(this.f11895), Integer.valueOf(this.f11894))).intValue();
            Paint paint = this.f11901;
            paint.setColor(iIntValue);
            float f = this.f11903;
            float f2 = this.f11899;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f, f2, this.f11904, f2, paint);
            canvas2.drawCircle(this.f11903, this.f11899, this.f11897 / 2.0f, paint);
            canvas2.drawCircle(this.f11904, this.f11899, this.f11897 / 2.0f, paint);
            canvas2.rotate(this.f11905, this.f11900, this.f11899);
            i2--;
            canvas = canvas2;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        this.f11902 = measuredWidth;
        this.f11898 = measuredWidth / 2.5f;
        this.f11900 = getMeasuredWidth() / 2.0f;
        this.f11899 = getMeasuredHeight() / 2.0f;
        float fM8106 = AbstractC3788.m8106(getContext(), 2.0f);
        this.f11897 = fM8106;
        this.f11901.setStrokeWidth(fM8106);
        float f = this.f11900 + this.f11898;
        this.f11903 = f;
        this.f11904 = (this.f11902 / 3.0f) + f;
    }
}
