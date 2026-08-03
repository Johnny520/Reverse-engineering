package androidx.appcompat.widget;

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
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.C0983R;
import androidx.core.C1066R;
import androidx.emoji2.text.C1094c;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0437Y3;
import p000a.C0466Ze;
import p000a.C0490b1;
import p000a.C0542df;
import p000a.C0751of;
import p000a.C0755p0;
import p000a.C0756p1;
import p000a.C0828sg;
import p000a.C0866ug;
import p000a.C0889w1;
import p000a.C0893w5;
import p000a.C0912x5;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: R */
    public static final C1026a f3979R = new C1026a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: S */
    public static final int[] f3980S = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public int f3981A;

    /* JADX INFO: renamed from: B */
    public int f3982B;

    /* JADX INFO: renamed from: C */
    public int f3983C;

    /* JADX INFO: renamed from: D */
    public int f3984D;

    /* JADX INFO: renamed from: E */
    public int f3985E;

    /* JADX INFO: renamed from: F */
    public int f3986F;

    /* JADX INFO: renamed from: G */
    public int f3987G;

    /* JADX INFO: renamed from: H */
    public boolean f3988H;

    /* JADX INFO: renamed from: I */
    public final TextPaint f3989I;

    /* JADX INFO: renamed from: J */
    public final ColorStateList f3990J;

    /* JADX INFO: renamed from: K */
    public StaticLayout f3991K;

    /* JADX INFO: renamed from: L */
    public StaticLayout f3992L;

    /* JADX INFO: renamed from: M */
    public final C0755p0 f3993M;

    /* JADX INFO: renamed from: N */
    public ObjectAnimator f3994N;

    /* JADX INFO: renamed from: O */
    public C0490b1 f3995O;

    /* JADX INFO: renamed from: P */
    public C1027b f3996P;

    /* JADX INFO: renamed from: Q */
    public final Rect f3997Q;

    /* JADX INFO: renamed from: a */
    public Drawable f3998a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f3999b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f4000c;

    /* JADX INFO: renamed from: d */
    public boolean f4001d;

    /* JADX INFO: renamed from: e */
    public boolean f4002e;

    /* JADX INFO: renamed from: f */
    public Drawable f4003f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f4004g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f4005h;

    /* JADX INFO: renamed from: i */
    public boolean f4006i;

    /* JADX INFO: renamed from: j */
    public boolean f4007j;

    /* JADX INFO: renamed from: k */
    public int f4008k;

    /* JADX INFO: renamed from: l */
    public int f4009l;

    /* JADX INFO: renamed from: m */
    public int f4010m;

    /* JADX INFO: renamed from: n */
    public boolean f4011n;

    /* JADX INFO: renamed from: o */
    public CharSequence f4012o;

    /* JADX INFO: renamed from: p */
    public CharSequence f4013p;

    /* JADX INFO: renamed from: q */
    public CharSequence f4014q;

    /* JADX INFO: renamed from: r */
    public CharSequence f4015r;

    /* JADX INFO: renamed from: s */
    public boolean f4016s;

    /* JADX INFO: renamed from: t */
    public int f4017t;

    /* JADX INFO: renamed from: u */
    public final int f4018u;

    /* JADX INFO: renamed from: v */
    public float f4019v;

    /* JADX INFO: renamed from: w */
    public float f4020w;

    /* JADX INFO: renamed from: x */
    public final VelocityTracker f4021x;

    /* JADX INFO: renamed from: y */
    public final int f4022y;

    /* JADX INFO: renamed from: z */
    public float f4023z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public class C1026a extends Property<SwitchCompat, Float> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f4023z);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$b */
    public static class C1027b extends C1094c.e {

        /* JADX INFO: renamed from: a */
        public final WeakReference f4024a;

        public C1027b(SwitchCompat switchCompat) {
            this.f4024a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.C1094c.e
        /* JADX INFO: renamed from: a */
        public final void mo2369a() {
            SwitchCompat switchCompat = (SwitchCompat) this.f4024a.get();
            if (switchCompat != null) {
                switchCompat.m2367c();
            }
        }

        @Override // androidx.emoji2.text.C1094c.e
        /* JADX INFO: renamed from: b */
        public final void mo746b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f4024a.get();
            if (switchCompat != null) {
                switchCompat.m2367c();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        int resourceId;
        int i = C0983R.attr.switchStyle;
        super(context, attributeSet, i);
        this.f3999b = null;
        this.f4000c = null;
        this.f4001d = false;
        this.f4002e = false;
        this.f4004g = null;
        this.f4005h = null;
        this.f4006i = false;
        this.f4007j = false;
        this.f4021x = VelocityTracker.obtain();
        this.f3988H = true;
        this.f3997Q = new Rect();
        C0542df.m1311a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f3989I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C0751of c0751ofM1768e = C0751of.m1768e(context, attributeSet, C0983R.styleable.SwitchCompat, i);
        C0866ug.m2002i(this, context, C0983R.styleable.SwitchCompat, attributeSet, c0751ofM1768e.f2960b, i);
        Drawable drawableM1770b = c0751ofM1768e.m1770b(C0983R.styleable.SwitchCompat_android_thumb);
        this.f3998a = drawableM1770b;
        if (drawableM1770b != null) {
            drawableM1770b.setCallback(this);
        }
        Drawable drawableM1770b2 = c0751ofM1768e.m1770b(C0983R.styleable.SwitchCompat_track);
        this.f4003f = drawableM1770b2;
        if (drawableM1770b2 != null) {
            drawableM1770b2.setCallback(this);
        }
        int i2 = C0983R.styleable.SwitchCompat_android_textOn;
        TypedArray typedArray = c0751ofM1768e.f2960b;
        setTextOnInternal(typedArray.getText(i2));
        setTextOffInternal(typedArray.getText(C0983R.styleable.SwitchCompat_android_textOff));
        this.f4016s = typedArray.getBoolean(C0983R.styleable.SwitchCompat_showText, true);
        this.f4008k = typedArray.getDimensionPixelSize(C0983R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.f4009l = typedArray.getDimensionPixelSize(C0983R.styleable.SwitchCompat_switchMinWidth, 0);
        this.f4010m = typedArray.getDimensionPixelSize(C0983R.styleable.SwitchCompat_switchPadding, 0);
        this.f4011n = typedArray.getBoolean(C0983R.styleable.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListM1769a = c0751ofM1768e.m1769a(C0983R.styleable.SwitchCompat_thumbTint);
        if (colorStateListM1769a != null) {
            this.f3999b = colorStateListM1769a;
            this.f4001d = true;
        }
        PorterDuff.Mode modeM2200c = C0912x5.m2200c(typedArray.getInt(C0983R.styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.f4000c != modeM2200c) {
            this.f4000c = modeM2200c;
            this.f4002e = true;
        }
        if (this.f4001d || this.f4002e) {
            m2365a();
        }
        ColorStateList colorStateListM1769a2 = c0751ofM1768e.m1769a(C0983R.styleable.SwitchCompat_trackTint);
        if (colorStateListM1769a2 != null) {
            this.f4004g = colorStateListM1769a2;
            this.f4006i = true;
        }
        PorterDuff.Mode modeM2200c2 = C0912x5.m2200c(typedArray.getInt(C0983R.styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.f4005h != modeM2200c2) {
            this.f4005h = modeM2200c2;
            this.f4007j = true;
        }
        if (this.f4006i || this.f4007j) {
            m2366b();
        }
        int resourceId2 = typedArray.getResourceId(C0983R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, C0983R.styleable.TextAppearance);
            int i3 = C0983R.styleable.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(i3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i3, 0)) == 0 || (colorStateList = C0437Y3.m1091a(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(i3) : colorStateList;
            if (colorStateList != null) {
                this.f3990J = colorStateList;
            } else {
                this.f3990J = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0983R.styleable.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i4 = typedArrayObtainStyledAttributes.getInt(C0983R.styleable.TextAppearance_android_typeface, -1);
            int i5 = typedArrayObtainStyledAttributes.getInt(C0983R.styleable.TextAppearance_android_textStyle, -1);
            Typeface typeface = i4 != 1 ? i4 != 2 ? i4 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i5 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i5) : Typeface.create(typeface, i5);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i6 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i5;
                textPaint.setFakeBoldText((i6 & 1) != 0);
                textPaint.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.TextAppearance_textAllCaps, false)) {
                Context context2 = getContext();
                C0755p0 c0755p0 = new C0755p0();
                c0755p0.f2964a = context2.getResources().getConfiguration().locale;
                this.f3993M = c0755p0;
            } else {
                this.f3993M = null;
            }
            setTextOnInternal(this.f4012o);
            setTextOffInternal(this.f4014q);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C0756p1(this).m1786f(attributeSet, i);
        c0751ofM1768e.m1773f();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4018u = viewConfiguration.getScaledTouchSlop();
        this.f4022y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m1190b(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0490b1 getEmojiTextViewHelper() {
        if (this.f3995O == null) {
            this.f3995O = new C0490b1(this);
        }
        return this.f3995O;
    }

    private boolean getTargetCheckedState() {
        return this.f4023z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f4023z : this.f4023z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f4003f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3997Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3998a;
        Rect rectM2199b = drawable2 != null ? C0912x5.m2199b(drawable2) : C0912x5.f3517c;
        return ((((this.f3981A - this.f3983C) - rect.left) - rect.right) - rectM2199b.left) - rectM2199b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f4014q = charSequence;
        C0490b1 emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo915e = emojiTextViewHelper.f1822b.f1181a.mo915e(this.f3993M);
        if (transformationMethodMo915e != null) {
            charSequence = transformationMethodMo915e.getTransformation(charSequence, this);
        }
        this.f4015r = charSequence;
        this.f3992L = null;
        if (this.f4016s) {
            m2368d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f4012o = charSequence;
        C0490b1 emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo915e = emojiTextViewHelper.f1822b.f1181a.mo915e(this.f3993M);
        if (transformationMethodMo915e != null) {
            charSequence = transformationMethodMo915e.getTransformation(charSequence, this);
        }
        this.f4013p = charSequence;
        this.f3991K = null;
        if (this.f4016s) {
            m2368d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2365a() {
        Drawable drawable = this.f3998a;
        if (drawable != null) {
            if (this.f4001d || this.f4002e) {
                Drawable drawableMutate = drawable.mutate();
                this.f3998a = drawableMutate;
                if (this.f4001d) {
                    C0893w5.a.m2176h(drawableMutate, this.f3999b);
                }
                if (this.f4002e) {
                    C0893w5.a.m2177i(this.f3998a, this.f4000c);
                }
                if (this.f3998a.isStateful()) {
                    this.f3998a.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2366b() {
        Drawable drawable = this.f4003f;
        if (drawable != null) {
            if (this.f4006i || this.f4007j) {
                Drawable drawableMutate = drawable.mutate();
                this.f4003f = drawableMutate;
                if (this.f4006i) {
                    C0893w5.a.m2176h(drawableMutate, this.f4004g);
                }
                if (this.f4007j) {
                    C0893w5.a.m2177i(this.f4003f, this.f4005h);
                }
                if (this.f4003f.isStateful()) {
                    this.f4003f.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2367c() {
        setTextOnInternal(this.f4012o);
        setTextOffInternal(this.f4014q);
        requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m2368d() {
        if (this.f3996P == null && this.f3995O.f1822b.f1181a.mo912b() && C1094c.f4484k != null) {
            C1094c c1094cM2505a = C1094c.m2505a();
            int iM2506b = c1094cM2505a.m2506b();
            if (iM2506b == 3 || iM2506b == 0) {
                C1027b c1027b = new C1027b(this);
                this.f3996P = c1027b;
                c1094cM2505a.m2510f(c1027b);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f3984D;
        int i4 = this.f3985E;
        int i5 = this.f3986F;
        int i6 = this.f3987G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f3998a;
        Rect rectM2199b = drawable != null ? C0912x5.m2199b(drawable) : C0912x5.f3517c;
        Drawable drawable2 = this.f4003f;
        Rect rect = this.f3997Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM2199b != null) {
                int i8 = rectM2199b.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM2199b.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM2199b.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM2199b.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f4003f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f4003f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f3998a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f3983C + rect.right;
            this.f3998a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0893w5.a.m2174f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f3998a;
        if (drawable != null) {
            C0893w5.a.m2173e(drawable, f, f2);
        }
        Drawable drawable2 = this.f4003f;
        if (drawable2 != null) {
            C0893w5.a.m2173e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3998a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f4003f;
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
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3981A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f4010m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3981A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f4010m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0466Ze.m1121b(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f4016s;
    }

    public boolean getSplitTrack() {
        return this.f4011n;
    }

    public int getSwitchMinWidth() {
        return this.f4009l;
    }

    public int getSwitchPadding() {
        return this.f4010m;
    }

    public CharSequence getTextOff() {
        return this.f4014q;
    }

    public CharSequence getTextOn() {
        return this.f4012o;
    }

    public Drawable getThumbDrawable() {
        return this.f3998a;
    }

    public final float getThumbPosition() {
        return this.f4023z;
    }

    public int getThumbTextPadding() {
        return this.f4008k;
    }

    public ColorStateList getThumbTintList() {
        return this.f3999b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f4000c;
    }

    public Drawable getTrackDrawable() {
        return this.f4003f;
    }

    public ColorStateList getTrackTintList() {
        return this.f4004g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f4005h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3998a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4003f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3994N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3994N.end();
        this.f3994N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3980S);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f4003f;
        Rect rect = this.f3997Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f3985E;
        int i2 = this.f3987G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f3998a;
        if (drawable != null) {
            if (!this.f4011n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM2199b = C0912x5.m2199b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM2199b.left;
                rect.right -= rectM2199b.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f3991K : this.f3992L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3990J;
            TextPaint textPaint = this.f3989I;
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
            CharSequence charSequence = isChecked() ? this.f4012o : this.f4014q;
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
        if (this.f3998a != null) {
            Drawable drawable = this.f4003f;
            Rect rect = this.f3997Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM2199b = C0912x5.m2199b(this.f3998a);
            iMax = Math.max(0, rectM2199b.left - rect.left);
            iMax2 = Math.max(0, rectM2199b.right - rect.right);
        } else {
            iMax = 0;
        }
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f3981A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f3981A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f3982B;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f3982B + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f3982B;
        }
        this.f3984D = paddingLeft;
        this.f3985E = paddingTop;
        this.f3987G = height;
        this.f3986F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f4016s) {
            StaticLayout staticLayout = this.f3991K;
            TextPaint textPaint = this.f3989I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f4013p;
                this.f3991K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f3992L == null) {
                CharSequence charSequence2 = this.f4015r;
                this.f3992L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f3998a;
        Rect rect = this.f3997Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f3998a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f3998a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f3983C = Math.max(this.f4016s ? (this.f4008k * 2) + Math.max(this.f3991K.getWidth(), this.f3992L.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f4003f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f4003f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f3998a;
        if (drawable3 != null) {
            Rect rectM2199b = C0912x5.m2199b(drawable3);
            iMax = Math.max(iMax, rectM2199b.left);
            iMax2 = Math.max(iMax2, rectM2199b.right);
        }
        int iMax3 = this.f3988H ? Math.max(this.f4009l, (this.f3983C * 2) + iMax + iMax2) : this.f4009l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f3981A = iMax3;
        this.f3982B = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f4012o : this.f4014q;
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
        VelocityTracker velocityTracker = this.f4021x;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f4018u;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.f4017t == 2) {
                    this.f4017t = 0;
                    boolean z = motionEvent.getAction() == 1 && isEnabled();
                    boolean zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity = velocityTracker.getXVelocity();
                        targetCheckedState = Math.abs(xVelocity) > ((float) this.f4022y) ? getLayoutDirection() != 1 ? xVelocity > 0.0f : xVelocity < 0.0f : getTargetCheckedState();
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
                this.f4017t = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.f4017t;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f = i;
                    if (Math.abs(x - this.f4019v) > f || Math.abs(y - this.f4020w) > f) {
                        this.f4017t = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f4019v = x;
                        this.f4020w = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f2 = x2 - this.f4019v;
                    float f3 = thumbScrollRange != 0 ? f2 / thumbScrollRange : f2 > 0.0f ? 1.0f : -1.0f;
                    if (getLayoutDirection() == 1) {
                        f3 = -f3;
                    }
                    float f4 = this.f4023z;
                    float f5 = f3 + f4;
                    float f6 = f5 >= 0.0f ? f5 > 1.0f ? 1.0f : f5 : 0.0f;
                    if (f6 != f4) {
                        this.f4019v = x2;
                        setThumbPosition(f6);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f3998a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f3998a;
                Rect rect = this.f3997Q;
                drawable.getPadding(rect);
                int i3 = this.f3985E - i;
                int i4 = (this.f3984D + thumbOffset) - i;
                int i5 = this.f3983C + i4 + rect.left + rect.right + i;
                int i6 = this.f3987G + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.f4017t = 1;
                    this.f4019v = x3;
                    this.f4020w = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m1191c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f4012o;
                if (string == null) {
                    string = getResources().getString(C0983R.string.abc_capital_on);
                }
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                new C0828sg(C1066R.id.tag_state_description, CharSequence.class, 64, 30).m2005c(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f4014q;
            if (string2 == null) {
                string2 = getResources().getString(C0983R.string.abc_capital_off);
            }
            WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
            new C0828sg(C1066R.id.tag_state_description, CharSequence.class, 64, 30).m2005c(this, string2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f3994N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f3979R, zIsChecked ? 1.0f : 0.0f);
        this.f3994N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f3994N.setAutoCancel(true);
        this.f3994N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1192d(z);
        setTextOnInternal(this.f4012o);
        setTextOffInternal(this.f4014q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f3988H = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1189a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f4016s != z) {
            this.f4016s = z;
            requestLayout();
            if (z) {
                m2368d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f4011n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f4009l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f4010m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f3989I;
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
        Object string = this.f4014q;
        if (string == null) {
            string = getResources().getString(C0983R.string.abc_capital_off);
        }
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        new C0828sg(C1066R.id.tag_state_description, CharSequence.class, 64, 30).m2005c(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f4012o;
        if (string == null) {
            string = getResources().getString(C0983R.string.abc_capital_on);
        }
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        new C0828sg(C1066R.id.tag_state_description, CharSequence.class, 64, 30).m2005c(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3998a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3998a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f4023z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0889w1.m2115A(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f4008k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3999b = colorStateList;
        this.f4001d = true;
        m2365a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f4000c = mode;
        this.f4002e = true;
        m2365a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4003f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4003f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0889w1.m2115A(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f4004g = colorStateList;
        this.f4006i = true;
        m2366b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f4005h = mode;
        this.f4007j = true;
        m2366b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3998a || drawable == this.f4003f;
    }
}
