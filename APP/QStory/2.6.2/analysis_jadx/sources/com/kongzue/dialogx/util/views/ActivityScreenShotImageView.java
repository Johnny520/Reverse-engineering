package com.kongzue.dialogx.util.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import p033.AbstractC6325;
import p257.C8226;
import p258.C8242;
import p261.AbstractC8247;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ActivityScreenShotImageView extends ImageView {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean f11606 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11607;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f11608;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C8226 f11609;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f11610;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f11611;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f11612;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f11613;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f11614;

    public ActivityScreenShotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11608 = false;
        setLayerType(f11606 ? 2 : 1, null);
    }

    private ViewGroup getDecorView() {
        C8226 c8226 = this.f11609;
        if (c8226 != null) {
            return (ViewGroup) c8226.m8071().getWindow().getDecorView();
        }
        Activity activityM13749 = C8242.m13749();
        if (activityM13749 != null) {
            return activityM13749 instanceof DialogXFloatingWindowActivity ? (ViewGroup) ((DialogXFloatingWindowActivity) activityM13749).getFromActivity().getWindow().getDecorView() : (ViewGroup) activityM13749.getWindow().getDecorView();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setContentViewVisibility(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.f11608) {
            super.onDraw(canvas);
        }
        float f = this.f11614;
        float f2 = this.f11613;
        if (f >= f2 && this.f11612 > f2) {
            if (this.f11611) {
                canvas.drawColor(-16777216);
            }
            Path path = new Path();
            path.moveTo(this.f11613, 0.0f);
            path.lineTo(this.f11614 - this.f11613, 0.0f);
            float f3 = this.f11614;
            path.quadTo(f3, 0.0f, f3, this.f11613);
            path.lineTo(this.f11614, this.f11612 - this.f11613);
            float f4 = this.f11614;
            float f5 = this.f11612;
            path.quadTo(f4, f5, f4 - this.f11613, f5);
            path.lineTo(this.f11613, this.f11612);
            float f6 = this.f11612;
            path.quadTo(0.0f, f6, 0.0f, f6 - this.f11613);
            path.lineTo(0.0f, this.f11613);
            path.quadTo(0.0f, 0.0f, this.f11613, 0.0f);
            canvas.clipPath(path);
        }
        canvas.drawColor(-1);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f11614 != getWidth() || this.f11612 != getHeight()) {
            m8082();
        }
        this.f11614 = getWidth();
        this.f11612 = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f11611) {
            return;
        }
        m8082();
    }

    public void setRadius(float f) {
        this.f11613 = f;
        invalidate();
    }

    public void setScale(float f) {
        setScaleX(f);
        setScaleY(f);
        this.f11608 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8082() {
        if (isAttachedToWindow()) {
            if (this.f11607 == getMeasuredWidth() && this.f11610 == getMeasuredHeight()) {
                return;
            }
            this.f11607 = getMeasuredWidth();
            this.f11610 = getMeasuredHeight();
            ViewGroup decorView = getDecorView();
            if (decorView == null) {
                return;
            }
            m8083(decorView);
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8083(ViewGroup viewGroup) {
        if (viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0) {
            return;
        }
        this.f11609.m8068().setVisibility(8);
        setContentViewVisibility(true);
        if (viewGroup.getHeight() + viewGroup.getWidth() == 0) {
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            viewGroup.layout(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            viewGroup.draw(new Canvas(bitmapCreateBitmap));
        } catch (Exception e) {
            AbstractC6325 abstractC6325 = AbstractC8247.f22824;
            e.printStackTrace();
            if (f11606) {
                f11606 = false;
                setLayerType(1, null);
                m8083(viewGroup);
            }
        }
        setImageBitmap(Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, viewGroup.getWidth(), viewGroup.getHeight()));
        this.f11611 = true;
        setContentViewVisibility(false);
        this.f11609.m8068().setVisibility(0);
        this.f11609.m8068().requestFocus();
    }

    public void setContentViewVisibility(boolean z) {
    }
}
