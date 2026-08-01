package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class SwitchCompat extends android.widget.CompoundButton implements androidx.appcompat.widget.EmojiCompatConfigurationView {
    private static final java.lang.String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int[] CHECKED_STATE_SET = null;
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final android.util.Property<androidx.appcompat.widget.SwitchCompat, java.lang.Float> THUMB_POS = null;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private androidx.appcompat.widget.AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private androidx.appcompat.widget.SwitchCompat.EmojiCompatInitCallback mEmojiCompatInitCallback;
    private boolean mEnforceSwitchWidth;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private android.text.Layout mOffLayout;
    private android.text.Layout mOnLayout;
    android.animation.ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private android.text.method.TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final android.graphics.Rect mTempRect;
    private android.content.res.ColorStateList mTextColors;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;
    private java.lang.CharSequence mTextOff;
    private java.lang.CharSequence mTextOffTransformed;
    private java.lang.CharSequence mTextOn;
    private java.lang.CharSequence mTextOnTransformed;
    private final android.text.TextPaint mTextPaint;
    private android.graphics.drawable.Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private android.content.res.ColorStateList mThumbTintList;
    private android.graphics.PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private android.graphics.drawable.Drawable mTrackDrawable;
    private android.content.res.ColorStateList mTrackTintList;
    private android.graphics.PorterDuff.Mode mTrackTintMode;
    private android.view.VelocityTracker mVelocityTracker;


    static class Api18Impl {
        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setAutoCancel(android.animation.ObjectAnimator r0, boolean r1) {
                r0.setAutoCancel(r1)
                return
        }
    }

    static class EmojiCompatInitCallback extends androidx.emoji2.text.EmojiCompat.InitCallback {
        private final java.lang.ref.Reference<androidx.appcompat.widget.SwitchCompat> mOuterWeakRef;

        EmojiCompatInitCallback(androidx.appcompat.widget.SwitchCompat r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mOuterWeakRef = r0
                return
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onFailed(java.lang.Throwable r2) {
                r1 = this;
                java.lang.ref.Reference<androidx.appcompat.widget.SwitchCompat> r0 = r1.mOuterWeakRef
                java.lang.Object r0 = r0.get()
                androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
                if (r0 == 0) goto Ld
                r0.onEmojiCompatInitializedForSwitchText()
            Ld:
                return
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
                r1 = this;
                java.lang.ref.Reference<androidx.appcompat.widget.SwitchCompat> r0 = r1.mOuterWeakRef
                java.lang.Object r0 = r0.get()
                androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
                if (r0 == 0) goto Ld
                r0.onEmojiCompatInitializedForSwitchText()
            Ld:
                return
        }
    }

    static {
            androidx.appcompat.widget.SwitchCompat$1 r0 = new androidx.appcompat.widget.SwitchCompat$1
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "thumbPos"
            r0.<init>(r1, r2)
            androidx.appcompat.widget.SwitchCompat.THUMB_POS = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.SwitchCompat.CHECKED_STATE_SET = r0
            return
    }

    public SwitchCompat(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SwitchCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.C0015R.attr.switchStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SwitchCompat(android.content.Context r13, android.util.AttributeSet r14, int r15) {
            r12 = this;
            r12.<init>(r13, r14, r15)
            r0 = 0
            r12.mThumbTintList = r0
            r12.mThumbTintMode = r0
            r1 = 0
            r12.mHasThumbTint = r1
            r12.mHasThumbTintMode = r1
            r12.mTrackTintList = r0
            r12.mTrackTintMode = r0
            r12.mHasTrackTint = r1
            r12.mHasTrackTintMode = r1
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r12.mVelocityTracker = r2
            r2 = 1
            r12.mEnforceSwitchWidth = r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r12.mTempRect = r3
            android.content.Context r3 = r12.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r12, r3)
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>(r2)
            r12.mTextPaint = r3
            android.content.res.Resources r3 = r12.getResources()
            android.text.TextPaint r4 = r12.mTextPaint
            android.util.DisplayMetrics r5 = r3.getDisplayMetrics()
            float r5 = r5.density
            r4.density = r5
            int[] r4 = androidx.appcompat.C0015R.styleable.SwitchCompat
            androidx.appcompat.widget.TintTypedArray r4 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r13, r14, r4, r15, r1)
            int[] r7 = androidx.appcompat.C0015R.styleable.SwitchCompat
            android.content.res.TypedArray r9 = r4.getWrappedTypeArray()
            r11 = 0
            r5 = r12
            r6 = r13
            r8 = r14
            r10 = r15
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r5, r6, r7, r8, r9, r10, r11)
            int r5 = androidx.appcompat.C0015R.styleable.SwitchCompat_android_thumb
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r12.mThumbDrawable = r5
            android.graphics.drawable.Drawable r5 = r12.mThumbDrawable
            if (r5 == 0) goto L66
            android.graphics.drawable.Drawable r5 = r12.mThumbDrawable
            r5.setCallback(r12)
        L66:
            int r5 = androidx.appcompat.C0015R.styleable.SwitchCompat_track
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r12.mTrackDrawable = r5
            android.graphics.drawable.Drawable r5 = r12.mTrackDrawable
            if (r5 == 0) goto L77
            android.graphics.drawable.Drawable r5 = r12.mTrackDrawable
            r5.setCallback(r12)
        L77:
            int r5 = androidx.appcompat.C0015R.styleable.SwitchCompat_android_textOn
            java.lang.CharSequence r5 = r4.getText(r5)
            r12.setTextOnInternal(r5)
            int r5 = androidx.appcompat.C0015R.styleable.SwitchCompat_android_textOff
            java.lang.CharSequence r5 = r4.getText(r5)
            r12.setTextOffInternal(r5)
            int r5 = androidx.appcompat.C0015R.styleable.SwitchCompat_showText
            boolean r5 = r4.getBoolean(r5, r2)
            r12.mShowText = r5
            int r5 = androidx.appcompat.C0015R.styleable.SwitchCompat_thumbTextPadding
            int r5 = r4.getDimensionPixelSize(r5, r1)
            r12.mThumbTextPadding = r5
            int r5 = androidx.appcompat.C0015R.styleable.SwitchCompat_switchMinWidth
            int r5 = r4.getDimensionPixelSize(r5, r1)
            r12.mSwitchMinWidth = r5
            int r5 = androidx.appcompat.C0015R.styleable.SwitchCompat_switchPadding
            int r5 = r4.getDimensionPixelSize(r5, r1)
            r12.mSwitchPadding = r5
            int r5 = androidx.appcompat.C0015R.styleable.SwitchCompat_splitTrack
            boolean r5 = r4.getBoolean(r5, r1)
            r12.mSplitTrack = r5
            int r5 = androidx.appcompat.C0015R.styleable.SwitchCompat_thumbTint
            android.content.res.ColorStateList r5 = r4.getColorStateList(r5)
            if (r5 == 0) goto Lbd
            r12.mThumbTintList = r5
            r12.mHasThumbTint = r2
        Lbd:
            int r6 = androidx.appcompat.C0015R.styleable.SwitchCompat_thumbTintMode
            r7 = -1
            int r6 = r4.getInt(r6, r7)
            android.graphics.PorterDuff$Mode r6 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r6, r0)
            android.graphics.PorterDuff$Mode r8 = r12.mThumbTintMode
            if (r8 == r6) goto Ld0
            r12.mThumbTintMode = r6
            r12.mHasThumbTintMode = r2
        Ld0:
            boolean r8 = r12.mHasThumbTint
            if (r8 != 0) goto Ld8
            boolean r8 = r12.mHasThumbTintMode
            if (r8 == 0) goto Ldb
        Ld8:
            r12.applyThumbTint()
        Ldb:
            int r8 = androidx.appcompat.C0015R.styleable.SwitchCompat_trackTint
            android.content.res.ColorStateList r8 = r4.getColorStateList(r8)
            if (r8 == 0) goto Le7
            r12.mTrackTintList = r8
            r12.mHasTrackTint = r2
        Le7:
            int r9 = androidx.appcompat.C0015R.styleable.SwitchCompat_trackTintMode
            int r7 = r4.getInt(r9, r7)
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r7, r0)
            android.graphics.PorterDuff$Mode r7 = r12.mTrackTintMode
            if (r7 == r0) goto Lf9
            r12.mTrackTintMode = r0
            r12.mHasTrackTintMode = r2
        Lf9:
            boolean r2 = r12.mHasTrackTint
            if (r2 != 0) goto L101
            boolean r2 = r12.mHasTrackTintMode
            if (r2 == 0) goto L104
        L101:
            r12.applyTrackTint()
        L104:
            int r2 = androidx.appcompat.C0015R.styleable.SwitchCompat_switchTextAppearance
            int r1 = r4.getResourceId(r2, r1)
            if (r1 == 0) goto L10f
            r12.setSwitchTextAppearance(r13, r1)
        L10f:
            androidx.appcompat.widget.AppCompatTextHelper r2 = new androidx.appcompat.widget.AppCompatTextHelper
            r2.<init>(r12)
            r12.mTextHelper = r2
            androidx.appcompat.widget.AppCompatTextHelper r2 = r12.mTextHelper
            r2.loadFromAttributes(r14, r15)
            r4.recycle()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r13)
            int r7 = r2.getScaledTouchSlop()
            r12.mTouchSlop = r7
            int r7 = r2.getScaledMinimumFlingVelocity()
            r12.mMinFlingVelocity = r7
            androidx.appcompat.widget.AppCompatEmojiTextHelper r7 = r12.getEmojiTextViewHelper()
            r7.loadFromAttributes(r14, r15)
            r12.refreshDrawableState()
            boolean r9 = r12.isChecked()
            r12.setChecked(r9)
            return
    }

    private void animateThumbToCheckedState(boolean r6) {
            r5 = this;
            if (r6 == 0) goto L5
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L6
        L5:
            r0 = 0
        L6:
            android.util.Property<androidx.appcompat.widget.SwitchCompat, java.lang.Float> r1 = androidx.appcompat.widget.SwitchCompat.THUMB_POS
            r2 = 1
            float[] r3 = new float[r2]
            r4 = 0
            r3[r4] = r0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r5, r1, r3)
            r5.mPositionAnimator = r1
            android.animation.ObjectAnimator r1 = r5.mPositionAnimator
            r3 = 250(0xfa, double:1.235E-321)
            r1.setDuration(r3)
            android.animation.ObjectAnimator r1 = r5.mPositionAnimator
            androidx.appcompat.widget.SwitchCompat.Api18Impl.setAutoCancel(r1, r2)
            android.animation.ObjectAnimator r1 = r5.mPositionAnimator
            r1.start()
            return
    }

    private void applyThumbTint() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            if (r0 == 0) goto L3f
            boolean r0 = r2.mHasThumbTint
            if (r0 != 0) goto Lc
            boolean r0 = r2.mHasThumbTintMode
            if (r0 == 0) goto L3f
        Lc:
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.mThumbDrawable = r0
            boolean r0 = r2.mHasThumbTint
            if (r0 == 0) goto L23
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            android.content.res.ColorStateList r1 = r2.mThumbTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L23:
            boolean r0 = r2.mHasThumbTintMode
            if (r0 == 0) goto L2e
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            android.graphics.PorterDuff$Mode r1 = r2.mThumbTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2e:
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L3f:
            return
    }

    private void applyTrackTint() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            if (r0 == 0) goto L3f
            boolean r0 = r2.mHasTrackTint
            if (r0 != 0) goto Lc
            boolean r0 = r2.mHasTrackTintMode
            if (r0 == 0) goto L3f
        Lc:
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.mTrackDrawable = r0
            boolean r0 = r2.mHasTrackTint
            if (r0 == 0) goto L23
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            android.content.res.ColorStateList r1 = r2.mTrackTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L23:
            boolean r0 = r2.mHasTrackTintMode
            if (r0 == 0) goto L2e
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            android.graphics.PorterDuff$Mode r1 = r2.mTrackTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2e:
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L3f:
            return
    }

    private void cancelPositionAnimator() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.mPositionAnimator
            if (r0 == 0) goto L9
            android.animation.ObjectAnimator r0 = r1.mPositionAnimator
            r0.cancel()
        L9:
            return
    }

    private void cancelSuperTouch(android.view.MotionEvent r3) {
            r2 = this;
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3)
            r1 = 3
            r0.setAction(r1)
            super.onTouchEvent(r0)
            r0.recycle()
            return
    }

    private static float constrain(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6
            r0 = r2
            goto Ld
        L6:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lc
            r0 = r3
            goto Ld
        Lc:
            r0 = r1
        Ld:
            return r0
    }

    private java.lang.CharSequence doTransformForOnOffText(java.lang.CharSequence r3) {
            r2 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r2.getEmojiTextViewHelper()
            android.text.method.TransformationMethod r1 = r2.mSwitchTransformationMethod
            android.text.method.TransformationMethod r0 = r0.wrapTransformationMethod(r1)
            if (r0 == 0) goto L12
            java.lang.CharSequence r1 = r0.getTransformation(r3, r2)
            goto L13
        L12:
            r1 = r3
        L13:
            return r1
    }

    private androidx.appcompat.widget.AppCompatEmojiTextHelper getEmojiTextViewHelper() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.mAppCompatEmojiTextHelper
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = new androidx.appcompat.widget.AppCompatEmojiTextHelper
            r0.<init>(r1)
            r1.mAppCompatEmojiTextHelper = r0
        Lb:
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.mAppCompatEmojiTextHelper
            return r0
    }

    private boolean getTargetCheckedState() {
            r2 = this;
            float r0 = r2.mThumbPosition
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private int getThumbOffset() {
            r3 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r3)
            if (r0 == 0) goto Lc
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3.mThumbPosition
            float r0 = r0 - r1
            goto Le
        Lc:
            float r0 = r3.mThumbPosition
        Le:
            int r1 = r3.getThumbScrollRange()
            float r1 = (float) r1
            float r1 = r1 * r0
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            return r1
    }

    private int getThumbScrollRange() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.mTrackDrawable
            if (r0 == 0) goto L2a
            android.graphics.Rect r0 = r4.mTempRect
            android.graphics.drawable.Drawable r1 = r4.mTrackDrawable
            r1.getPadding(r0)
            android.graphics.drawable.Drawable r1 = r4.mThumbDrawable
            if (r1 == 0) goto L16
            android.graphics.drawable.Drawable r1 = r4.mThumbDrawable
            android.graphics.Rect r1 = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(r1)
            goto L18
        L16:
            android.graphics.Rect r1 = androidx.appcompat.widget.DrawableUtils.INSETS_NONE
        L18:
            int r2 = r4.mSwitchWidth
            int r3 = r4.mThumbWidth
            int r2 = r2 - r3
            int r3 = r0.left
            int r2 = r2 - r3
            int r3 = r0.right
            int r2 = r2 - r3
            int r3 = r1.left
            int r2 = r2 - r3
            int r3 = r1.right
            int r2 = r2 - r3
            return r2
        L2a:
            r0 = 0
            return r0
    }

    private boolean hitThumb(float r8, float r9) {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.mThumbDrawable
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getThumbOffset()
            android.graphics.drawable.Drawable r2 = r7.mThumbDrawable
            android.graphics.Rect r3 = r7.mTempRect
            r2.getPadding(r3)
            int r2 = r7.mSwitchTop
            int r3 = r7.mTouchSlop
            int r2 = r2 - r3
            int r3 = r7.mSwitchLeft
            int r3 = r3 + r0
            int r4 = r7.mTouchSlop
            int r3 = r3 - r4
            int r4 = r7.mThumbWidth
            int r4 = r4 + r3
            android.graphics.Rect r5 = r7.mTempRect
            int r5 = r5.left
            int r4 = r4 + r5
            android.graphics.Rect r5 = r7.mTempRect
            int r5 = r5.right
            int r4 = r4 + r5
            int r5 = r7.mTouchSlop
            int r4 = r4 + r5
            int r5 = r7.mSwitchBottom
            int r6 = r7.mTouchSlop
            int r5 = r5 + r6
            float r6 = (float) r3
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 <= 0) goto L46
            float r6 = (float) r4
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 >= 0) goto L46
            float r6 = (float) r2
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 <= 0) goto L46
            float r6 = (float) r5
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 >= 0) goto L46
            r1 = 1
        L46:
            return r1
    }

    private android.text.Layout makeLayout(java.lang.CharSequence r10) {
            r9 = this;
            android.text.StaticLayout r8 = new android.text.StaticLayout
            android.text.TextPaint r2 = r9.mTextPaint
            if (r10 == 0) goto L13
            android.text.TextPaint r0 = r9.mTextPaint
            float r0 = android.text.Layout.getDesiredWidth(r10, r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            goto L14
        L13:
            r0 = 0
        L14:
            r3 = r0
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            r6 = 0
            r7 = 1
            r5 = 1065353216(0x3f800000, float:1.0)
            r0 = r8
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    private void setOffStateDescriptionOnRAndAbove() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1b
        L7:
            java.lang.CharSequence r0 = r2.mTextOff
            if (r0 != 0) goto L16
            android.content.res.Resources r0 = r2.getResources()
            int r1 = androidx.appcompat.C0015R.string.abc_capital_off
            java.lang.String r0 = r0.getString(r1)
            goto L18
        L16:
            java.lang.CharSequence r0 = r2.mTextOff
        L18:
            androidx.core.view.ViewCompat.setStateDescription(r2, r0)
        L1b:
            return
    }

    private void setOnStateDescriptionOnRAndAbove() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1b
        L7:
            java.lang.CharSequence r0 = r2.mTextOn
            if (r0 != 0) goto L16
            android.content.res.Resources r0 = r2.getResources()
            int r1 = androidx.appcompat.C0015R.string.abc_capital_on
            java.lang.String r0 = r0.getString(r1)
            goto L18
        L16:
            java.lang.CharSequence r0 = r2.mTextOn
        L18:
            androidx.core.view.ViewCompat.setStateDescription(r2, r0)
        L1b:
            return
    }

    private void setSwitchTypefaceByIndex(int r2, int r3) {
            r1 = this;
            r0 = 0
            switch(r2) {
                case 1: goto Lb;
                case 2: goto L8;
                case 3: goto L5;
                default: goto L4;
            }
        L4:
            goto Le
        L5:
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            goto Le
        L8:
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            goto Le
        Lb:
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
        Le:
            r1.setSwitchTypeface(r0, r3)
            return
    }

    private void setTextOffInternal(java.lang.CharSequence r2) {
            r1 = this;
            r1.mTextOff = r2
            java.lang.CharSequence r0 = r1.doTransformForOnOffText(r2)
            r1.mTextOffTransformed = r0
            r0 = 0
            r1.mOffLayout = r0
            boolean r0 = r1.mShowText
            if (r0 == 0) goto L12
            r1.setupEmojiCompatLoadCallback()
        L12:
            return
    }

    private void setTextOnInternal(java.lang.CharSequence r2) {
            r1 = this;
            r1.mTextOn = r2
            java.lang.CharSequence r0 = r1.doTransformForOnOffText(r2)
            r1.mTextOnTransformed = r0
            r0 = 0
            r1.mOnLayout = r0
            boolean r0 = r1.mShowText
            if (r0 == 0) goto L12
            r1.setupEmojiCompatLoadCallback()
        L12:
            return
    }

    private void setupEmojiCompatLoadCallback() {
            r3 = this;
            androidx.appcompat.widget.SwitchCompat$EmojiCompatInitCallback r0 = r3.mEmojiCompatInitCallback
            if (r0 != 0) goto L2d
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r3.mAppCompatEmojiTextHelper
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto Ld
            goto L2d
        Ld:
            boolean r0 = androidx.emoji2.text.EmojiCompat.isConfigured()
            if (r0 == 0) goto L2c
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            int r1 = r0.getLoadState()
            r2 = 3
            if (r1 == r2) goto L20
            if (r1 != 0) goto L2c
        L20:
            androidx.appcompat.widget.SwitchCompat$EmojiCompatInitCallback r2 = new androidx.appcompat.widget.SwitchCompat$EmojiCompatInitCallback
            r2.<init>(r3)
            r3.mEmojiCompatInitCallback = r2
            androidx.appcompat.widget.SwitchCompat$EmojiCompatInitCallback r2 = r3.mEmojiCompatInitCallback
            r0.registerInitCallback(r2)
        L2c:
            return
        L2d:
            return
    }

    private void stopDrag(android.view.MotionEvent r8) {
            r7 = this;
            r0 = 0
            r7.mTouchMode = r0
            int r1 = r8.getAction()
            r2 = 1
            if (r1 != r2) goto L12
            boolean r1 = r7.isEnabled()
            if (r1 == 0) goto L12
            r1 = r2
            goto L13
        L12:
            r1 = r0
        L13:
            boolean r3 = r7.isChecked()
            if (r1 == 0) goto L49
            android.view.VelocityTracker r4 = r7.mVelocityTracker
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.computeCurrentVelocity(r5)
            android.view.VelocityTracker r4 = r7.mVelocityTracker
            float r4 = r4.getXVelocity()
            float r5 = java.lang.Math.abs(r4)
            int r6 = r7.mMinFlingVelocity
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L44
            boolean r5 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r7)
            r6 = 0
            if (r5 == 0) goto L3d
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 >= 0) goto L42
            goto L41
        L3d:
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 <= 0) goto L42
        L41:
            goto L43
        L42:
            r2 = r0
        L43:
            goto L48
        L44:
            boolean r2 = r7.getTargetCheckedState()
        L48:
            goto L4a
        L49:
            r2 = r3
        L4a:
            if (r2 == r3) goto L4f
            r7.playSoundEffect(r0)
        L4f:
            r7.setChecked(r2)
            r7.cancelSuperTouch(r8)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r14) {
            r13 = this;
            android.graphics.Rect r0 = r13.mTempRect
            int r1 = r13.mSwitchLeft
            int r2 = r13.mSwitchTop
            int r3 = r13.mSwitchRight
            int r4 = r13.mSwitchBottom
            int r5 = r13.getThumbOffset()
            int r5 = r5 + r1
            android.graphics.drawable.Drawable r6 = r13.mThumbDrawable
            if (r6 == 0) goto L1a
            android.graphics.drawable.Drawable r6 = r13.mThumbDrawable
            android.graphics.Rect r6 = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(r6)
            goto L1c
        L1a:
            android.graphics.Rect r6 = androidx.appcompat.widget.DrawableUtils.INSETS_NONE
        L1c:
            android.graphics.drawable.Drawable r7 = r13.mTrackDrawable
            if (r7 == 0) goto L63
            android.graphics.drawable.Drawable r7 = r13.mTrackDrawable
            r7.getPadding(r0)
            int r7 = r0.left
            int r5 = r5 + r7
            r7 = r1
            r8 = r2
            r9 = r3
            r10 = r4
            if (r6 == 0) goto L5e
            int r11 = r6.left
            int r12 = r0.left
            if (r11 <= r12) goto L3a
            int r11 = r6.left
            int r12 = r0.left
            int r11 = r11 - r12
            int r7 = r7 + r11
        L3a:
            int r11 = r6.top
            int r12 = r0.top
            if (r11 <= r12) goto L46
            int r11 = r6.top
            int r12 = r0.top
            int r11 = r11 - r12
            int r8 = r8 + r11
        L46:
            int r11 = r6.right
            int r12 = r0.right
            if (r11 <= r12) goto L52
            int r11 = r6.right
            int r12 = r0.right
            int r11 = r11 - r12
            int r9 = r9 - r11
        L52:
            int r11 = r6.bottom
            int r12 = r0.bottom
            if (r11 <= r12) goto L5e
            int r11 = r6.bottom
            int r12 = r0.bottom
            int r11 = r11 - r12
            int r10 = r10 - r11
        L5e:
            android.graphics.drawable.Drawable r11 = r13.mTrackDrawable
            r11.setBounds(r7, r8, r9, r10)
        L63:
            android.graphics.drawable.Drawable r7 = r13.mThumbDrawable
            if (r7 == 0) goto L84
            android.graphics.drawable.Drawable r7 = r13.mThumbDrawable
            r7.getPadding(r0)
            int r7 = r0.left
            int r7 = r5 - r7
            int r8 = r13.mThumbWidth
            int r8 = r8 + r5
            int r9 = r0.right
            int r8 = r8 + r9
            android.graphics.drawable.Drawable r9 = r13.mThumbDrawable
            r9.setBounds(r7, r2, r8, r4)
            android.graphics.drawable.Drawable r9 = r13.getBackground()
            if (r9 == 0) goto L84
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r9, r7, r2, r8, r4)
        L84:
            super.draw(r14)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float r2, float r3) {
            r1 = this;
            super.drawableHotspotChanged(r2, r3)
            android.graphics.drawable.Drawable r0 = r1.mThumbDrawable
            if (r0 == 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.mThumbDrawable
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r2, r3)
        Ld:
            android.graphics.drawable.Drawable r0 = r1.mTrackDrawable
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r1.mTrackDrawable
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r2, r3)
        L16:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r5 = this;
            super.drawableStateChanged()
            int[] r0 = r5.getDrawableState()
            r1 = 0
            android.graphics.drawable.Drawable r2 = r5.mThumbDrawable
            if (r2 == 0) goto L17
            boolean r3 = r2.isStateful()
            if (r3 == 0) goto L17
            boolean r3 = r2.setState(r0)
            r1 = r1 | r3
        L17:
            android.graphics.drawable.Drawable r3 = r5.mTrackDrawable
            if (r3 == 0) goto L26
            boolean r4 = r3.isStateful()
            if (r4 == 0) goto L26
            boolean r4 = r3.setState(r0)
            r1 = r1 | r4
        L26:
            if (r1 == 0) goto L2b
            r5.invalidate()
        L2b:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r2 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r2)
            if (r0 != 0) goto Lb
            int r0 = super.getCompoundPaddingLeft()
            return r0
        Lb:
            int r0 = super.getCompoundPaddingLeft()
            int r1 = r2.mSwitchWidth
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1f
            int r1 = r2.mSwitchPadding
            int r0 = r0 + r1
        L1f:
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
            r2 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r2)
            if (r0 == 0) goto Lb
            int r0 = super.getCompoundPaddingRight()
            return r0
        Lb:
            int r0 = super.getCompoundPaddingRight()
            int r1 = r2.mSwitchWidth
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1f
            int r1 = r2.mSwitchPadding
            int r0 = r0 + r1
        L1f:
            return r0
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r1 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = androidx.core.widget.TextViewCompat.unwrapCustomSelectionActionModeCallback(r0)
            return r0
    }

    public boolean getShowText() {
            r1 = this;
            boolean r0 = r1.mShowText
            return r0
    }

    public boolean getSplitTrack() {
            r1 = this;
            boolean r0 = r1.mSplitTrack
            return r0
    }

    public int getSwitchMinWidth() {
            r1 = this;
            int r0 = r1.mSwitchMinWidth
            return r0
    }

    public int getSwitchPadding() {
            r1 = this;
            int r0 = r1.mSwitchPadding
            return r0
    }

    public java.lang.CharSequence getTextOff() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTextOff
            return r0
    }

    public java.lang.CharSequence getTextOn() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTextOn
            return r0
    }

    public android.graphics.drawable.Drawable getThumbDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mThumbDrawable
            return r0
    }

    protected final float getThumbPosition() {
            r1 = this;
            float r0 = r1.mThumbPosition
            return r0
    }

    public int getThumbTextPadding() {
            r1 = this;
            int r0 = r1.mThumbTextPadding
            return r0
    }

    public android.content.res.ColorStateList getThumbTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mThumbTintList
            return r0
    }

    public android.graphics.PorterDuff.Mode getThumbTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mThumbTintMode
            return r0
    }

    public android.graphics.drawable.Drawable getTrackDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mTrackDrawable
            return r0
    }

    public android.content.res.ColorStateList getTrackTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mTrackTintList
            return r0
    }

    public android.graphics.PorterDuff.Mode getTrackTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mTrackTintMode
            return r0
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.mThumbDrawable
            if (r0 == 0) goto Lc
            android.graphics.drawable.Drawable r0 = r1.mThumbDrawable
            r0.jumpToCurrentState()
        Lc:
            android.graphics.drawable.Drawable r0 = r1.mTrackDrawable
            if (r0 == 0) goto L15
            android.graphics.drawable.Drawable r0 = r1.mTrackDrawable
            r0.jumpToCurrentState()
        L15:
            android.animation.ObjectAnimator r0 = r1.mPositionAnimator
            if (r0 == 0) goto L29
            android.animation.ObjectAnimator r0 = r1.mPositionAnimator
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L29
            android.animation.ObjectAnimator r0 = r1.mPositionAnimator
            r0.end()
            r0 = 0
            r1.mPositionAnimator = r0
        L29:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int r3) {
            r2 = this;
            int r0 = r3 + 1
            int[] r0 = super.onCreateDrawableState(r0)
            boolean r1 = r2.isChecked()
            if (r1 == 0) goto L11
            int[] r1 = androidx.appcompat.widget.SwitchCompat.CHECKED_STATE_SET
            mergeDrawableStates(r0, r1)
        L11:
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            super.onDraw(r17)
            android.graphics.Rect r2 = r0.mTempRect
            android.graphics.drawable.Drawable r3 = r0.mTrackDrawable
            if (r3 == 0) goto L11
            r3.getPadding(r2)
            goto L14
        L11:
            r2.setEmpty()
        L14:
            int r4 = r0.mSwitchTop
            int r5 = r0.mSwitchBottom
            int r6 = r2.top
            int r6 = r6 + r4
            int r7 = r2.bottom
            int r7 = r5 - r7
            android.graphics.drawable.Drawable r8 = r0.mThumbDrawable
            if (r3 == 0) goto L51
            boolean r9 = r0.mSplitTrack
            if (r9 == 0) goto L4e
            if (r8 == 0) goto L4e
            android.graphics.Rect r9 = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(r8)
            r8.copyBounds(r2)
            int r10 = r2.left
            int r11 = r9.left
            int r10 = r10 + r11
            r2.left = r10
            int r10 = r2.right
            int r11 = r9.right
            int r10 = r10 - r11
            r2.right = r10
            int r10 = r17.save()
            android.graphics.Region$Op r11 = android.graphics.Region.Op.DIFFERENCE
            r1.clipRect(r2, r11)
            r3.draw(r1)
            r1.restoreToCount(r10)
            goto L51
        L4e:
            r3.draw(r1)
        L51:
            int r9 = r17.save()
            if (r8 == 0) goto L5a
            r8.draw(r1)
        L5a:
            boolean r10 = r16.getTargetCheckedState()
            if (r10 == 0) goto L63
            android.text.Layout r10 = r0.mOnLayout
            goto L65
        L63:
            android.text.Layout r10 = r0.mOffLayout
        L65:
            if (r10 == 0) goto Lab
            int[] r11 = r16.getDrawableState()
            android.content.res.ColorStateList r12 = r0.mTextColors
            if (r12 == 0) goto L7b
            android.text.TextPaint r12 = r0.mTextPaint
            android.content.res.ColorStateList r13 = r0.mTextColors
            r14 = 0
            int r13 = r13.getColorForState(r11, r14)
            r12.setColor(r13)
        L7b:
            android.text.TextPaint r12 = r0.mTextPaint
            r12.drawableState = r11
            if (r8 == 0) goto L8b
            android.graphics.Rect r12 = r8.getBounds()
            int r13 = r12.left
            int r14 = r12.right
            int r13 = r13 + r14
            goto L8f
        L8b:
            int r13 = r16.getWidth()
        L8f:
            int r12 = r13 / 2
            int r14 = r10.getWidth()
            int r14 = r14 / 2
            int r12 = r12 - r14
            int r14 = r6 + r7
            int r14 = r14 / 2
            int r15 = r10.getHeight()
            int r15 = r15 / 2
            int r14 = r14 - r15
            float r15 = (float) r12
            float r0 = (float) r14
            r1.translate(r15, r0)
            r10.draw(r1)
        Lab:
            r1.restoreToCount(r9)
            return
    }

    void onEmojiCompatInitializedForSwitchText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTextOn
            r1.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r1.mTextOff
            r1.setTextOffInternal(r0)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "android.widget.Switch"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r6) {
            r5 = this;
            super.onInitializeAccessibilityNodeInfo(r6)
            java.lang.String r0 = "android.widget.Switch"
            r6.setClassName(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L42
            boolean r0 = r5.isChecked()
            if (r0 == 0) goto L17
            java.lang.CharSequence r0 = r5.mTextOn
            goto L19
        L17:
            java.lang.CharSequence r0 = r5.mTextOff
        L19:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L42
            java.lang.CharSequence r1 = r6.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L2d
            r6.setText(r0)
            goto L42
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r3 = r2.append(r1)
            r4 = 32
            java.lang.StringBuilder r3 = r3.append(r4)
            r3.append(r0)
            r6.setText(r2)
        L42:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            r0 = 0
            r1 = 0
            android.graphics.drawable.Drawable r2 = r7.mThumbDrawable
            if (r2 == 0) goto L31
            android.graphics.Rect r2 = r7.mTempRect
            android.graphics.drawable.Drawable r3 = r7.mTrackDrawable
            if (r3 == 0) goto L15
            android.graphics.drawable.Drawable r3 = r7.mTrackDrawable
            r3.getPadding(r2)
            goto L18
        L15:
            r2.setEmpty()
        L18:
            android.graphics.drawable.Drawable r3 = r7.mThumbDrawable
            android.graphics.Rect r3 = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(r3)
            int r4 = r3.left
            int r5 = r2.left
            int r4 = r4 - r5
            r5 = 0
            int r0 = java.lang.Math.max(r5, r4)
            int r4 = r3.right
            int r6 = r2.right
            int r4 = r4 - r6
            int r1 = java.lang.Math.max(r5, r4)
        L31:
            boolean r2 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r7)
            if (r2 == 0) goto L42
            int r2 = r7.getPaddingLeft()
            int r2 = r2 + r0
            int r3 = r7.mSwitchWidth
            int r3 = r3 + r2
            int r3 = r3 - r0
            int r3 = r3 - r1
            goto L53
        L42:
            int r2 = r7.getWidth()
            int r3 = r7.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r2 - r1
            int r2 = r7.mSwitchWidth
            int r2 = r3 - r2
            int r2 = r2 + r0
            int r2 = r2 + r1
        L53:
            int r4 = r7.getGravity()
            r4 = r4 & 112(0x70, float:1.57E-43)
            switch(r4) {
                case 16: goto L72;
                case 80: goto L64;
                default: goto L5c;
            }
        L5c:
            int r5 = r7.getPaddingTop()
            int r4 = r7.mSwitchHeight
            int r4 = r4 + r5
            goto L8c
        L64:
            int r4 = r7.getHeight()
            int r5 = r7.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r7.mSwitchHeight
            int r5 = r4 - r5
            goto L8c
        L72:
            int r4 = r7.getPaddingTop()
            int r5 = r7.getHeight()
            int r4 = r4 + r5
            int r5 = r7.getPaddingBottom()
            int r4 = r4 - r5
            int r4 = r4 / 2
            int r5 = r7.mSwitchHeight
            int r5 = r5 / 2
            int r5 = r4 - r5
            int r4 = r7.mSwitchHeight
            int r4 = r4 + r5
        L8c:
            r7.mSwitchLeft = r2
            r7.mSwitchTop = r5
            r7.mSwitchBottom = r4
            r7.mSwitchRight = r3
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r12, int r13) {
            r11 = this;
            boolean r0 = r11.mShowText
            if (r0 == 0) goto L1c
            android.text.Layout r0 = r11.mOnLayout
            if (r0 != 0) goto L10
            java.lang.CharSequence r0 = r11.mTextOnTransformed
            android.text.Layout r0 = r11.makeLayout(r0)
            r11.mOnLayout = r0
        L10:
            android.text.Layout r0 = r11.mOffLayout
            if (r0 != 0) goto L1c
            java.lang.CharSequence r0 = r11.mTextOffTransformed
            android.text.Layout r0 = r11.makeLayout(r0)
            r11.mOffLayout = r0
        L1c:
            android.graphics.Rect r0 = r11.mTempRect
            android.graphics.drawable.Drawable r1 = r11.mThumbDrawable
            if (r1 == 0) goto L3a
            android.graphics.drawable.Drawable r1 = r11.mThumbDrawable
            r1.getPadding(r0)
            android.graphics.drawable.Drawable r1 = r11.mThumbDrawable
            int r1 = r1.getIntrinsicWidth()
            int r2 = r0.left
            int r1 = r1 - r2
            int r2 = r0.right
            int r1 = r1 - r2
            android.graphics.drawable.Drawable r2 = r11.mThumbDrawable
            int r2 = r2.getIntrinsicHeight()
            goto L3c
        L3a:
            r1 = 0
            r2 = 0
        L3c:
            boolean r3 = r11.mShowText
            if (r3 == 0) goto L56
            android.text.Layout r3 = r11.mOnLayout
            int r3 = r3.getWidth()
            android.text.Layout r4 = r11.mOffLayout
            int r4 = r4.getWidth()
            int r3 = java.lang.Math.max(r3, r4)
            int r4 = r11.mThumbTextPadding
            int r4 = r4 * 2
            int r3 = r3 + r4
            goto L57
        L56:
            r3 = 0
        L57:
            int r4 = java.lang.Math.max(r3, r1)
            r11.mThumbWidth = r4
            android.graphics.drawable.Drawable r4 = r11.mTrackDrawable
            if (r4 == 0) goto L6d
            android.graphics.drawable.Drawable r4 = r11.mTrackDrawable
            r4.getPadding(r0)
            android.graphics.drawable.Drawable r4 = r11.mTrackDrawable
            int r4 = r4.getIntrinsicHeight()
            goto L71
        L6d:
            r0.setEmpty()
            r4 = 0
        L71:
            int r5 = r0.left
            int r6 = r0.right
            android.graphics.drawable.Drawable r7 = r11.mThumbDrawable
            if (r7 == 0) goto L8b
            android.graphics.drawable.Drawable r7 = r11.mThumbDrawable
            android.graphics.Rect r7 = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(r7)
            int r8 = r7.left
            int r5 = java.lang.Math.max(r5, r8)
            int r8 = r7.right
            int r6 = java.lang.Math.max(r6, r8)
        L8b:
            boolean r7 = r11.mEnforceSwitchWidth
            if (r7 == 0) goto L9c
            int r7 = r11.mSwitchMinWidth
            int r8 = r11.mThumbWidth
            int r8 = r8 * 2
            int r8 = r8 + r5
            int r8 = r8 + r6
            int r7 = java.lang.Math.max(r7, r8)
            goto L9e
        L9c:
            int r7 = r11.mSwitchMinWidth
        L9e:
            int r8 = java.lang.Math.max(r4, r2)
            r11.mSwitchWidth = r7
            r11.mSwitchHeight = r8
            super.onMeasure(r12, r13)
            int r9 = r11.getMeasuredHeight()
            if (r9 >= r8) goto Lb7
            int r10 = r11.getMeasuredWidthAndState()
            r11.setMeasuredDimension(r10, r8)
        Lb7:
            return
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.onPopulateAccessibilityEvent(r3)
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto Lc
            java.lang.CharSequence r0 = r2.mTextOn
            goto Le
        Lc:
            java.lang.CharSequence r0 = r2.mTextOff
        Le:
            if (r0 == 0) goto L17
            java.util.List r1 = r3.getText()
            r1.add(r0)
        L17:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            android.view.VelocityTracker r0 = r9.mVelocityTracker
            r0.addMovement(r10)
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = 1
            switch(r0) {
                case 0: goto L97;
                case 1: goto L83;
                case 2: goto L10;
                case 3: goto L83;
                default: goto Le;
            }
        Le:
            goto Lb1
        L10:
            int r3 = r9.mTouchMode
            switch(r3) {
                case 0: goto L81;
                case 1: goto L4d;
                case 2: goto L16;
                default: goto L15;
            }
        L15:
            goto L82
        L16:
            float r1 = r10.getX()
            int r3 = r9.getThumbScrollRange()
            float r4 = r9.mTouchX
            float r4 = r1 - r4
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            if (r3 == 0) goto L2b
            float r7 = (float) r3
            float r7 = r4 / r7
            goto L33
        L2b:
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 <= 0) goto L31
            r7 = r5
            goto L33
        L31:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
        L33:
            boolean r8 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r9)
            if (r8 == 0) goto L3a
            float r7 = -r7
        L3a:
            float r8 = r9.mThumbPosition
            float r8 = r8 + r7
            float r5 = constrain(r8, r6, r5)
            float r6 = r9.mThumbPosition
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L4c
            r9.mTouchX = r1
            r9.setThumbPosition(r5)
        L4c:
            return r2
        L4d:
            float r3 = r10.getX()
            float r4 = r10.getY()
            float r5 = r9.mTouchX
            float r5 = r3 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r9.mTouchSlop
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L73
            float r5 = r9.mTouchY
            float r5 = r4 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r9.mTouchSlop
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L82
        L73:
            r9.mTouchMode = r1
            android.view.ViewParent r1 = r9.getParent()
            r1.requestDisallowInterceptTouchEvent(r2)
            r9.mTouchX = r3
            r9.mTouchY = r4
            return r2
        L81:
        L82:
            goto Lb1
        L83:
            int r3 = r9.mTouchMode
            if (r3 != r1) goto L8e
            r9.stopDrag(r10)
            super.onTouchEvent(r10)
            return r2
        L8e:
            r1 = 0
            r9.mTouchMode = r1
            android.view.VelocityTracker r1 = r9.mVelocityTracker
            r1.clear()
            goto Lb1
        L97:
            float r1 = r10.getX()
            float r3 = r10.getY()
            boolean r4 = r9.isEnabled()
            if (r4 == 0) goto Lb1
            boolean r4 = r9.hitThumb(r1, r3)
            if (r4 == 0) goto Lb1
            r9.mTouchMode = r2
            r9.mTouchX = r1
            r9.mTouchY = r3
        Lb1:
            boolean r1 = super.onTouchEvent(r10)
            return r1
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            r0.setAllCaps(r2)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            super.setChecked(r2)
            boolean r2 = r1.isChecked()
            if (r2 == 0) goto Ld
            r1.setOnStateDescriptionOnRAndAbove()
            goto L10
        Ld:
            r1.setOffStateDescriptionOnRAndAbove()
        L10:
            android.os.IBinder r0 = r1.getWindowToken()
            if (r0 == 0) goto L20
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r0 == 0) goto L20
            r1.animateThumbToCheckedState(r2)
            goto L2c
        L20:
            r1.cancelPositionAnimator()
            if (r2 == 0) goto L28
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L29
        L28:
            r0 = 0
        L29:
            r1.setThumbPosition(r0)
        L2c:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r2) {
            r1 = this;
            android.view.ActionMode$Callback r0 = androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(r1, r2)
            super.setCustomSelectionActionModeCallback(r0)
            return
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            r0.setEnabled(r2)
            java.lang.CharSequence r0 = r1.mTextOn
            r1.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r1.mTextOff
            r1.setTextOffInternal(r0)
            r1.requestLayout()
            return
    }

    protected final void setEnforceSwitchWidth(boolean r1) {
            r0 = this;
            r0.mEnforceSwitchWidth = r1
            r0.invalidate()
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r0 = r0.getFilters(r2)
            super.setFilters(r0)
            return
    }

    public void setShowText(boolean r2) {
            r1 = this;
            boolean r0 = r1.mShowText
            if (r0 == r2) goto Le
            r1.mShowText = r2
            r1.requestLayout()
            if (r2 == 0) goto Le
            r1.setupEmojiCompatLoadCallback()
        Le:
            return
    }

    public void setSplitTrack(boolean r1) {
            r0 = this;
            r0.mSplitTrack = r1
            r0.invalidate()
            return
    }

    public void setSwitchMinWidth(int r1) {
            r0 = this;
            r0.mSwitchMinWidth = r1
            r0.requestLayout()
            return
    }

    public void setSwitchPadding(int r1) {
            r0 = this;
            r0.mSwitchPadding = r1
            r0.requestLayout()
            return
    }

    public void setSwitchTextAppearance(android.content.Context r9, int r10) {
            r8 = this;
            int[] r0 = androidx.appcompat.C0015R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r9, r10, r0)
            int r1 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textColor
            android.content.res.ColorStateList r1 = r0.getColorStateList(r1)
            if (r1 == 0) goto L11
            r8.mTextColors = r1
            goto L17
        L11:
            android.content.res.ColorStateList r2 = r8.getTextColors()
            r8.mTextColors = r2
        L17:
            int r2 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textSize
            r3 = 0
            int r2 = r0.getDimensionPixelSize(r2, r3)
            if (r2 == 0) goto L34
            float r4 = (float) r2
            android.text.TextPaint r5 = r8.mTextPaint
            float r5 = r5.getTextSize()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L34
            android.text.TextPaint r4 = r8.mTextPaint
            float r5 = (float) r2
            r4.setTextSize(r5)
            r8.requestLayout()
        L34:
            int r4 = androidx.appcompat.C0015R.styleable.TextAppearance_android_typeface
            r5 = -1
            int r4 = r0.getInt(r4, r5)
            int r6 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textStyle
            int r5 = r0.getInt(r6, r5)
            r8.setSwitchTypefaceByIndex(r4, r5)
            int r6 = androidx.appcompat.C0015R.styleable.TextAppearance_textAllCaps
            boolean r3 = r0.getBoolean(r6, r3)
            if (r3 == 0) goto L58
            androidx.appcompat.text.AllCapsTransformationMethod r6 = new androidx.appcompat.text.AllCapsTransformationMethod
            android.content.Context r7 = r8.getContext()
            r6.<init>(r7)
            r8.mSwitchTransformationMethod = r6
            goto L5b
        L58:
            r6 = 0
            r8.mSwitchTransformationMethod = r6
        L5b:
            java.lang.CharSequence r6 = r8.mTextOn
            r8.setTextOnInternal(r6)
            java.lang.CharSequence r6 = r8.mTextOff
            r8.setTextOffInternal(r6)
            r0.recycle()
            return
    }

    public void setSwitchTypeface(android.graphics.Typeface r2) {
            r1 = this;
            android.text.TextPaint r0 = r1.mTextPaint
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 == 0) goto L14
            android.text.TextPaint r0 = r1.mTextPaint
            android.graphics.Typeface r0 = r0.getTypeface()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
        L14:
            android.text.TextPaint r0 = r1.mTextPaint
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 != 0) goto L29
            if (r2 == 0) goto L29
        L1e:
            android.text.TextPaint r0 = r1.mTextPaint
            r0.setTypeface(r2)
            r1.requestLayout()
            r1.invalidate()
        L29:
            return
    }

    public void setSwitchTypeface(android.graphics.Typeface r7, int r8) {
            r6 = this;
            r0 = 0
            r1 = 0
            if (r8 <= 0) goto L32
            if (r7 != 0) goto Lb
            android.graphics.Typeface r7 = android.graphics.Typeface.defaultFromStyle(r8)
            goto Lf
        Lb:
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r7, r8)
        Lf:
            r6.setSwitchTypeface(r7)
            if (r7 == 0) goto L19
            int r2 = r7.getStyle()
            goto L1a
        L19:
            r2 = r1
        L1a:
            int r3 = ~r2
            r3 = r3 & r8
            android.text.TextPaint r4 = r6.mTextPaint
            r5 = r3 & 1
            if (r5 == 0) goto L23
            r1 = 1
        L23:
            r4.setFakeBoldText(r1)
            android.text.TextPaint r1 = r6.mTextPaint
            r4 = r3 & 2
            if (r4 == 0) goto L2e
            r0 = -1098907648(0xffffffffbe800000, float:-0.25)
        L2e:
            r1.setTextSkewX(r0)
            goto L3f
        L32:
            android.text.TextPaint r2 = r6.mTextPaint
            r2.setFakeBoldText(r1)
            android.text.TextPaint r1 = r6.mTextPaint
            r1.setTextSkewX(r0)
            r6.setSwitchTypeface(r7)
        L3f:
            return
    }

    public void setTextOff(java.lang.CharSequence r2) {
            r1 = this;
            r1.setTextOffInternal(r2)
            r1.requestLayout()
            boolean r0 = r1.isChecked()
            if (r0 != 0) goto Lf
            r1.setOffStateDescriptionOnRAndAbove()
        Lf:
            return
    }

    public void setTextOn(java.lang.CharSequence r2) {
            r1 = this;
            r1.setTextOnInternal(r2)
            r1.requestLayout()
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto Lf
            r1.setOnStateDescriptionOnRAndAbove()
        Lf:
            return
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r2.mThumbDrawable
            r1 = 0
            r0.setCallback(r1)
        La:
            r2.mThumbDrawable = r3
            if (r3 == 0) goto L11
            r3.setCallback(r2)
        L11:
            r2.requestLayout()
            return
    }

    void setThumbPosition(float r1) {
            r0 = this;
            r0.mThumbPosition = r1
            r0.invalidate()
            return
    }

    public void setThumbResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setThumbDrawable(r0)
            return
    }

    public void setThumbTextPadding(int r1) {
            r0 = this;
            r0.mThumbTextPadding = r1
            r0.requestLayout()
            return
    }

    public void setThumbTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mThumbTintList = r2
            r0 = 1
            r1.mHasThumbTint = r0
            r1.applyThumbTint()
            return
    }

    public void setThumbTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.mThumbTintMode = r2
            r0 = 1
            r1.mHasThumbTintMode = r0
            r1.applyThumbTint()
            return
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r2.mTrackDrawable
            r1 = 0
            r0.setCallback(r1)
        La:
            r2.mTrackDrawable = r3
            if (r3 == 0) goto L11
            r3.setCallback(r2)
        L11:
            r2.requestLayout()
            return
    }

    public void setTrackResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setTrackDrawable(r0)
            return
    }

    public void setTrackTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mTrackTintList = r2
            r0 = 1
            r1.mHasTrackTint = r0
            r1.applyTrackTint()
            return
    }

    public void setTrackTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.mTrackTintMode = r2
            r0 = 1
            r1.mHasTrackTintMode = r0
            r1.applyTrackTint()
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.mThumbDrawable
            if (r2 == r0) goto L11
            android.graphics.drawable.Drawable r0 = r1.mTrackDrawable
            if (r2 != r0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }
}
