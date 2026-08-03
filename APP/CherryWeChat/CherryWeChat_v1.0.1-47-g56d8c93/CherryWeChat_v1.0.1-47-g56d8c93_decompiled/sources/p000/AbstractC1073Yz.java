package p000;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Yz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1073Yz extends CompoundButton {

    /* JADX INFO: renamed from: R */
    public static final C2264n7 f3394R = new C2264n7(5, Float.class, "thumbPos");

    /* JADX INFO: renamed from: S */
    public static final int[] f3395S = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public int f3396A;

    /* JADX INFO: renamed from: B */
    public int f3397B;

    /* JADX INFO: renamed from: C */
    public int f3398C;

    /* JADX INFO: renamed from: D */
    public int f3399D;

    /* JADX INFO: renamed from: E */
    public int f3400E;

    /* JADX INFO: renamed from: F */
    public int f3401F;

    /* JADX INFO: renamed from: G */
    public int f3402G;

    /* JADX INFO: renamed from: H */
    public boolean f3403H;

    /* JADX INFO: renamed from: I */
    public final TextPaint f3404I;

    /* JADX INFO: renamed from: J */
    public final ColorStateList f3405J;

    /* JADX INFO: renamed from: K */
    public StaticLayout f3406K;

    /* JADX INFO: renamed from: L */
    public StaticLayout f3407L;

    /* JADX INFO: renamed from: M */
    public final C2740y2 f3408M;

    /* JADX INFO: renamed from: N */
    public ObjectAnimator f3409N;

    /* JADX INFO: renamed from: O */
    public C0391J3 f3410O;

    /* JADX INFO: renamed from: P */
    public C0151Df f3411P;

    /* JADX INFO: renamed from: Q */
    public final Rect f3412Q;

    /* JADX INFO: renamed from: a */
    public Drawable f3413a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f3414b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f3415c;

    /* JADX INFO: renamed from: d */
    public boolean f3416d;

    /* JADX INFO: renamed from: e */
    public boolean f3417e;

    /* JADX INFO: renamed from: f */
    public Drawable f3418f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f3419g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f3420h;

    /* JADX INFO: renamed from: i */
    public boolean f3421i;

    /* JADX INFO: renamed from: j */
    public boolean f3422j;

    /* JADX INFO: renamed from: k */
    public int f3423k;

    /* JADX INFO: renamed from: l */
    public int f3424l;

    /* JADX INFO: renamed from: m */
    public int f3425m;

    /* JADX INFO: renamed from: n */
    public boolean f3426n;

    /* JADX INFO: renamed from: o */
    public CharSequence f3427o;

    /* JADX INFO: renamed from: p */
    public CharSequence f3428p;

    /* JADX INFO: renamed from: q */
    public CharSequence f3429q;

    /* JADX INFO: renamed from: r */
    public CharSequence f3430r;

    /* JADX INFO: renamed from: s */
    public boolean f3431s;

    /* JADX INFO: renamed from: t */
    public int f3432t;

    /* JADX INFO: renamed from: u */
    public final int f3433u;

    /* JADX INFO: renamed from: v */
    public float f3434v;

    /* JADX INFO: renamed from: w */
    public float f3435w;

    /* JADX INFO: renamed from: x */
    public final VelocityTracker f3436x;

    /* JADX INFO: renamed from: y */
    public final int f3437y;

    /* JADX INFO: renamed from: z */
    public float f3438z;

    public AbstractC1073Yz(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, io.github.cherrywechat.R.attr.switchStyle);
        this.f3414b = null;
        this.f3415c = null;
        this.f3416d = false;
        this.f3417e = false;
        this.f3419g = null;
        this.f3420h = null;
        this.f3421i = false;
        this.f3422j = false;
        this.f3436x = VelocityTracker.obtain();
        this.f3403H = true;
        this.f3412Q = new Rect();
        AbstractC1042YA.m1987a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.f3404I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0982Wu.f3087v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, io.github.cherrywechat.R.attr.switchStyle, 0);
        C2656w4 c2656w4 = new C2656w4(context, typedArrayObtainStyledAttributes);
        AbstractC2185lE.m4398k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, io.github.cherrywechat.R.attr.switchStyle);
        Drawable drawableM5210q = c2656w4.m5210q(2);
        this.f3413a = drawableM5210q;
        if (drawableM5210q != null) {
            drawableM5210q.setCallback(this);
        }
        Drawable drawableM5210q2 = c2656w4.m5210q(11);
        this.f3418f = drawableM5210q2;
        if (drawableM5210q2 != null) {
            drawableM5210q2.setCallback(this);
        }
        setTextOnInternal(typedArrayObtainStyledAttributes.getText(0));
        setTextOffInternal(typedArrayObtainStyledAttributes.getText(1));
        this.f3431s = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.f3423k = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f3424l = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f3425m = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f3426n = typedArrayObtainStyledAttributes.getBoolean(4, false);
        ColorStateList colorStateListM5209p = c2656w4.m5209p(9);
        if (colorStateListM5209p != null) {
            this.f3414b = colorStateListM5209p;
            this.f3416d = true;
        }
        PorterDuff.Mode modeM161c = AbstractC0107Ce.m161c(typedArrayObtainStyledAttributes.getInt(10, -1), null);
        if (this.f3415c != modeM161c) {
            this.f3415c = modeM161c;
            this.f3417e = true;
        }
        if (this.f3416d || this.f3417e) {
            m2009a();
        }
        ColorStateList colorStateListM5209p2 = c2656w4.m5209p(12);
        if (colorStateListM5209p2 != null) {
            this.f3419g = colorStateListM5209p2;
            this.f3421i = true;
        }
        PorterDuff.Mode modeM161c2 = AbstractC0107Ce.m161c(typedArrayObtainStyledAttributes.getInt(13, -1), null);
        if (this.f3420h != modeM161c2) {
            this.f3420h = modeM161c2;
            this.f3422j = true;
        }
        if (this.f3421i || this.f3422j) {
            m2010b();
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId2, AbstractC0982Wu.f3088w);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes2.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC0295Gu.m622o(context, resourceId)) == null) ? typedArrayObtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f3405J = colorStateList;
            } else {
                this.f3405J = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes2.getInt(1, -1);
            int i2 = typedArrayObtainStyledAttributes2.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(14, false)) {
                Context context2 = getContext();
                C2740y2 c2740y2 = new C2740y2();
                c2740y2.f9344a = context2.getResources().getConfiguration().locale;
                this.f3408M = c2740y2;
            } else {
                this.f3408M = null;
            }
            setTextOnInternal(this.f3427o);
            setTextOffInternal(this.f3429q);
            typedArrayObtainStyledAttributes2.recycle();
        }
        new C2175l4(this).m4378f(attributeSet, io.github.cherrywechat.R.attr.switchStyle);
        c2656w4.m5195E();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3433u = viewConfiguration.getScaledTouchSlop();
        this.f3437y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m829b(attributeSet, io.github.cherrywechat.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f3410O == null) {
            this.f3410O = new C0391J3(this);
        }
        return this.f3410O;
    }

    private boolean getTargetCheckedState() {
        return this.f3438z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f3438z : this.f3438z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3418f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3412Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3413a;
        Rect rectM160b = drawable2 != null ? AbstractC0107Ce.m160b(drawable2) : AbstractC0107Ce.f252c;
        return ((((this.f3396A - this.f3398C) - rect.left) - rect.right) - rectM160b.left) - rectM160b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3429q = charSequence;
        TransformationMethod transformationMethodMo103L = ((AbstractC0828TB) getEmojiTextViewHelper().f1327b.f328b).mo103L(this.f3408M);
        if (transformationMethodMo103L != null) {
            charSequence = transformationMethodMo103L.getTransformation(charSequence, this);
        }
        this.f3430r = charSequence;
        this.f3407L = null;
        if (this.f3431s) {
            m2012d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3427o = charSequence;
        TransformationMethod transformationMethodMo103L = ((AbstractC0828TB) getEmojiTextViewHelper().f1327b.f328b).mo103L(this.f3408M);
        if (transformationMethodMo103L != null) {
            charSequence = transformationMethodMo103L.getTransformation(charSequence, this);
        }
        this.f3428p = charSequence;
        this.f3406K = null;
        if (this.f3431s) {
            m2012d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2009a() {
        Drawable drawable = this.f3413a;
        if (drawable != null) {
            if (this.f3416d || this.f3417e) {
                Drawable drawableMutate = drawable.mutate();
                this.f3413a = drawableMutate;
                if (this.f3416d) {
                    drawableMutate.setTintList(this.f3414b);
                }
                if (this.f3417e) {
                    this.f3413a.setTintMode(this.f3415c);
                }
                if (this.f3413a.isStateful()) {
                    this.f3413a.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2010b() {
        Drawable drawable = this.f3418f;
        if (drawable != null) {
            if (this.f3421i || this.f3422j) {
                Drawable drawableMutate = drawable.mutate();
                this.f3418f = drawableMutate;
                if (this.f3421i) {
                    drawableMutate.setTintList(this.f3419g);
                }
                if (this.f3422j) {
                    this.f3418f.setTintMode(this.f3420h);
                }
                if (this.f3418f.isStateful()) {
                    this.f3418f.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2011c() {
        setTextOnInternal(this.f3427o);
        setTextOffInternal(this.f3429q);
        requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m2012d() {
        if (this.f3411P == null && ((AbstractC0828TB) this.f3410O.f1327b.f328b).mo105s() && C2372pf.f8342k != null) {
            C2372pf c2372pfM4798a = C2372pf.m4798a();
            int iM4799b = c2372pfM4798a.m4799b();
            if (iM4799b == 3 || iM4799b == 0) {
                C0151Df c0151Df = new C0151Df(this);
                this.f3411P = c0151Df;
                c2372pfM4798a.m4803f(c0151Df);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f3399D;
        int i4 = this.f3400E;
        int i5 = this.f3401F;
        int i6 = this.f3402G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f3413a;
        Rect rectM160b = drawable != null ? AbstractC0107Ce.m160b(drawable) : AbstractC0107Ce.f252c;
        Drawable drawable2 = this.f3418f;
        Rect rect = this.f3412Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM160b != null) {
                int i8 = rectM160b.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM160b.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM160b.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM160b.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f3418f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f3418f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f3413a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f3398C + rect.right;
            this.f3413a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f3413a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f3418f;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3413a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3418f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3396A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3425m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3396A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3425m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public boolean getShowText() {
        return this.f3431s;
    }

    public boolean getSplitTrack() {
        return this.f3426n;
    }

    public int getSwitchMinWidth() {
        return this.f3424l;
    }

    public int getSwitchPadding() {
        return this.f3425m;
    }

    public CharSequence getTextOff() {
        return this.f3429q;
    }

    public CharSequence getTextOn() {
        return this.f3427o;
    }

    public Drawable getThumbDrawable() {
        return this.f3413a;
    }

    public final float getThumbPosition() {
        return this.f3438z;
    }

    public int getThumbTextPadding() {
        return this.f3423k;
    }

    public ColorStateList getThumbTintList() {
        return this.f3414b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3415c;
    }

    public Drawable getTrackDrawable() {
        return this.f3418f;
    }

    public ColorStateList getTrackTintList() {
        return this.f3419g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3420h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3413a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3418f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3409N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3409N.end();
        this.f3409N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3395S);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f3418f;
        Rect rect = this.f3412Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f3400E;
        int i2 = this.f3402G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f3413a;
        if (drawable != null) {
            if (!this.f3426n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM160b = AbstractC0107Ce.m160b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM160b.left;
                rect.right -= rectM160b.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f3406K : this.f3407L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f3404I;
            ColorStateList colorStateList = this.f3405J;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f3427o : this.f3429q;
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f3413a != null) {
            Drawable drawable = this.f3418f;
            Rect rect = this.f3412Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM160b = AbstractC0107Ce.m160b(this.f3413a);
            iMax = Math.max(0, rectM160b.left - rect.left);
            iMax2 = Math.max(0, rectM160b.right - rect.right);
        } else {
            iMax = 0;
        }
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f3396A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f3396A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f3397B;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f3397B + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f3397B;
        }
        this.f3399D = paddingLeft;
        this.f3400E = paddingTop;
        this.f3402G = height;
        this.f3401F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f3431s) {
            StaticLayout staticLayout = this.f3406K;
            TextPaint textPaint = this.f3404I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f3428p;
                this.f3406K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f3407L == null) {
                CharSequence charSequence2 = this.f3430r;
                this.f3407L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f3413a;
        Rect rect = this.f3412Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f3413a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f3413a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f3398C = Math.max(this.f3431s ? (this.f3423k * 2) + Math.max(this.f3406K.getWidth(), this.f3407L.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f3418f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f3418f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f3413a;
        if (drawable3 != null) {
            Rect rectM160b = AbstractC0107Ce.m160b(drawable3);
            iMax = Math.max(iMax, rectM160b.left);
            iMax2 = Math.max(iMax2, rectM160b.right);
        }
        int iMax3 = this.f3403H ? Math.max(this.f3424l, (this.f3398C * 2) + iMax + iMax2) : this.f3424l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f3396A = iMax3;
        this.f3397B = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3427o : this.f3429q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean targetCheckedState;
        VelocityTracker velocityTracker = this.f3436x;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f3433u;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.f3432t == 2) {
                    this.f3432t = 0;
                    boolean z = motionEvent.getAction() == 1 && isEnabled();
                    boolean zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity = velocityTracker.getXVelocity();
                        targetCheckedState = Math.abs(xVelocity) > ((float) this.f3437y) ? getLayoutDirection() != 1 ? xVelocity > 0.0f : xVelocity < 0.0f : getTargetCheckedState();
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f3432t = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.f3432t;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f = i;
                    if (Math.abs(x - this.f3434v) > f || Math.abs(y - this.f3435w) > f) {
                        this.f3432t = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f3434v = x;
                        this.f3435w = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f2 = x2 - this.f3434v;
                    float f3 = thumbScrollRange != 0 ? f2 / thumbScrollRange : f2 > 0.0f ? 1.0f : -1.0f;
                    if (getLayoutDirection() == 1) {
                        f3 = -f3;
                    }
                    float f4 = this.f3438z;
                    float f5 = f3 + f4;
                    float f6 = f5 >= 0.0f ? f5 > 1.0f ? 1.0f : f5 : 0.0f;
                    if (f6 != f4) {
                        this.f3434v = x2;
                        setThumbPosition(f6);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f3413a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f3413a;
                Rect rect = this.f3412Q;
                drawable.getPadding(rect);
                int i3 = this.f3400E - i;
                int i4 = (this.f3399D + thumbOffset) - i;
                int i5 = this.f3398C + i4 + rect.left + rect.right + i;
                int i6 = this.f3402G + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.f3432t = 1;
                    this.f3434v = x3;
                    this.f3435w = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m830c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f3427o;
                if (string == null) {
                    string = getResources().getString(io.github.cherrywechat.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                new C1132aE(io.github.cherrywechat.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m4627f(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f3429q;
            if (string2 == null) {
                string2 = getResources().getString(io.github.cherrywechat.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
            new C1132aE(io.github.cherrywechat.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m4627f(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f3409N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f3394R, zIsChecked ? 1.0f : 0.0f);
        this.f3409N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f3409N.setAutoCancel(true);
        this.f3409N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m831d(z);
        setTextOnInternal(this.f3427o);
        setTextOffInternal(this.f3429q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f3403H = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m828a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f3431s != z) {
            this.f3431s = z;
            requestLayout();
            if (z) {
                m2012d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f3426n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f3424l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f3425m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f3404I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f3429q;
        if (string == null) {
            string = getResources().getString(io.github.cherrywechat.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        new C1132aE(io.github.cherrywechat.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m4627f(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f3427o;
        if (string == null) {
            string = getResources().getString(io.github.cherrywechat.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        new C1132aE(io.github.cherrywechat.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m4627f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3413a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3413a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f3438z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AbstractC1406fG.m2695U(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f3423k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3414b = colorStateList;
        this.f3416d = true;
        m2009a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3415c = mode;
        this.f3417e = true;
        m2009a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3418f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3418f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AbstractC1406fG.m2695U(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3419g = colorStateList;
        this.f3421i = true;
        m2010b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3420h = mode;
        this.f3422j = true;
        m2010b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3413a || drawable == this.f3418f;
    }
}
