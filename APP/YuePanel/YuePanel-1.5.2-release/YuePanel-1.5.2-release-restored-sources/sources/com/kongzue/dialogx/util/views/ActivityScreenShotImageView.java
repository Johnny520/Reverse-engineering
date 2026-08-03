package com.kongzue.dialogx.util.views;

import Yue.C8273;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.impl.ActivityLifecycleImpl;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class ActivityScreenShotImageView extends ImageView {
    public static boolean hideContentView = false;
    public static boolean useHardwareRenderingMode = true;
    private WeakReference<View> contentView;
    BaseDialog dialog;
    float height;
    public boolean hideActivityContentView;
    private boolean inited;
    private boolean isScreenshotSuccess;
    float mRadius;
    boolean readyDraw;
    private int screenHeight;
    private int screenWidth;
    float width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActivityScreenShotImageView(Context context) {
        super(context);
        this.readyDraw = false;
        this.inited = false;
        init(null);
    }

    private void doScreenshotActivityAndZoom() {
        ViewGroup decorView = getDecorView();
        if (decorView == null) {
            return;
        }
        drawViewImage(decorView);
        setVisibility(0);
        this.inited = true;
    }

    private void drawViewImage(View view) {
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return;
        }
        this.dialog.getDialogView().setVisibility(8);
        setContentViewVisibility(true);
        if (view.getWidth() + view.getHeight() == 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            view.draw(new Canvas(bitmapCreateBitmap));
        } catch (Exception e) {
            if (DialogX.DEBUGMODE) {
                e.printStackTrace();
            }
            if (useHardwareRenderingMode) {
                useHardwareRenderingMode = false;
                requestLayoutType();
                drawViewImage(view);
            }
        }
        setImageBitmap(Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, view.getWidth(), view.getHeight()));
        this.isScreenshotSuccess = true;
        setContentViewVisibility(false);
        this.dialog.getDialogView().setVisibility(0);
        this.dialog.getDialogView().requestFocus();
    }

    private ViewGroup getDecorView() {
        BaseDialog baseDialog = this.dialog;
        if (baseDialog != null) {
            return (ViewGroup) baseDialog.getOwnActivity().getWindow().getDecorView();
        }
        Activity topActivity = ActivityLifecycleImpl.getTopActivity();
        if (topActivity != null) {
            return topActivity instanceof DialogXFloatingWindowActivity ? (ViewGroup) ((DialogXFloatingWindowActivity) topActivity).getFromActivity().getWindow().getDecorView() : (ViewGroup) topActivity.getWindow().getDecorView();
        }
        return null;
    }

    private void init(AttributeSet attributeSet) {
        requestLayoutType();
    }

    private void refreshImage() {
        if (isAttachedToWindow()) {
            if (this.screenWidth == getMeasuredWidth() && this.screenHeight == getMeasuredHeight()) {
                return;
            }
            this.screenWidth = getMeasuredWidth();
            this.screenHeight = getMeasuredHeight();
            doScreenshotActivityAndZoom();
        }
    }

    private void requestLayoutType() {
        setLayerType(useHardwareRenderingMode ? 2 : 1, null);
    }

    public void bindDialog(BaseDialog baseDialog) {
        this.dialog = baseDialog;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setContentViewVisibility(true);
        WeakReference<View> weakReference = this.contentView;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.readyDraw) {
            super.onDraw(canvas);
        }
        float f = this.width;
        float f2 = this.mRadius;
        if (f >= f2 && this.height > f2) {
            if (this.isScreenshotSuccess) {
                canvas.drawColor(C8273.f24692);
            }
            Path path = new Path();
            path.moveTo(this.mRadius, 0.0f);
            path.lineTo(this.width - this.mRadius, 0.0f);
            float f3 = this.width;
            path.quadTo(f3, 0.0f, f3, this.mRadius);
            path.lineTo(this.width, this.height - this.mRadius);
            float f4 = this.width;
            float f5 = this.height;
            path.quadTo(f4, f5, f4 - this.mRadius, f5);
            path.lineTo(this.mRadius, this.height);
            float f6 = this.height;
            path.quadTo(0.0f, f6, 0.0f, f6 - this.mRadius);
            path.lineTo(0.0f, this.mRadius);
            path.quadTo(0.0f, 0.0f, this.mRadius, 0.0f);
            canvas.clipPath(path);
        }
        canvas.drawColor(-1);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.width != getWidth() || this.height != getHeight()) {
            refreshImage();
        }
        this.width = getWidth();
        this.height = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.isScreenshotSuccess) {
            return;
        }
        refreshImage();
    }

    public void setContentViewVisibility(boolean z) {
        if (hideContentView || this.hideActivityContentView) {
            if (z) {
                WeakReference<View> weakReference = this.contentView;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                this.contentView.get().setVisibility(0);
                return;
            }
            ViewGroup decorView = getDecorView();
            Objects.requireNonNull(decorView);
            View childAt = decorView.getChildAt(0);
            if (childAt != null) {
                childAt.setVisibility(8);
                this.contentView = new WeakReference<>(childAt);
            }
        }
    }

    public void setRadius(float f) {
        this.mRadius = f;
        invalidate();
    }

    public void setScale(float f) {
        setScaleX(f);
        setScaleY(f);
        this.readyDraw = true;
    }

    public ActivityScreenShotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.readyDraw = false;
        this.inited = false;
        init(attributeSet);
    }

    public ActivityScreenShotImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.readyDraw = false;
        this.inited = false;
        init(attributeSet);
    }
}
