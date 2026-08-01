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
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p273.C9056;
import p274.C9072;
import p277.AbstractC9077;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ActivityScreenShotImageView extends ImageView {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean f11956 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11957;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f11958;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C9056 f11959;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f11960;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f11961;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f11962;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f11963;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f11964;

    public ActivityScreenShotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11958 = false;
        setLayerType(f11956 ? 2 : 1, null);
    }

    private ViewGroup getDecorView() {
        C9056 c9056 = this.f11959;
        if (c9056 != null) {
            return (ViewGroup) c9056.m8617().getWindow().getDecorView();
        }
        Activity activityM14325 = C9072.m14325();
        if (activityM14325 != null) {
            return activityM14325 instanceof DialogXFloatingWindowActivity ? (ViewGroup) ((DialogXFloatingWindowActivity) activityM14325).getFromActivity().getWindow().getDecorView() : (ViewGroup) activityM14325.getWindow().getDecorView();
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
        if (!this.f11958) {
            super.onDraw(canvas);
        }
        float f = this.f11964;
        float f2 = this.f11963;
        if (f >= f2 && this.f11962 > f2) {
            if (this.f11961) {
                canvas.drawColor(-16777216);
            }
            Path path = new Path();
            path.moveTo(this.f11963, 0.0f);
            path.lineTo(this.f11964 - this.f11963, 0.0f);
            float f3 = this.f11964;
            path.quadTo(f3, 0.0f, f3, this.f11963);
            path.lineTo(this.f11964, this.f11962 - this.f11963);
            float f4 = this.f11964;
            float f5 = this.f11962;
            path.quadTo(f4, f5, f4 - this.f11963, f5);
            path.lineTo(this.f11963, this.f11962);
            float f6 = this.f11962;
            path.quadTo(0.0f, f6, 0.0f, f6 - this.f11963);
            path.lineTo(0.0f, this.f11963);
            path.quadTo(0.0f, 0.0f, this.f11963, 0.0f);
            canvas.clipPath(path);
        }
        canvas.drawColor(-1);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f11964 != getWidth() || this.f11962 != getHeight()) {
            m8628();
        }
        this.f11964 = getWidth();
        this.f11962 = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f11961) {
            return;
        }
        m8628();
    }

    public void setRadius(float f) {
        this.f11963 = f;
        invalidate();
    }

    public void setScale(float f) {
        setScaleX(f);
        setScaleY(f);
        this.f11958 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8628() {
        if (isAttachedToWindow()) {
            if (this.f11957 == getMeasuredWidth() && this.f11960 == getMeasuredHeight()) {
                return;
            }
            this.f11957 = getMeasuredWidth();
            this.f11960 = getMeasuredHeight();
            ViewGroup decorView = getDecorView();
            if (decorView == null) {
                return;
            }
            m8629(decorView);
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8629(ViewGroup viewGroup) {
        if (viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0) {
            return;
        }
        this.f11959.m8614().setVisibility(8);
        setContentViewVisibility(true);
        if (viewGroup.getHeight() + viewGroup.getWidth() == 0) {
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            viewGroup.layout(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            viewGroup.draw(new Canvas(bitmapCreateBitmap));
        } catch (Exception e) {
            AbstractC5754 abstractC5754 = AbstractC9077.f23168;
            e.printStackTrace();
            if (f11956) {
                f11956 = false;
                setLayerType(1, null);
                m8629(viewGroup);
            }
        }
        setImageBitmap(Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, viewGroup.getWidth(), viewGroup.getHeight()));
        this.f11961 = true;
        setContentViewVisibility(false);
        this.f11959.m8614().setVisibility(0);
        this.f11959.m8614().requestFocus();
    }

    public void setContentViewVisibility(boolean z) {
    }
}
