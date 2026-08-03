package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
@android.annotation.SuppressLint({"AppCompatCustomView"})
public class ActivityScreenShotImageView extends android.widget.ImageView {
    public static boolean hideContentView = false;
    public static boolean useHardwareRenderingMode = true;
    private java.lang.ref.WeakReference<android.view.View> contentView;
    com.kongzue.dialogx.interfaces.BaseDialog dialog;
    float height;
    public boolean hideActivityContentView;
    private boolean inited;
    private boolean isScreenshotSuccess;
    float mRadius;
    boolean readyDraw;
    private int screenHeight;
    private int screenWidth;
    float width;

    static {
            return
    }

    public ActivityScreenShotImageView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.readyDraw = r1
            r0.inited = r1
            r1 = 0
            r0.init(r1)
            return
    }

    public ActivityScreenShotImageView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.readyDraw = r1
            r0.inited = r1
            r0.init(r2)
            return
    }

    public ActivityScreenShotImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.readyDraw = r1
            r0.inited = r1
            r0.init(r2)
            return
    }

    private void doScreenshotActivityAndZoom() {
            r1 = this;
            android.view.ViewGroup r0 = r1.getDecorView()
            if (r0 != 0) goto L7
            return
        L7:
            r1.drawViewImage(r0)
            r0 = 0
            r1.setVisibility(r0)
            r0 = 1
            r1.inited = r0
            return
    }

    private void drawViewImage(android.view.View r6) {
            r5 = this;
            int r0 = r6.getWidth()
            if (r0 == 0) goto L90
            int r0 = r6.getHeight()
            if (r0 != 0) goto Le
            goto L90
        Le:
            com.kongzue.dialogx.interfaces.BaseDialog r0 = r5.dialog
            android.view.View r0 = r0.getDialogView()
            r1 = 8
            r0.setVisibility(r1)
            r0 = 1
            r5.setContentViewVisibility(r0)
            int r1 = r6.getWidth()
            int r2 = r6.getHeight()
            int r1 = r1 + r2
            r2 = 0
            if (r1 != 0) goto L3f
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r6.measure(r1, r3)
            int r1 = r6.getMeasuredWidth()
            int r3 = r6.getMeasuredHeight()
            r6.layout(r2, r2, r1, r3)
        L3f:
            int r1 = r6.getWidth()
            int r3 = r6.getHeight()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r3, r4)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r1)
            r6.draw(r3)     // Catch: java.lang.Exception -> L56
            goto L6a
        L56:
            r3 = move-exception
            boolean r4 = com.kongzue.dialogx.DialogX.DEBUGMODE
            if (r4 == 0) goto L5e
            r3.printStackTrace()
        L5e:
            boolean r3 = com.kongzue.dialogx.util.views.ActivityScreenShotImageView.useHardwareRenderingMode
            if (r3 == 0) goto L6a
            com.kongzue.dialogx.util.views.ActivityScreenShotImageView.useHardwareRenderingMode = r2
            r5.requestLayoutType()
            r5.drawViewImage(r6)
        L6a:
            int r3 = r6.getWidth()
            int r6 = r6.getHeight()
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r1, r2, r2, r3, r6)
            r5.setImageBitmap(r6)
            r5.isScreenshotSuccess = r0
            r5.setContentViewVisibility(r2)
            com.kongzue.dialogx.interfaces.BaseDialog r6 = r5.dialog
            android.view.View r6 = r6.getDialogView()
            r6.setVisibility(r2)
            com.kongzue.dialogx.interfaces.BaseDialog r6 = r5.dialog
            android.view.View r6 = r6.getDialogView()
            r6.requestFocus()
        L90:
            return
    }

    private android.view.ViewGroup getDecorView() {
            r2 = this;
            com.kongzue.dialogx.interfaces.BaseDialog r0 = r2.dialog
            if (r0 == 0) goto L13
            android.app.Activity r0 = r0.getOwnActivity()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        L13:
            android.app.Activity r0 = com.kongzue.dialogx.impl.ActivityLifecycleImpl.getTopActivity()
            if (r0 == 0) goto L39
            boolean r1 = r0 instanceof com.kongzue.dialogx.util.DialogXFloatingWindowActivity
            if (r1 == 0) goto L2e
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity r0 = (com.kongzue.dialogx.util.DialogXFloatingWindowActivity) r0
            android.app.Activity r0 = r0.getFromActivity()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        L2e:
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        L39:
            r0 = 0
            return r0
    }

    private void init(android.util.AttributeSet r1) {
            r0 = this;
            r0.requestLayoutType()
            return
    }

    private void refreshImage() {
            r2 = this;
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r2.screenWidth
            int r1 = r2.getMeasuredWidth()
            if (r0 != r1) goto L17
            int r0 = r2.screenHeight
            int r1 = r2.getMeasuredHeight()
            if (r0 == r1) goto L26
        L17:
            int r0 = r2.getMeasuredWidth()
            r2.screenWidth = r0
            int r0 = r2.getMeasuredHeight()
            r2.screenHeight = r0
            r2.doScreenshotActivityAndZoom()
        L26:
            return
    }

    private void requestLayoutType() {
            r2 = this;
            boolean r0 = com.kongzue.dialogx.util.views.ActivityScreenShotImageView.useHardwareRenderingMode
            if (r0 == 0) goto L6
            r0 = 2
            goto L7
        L6:
            r0 = 1
        L7:
            r1 = 0
            r2.setLayerType(r0, r1)
            return
    }

    public void bindDialog(com.kongzue.dialogx.interfaces.BaseDialog r1) {
            r0 = this;
            r0.dialog = r1
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 1
            r1.setContentViewVisibility(r0)
            java.lang.ref.WeakReference<android.view.View> r0 = r1.contentView
            if (r0 == 0) goto Le
            r0.clear()
        Le:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.readyDraw
            if (r0 != 0) goto L7
            super.onDraw(r6)
        L7:
            float r0 = r5.width
            float r1 = r5.mRadius
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L6a
            float r0 = r5.height
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6a
            boolean r0 = r5.isScreenshotSuccess
            if (r0 == 0) goto L1e
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.drawColor(r0)
        L1e:
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            float r1 = r5.mRadius
            r2 = 0
            r0.moveTo(r1, r2)
            float r1 = r5.width
            float r3 = r5.mRadius
            float r1 = r1 - r3
            r0.lineTo(r1, r2)
            float r1 = r5.width
            float r3 = r5.mRadius
            r0.quadTo(r1, r2, r1, r3)
            float r1 = r5.width
            float r3 = r5.height
            float r4 = r5.mRadius
            float r3 = r3 - r4
            r0.lineTo(r1, r3)
            float r1 = r5.width
            float r3 = r5.height
            float r4 = r5.mRadius
            float r4 = r1 - r4
            r0.quadTo(r1, r3, r4, r3)
            float r1 = r5.mRadius
            float r3 = r5.height
            r0.lineTo(r1, r3)
            float r1 = r5.height
            float r3 = r5.mRadius
            float r3 = r1 - r3
            r0.quadTo(r2, r1, r2, r3)
            float r1 = r5.mRadius
            r0.lineTo(r2, r1)
            float r1 = r5.mRadius
            r0.quadTo(r2, r2, r1, r2)
            r6.clipPath(r0)
        L6a:
            r0 = -1
            r6.drawColor(r0)
            super.onDraw(r6)
            return
    }

    @Override // android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            float r1 = r0.width
            int r2 = r0.getWidth()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L19
            float r1 = r0.height
            int r2 = r0.getHeight()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L1c
        L19:
            r0.refreshImage()
        L1c:
            int r1 = r0.getWidth()
            float r1 = (float) r1
            r0.width = r1
            int r1 = r0.getHeight()
            float r1 = (float) r1
            r0.height = r1
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            boolean r1 = r0.isScreenshotSuccess
            if (r1 != 0) goto La
            r0.refreshImage()
        La:
            return
    }

    public void setContentViewVisibility(boolean r2) {
            r1 = this;
            boolean r0 = com.kongzue.dialogx.util.views.ActivityScreenShotImageView.hideContentView
            if (r0 != 0) goto L8
            boolean r0 = r1.hideActivityContentView
            if (r0 == 0) goto L3a
        L8:
            r0 = 0
            if (r2 == 0) goto L21
            java.lang.ref.WeakReference<android.view.View> r2 = r1.contentView
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L3a
            java.lang.ref.WeakReference<android.view.View> r2 = r1.contentView
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r0)
            goto L3a
        L21:
            android.view.ViewGroup r2 = r1.getDecorView()
            java.util.Objects.requireNonNull(r2)
            android.view.View r2 = r2.getChildAt(r0)
            if (r2 == 0) goto L3a
            r0 = 8
            r2.setVisibility(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.contentView = r0
        L3a:
            return
    }

    public void setRadius(float r1) {
            r0 = this;
            r0.mRadius = r1
            r0.invalidate()
            return
    }

    public void setScale(float r1) {
            r0 = this;
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            r1 = 1
            r0.readyDraw = r1
            return
    }
}
