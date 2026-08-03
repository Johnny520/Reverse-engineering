package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.C1247R;
import com.google.android.material.chip.C1281a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p000a.AbstractC0472a2;
import p000a.AbstractC0609h6;
import p000a.C0146I;
import p000a.C0165J0;
import p000a.C0181Jg;
import p000a.C0336Sa;
import p000a.C0393Vd;
import p000a.C0394Ve;
import p000a.C0408Wa;
import p000a.C0418X2;
import p000a.C0430Xe;
import p000a.C0436Y2;
import p000a.C0437Y3;
import p000a.C0448Ye;
import p000a.C0454Z2;
import p000a.C0523cf;
import p000a.C0567f2;
import p000a.C0726n9;
import p000a.C0861ub;
import p000a.C0866ug;
import p000a.C0889w1;
import p000a.C0893w5;
import p000a.InterfaceC0229Ma;
import p000a.InterfaceC0465Zd;
import p000a.InterfaceC0886vh;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0165J0 implements C1281a.a, InterfaceC0465Zd, Checkable {

    /* JADX INFO: renamed from: w */
    public static final int f5592w = C1247R.style.Widget_MaterialComponents_Chip_Action;

    /* JADX INFO: renamed from: x */
    public static final Rect f5593x = new Rect();

    /* JADX INFO: renamed from: y */
    public static final int[] f5594y = {R.attr.state_selected};

    /* JADX INFO: renamed from: z */
    public static final int[] f5595z = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e */
    public C1281a f5596e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f5597f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f5598g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f5599h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f5600i;

    /* JADX INFO: renamed from: j */
    public boolean f5601j;

    /* JADX INFO: renamed from: k */
    public boolean f5602k;

    /* JADX INFO: renamed from: l */
    public boolean f5603l;

    /* JADX INFO: renamed from: m */
    public boolean f5604m;

    /* JADX INFO: renamed from: n */
    public boolean f5605n;

    /* JADX INFO: renamed from: o */
    public int f5606o;

    /* JADX INFO: renamed from: p */
    public int f5607p;

    /* JADX INFO: renamed from: q */
    public CharSequence f5608q;

    /* JADX INFO: renamed from: r */
    public final C1280b f5609r;

    /* JADX INFO: renamed from: s */
    public boolean f5610s;

    /* JADX INFO: renamed from: t */
    public final Rect f5611t;

    /* JADX INFO: renamed from: u */
    public final RectF f5612u;

    /* JADX INFO: renamed from: v */
    public final C1279a f5613v;

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$a */
    public class C1279a extends AbstractC0472a2 {
        public C1279a() {
        }

        @Override // p000a.AbstractC0472a2
        /* JADX INFO: renamed from: d */
        public final void mo456d(int i) {
        }

        @Override // p000a.AbstractC0472a2
        /* JADX INFO: renamed from: e */
        public final void mo457e(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            C1281a c1281a = chip.f5596e;
            chip.setText(c1281a.f5625D0 ? c1281a.f5628F : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$b */
    public class C1280b extends AbstractC0609h6 {
        public C1280b(Chip chip) {
            super(chip);
        }

        @Override // p000a.AbstractC0609h6
        /* JADX INFO: renamed from: l */
        public final void mo1448l(ArrayList arrayList) {
            C1281a c1281a;
            arrayList.add(0);
            int i = Chip.f5592w;
            Chip chip = Chip.this;
            if (!chip.m3173d() || (c1281a = chip.f5596e) == null || !c1281a.f5635L || chip.f5599h == null) {
                return;
            }
            arrayList.add(1);
        }

        @Override // p000a.AbstractC0609h6
        /* JADX INFO: renamed from: o */
        public final void mo1451o(int i, C0146I c0146i) {
            AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
            if (i != 1) {
                accessibilityNodeInfo.setContentDescription("");
                accessibilityNodeInfo.setBoundsInParent(Chip.f5593x);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                accessibilityNodeInfo.setContentDescription(chip.getContext().getString(C1247R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            c0146i.m377b(C0146I.a.f507e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        int i = C1247R.attr.chipStyle;
        int i2 = f5592w;
        super(C0408Wa.m1054a(context, attributeSet, i, i2), attributeSet, i);
        this.f5611t = new Rect();
        this.f5612u = new RectF();
        this.f5613v = new C1279a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C1281a c1281a = new C1281a(context2, attributeSet, i);
        TypedArray typedArrayM1301d = C0523cf.m1301d(c1281a.f5655f0, attributeSet, C1247R.styleable.Chip, i, i2, new int[0]);
        c1281a.f5629F0 = typedArrayM1301d.hasValue(C1247R.styleable.Chip_shapeAppearance);
        int i3 = C1247R.styleable.Chip_chipSurfaceColor;
        Context context3 = c1281a.f5655f0;
        ColorStateList colorStateListM925b = C0336Sa.m925b(context3, typedArrayM1301d, i3);
        if (c1281a.f5674y != colorStateListM925b) {
            c1281a.f5674y = colorStateListM925b;
            c1281a.onStateChange(c1281a.getState());
        }
        ColorStateList colorStateListM925b2 = C0336Sa.m925b(context3, typedArrayM1301d, C1247R.styleable.Chip_chipBackgroundColor);
        if (c1281a.f5676z != colorStateListM925b2) {
            c1281a.f5676z = colorStateListM925b2;
            c1281a.onStateChange(c1281a.getState());
        }
        float dimension = typedArrayM1301d.getDimension(C1247R.styleable.Chip_chipMinHeight, 0.0f);
        if (c1281a.f5618A != dimension) {
            c1281a.f5618A = dimension;
            c1281a.invalidateSelf();
            c1281a.m3207v();
        }
        if (typedArrayM1301d.hasValue(C1247R.styleable.Chip_chipCornerRadius)) {
            c1281a.m3182B(typedArrayM1301d.getDimension(C1247R.styleable.Chip_chipCornerRadius, 0.0f));
        }
        c1281a.m3187G(C0336Sa.m925b(context3, typedArrayM1301d, C1247R.styleable.Chip_chipStrokeColor));
        c1281a.m3188H(typedArrayM1301d.getDimension(C1247R.styleable.Chip_chipStrokeWidth, 0.0f));
        c1281a.m3197Q(C0336Sa.m925b(context3, typedArrayM1301d, C1247R.styleable.Chip_rippleColor));
        String text = typedArrayM1301d.getText(C1247R.styleable.Chip_android_text);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c1281a.f5628F, text)) {
            c1281a.f5628F = text;
            c1281a.f5661l0.f1689d = true;
            c1281a.invalidateSelf();
            c1281a.m3207v();
        }
        int i4 = C1247R.styleable.Chip_android_textAppearance;
        C0861ub c0861ubM1990a = null;
        C0394Ve c0394Ve = (!typedArrayM1301d.hasValue(i4) || (resourceId3 = typedArrayM1301d.getResourceId(i4, 0)) == 0) ? null : new C0394Ve(context3, resourceId3);
        c0394Ve.f1516k = typedArrayM1301d.getDimension(C1247R.styleable.Chip_android_textSize, c0394Ve.f1516k);
        c1281a.m3198R(c0394Ve);
        int i5 = typedArrayM1301d.getInt(C1247R.styleable.Chip_android_ellipsize, 0);
        if (i5 == 1) {
            c1281a.f5623C0 = TextUtils.TruncateAt.START;
        } else if (i5 == 2) {
            c1281a.f5623C0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i5 == 3) {
            c1281a.f5623C0 = TextUtils.TruncateAt.END;
        }
        c1281a.m3186F(typedArrayM1301d.getBoolean(C1247R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c1281a.m3186F(typedArrayM1301d.getBoolean(C1247R.styleable.Chip_chipIconEnabled, false));
        }
        c1281a.m3183C(C0336Sa.m926c(context3, typedArrayM1301d, C1247R.styleable.Chip_chipIcon));
        if (typedArrayM1301d.hasValue(C1247R.styleable.Chip_chipIconTint)) {
            c1281a.m3185E(C0336Sa.m925b(context3, typedArrayM1301d, C1247R.styleable.Chip_chipIconTint));
        }
        c1281a.m3184D(typedArrayM1301d.getDimension(C1247R.styleable.Chip_chipIconSize, -1.0f));
        c1281a.m3194N(typedArrayM1301d.getBoolean(C1247R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c1281a.m3194N(typedArrayM1301d.getBoolean(C1247R.styleable.Chip_closeIconEnabled, false));
        }
        c1281a.m3189I(C0336Sa.m926c(context3, typedArrayM1301d, C1247R.styleable.Chip_closeIcon));
        c1281a.m3193M(C0336Sa.m925b(context3, typedArrayM1301d, C1247R.styleable.Chip_closeIconTint));
        c1281a.m3191K(typedArrayM1301d.getDimension(C1247R.styleable.Chip_closeIconSize, 0.0f));
        c1281a.m3209x(typedArrayM1301d.getBoolean(C1247R.styleable.Chip_android_checkable, false));
        c1281a.m3181A(typedArrayM1301d.getBoolean(C1247R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c1281a.m3181A(typedArrayM1301d.getBoolean(C1247R.styleable.Chip_checkedIconEnabled, false));
        }
        c1281a.m3210y(C0336Sa.m926c(context3, typedArrayM1301d, C1247R.styleable.Chip_checkedIcon));
        if (typedArrayM1301d.hasValue(C1247R.styleable.Chip_checkedIconTint)) {
            c1281a.m3211z(C0336Sa.m925b(context3, typedArrayM1301d, C1247R.styleable.Chip_checkedIconTint));
        }
        int i6 = C1247R.styleable.Chip_showMotionSpec;
        c1281a.f5645V = (!typedArrayM1301d.hasValue(i6) || (resourceId2 = typedArrayM1301d.getResourceId(i6, 0)) == 0) ? null : C0861ub.m1990a(context3, resourceId2);
        int i7 = C1247R.styleable.Chip_hideMotionSpec;
        if (typedArrayM1301d.hasValue(i7) && (resourceId = typedArrayM1301d.getResourceId(i7, 0)) != 0) {
            c0861ubM1990a = C0861ub.m1990a(context3, resourceId);
        }
        c1281a.f5646W = c0861ubM1990a;
        float dimension2 = typedArrayM1301d.getDimension(C1247R.styleable.Chip_chipStartPadding, 0.0f);
        if (c1281a.f5647X != dimension2) {
            c1281a.f5647X = dimension2;
            c1281a.invalidateSelf();
            c1281a.m3207v();
        }
        c1281a.m3196P(typedArrayM1301d.getDimension(C1247R.styleable.Chip_iconStartPadding, 0.0f));
        c1281a.m3195O(typedArrayM1301d.getDimension(C1247R.styleable.Chip_iconEndPadding, 0.0f));
        float dimension3 = typedArrayM1301d.getDimension(C1247R.styleable.Chip_textStartPadding, 0.0f);
        if (c1281a.f5650a0 != dimension3) {
            c1281a.f5650a0 = dimension3;
            c1281a.invalidateSelf();
            c1281a.m3207v();
        }
        float dimension4 = typedArrayM1301d.getDimension(C1247R.styleable.Chip_textEndPadding, 0.0f);
        if (c1281a.f5651b0 != dimension4) {
            c1281a.f5651b0 = dimension4;
            c1281a.invalidateSelf();
            c1281a.m3207v();
        }
        c1281a.m3192L(typedArrayM1301d.getDimension(C1247R.styleable.Chip_closeIconStartPadding, 0.0f));
        c1281a.m3190J(typedArrayM1301d.getDimension(C1247R.styleable.Chip_closeIconEndPadding, 0.0f));
        float dimension5 = typedArrayM1301d.getDimension(C1247R.styleable.Chip_chipEndPadding, 0.0f);
        if (c1281a.f5654e0 != dimension5) {
            c1281a.f5654e0 = dimension5;
            c1281a.invalidateSelf();
            c1281a.m3207v();
        }
        c1281a.f5627E0 = typedArrayM1301d.getDimensionPixelSize(C1247R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE);
        typedArrayM1301d.recycle();
        int[] iArr = C1247R.styleable.Chip;
        C0523cf.m1298a(context2, attributeSet, i, i2);
        C0523cf.m1299b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f5605n = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.f5607p = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(C1247R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c1281a);
        c1281a.m966j(C0866ug.d.m2017i(this));
        int[] iArr2 = C1247R.styleable.Chip;
        C0523cf.m1298a(context2, attributeSet, i, i2);
        C0523cf.m1299b(context2, attributeSet, iArr2, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i, i2);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(C1247R.styleable.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes2.recycle();
        this.f5609r = new C1280b(this);
        m3174e();
        if (!zHasValue) {
            setOutlineProvider(new C0436Y2(this));
        }
        setChecked(this.f5601j);
        setText(c1281a.f5628F);
        setEllipsize(c1281a.f5623C0);
        m3177h();
        if (!this.f5596e.f5625D0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m3176g();
        if (this.f5605n) {
            setMinHeight(this.f5607p);
        }
        this.f5606o = getLayoutDirection();
        super.setOnCheckedChangeListener(new C0418X2(0, this));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f5612u;
        rectF.setEmpty();
        if (m3173d() && this.f5599h != null) {
            C1281a c1281a = this.f5596e;
            Rect bounds = c1281a.getBounds();
            rectF.setEmpty();
            if (c1281a.m3201U()) {
                float f = c1281a.f5654e0 + c1281a.f5653d0 + c1281a.f5639P + c1281a.f5652c0 + c1281a.f5651b0;
                if (C0893w5.b.m2178a(c1281a) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f5611t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C0394Ve getTextAppearance() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5661l0.f1691f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f5603l != z) {
            this.f5603l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f5602k != z) {
            this.f5602k = z;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.C1281a.a
    /* JADX INFO: renamed from: a */
    public final void mo3171a() {
        m3172c(this.f5607p);
        requestLayout();
        invalidateOutline();
    }

    /* JADX INFO: renamed from: c */
    public final void m3172c(int i) {
        this.f5607p = i;
        if (!this.f5605n) {
            InsetDrawable insetDrawable = this.f5597f;
            if (insetDrawable == null) {
                m3175f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f5597f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m3175f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f5596e.f5618A));
        int iMax2 = Math.max(0, i - this.f5596e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f5597f;
            if (insetDrawable2 == null) {
                m3175f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f5597f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m3175f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f5597f != null) {
            Rect rect = new Rect();
            this.f5597f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m3175f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f5597f = new InsetDrawable((Drawable) this.f5596e, i2, i3, i2, i3);
        m3175f();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3173d() {
        C1281a c1281a = this.f5596e;
        if (c1281a == null) {
            return false;
        }
        Object objM2109a = c1281a.f5636M;
        if (objM2109a == null) {
            objM2109a = null;
        } else if (objM2109a instanceof InterfaceC0886vh) {
            objM2109a = ((InterfaceC0886vh) objM2109a).m2109a();
        }
        return objM2109a != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f5610s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C1280b c1280b = this.f5609r;
        AccessibilityManager accessibilityManager = c1280b.f2249h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = Chip.this;
                int i2 = (chip.m3173d() && chip.getCloseIconTouchBounds().contains(x, y)) ? 1 : 0;
                int i3 = c1280b.f2254m;
                if (i3 != i2) {
                    c1280b.f2254m = i2;
                    c1280b.m1453q(i2, 128);
                    c1280b.m1453q(i3, 256);
                }
                if (i2 == Integer.MIN_VALUE) {
                }
            } else if (action == 10 && (i = c1280b.f2254m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    c1280b.f2254m = Integer.MIN_VALUE;
                    c1280b.m1453q(i, 256);
                    return true;
                }
            }
        } else if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f5610s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C1280b c1280b = this.f5609r;
        c1280b.getClass();
        boolean zM1449m = false;
        int i = 0;
        zM1449m = false;
        zM1449m = false;
        zM1449m = false;
        zM1449m = false;
        zM1449m = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && c1280b.m1449m(i2, null)) {
                                    i++;
                                    z = true;
                                }
                                zM1449m = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                int i3 = c1280b.f2253l;
                                if (i3 != Integer.MIN_VALUE) {
                                    Chip chip = Chip.this;
                                    if (i3 == 0) {
                                        chip.performClick();
                                    } else if (i3 == 1) {
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.f5599h;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f5610s) {
                                            chip.f5609r.m1453q(1, 1);
                                        }
                                    }
                                }
                                zM1449m = true;
                            }
                            break;
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM1449m = c1280b.m1449m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM1449m = c1280b.m1449m(1, null);
            }
        }
        if (!zM1449m || c1280b.f2253l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p000a.C0165J0, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C1281a c1281a = this.f5596e;
        boolean zM3208w = false;
        if (c1281a != null && C1281a.m3180u(c1281a.f5636M)) {
            C1281a c1281a2 = this.f5596e;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f5604m) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f5603l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f5602k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f5604m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f5603l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f5602k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c1281a2.f5677z0, iArr)) {
                c1281a2.f5677z0 = iArr;
                if (c1281a2.m3201U()) {
                    zM3208w = c1281a2.m3208w(c1281a2.getState(), iArr);
                }
            }
        }
        if (zM3208w) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3174e() {
        C1281a c1281a;
        if (!m3173d() || (c1281a = this.f5596e) == null || !c1281a.f5635L || this.f5599h == null) {
            C0866ug.m2003j(this, null);
            this.f5610s = false;
        } else {
            C0866ug.m2003j(this, this.f5609r);
            this.f5610s = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3175f() {
        ColorStateList colorStateListValueOf = this.f5596e.f5626E;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        this.f5598g = new RippleDrawable(colorStateListValueOf, getBackgroundDrawable(), null);
        this.f5596e.getClass();
        RippleDrawable rippleDrawable = this.f5598g;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        setBackground(rippleDrawable);
        m3176g();
    }

    /* JADX INFO: renamed from: g */
    public final void m3176g() {
        C1281a c1281a;
        if (TextUtils.isEmpty(getText()) || (c1281a = this.f5596e) == null) {
            return;
        }
        int iM3205r = (int) (c1281a.m3205r() + c1281a.f5654e0 + c1281a.f5651b0);
        C1281a c1281a2 = this.f5596e;
        int iM3204q = (int) (c1281a2.m3204q() + c1281a2.f5647X + c1281a2.f5650a0);
        if (this.f5597f != null) {
            Rect rect = new Rect();
            this.f5597f.getPadding(rect);
            iM3204q += rect.left;
            iM3205r += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        setPaddingRelative(iM3204q, paddingTop, iM3205r, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f5608q)) {
            return this.f5608q;
        }
        C1281a c1281a = this.f5596e;
        if (!(c1281a != null && c1281a.f5641R)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof C0454Z2)) {
            return "android.widget.Button";
        }
        ((C0454Z2) parent).getClass();
        throw null;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f5597f;
        return insetDrawable == null ? this.f5596e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5643T;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5644U;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5676z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return Math.max(0.0f, c1281a.m3206s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f5596e;
    }

    public float getChipEndPadding() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5654e0;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C1281a c1281a = this.f5596e;
        if (c1281a == null || (drawable = c1281a.f5631H) == 0) {
            return null;
        }
        return drawable instanceof InterfaceC0886vh ? ((InterfaceC0886vh) drawable).m2109a() : drawable;
    }

    public float getChipIconSize() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5633J;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5632I;
        }
        return null;
    }

    public float getChipMinHeight() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5618A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5647X;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5622C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5624D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C1281a c1281a = this.f5596e;
        if (c1281a == null || (drawable = c1281a.f5636M) == 0) {
            return null;
        }
        return drawable instanceof InterfaceC0886vh ? ((InterfaceC0886vh) drawable).m2109a() : drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5640Q;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5653d0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5639P;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5652c0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5638O;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5623C0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f5610s) {
            C1280b c1280b = this.f5609r;
            if (c1280b.f2253l == 1 || c1280b.f2252k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0861ub getHideMotionSpec() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5646W;
        }
        return null;
    }

    public float getIconEndPadding() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5649Z;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5648Y;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5626E;
        }
        return null;
    }

    public C0393Vd getShapeAppearanceModel() {
        return this.f5596e.f1310a.f1334a;
    }

    public C0861ub getShowMotionSpec() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5645V;
        }
        return null;
    }

    public float getTextEndPadding() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5651b0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            return c1281a.f5650a0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m3177h() {
        TextPaint paint = getPaint();
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            paint.drawableState = c1281a.getState();
        }
        C0394Ve textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m1033e(getContext(), paint, this.f5613v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0726n9.m1659A(this, this.f5596e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5594y);
        }
        C1281a c1281a = this.f5596e;
        if (c1281a != null && c1281a.f5641R) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5595z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f5610s) {
            C1280b c1280b = this.f5609r;
            int i2 = c1280b.f2253l;
            if (i2 != Integer.MIN_VALUE) {
                c1280b.m1446j(i2);
            }
            if (z) {
                c1280b.m1449m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C1281a c1281a = this.f5596e;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(c1281a != null && c1281a.f5641R);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof C0454Z2) {
            C0454Z2 c0454z2 = (C0454Z2) getParent();
            if (c0454z2.f529c) {
                int i3 = 0;
                while (true) {
                    if (i2 >= c0454z2.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    View childAt = c0454z2.getChildAt(i2);
                    if ((childAt instanceof Chip) && c0454z2.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(C1247R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f5606o != i) {
            this.f5606o = i;
            m3176g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f5602k) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else {
                if (this.f5602k) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f5599h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f5610s) {
                        this.f5609r.m1453q(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f5608q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5598g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p000a.C0165J0, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5598g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p000a.C0165J0, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3209x(z);
        }
    }

    public void setCheckableResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3209x(c1281a.f5655f0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C1281a c1281a = this.f5596e;
        if (c1281a == null) {
            this.f5601j = z;
        } else if (c1281a.f5641R) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3210y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3210y(C0889w1.m2115A(c1281a.f5655f0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3211z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3211z(C0437Y3.m1091a(c1281a.f5655f0, i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckedIconVisible(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3181A(c1281a.f5655f0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1281a c1281a = this.f5596e;
        if (c1281a == null || c1281a.f5676z == colorStateList) {
            return;
        }
        c1281a.f5676z = colorStateList;
        c1281a.onStateChange(c1281a.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM1091a;
        C1281a c1281a = this.f5596e;
        if (c1281a == null || c1281a.f5676z == (colorStateListM1091a = C0437Y3.m1091a(c1281a.f5655f0, i))) {
            return;
        }
        c1281a.f5676z = colorStateListM1091a;
        c1281a.onStateChange(c1281a.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3182B(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3182B(c1281a.f5655f0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C1281a c1281a) {
        C1281a c1281a2 = this.f5596e;
        if (c1281a2 != c1281a) {
            if (c1281a2 != null) {
                c1281a2.f5621B0 = new WeakReference<>(null);
            }
            this.f5596e = c1281a;
            c1281a.f5625D0 = false;
            c1281a.f5621B0 = new WeakReference<>(this);
            m3172c(this.f5607p);
        }
    }

    public void setChipEndPadding(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a == null || c1281a.f5654e0 == f) {
            return;
        }
        c1281a.f5654e0 = f;
        c1281a.invalidateSelf();
        c1281a.m3207v();
    }

    public void setChipEndPaddingResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            float dimension = c1281a.f5655f0.getResources().getDimension(i);
            if (c1281a.f5654e0 != dimension) {
                c1281a.f5654e0 = dimension;
                c1281a.invalidateSelf();
                c1281a.m3207v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3183C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3183C(C0889w1.m2115A(c1281a.f5655f0, i));
        }
    }

    public void setChipIconSize(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3184D(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3184D(c1281a.f5655f0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3185E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3185E(C0437Y3.m1091a(c1281a.f5655f0, i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipIconVisible(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3186F(c1281a.f5655f0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a == null || c1281a.f5618A == f) {
            return;
        }
        c1281a.f5618A = f;
        c1281a.invalidateSelf();
        c1281a.m3207v();
    }

    public void setChipMinHeightResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            float dimension = c1281a.f5655f0.getResources().getDimension(i);
            if (c1281a.f5618A != dimension) {
                c1281a.f5618A = dimension;
                c1281a.invalidateSelf();
                c1281a.m3207v();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a == null || c1281a.f5647X == f) {
            return;
        }
        c1281a.f5647X = f;
        c1281a.invalidateSelf();
        c1281a.m3207v();
    }

    public void setChipStartPaddingResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            float dimension = c1281a.f5655f0.getResources().getDimension(i);
            if (c1281a.f5647X != dimension) {
                c1281a.f5647X = dimension;
                c1281a.invalidateSelf();
                c1281a.m3207v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3187G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3187G(C0437Y3.m1091a(c1281a.f5655f0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3188H(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3188H(c1281a.f5655f0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3189I(drawable);
        }
        m3174e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1281a c1281a = this.f5596e;
        if (c1281a == null || c1281a.f5640Q == charSequence) {
            return;
        }
        String str = C0567f2.f2114b;
        C0567f2 c0567f2 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0567f2.f2117e : C0567f2.f2116d;
        c0567f2.getClass();
        C0430Xe.c cVar = C0430Xe.f1609a;
        c1281a.f5640Q = c0567f2.m1410c(charSequence);
        c1281a.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3190J(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3190J(c1281a.f5655f0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3189I(C0889w1.m2115A(c1281a.f5655f0, i));
        }
        m3174e();
    }

    public void setCloseIconSize(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3191K(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3191K(c1281a.f5655f0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3192L(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3192L(c1281a.f5655f0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3193M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3193M(C0437Y3.m1091a(c1281a.f5655f0, i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // p000a.C0165J0, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p000a.C0165J0, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m966j(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f5596e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.f5623C0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f5605n = z;
        m3172c(this.f5607p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0861ub c0861ub) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.f5646W = c0861ub;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.f5646W = C0861ub.m1990a(c1281a.f5655f0, i);
        }
    }

    public void setIconEndPadding(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3195O(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3195O(c1281a.f5655f0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3196P(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3196P(c1281a.f5655f0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0229Ma<Chip> interfaceC0229Ma) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f5596e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.f5627E0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5600i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f5599h = onClickListener;
        m3174e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3197Q(colorStateList);
        }
        this.f5596e.getClass();
        m3175f();
    }

    public void setRippleColorResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3197Q(C0437Y3.m1091a(c1281a.f5655f0, i));
            this.f5596e.getClass();
            m3175f();
        }
    }

    @Override // p000a.InterfaceC0465Zd
    public void setShapeAppearanceModel(C0393Vd c0393Vd) {
        this.f5596e.setShapeAppearanceModel(c0393Vd);
    }

    public void setShowMotionSpec(C0861ub c0861ub) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.f5645V = c0861ub;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.f5645V = C0861ub.m1990a(c1281a.f5655f0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1281a c1281a = this.f5596e;
        if (c1281a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c1281a.f5625D0 ? null : charSequence, bufferType);
        C1281a c1281a2 = this.f5596e;
        if (c1281a2 == null || TextUtils.equals(c1281a2.f5628F, charSequence)) {
            return;
        }
        c1281a2.f5628F = charSequence;
        c1281a2.f5661l0.f1689d = true;
        c1281a2.invalidateSelf();
        c1281a2.m3207v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextAppearance(C0394Ve c0394Ve) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3198R(c0394Ve);
        }
        m3177h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a == null || c1281a.f5651b0 == f) {
            return;
        }
        c1281a.f5651b0 = f;
        c1281a.invalidateSelf();
        c1281a.m3207v();
    }

    public void setTextEndPaddingResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            float dimension = c1281a.f5655f0.getResources().getDimension(i);
            if (c1281a.f5651b0 != dimension) {
                c1281a.f5651b0 = dimension;
                c1281a.invalidateSelf();
                c1281a.m3207v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C0448Ye c0448Ye = c1281a.f5661l0;
            C0394Ve c0394Ve = c0448Ye.f1691f;
            if (c0394Ve != null) {
                c0394Ve.f1516k = fApplyDimension;
                c0448Ye.f1686a.setTextSize(fApplyDimension);
                c1281a.mo1111a();
            }
        }
        m3177h();
    }

    public void setTextStartPadding(float f) {
        C1281a c1281a = this.f5596e;
        if (c1281a == null || c1281a.f5650a0 == f) {
            return;
        }
        c1281a.f5650a0 = f;
        c1281a.invalidateSelf();
        c1281a.m3207v();
    }

    public void setTextStartPaddingResource(int i) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            float dimension = c1281a.f5655f0.getResources().getDimension(i);
            if (c1281a.f5650a0 != dimension) {
                c1281a.f5650a0 = dimension;
                c1281a.invalidateSelf();
                c1281a.m3207v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCloseIconVisible(boolean z) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3194N(z);
        }
        m3174e();
    }

    public void setCheckedIconVisible(boolean z) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3181A(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3186F(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3198R(new C0394Ve(c1281a.f5655f0, i));
        }
        m3177h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C1281a c1281a = this.f5596e;
        if (c1281a != null) {
            c1281a.m3198R(new C0394Ve(c1281a.f5655f0, i));
        }
        m3177h();
    }
}
