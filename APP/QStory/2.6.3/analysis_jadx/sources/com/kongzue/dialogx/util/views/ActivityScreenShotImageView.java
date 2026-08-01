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
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p257.C8227;
import p258.C8243;
import p261.AbstractC8248;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ActivityScreenShotImageView extends ImageView {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean f11611 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11612;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f11613;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C8227 f11614;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f11615;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f11616;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f11617;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f11618;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f11619;

    public ActivityScreenShotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11613 = false;
        setLayerType(f11611 ? 2 : 1, null);
    }

    private ViewGroup getDecorView() {
        C8227 c8227 = this.f11614;
        if (c8227 != null) {
            return (ViewGroup) c8227.m8058().getWindow().getDecorView();
        }
        Activity activityM13766 = C8243.m13766();
        if (activityM13766 != null) {
            return activityM13766 instanceof DialogXFloatingWindowActivity ? (ViewGroup) ((DialogXFloatingWindowActivity) activityM13766).getFromActivity().getWindow().getDecorView() : (ViewGroup) activityM13766.getWindow().getDecorView();
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
        if (!this.f11613) {
            super.onDraw(canvas);
        }
        float f = this.f11619;
        float f2 = this.f11618;
        if (f >= f2 && this.f11617 > f2) {
            if (this.f11616) {
                canvas.drawColor(-16777216);
            }
            Path path = new Path();
            path.moveTo(this.f11618, 0.0f);
            path.lineTo(this.f11619 - this.f11618, 0.0f);
            float f3 = this.f11619;
            path.quadTo(f3, 0.0f, f3, this.f11618);
            path.lineTo(this.f11619, this.f11617 - this.f11618);
            float f4 = this.f11619;
            float f5 = this.f11617;
            path.quadTo(f4, f5, f4 - this.f11618, f5);
            path.lineTo(this.f11618, this.f11617);
            float f6 = this.f11617;
            path.quadTo(0.0f, f6, 0.0f, f6 - this.f11618);
            path.lineTo(0.0f, this.f11618);
            path.quadTo(0.0f, 0.0f, this.f11618, 0.0f);
            canvas.clipPath(path);
        }
        canvas.drawColor(-1);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f11619 != getWidth() || this.f11617 != getHeight()) {
            m8069();
        }
        this.f11619 = getWidth();
        this.f11617 = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f11616) {
            return;
        }
        m8069();
    }

    public void setRadius(float f) {
        this.f11618 = f;
        invalidate();
    }

    public void setScale(float f) {
        setScaleX(f);
        setScaleY(f);
        this.f11613 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8069() {
        if (isAttachedToWindow()) {
            if (this.f11612 == getMeasuredWidth() && this.f11615 == getMeasuredHeight()) {
                return;
            }
            this.f11612 = getMeasuredWidth();
            this.f11615 = getMeasuredHeight();
            ViewGroup decorView = getDecorView();
            if (decorView == null) {
                return;
            }
            m8070(decorView);
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8070(ViewGroup viewGroup) {
        if (viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0) {
            return;
        }
        this.f11614.m8055().setVisibility(8);
        setContentViewVisibility(true);
        if (viewGroup.getHeight() + viewGroup.getWidth() == 0) {
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            viewGroup.layout(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            viewGroup.draw(new Canvas(bitmapCreateBitmap));
        } catch (Exception e) {
            AbstractC4922 abstractC4922 = AbstractC8248.f22823;
            e.printStackTrace();
            if (f11611) {
                f11611 = false;
                setLayerType(1, null);
                m8070(viewGroup);
            }
        }
        setImageBitmap(Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, viewGroup.getWidth(), viewGroup.getHeight()));
        this.f11616 = true;
        setContentViewVisibility(false);
        this.f11614.m8055().setVisibility(0);
        this.f11614.m8055().requestFocus();
    }

    public void setContentViewVisibility(boolean z) {
    }
}
