package Yue;

import Yue.C6898;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C8812;
import com.google.android.material.color.utilities.Contrast;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7692 extends CompoundButton implements InterfaceC4608 {
    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;

    @InterfaceC6391
    private C3308 mAppCompatEmojiTextHelper;

    @InterfaceC6490
    private C1329 mEmojiCompatInitCallback;
    private boolean mEnforceSwitchWidth;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;

    @InterfaceC6490
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private final C3337 mTextHelper;
    private CharSequence mTextOff;
    private CharSequence mTextOffTransformed;
    private CharSequence mTextOn;
    private CharSequence mTextOnTransformed;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;
    private static final Property<C7692, Float> THUMB_POS = new C1328(Float.class, "thumbPos");
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۦ۠$ۥ */
    public class C1328 extends Property<C7692, Float> {
        public C1328(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Float get(C7692 c7692) {
            return Float.valueOf(c7692.mThumbPosition);
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void set(C7692 c7692, Float f) {
            c7692.setThumbPosition(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۦ۠$ۥ۟ */
    public static class C1329 extends C8812.AbstractC8818 {

        /* JADX INFO: renamed from: ۥ */
        public final Reference<C7692> f3022;

        public C1329(C7692 c7692) {
            this.f3022 = new WeakReference(c7692);
        }

        @Override // androidx.emoji2.text.C8812.AbstractC8818
        /* JADX INFO: renamed from: ۥ */
        public void mo3791(@InterfaceC6490 Throwable th) {
            C7692 c7692 = this.f3022.get();
            if (c7692 != null) {
                c7692.onEmojiCompatInitializedForSwitchText();
            }
        }

        @Override // androidx.emoji2.text.C8812.AbstractC8818
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo1574() {
            C7692 c7692 = this.f3022.get();
            if (c7692 != null) {
                c7692.onEmojiCompatInitializedForSwitchText();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7692(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC6391
    private C3308 getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C3308(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C8370.m4344(this) ? 1.0f - this.mThumbPosition : this.mThumbPosition) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.mTempRect;
        drawable.getPadding(rect);
        Drawable drawable2 = this.mThumbDrawable;
        Rect rectM13288 = drawable2 != null ? C4533.m13288(drawable2) : C4533.f9687;
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect.left) - rect.right) - rectM13288.left) - rectM13288.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.mTextOff = charSequence;
        this.mTextOffTransformed = m24471(charSequence);
        this.mOffLayout = null;
        if (this.mShowText) {
            m24477();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.mTextOn = charSequence;
        this.mTextOnTransformed = m24471(charSequence);
        this.mOnLayout = null;
        if (this.mShowText) {
            m24477();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static float m24467(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    @Override // android.view.View
    public void draw(@InterfaceC6391 Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.mTempRect;
        int i3 = this.mSwitchLeft;
        int i4 = this.mSwitchTop;
        int i5 = this.mSwitchRight;
        int i6 = this.mSwitchBottom;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.mThumbDrawable;
        Rect rectM13288 = drawable != null ? C4533.m13288(drawable) : C4533.f9687;
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM13288 != null) {
                int i8 = rectM13288.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM13288.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM13288.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM13288.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.mTrackDrawable.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.mTrackDrawable.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.mThumbWidth + rect.right;
            this.mThumbDrawable.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C4520.m13233(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            C4520.m13232(drawable, f, f2);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            C4520.m13232(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C8370.m4344(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.mSwitchPadding : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C8370.m4344(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.mSwitchPadding : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @InterfaceC6490
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C7759.m24678(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
    public final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    @InterfaceC6490
    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    @InterfaceC6490
    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    @InterfaceC6490
    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    @InterfaceC6490
    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    @Override // Yue.InterfaceC4608
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m377();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.mPositionAnimator.end();
        this.mPositionAnimator = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.mSwitchTop;
        int i2 = this.mSwitchBottom;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (!this.mSplitTrack || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM13288 = C4533.m13288(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM13288.left;
                rect.right -= rectM13288.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.mOnLayout : this.mOffLayout;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    public void onEmojiCompatInitializedForSwitchText() {
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM13288 = C4533.m13288(this.mThumbDrawable);
            iMax = Math.max(0, rectM13288.left - rect.left);
            iMax2 = Math.max(0, rectM13288.right - rect.right);
        } else {
            iMax = 0;
        }
        if (C8370.m4344(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.mSwitchWidth + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.mSwitchWidth) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i5 = this.mSwitchHeight;
            paddingTop = paddingTop2 - (i5 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.mSwitchHeight;
                this.mSwitchLeft = paddingLeft;
                this.mSwitchTop = paddingTop;
                this.mSwitchBottom = height;
                this.mSwitchRight = width;
            }
            paddingTop = getPaddingTop();
            i5 = this.mSwitchHeight;
        }
        height = i5 + paddingTop;
        this.mSwitchLeft = paddingLeft;
        this.mSwitchTop = paddingTop;
        this.mSwitchBottom = height;
        this.mSwitchRight = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = m24473(this.mTextOnTransformed);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = m24473(this.mTextOffTransformed);
            }
        }
        Rect rect = this.mTempRect;
        Drawable drawable = this.mThumbDrawable;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.mThumbWidth = Math.max(this.mShowText ? Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) + (this.mThumbTextPadding * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect rectM13288 = C4533.m13288(drawable3);
            iMax = Math.max(iMax, rectM13288.left);
            iMax2 = Math.max(iMax2, rectM13288.right);
        }
        int iMax3 = this.mEnforceSwitchWidth ? Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + iMax + iMax2) : this.mSwitchMinWidth;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.mSwitchWidth = iMax3;
        this.mSwitchHeight = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (isEnabled() && m24472(x, y)) {
                this.mTouchMode = 1;
                this.mTouchX = x;
                this.mTouchY = y;
            }
        } else if (actionMasked == 1) {
            if (this.mTouchMode == 2) {
                m24478(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.mTouchMode = 0;
            this.mVelocityTracker.clear();
        } else if (actionMasked == 2) {
            int i = this.mTouchMode;
            if (i == 1) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (Math.abs(x2 - this.mTouchX) > this.mTouchSlop || Math.abs(y2 - this.mTouchY) > this.mTouchSlop) {
                    this.mTouchMode = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.mTouchX = x2;
                    this.mTouchY = y2;
                    return true;
                }
            } else if (i == 2) {
                float x3 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f = x3 - this.mTouchX;
                float f2 = thumbScrollRange != 0 ? f / thumbScrollRange : f > 0.0f ? 1.0f : -1.0f;
                if (C8370.m4344(this)) {
                    f2 = -f2;
                }
                float fM24467 = m24467(this.mThumbPosition + f2, 0.0f, 1.0f);
                if (fM24467 != this.mThumbPosition) {
                    this.mTouchX = x3;
                    setThumbPosition(fM24467);
                }
                return true;
            }
        } else if (actionMasked == 3) {
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m6767(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            m24475();
        } else {
            m24474();
        }
        if (getWindowToken() != null && isLaidOut()) {
            m3787(zIsChecked);
        } else {
            m24469();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@InterfaceC6490 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C7759.m24679(this, callback));
    }

    @Override // Yue.InterfaceC4608
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m6768(z);
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.mEnforceSwitchWidth = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@InterfaceC6391 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m376(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.mShowText != z) {
            this.mShowText = z;
            requestLayout();
            if (z) {
                m24477();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.mSplitTrack = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.mSwitchMinWidth = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.mSwitchPadding = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        C7837 c7837M24867 = C7837.m24867(context, i, C6898.C6909.f19729);
        ColorStateList colorStateListM24871 = c7837M24867.m24871(C6898.C6909.f19733);
        if (colorStateListM24871 != null) {
            this.mTextColors = colorStateListM24871;
        } else {
            this.mTextColors = getTextColors();
        }
        int iM24874 = c7837M24867.m24874(C6898.C6909.f19730, 0);
        if (iM24874 != 0) {
            float f = iM24874;
            if (f != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f);
                requestLayout();
            }
        }
        m24476(c7837M24867.m24882(C6898.C6909.f19731, -1), c7837M24867.m24882(C6898.C6909.f19732, -1));
        if (c7837M24867.m3933(C6898.C6909.f19744, false)) {
            this.mSwitchTransformationMethod = new C3192(getContext());
        } else {
            this.mSwitchTransformationMethod = null;
        }
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        c7837M24867.m24899();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSwitchTypeface(Typeface typeface, int i) {
        if (i <= 0) {
            this.mTextPaint.setFakeBoldText(false);
            this.mTextPaint.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i2 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i;
            this.mTextPaint.setFakeBoldText((i2 & 1) != 0);
            this.mTextPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        m24474();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m24475();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C3323.m396(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.mThumbTextPadding = i;
        requestLayout();
    }

    public void setThumbTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        m3788();
    }

    public void setThumbTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        m3788();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C3323.m396(getContext(), i));
    }

    public void setTrackTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        m24468();
    }

    public void setTrackTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        m24468();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(@InterfaceC6391 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3787(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, THUMB_POS, z ? 1.0f : 0.0f);
        this.mPositionAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.mPositionAnimator.setAutoCancel(true);
        this.mPositionAnimator.start();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m3788() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                Drawable drawableMutate = C4520.m13239(drawable).mutate();
                this.mThumbDrawable = drawableMutate;
                if (this.mHasThumbTint) {
                    C4520.m13236(drawableMutate, this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    C4520.m13237(this.mThumbDrawable, this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m24468() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                Drawable drawableMutate = C4520.m13239(drawable).mutate();
                this.mTrackDrawable = drawableMutate;
                if (this.mHasTrackTint) {
                    C4520.m13236(drawableMutate, this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    C4520.m13237(this.mTrackDrawable, this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m24469() {
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m24470(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final CharSequence m24471(@InterfaceC6490 CharSequence charSequence) {
        TransformationMethod transformationMethodM6769 = getEmojiTextViewHelper().m6769(this.mSwitchTransformationMethod);
        return transformationMethodM6769 != null ? transformationMethodM6769.getTransformation(charSequence, this) : charSequence;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m24472(float f, float f2) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i = this.mSwitchTop;
        int i2 = this.mTouchSlop;
        int i3 = i - i2;
        int i4 = (this.mSwitchLeft + thumbOffset) - i2;
        int i5 = this.mThumbWidth + i4;
        Rect rect = this.mTempRect;
        return f > ((float) i4) && f < ((float) (((i5 + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.mSwitchBottom + i2));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Layout m24473(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.mTextPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m24474() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.mTextOff;
            if (string == null) {
                string = getResources().getString(C6898.C6907.f19004);
            }
            C8273.m27484(this, string);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m24475() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.mTextOn;
            if (string == null) {
                string = getResources().getString(C6898.C6907.f19005);
            }
            C8273.m27484(this, string);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m24476(int i, int i2) {
        setSwitchTypeface(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m24477() {
        if (this.mEmojiCompatInitCallback == null && this.mAppCompatEmojiTextHelper.m377() && C8812.m29623()) {
            C8812 c8812M29617 = C8812.m29617();
            int iM29632 = c8812M29617.m29632();
            if (iM29632 == 3 || iM29632 == 0) {
                C1329 c1329 = new C1329(this);
                this.mEmojiCompatInitCallback = c1329;
                c8812M29617.m29645(c1329);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m24478(MotionEvent motionEvent) {
        this.mTouchMode = 0;
        boolean targetCheckedState = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xVelocity) <= this.mMinFlingVelocity) {
                targetCheckedState = getTargetCheckedState();
            } else if (!C8370.m4344(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        m24470(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7692(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18569);
    }

    public C7692(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        C7772.m3866(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C7837 c7837M24869 = C7837.m24869(context, attributeSet, C6898.C6909.f19714, i, 0);
        C8273.m27437(this, context, C6898.C6909.f19714, attributeSet, c7837M24869.m24895(), i, 0);
        Drawable drawableM24875 = c7837M24869.m24875(C6898.C6909.f19717);
        this.mThumbDrawable = drawableM24875;
        if (drawableM24875 != null) {
            drawableM24875.setCallback(this);
        }
        Drawable drawableM248752 = c7837M24869.m24875(C6898.C6909.f19726);
        this.mTrackDrawable = drawableM248752;
        if (drawableM248752 != null) {
            drawableM248752.setCallback(this);
        }
        setTextOnInternal(c7837M24869.m24891(C6898.C6909.f19715));
        setTextOffInternal(c7837M24869.m24891(C6898.C6909.f19716));
        this.mShowText = c7837M24869.m3933(C6898.C6909.f19718, true);
        this.mThumbTextPadding = c7837M24869.m24874(C6898.C6909.f19723, 0);
        this.mSwitchMinWidth = c7837M24869.m24874(C6898.C6909.f19720, 0);
        this.mSwitchPadding = c7837M24869.m24874(C6898.C6909.f19721, 0);
        this.mSplitTrack = c7837M24869.m3933(C6898.C6909.f19719, false);
        ColorStateList colorStateListM24871 = c7837M24869.m24871(C6898.C6909.f19724);
        if (colorStateListM24871 != null) {
            this.mThumbTintList = colorStateListM24871;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode modeM13289 = C4533.m13289(c7837M24869.m24882(C6898.C6909.f19725, -1), null);
        if (this.mThumbTintMode != modeM13289) {
            this.mThumbTintMode = modeM13289;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            m3788();
        }
        ColorStateList colorStateListM248712 = c7837M24869.m24871(C6898.C6909.f19727);
        if (colorStateListM248712 != null) {
            this.mTrackTintList = colorStateListM248712;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode modeM132892 = C4533.m13289(c7837M24869.m24882(C6898.C6909.f19728, -1), null);
        if (this.mTrackTintMode != modeM132892) {
            this.mTrackTintMode = modeM132892;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            m24468();
        }
        int iM24888 = c7837M24869.m24888(C6898.C6909.f19722, 0);
        if (iM24888 != 0) {
            setSwitchTextAppearance(context, iM24888);
        }
        C3337 c3337 = new C3337(this);
        this.mTextHelper = c3337;
        c3337.m6819(attributeSet, i);
        c7837M24869.m24899();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m6766(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() == null || this.mTextPaint.getTypeface().equals(typeface)) && (this.mTextPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
