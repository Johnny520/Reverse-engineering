package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class BlurView extends android.view.View {
    public static boolean DEBUGMODE;
    private static int RENDERING_COUNT;
    private static boolean supportRenderScript;
    android.graphics.Paint cutPaint;
    private boolean isInit;
    private android.graphics.Bitmap mBitmapToBlur;
    private androidx.renderscript.Allocation mBlurInput;
    private androidx.renderscript.Allocation mBlurOutput;
    private float mBlurRadius;
    private androidx.renderscript.ScriptIntrinsicBlur mBlurScript;
    private android.graphics.Bitmap mBlurredBitmap;
    private android.graphics.Canvas mBlurringCanvas;
    private android.view.View mDecorView;
    private boolean mDifferentRoot;
    private boolean mDirty;
    private float mDownsampleFactor;
    private boolean mIsRendering;
    private int mOverlayColor;
    private android.graphics.Paint mPaint;
    private float mRadius;
    private final android.graphics.Rect mRectDst;
    private android.graphics.RectF mRectF;
    private final android.graphics.Rect mRectSrc;
    private androidx.renderscript.RenderScript mRenderScript;
    android.graphics.Paint overlayPaint;
    private boolean overrideOverlayColor;
    private final android.view.ViewTreeObserver.OnPreDrawListener preDrawListener;
    private boolean useBlur;




    static {
            com.kongzue.dialogx.util.views.BlurView$3 r0 = new com.kongzue.dialogx.util.views.BlurView$3
            r0.<init>()
            r0.start()
            r0 = 0
            com.kongzue.dialogx.util.views.BlurView.DEBUGMODE = r0
            return
    }

    public BlurView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 1082130432(0x40800000, float:4.0)
            r2.mDownsampleFactor = r0
            r0 = -1
            r2.mOverlayColor = r0
            r0 = 1108082688(0x420c0000, float:35.0)
            r2.mBlurRadius = r0
            r0 = 0
            r2.overrideOverlayColor = r0
            r1 = 0
            r2.mRadius = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.mRectSrc = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.mRectDst = r1
            r2.isInit = r0
            com.kongzue.dialogx.util.views.BlurView$2 r0 = new com.kongzue.dialogx.util.views.BlurView$2
            r0.<init>(r2)
            r2.preDrawListener = r0
            r0 = 1
            r2.useBlur = r0
            r0 = 0
            r2.init(r3, r0)
            return
    }

    public BlurView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 1082130432(0x40800000, float:4.0)
            r2.mDownsampleFactor = r0
            r0 = -1
            r2.mOverlayColor = r0
            r0 = 1108082688(0x420c0000, float:35.0)
            r2.mBlurRadius = r0
            r0 = 0
            r2.overrideOverlayColor = r0
            r1 = 0
            r2.mRadius = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.mRectSrc = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.mRectDst = r1
            r2.isInit = r0
            com.kongzue.dialogx.util.views.BlurView$2 r0 = new com.kongzue.dialogx.util.views.BlurView$2
            r0.<init>(r2)
            r2.preDrawListener = r0
            r0 = 1
            r2.useBlur = r0
            r2.init(r3, r4)
            return
    }

    public BlurView(android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r4 = 1082130432(0x40800000, float:4.0)
            r1.mDownsampleFactor = r4
            r4 = -1
            r1.mOverlayColor = r4
            r4 = 1108082688(0x420c0000, float:35.0)
            r1.mBlurRadius = r4
            r4 = 0
            r1.overrideOverlayColor = r4
            r0 = 0
            r1.mRadius = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mRectSrc = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mRectDst = r0
            r1.isInit = r4
            com.kongzue.dialogx.util.views.BlurView$2 r4 = new com.kongzue.dialogx.util.views.BlurView$2
            r4.<init>(r1)
            r1.preDrawListener = r4
            r4 = 1
            r1.useBlur = r4
            r1.init(r2, r3)
            return
    }

    public static /* synthetic */ float access$000(com.kongzue.dialogx.util.views.BlurView r0) {
            float r0 = r0.mRadius
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap access$100(com.kongzue.dialogx.util.views.BlurView r0) {
            android.graphics.Bitmap r0 = r0.mBlurredBitmap
            return r0
    }

    public static /* synthetic */ android.view.View access$200(com.kongzue.dialogx.util.views.BlurView r0) {
            android.view.View r0 = r0.mDecorView
            return r0
    }

    public static /* synthetic */ int access$300(com.kongzue.dialogx.util.views.BlurView r0) {
            int r0 = r0.mOverlayColor
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap access$400(com.kongzue.dialogx.util.views.BlurView r0) {
            android.graphics.Bitmap r0 = r0.mBitmapToBlur
            return r0
    }

    public static /* synthetic */ android.graphics.Canvas access$500(com.kongzue.dialogx.util.views.BlurView r0) {
            android.graphics.Canvas r0 = r0.mBlurringCanvas
            return r0
    }

    public static /* synthetic */ boolean access$602(com.kongzue.dialogx.util.views.BlurView r0, boolean r1) {
            r0.mIsRendering = r1
            return r1
    }

    public static /* synthetic */ int access$708() {
            int r0 = com.kongzue.dialogx.util.views.BlurView.RENDERING_COUNT
            int r1 = r0 + 1
            com.kongzue.dialogx.util.views.BlurView.RENDERING_COUNT = r1
            return r0
    }

    public static /* synthetic */ int access$710() {
            int r0 = com.kongzue.dialogx.util.views.BlurView.RENDERING_COUNT
            int r1 = r0 + (-1)
            com.kongzue.dialogx.util.views.BlurView.RENDERING_COUNT = r1
            return r0
    }

    public static /* synthetic */ boolean access$800(com.kongzue.dialogx.util.views.BlurView r0) {
            boolean r0 = r0.mDifferentRoot
            return r0
    }

    public static /* synthetic */ boolean access$902(boolean r0) {
            com.kongzue.dialogx.util.views.BlurView.supportRenderScript = r0
            return r0
    }

    private void drawBlurredBitmapCompat(android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.Bitmap r0 = r5.mBlurredBitmap
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L54
            android.graphics.Rect r0 = r5.mRectDst
            int r3 = r5.getWidth()
            r0.right = r3
            android.graphics.Rect r0 = r5.mRectDst
            int r3 = r5.getHeight()
            r0.bottom = r3
            int r0 = r5.getWidth()
            if (r0 <= 0) goto L6b
            int r0 = r5.getHeight()
            if (r0 <= 0) goto L6b
            android.graphics.Bitmap r0 = r5.mBlurredBitmap
            int r3 = r5.getWidth()
            int r4 = r5.getHeight()
            android.graphics.Bitmap r0 = r5.resizeImage(r0, r3, r4)
            android.graphics.Rect r3 = r5.mRectDst
            android.graphics.Bitmap r0 = r5.getRoundedCornerBitmap(r0, r3)
            if (r0 == 0) goto L3c
            r6.drawBitmap(r0, r2, r2, r1)
            goto L6b
        L3c:
            int r0 = r5.getWidth()
            int r3 = r5.getHeight()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r3, r4)
            android.graphics.Bitmap r0 = r5.drawOverlyColor(r0)
            if (r0 == 0) goto L6b
            r6.drawBitmap(r0, r2, r2, r1)
            goto L6b
        L54:
            int r0 = r5.getWidth()
            int r3 = r5.getHeight()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r3, r4)
            android.graphics.Bitmap r0 = r5.drawOverlyColor(r0)
            if (r0 == 0) goto L6b
            r6.drawBitmap(r0, r2, r2, r1)
        L6b:
            return
    }

    private android.graphics.Bitmap drawOverlyColor(android.graphics.Bitmap r7) {
            r6 = this;
            if (r7 == 0) goto L3e
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            r5 = 0
            r2.set(r5, r5, r3, r4)
            android.graphics.Paint r3 = r6.overlayPaint
            r1.drawBitmap(r7, r2, r2, r3)
            boolean r7 = r6.needRemoveAlphaColor()
            if (r7 == 0) goto L38
            int r7 = r6.mOverlayColor
            int r7 = removeAlphaColor(r7)
            goto L3a
        L38:
            int r7 = r6.mOverlayColor
        L3a:
            r1.drawColor(r7)
            return r0
        L3e:
            r7 = 0
            return r7
    }

    public static void error(java.lang.Object r1) {
            boolean r0 = isDebug()
            if (r0 == 0) goto Lf
            java.lang.String r0 = ">>>"
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
        Lf:
            return
    }

    private android.graphics.Bitmap getRoundedCornerBitmap(android.graphics.Bitmap r5, android.graphics.Rect r6) {
            r4 = this;
            int r0 = r6.width()
            int r1 = r6.height()
            android.graphics.Bitmap r5 = r4.resizeImage(r5, r0, r1)
            android.graphics.Bitmap r5 = r4.drawOverlyColor(r5)
            if (r5 != 0) goto L14
            r5 = 0
            return r5
        L14:
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.BitmapShader r2 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.CLAMP
            r2.<init>(r5, r3, r3)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r3 = 1
            r5.setAntiAlias(r3)
            r5.setShader(r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r6)
            float r6 = r4.mRadius
            r1.drawRoundRect(r2, r6, r6, r5)
            return r0
    }

    private void init(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            boolean r0 = r4.isInit
            if (r0 != 0) goto L90
            if (r5 == 0) goto L90
            int[] r0 = com.kongzue.dialogx.R.styleable.RealtimeBlurView
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r0)
            int r0 = com.kongzue.dialogx.R.styleable.RealtimeBlurView_realtimeBlurRadius
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r2 = 1
            r3 = 1108082688(0x420c0000, float:35.0)
            float r1 = android.util.TypedValue.applyDimension(r2, r3, r1)
            float r0 = r6.getDimension(r0, r1)
            r4.mBlurRadius = r0
            int r0 = com.kongzue.dialogx.R.styleable.RealtimeBlurView_realtimeDownsampleFactor
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r6.getFloat(r0, r1)
            r4.mDownsampleFactor = r0
            int r0 = com.kongzue.dialogx.R.styleable.RealtimeBlurView_realtimeOverlayColor
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            int r0 = r6.getColor(r0, r1)
            r4.mOverlayColor = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.mPaint = r0
            r0.setAntiAlias(r2)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r4.mRectF = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.cutPaint = r0
            r0.setAntiAlias(r2)
            android.graphics.Paint r0 = r4.cutPaint
            int r1 = r4.mOverlayColor
            r0.setColor(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.overlayPaint = r0
            r0.setAntiAlias(r2)
            int r0 = com.kongzue.dialogx.R.styleable.RealtimeBlurView_realtimeRadius
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r1 = 1097859072(0x41700000, float:15.0)
            float r5 = android.util.TypedValue.applyDimension(r2, r1, r5)
            float r5 = r6.getDimension(r0, r5)
            r4.mRadius = r5
            r6.recycle()
            r4.isInit = r2
            boolean r5 = r4.isCompatMode()
            if (r5 != 0) goto L90
            com.kongzue.dialogx.util.views.BlurView$1 r5 = new com.kongzue.dialogx.util.views.BlurView$1
            r5.<init>(r4)
            r4.setOutlineProvider(r5)
            r4.setClipToOutline(r2)
        L90:
            return
    }

    private boolean isCompatMode() {
            r1 = this;
            r0 = 0
            return r0
    }

    public static boolean isDebug() {
            boolean r0 = com.kongzue.dialogx.util.views.BlurView.DEBUGMODE
            if (r0 == 0) goto La
            boolean r0 = com.kongzue.dialogx.DialogX.DEBUGMODE
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private static void log(java.lang.Object r2) {
            boolean r0 = isDebug()
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DialogX.BlurView: "
            r0.append(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = ">>>"
            android.util.Log.i(r0, r2)
        L20:
            return
    }

    private boolean needRemoveAlphaColor() {
            r2 = this;
            boolean r0 = r2.overrideOverlayColor
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = com.kongzue.dialogx.util.views.BlurView.supportRenderScript
            if (r0 == 0) goto Le
            boolean r0 = r2.useBlur
            if (r0 != 0) goto Lf
        Le:
            r1 = 1
        Lf:
            return r1
    }

    private void releaseBitmap() {
            r2 = this;
            androidx.renderscript.Allocation r0 = r2.mBlurInput
            r1 = 0
            if (r0 == 0) goto La
            r0.destroy()
            r2.mBlurInput = r1
        La:
            androidx.renderscript.Allocation r0 = r2.mBlurOutput
            if (r0 == 0) goto L13
            r0.destroy()
            r2.mBlurOutput = r1
        L13:
            android.graphics.Bitmap r0 = r2.mBitmapToBlur
            if (r0 == 0) goto L1c
            r0.recycle()
            r2.mBitmapToBlur = r1
        L1c:
            android.graphics.Bitmap r0 = r2.mBlurredBitmap
            if (r0 == 0) goto L25
            r0.recycle()
            r2.mBlurredBitmap = r1
        L25:
            return
    }

    private void releaseScript() {
            r2 = this;
            androidx.renderscript.RenderScript r0 = r2.mRenderScript
            r1 = 0
            if (r0 == 0) goto La
            r0.destroy()
            r2.mRenderScript = r1
        La:
            androidx.renderscript.ScriptIntrinsicBlur r0 = r2.mBlurScript
            if (r0 == 0) goto L13
            r0.destroy()
            r2.mBlurScript = r1
        L13:
            return
    }

    private static int removeAlphaColor(@Yue.InterfaceC1230 int r3) {
            int r0 = android.graphics.Color.red(r3)
            int r1 = android.graphics.Color.green(r3)
            int r3 = android.graphics.Color.blue(r3)
            r2 = 255(0xff, float:3.57E-43)
            int r3 = android.graphics.Color.argb(r2, r0, r1, r3)
            return r3
    }

    private static int replaceAlphaColor(@Yue.InterfaceC1230 int r2, int r3) {
            int r0 = android.graphics.Color.red(r2)
            int r1 = android.graphics.Color.green(r2)
            int r2 = android.graphics.Color.blue(r2)
            int r2 = android.graphics.Color.argb(r3, r0, r1, r2)
            return r2
    }

    private android.graphics.Bitmap resizeImage(android.graphics.Bitmap r8, int r9, int r10) {
            r7 = this;
            if (r8 == 0) goto L21
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            float r9 = (float) r9
            float r0 = (float) r3
            float r9 = r9 / r0
            float r10 = (float) r10
            float r0 = (float) r4
            float r10 = r10 / r0
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r5.postScale(r9, r10)
            r2 = 0
            r6 = 1
            r1 = 0
            r0 = r8
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r8
        L21:
            r8 = 0
            return r8
    }

    public void blur(android.graphics.Bitmap r2, android.graphics.Bitmap r3) {
            r1 = this;
            androidx.renderscript.Allocation r0 = r1.mBlurInput
            r0.copyFrom(r2)
            androidx.renderscript.ScriptIntrinsicBlur r2 = r1.mBlurScript
            androidx.renderscript.Allocation r0 = r1.mBlurInput
            r2.setInput(r0)
            androidx.renderscript.ScriptIntrinsicBlur r2 = r1.mBlurScript
            androidx.renderscript.Allocation r0 = r1.mBlurOutput
            r2.forEach(r0)
            androidx.renderscript.Allocation r2 = r1.mBlurOutput
            r2.copyTo(r3)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r4) {
            r3 = this;
            boolean r0 = r3.useBlur
            if (r0 == 0) goto L15
            boolean r0 = com.kongzue.dialogx.util.views.BlurView.supportRenderScript
            if (r0 != 0) goto L9
            goto L15
        L9:
            boolean r0 = r3.mIsRendering
            if (r0 != 0) goto L44
            int r0 = com.kongzue.dialogx.util.views.BlurView.RENDERING_COUNT
            if (r0 > 0) goto L44
            super.draw(r4)
            goto L44
        L15:
            android.graphics.RectF r0 = r3.mRectF
            int r1 = r3.getWidth()
            float r1 = (float) r1
            r0.right = r1
            android.graphics.RectF r0 = r3.mRectF
            int r1 = r3.getHeight()
            float r1 = (float) r1
            r0.bottom = r1
            android.graphics.Paint r0 = r3.overlayPaint
            boolean r1 = r3.needRemoveAlphaColor()
            if (r1 == 0) goto L36
            int r1 = r3.mOverlayColor
            int r1 = removeAlphaColor(r1)
            goto L38
        L36:
            int r1 = r3.mOverlayColor
        L38:
            r0.setColor(r1)
            android.graphics.RectF r0 = r3.mRectF
            float r1 = r3.mRadius
            android.graphics.Paint r2 = r3.overlayPaint
            r4.drawRoundRect(r0, r1, r1, r2)
        L44:
            return
    }

    public void drawBlurredBitmap(android.graphics.Canvas r4, android.graphics.Bitmap r5) {
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L3d
            android.graphics.Rect r1 = r3.mRectSrc
            int r2 = r5.getWidth()
            r1.right = r2
            android.graphics.Rect r1 = r3.mRectSrc
            int r2 = r5.getHeight()
            r1.bottom = r2
            android.graphics.Rect r1 = r3.mRectDst
            int r2 = r3.getWidth()
            r1.right = r2
            android.graphics.Rect r1 = r3.mRectDst
            int r2 = r3.getHeight()
            r1.bottom = r2
            android.graphics.Rect r1 = r3.mRectSrc
            android.graphics.Rect r2 = r3.mRectDst
            r4.drawBitmap(r5, r1, r2, r0)
            boolean r5 = r3.needRemoveAlphaColor()
            if (r5 == 0) goto L37
            int r5 = r3.mOverlayColor
            int r5 = removeAlphaColor(r5)
            goto L39
        L37:
            int r5 = r3.mOverlayColor
        L39:
            r4.drawColor(r5)
            goto L55
        L3d:
            int r5 = r3.getWidth()
            int r1 = r3.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r1, r2)
            android.graphics.Bitmap r5 = r3.drawOverlyColor(r5)
            if (r5 == 0) goto L55
            r1 = 0
            r4.drawBitmap(r5, r1, r1, r0)
        L55:
            return
    }

    public boolean isUseBlur() {
            r1 = this;
            boolean r0 = r1.useBlur
            return r0
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            android.content.Context r0 = r4.getContext()
            log(r0)
            android.content.Context r0 = r4.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L19
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            goto L1d
        L19:
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
        L1d:
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getChildCount()
            r2 = 1
            r3 = 0
            if (r1 < r2) goto L35
            android.view.View r0 = r0.getChildAt(r3)
            r4.mDecorView = r0
        L35:
            android.view.View r0 = r4.mDecorView
            if (r0 == 0) goto L61
            java.lang.String r0 = "mDecorView is ok."
            log(r0)
            android.view.View r0 = r4.mDecorView
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r4.preDrawListener
            r0.addOnPreDrawListener(r1)
            android.view.View r0 = r4.mDecorView
            android.view.View r0 = r0.getRootView()
            android.view.View r1 = r4.getRootView()
            if (r0 == r1) goto L56
            goto L57
        L56:
            r2 = r3
        L57:
            r4.mDifferentRoot = r2
            if (r2 == 0) goto L68
            android.view.View r0 = r4.mDecorView
            r0.postInvalidate()
            goto L68
        L61:
            java.lang.String r0 = "mDecorView is NULL."
            log(r0)
            r4.mDifferentRoot = r3
        L68:
            return
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
            r2 = this;
            android.view.View r0 = r2.mDecorView
            if (r0 == 0) goto Ld
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.preDrawListener
            r0.removeOnPreDrawListener(r1)
        Ld:
            r2.release()
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            super.onDraw(r2)
            boolean r0 = r1.isCompatMode()
            if (r0 == 0) goto Ld
            r1.drawBlurredBitmapCompat(r2)
            goto L12
        Ld:
            android.graphics.Bitmap r0 = r1.mBlurredBitmap
            r1.drawBlurredBitmap(r2, r0)
        L12:
            return
    }

    public boolean prepare() {
            r8 = this;
            float r0 = r8.mBlurRadius
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto Lc
            r8.release()
            return r1
        Lc:
            float r0 = r8.mDownsampleFactor
            boolean r2 = r8.mDirty
            if (r2 != 0) goto L16
            androidx.renderscript.RenderScript r2 = r8.mRenderScript
            if (r2 != 0) goto L58
        L16:
            boolean r2 = com.kongzue.dialogx.util.views.BlurView.supportRenderScript
            if (r2 == 0) goto L58
            boolean r2 = r8.useBlur
            if (r2 == 0) goto L58
            androidx.renderscript.RenderScript r2 = r8.mRenderScript
            if (r2 != 0) goto L43
            android.content.Context r2 = r8.getContext()     // Catch: java.lang.Exception -> L37
            androidx.renderscript.RenderScript r2 = androidx.renderscript.RenderScript.create(r2)     // Catch: java.lang.Exception -> L37
            r8.mRenderScript = r2     // Catch: java.lang.Exception -> L37
            androidx.renderscript.Element r3 = androidx.renderscript.Element.U8_4(r2)     // Catch: java.lang.Exception -> L37
            androidx.renderscript.ScriptIntrinsicBlur r2 = androidx.renderscript.ScriptIntrinsicBlur.create(r2, r3)     // Catch: java.lang.Exception -> L37
            r8.mBlurScript = r2     // Catch: java.lang.Exception -> L37
            goto L43
        L37:
            r2 = move-exception
            com.kongzue.dialogx.util.views.BlurView.supportRenderScript = r1
            boolean r3 = isDebug()
            if (r3 == 0) goto L43
            r2.printStackTrace()
        L43:
            r8.mDirty = r1
            float r2 = r8.mBlurRadius
            float r2 = r2 / r0
            r3 = 1103626240(0x41c80000, float:25.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L51
            float r0 = r0 * r2
            float r0 = r0 / r3
            r2 = r3
        L51:
            androidx.renderscript.ScriptIntrinsicBlur r3 = r8.mBlurScript
            if (r3 == 0) goto L58
            r3.setRadius(r2)
        L58:
            int r2 = r8.getWidth()
            int r3 = r8.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r0
            int r2 = (int) r2
            r4 = 1
            int r2 = java.lang.Math.max(r4, r2)
            float r3 = (float) r3
            float r3 = r3 / r0
            int r0 = (int) r3
            int r0 = java.lang.Math.max(r4, r0)
            android.graphics.Canvas r3 = r8.mBlurringCanvas
            if (r3 == 0) goto L85
            android.graphics.Bitmap r3 = r8.mBlurredBitmap
            if (r3 == 0) goto L85
            int r3 = r3.getWidth()
            if (r3 != r2) goto L85
            android.graphics.Bitmap r3 = r8.mBlurredBitmap
            int r3 = r3.getHeight()
            if (r3 == r0) goto Lcc
        L85:
            r8.releaseBitmap()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r0, r3)     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            r8.mBitmapToBlur = r5     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            if (r5 != 0) goto L96
            r8.releaseBitmap()
            return r1
        L96:
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            android.graphics.Bitmap r6 = r8.mBitmapToBlur     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            r5.<init>(r6)     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            r8.mBlurringCanvas = r5     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            boolean r5 = com.kongzue.dialogx.util.views.BlurView.supportRenderScript     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            if (r5 == 0) goto Lcf
            boolean r5 = r8.useBlur     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            if (r5 != 0) goto La8
            goto Lcf
        La8:
            androidx.renderscript.RenderScript r5 = r8.mRenderScript     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            android.graphics.Bitmap r6 = r8.mBitmapToBlur     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            androidx.renderscript.Allocation$MipmapControl r7 = androidx.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            androidx.renderscript.Allocation r5 = androidx.renderscript.Allocation.createFromBitmap(r5, r6, r7, r4)     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            r8.mBlurInput = r5     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            androidx.renderscript.RenderScript r6 = r8.mRenderScript     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            androidx.renderscript.Type r5 = r5.getType()     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            androidx.renderscript.Allocation r5 = androidx.renderscript.Allocation.createTyped(r6, r5)     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            r8.mBlurOutput = r5     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r0, r3)     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            r8.mBlurredBitmap = r0     // Catch: java.lang.Exception -> Lcd java.lang.Throwable -> Le0
            if (r0 != 0) goto Lcc
            r8.releaseBitmap()
            return r1
        Lcc:
            return r4
        Lcd:
            r0 = move-exception
            goto Ld3
        Lcf:
            r8.releaseBitmap()
            return r1
        Ld3:
            boolean r2 = isDebug()     // Catch: java.lang.Throwable -> Le0
            if (r2 == 0) goto Ldc
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Le0
        Ldc:
            r8.releaseBitmap()
            return r1
        Le0:
            r8.releaseBitmap()
            return r1
    }

    public void release() {
            r0 = this;
            r0.releaseBitmap()
            r0.releaseScript()
            return
    }

    public void setBlurRadius(float r2) {
            r1 = this;
            float r0 = r1.mBlurRadius
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.mBlurRadius = r2
            r2 = 1
            r1.mDirty = r2
            r1.invalidate()
        Le:
            return
    }

    public void setDownsampleFactor(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            float r0 = r1.mDownsampleFactor
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            r1.mDownsampleFactor = r2
            r2 = 1
            r1.mDirty = r2
            r1.releaseBitmap()
            r1.invalidate()
        L16:
            return
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Downsample factor must be greater than 0."
            r2.<init>(r0)
            throw r2
    }

    public void setOverlayColor(int r2) {
            r1 = this;
            int r0 = r1.mOverlayColor
            if (r0 == r2) goto L9
            r1.mOverlayColor = r2
            r1.invalidate()
        L9:
            return
    }

    public com.kongzue.dialogx.util.views.BlurView setOverrideOverlayColor(boolean r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setOverrideOverlayColor: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            log(r0)
            r2.overrideOverlayColor = r3
            return r2
    }

    public void setRadiusPx(float r2) {
            r1 = this;
            float r0 = r1.mRadius
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.mRadius = r2
            r2 = 1
            r1.mDirty = r2
            r1.invalidate()
        Le:
            return
    }

    public com.kongzue.dialogx.util.views.BlurView setUseBlur(boolean r1) {
            r0 = this;
            r0.useBlur = r1
            r0.invalidate()
            return r0
    }
}
