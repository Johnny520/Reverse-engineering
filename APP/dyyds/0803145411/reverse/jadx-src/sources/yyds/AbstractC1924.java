package yyds;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.qmdeve.blurview.BlurNative;
import com.qmdeve.blurview.widget.BlurView;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲀᛱᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1924 extends View {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public Handler f9686;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public View f9687;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Bitmap f9688;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final Rect f9689;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final Handler f9690;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public Bitmap f9691;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public float f9692;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final WeakHashMap f9693;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public float f9694;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean f9695;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public float f9696;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final Set f9697;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final Path f9698;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public float f9699;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f9700;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final RectF f9701;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public float f9702;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final Paint f9703;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final Rect f9704;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public boolean f9705;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public HandlerThread f9706;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public boolean f9707;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Canvas f9708;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public boolean f9709;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public boolean f9710;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public float f9711;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f9712;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public boolean f9713;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean f9714;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final BlurNative f9715;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public float f9716;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public final ViewTreeObserverOnPreDrawListenerC0935 f9717;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final WeakHashMap f9718;

    /* JADX WARN: Type inference failed for: r4v1, types: [yyds.ᛴᲀᛷ] */
    public AbstractC1924(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9692 = 0.0f;
        this.f9700 = true;
        this.f9703 = new Paint(2);
        this.f9704 = new Rect();
        this.f9689 = new Rect();
        this.f9701 = new RectF();
        this.f9698 = new Path();
        this.f9693 = new WeakHashMap();
        this.f9718 = new WeakHashMap();
        this.f9697 = Collections.newSetFromMap(new WeakHashMap());
        this.f9690 = new Handler(Looper.getMainLooper());
        this.f9709 = true;
        this.f9710 = false;
        this.f9713 = false;
        this.f9705 = false;
        this.f9707 = false;
        final BlurView blurView = (BlurView) this;
        this.f9717 = new ViewTreeObserver.OnPreDrawListener() { // from class: yyds.ᛴᲀᛷ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                BlurView blurView2 = blurView;
                if (!blurView2.isShown()) {
                    return true;
                }
                if (blurView2.m3715()) {
                    blurView2.postInvalidateOnAnimation();
                }
                blurView2.f9710 = false;
                return true;
            }
        };
        this.f9715 = new BlurNative();
        HandlerThread handlerThread = new HandlerThread("BlurViewPixelCopy");
        this.f9706 = handlerThread;
        handlerThread.start();
        this.f9686 = new Handler(this.f9706.getLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0835.f3820);
        blurView.f9716 = typedArrayObtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 25.0f, blurView.getResources().getDisplayMetrics()));
        blurView.f9712 = typedArrayObtainStyledAttributes.getColor(5, -1426063361);
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        blurView.f9699 = dimension;
        blurView.f9696 = typedArrayObtainStyledAttributes.getDimension(6, dimension);
        blurView.f9711 = typedArrayObtainStyledAttributes.getDimension(7, blurView.f9699);
        blurView.f9694 = typedArrayObtainStyledAttributes.getDimension(1, blurView.f9699);
        blurView.f9702 = typedArrayObtainStyledAttributes.getDimension(2, blurView.f9699);
        blurView.f9692 = typedArrayObtainStyledAttributes.getFloat(4, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private Window getActivityWindow() {
        Context context = getContext();
        for (int i = 0; i < 4 && !(context instanceof Activity) && (context instanceof ContextWrapper); i++) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow();
        }
        return null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.f9714) {
            return;
        }
        if (this.f9709 || this.f9710) {
            m3715();
            this.f9709 = false;
            this.f9710 = false;
        }
        super.draw(canvas);
    }

    public View getActivityDecorView() {
        Context context = getContext();
        for (int i = 0; i < 4 && !(context instanceof Activity) && (context instanceof ContextWrapper); i++) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView();
        }
        return null;
    }

    public int getBlurRounds() {
        BlurNative blurNative = this.f9715;
        if (blurNative != null) {
            return blurNative.f450;
        }
        return -1;
    }

    public Bitmap getBlurredBitmap() {
        return this.f9691;
    }

    public float getBottomLeftCornerRadius() {
        return this.f9694;
    }

    public float getBottomRightCornerRadius() {
        return this.f9702;
    }

    public float getCornerRadius() {
        return this.f9699;
    }

    public int getOverlayColor() {
        return this.f9712;
    }

    public float getTopLeftCornerRadius() {
        return this.f9696;
    }

    public float getTopRightCornerRadius() {
        return this.f9711;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View activityDecorView = getActivityDecorView();
        this.f9687 = activityDecorView;
        if (activityDecorView != null) {
            activityDecorView.getViewTreeObserver().addOnPreDrawListener(this.f9717);
            this.f9695 = this.f9687.getRootView() != getRootView();
            this.f9709 = true;
            this.f9710 = true;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f9687;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f9717);
            this.f9687 = null;
        }
        m3718();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!AbstractC1960.f9828 || this.f9714) {
            Bitmap bitmap = this.f9691;
            Path path = this.f9698;
            RectF rectF = this.f9701;
            Rect rect = this.f9689;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                int height = this.f9691.getHeight();
                Rect rect2 = this.f9704;
                rect2.set(0, 0, width, height);
                rect.set(0, 0, getWidth(), getHeight());
                if (m3721()) {
                    canvas.save();
                    rectF.set(rect);
                    m3714(rectF);
                    canvas.clipPath(path);
                    canvas.drawBitmap(this.f9691, rect2, rect, (Paint) null);
                    canvas.restore();
                } else {
                    canvas.drawBitmap(this.f9691, rect2, rect, (Paint) null);
                }
            }
            int i = this.f9712;
            Paint paint = this.f9703;
            paint.setColor(i);
            if (!m3721()) {
                canvas.drawRect(rect, paint);
                return;
            }
            canvas.save();
            rectF.set(rect);
            m3714(rectF);
            canvas.clipPath(path);
            canvas.drawRect(rect, paint);
            canvas.restore();
        }
    }

    public void setBlurRadius(float f) {
        if (this.f9716 == f || f < 0.0f) {
            return;
        }
        this.f9716 = f;
        this.f9700 = true;
        this.f9710 = true;
        invalidate();
    }

    public void setBlurRounds(int i) {
        BlurNative blurNative = this.f9715;
        if (blurNative != null) {
            blurNative.getClass();
            blurNative.f450 = Math.max(1, Math.min(15, i));
            this.f9700 = true;
            this.f9710 = true;
            invalidate();
        }
    }

    public void setBottomLeftCornerRadius(float f) {
        if (this.f9694 == f || f < 0.0f) {
            return;
        }
        this.f9694 = f;
        this.f9710 = true;
        invalidate();
    }

    public void setBottomRightCornerRadius(float f) {
        if (this.f9702 == f || f < 0.0f) {
            return;
        }
        this.f9702 = f;
        this.f9710 = true;
        invalidate();
    }

    public void setCornerRadius(float f) {
        if (f >= 0.0f) {
            if (this.f9699 == f && this.f9696 == f && this.f9711 == f && this.f9694 == f && this.f9702 == f) {
                return;
            }
            this.f9699 = f;
            this.f9696 = f;
            this.f9711 = f;
            this.f9694 = f;
            this.f9702 = f;
            this.f9710 = true;
            invalidate();
        }
    }

    public void setDownsampleFactor(float f) {
        if (this.f9692 == f || f < 0.0f) {
            return;
        }
        this.f9692 = f;
        this.f9700 = true;
        this.f9710 = true;
        invalidate();
    }

    public void setOverlayColor(int i) {
        if (this.f9712 != i) {
            this.f9712 = i;
            this.f9710 = true;
            invalidate();
        }
    }

    public void setTopLeftCornerRadius(float f) {
        if (this.f9696 == f || f < 0.0f) {
            return;
        }
        this.f9696 = f;
        this.f9710 = true;
        invalidate();
    }

    public void setTopRightCornerRadius(float f) {
        if (this.f9711 == f || f < 0.0f) {
            return;
        }
        this.f9711 = f;
        this.f9710 = true;
        invalidate();
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m3714(RectF rectF) {
        float f = this.f9696;
        float f2 = this.f9711;
        float f3 = this.f9694;
        float f4 = this.f9702;
        Path path = this.f9698;
        path.reset();
        if (f <= 0.0f && f2 <= 0.0f && f3 <= 0.0f && f4 <= 0.0f) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
        float fMax = Math.max(0.0f, Math.min(f, fMin));
        float fMax2 = Math.max(0.0f, Math.min(f2, fMin));
        float fMax3 = Math.max(0.0f, Math.min(f3, fMin));
        float fMax4 = Math.max(0.0f, Math.min(f4, fMin));
        float f5 = fMax * 0.5522848f;
        float f6 = fMax2 * 0.5522848f;
        float f7 = fMax4 * 0.5522848f;
        float f8 = 0.5522848f * fMax3;
        path.moveTo(rectF.left + fMax, rectF.top);
        path.lineTo(rectF.right - fMax2, rectF.top);
        float f9 = rectF.right;
        float f10 = rectF.top;
        float f11 = f10 + fMax2;
        path.cubicTo((f9 - fMax2) + f6, f10, f9, f11 - f6, f9, f11);
        path.lineTo(rectF.right, rectF.bottom - fMax4);
        float f12 = rectF.right;
        float f13 = rectF.bottom;
        float f14 = f12 - fMax4;
        path.cubicTo(f12, (f13 - fMax4) + f7, f14 + f7, f13, f14, f13);
        path.lineTo(rectF.left + fMax3, rectF.bottom);
        float f15 = rectF.left;
        float f16 = rectF.bottom;
        float f17 = f16 - fMax3;
        path.cubicTo((f15 + fMax3) - f8, f16, f15, f17 + f8, f15, f17);
        path.lineTo(rectF.left, rectF.top + fMax);
        float f18 = rectF.left;
        float f19 = rectF.top;
        float f20 = f18 + fMax;
        path.cubicTo(f18, (f19 + fMax) - f5, f20 - f5, f19, f20, f19);
        path.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3715() {
        StringBuilder sb;
        if (isShown() && this.f9687 != null) {
            Bitmap bitmap = this.f9691;
            float f = this.f9716;
            if (f <= 0.0f) {
                m3718();
                return false;
            }
            float f2 = this.f9692;
            float f3 = f2 > 0.0f ? f2 : 2.52f;
            float f4 = f / f3;
            if (f2 <= 0.0f && f4 > 25.0f) {
                f3 *= f4 / 25.0f;
                f4 = 25.0f;
            }
            int width = getWidth();
            int height = getHeight();
            if (width != 0 && height != 0) {
                int iMax = Math.max(1, Math.round(width / f3));
                int iMax2 = Math.max(1, Math.round(height / f3));
                boolean z = this.f9700;
                Bitmap bitmap2 = this.f9691;
                if (bitmap2 != null && bitmap2.getWidth() == iMax && this.f9691.getHeight() == iMax2) {
                    if (z) {
                    }
                    if (this.f9691 == bitmap) {
                    }
                    if (this.f9705) {
                    }
                } else {
                    Bitmap bitmap3 = this.f9688;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        this.f9688 = null;
                    }
                    Bitmap bitmap4 = this.f9691;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        this.f9691 = null;
                    }
                    this.f9708 = null;
                    try {
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        this.f9688 = Bitmap.createBitmap(iMax, iMax2, config);
                        this.f9708 = new Canvas(this.f9688);
                        this.f9691 = Bitmap.createBitmap(iMax, iMax2, config);
                        this.f9688 = AbstractC1960.m3778(this.f9688);
                        this.f9691 = AbstractC1960.m3778(this.f9691);
                        z = true;
                        if (z) {
                            BlurNative blurNative = this.f9715;
                            blurNative.getClass();
                            blurNative.f449 = Math.max(2.0f, Math.min(100.0f, f4));
                            this.f9700 = false;
                        }
                        boolean z2 = this.f9691 == bitmap;
                        if (this.f9705) {
                            int[] iArr = new int[2];
                            int[] iArr2 = new int[2];
                            this.f9687.getLocationOnScreen(iArr);
                            getLocationOnScreen(iArr2);
                            int i = iArr2[0] - iArr[0];
                            int i2 = iArr2[1] - iArr[1];
                            this.f9688.eraseColor(0);
                            int iSave = this.f9708.save();
                            this.f9714 = true;
                            AbstractC1960.f9828 = true;
                            try {
                                float width2 = (this.f9688.getWidth() * 1.0f) / getWidth();
                                float height2 = (this.f9688.getHeight() * 1.0f) / getHeight();
                                this.f9708.scale(width2, height2);
                                float f5 = -i;
                                float f6 = -i2;
                                this.f9708.translate(f5, f6);
                                try {
                                    this.f9687.draw(this.f9708);
                                } catch (IllegalArgumentException e) {
                                    if (e.getMessage() == null || !e.getMessage().contains("Software rendering doesn't support hardware bitmaps")) {
                                        throw e;
                                    }
                                    Log.w("BaseBlurView", "Hardware bitmap detected during draw, converting and retrying");
                                    AbstractC1960.m3793(this.f9687);
                                    try {
                                        this.f9708.restoreToCount(iSave);
                                        iSave = this.f9708.save();
                                        this.f9708.scale(width2, height2);
                                        this.f9708.translate(f5, f6);
                                        this.f9687.draw(this.f9708);
                                    } catch (Exception e2) {
                                        Log.e("BaseBlurView", "Retry after hardware bitmap conversion failed: " + e2.getMessage() + ". Switching to PixelCopy fallback.");
                                        this.f9705 = true;
                                        m3720();
                                        this.f9714 = false;
                                        AbstractC1960.f9828 = false;
                                        try {
                                            Canvas canvas = this.f9708;
                                            if (canvas != null && iSave >= 0) {
                                                canvas.restoreToCount(iSave);
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            sb = new StringBuilder("error: ");
                                            sb.append(e.getMessage());
                                            Log.w("BaseBlurView", sb.toString());
                                        }
                                    }
                                } catch (IndexOutOfBoundsException e4) {
                                    Log.w("BaseBlurView", "View hierarchy changed during blur operation: " + e4.getMessage());
                                    this.f9705 = true;
                                    m3720();
                                    this.f9714 = false;
                                    AbstractC1960.f9828 = false;
                                    try {
                                        Canvas canvas2 = this.f9708;
                                        if (canvas2 != null && iSave >= 0) {
                                            canvas2.restoreToCount(iSave);
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        sb = new StringBuilder("error: ");
                                        sb.append(e.getMessage());
                                        Log.w("BaseBlurView", sb.toString());
                                    }
                                }
                                m3719(this.f9687, this.f9708);
                                m3717(this.f9687, this.f9708);
                                m3716(this.f9688, this.f9691);
                                return z2 || this.f9695 || this.f9710;
                            } finally {
                                this.f9714 = false;
                                AbstractC1960.f9828 = false;
                                try {
                                    Canvas canvas3 = this.f9708;
                                    if (canvas3 != null && iSave >= 0) {
                                        canvas3.restoreToCount(iSave);
                                    }
                                } catch (Exception e6) {
                                    Log.w("BaseBlurView", "error: " + e6.getMessage());
                                }
                            }
                        }
                        m3720();
                        if (z2 || this.f9695 || this.f9710) {
                            return true;
                        }
                    } catch (OutOfMemoryError unused) {
                        m3718();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3716(Bitmap bitmap, Bitmap bitmap2) {
        BlurNative blurNative = this.f9715;
        try {
            blurNative.m301(AbstractC1960.m3778(bitmap), bitmap2);
        } catch (IllegalArgumentException e) {
            if (e.getMessage() == null || !e.getMessage().contains("Software rendering doesn't support hardware bitmaps")) {
                throw e;
            }
            Log.e("BaseBlurView", "Hardware bitmap error detected, converting and retrying");
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCopy = bitmap.copy(config, false);
            Bitmap bitmapCopy2 = bitmap2.copy(config, false);
            if (bitmapCopy == null || bitmapCopy2 == null) {
                C1693.m3442("Failed to convert hardware bitmaps for blur processing", e);
            } else {
                blurNative.m301(bitmapCopy, bitmapCopy2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3717(View view, Canvas canvas) {
        if (!(view instanceof SurfaceView)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m3717(viewGroup.getChildAt(i), canvas);
                }
                return;
            }
            return;
        }
        final SurfaceView surfaceView = (SurfaceView) view;
        if (surfaceView.getVisibility() == 0) {
            Set set = this.f9697;
            if (!set.contains(surfaceView)) {
                try {
                    surfaceView.setZOrderMediaOverlay(true);
                    Log.i("BaseBlurView", "Automatically configured SurfaceView with setZOrderMediaOverlay(true) for proper blur rendering");
                    set.add(surfaceView);
                } catch (Exception e) {
                    Log.e("BaseBlurView", "Failed to auto-configure SurfaceView: " + e.getMessage());
                }
            }
            if (!this.f9713) {
                Log.i("BaseBlurView", "SurfaceView detected and automatically configured for blur. Note: There may be a slight lag (1-2 frames) due to asynchronous PixelCopy.");
                this.f9713 = true;
            }
            Bitmap bitmap = (Bitmap) this.f9693.get(surfaceView);
            if (bitmap != null && !bitmap.isRecycled()) {
                int[] iArr = new int[2];
                this.f9687.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                surfaceView.getLocationOnScreen(iArr2);
                int i2 = iArr2[0] - iArr[0];
                int i3 = iArr2[1] - iArr[1];
                canvas.save();
                canvas.translate(i2, i3);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
            }
            Boolean bool = Boolean.TRUE;
            WeakHashMap weakHashMap = this.f9718;
            if (bool.equals(weakHashMap.get(surfaceView)) || surfaceView.getWidth() <= 0 || surfaceView.getHeight() <= 0) {
                return;
            }
            if (surfaceView.getHolder().getSurface() == null || !surfaceView.getHolder().getSurface().isValid()) {
                postInvalidateDelayed(100L);
                return;
            }
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
            weakHashMap.put(surfaceView, bool);
            try {
                Handler handler = this.f9686;
                if (handler == null) {
                    handler = this.f9690;
                }
                PixelCopy.request(surfaceView, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: yyds.ᲈᲇᛷᛷ
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i4) {
                        AbstractC1924 abstractC1924 = this.f13640;
                        abstractC1924.f9690.post(new RunnableC2555(abstractC1924, surfaceView, i4, bitmapCreateBitmap));
                    }
                }, handler);
            } catch (IllegalArgumentException e2) {
                Log.e("BaseBlurView", "PixelCopy request failed: " + e2.getMessage() + ". Make sure surfaceView.setZOrderMediaOverlay(true) is called.");
                weakHashMap.put(surfaceView, Boolean.FALSE);
                bitmapCreateBitmap.recycle();
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m3718() {
        Bitmap bitmap = this.f9688;
        if (bitmap != null) {
            bitmap.recycle();
            this.f9688 = null;
        }
        Bitmap bitmap2 = this.f9691;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f9691 = null;
        }
        this.f9708 = null;
        this.f9715.getClass();
        HandlerThread handlerThread = this.f9706;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f9706 = null;
            this.f9686 = null;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3719(View view, Canvas canvas) {
        if (!(view instanceof TextureView)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m3719(viewGroup.getChildAt(i), canvas);
                }
                return;
            }
            return;
        }
        TextureView textureView = (TextureView) view;
        if (textureView.getVisibility() == 0 && textureView.isAvailable()) {
            int[] iArr = new int[2];
            this.f9687.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            textureView.getLocationOnScreen(iArr2);
            int i2 = iArr2[0] - iArr[0];
            int i3 = iArr2[1] - iArr[1];
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                    Log.d("BaseBlurView", "Converting hardware bitmap to software bitmap for blur processing");
                    try {
                        bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                    } catch (Exception e) {
                        Log.e("BaseBlurView", "Failed to convert hardware bitmap: " + e.getMessage());
                    }
                }
                canvas.save();
                canvas.translate(i2, i3);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
                bitmap.recycle();
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m3720() {
        Window activityWindow;
        if (this.f9707 || (activityWindow = getActivityWindow()) == null) {
            return;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], getWidth() + i, getHeight() + iArr[1]);
        this.f9707 = true;
        try {
            Handler handler = this.f9686;
            if (handler == null) {
                handler = this.f9690;
            }
            PixelCopy.request(activityWindow, rect, this.f9688, new PixelCopy.OnPixelCopyFinishedListener() { // from class: yyds.ᲀᛸᲁᛱ
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i2) {
                    AbstractC1924 abstractC1924 = this.f10199;
                    abstractC1924.f9690.post(new RunnableC0254(abstractC1924, i2, 0));
                }
            }, handler);
        } catch (IllegalArgumentException e) {
            this.f9707 = false;
            Log.e("BaseBlurView", "PixelCopy fallback exception: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean m3721() {
        return this.f9696 > 0.0f || this.f9711 > 0.0f || this.f9694 > 0.0f || this.f9702 > 0.0f;
    }
}
