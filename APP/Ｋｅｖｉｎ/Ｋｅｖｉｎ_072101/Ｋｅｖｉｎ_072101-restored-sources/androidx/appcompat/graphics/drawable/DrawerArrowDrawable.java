package androidx.appcompat.graphics.drawable;

/* JADX INFO: loaded from: classes2.dex */
public class DrawerArrowDrawable extends android.graphics.drawable.Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = 0.0f;
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private int mDirection;
    private float mMaxCutForBarSize;
    private final android.graphics.Paint mPaint;
    private final android.graphics.Path mPath;
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private boolean mVerticalMirror;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ArrowDirection {
    }

    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            float r0 = (float) r0
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable.ARROW_HEAD_ANGLE = r0
            return
    }

    public DrawerArrowDrawable(android.content.Context r8) {
            r7 = this;
            r7.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r7.mPaint = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r7.mPath = r0
            r0 = 0
            r7.mVerticalMirror = r0
            r1 = 2
            r7.mDirection = r1
            android.graphics.Paint r1 = r7.mPaint
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r7.mPaint
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.MITER
            r1.setStrokeJoin(r2)
            android.graphics.Paint r1 = r7.mPaint
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT
            r1.setStrokeCap(r2)
            android.graphics.Paint r1 = r7.mPaint
            r2 = 1
            r1.setAntiAlias(r2)
            android.content.res.Resources$Theme r1 = r8.getTheme()
            int[] r3 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle
            int r4 = androidx.appcompat.C0015R.attr.drawerArrowStyle
            int r5 = androidx.appcompat.C0015R.style.Base_Widget_AppCompat_DrawerArrowToggle
            r6 = 0
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r6, r3, r4, r5)
            int r3 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_color
            int r3 = r1.getColor(r3, r0)
            r7.setColor(r3)
            int r3 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_thickness
            r4 = 0
            float r3 = r1.getDimension(r3, r4)
            r7.setBarThickness(r3)
            int r3 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_spinBars
            boolean r2 = r1.getBoolean(r3, r2)
            r7.setSpinEnabled(r2)
            int r2 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_gapBetweenBars
            float r2 = r1.getDimension(r2, r4)
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            r7.setGapSize(r2)
            int r2 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_drawableSize
            int r0 = r1.getDimensionPixelSize(r2, r0)
            r7.mSize = r0
            int r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_barLength
            float r0 = r1.getDimension(r0, r4)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r7.mBarLength = r0
            int r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_arrowHeadLength
            float r0 = r1.getDimension(r0, r4)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r7.mArrowHeadLength = r0
            int r0 = androidx.appcompat.C0015R.styleable.DrawerArrowToggle_arrowShaftLength
            float r0 = r1.getDimension(r0, r4)
            r7.mArrowShaftLength = r0
            r1.recycle()
            return
    }

    private static float lerp(float r1, float r2, float r3) {
            float r0 = r2 - r1
            float r0 = r0 * r3
            float r0 = r0 + r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.Rect r2 = r18.getBounds()
            int r3 = r0.mDirection
            r4 = 0
            r5 = 1
            switch(r3) {
                case 0: goto L22;
                case 1: goto L20;
                case 2: goto Lf;
                case 3: goto L17;
                default: goto Lf;
            }
        Lf:
            int r3 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r18)
            if (r3 != r5) goto L24
            r4 = r5
            goto L24
        L17:
            int r3 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r18)
            if (r3 != 0) goto L1e
            r4 = r5
        L1e:
            r3 = r4
            goto L25
        L20:
            r3 = 1
            goto L25
        L22:
            r3 = 0
            goto L25
        L24:
            r3 = r4
        L25:
            float r4 = r0.mArrowHeadLength
            float r6 = r0.mArrowHeadLength
            float r4 = r4 * r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r6
            double r7 = (double) r4
            double r7 = java.lang.Math.sqrt(r7)
            float r4 = (float) r7
            float r7 = r0.mBarLength
            float r8 = r0.mProgress
            float r4 = lerp(r7, r4, r8)
            float r7 = r0.mBarLength
            float r8 = r0.mArrowShaftLength
            float r9 = r0.mProgress
            float r7 = lerp(r7, r8, r9)
            float r8 = r0.mMaxCutForBarSize
            float r9 = r0.mProgress
            r10 = 0
            float r8 = lerp(r10, r8, r9)
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            float r9 = androidx.appcompat.graphics.drawable.DrawerArrowDrawable.ARROW_HEAD_ANGLE
            float r11 = r0.mProgress
            float r9 = lerp(r10, r9, r11)
            if (r3 == 0) goto L5f
            r11 = r10
            goto L61
        L5f:
            r11 = -1020002304(0xffffffffc3340000, float:-180.0)
        L61:
            if (r3 == 0) goto L66
            r13 = 1127481344(0x43340000, float:180.0)
            goto L67
        L66:
            r13 = r10
        L67:
            float r14 = r0.mProgress
            float r11 = lerp(r11, r13, r14)
            double r13 = (double) r4
            r16 = r11
            double r10 = (double) r9
            double r10 = java.lang.Math.cos(r10)
            double r13 = r13 * r10
            long r10 = java.lang.Math.round(r13)
            float r10 = (float) r10
            double r13 = (double) r4
            double r5 = (double) r9
            double r5 = java.lang.Math.sin(r5)
            double r13 = r13 * r5
            long r5 = java.lang.Math.round(r13)
            float r5 = (float) r5
            android.graphics.Path r6 = r0.mPath
            r6.rewind()
            float r6 = r0.mBarGap
            android.graphics.Paint r13 = r0.mPaint
            float r13 = r13.getStrokeWidth()
            float r6 = r6 + r13
            float r13 = r0.mMaxCutForBarSize
            float r13 = -r13
            float r14 = r0.mProgress
            float r6 = lerp(r6, r13, r14)
            float r13 = -r7
            r14 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r14
            android.graphics.Path r11 = r0.mPath
            float r15 = r13 + r8
            r12 = 0
            r11.moveTo(r15, r12)
            android.graphics.Path r11 = r0.mPath
            float r15 = r8 * r14
            float r14 = r7 - r15
            r11.rLineTo(r14, r12)
            android.graphics.Path r11 = r0.mPath
            r11.moveTo(r13, r6)
            android.graphics.Path r11 = r0.mPath
            r11.rLineTo(r10, r5)
            android.graphics.Path r11 = r0.mPath
            float r12 = -r6
            r11.moveTo(r13, r12)
            android.graphics.Path r11 = r0.mPath
            float r12 = -r5
            r11.rLineTo(r10, r12)
            android.graphics.Path r11 = r0.mPath
            r11.close()
            r19.save()
            android.graphics.Paint r11 = r0.mPaint
            float r11 = r11.getStrokeWidth()
            int r12 = r2.height()
            float r12 = (float) r12
            r14 = 1077936128(0x40400000, float:3.0)
            float r14 = r14 * r11
            float r12 = r12 - r14
            float r14 = r0.mBarGap
            r15 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 * r15
            float r12 = r12 - r14
            int r12 = (int) r12
            int r14 = r12 / 4
            int r14 = r14 * 2
            float r14 = (float) r14
            r15 = 1069547520(0x3fc00000, float:1.5)
            float r15 = r15 * r11
            r17 = r4
            float r4 = r0.mBarGap
            float r15 = r15 + r4
            float r14 = r14 + r15
            int r4 = r2.centerX()
            float r4 = (float) r4
            r1.translate(r4, r14)
            boolean r4 = r0.mSpin
            if (r4 == 0) goto L110
            boolean r4 = r0.mVerticalMirror
            r4 = r4 ^ r3
            if (r4 == 0) goto L108
            r4 = -1
            goto L109
        L108:
            r4 = 1
        L109:
            float r4 = (float) r4
            float r4 = r4 * r16
            r1.rotate(r4)
            goto L117
        L110:
            if (r3 == 0) goto L117
            r4 = 1127481344(0x43340000, float:180.0)
            r1.rotate(r4)
        L117:
            android.graphics.Path r4 = r0.mPath
            android.graphics.Paint r15 = r0.mPaint
            r1.drawPath(r4, r15)
            r19.restore()
            return
    }

    public float getArrowHeadLength() {
            r1 = this;
            float r0 = r1.mArrowHeadLength
            return r0
    }

    public float getArrowShaftLength() {
            r1 = this;
            float r0 = r1.mArrowShaftLength
            return r0
    }

    public float getBarLength() {
            r1 = this;
            float r0 = r1.mBarLength
            return r0
    }

    public float getBarThickness() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            float r0 = r0.getStrokeWidth()
            return r0
    }

    public int getColor() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getColor()
            return r0
    }

    public int getDirection() {
            r1 = this;
            int r0 = r1.mDirection
            return r0
    }

    public float getGapSize() {
            r1 = this;
            float r0 = r1.mBarGap
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.mSize
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.mSize
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    public final android.graphics.Paint getPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            return r0
    }

    public float getProgress() {
            r1 = this;
            float r0 = r1.mProgress
            return r0
    }

    public boolean isSpinEnabled() {
            r1 = this;
            boolean r0 = r1.mSpin
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getAlpha()
            if (r2 == r0) goto L10
            android.graphics.Paint r0 = r1.mPaint
            r0.setAlpha(r2)
            r1.invalidateSelf()
        L10:
            return
    }

    public void setArrowHeadLength(float r2) {
            r1 = this;
            float r0 = r1.mArrowHeadLength
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mArrowHeadLength = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setArrowShaftLength(float r2) {
            r1 = this;
            float r0 = r1.mArrowShaftLength
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mArrowShaftLength = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setBarLength(float r2) {
            r1 = this;
            float r0 = r1.mBarLength
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mBarLength = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setBarThickness(float r5) {
            r4 = this;
            android.graphics.Paint r0 = r4.mPaint
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L22
            android.graphics.Paint r0 = r4.mPaint
            r0.setStrokeWidth(r5)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r5 / r0
            double r0 = (double) r0
            float r2 = androidx.appcompat.graphics.drawable.DrawerArrowDrawable.ARROW_HEAD_ANGLE
            double r2 = (double) r2
            double r2 = java.lang.Math.cos(r2)
            double r0 = r0 * r2
            float r0 = (float) r0
            r4.mMaxCutForBarSize = r0
            r4.invalidateSelf()
        L22:
            return
    }

    public void setColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getColor()
            if (r2 == r0) goto L10
            android.graphics.Paint r0 = r1.mPaint
            r0.setColor(r2)
            r1.invalidateSelf()
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    public void setDirection(int r2) {
            r1 = this;
            int r0 = r1.mDirection
            if (r2 == r0) goto L9
            r1.mDirection = r2
            r1.invalidateSelf()
        L9:
            return
    }

    public void setGapSize(float r2) {
            r1 = this;
            float r0 = r1.mBarGap
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mBarGap = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setProgress(float r2) {
            r1 = this;
            float r0 = r1.mProgress
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mProgress = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setSpinEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mSpin
            if (r0 == r2) goto L9
            r1.mSpin = r2
            r1.invalidateSelf()
        L9:
            return
    }

    public void setVerticalMirror(boolean r2) {
            r1 = this;
            boolean r0 = r1.mVerticalMirror
            if (r0 == r2) goto L9
            r1.mVerticalMirror = r2
            r1.invalidateSelf()
        L9:
            return
    }
}
