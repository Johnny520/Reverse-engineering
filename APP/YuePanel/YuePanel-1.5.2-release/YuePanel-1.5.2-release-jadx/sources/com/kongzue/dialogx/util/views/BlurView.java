package com.kongzue.dialogx.util.views;

import Yue.C8273;
import Yue.InterfaceC3897;
import Yue.InterfaceC6490;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import androidx.renderscript.Allocation;
import androidx.renderscript.Element;
import androidx.renderscript.RenderScript;
import androidx.renderscript.ScriptIntrinsicBlur;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class BlurView extends View {
    public static boolean DEBUGMODE;
    private static int RENDERING_COUNT;
    private static boolean supportRenderScript;
    Paint cutPaint;
    private boolean isInit;
    private Bitmap mBitmapToBlur;
    private Allocation mBlurInput;
    private Allocation mBlurOutput;
    private float mBlurRadius;
    private ScriptIntrinsicBlur mBlurScript;
    private Bitmap mBlurredBitmap;
    private Canvas mBlurringCanvas;
    private View mDecorView;
    private boolean mDifferentRoot;
    private boolean mDirty;
    private float mDownsampleFactor;
    private boolean mIsRendering;
    private int mOverlayColor;
    private Paint mPaint;
    private float mRadius;
    private final Rect mRectDst;
    private RectF mRectF;
    private final Rect mRectSrc;
    private RenderScript mRenderScript;
    Paint overlayPaint;
    private boolean overrideOverlayColor;
    private final ViewTreeObserver.OnPreDrawListener preDrawListener;
    private boolean useBlur;

    static {
        new Thread() { // from class: com.kongzue.dialogx.util.views.BlurView.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    BlurView.class.getClassLoader().loadClass(RenderScript.class.getCanonicalName());
                    boolean unused = BlurView.supportRenderScript = true;
                } catch (Throwable th) {
                    if (BlurView.isDebug()) {
                        th.printStackTrace();
                    }
                    boolean unused2 = BlurView.supportRenderScript = false;
                }
            }
        }.start();
        DEBUGMODE = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDownsampleFactor = 4.0f;
        this.mOverlayColor = -1;
        this.mBlurRadius = 35.0f;
        this.overrideOverlayColor = false;
        this.mRadius = 0.0f;
        this.mRectSrc = new Rect();
        this.mRectDst = new Rect();
        this.isInit = false;
        this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.kongzue.dialogx.util.views.BlurView.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                int[] iArr = new int[2];
                Bitmap bitmap = BlurView.this.mBlurredBitmap;
                View view = BlurView.this.mDecorView;
                if (view != null && BlurView.this.isShown() && BlurView.this.prepare()) {
                    boolean z = BlurView.this.mBlurredBitmap != bitmap;
                    view.getLocationInWindow(iArr);
                    int i = -iArr[0];
                    int i2 = -iArr[1];
                    BlurView.this.getLocationInWindow(iArr);
                    int i3 = i + iArr[0];
                    int i4 = i2 + iArr[1];
                    BlurView.this.mBitmapToBlur.eraseColor(BlurView.this.mOverlayColor & C8273.f24691);
                    int iSave = BlurView.this.mBlurringCanvas.save();
                    BlurView.this.mIsRendering = true;
                    BlurView.access$708();
                    try {
                        try {
                            BlurView.this.mBlurringCanvas.scale((BlurView.this.mBitmapToBlur.getWidth() * 1.0f) / BlurView.this.getWidth(), (BlurView.this.mBitmapToBlur.getHeight() * 1.0f) / BlurView.this.getHeight());
                            BlurView.this.mBlurringCanvas.translate(-i3, -i4);
                            if (view.getBackground() != null) {
                                view.getBackground().draw(BlurView.this.mBlurringCanvas);
                            }
                            view.draw(BlurView.this.mBlurringCanvas);
                        } catch (Exception e) {
                            if (BlurView.isDebug()) {
                                e.printStackTrace();
                            }
                        }
                        BlurView.this.mIsRendering = false;
                        BlurView.access$710();
                        BlurView.this.mBlurringCanvas.restoreToCount(iSave);
                        BlurView blurView = BlurView.this;
                        blurView.blur(blurView.mBitmapToBlur, BlurView.this.mBlurredBitmap);
                        if (z || BlurView.this.mDifferentRoot) {
                            BlurView.this.invalidate();
                        }
                    } catch (Throwable th) {
                        BlurView.this.mIsRendering = false;
                        BlurView.access$710();
                        BlurView.this.mBlurringCanvas.restoreToCount(iSave);
                        throw th;
                    }
                }
                return true;
            }
        };
        this.useBlur = true;
        init(context, attributeSet);
    }

    public static /* synthetic */ int access$708() {
        int i = RENDERING_COUNT;
        RENDERING_COUNT = i + 1;
        return i;
    }

    public static /* synthetic */ int access$710() {
        int i = RENDERING_COUNT;
        RENDERING_COUNT = i - 1;
        return i;
    }

    private void drawBlurredBitmapCompat(Canvas canvas) {
        if (this.mBlurredBitmap == null) {
            Bitmap bitmapDrawOverlyColor = drawOverlyColor(Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888));
            if (bitmapDrawOverlyColor != null) {
                canvas.drawBitmap(bitmapDrawOverlyColor, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        this.mRectDst.right = getWidth();
        this.mRectDst.bottom = getHeight();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        Bitmap roundedCornerBitmap = getRoundedCornerBitmap(resizeImage(this.mBlurredBitmap, getWidth(), getHeight()), this.mRectDst);
        if (roundedCornerBitmap != null) {
            canvas.drawBitmap(roundedCornerBitmap, 0.0f, 0.0f, (Paint) null);
            return;
        }
        Bitmap bitmapDrawOverlyColor2 = drawOverlyColor(Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888));
        if (bitmapDrawOverlyColor2 != null) {
            canvas.drawBitmap(bitmapDrawOverlyColor2, 0.0f, 0.0f, (Paint) null);
        }
    }

    private Bitmap drawOverlyColor(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rect = new Rect();
        rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawBitmap(bitmap, rect, rect, this.overlayPaint);
        canvas.drawColor(needRemoveAlphaColor() ? removeAlphaColor(this.mOverlayColor) : this.mOverlayColor);
        return bitmapCreateBitmap;
    }

    public static void error(Object obj) {
        if (isDebug()) {
            Log.e(">>>", obj.toString());
        }
    }

    private Bitmap getRoundedCornerBitmap(Bitmap bitmap, Rect rect) {
        Bitmap bitmapDrawOverlyColor = drawOverlyColor(resizeImage(bitmap, rect.width(), rect.height()));
        if (bitmapDrawOverlyColor == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDrawOverlyColor.getWidth(), bitmapDrawOverlyColor.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapDrawOverlyColor, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(rect);
        float f = this.mRadius;
        canvas.drawRoundRect(rectF, f, f, paint);
        return bitmapCreateBitmap;
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (this.isInit || context == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2413R.styleable.RealtimeBlurView);
        this.mBlurRadius = typedArrayObtainStyledAttributes.getDimension(C2413R.styleable.RealtimeBlurView_realtimeBlurRadius, TypedValue.applyDimension(1, 35.0f, context.getResources().getDisplayMetrics()));
        this.mDownsampleFactor = typedArrayObtainStyledAttributes.getFloat(C2413R.styleable.RealtimeBlurView_realtimeDownsampleFactor, 4.0f);
        this.mOverlayColor = typedArrayObtainStyledAttributes.getColor(C2413R.styleable.RealtimeBlurView_realtimeOverlayColor, C8273.f24691);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mRectF = new RectF();
        Paint paint2 = new Paint();
        this.cutPaint = paint2;
        paint2.setAntiAlias(true);
        this.cutPaint.setColor(this.mOverlayColor);
        Paint paint3 = new Paint();
        this.overlayPaint = paint3;
        paint3.setAntiAlias(true);
        this.mRadius = typedArrayObtainStyledAttributes.getDimension(C2413R.styleable.RealtimeBlurView_realtimeRadius, TypedValue.applyDimension(1, 15.0f, context.getResources().getDisplayMetrics()));
        typedArrayObtainStyledAttributes.recycle();
        this.isInit = true;
        if (isCompatMode()) {
            return;
        }
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.kongzue.dialogx.util.views.BlurView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), BlurView.this.mRadius);
            }
        });
        setClipToOutline(true);
    }

    private boolean isCompatMode() {
        return false;
    }

    public static boolean isDebug() {
        return DEBUGMODE && DialogX.DEBUGMODE;
    }

    private static void log(Object obj) {
        if (isDebug()) {
            Log.i(">>>", "DialogX.BlurView: " + obj.toString());
        }
    }

    private boolean needRemoveAlphaColor() {
        if (this.overrideOverlayColor) {
            return false;
        }
        return (supportRenderScript && this.useBlur) ? false : true;
    }

    private void releaseBitmap() {
        Allocation allocation = this.mBlurInput;
        if (allocation != null) {
            allocation.destroy();
            this.mBlurInput = null;
        }
        Allocation allocation2 = this.mBlurOutput;
        if (allocation2 != null) {
            allocation2.destroy();
            this.mBlurOutput = null;
        }
        Bitmap bitmap = this.mBitmapToBlur;
        if (bitmap != null) {
            bitmap.recycle();
            this.mBitmapToBlur = null;
        }
        Bitmap bitmap2 = this.mBlurredBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.mBlurredBitmap = null;
        }
    }

    private void releaseScript() {
        RenderScript renderScript = this.mRenderScript;
        if (renderScript != null) {
            renderScript.destroy();
            this.mRenderScript = null;
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.mBlurScript;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.mBlurScript = null;
        }
    }

    private static int removeAlphaColor(@InterfaceC3897 int i) {
        return Color.argb(255, Color.red(i), Color.green(i), Color.blue(i));
    }

    private static int replaceAlphaColor(@InterfaceC3897 int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    private Bitmap resizeImage(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public void blur(Bitmap bitmap, Bitmap bitmap2) {
        this.mBlurInput.copyFrom(bitmap);
        this.mBlurScript.setInput(this.mBlurInput);
        this.mBlurScript.forEach(this.mBlurOutput);
        this.mBlurOutput.copyTo(bitmap2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.useBlur && supportRenderScript) {
            if (this.mIsRendering || RENDERING_COUNT > 0) {
                return;
            }
            super.draw(canvas);
            return;
        }
        this.mRectF.right = getWidth();
        this.mRectF.bottom = getHeight();
        this.overlayPaint.setColor(needRemoveAlphaColor() ? removeAlphaColor(this.mOverlayColor) : this.mOverlayColor);
        RectF rectF = this.mRectF;
        float f = this.mRadius;
        canvas.drawRoundRect(rectF, f, f, this.overlayPaint);
    }

    public void drawBlurredBitmap(Canvas canvas, Bitmap bitmap) {
        if (bitmap == null) {
            Bitmap bitmapDrawOverlyColor = drawOverlyColor(Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888));
            if (bitmapDrawOverlyColor != null) {
                canvas.drawBitmap(bitmapDrawOverlyColor, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        this.mRectSrc.right = bitmap.getWidth();
        this.mRectSrc.bottom = bitmap.getHeight();
        this.mRectDst.right = getWidth();
        this.mRectDst.bottom = getHeight();
        canvas.drawBitmap(bitmap, this.mRectSrc, this.mRectDst, (Paint) null);
        canvas.drawColor(needRemoveAlphaColor() ? removeAlphaColor(this.mOverlayColor) : this.mOverlayColor);
    }

    public boolean isUseBlur() {
        return this.useBlur;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        log(getContext());
        ViewGroup viewGroup = (ViewGroup) (getContext() instanceof Activity ? (Activity) getContext() : BaseDialog.getTopActivity()).getWindow().getDecorView();
        if (viewGroup.getChildCount() >= 1) {
            this.mDecorView = viewGroup.getChildAt(0);
        }
        if (this.mDecorView == null) {
            log("mDecorView is NULL.");
            this.mDifferentRoot = false;
            return;
        }
        log("mDecorView is ok.");
        this.mDecorView.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
        boolean z = this.mDecorView.getRootView() != getRootView();
        this.mDifferentRoot = z;
        if (z) {
            this.mDecorView.postInvalidate();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        View view = this.mDecorView;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
        }
        release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isCompatMode()) {
            drawBlurredBitmapCompat(canvas);
        } else {
            drawBlurredBitmap(canvas, this.mBlurredBitmap);
        }
    }

    public boolean prepare() {
        Bitmap bitmap;
        if (this.mBlurRadius == 0.0f) {
            release();
            return false;
        }
        float f = this.mDownsampleFactor;
        if ((this.mDirty || this.mRenderScript == null) && supportRenderScript && this.useBlur) {
            if (this.mRenderScript == null) {
                try {
                    RenderScript renderScriptCreate = RenderScript.create(getContext());
                    this.mRenderScript = renderScriptCreate;
                    this.mBlurScript = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                } catch (Exception e) {
                    supportRenderScript = false;
                    if (isDebug()) {
                        e.printStackTrace();
                    }
                }
            }
            this.mDirty = false;
            float f2 = this.mBlurRadius / f;
            if (f2 > 25.0f) {
                f = (f * f2) / 25.0f;
                f2 = 25.0f;
            }
            ScriptIntrinsicBlur scriptIntrinsicBlur = this.mBlurScript;
            if (scriptIntrinsicBlur != null) {
                scriptIntrinsicBlur.setRadius(f2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(1, (int) (width / f));
        int iMax2 = Math.max(1, (int) (height / f));
        if (this.mBlurringCanvas == null || (bitmap = this.mBlurredBitmap) == null || bitmap.getWidth() != iMax || this.mBlurredBitmap.getHeight() != iMax2) {
            releaseBitmap();
            try {
                try {
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, config);
                    this.mBitmapToBlur = bitmapCreateBitmap;
                    if (bitmapCreateBitmap == null) {
                        releaseBitmap();
                        return false;
                    }
                    this.mBlurringCanvas = new Canvas(this.mBitmapToBlur);
                    if (supportRenderScript && this.useBlur) {
                        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.mRenderScript, this.mBitmapToBlur, Allocation.MipmapControl.MIPMAP_NONE, 1);
                        this.mBlurInput = allocationCreateFromBitmap;
                        this.mBlurOutput = Allocation.createTyped(this.mRenderScript, allocationCreateFromBitmap.getType());
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMax, iMax2, config);
                        this.mBlurredBitmap = bitmapCreateBitmap2;
                        if (bitmapCreateBitmap2 == null) {
                            releaseBitmap();
                            return false;
                        }
                    }
                    releaseBitmap();
                    return false;
                } catch (Exception e2) {
                    if (isDebug()) {
                        e2.printStackTrace();
                    }
                    releaseBitmap();
                    return false;
                }
            } catch (Throwable unused) {
                releaseBitmap();
                return false;
            }
        }
        return true;
    }

    public void release() {
        releaseBitmap();
        releaseScript();
    }

    public void setBlurRadius(float f) {
        if (this.mBlurRadius != f) {
            this.mBlurRadius = f;
            this.mDirty = true;
            invalidate();
        }
    }

    public void setDownsampleFactor(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Downsample factor must be greater than 0.");
        }
        if (this.mDownsampleFactor != f) {
            this.mDownsampleFactor = f;
            this.mDirty = true;
            releaseBitmap();
            invalidate();
        }
    }

    public void setOverlayColor(int i) {
        if (this.mOverlayColor != i) {
            this.mOverlayColor = i;
            invalidate();
        }
    }

    public BlurView setOverrideOverlayColor(boolean z) {
        log("setOverrideOverlayColor: " + z);
        this.overrideOverlayColor = z;
        return this;
    }

    public void setRadiusPx(float f) {
        if (this.mRadius != f) {
            this.mRadius = f;
            this.mDirty = true;
            invalidate();
        }
    }

    public BlurView setUseBlur(boolean z) {
        this.useBlur = z;
        invalidate();
        return this;
    }

    public BlurView(Context context) {
        super(context);
        this.mDownsampleFactor = 4.0f;
        this.mOverlayColor = -1;
        this.mBlurRadius = 35.0f;
        this.overrideOverlayColor = false;
        this.mRadius = 0.0f;
        this.mRectSrc = new Rect();
        this.mRectDst = new Rect();
        this.isInit = false;
        this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.kongzue.dialogx.util.views.BlurView.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                int[] iArr = new int[2];
                Bitmap bitmap = BlurView.this.mBlurredBitmap;
                View view = BlurView.this.mDecorView;
                if (view != null && BlurView.this.isShown() && BlurView.this.prepare()) {
                    boolean z = BlurView.this.mBlurredBitmap != bitmap;
                    view.getLocationInWindow(iArr);
                    int i = -iArr[0];
                    int i2 = -iArr[1];
                    BlurView.this.getLocationInWindow(iArr);
                    int i3 = i + iArr[0];
                    int i4 = i2 + iArr[1];
                    BlurView.this.mBitmapToBlur.eraseColor(BlurView.this.mOverlayColor & C8273.f24691);
                    int iSave = BlurView.this.mBlurringCanvas.save();
                    BlurView.this.mIsRendering = true;
                    BlurView.access$708();
                    try {
                        try {
                            BlurView.this.mBlurringCanvas.scale((BlurView.this.mBitmapToBlur.getWidth() * 1.0f) / BlurView.this.getWidth(), (BlurView.this.mBitmapToBlur.getHeight() * 1.0f) / BlurView.this.getHeight());
                            BlurView.this.mBlurringCanvas.translate(-i3, -i4);
                            if (view.getBackground() != null) {
                                view.getBackground().draw(BlurView.this.mBlurringCanvas);
                            }
                            view.draw(BlurView.this.mBlurringCanvas);
                        } catch (Exception e) {
                            if (BlurView.isDebug()) {
                                e.printStackTrace();
                            }
                        }
                        BlurView.this.mIsRendering = false;
                        BlurView.access$710();
                        BlurView.this.mBlurringCanvas.restoreToCount(iSave);
                        BlurView blurView = BlurView.this;
                        blurView.blur(blurView.mBitmapToBlur, BlurView.this.mBlurredBitmap);
                        if (z || BlurView.this.mDifferentRoot) {
                            BlurView.this.invalidate();
                        }
                    } catch (Throwable th) {
                        BlurView.this.mIsRendering = false;
                        BlurView.access$710();
                        BlurView.this.mBlurringCanvas.restoreToCount(iSave);
                        throw th;
                    }
                }
                return true;
            }
        };
        this.useBlur = true;
        init(context, null);
    }

    public BlurView(Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDownsampleFactor = 4.0f;
        this.mOverlayColor = -1;
        this.mBlurRadius = 35.0f;
        this.overrideOverlayColor = false;
        this.mRadius = 0.0f;
        this.mRectSrc = new Rect();
        this.mRectDst = new Rect();
        this.isInit = false;
        this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.kongzue.dialogx.util.views.BlurView.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                int[] iArr = new int[2];
                Bitmap bitmap = BlurView.this.mBlurredBitmap;
                View view = BlurView.this.mDecorView;
                if (view != null && BlurView.this.isShown() && BlurView.this.prepare()) {
                    boolean z = BlurView.this.mBlurredBitmap != bitmap;
                    view.getLocationInWindow(iArr);
                    int i2 = -iArr[0];
                    int i22 = -iArr[1];
                    BlurView.this.getLocationInWindow(iArr);
                    int i3 = i2 + iArr[0];
                    int i4 = i22 + iArr[1];
                    BlurView.this.mBitmapToBlur.eraseColor(BlurView.this.mOverlayColor & C8273.f24691);
                    int iSave = BlurView.this.mBlurringCanvas.save();
                    BlurView.this.mIsRendering = true;
                    BlurView.access$708();
                    try {
                        try {
                            BlurView.this.mBlurringCanvas.scale((BlurView.this.mBitmapToBlur.getWidth() * 1.0f) / BlurView.this.getWidth(), (BlurView.this.mBitmapToBlur.getHeight() * 1.0f) / BlurView.this.getHeight());
                            BlurView.this.mBlurringCanvas.translate(-i3, -i4);
                            if (view.getBackground() != null) {
                                view.getBackground().draw(BlurView.this.mBlurringCanvas);
                            }
                            view.draw(BlurView.this.mBlurringCanvas);
                        } catch (Exception e) {
                            if (BlurView.isDebug()) {
                                e.printStackTrace();
                            }
                        }
                        BlurView.this.mIsRendering = false;
                        BlurView.access$710();
                        BlurView.this.mBlurringCanvas.restoreToCount(iSave);
                        BlurView blurView = BlurView.this;
                        blurView.blur(blurView.mBitmapToBlur, BlurView.this.mBlurredBitmap);
                        if (z || BlurView.this.mDifferentRoot) {
                            BlurView.this.invalidate();
                        }
                    } catch (Throwable th) {
                        BlurView.this.mIsRendering = false;
                        BlurView.access$710();
                        BlurView.this.mBlurringCanvas.restoreToCount(iSave);
                        throw th;
                    }
                }
                return true;
            }
        };
        this.useBlur = true;
        init(context, attributeSet);
    }
}
