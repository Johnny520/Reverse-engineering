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
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C0485j;
import com.abc.core.runtime.AbstractC0805P;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p006D.AbstractC0080Q;
import p006D.C0065B;
import p017J.ActionModeCallbackC0229r;
import p018J0.C0234d;
import p025N.C0257h;
import p037U.AbstractC0358S;
import p043Y.C0443b;
import p048b.AbstractC0550a;
import p051d.C0739a;
import p057g.AbstractC0849A0;
import p057g.AbstractC0881Q0;
import p057g.AbstractC0886W;
import p057g.C0860G;
import p057g.C0932v;
import p087w.AbstractC1111a;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: R */
    public static final C0443b f1166R = new C0443b(Float.class, "thumbPos", 7);

    /* JADX INFO: renamed from: S */
    public static final int[] f1167S = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public int f1168A;

    /* JADX INFO: renamed from: B */
    public int f1169B;

    /* JADX INFO: renamed from: C */
    public int f1170C;

    /* JADX INFO: renamed from: D */
    public int f1171D;

    /* JADX INFO: renamed from: E */
    public int f1172E;

    /* JADX INFO: renamed from: F */
    public int f1173F;

    /* JADX INFO: renamed from: G */
    public int f1174G;

    /* JADX INFO: renamed from: H */
    public boolean f1175H;

    /* JADX INFO: renamed from: I */
    public final TextPaint f1176I;

    /* JADX INFO: renamed from: J */
    public final ColorStateList f1177J;

    /* JADX INFO: renamed from: K */
    public StaticLayout f1178K;

    /* JADX INFO: renamed from: L */
    public StaticLayout f1179L;

    /* JADX INFO: renamed from: M */
    public final C0739a f1180M;

    /* JADX INFO: renamed from: N */
    public ObjectAnimator f1181N;

    /* JADX INFO: renamed from: O */
    public C0932v f1182O;

    /* JADX INFO: renamed from: P */
    public C0257h f1183P;

    /* JADX INFO: renamed from: Q */
    public final Rect f1184Q;

    /* JADX INFO: renamed from: a */
    public Drawable f1185a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f1186b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f1187c;

    /* JADX INFO: renamed from: d */
    public boolean f1188d;

    /* JADX INFO: renamed from: e */
    public boolean f1189e;

    /* JADX INFO: renamed from: f */
    public Drawable f1190f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f1191g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f1192h;

    /* JADX INFO: renamed from: i */
    public boolean f1193i;

    /* JADX INFO: renamed from: j */
    public boolean f1194j;

    /* JADX INFO: renamed from: k */
    public int f1195k;

    /* JADX INFO: renamed from: l */
    public int f1196l;

    /* JADX INFO: renamed from: m */
    public int f1197m;

    /* JADX INFO: renamed from: n */
    public boolean f1198n;

    /* JADX INFO: renamed from: o */
    public CharSequence f1199o;

    /* JADX INFO: renamed from: p */
    public CharSequence f1200p;

    /* JADX INFO: renamed from: q */
    public CharSequence f1201q;

    /* JADX INFO: renamed from: r */
    public CharSequence f1202r;

    /* JADX INFO: renamed from: s */
    public boolean f1203s;

    /* JADX INFO: renamed from: t */
    public int f1204t;

    /* JADX INFO: renamed from: u */
    public final int f1205u;

    /* JADX INFO: renamed from: v */
    public float f1206v;

    /* JADX INFO: renamed from: w */
    public float f1207w;

    /* JADX INFO: renamed from: x */
    public final VelocityTracker f1208x;

    /* JADX INFO: renamed from: y */
    public final int f1209y;

    /* JADX INFO: renamed from: z */
    public float f1210z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, C1031R.attr.switchStyle);
        this.f1186b = null;
        this.f1187c = null;
        this.f1188d = false;
        this.f1189e = false;
        this.f1191g = null;
        this.f1192h = null;
        this.f1193i = false;
        this.f1194j = false;
        this.f1208x = VelocityTracker.obtain();
        this.f1175H = true;
        this.f1184Q = new Rect();
        AbstractC0849A0.m2159a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1176I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0550a.f1633r;
        C0234d c0234dM638s = C0234d.m638s(context, attributeSet, iArr, C1031R.attr.switchStyle, 0);
        AbstractC0080Q.m290i(this, context, iArr, attributeSet, (TypedArray) c0234dM638s.f475c, C1031R.attr.switchStyle);
        Drawable drawableM646i = c0234dM638s.m646i(2);
        this.f1185a = drawableM646i;
        if (drawableM646i != null) {
            drawableM646i.setCallback(this);
        }
        Drawable drawableM646i2 = c0234dM638s.m646i(11);
        this.f1190f = drawableM646i2;
        if (drawableM646i2 != null) {
            drawableM646i2.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) c0234dM638s.f475c;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f1203s = typedArray.getBoolean(3, true);
        this.f1195k = typedArray.getDimensionPixelSize(8, 0);
        this.f1196l = typedArray.getDimensionPixelSize(5, 0);
        this.f1197m = typedArray.getDimensionPixelSize(6, 0);
        this.f1198n = typedArray.getBoolean(4, false);
        ColorStateList colorStateListM645h = c0234dM638s.m645h(9);
        if (colorStateListM645h != null) {
            this.f1186b = colorStateListM645h;
            this.f1188d = true;
        }
        PorterDuff.Mode modeM2221c = AbstractC0886W.m2221c(typedArray.getInt(10, -1), null);
        if (this.f1187c != modeM2221c) {
            this.f1187c = modeM2221c;
            this.f1189e = true;
        }
        if (this.f1188d || this.f1189e) {
            m1131a();
        }
        ColorStateList colorStateListM645h2 = c0234dM638s.m645h(12);
        if (colorStateListM645h2 != null) {
            this.f1191g = colorStateListM645h2;
            this.f1193i = true;
        }
        PorterDuff.Mode modeM2221c2 = AbstractC0886W.m2221c(typedArray.getInt(13, -1), null);
        if (this.f1192h != modeM2221c2) {
            this.f1192h = modeM2221c2;
            this.f1194j = true;
        }
        if (this.f1193i || this.f1194j) {
            m1132b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0550a.f1634s);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC0805P.m2049p(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f1177J = colorStateList;
            } else {
                this.f1177J = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0739a c0739a = new C0739a();
                c0739a.f2575a = context2.getResources().getConfiguration().locale;
                this.f1180M = c0739a;
            } else {
                this.f1180M = null;
            }
            setTextOnInternal(this.f1199o);
            setTextOffInternal(this.f1201q);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C0860G(this).m2177d(attributeSet, C1031R.attr.switchStyle);
        c0234dM638s.m657u();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1205u = viewConfiguration.getScaledTouchSlop();
        this.f1209y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m2262a(attributeSet, C1031R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0932v getEmojiTextViewHelper() {
        if (this.f1182O == null) {
            this.f1182O = new C0932v(this);
        }
        return this.f1182O;
    }

    private boolean getTargetCheckedState() {
        return this.f1210z > 0.5f;
    }

    private int getThumbOffset() {
        boolean z2 = AbstractC0881Q0.f3149a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f1210z : this.f1210z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1190f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1184Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1185a;
        Rect rectM2220b = drawable2 != null ? AbstractC0886W.m2220b(drawable2) : AbstractC0886W.f3158c;
        return ((((this.f1168A - this.f1170C) - rect.left) - rect.right) - rectM2220b.left) - rectM2220b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1201q = charSequence;
        C0932v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo132f0 = ((AbstractC0040p) emojiTextViewHelper.f3306b.f251b).mo132f0(this.f1180M);
        if (transformationMethodMo132f0 != null) {
            charSequence = transformationMethodMo132f0.getTransformation(charSequence, this);
        }
        this.f1202r = charSequence;
        this.f1179L = null;
        if (this.f1203s) {
            m1134d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1199o = charSequence;
        C0932v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo132f0 = ((AbstractC0040p) emojiTextViewHelper.f3306b.f251b).mo132f0(this.f1180M);
        if (transformationMethodMo132f0 != null) {
            charSequence = transformationMethodMo132f0.getTransformation(charSequence, this);
        }
        this.f1200p = charSequence;
        this.f1178K = null;
        if (this.f1203s) {
            m1134d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1131a() {
        Drawable drawable = this.f1185a;
        if (drawable != null) {
            if (this.f1188d || this.f1189e) {
                Drawable drawableMutate = drawable.mutate();
                this.f1185a = drawableMutate;
                if (this.f1188d) {
                    AbstractC1111a.m2626h(drawableMutate, this.f1186b);
                }
                if (this.f1189e) {
                    AbstractC1111a.m2627i(this.f1185a, this.f1187c);
                }
                if (this.f1185a.isStateful()) {
                    this.f1185a.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1132b() {
        Drawable drawable = this.f1190f;
        if (drawable != null) {
            if (this.f1193i || this.f1194j) {
                Drawable drawableMutate = drawable.mutate();
                this.f1190f = drawableMutate;
                if (this.f1193i) {
                    AbstractC1111a.m2626h(drawableMutate, this.f1191g);
                }
                if (this.f1194j) {
                    AbstractC1111a.m2627i(this.f1190f, this.f1192h);
                }
                if (this.f1190f.isStateful()) {
                    this.f1190f.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1133c() {
        setTextOnInternal(this.f1199o);
        setTextOffInternal(this.f1201q);
        requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m1134d() {
        if (this.f1183P == null && ((AbstractC0040p) this.f1182O.f3306b.f251b).mo121D() && C0485j.f1354k != null) {
            C0485j c0485jM1199a = C0485j.m1199a();
            int iM1200b = c0485jM1199a.m1200b();
            if (iM1200b == 3 || iM1200b == 0) {
                C0257h c0257h = new C0257h(this);
                this.f1183P = c0257h;
                c0485jM1199a.m1205g(c0257h);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4 = this.f1171D;
        int i5 = this.f1172E;
        int i6 = this.f1173F;
        int i7 = this.f1174G;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f1185a;
        Rect rectM2220b = drawable != null ? AbstractC0886W.m2220b(drawable) : AbstractC0886W.f3158c;
        Drawable drawable2 = this.f1190f;
        Rect rect = this.f1184Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (rectM2220b != null) {
                int i9 = rectM2220b.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rectM2220b.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = rectM2220b.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rectM2220b.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                }
                this.f1190f.setBounds(i4, i2, i6, i3);
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f1190f.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f1185a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.f1170C + rect.right;
            this.f1185a.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC1111a.m2624f(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f1185a;
        if (drawable != null) {
            AbstractC1111a.m2623e(drawable, f2, f3);
        }
        Drawable drawable2 = this.f1190f;
        if (drawable2 != null) {
            AbstractC1111a.m2623e(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1185a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1190f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z2 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1168A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1197m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z2 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1168A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1197m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC0229r ? ((ActionModeCallbackC0229r) customSelectionActionModeCallback).f465a : customSelectionActionModeCallback;
    }

    public boolean getShowText() {
        return this.f1203s;
    }

    public boolean getSplitTrack() {
        return this.f1198n;
    }

    public int getSwitchMinWidth() {
        return this.f1196l;
    }

    public int getSwitchPadding() {
        return this.f1197m;
    }

    public CharSequence getTextOff() {
        return this.f1201q;
    }

    public CharSequence getTextOn() {
        return this.f1199o;
    }

    public Drawable getThumbDrawable() {
        return this.f1185a;
    }

    public final float getThumbPosition() {
        return this.f1210z;
    }

    public int getThumbTextPadding() {
        return this.f1195k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1186b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1187c;
    }

    public Drawable getTrackDrawable() {
        return this.f1190f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1191g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1192h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1185a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1190f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1181N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1181N.end();
        this.f1181N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1167S);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1190f;
        Rect rect = this.f1184Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1172E;
        int i3 = this.f1174G;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1185a;
        if (drawable != null) {
            if (!this.f1198n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM2220b = AbstractC0886W.m2220b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM2220b.left;
                rect.right -= rectM2220b.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1178K : this.f1179L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1177J;
            TextPaint textPaint = this.f1176I;
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
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i4 + i5) / 2) - (staticLayout.getHeight() / 2));
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
            CharSequence charSequence = isChecked() ? this.f1199o : this.f1201q;
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
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z2, i2, i3, i4, i5);
        int iMax2 = 0;
        if (this.f1185a != null) {
            Drawable drawable = this.f1190f;
            Rect rect = this.f1184Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM2220b = AbstractC0886W.m2220b(this.f1185a);
            iMax = Math.max(0, rectM2220b.left - rect.left);
            iMax2 = Math.max(0, rectM2220b.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z3 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f1168A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f1168A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i6 = this.f1169B;
            int i7 = height2 - (i6 / 2);
            height = i6 + i7;
            paddingTop = i7;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f1169B + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f1169B;
        }
        this.f1171D = paddingLeft;
        this.f1172E = paddingTop;
        this.f1174G = height;
        this.f1173F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f1203s) {
            StaticLayout staticLayout = this.f1178K;
            TextPaint textPaint = this.f1176I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f1200p;
                this.f1178K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f1179L == null) {
                CharSequence charSequence2 = this.f1202r;
                this.f1179L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f1185a;
        Rect rect = this.f1184Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1185a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1185a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f1170C = Math.max(this.f1203s ? (this.f1195k * 2) + Math.max(this.f1178K.getWidth(), this.f1179L.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f1190f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1190f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f1185a;
        if (drawable3 != null) {
            Rect rectM2220b = AbstractC0886W.m2220b(drawable3);
            iMax = Math.max(iMax, rectM2220b.left);
            iMax2 = Math.max(iMax2, rectM2220b.right);
        }
        int iMax3 = this.f1175H ? Math.max(this.f1196l, (this.f1170C * 2) + iMax + iMax2) : this.f1196l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f1168A = iMax3;
        this.f1169B = iMax4;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1199o : this.f1201q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean targetCheckedState;
        VelocityTracker velocityTracker = this.f1208x;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f1205u;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.f1204t == 2) {
                    this.f1204t = 0;
                    boolean z2 = motionEvent.getAction() == 1 && isEnabled();
                    boolean zIsChecked = isChecked();
                    if (z2) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f1209y) {
                            boolean z3 = AbstractC0881Q0.f3149a;
                            targetCheckedState = getLayoutDirection() != 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
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
                this.f1204t = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i3 = this.f1204t;
                if (i3 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.f1206v) > i2 || Math.abs(y - this.f1207w) > i2) {
                        this.f1204t = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f1206v = x;
                        this.f1207w = y;
                        return true;
                    }
                } else if (i3 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f2 = x2 - this.f1206v;
                    float f3 = thumbScrollRange != 0 ? f2 / thumbScrollRange : f2 > 0.0f ? 1.0f : -1.0f;
                    boolean z4 = AbstractC0881Q0.f3149a;
                    if (getLayoutDirection() == 1) {
                        f3 = -f3;
                    }
                    float f4 = this.f1210z;
                    float f5 = f3 + f4;
                    float f6 = f5 >= 0.0f ? f5 > 1.0f ? 1.0f : f5 : 0.0f;
                    if (f6 != f4) {
                        this.f1206v = x2;
                        setThumbPosition(f6);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f1185a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f1185a;
                Rect rect = this.f1184Q;
                drawable.getPadding(rect);
                int i4 = this.f1172E - i2;
                int i5 = (this.f1171D + thumbOffset) - i2;
                int i6 = this.f1170C + i5 + rect.left + rect.right + i2;
                int i7 = this.f1174G + i2;
                if (x3 > i5 && x3 < i6 && y2 > i4 && y2 < i7) {
                    this.f1204t = 1;
                    this.f1206v = x3;
                    this.f1207w = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo127Q(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f1199o;
                if (string == null) {
                    string = getResources().getString(C1031R.string.abc_capital_on);
                }
                Object obj = string;
                Field field = AbstractC0080Q.f219a;
                new C0065B(C1031R.id.tag_state_description, CharSequence.class, 64, 30, 1).m207e(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f1201q;
            if (string2 == null) {
                string2 = getResources().getString(C1031R.string.abc_capital_off);
            }
            Object obj2 = string2;
            Field field2 = AbstractC0080Q.f219a;
            new C0065B(C1031R.id.tag_state_description, CharSequence.class, 64, 30, 1).m207e(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f1181N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f1166R, zIsChecked ? 1.0f : 0.0f);
        this.f1181N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f1181N.setAutoCancel(true);
        this.f1181N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0040p.m102e0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo128R(z2);
        setTextOnInternal(this.f1199o);
        setTextOffInternal(this.f1201q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.f1175H = z2;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo135w(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.f1203s != z2) {
            this.f1203s = z2;
            requestLayout();
            if (z2) {
                m1134d();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f1198n = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f1196l = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f1197m = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1176I;
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
        Object string = this.f1201q;
        if (string == null) {
            string = getResources().getString(C1031R.string.abc_capital_off);
        }
        Field field = AbstractC0080Q.f219a;
        new C0065B(C1031R.id.tag_state_description, CharSequence.class, 64, 30, 1).m207e(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f1199o;
        if (string == null) {
            string = getResources().getString(C1031R.string.abc_capital_on);
        }
        Field field = AbstractC0080Q.f219a;
        new C0065B(C1031R.id.tag_state_description, CharSequence.class, 64, 30, 1).m207e(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1185a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1185a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f1210z = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(AbstractC0358S.m916w(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f1195k = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1186b = colorStateList;
        this.f1188d = true;
        m1131a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1187c = mode;
        this.f1189e = true;
        m1131a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1190f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1190f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(AbstractC0358S.m916w(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1191g = colorStateList;
        this.f1193i = true;
        m1132b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1192h = mode;
        this.f1194j = true;
        m1132b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1185a || drawable == this.f1190f;
    }
}
